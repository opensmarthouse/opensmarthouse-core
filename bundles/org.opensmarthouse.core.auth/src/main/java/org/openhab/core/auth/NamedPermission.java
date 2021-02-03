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
package org.openhab.core.auth;

import java.util.Objects;

/**
 * Simplest possible implementation of permission.
 *
 * @author Łukasz Dywicki - Initial contribution.
 */
public class NamedPermission implements Permission {

  private final String code;

  public NamedPermission(String code) {
    this.code = code;
  }

  @Override
  public String getCode() {
    return code;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Permission)) {
      return false;
    }
    Permission that = (Permission) o;
    return Objects.equals(getCode(), that.getCode());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getCode());
  }

}
