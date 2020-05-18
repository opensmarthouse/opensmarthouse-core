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
package org.openhab.core.thing.compat;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.function.Function;
import java.util.function.Supplier;

import org.eclipse.jdt.annotation.Nullable;
import org.mockito.invocation.InvocationOnMock;
import org.openhab.core.test.mockito.MapArgument;
import org.openhab.core.test.mockito.MapBuilderToMock;
import org.openhab.core.thing.Channel;
import org.openhab.core.thing.ChannelUID;
import org.openhab.core.thing.binding.builder.ChannelBuilder;
import org.openhab.core.thing.binding.builder.ChannelBuilderFactory;
import org.openhab.core.thing.type.ChannelKind;

/**
 * A mock backed {@link ChannelBuilderFactory}.
 *
 * @author Łukasz Dywicki - Initial contribution.
 */
public class ChannelBuilderFactoryDelegate implements ChannelBuilderFactory {

    @Override
    public ChannelBuilder create(ChannelUID channelUID, @Nullable String acceptedItemType) {
        ChannelBuilder builder = mock(ChannelBuilder.class);
        Channel channel = mock(Channel.class);

        when(channel.getUID()).thenReturn(channelUID);
        when(channel.getAcceptedItemType()).thenReturn(acceptedItemType);
        setup(builder, channel);
        when(builder.build()).thenReturn(channel);
        return builder;
    }

    @Override
    public ChannelBuilder create(Channel channel) {
        ChannelBuilder builder = mock(ChannelBuilder.class);
        Channel mock = mock(Channel.class);

        // defaults inherited from template channel
        when(mock.getConfiguration()).thenReturn(channel.getConfiguration());
        when(mock.getLabel()).thenReturn(channel.getLabel());
        when(mock.getDescription()).thenReturn(channel.getDescription());
        when(mock.getProperties()).thenReturn(channel.getProperties());
        when(mock.getChannelTypeUID()).thenReturn(channel.getChannelTypeUID());
        when(mock.getDefaultTags()).thenReturn(channel.getDefaultTags());
        when(mock.getKind()).thenReturn(channel.getKind());
        when(mock.getAutoUpdatePolicy()).thenReturn(channel.getAutoUpdatePolicy());

        setup(builder, mock);
        return builder;
    }

    private void setup(ChannelBuilder builder, Channel channel) {
        // setup default kind for a channel
        when(channel.getKind()).thenReturn(ChannelKind.STATE);

        builder(builder, () -> builder.withConfiguration(any()), channel::getConfiguration, new MapArgument<>());
        builder(builder, () -> builder.withLabel(any()), channel::getLabel, new MapArgument<>());
        builder(builder, () -> builder.withDescription(any()), channel::getDescription, new MapArgument<>());
        builder(builder, () -> builder.withProperties(any()), channel::getProperties, new MapArgument<>());
        builder(builder, () -> builder.withType(any()), channel::getChannelTypeUID, new MapArgument<>());
        builder(builder, () -> builder.withDefaultTags(any()), channel::getDefaultTags, new MapArgument<>());
        builder(builder, () -> builder.withKind(any()), channel::getKind, new MapArgument<>());
        builder(builder, () -> builder.withAutoUpdatePolicy(any()), channel::getAutoUpdatePolicy, new MapArgument<>());
    }

    private <T, X> void builder(T mock, Supplier<T> builderCall, Supplier<X> getterCall,
            Function<InvocationOnMock, X> returnValue) {
        when(builderCall.get()).thenAnswer(new MapBuilderToMock<>(mock, getterCall, returnValue));
    }

}
