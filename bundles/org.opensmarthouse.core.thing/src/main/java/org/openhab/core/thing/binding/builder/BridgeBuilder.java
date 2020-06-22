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

import java.util.List;
import java.util.Map;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.config.core.Configuration;
import org.openhab.core.thing.Bridge;
import org.openhab.core.thing.Channel;
import org.openhab.core.thing.ChannelUID;
import org.openhab.core.thing.ThingUID;

/**
 * This class allows the easy construction of a {@link Bridge} instance using the builder pattern.
 *
 * @author Dennis Nobel - Initial contribution
 * @author Kai Kreuzer - Refactoring to make BridgeBuilder a subclass of ThingBuilder
 * @author Markus Rathgeb - Override methods to return BridgeBuidler instead of ThingBuidler
 * @author Łukasz Dywicki - Refactoring to interface
 * @author Chris Jackson - Added thing type version support
 */
@NonNullByDefault
public interface BridgeBuilder extends ThingBuilder {

    @Override
    Bridge build();

    @Override
    BridgeBuilder withLabel(@Nullable String label);

    @Override
    BridgeBuilder withChannel(Channel channel);

    @Override
    BridgeBuilder withChannels(Channel... channels);

    @Override
    BridgeBuilder withChannels(List<Channel> channels);

    @Override
    BridgeBuilder withoutChannel(ChannelUID channelUID);

    @Override
    BridgeBuilder withoutChannels(Channel... channels);

    @Override
    BridgeBuilder withoutChannels(List<Channel> channels);

    @Override
    BridgeBuilder withConfiguration(Configuration thingConfiguration);

    @Override
    BridgeBuilder withBridge(@Nullable ThingUID bridgeUID);

    @Override
    BridgeBuilder withProperties(Map<String, String> properties);

    @Override
    BridgeBuilder withLocation(@Nullable String location);

    @Override
    BridgeBuilder withThingTypeVersion(@Nullable Integer version);

}
