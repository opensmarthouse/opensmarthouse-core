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
package org.openhab.core.auth.apitoken.provider.internal;

import org.openhab.core.auth.Authentication;
import org.openhab.core.auth.AuthenticationException;
import org.openhab.core.auth.AuthenticationProvider;
import org.openhab.core.auth.AuthenticationResult;
import org.openhab.core.auth.Credentials;
import org.openhab.core.auth.local.GenericUser;
import org.openhab.core.auth.local.ManagedUser;
import org.openhab.core.auth.local.User;
import org.openhab.core.auth.local.UserApiToken;
import org.openhab.core.auth.local.UserRegistry;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.openhab.core.auth.apitoken.UserApiTokenCredentials;

/**
 * Authentication provider which is able to correlate received authentication token.
 *
 * @author Yannick Schaus - initial contribution
 * @author Łukasz Dywicki - Extracted from io.rest.auth module.
 */
@Component
public class ApitokenAuthenticationProvider implements AuthenticationProvider {

  private final UserRegistry userRegistry;

  @Activate
  public ApitokenAuthenticationProvider(@Reference UserRegistry userRegistry) {
    this.userRegistry = userRegistry;
  }

  @Override
  public AuthenticationResult authenticate(Credentials credentials) throws AuthenticationException {
    if (!(credentials instanceof UserApiTokenCredentials)) {
      throw new IllegalArgumentException("Invalid credential type");
    }

    UserApiTokenCredentials apiTokenCreds = (UserApiTokenCredentials) credentials;
    String[] apiTokenParts = apiTokenCreds.getApiToken().split("\\.");
    if (apiTokenParts.length != 3 || !UserRegistry.APITOKEN_PREFIX.equals(apiTokenParts[0])) {
      throw new AuthenticationException("Invalid API token format");
    }
    for (User user : userRegistry.getAll()) {
      ManagedUser managedUser = (ManagedUser) user;
      for (UserApiToken userApiToken : managedUser.getApiTokens()) {
        // only check if the name in the token matches
        if (!userApiToken.getName().equals(apiTokenParts[1])) {
          continue;
        }
        String[] existingTokenHashAndSalt = userApiToken.getApiToken().split(":");
        String incomingTokenHash = UserRegistry.hash(apiTokenCreds.getApiToken(), existingTokenHashAndSalt[1],
            UserRegistry.APITOKEN_ITERATIONS).get();

        if (incomingTokenHash.equals(existingTokenHashAndSalt[0])) {
          return new AuthenticationResult(new GenericUser(managedUser.getName()), credentials.getScheme(),
              new Authentication(managedUser.getName(), managedUser.getRoles().stream().toArray(String[]::new), userApiToken.getScope())
          );
        }
      }
    }

    throw new AuthenticationException("Unknown API token");
  }

  @Override
  public boolean supports(Class<? extends Credentials> type) {
    return UserApiTokenCredentials.class.isAssignableFrom(type);
  }

}
