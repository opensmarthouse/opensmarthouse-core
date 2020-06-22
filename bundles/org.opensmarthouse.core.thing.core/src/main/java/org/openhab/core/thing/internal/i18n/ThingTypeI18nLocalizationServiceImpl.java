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
package org.openhab.core.thing.internal.i18n;

import java.util.List;
import java.util.Locale;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.i18n.TranslationProvider;
import org.openhab.core.thing.ThingTypeUID;
import org.openhab.core.thing.i18n.ChannelGroupTypeI18nLocalizationService;
import org.openhab.core.thing.i18n.ChannelTypeI18nLocalizationService;
import org.openhab.core.thing.i18n.ThingTypeI18nLocalizationService;
import org.openhab.core.thing.type.BridgeType;
import org.openhab.core.thing.type.ChannelDefinition;
import org.openhab.core.thing.type.ChannelGroupDefinition;
import org.openhab.core.thing.type.ChannelGroupTypeRegistry;
import org.openhab.core.thing.type.ChannelTypeRegistry;
import org.openhab.core.thing.type.ThingType;
import org.openhab.core.thing.type.ThingTypeBuilder;
import org.osgi.framework.Bundle;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * Default implementation of {@link ThingTypeI18nLocalizationService}.
 *
 * @author Łukasz Dywicki - Initial contribution.
 * @author Chris Jackson - Add version
 */
@Component(service = ThingTypeI18nLocalizationService.class)
@NonNullByDefault
public class ThingTypeI18nLocalizationServiceImpl implements ThingTypeI18nLocalizationService {

    private final ThingTypeI18nUtil thingTypeI18nUtil;
    private final ChannelGroupI18nUtil channelGroupI18nUtil;
    private final ChannelI18nUtil channelI18nUtil;

    @Activate
    public ThingTypeI18nLocalizationServiceImpl(final @Reference TranslationProvider i18nProvider,
            final @Reference ChannelGroupTypeI18nLocalizationService channelGroupTypeI18nLocalizationService,
            final @Reference ChannelGroupTypeRegistry channelGroupTypeRegistry,
            final @Reference ChannelTypeI18nLocalizationService channelTypeI18nLocalizationService,
            final @Reference ChannelTypeRegistry channelTypeRegistry) {
        this.thingTypeI18nUtil = new ThingTypeI18nUtil(i18nProvider);
        this.channelGroupI18nUtil = new ChannelGroupI18nUtil(channelGroupTypeI18nLocalizationService,
                channelGroupTypeRegistry);
        this.channelI18nUtil = new ChannelI18nUtil(channelTypeI18nLocalizationService, channelTypeRegistry);
    }

    @Override
    public ThingType createLocalizedThingType(Bundle bundle, ThingType thingType, @Nullable Locale locale) {
        ThingTypeUID thingTypeUID = thingType.getUID();
        String label = thingTypeI18nUtil.getLabel(bundle, thingTypeUID, thingType.getLabel(), locale);
        String description = thingTypeI18nUtil.getDescription(bundle, thingTypeUID, thingType.getDescription(), locale);

        List<ChannelDefinition> localizedChannelDefinitions = channelI18nUtil.createLocalizedChannelDefinitions(bundle,
                thingType.getChannelDefinitions(),
                channelDefinition -> thingTypeI18nUtil.getChannelLabel(bundle, thingTypeUID, channelDefinition,
                        channelDefinition.getLabel(), locale),
                channelDefinition -> thingTypeI18nUtil.getChannelDescription(bundle, thingTypeUID, channelDefinition,
                        channelDefinition.getDescription(), locale),
                locale);

        List<ChannelGroupDefinition> localizedChannelGroupDefinitions = channelGroupI18nUtil
                .createLocalizedChannelGroupDefinitions(bundle, thingType.getChannelGroupDefinitions(),
                        channelGroupDefinition -> thingTypeI18nUtil.getChannelGroupLabel(bundle, thingTypeUID,
                                channelGroupDefinition, channelGroupDefinition.getLabel(), locale),
                        channelGroupDefinition -> thingTypeI18nUtil.getChannelGroupDescription(bundle, thingTypeUID,
                                channelGroupDefinition, channelGroupDefinition.getDescription(), locale),
                        locale);

        ThingTypeBuilder builder = ThingTypeBuilder.instance(thingType);
        if (label != null) {
            builder.withLabel(label);
        }
        if (description != null) {
            builder.withDescription(description);
        }
        builder.withChannelDefinitions(localizedChannelDefinitions)
                .withChannelGroupDefinitions(localizedChannelGroupDefinitions).withVersion(thingType.getVersion());

        if (thingType instanceof BridgeType) {
            return builder.buildBridge();
        }

        return builder.build();
    }

}
