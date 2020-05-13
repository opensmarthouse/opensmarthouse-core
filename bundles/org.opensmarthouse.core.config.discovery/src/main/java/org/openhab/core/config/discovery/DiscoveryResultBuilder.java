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
package org.openhab.core.config.discovery;

import java.util.Map;
import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.thing.ThingTypeUID;
import org.openhab.core.thing.ThingUID;

/**
 * The {@link DiscoveryResultBuilder} helps creating a {@link DiscoveryResult} through the builder pattern.
 *
 * @author Kai Kreuzer - Initial contribution
 * @author Andre Fuechsel - added support for time to live
 * @author Thomas Höfer - Added representation
 * @author Łukasz Dywicki - Refactoring to interface
 *
 * @see DiscoveryResult
 */
@NonNullByDefault
public interface DiscoveryResultBuilder {

    /**
     * Explicitly sets the thing type.
     *
     * @param thingTypeUID the {@link ThingTypeUID}
     * @return the updated builder
     */
    DiscoveryResultBuilder withThingType(@Nullable ThingTypeUID thingTypeUID);

    /**
     * Adds properties to the desired result.
     *
     * @param properties of the desired result
     * @return the updated builder
     */
    DiscoveryResultBuilder withProperties(@Nullable Map<String, Object> properties);

    /**
     * Adds a property to the desired result.
     *
     * @param property of the desired result
     * @return the updated builder
     */
    DiscoveryResultBuilder withProperty(String key, Object value);

    /**
     * Sets the representation Property of the desired result.
     *
     * @param representationProperty the representation property of the desired result
     * @return the updated builder
     */
    DiscoveryResultBuilder withRepresentationProperty(@Nullable String representationProperty);

    /**
     * Sets the bridgeUID of the desired result.
     *
     * @param bridgeUID of the desired result
     * @return the updated builder
     */
    DiscoveryResultBuilder withBridge(@Nullable ThingUID bridgeUID);

    /**
     * Sets the label of the desired result.
     *
     * @param label of the desired result
     * @return the updated builder
     */
    DiscoveryResultBuilder withLabel(@Nullable String label);

    /**
     * Sets the time to live for the result in seconds.
     *
     * @param ttl time to live in seconds
     * @return the updated builder
     */
    DiscoveryResultBuilder withTTL(long ttl);

    /**
     * Builds a result with the settings of this builder.
     *
     * @return the desired result
     */
    @SuppressWarnings("deprecation") DiscoveryResult build();
}
