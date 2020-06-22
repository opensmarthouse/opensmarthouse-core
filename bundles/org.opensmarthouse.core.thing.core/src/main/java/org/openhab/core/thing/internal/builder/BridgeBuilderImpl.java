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

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.config.core.Configuration;
import org.openhab.core.thing.Bridge;
import org.openhab.core.thing.Channel;
import org.openhab.core.thing.ChannelUID;
import org.openhab.core.thing.ThingTypeUID;
import org.openhab.core.thing.ThingUID;
import org.openhab.core.thing.binding.builder.BridgeBuilder;
import org.openhab.core.thing.internal.BridgeImpl;

/**
 * Default implementation of a bridge builder concept.
 *
 * @author Łukasz Dywicki - Initial contribution
 * @author Chris Jackson - Added thing type version support
 */
@NonNullByDefault
public class BridgeBuilderImpl extends ThingBuilderImpl implements BridgeBuilder {

    private BridgeBuilderImpl(ThingTypeUID thingTypeUID, ThingUID thingUID) {
        super(thingTypeUID, thingUID);
    }

    public static BridgeBuilder create(ThingTypeUID thingTypeUID, String bridgeId) {
        return new BridgeBuilderImpl(thingTypeUID,
                new ThingUID(thingTypeUID.getBindingId(), thingTypeUID.getId(), bridgeId));
    }

    public static BridgeBuilder create(ThingTypeUID thingTypeUID, ThingUID thingUID) {
        return new BridgeBuilderImpl(thingTypeUID, thingUID);
    }

    @Override
    public Bridge build() {
        final BridgeImpl bridge = new BridgeImpl(thingTypeUID, thingUID);
        return (Bridge) super.populate(bridge);
    }

    @Override
    public BridgeBuilder withLabel(@Nullable String label) {
        return (BridgeBuilder) super.withLabel(label);
    }

    @Override
    public BridgeBuilder withChannel(Channel channel) {
        return (BridgeBuilder) super.withChannel(channel);
    }

    @Override
    public BridgeBuilder withChannels(Channel... channels) {
        return (BridgeBuilder) super.withChannels(channels);
    }

    @Override
    public BridgeBuilder withChannels(List<Channel> channels) {
        return (BridgeBuilder) super.withChannels(channels);
    }

    @Override
    public BridgeBuilder withoutChannel(ChannelUID channelUID) {
        return (BridgeBuilder) super.withoutChannel(channelUID);
    }

    @Override
    public BridgeBuilder withoutChannels(Channel... channels) {
        return (BridgeBuilder) super.withoutChannels(channels);
    }

    @Override
    public BridgeBuilder withoutChannels(List<Channel> channels) {
        return (BridgeBuilder) super.withoutChannels(channels);
    }

    @Override
    public BridgeBuilder withConfiguration(Configuration thingConfiguration) {
        return (BridgeBuilder) super.withConfiguration(thingConfiguration);
    }

    @Override
    public BridgeBuilder withBridge(@Nullable ThingUID bridgeUID) {
        return (BridgeBuilder) super.withBridge(bridgeUID);
    }

    @Override
    public BridgeBuilder withProperties(Map<String, String> properties) {
        return (BridgeBuilder) super.withProperties(properties);
    }

    @Override
    public BridgeBuilder withLocation(@Nullable String location) {
        return (BridgeBuilder) super.withLocation(location);
    }

    @Override
    public BridgeBuilder withThingTypeVersion(@Nullable Integer version) {
        return (BridgeBuilder) super.withThingTypeVersion(version);
    }

}
