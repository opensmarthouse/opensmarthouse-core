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

import java.util.HashSet;
import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.thing.Channel;
import org.openhab.core.thing.ChannelUID;
import org.openhab.core.thing.binding.builder.ChannelBuilder;
import org.openhab.core.thing.binding.builder.ChannelBuilderFactory;
import org.osgi.service.component.annotations.Component;

/**
 * Default implementation of channel builder factory.
 *
 * @author Łukas Dywicki - Initial contribution.
 */
@NonNullByDefault
@Component(service = ChannelBuilderFactory.class)
public class ChannelBuilderFactoryImpl implements ChannelBuilderFactory {

    /**
     * Creates a channel builder for the given channel UID and item type.
     *
     * @param channelUID channel UID
     * @param acceptedItemType item type that is accepted by this channel
     * @return channel builder
     */
    @Override
    public ChannelBuilder create(ChannelUID channelUID, @Nullable String acceptedItemType) {
        return new ChannelBuilderImpl(channelUID, acceptedItemType, new HashSet<>());
    }

    /**
     * Creates a channel builder from the given channel.
     *
     * @param channel the channel to be changed
     * @return channel builder
     */
    @Override
    public ChannelBuilder create(Channel channel) {
        ChannelBuilder channelBuilder = create(channel.getUID(), channel.getAcceptedItemType())
                .withConfiguration(channel.getConfiguration()).withDefaultTags(channel.getDefaultTags())
                .withKind(channel.getKind()).withProperties(channel.getProperties())
                .withType(channel.getChannelTypeUID());
        String label = channel.getLabel();
        if (label != null) {
            channelBuilder.withLabel(label);
        }
        String description = channel.getDescription();
        if (description != null) {
            channelBuilder.withDescription(description);
        }
        return channelBuilder;
    }

}
