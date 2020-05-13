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
package org.openhab.core.thing;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.openhab.core.thing.type.ChannelKind;

/**
 * A simple utility to mock {@link Channel} instance.
 *
 * @author Łukasz Dywicki - Initial contribution.
 */
public class ChannelTestHelper {
    public static Channel create(ChannelUID channelUID, String itemType) {
        Channel channel = mock(Channel.class);
        when(channel.getUID()).thenReturn(channelUID);
        when(channel.getAcceptedItemType()).thenReturn(itemType);
        // this is default kind for a channel
        when(channel.getKind()).thenReturn(ChannelKind.STATE);
        return channel;
    }
}
