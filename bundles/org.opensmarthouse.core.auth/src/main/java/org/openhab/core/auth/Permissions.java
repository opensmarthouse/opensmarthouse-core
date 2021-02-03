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
package org.openhab.core.auth;

/**
 * Common permission definitions.
 *
 * @author Łukasz Dywicki - Initial contribution
 */
public interface Permissions {

  Permission ALL = new NamedPermission("*");
  Permission READ = new NamedPermission("read");
  Permission STATE = new NamedPermission("state");
  Permission COMMAND = new NamedPermission("command");
  Permission MANAGE = new NamedPermission("manage");

  Permission PERSISTENCE = new NamedPermission("persistence");
}
