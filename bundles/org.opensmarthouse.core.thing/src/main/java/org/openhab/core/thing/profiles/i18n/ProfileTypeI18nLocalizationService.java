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
package org.openhab.core.thing.profiles.i18n;

import java.util.Locale;
import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.thing.profiles.ProfileType;
import org.osgi.framework.Bundle;

/**
 * This OSGi service could be used to localize a {@link ProfileType} using the i18n mechanism of the openHAB framework.
 *
 * @author Christoph Weitkamp - Initial contribution
 * @author Łuaksz Dywicki - Refactoring to interface
 */
@NonNullByDefault
public interface ProfileTypeI18nLocalizationService {

    ProfileType createLocalizedProfileType(Bundle bundle, ProfileType profileType, @Nullable Locale locale);

}
