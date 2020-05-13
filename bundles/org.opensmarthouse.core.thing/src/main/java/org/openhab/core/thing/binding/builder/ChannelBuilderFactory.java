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

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.thing.Channel;
import org.openhab.core.thing.ChannelUID;

/**
 * Channel builder factory.
 * Extracted from {@link ChannelBuilder} class to a new interface.
 *
 * @author Łukas Dywicki - Initial contribution.
 */
@NonNullByDefault
public interface ChannelBuilderFactory {

    /**
     * Creates a channel builder for the given channel UID and item type.
     *
     * @param channelUID channel UID
     * @param acceptedItemType item type that is accepted by this channel
     * @return channel builder
     */
    ChannelBuilder create(ChannelUID channelUID, @Nullable String acceptedItemType);

    /**
     * Creates a channel builder from the given channel.
     *
     * @param channel the channel to be changed
     * @return channel builder
     */
    ChannelBuilder create(Channel channel);

}
