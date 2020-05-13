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

import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.config.core.Configuration;
import org.openhab.core.thing.Channel;
import org.openhab.core.thing.binding.builder.ChannelBuilder;
import org.openhab.core.thing.type.AutoUpdatePolicy;
import org.openhab.core.thing.type.ChannelKind;
import org.openhab.core.thing.type.ChannelTypeUID;

/**
 * A delegate which finds a channel builder at runtime.
 * For compatibility reasons only.
 *
 * @author Łukasz Dywicki - Initial contribution.
 */
public class ChannelBuilderDelegate implements ChannelBuilder {

    private final ChannelBuilder channelBuilder;
    private final Consumer<ChannelBuilder> closeable;

    public ChannelBuilderDelegate(ChannelBuilder channelBuilder, Consumer<ChannelBuilder> closeable) {
        this.channelBuilder = channelBuilder;
        this.closeable = closeable;
    }

    @Override
    public ChannelBuilder withType(@Nullable ChannelTypeUID channelTypeUID) {
        return channelBuilder.withType(channelTypeUID);
    }

    @Override
    public ChannelBuilder withConfiguration(Configuration configuration) {
        return channelBuilder.withConfiguration(configuration);
    }

    @Override
    public ChannelBuilder withProperties(Map<String, String> properties) {
        return channelBuilder.withProperties(properties);
    }

    @Override
    public ChannelBuilder withLabel(String label) {
        return channelBuilder.withLabel(label);
    }

    @Override
    public ChannelBuilder withDescription(String description) {
        return channelBuilder.withDescription(description);
    }

    @Override
    public ChannelBuilder withDefaultTags(Set<String> defaultTags) {
        return channelBuilder.withDefaultTags(defaultTags);
    }

    @Override
    public ChannelBuilder withKind(ChannelKind kind) {
        return channelBuilder.withKind(kind);
    }

    @Override
    public ChannelBuilder withAutoUpdatePolicy(@Nullable AutoUpdatePolicy policy) {
        return channelBuilder.withAutoUpdatePolicy(policy);
    }

    @Override
    public Channel build() {
        try {
            return channelBuilder.build();
        } finally {
            closeable.accept(channelBuilder);
        }
    }

}
