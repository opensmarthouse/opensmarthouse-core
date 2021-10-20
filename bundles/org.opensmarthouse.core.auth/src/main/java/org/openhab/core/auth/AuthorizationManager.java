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

/**
 * Authorization manager is main entry point for security checks.
 *
 * @author Łukasz Dywicki - Initial contribution
 */
public interface AuthorizationManager {

    <T> boolean hasPermission(Permission permission, T object, Authentication authentication);

    boolean hasPermission(Permission permission, String id, Class<?> type, Authentication authentication);

}
