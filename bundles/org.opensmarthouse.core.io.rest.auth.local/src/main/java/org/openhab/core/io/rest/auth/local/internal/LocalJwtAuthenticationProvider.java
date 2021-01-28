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

import org.openhab.core.auth.Authentication;
import org.openhab.core.auth.AuthenticationException;
import org.openhab.core.auth.AuthenticationProvider;
import org.openhab.core.auth.AuthenticationResult;
import org.openhab.core.auth.Credentials;
import org.openhab.core.auth.jwt.JWTCredentials;
import org.openhab.core.auth.local.GenericUser;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component
public class LocalJwtAuthenticationProvider implements AuthenticationProvider {

  private final JwtHelper jwtHelper;

  @Activate
  public LocalJwtAuthenticationProvider(@Reference JwtHelper jwtHelper) {
    this.jwtHelper = jwtHelper;
  }

  @Override
  public AuthenticationResult authenticate(Credentials credentials) throws AuthenticationException {
    if (!(credentials instanceof JWTCredentials)) {
      throw new IllegalArgumentException("Unsupported credentials");
    }

    String token = ((JWTCredentials) credentials).getToken();
    Authentication authentication = jwtHelper.verifyAndParseJwtAccessToken(token);
    return new AuthenticationResult(
      new GenericUser(authentication.getUsername()), credentials.getScheme(), authentication
    );
  }

  @Override
  public boolean supports(Class<? extends Credentials> type) {
    return JWTCredentials.class.isAssignableFrom(type);
  }

}
