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
package org.openhab.core.thing.binding.builder;

import java.util.Map;
import java.util.Set;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.config.core.Configuration;
import org.openhab.core.library.CoreItemFactory;
import org.openhab.core.thing.Channel;
import org.openhab.core.thing.type.AutoUpdatePolicy;
import org.openhab.core.thing.type.ChannelKind;
import org.openhab.core.thing.type.ChannelType;
import org.openhab.core.thing.type.ChannelTypeUID;

/**
 * {@link ChannelBuilder} is responsible for creating {@link Channel}s.
 *
 * @author Dennis Nobel - Initial contribution
 * @author Alex Tugarev - Extended about default tags
 * @author Chris Jackson - Added properties and label/description
 * @author Łukasz Dywicki - Refactoring to interface.
 * @author Chris Jackson - Added withAcceptedItemType
 */
@NonNullByDefault
public interface ChannelBuilder {

    /**
     * Appends the channel type to the channel to build
     *
     * @param channelTypeUID channel type UID
     * @return channel builder
     */
    ChannelBuilder withType(@Nullable ChannelTypeUID channelTypeUID);

    /**
     * Appends a configuration to the channel to build.
     *
     * @param configuration configuration
     * @return channel builder
     */
    ChannelBuilder withConfiguration(Configuration configuration);

    /**
     * Adds properties to the channel
     *
     * @param properties properties to add
     * @return channel builder
     */
    ChannelBuilder withProperties(Map<String, String> properties);

    /**
     * Sets the channel label. This allows overriding of the default label set in the {@link ChannelType}
     *
     * @param label the channel label to override the label set in the {@link ChannelType}
     * @return channel builder
     */
    ChannelBuilder withLabel(String label);

    /**
     * Sets the channel label. This allows overriding of the default label set in the {@link ChannelType}
     *
     * @param label the channel label to override the label set in the {@link ChannelType}
     * @return channel builder
     */
    ChannelBuilder withDescription(String description);

    /**
     * Appends default tags to the channel to build.
     *
     * @param defaultTags default tags
     * @return channel builder
     */
    ChannelBuilder withDefaultTags(Set<String> defaultTags);

    /**
     * Sets the kind of the channel.
     *
     * @param kind kind.
     * @return channel builder
     */
    ChannelBuilder withKind(ChannelKind kind);

    /**
     * Sets the accepted item type of the {@link Channel} to be build. See
     * {@link CoreItemFactory#getSupportedItemTypes()} for a list of available item types.
     *
     * @param acceptedItemType item type that is accepted by this channel
     * @return channel builder
     */
    public ChannelBuilder withAcceptedItemType(@Nullable String acceptedItemType);

    /**
     * Sets the auto update policy. See {@link AutoUpdatePolicy} for details.
     *
     * @param policy the auto update policy to use
     * @return channel builder
     */
    ChannelBuilder withAutoUpdatePolicy(@Nullable AutoUpdatePolicy policy);

    /**
     * Builds and returns the channel.
     *
     * @return channel
     */
    Channel build();
}
