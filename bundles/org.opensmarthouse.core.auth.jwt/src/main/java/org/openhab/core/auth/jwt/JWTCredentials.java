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
package org.openhab.core.auth.jwt;

import org.openhab.core.auth.Credentials;

public class JWTCredentials implements Credentials {

  private final String token;

  public JWTCredentials(String token) {
    this.token = token;
  }

  public String getToken() {
    return token;
  }

  public String getScheme() {
    return "Bearer";
  }

}
