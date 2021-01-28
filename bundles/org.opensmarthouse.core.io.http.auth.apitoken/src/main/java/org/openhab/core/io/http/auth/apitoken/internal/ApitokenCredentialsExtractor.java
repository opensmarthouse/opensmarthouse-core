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
package org.openhab.core.io.http.auth.apitoken.internal;

import java.util.Optional;
import org.openhab.core.auth.Credentials;
import org.openhab.core.io.auth.CredentialsExtractor;
import org.openhab.core.io.http.facade.HttpRequestDelegate;
import org.osgi.service.component.annotations.Component;
import org.openhab.core.auth.apitoken.UserApiTokenCredentials;

/**
 *
 * @author Łukasz Dywicki - Extracted from {@link org.openhab.core.io.rest.auth.internal.AuthFilter}
 */
@Component(property = { "context=org.openhab.core.io.http.facade.HttpRequestDelegate" })
public class ApitokenCredentialsExtractor implements CredentialsExtractor<HttpRequestDelegate> {

  private static final String ALT_AUTH_HEADER = "X-OPENHAB-TOKEN";
  private static final String API_TOKEN_PREFIX = "oh.";

  @Override
  public Optional<Credentials> retrieveCredentials(HttpRequestDelegate requestContext) {
    return requestContext.getHeader(ALT_AUTH_HEADER)
      .filter(token -> token.startsWith(API_TOKEN_PREFIX))
      .map(token -> new UserApiTokenCredentials(token));
  }
}
