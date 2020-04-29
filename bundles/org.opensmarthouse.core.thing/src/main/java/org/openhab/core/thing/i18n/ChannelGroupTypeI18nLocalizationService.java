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
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.thing.type.ChannelGroupType;
import org.osgi.framework.Bundle;

/**
 * This OSGi service could be used to localize a {@link ChannelGroupType} type using the I18N mechanism of the openHAB
 * framework.
 *
 * @author Markus Rathgeb - Initial contribution
 * @author Markus Rathgeb - Move code from XML thing type provider to separate service
 * @author Laurent Garnier - fix localized label and description for channel group definition
 * @author Christoph Weitkamp - factored out from {@link XmlChannelTypeProvider} and {@link XmlChannelGroupTypeProvider}
 * @author Henning Treu - factored out from {@link ThingTypeI18nLocalizationService}
 * @author Christoph Weitkamp - Removed "advanced" attribute
 */
public interface ChannelGroupTypeI18nLocalizationService {

    ChannelGroupType createLocalizedChannelGroupType(Bundle bundle, ChannelGroupType channelGroupType,
            @Nullable Locale locale);

}
