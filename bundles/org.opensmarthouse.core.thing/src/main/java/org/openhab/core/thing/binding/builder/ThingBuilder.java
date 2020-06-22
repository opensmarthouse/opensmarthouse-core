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
import org.openhab.core.thing.Channel;
import org.openhab.core.thing.ChannelUID;
import org.openhab.core.thing.Thing;
import org.openhab.core.thing.ThingUID;

/**
 * This class allows the easy construction of a {@link Thing} instance using the builder pattern.
 *
 * @author Dennis Nobel - Initial contribution
 * @author Kai Kreuzer - Refactoring to make BridgeBuilder a subclass
 * @author Łukasz Dywicki - Refactoring to interface
 * @author Chris Jackson - Added thing type version
 */
@NonNullByDefault
public interface ThingBuilder {

    Thing build();

    ThingBuilder withLabel(@Nullable String label);

    ThingBuilder withChannel(Channel channel);

    ThingBuilder withChannels(Channel... channels);

    ThingBuilder withChannels(List<Channel> channels);

    ThingBuilder withoutChannel(ChannelUID channelUID);

    ThingBuilder withoutChannels(Channel... channels);

    ThingBuilder withoutChannels(List<Channel> channels);

    ThingBuilder withConfiguration(Configuration configuration);

    ThingBuilder withBridge(@Nullable ThingUID bridgeUID);

    ThingBuilder withProperties(Map<String, String> properties);

    ThingBuilder withLocation(@Nullable String location);

    ThingBuilder withThingTypeVersion(@Nullable Integer version);

}
