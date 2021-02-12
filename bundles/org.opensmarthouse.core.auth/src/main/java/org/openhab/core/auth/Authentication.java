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

import java.util.Set;

/**
 * Definition of authentication given to username after verification of credentials by authentication provider.
 *
 * Each authentication must at least point to some identity (username), roles, and may also be valid for a specific
 * scope only.
 *
 * @author Łukasz Dywicki - Initial contribution, item level security
 * @author Kai Kreuzer - Added JavaDoc and switched from array to Set
 * @author Yannick Schaus - Add scope
 */
public class Authentication {

    private String username;
    private Set<String> roles;
    private String scope;
    private Set<String> permissions;

    /**
     * no-args constructor required by gson
     */
    protected Authentication() {
        this.username = null;
        this.roles = null;
        this.scope = null;
        this.permissions = null;
    }

    /**
     * Creates a new instance
     *
     * @param username name of the user associated to this authentication instance
     * @param roles a variable list of roles that the user possesses.
     */
    public Authentication(String username, String... roles) {
        this(username, roles, "");
    }

    /**
     * Creates a new instance with a specific scope
     *
     * @param username name of the user associated to this authentication instance
     * @param roles a variable list of roles that the user possesses.
     * @param scope a scope this authentication is valid for
     */
    public Authentication(String username, String[] roles, String scope) {
        this(username, roles, scope, new String[] {"*:*:*"});
    }

    /**
     * Creates a new instance with a specific scope
     *
     * @param username name of the user associated to this authentication instance
     * @param roles a variable list of roles that the user possesses.
     * @param scope a scope this authentication is valid for
     * @param permissions permissions associated with authentication
     */
    public Authentication(String username, String[] roles, String scope, String[] permissions) {
        this(username, Set.of(roles), scope, Set.of(permissions));
    }

    /**
     * Creates a new instance with a specific scope
     *
     * @param username name of the user associated to this authentication instance
     * @param roles a variable list of roles that the user possesses.
     * @param scope a scope this authentication is valid for
     * @param permissions permissions associated with authentication
     */
    public Authentication(String username, Set<String> roles, String scope, Set<String> permissions) {
        this.username = username;
        this.roles = roles;
        this.scope = scope;
        this.permissions = permissions;
    }

    /**
     * Retrieves the name of the authenticated user
     *
     * @return user name
     */
    public String getUsername() {
        return username;
    }

    /**
     * Retrieves the roles of the authenticated user
     *
     * @return a set of roles
     */
    public Set<String> getRoles() {
        return roles;
    }

    /**
     * Retrieves the scope this authentication is valid for
     *
     * @return a scope
     */
    public String getScope() {
        return scope;
    }

    /**
     * Retrieves the permissions this authentication has.
     *
     * @return an set of permissions (might be empty)
     */
    public Set<String> getPermissions() {
        return permissions;
    }
}
