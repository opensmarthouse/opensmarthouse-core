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
package org.openhab.core.io.rest.auth.internal;

import java.util.Optional;
import javax.ws.rs.container.ContainerRequestContext;
import org.openhab.core.io.http.facade.Cookie;
import org.openhab.core.io.http.facade.HttpRequestDelegate;

/**
 * JAX-RS request wrapper.
 *
 * @author Łukasz Dywicki - Initial contribution
 */
public class JaxRsRequestDelegate implements HttpRequestDelegate {

  private final ContainerRequestContext request;

  public JaxRsRequestDelegate(ContainerRequestContext request) {
    this.request = request;
  }

  @Override
  public Optional<String> getHeader(String headerName) {
    return Optional.ofNullable(request.getHeaderString(headerName));
  }

  @Override
  public Optional<Cookie> getCookie(String cookieName) {
    if (request.getCookies().containsKey(cookieName)) {
      javax.ws.rs.core.Cookie cookie = request.getCookies().get(cookieName);
      return Optional.of(new Cookie(cookie.getName(), cookie.getValue()));
    }
    return Optional.empty();
  }
}
