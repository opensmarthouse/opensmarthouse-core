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

import java.util.List;
import java.util.Locale;
import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.thing.type.ChannelType;
import org.openhab.core.thing.type.ChannelTypeUID;
import org.openhab.core.types.CommandDescription;
import org.openhab.core.types.CommandOption;
import org.openhab.core.types.StateDescription;
import org.openhab.core.types.StateOption;
import org.osgi.framework.Bundle;

/**
 * This OSGi service could be used to localize a {@link ChannelType} using the I18N mechanism of the openHAB
 * framework.
 *
 * @author Markus Rathgeb - Initial contribution
 * @author Markus Rathgeb - Move code from XML thing type provider to separate service
 * @author Laurent Garnier - fix localized label and description for channel group definition
 * @author Christoph Weitkamp - factored out from {@link XmlChannelTypeProvider} and {@link XmlChannelGroupTypeProvider}
 * @author Henning Treu - factored out from {@link ThingTypeI18nLocalizationService}
 */
@NonNullByDefault
public interface ChannelTypeI18nLocalizationService {

    @Nullable
    String createLocalizedStatePattern(Bundle bundle, String pattern, ChannelTypeUID channelTypeUID,
            @Nullable Locale locale);

    List<StateOption> createLocalizedStateOptions(Bundle bundle, List<StateOption> stateOptions,
            ChannelTypeUID channelTypeUID, @Nullable Locale locale);

    @Nullable
    StateDescription createLocalizedStateDescription(Bundle bundle, @Nullable StateDescription state,
            ChannelTypeUID channelTypeUID, @Nullable Locale locale);

    List<CommandOption> createLocalizedCommandOptions(Bundle bundle, List<CommandOption> commandOptions,
            ChannelTypeUID channelTypeUID, @Nullable Locale locale);

    @Nullable
    CommandDescription createLocalizedCommandDescription(Bundle bundle, @Nullable CommandDescription command,
            ChannelTypeUID channelTypeUID, @Nullable Locale locale);

    ChannelType createLocalizedChannelType(Bundle bundle, ChannelType channelType, @Nullable Locale locale);

}
