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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.config.core.Configuration;
import org.openhab.core.thing.Channel;
import org.openhab.core.thing.ChannelUID;
import org.openhab.core.thing.Thing;
import org.openhab.core.thing.ThingTypeUID;
import org.openhab.core.thing.ThingUID;
import org.openhab.core.thing.binding.builder.ThingBuilder;
import org.openhab.core.thing.internal.ThingImpl;
import org.openhab.core.thing.util.ThingHelper;

/**
 * Default realization of a thing builder concept.
 *
 * @author Łukasz Dywicki - Initial contribution.
 * @author Chris Jackson - Added thing type version
 */
@NonNullByDefault
public class ThingBuilderImpl implements ThingBuilder {

    protected final ThingUID thingUID;
    protected final ThingTypeUID thingTypeUID;
    private @Nullable String label;
    private final List<Channel> channels = new ArrayList<>();
    private @Nullable Configuration configuration;
    private @Nullable ThingUID bridgeUID;
    private @Nullable Map<String, String> properties;
    private @Nullable String location;
    private @Nullable Integer thingTypeVersion;

    protected ThingBuilderImpl(ThingTypeUID thingTypeUID, ThingUID thingUID) {
        this.thingUID = thingUID;
        this.thingTypeUID = thingTypeUID;
    }

    public static ThingBuilder create(ThingTypeUID thingTypeUID, String thingId) {
        return new ThingBuilderImpl(thingTypeUID,
                new ThingUID(thingTypeUID.getBindingId(), thingTypeUID.getId(), thingId));
    }

    public static ThingBuilder create(ThingTypeUID thingTypeUID, ThingUID thingUID) {
        return new ThingBuilderImpl(thingTypeUID, thingUID);
    }

    @Override
    public Thing build() {
        final ThingImpl thing = new ThingImpl(thingTypeUID, thingUID);
        return populate(thing);
    }

    @Override
    public ThingBuilder withLabel(@Nullable String label) {
        this.label = label;
        return this;
    }

    @Override
    public ThingBuilder withChannel(Channel channel) {
        validateChannelUIDs(Collections.singletonList(channel));
        ThingHelper.ensureUniqueChannels(channels, channel);
        channels.add(channel);
        return this;
    }

    @Override
    public ThingBuilder withChannels(Channel... channels) {
        return withChannels(Arrays.asList(channels));
    }

    @Override
    public ThingBuilder withChannels(List<Channel> channels) {
        validateChannelUIDs(channels);
        ThingHelper.ensureUniqueChannels(channels);
        this.channels.clear();
        this.channels.addAll(channels);
        return this;
    }

    @Override
    public ThingBuilder withoutChannel(ChannelUID channelUID) {
        Iterator<Channel> iterator = channels.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getUID().equals(channelUID)) {
                iterator.remove();
                break;
            }
        }
        return this;
    }

    @Override
    public ThingBuilder withoutChannels(Channel... channels) {
        return withoutChannels(Arrays.asList(channels));
    }

    @Override
    public ThingBuilder withoutChannels(List<Channel> channels) {
        for (Channel channel : channels) {
            withoutChannel(channel.getUID());
        }
        return this;
    }

    @Override
    public ThingBuilder withConfiguration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }

    @Override
    public ThingBuilder withBridge(@Nullable ThingUID bridgeUID) {
        this.bridgeUID = bridgeUID;
        return this;
    }

    @Override
    public ThingBuilder withProperties(Map<String, String> properties) {
        this.properties = properties;
        return this;
    }

    @Override
    public ThingBuilder withLocation(@Nullable String location) {
        this.location = location;
        return this;
    }

    @Override
    public ThingBuilder withThingTypeVersion(@Nullable Integer version) {
        this.thingTypeVersion = version;
        return this;
    }

    protected Thing populate(ThingImpl thing) {
        thing.setLabel(label);
        thing.setChannels(channels);
        thing.setConfiguration(configuration);
        thing.setBridgeUID(bridgeUID);
        thing.setThingTypeVersion(thingTypeVersion);
        if (properties != null) {
            for (Map.Entry<String, String> entry : properties.entrySet()) {
                thing.setProperty(entry.getKey(), entry.getValue());
            }
        }
        thing.setLocation(location);
        return thing;
    }

    private void validateChannelUIDs(List<Channel> channels) {
        for (Channel channel : channels) {
            if (!thingUID.equals(channel.getUID().getThingUID())) {
                throw new IllegalArgumentException(
                        "Channel UID '" + channel.getUID() + "' does not match thing UID '" + thingUID + "'");
            }
        }
    }
}
