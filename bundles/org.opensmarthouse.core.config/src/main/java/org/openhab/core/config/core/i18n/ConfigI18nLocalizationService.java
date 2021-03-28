/**
 * Copyright (c) 2020-2021 Contributors to the OpenSmartHouse project
 * Copyright (c) 2010-2021 Contributors to the openHAB project
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
package org.openhab.core.config.core.i18n;

import java.net.URI;
import java.util.List;
import java.util.Locale;
import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.config.core.ConfigDescription;
import org.openhab.core.config.core.ConfigDescriptionParameter;
import org.openhab.core.config.core.ConfigDescriptionParameterGroup;
import org.openhab.core.config.core.ParameterOption;
import org.osgi.framework.Bundle;

/**
 * This OSGi service could be used to localize a config description using the I18N mechanism of the openHAB
 * framework.
 *
 * @author Markus Rathgeb - Initial contribution
 * @author Łukasz Dywicki - Extract interface
 */
@NonNullByDefault
public interface ConfigI18nLocalizationService {
    /**
     * Localize a config description.
     *
     * @param bundle the bundle the i18n resources are located
     * @param configDescription the config description that should be localized
     * @param locale the locale it should be localized to
     * @return a localized configuration description on success, a non-localized one on error (e.g. no translation is
     *         found).
     */
    ConfigDescription getLocalizedConfigDescription(Bundle bundle, ConfigDescription configDescription,
            @Nullable Locale locale);

    /**
     * Localize a config description parameter.
     *
     * @param bundle the bundle the i18n resources are located
     * @param configDescription the config description the parameter is part of
     * @param parameter the parameter that should be localized
     * @param locale the locale it should be localized to
     * @return a localized parameter on success, a non-localized one on error (e.g. no translation is found).
     */
    ConfigDescriptionParameter getLocalizedConfigDescriptionParameter(Bundle bundle,
            ConfigDescription configDescription, ConfigDescriptionParameter parameter, @Nullable Locale locale);

    /**
     * Localize a config description parameter.
     *
     * @param bundle the bundle the i18n resources are located
     * @param configDescriptionURI the config description URI
     * @param parameter the parameter that should be localized
     * @param locale the locale it should be localized to
     * @return a localized parameter on success, a non-localized one on error (e.g. no translation is found).
     */
    ConfigDescriptionParameter getLocalizedConfigDescriptionParameter(Bundle bundle, URI configDescriptionURI,
            ConfigDescriptionParameter parameter, @Nullable Locale locale);

    /**
     * Localize a config description parameter group.
     *
     * @param bundle the bundle the i18n resources are located
     * @param configDescription the config description the parameter group is part of
     * @param group the parameter group that should be localized
     * @param locale the locale it should be localized to
     * @return a localized parameter group on success, a non-localized one on error (e.g. no translation is found).
     */
    ConfigDescriptionParameterGroup getLocalizedConfigDescriptionGroup(Bundle bundle,
            ConfigDescription configDescription, ConfigDescriptionParameterGroup group, @Nullable Locale locale);

    /**
     * Localize a config description parameter group.
     *
     * @param bundle the bundle the i18n resources are located
     * @param configDescriptionURI the config description URI
     * @param group the parameter group that should be localized
     * @param locale the locale it should be localized to
     * @return a localized parameter group on success, a non-localized one on error (e.g. no translation is found).
     */
    ConfigDescriptionParameterGroup getLocalizedConfigDescriptionGroup(Bundle bundle, URI configDescriptionURI,
            ConfigDescriptionParameterGroup group, @Nullable Locale locale);

    /**
     * Localize parameter options.
     *
     * @param originalOptions the parameter options that should be localized
     * @param bundle the bundle the i18n resources are located
     * @param configDescriptionURI the config description URI
     * @param parameterName the name of the parameter
     * @param locale the locale it should be localized to
     * @return a list with parameter option. If an option could not be localized (e.g. no translation is found), the
     *         non-localized one is added to the list.
     */
    List<ParameterOption> getLocalizedOptions(List<ParameterOption> originalOptions, Bundle bundle,
            URI configDescriptionURI, String parameterName, @Nullable Locale locale);
}
