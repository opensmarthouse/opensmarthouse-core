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
package org.openhab.core.io.rest.auth.local.internal;

import java.security.Principal;

import javax.ws.rs.core.SecurityContext;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.auth.Authentication;
import org.openhab.core.auth.local.User;
import org.openhab.core.io.rest.auth.AuthenticationSecurityContext;

/**
 * This {@link SecurityContext} contains information about a user, roles and authorizations granted to a client
 * from a {@link User} instance.
 *
 * @author Yannick Schaus - initial contribution
 */
@NonNullByDefault
public class UserSecurityContext implements AuthenticationSecurityContext {

    private final Principal principal;
    private final Authentication authentication;
    private final String authenticationScheme;
    private final boolean secure;

    public UserSecurityContext(Principal principal, Authentication authentication,
        String scheme) {
        this(principal, authentication, scheme, false);
    }

    /**
     * Constructs a security context from an instance of Principal.
     *
     * @param principal the principal
     * @param authentication the related {@link Authentication}
     * @param authenticationScheme the scheme that was used to authenticate the user, e.g. "Basic"
     * @param secure determine if request was done over secure channel - ie. HTTPs.
     */
    public UserSecurityContext(Principal principal, Authentication authentication, String authenticationScheme, boolean secure) {
        this.authentication = authentication;
        this.principal = principal;
        this.authenticationScheme = authenticationScheme;
        this.secure = secure;
    }

    @Override
    public Principal getUserPrincipal() {
        return principal;
    }

    @Override
    public boolean isUserInRole(@Nullable String role) {
        return authentication.getRoles().contains(role);
    }

    @Override
    public boolean isSecure() {
        return true;
    }

    @Override
    public String getAuthenticationScheme() {
        return authenticationScheme;
    }

    @Override
    public Authentication getAuthentication() {
        return authentication;
    }
}
