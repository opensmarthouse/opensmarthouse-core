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
package org.openhab.core.io.http.auth.internal;

import java.util.Arrays;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import org.openhab.core.io.http.facade.Cookie;
import org.openhab.core.io.http.facade.HttpRequestDelegate;

/**
 * Servlet request wrapper.
 *
 * @author Łukasz Dywicki - Initial contribution
 */
public class ServletRequestDelegate implements HttpRequestDelegate {

  private final HttpServletRequest request;

  public ServletRequestDelegate(HttpServletRequest request) {
    this.request = request;
  }

  @Override
  public Optional<String> getHeader(String headerName) {
    return Optional.ofNullable(request.getHeader(headerName));
  }

  @Override
  public Optional<Cookie> getCookie(String cookieName) {
    return Arrays.stream(request.getCookies()).filter(cookie -> cookieName.equals(cookie.getName()))
        .map(cookie -> new Cookie(cookie.getName(), cookie.getValue()))
        .findFirst();
  }
}
