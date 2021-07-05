/**
 * Copyright (c) 2010-2020 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.core.auth.local.core.internal;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.openhab.core.auth.Authentication;
import org.openhab.core.auth.AuthenticationException;
import org.openhab.core.auth.AuthenticationProvider;
import org.openhab.core.auth.AuthenticationResult;
import org.openhab.core.auth.Credentials;
import org.openhab.core.auth.local.GenericUser;
import org.openhab.core.auth.local.ManagedUser;
import org.openhab.core.auth.local.User;
import org.openhab.core.auth.local.UserApiToken;
import org.openhab.core.auth.local.UserProvider;
import org.openhab.core.auth.local.UserRegistry;
import org.openhab.core.auth.local.UserSession;
import org.openhab.core.auth.password.UsernamePasswordCredentials;
import org.openhab.core.common.registry.AbstractRegistry;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The implementation of a {@link UserRegistry} for {@link ManagedUser} entities.
 *
 * @author Yannick Schaus - initial contribution
 */
@NonNullByDefault
@Component(service = {UserRegistry.class, AuthenticationProvider.class}, immediate = true)
public class UserRegistryImpl extends AbstractRegistry<User, String, UserProvider> implements UserRegistry {

    private final Logger logger = LoggerFactory.getLogger(UserRegistryImpl.class);

    private static final SecureRandom RAND = new SecureRandom();

    @Activate
    public UserRegistryImpl(BundleContext context, Map<String, Object> properties) {
        super(UserProvider.class);
        super.activate(context);
    }

    @Override
    @Deactivate
    protected void deactivate() {
        super.deactivate();
    }

    @Reference(cardinality = ReferenceCardinality.OPTIONAL, policy = ReferencePolicy.DYNAMIC)
    protected void setManagedProvider(ManagedUserProvider managedProvider) {
        super.setManagedProvider(managedProvider);
        super.addProvider(managedProvider);
    }

    protected void unsetManagedProvider(ManagedUserProvider managedProvider) {
        super.unsetManagedProvider(managedProvider);
        super.removeProvider(managedProvider);
    }

    @Override
    public User register(String username, String password, Set<String> roles) {
        String passwordSalt = generateSalt(KEY_LENGTH / 8).get();
        String passwordHash = hash(password, passwordSalt, PASSWORD_ITERATIONS).get();
        ManagedUser user = new ManagedUser(username, passwordSalt, passwordHash);
        user.setRoles(new HashSet<>(roles));
        super.add(user);
        return user;
    }

    private Optional<String> generateSalt(final int length) {
        if (length < 1) {
            logger.error("error in generateSalt: length must be > 0");
            return Optional.empty();
        }

        byte[] salt = new byte[length];
        RAND.nextBytes(salt);

        return Optional.of(Base64.getEncoder().encodeToString(salt));
    }

    private Optional<String> hash(String password, String salt, int iterations) {
        char[] chars = password.toCharArray();
        byte[] bytes = salt.getBytes();

        PBEKeySpec spec = new PBEKeySpec(chars, bytes, iterations, KEY_LENGTH);

        Arrays.fill(chars, Character.MIN_VALUE);

        try {
            SecretKeyFactory fac = SecretKeyFactory.getInstance(ALGORITHM);
            byte[] securePassword = fac.generateSecret(spec).getEncoded();
            return Optional.of(Base64.getEncoder().encodeToString(securePassword));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            logger.error("Exception encountered while hashing", e);
            return Optional.empty();
        } finally {
            spec.clearPassword();
        }
    }

    @Override
    public AuthenticationResult authenticate(Credentials credentials) throws AuthenticationException {
        if (credentials instanceof UsernamePasswordCredentials) {
            UsernamePasswordCredentials usernamePasswordCreds = (UsernamePasswordCredentials) credentials;
            User user = get(usernamePasswordCreds.getUsername());
            if (user == null) {
                throw new AuthenticationException("User not found: " + usernamePasswordCreds.getUsername());
            }

            ManagedUser managedUser = (ManagedUser) user;
            String hashedPassword = hash(usernamePasswordCreds.getPassword(), managedUser.getPasswordSalt(),
                    PASSWORD_ITERATIONS).get();
            if (!hashedPassword.equals(managedUser.getPasswordHash())) {
                throw new AuthenticationException("Wrong password for user " + usernamePasswordCreds.getUsername());
            }

            return new AuthenticationResult(new GenericUser(managedUser.getName()), credentials.getScheme(),
                new Authentication(managedUser.getName(), managedUser.getRoles().stream().toArray(String[]::new))
            );
        }

        throw new IllegalArgumentException("Invalid credential type");
    }

    @Override
    public void changePassword(User user, String newPassword) {
        if (!(user instanceof ManagedUser)) {
            throw new IllegalArgumentException("User is not managed: " + user.getName());
        }

        ManagedUser managedUser = (ManagedUser) user;
        String passwordSalt = generateSalt(KEY_LENGTH / 8).get();
        String passwordHash = hash(newPassword, passwordSalt, PASSWORD_ITERATIONS).get();
        managedUser.setPasswordSalt(passwordSalt);
        managedUser.setPasswordHash(passwordHash);
        update(user);
    }

    @Override
    public void addUserSession(User user, UserSession session) {
        if (!(user instanceof ManagedUser)) {
            throw new IllegalArgumentException("User is not managed: " + user.getName());
        }

        ManagedUser managedUser = (ManagedUser) user;
        managedUser.getSessions().add(session);
        update(user);
    }

    @Override
    public void removeUserSession(User user, UserSession session) {
        if (!(user instanceof ManagedUser)) {
            throw new IllegalArgumentException("User is not managed: " + user.getName());
        }

        ManagedUser managedUser = (ManagedUser) user;
        managedUser.getSessions().remove(session);
        update(user);
    }

    @Override
    public void clearSessions(User user) {
        if (!(user instanceof ManagedUser)) {
            throw new IllegalArgumentException("User is not managed: " + user.getName());
        }

        ManagedUser managedUser = (ManagedUser) user;
        managedUser.getSessions().clear();
        update(user);
    }

    @Override
    public String addUserApiToken(User user, String name, String scope) {
        if (!(user instanceof ManagedUser)) {
            throw new IllegalArgumentException("User is not managed: " + user.getName());
        }
        if (!name.matches("[a-zA-Z0-9]*")) {
            throw new IllegalArgumentException("API token name format invalid, alphanumeric characters only");
        }

        ManagedUser managedUser = (ManagedUser) user;
        String tokenSalt = generateSalt(KEY_LENGTH / 8).get();
        byte[] rnd = new byte[64];
        RAND.nextBytes(rnd);
        String token = APITOKEN_PREFIX + "." + name + "."
                + Base64.getEncoder().encodeToString(rnd).replaceAll("(\\+|/|=)", "");
        String tokenHash = hash(token, tokenSalt, APITOKEN_ITERATIONS).get();

        UserApiToken userApiToken = new UserApiToken(name, tokenHash + ":" + tokenSalt, scope);

        managedUser.getApiTokens().add(userApiToken);
        update(user);

        return token;
    }

    @Override
    public void removeUserApiToken(User user, UserApiToken userApiToken) {
        if (!(user instanceof ManagedUser)) {
            throw new IllegalArgumentException("User is not managed: " + user.getName());
        }

        ManagedUser managedUser = (ManagedUser) user;
        managedUser.getApiTokens().remove(userApiToken);
        update(user);
    }

    @Override
    public boolean supports(Class<? extends Credentials> type) {
        return (UsernamePasswordCredentials.class.isAssignableFrom(type));
    }
}
