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
package org.openhab.core.auth.cookie;

import org.openhab.core.auth.Credentials;

/**
 * Credentials which represent key/value pair coming from HTTP cookie.
 *
 * @author Łukasz Dywicki - Initial contribution.
 */
public class CookieCredentials implements Credentials {

  private final String name;
  private final String value;

  public CookieCredentials(String name, String value) {
    this.name = name;
    this.value = value;
  }

  public String getName() {
    return name;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String getScheme() {
    return "cookie";
  }

}
