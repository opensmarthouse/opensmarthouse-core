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
package org.openhab.core.auth.local;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.Base64;
import java.util.Optional;
import java.util.Set;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import org.eclipse.jdt.annotation.NonNullByDefault;
import org.openhab.core.auth.AuthenticationProvider;
import org.openhab.core.common.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * An interface for a generic {@link Registry} of {@link User} entities. User registries can also be used as
 * {@link AuthenticationProvider}.
 *
 * @author Yannick Schaus - initial contribution
 *
 */
@NonNullByDefault
public interface UserRegistry extends Registry<User, String>, AuthenticationProvider {

    int APITOKEN_ITERATIONS = 1024;
    String APITOKEN_PREFIX = "oh";
    int PASSWORD_ITERATIONS = 65536;
    int KEY_LENGTH = 512;
    String ALGORITHM = "PBKDF2WithHmacSHA512";

    /**
     * Adds a new {@link User} in this registry. The implementation receives the clear text credentials and is
     * responsible for their secure storage (for instance by hashing the password), then return the newly created
     * {@link User} instance.
     *
     * @param username the username of the new user
     * @param password the user password
     * @param roles the roles attributed to the new user
     * @return the new registered {@link User} instance
     */
    User register(String username, String password, Set<String> roles);

    /**
     * Change the password for an {@link User} in this registry. The implementation receives the new password and is
     * responsible for their secure storage (for instance by hashing the password).
     *
     * @param username the username of the existing user
     * @param newPassword the new password
     */
    void changePassword(User user, String newPassword);

    /**
     * Adds a new session to the user profile
     *
     * @param user the user
     * @param session the session to add
     */
    void addUserSession(User user, UserSession session);

    /**
     * Removes the specified session from the user profile
     *
     * @param user the user
     * @param session the session to remove
     */
    void removeUserSession(User user, UserSession session);

    /**
     * Clears all sessions from the user profile
     *
     * @param user the user
     */
    void clearSessions(User user);

    /**
     * Adds a new API token to the user profile. The implementation is responsible for storing the token in a secure way
     * (for instance by hashing it).
     *
     * @param user the user
     * @param name the name of the API token to create
     * @param scope the scope this API token will be valid for
     * @return the string that can be used as a Bearer token to match the new API token
     */
    String addUserApiToken(User user, String name, String scope);

    /**
     * Removes the specified API token from the user profile
     *
     * @param user the user
     * @param apiToken the API token
     */
    void removeUserApiToken(User user, UserApiToken apiToken);

    static Optional<String> hash(String password, String salt, int iterations) {
        char[] chars = password.toCharArray();
        byte[] bytes = salt.getBytes();

        PBEKeySpec spec = new PBEKeySpec(chars, bytes, iterations, KEY_LENGTH);

        Arrays.fill(chars, Character.MIN_VALUE);

        try {
            SecretKeyFactory fac = SecretKeyFactory.getInstance(ALGORITHM);
            byte[] securePassword = fac.generateSecret(spec).getEncoded();
            return Optional.of(Base64.getEncoder().encodeToString(securePassword));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            LoggerFactory.getLogger(UserRegistry.class).error("Exception encountered while hashing", e);
            return Optional.empty();
        } finally {
            spec.clearPassword();
        }
    }
}
