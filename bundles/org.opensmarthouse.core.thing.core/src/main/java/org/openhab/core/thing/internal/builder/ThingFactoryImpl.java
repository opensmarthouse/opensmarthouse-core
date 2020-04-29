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
package org.openhab.core.thing.internal.builder;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.config.core.ConfigDescriptionRegistry;
import org.openhab.core.config.core.Configuration;
import org.openhab.core.thing.Channel;
import org.openhab.core.thing.Thing;
import org.openhab.core.thing.ThingTypeUID;
import org.openhab.core.thing.ThingUID;
import org.openhab.core.thing.binding.ThingFactory;
import org.openhab.core.thing.binding.ThingHandlerFactory;
import org.openhab.core.thing.binding.builder.ThingBuilder;
import org.openhab.core.thing.internal.ThingFactoryHelper;
import org.openhab.core.thing.type.BridgeType;
import org.openhab.core.thing.type.ThingType;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * {@link ThingFactory} helps to create thing based on a given {@link ThingType} .
 *
 * @author Dennis Nobel - Initial contribution, added support for channel groups
 * @author Benedikt Niehues - fix for Bug https://bugs.eclipse.org/bugs/show_bug.cgi?id=445137 considering default
 *         values
 * @author Thomas Höfer - added thing and thing type properties
 * @author Chris Jackson - Added properties, label, description
 */
@NonNullByDefault
@Component(service = ThingFactory.class)
public class ThingFactoryImpl implements ThingFactory {

    private static final Logger LOGGER = LoggerFactory.getLogger(ThingFactoryImpl.class);

    @Override
    public ThingUID generateRandomThingUID(ThingTypeUID thingTypeUID) {
        String uuid = UUID.randomUUID().toString();
        String thingId = uuid.substring(uuid.length() - 12, uuid.length());
        return new ThingUID(thingTypeUID, thingId);
    }

    @Override
    public Thing createThing(ThingType thingType, ThingUID thingUID, Configuration configuration,
            @Nullable ThingUID bridgeUID) {
        return createThing(thingType, thingUID, configuration, bridgeUID, null);
    }

    @Override
    public Thing createThing(ThingType thingType, ThingUID thingUID, Configuration configuration,
            @Nullable ThingUID bridgeUID, @Nullable ConfigDescriptionRegistry configDescriptionRegistry) {
        ThingFactoryHelper.applyDefaultConfiguration(configuration, thingType, configDescriptionRegistry);

        List<Channel> channels = ThingFactoryHelper.createChannels(thingType, thingUID, configDescriptionRegistry);

        return createThingBuilder(thingType, thingUID).withConfiguration(configuration).withChannels(channels)
                .withProperties(thingType.getProperties()).withBridge(bridgeUID).build();
    }

    @Override
    public @Nullable Thing createThing(ThingUID thingUID, Configuration configuration,
            @Nullable Map<String, String> properties, @Nullable ThingUID bridgeUID, ThingTypeUID thingTypeUID,
            List<ThingHandlerFactory> thingHandlerFactories) {
        for (ThingHandlerFactory thingHandlerFactory : thingHandlerFactories) {
            if (thingHandlerFactory.supportsThingType(thingTypeUID)) {
                Thing thing = thingHandlerFactory.createThing(thingTypeUID, configuration, thingUID, bridgeUID);
                if (thing == null) {
                    ThingFactoryImpl.LOGGER.error(
                            "Thing factory ({}) returned null on create thing when it reports to support the thing type ({}).",
                            thingHandlerFactory.getClass(), thingTypeUID);
                } else {
                    if (properties != null) {
                        for (String key : properties.keySet()) {
                            thing.setProperty(key, properties.get(key));
                        }
                    }
                }
                return thing;
            }
        }
        return null;
    }

    @Override
    public Thing createThing(ThingType thingType, ThingUID thingUID, Configuration configuration) {
        return createThing(thingType, thingUID, configuration, null);
    }

    @Override
    public ThingBuilder createThingBuilder(ThingType thingType, ThingUID thingUID) {
        if (thingType instanceof BridgeType) {
            return BridgeBuilderImpl.create(thingType.getUID(), thingUID);
        }
        return ThingBuilderImpl.create(thingType.getUID(), thingUID);
    }

}
