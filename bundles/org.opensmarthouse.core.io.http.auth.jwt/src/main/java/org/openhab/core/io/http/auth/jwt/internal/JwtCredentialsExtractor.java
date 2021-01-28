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
package org.openhab.core.io.http.auth.jwt.internal;

import java.util.Optional;
import org.openhab.core.auth.Credentials;
import org.openhab.core.auth.jwt.JWTCredentials;
import org.openhab.core.io.auth.CredentialsExtractor;
import org.openhab.core.io.http.facade.HttpRequestDelegate;
import org.osgi.service.component.annotations.Component;

/**
 * An extractor of request credentials which rely on token sent in authorization header.
 *
 * @author Łukasz Dywicki - Extracted from {@link org.openhab.core.io.rest.auth.internal.AuthFilter}
 */
@Component(property = { "context=org.openhab.core.io.http.facade.HttpRequestDelegate" })
public class JwtCredentialsExtractor implements CredentialsExtractor<HttpRequestDelegate> {

  @Override
  public Optional<Credentials> retrieveCredentials(HttpRequestDelegate request) {
    return request.getAuthorizationHeader()
      .filter(header -> header.contains(" "))
      .flatMap(this::process);
  }

  private Optional<JWTCredentials> process(String authenticationHeader) {
    String[] tokens = authenticationHeader.split(" ");
    if (tokens.length == 2) {
      if ("bearer".equalsIgnoreCase(tokens[0])) {
        return Optional.of(new JWTCredentials(tokens[1]));
      }
    }

    return Optional.empty();
  }
}
