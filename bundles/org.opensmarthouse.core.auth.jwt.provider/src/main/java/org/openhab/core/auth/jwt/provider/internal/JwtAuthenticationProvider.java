/**
 * Copyright (c) 2019-2020 Contributors to the OpenSmartHouse project
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
package org.openhab.core.auth.jwt.provider.internal;

import java.util.List;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.jose4j.jwa.AlgorithmConstraints.ConstraintType;
import org.jose4j.jwk.HttpsJwks;
import org.jose4j.jwt.JwtClaims;
import org.jose4j.jwt.MalformedClaimException;
import org.jose4j.jwt.consumer.InvalidJwtException;
import org.jose4j.jwt.consumer.JwtConsumer;
import org.jose4j.jwt.consumer.JwtConsumerBuilder;
import org.jose4j.jwt.consumer.JwtContext;
import org.jose4j.keys.resolvers.HttpsJwksVerificationKeyResolver;
import org.openhab.core.auth.Authentication;
import org.openhab.core.auth.AuthenticationException;
import org.openhab.core.auth.AuthenticationProvider;
import org.openhab.core.auth.AuthenticationResult;
import org.openhab.core.auth.Credentials;
import org.openhab.core.auth.jwt.JWTCredentials;
import org.openhab.core.config.core.ConfigurableService;
import org.osgi.framework.Constants;
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;

/**
 * Implementation of authentication provider which is backed by JWT realm.
 *
 * Real authentication logic is embedded in login modules implemented by 3rd party, this code is just for bridging it to
 * smarthome platform.
 *
 * @author Łukasz Dywicki - Initial contribution
 */
@NonNullByDefault
@Component(configurationPid = "org.openhab.jwt", property = Constants.SERVICE_PID + "=org.openhab.jwt", configurationPolicy = ConfigurationPolicy.REQUIRE)
@ConfigurableService(category = "auth", label = "JWT Authentication", description_uri = JwtAuthenticationProvider.CONFIG_URI)
public class JwtAuthenticationProvider implements AuthenticationProvider {

    static final String CONFIG_URI = "auth:jwt";
    private @Nullable JwtConsumer jwtProcessor;

    @Override
    public AuthenticationResult authenticate(final Credentials credentials) throws AuthenticationException {
        if (jwtProcessor == null) { // configuration is not yet ready or set
            throw new AuthenticationException("Authenticator is not set up");
        }

        if (!(credentials instanceof JWTCredentials)) {
            throw new AuthenticationException("Unsupported credentials passed to provider.");
        }

        JWTCredentials userCredentials = (JWTCredentials) credentials;
        final String token = userCredentials.getToken();

        try {
            JwtContext jwtContext = jwtProcessor.process(token);
            JwtClaims claims = jwtContext.getJwtClaims();
            return new AuthenticationResult(new ClaimSetPrincipal(claims), credentials.getScheme(),
                new Authentication(claims.getSubject(), extractRoles(claims))
            );
        } catch (InvalidJwtException e) {
            throw new AuthenticationException("Error while processing token", e);
        } catch (MalformedClaimException e) {
            throw new AuthenticationException("Authentication failed", e);
        }
    }

    private String[] extractRoles(JwtClaims claims) {
        Object roles = claims.getClaimValue("roles");
        if (roles instanceof List) {
            List<String> rolesClaim = (List<String>) roles;
            return rolesClaim.toArray(new String[rolesClaim.size()]);
        }
        return new String[0];
    }

    @Activate
    protected void activate(Map<String, Object> properties) throws ConfigurationException {
        modified(properties);
    }

    @Deactivate
    protected void deactivate(Map<String, Object> properties) {
    }

    @Modified
    protected void modified(Map<String, Object> properties) throws ConfigurationException {
        if (properties == null) {
            jwtProcessor = null;
            return;
        }

        Object jwkSetUrlVal = properties.get("jwkSetUrl");
        Object signatureAlgorithmVal = properties.get("signatureAlgorithm");

        if (signatureAlgorithmVal != null) {
            String jwkUrl = null;
            String signatureAlgorithm = null;

            if (jwkSetUrlVal instanceof String && !((String) jwkSetUrlVal).trim().isEmpty()) {
                jwkUrl = (String) jwkSetUrlVal;
            } else {
                throw new ConfigurationException("jwkSetUrl", "Invalid or empty value for property");
            }
            if (signatureAlgorithmVal instanceof String && !((String) signatureAlgorithmVal).trim().isEmpty()) {
                signatureAlgorithm = (String) signatureAlgorithmVal;
            } else {
                throw new ConfigurationException("signatureAlgorithmVal", "Invalid or empty value for property");
            }

            HttpsJwks httpsJkws = new HttpsJwks(jwkUrl);
            HttpsJwksVerificationKeyResolver keyResolver = new HttpsJwksVerificationKeyResolver(httpsJkws);
            jwtProcessor = new JwtConsumerBuilder().setRequireExpirationTime().setAllowedClockSkewInSeconds(30)
                .setJwsAlgorithmConstraints(ConstraintType.WHITELIST, signatureAlgorithm)
                .setVerificationKeyResolver(keyResolver)
                .build();
        } else {
            // value could be unset, we should reset its value
            jwtProcessor = null;
        }
    }

    @Override
    public boolean supports(Class<? extends Credentials> type) {
        return JWTCredentials.class.isAssignableFrom(type);
    }
}
