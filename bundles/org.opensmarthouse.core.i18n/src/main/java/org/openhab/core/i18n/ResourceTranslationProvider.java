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
package org.openhab.core.i18n;

import java.util.Locale;

/**
 * Interface for resource/translation provider which can be registered dynamically as a service.
 *
 * @author Łukasz Dywicki - Initial contribution.
 */
public interface ResourceTranslationProvider {

  /**
   * Returns a translation for the specified key in the specified locale (language) by only
   * considering the specified resource section. The resource is equal to a base name and
   * therefore it is mapped to one translation package (all files which belong to the base
   * name).
   * <p>
   * If no translation could be found, {@code null} is returned. If the location is not specified, the default
   * location is used.
   *
   * @param resource the resource to be used for look-up (could be null or empty)
   * @param key the key to be translated (could be null or empty)
   * @param locale the locale (language) to be used (could be null)
   *
   * @return the translated text, or null if the key could not be translated
   */
  String getText(String resource, String key, Locale locale);

  /**
   * Returns a translation for the specified key in the specified locale (language)
   * by considering all resources in the according bundle.
   * <p>
   * If no translation could be found, {@code null} is returned. If the location is not specified, the default
   * location is used.
   *
   * @param key the key to be translated (could be null or empty)
   * @param locale the locale (language) to be used (could be null)
   *
   * @return the translated text, or null if the key could not be translated
   */
  String getText(String key, Locale locale);

}
