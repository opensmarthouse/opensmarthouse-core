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
package org.openhab.core.auth;

import java.security.Principal;

/**
 * Type describing successful authentication attempt.
 *
 * @author Łukasz Dywicki - Initial contribution
 */
public class AuthenticationResult {

    private final Principal principal;
    private final String scheme;
    private final Authentication authentication;

    public AuthenticationResult(Principal principal, String scheme, Authentication authentication) {
        this.principal = principal;
        this.scheme = scheme;
        this.authentication = authentication;
    }

    public Principal getPrincipal() {
        return principal;
    }

    public String getScheme() {
        return scheme;
    }

    public Authentication getAuthentication() {
        return authentication;
    }

}
