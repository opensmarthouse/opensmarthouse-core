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
package org.openhab.core.io.rest.auth.local.internal;

import org.openhab.core.auth.Authentication;
import org.openhab.core.auth.AuthenticationException;
import org.openhab.core.auth.AuthenticationProvider;
import org.openhab.core.auth.AuthenticationResult;
import org.openhab.core.auth.Credentials;
import org.openhab.core.auth.cookie.CookieCredentials;
import org.openhab.core.auth.local.GenericUser;
import org.openhab.core.auth.local.ManagedUser;
import org.openhab.core.auth.local.User;
import org.openhab.core.auth.local.UserRegistry;
import org.openhab.core.auth.local.UserSession;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * An authentication provider which rely on session cookie and try bo bind it with one of existing users.
 *
 * This logic (possibly in similar shape) originally was located in JAXRS authentication filter.
 * The advantage of this provider is possibility to use shared cookie authentication both for servlet
 * and REST resources.
 *
 * @author Łukasz Dywicki - Initial contribution.
 */
@Component
public class SessionCookieAuthenticationProvider implements AuthenticationProvider {

  private final UserRegistry registry;

  @Activate
  public SessionCookieAuthenticationProvider(@Reference UserRegistry registry) {
    this.registry = registry;
  }

  @Override
  public AuthenticationResult authenticate(Credentials credentials) throws AuthenticationException {
    if (!(credentials instanceof CookieCredentials)) {
      throw new IllegalArgumentException("Unsupported credentials");
    }

    String session = ((CookieCredentials) credentials).getValue();
    for (User user : registry.getAll()) {
      if (user instanceof ManagedUser) {
        ManagedUser managed = (ManagedUser) user;
        for (UserSession userSession : managed.getSessions()) {
          if (session.equals(userSession.getSessionId())) {
            return new AuthenticationResult(new GenericUser(user.getName()), credentials.getScheme(),
              new Authentication(user.getName(), user.getRoles(), null, user.getPermissions())
            );
          }
        }
      }
    }

    throw new AuthenticationException("Failed to authenticate cookie");
  }

  @Override
  public boolean supports(Class<? extends Credentials> type) {
    return CookieCredentials.class.isAssignableFrom(type);
  }

}
