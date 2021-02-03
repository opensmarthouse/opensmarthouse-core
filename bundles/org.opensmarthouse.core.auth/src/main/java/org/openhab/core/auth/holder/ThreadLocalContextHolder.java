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
package org.openhab.core.auth.holder;

import java.util.Optional;
import org.openhab.core.auth.Authentication;
import org.openhab.core.auth.AuthenticationContextHolder;
import org.openhab.core.auth.MutableAuthenticationContextHolder;
import org.osgi.service.component.annotations.Component;

/**
 * Implementation of authentication context holder based on {@link ThreadLocal}.
 *
 * @author Łukasz Dywicki - Initial contribution.
 */
@Component(service = {AuthenticationContextHolder.class, MutableAuthenticationContextHolder.class})
public class ThreadLocalContextHolder implements AuthenticationContextHolder, MutableAuthenticationContextHolder {

  private final ThreadLocal<Authentication> authentication = new ThreadLocal<>();

  @Override
  public Authentication getAuthentication() {
    return authentication.get();
  }

  @Override
  public Optional<Authentication> fetchAuthentication() {
    return Optional.ofNullable(authentication.get());
  }

  // this one should be visible only to few
  public void setAuthentication(Authentication authentication) {
    this.authentication.set(authentication);
  }

}
