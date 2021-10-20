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

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.jdt.annotation.NonNullByDefault;

/**
 * Represents a generic {@link User} with a set of roles
 *
 * @author Yannick Schaus - initial contribution
 *
 */
@NonNullByDefault
public class GenericUser implements User {

    private String name;
    private Set<String> roles;
    private Set<String> permissions;

    /**
     * Constructs a user attributed with a set of roles.
     *
     * @param name the username (account name)
     * @param roles the roles attributed to this user
     * @param permissions the items user has access to
     */
    public GenericUser(String name, Set<String> roles, Set<String> permissions) {
        this.name = name;
        this.roles = roles;
        this.permissions = permissions;
    }

    public GenericUser(String name, Set<String> roles) {
        this(name, roles, Collections.emptySet());
    }

    /**
     * Constructs a user with no roles.
     *
     * @param name the username (account name)
     */
    public GenericUser(String name) {
        this(name, new HashSet<>());
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getUID() {
        return name;
    }

    @Override
    public Set<String> getRoles() {
        return roles;
    }

    @Override
    public Set<String> getPermissions() {
        return permissions;
    }

    public String toString() {
        return name + " (" + roles + " " + permissions + ")";
    }
}
