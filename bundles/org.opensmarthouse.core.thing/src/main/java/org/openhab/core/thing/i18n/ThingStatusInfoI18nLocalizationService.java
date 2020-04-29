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
package org.openhab.core.thing.i18n;

import java.util.Locale;
import org.openhab.core.common.osgi.BundleResolver;
import org.openhab.core.thing.Thing;
import org.openhab.core.thing.ThingStatusInfo;
import org.openhab.core.thing.binding.ThingHandler;
import org.osgi.service.component.annotations.Reference;

/**
 * <p>
 * The {@link ThingStatusInfoI18nLocalizationService} can be used to localize the {@link ThingStatusInfo} of a thing
 * using the I18N mechanism of the openHAB framework. Currently the description of the {@link ThingStatusInfo}
 * is the single attribute which can be localized.
 *
 * <p>
 * In order to provide a localized description the corresponding {@link ThingHandler} of the thing does not provide a
 * localized string in the <i>ThingStatus.description</i> attribute, but instead provides the reference of the
 * localization string, e.g &#64;text/rate_limit. The handler is able to provide placeholder values as a JSON-serialized
 * array of strings:
 *
 * <pre>
 * &#64;text/rate_limit ["60", "10", "@text/hour"]
 * </pre>
 *
 * <pre>
 * rate_limit=Device is blocked by remote service for {0} minutes. Maximum limit of {1} configuration
 * changes per {2} has been exceeded. For further info please refer to device vendor.
 * </pre>
 *
 * @author Thomas Höfer - Initial contribution
 * @author Henning Sudbrock - Permit translations from thing handler parent bundles
 */
public interface ThingStatusInfoI18nLocalizationService {

    /**
     * Localizes the {@link ThingStatusInfo} for the given thing.
     *
     * @param thing the thing whose thing status info is to be localized (must not be null)
     * @param locale the locale to be used (can be null)
     * @return the localized thing status or the original thing status if
     *         <ul>
     *         <li>there is nothing to be localized</li>
     *         <li>the thing does not have a handler</li>
     *         </ul>
     * @throws IllegalArgumentException if given thing is null
     */
    ThingStatusInfo getLocalizedThingStatusInfo(Thing thing, Locale locale);

    /**
     * Returns the translation of the description for the specified locale, using the translations from the bundles of
     * the given thingHandler and its parent classes. The description may contain arguments that may also need
     * translation (see class JavaDoc for an example); those arguments are translated in the same way.
     */
    @Reference
    void setBundleResolver(BundleResolver bundleResolver);

}
