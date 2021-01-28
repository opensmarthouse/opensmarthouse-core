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
package org.openhab.core.io.rest.auth.internal;

import java.security.Principal;
import javax.ws.rs.core.SecurityContext;
import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.auth.Authentication;
import org.openhab.core.io.rest.auth.AuthenticationSecurityContext;

@NonNullByDefault
public class ApplicationSecurityContext implements AuthenticationSecurityContext {

    private Authentication authentication;
    private final boolean secure;
    private final String scheme;

    public ApplicationSecurityContext(Authentication authentication, boolean secure, String scheme) {
        this.authentication = authentication;
        this.secure = secure;
        this.scheme = scheme;
    }

    @Override
    public Principal getUserPrincipal() {
        return new Principal() {
            @Override
            public String getName() {
                return authentication.getUsername();
            }
        };
    }

    @Override
    public boolean isUserInRole(@Nullable String role) {
        return authentication.getRoles().contains(role);
    }

    @Override
    public boolean isSecure() {
        return secure;
    }

    @Override
    public String getAuthenticationScheme() {
        return scheme;
    }

    @Override
    public Authentication getAuthentication() {
        return authentication;
    }
}
