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

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * Helpers for filtering out collections and returning trimmed data.
 *
 * @author Łukasz Dywicki - Initial contribution
 */
public class AuthorizationManagerFilters {

  public static <T> List<T> filter(Authentication authentication, BiFunction<Authentication, T, Boolean> check, List<T> values) {
    return values.stream().filter(value -> check.apply(authentication, value))
        .collect(Collectors.toList());
  }

  public static <T> Set<T> filter(Authentication authentication, BiFunction<Authentication, T, Boolean> check, Set<T> values) {
    return values.stream().filter(value -> check.apply(authentication, value))
        .collect(Collectors.toSet());
  }

  public static <K, V> Map<K, V> filter(Authentication authentication, BiFunction<Authentication, Entry<K, V>, Boolean> check, Map<K, V> values) {
    return values.entrySet().stream().filter(entry -> check.apply(authentication, entry))
      .collect(Collectors.toMap(Entry::getKey, Entry::getValue));
  }

}
