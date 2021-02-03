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
package org.openhab.core.item.auth.internal;

import java.util.Set;
import org.openhab.core.auth.Authentication;
import org.openhab.core.auth.Permission;
import org.openhab.core.auth.PermissionEvaluator;
import org.openhab.core.auth.Permissions;
import org.openhab.core.auth.Role;
import org.openhab.core.items.Item;
import org.osgi.service.component.annotations.Component;

@Component
public class ItemPermissionEvaluator implements PermissionEvaluator<Item> {

  @Override
  public boolean supports(Class<?> type, Permission permission) {
    return Item.class.isAssignableFrom(type);
  }

  @Override
  public boolean hasPermission(Permission permission, Authentication authentication, Item value) {
    if (authentication.getRoles().contains(Role.ADMIN)) {
      return true;
    }

    Set<String> permissions = authentication.getPermissions();
    String item = value.getName();
    return evaluate(permission, permissions, item);
  }

  @Override
  public boolean hasPermission(Permission permission, Authentication authentication, Class<Item> type, String item) {
    if (authentication.getRoles().contains(Role.ADMIN)) {
      return true;
    }

    Set<String> permissions = authentication.getPermissions();
    return evaluate(permission, permissions, item);
  }

  protected boolean evaluate(Permission permission, Set<String> permissions, String item) {
    if (permissions == null) {
      return false;
    }

    return isPermitted(permissions, permission, item) ||
      isPermitted(permissions, permission, "*") ||
      isPermitted(permissions, Permissions.ALL, item);
  }

  private boolean isPermitted(Set<String> permissions, Permission permission, String item) {
    return permissions.contains(permission.getCode() + ":item:" + item);
  }

}
