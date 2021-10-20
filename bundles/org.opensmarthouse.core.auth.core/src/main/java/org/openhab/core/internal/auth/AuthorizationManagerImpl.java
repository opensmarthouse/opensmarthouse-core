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
package org.openhab.core.internal.auth;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.openhab.core.auth.Authentication;
import org.openhab.core.auth.AuthorizationManager;
import org.openhab.core.auth.Permission;
import org.openhab.core.auth.PermissionEvaluator;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class AuthorizationManagerImpl implements AuthorizationManager {

  private final Logger logger = LoggerFactory.getLogger(AuthorizationManagerImpl.class);
  private List<PermissionEvaluator<Object>> evaluators = new CopyOnWriteArrayList<>();

  @Override
  public <T> boolean hasPermission(Permission permission, T object, Authentication authentication) {
    if (authentication == null) {
      return false;
    }

    for (PermissionEvaluator<Object> evaluator : evaluators) {
      if (evaluator.supports(object.getClass(), permission)) {
        if (!evaluator.hasPermission(permission, authentication, object)) {
          logger.trace("Access denied to object {} ({}) for authentication {} reported by evaluator {}",
              object, object.getClass().getName(), authentication, evaluator);
          return false;
        }
      }
    }
    return true;
  }

  public boolean hasPermission(Permission permission, String id, Class<?> type, Authentication authentication) {
    if (authentication == null) {
      return false;
    }

    for (PermissionEvaluator<Object> evaluator : evaluators) {
      if (evaluator.supports(type, permission)) {
        if (!evaluator.hasPermission(permission, authentication, (Class<Object>) type, id)) {
          logger.trace("Access denied to object with id {} ({}) for authentication {} reported by evaluator {}",
              id, type.getName(), authentication, evaluator);
          return false;
        }
      }
    }
    return true;
  }

  @Reference(cardinality = ReferenceCardinality.MULTIPLE, policy = ReferencePolicy.DYNAMIC)
  public void addPermissionEvaluator(PermissionEvaluator<Object> evaluator) {
    this.evaluators.add(evaluator);
  }

  public void removePermissionEvaluator(PermissionEvaluator<Object> evaluator) {
    this.evaluators.remove(evaluator);
  }

}
