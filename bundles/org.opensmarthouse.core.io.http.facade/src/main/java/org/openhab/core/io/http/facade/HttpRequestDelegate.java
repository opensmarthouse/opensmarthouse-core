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
package org.openhab.core.io.http.facade;

import java.util.Optional;

/**
 * A thin abstraction layer over HTTP request to bridge servlet and JAX-RS api.
 *
 * @author Łukasz Dywicki - Initial contribution
 */
public interface HttpRequestDelegate {

  Optional<String> getHeader(String headerName);

  default Optional<String> getAuthorizationHeader() {
    return getHeader("Authorization");
  }

  Optional<Cookie> getCookie(String cookieName);
}