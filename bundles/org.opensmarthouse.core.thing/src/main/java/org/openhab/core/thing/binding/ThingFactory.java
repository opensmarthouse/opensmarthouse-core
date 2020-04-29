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
package org.openhab.core.thing.binding;

import java.util.List;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.config.core.ConfigDescriptionRegistry;
import org.openhab.core.config.core.Configuration;
import org.openhab.core.thing.Thing;
import org.openhab.core.thing.ThingTypeUID;
import org.openhab.core.thing.ThingUID;
import org.openhab.core.thing.binding.builder.ThingBuilder;
import org.openhab.core.thing.type.ThingType;

/**
 * {@link ThingFactory} helps to create thing based on a given {@link ThingType} .
 *
 * @author Dennis Nobel - Initial contribution, added support for channel groups
 * @author Benedikt Niehues - fix for Bug https://bugs.eclipse.org/bugs/show_bug.cgi?id=445137 considering default
 *         values
 * @author Thomas Höfer - added thing and thing type properties
 * @author Chris Jackson - Added properties, label, description
 * @author Łukasz Dywicki - Refactoring to interface
 */
@NonNullByDefault
public interface ThingFactory {

    /**
     * Generates a random Thing UID for the given thingType
     *
     * @param thingTypeUID thing type (must not be null)
     * @return random Thing UID
     */
    ThingUID generateRandomThingUID(ThingTypeUID thingTypeUID);

    /**
     * Creates a thing based on a given thing type.
     *
     * @param thingType thing type (must not be null)
     * @param thingUID thindUID (must not be null)
     * @param configuration (must not be null)
     * @param bridgeUID (can be null)
     * @return thing the thing
     */
    Thing createThing(ThingType thingType, ThingUID thingUID, Configuration configuration, @Nullable ThingUID bridgeUID);

    /**
     * Creates a thing based on a given thing type. It also creates the
     * default-configuration given in the configDescriptions if the
     * configDescriptionRegistry is not null
     *
     * @param thingType (must not be null)
     * @param thingUID (must not be null)
     * @param configuration (must not be null)
     * @param bridgeUID (can be null)
     * @param configDescriptionRegistry (can be null)
     * @return thing the thing
     */
    Thing createThing(ThingType thingType, ThingUID thingUID, Configuration configuration,
            @Nullable ThingUID bridgeUID, @Nullable ConfigDescriptionRegistry configDescriptionRegistry);

    @Nullable Thing createThing(ThingUID thingUID, Configuration configuration,
            @Nullable Map<String, String> properties, @Nullable ThingUID bridgeUID, ThingTypeUID thingTypeUID,
            List<ThingHandlerFactory> thingHandlerFactories);

    Thing createThing(ThingType thingType, ThingUID thingUID, Configuration configuration);

    ThingBuilder createThingBuilder(ThingType thingType, ThingUID thingUID);

}
