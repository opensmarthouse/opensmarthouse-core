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
import java.util.Map;
import java.util.Set;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.config.core.Configuration;
import org.openhab.core.thing.Channel;
import org.openhab.core.thing.ChannelUID;
import org.openhab.core.thing.binding.builder.ChannelBuilder;
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
 * @author Łukasz Dywicki - Separation of interface from implementation.
 */
@NonNullByDefault
public class ChannelBuilderImpl implements ChannelBuilder {

    private final ChannelUID channelUID;
    private @Nullable String acceptedItemType;
    private ChannelKind kind;
    private @Nullable Configuration configuration;
    private Set<String> defaultTags;
    private @Nullable Map<String, String> properties;
    private @Nullable String label;
    private @Nullable String description;
    private @Nullable ChannelTypeUID channelTypeUID;
    private @Nullable AutoUpdatePolicy autoUpdatePolicy;

    /**
     * Creates a {@link ChannelBuilder} for the given {@link ChannelUID}.
     * 
     * @param channelUID the {@link ChannelUID}
     * @return channel builder
     */
    public static ChannelBuilder create(ChannelUID channelUID) {
        return new ChannelBuilderImpl(channelUID, null, new HashSet<>());
    }

    ChannelBuilderImpl(ChannelUID channelUID, @Nullable String acceptedItemType, Set<String> defaultTags) {
        this.channelUID = channelUID;
        this.acceptedItemType = acceptedItemType;
        this.defaultTags = defaultTags;
        this.kind = ChannelKind.STATE;
    }

    /**
     * Appends the channel type to the channel to build
     *
     * @param channelTypeUID channel type UID
     * @return channel builder
     */
    @Override
    public ChannelBuilder withType(@Nullable ChannelTypeUID channelTypeUID) {
        this.channelTypeUID = channelTypeUID;
        return this;
    }

    /**
     * Appends a configuration to the channel to build.
     *
     * @param configuration configuration
     * @return channel builder
     */
    @Override
    public ChannelBuilder withConfiguration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * Adds properties to the channel
     *
     * @param properties properties to add
     * @return channel builder
     */
    @Override
    public ChannelBuilder withProperties(Map<String, String> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Sets the channel label. This allows overriding of the default label set in the {@link ChannelType}
     *
     * @param label the channel label to override the label set in the {@link ChannelType}
     * @return channel builder
     */
    @Override
    public ChannelBuilder withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Sets the channel label. This allows overriding of the default label set in the {@link ChannelType}
     *
     * @param label the channel label to override the label set in the {@link ChannelType}
     * @return channel builder
     */
    @Override
    public ChannelBuilder withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Appends default tags to the channel to build.
     *
     * @param defaultTags default tags
     * @return channel builder
     */
    @Override
    public ChannelBuilder withDefaultTags(Set<String> defaultTags) {
        this.defaultTags = defaultTags;
        return this;
    }

    /**
     * Sets the kind of the channel.
     *
     * @param kind kind.
     * @return channel builder
     */
    @Override
    public ChannelBuilder withKind(ChannelKind kind) {
        if (kind == null) {
            throw new IllegalArgumentException("kind must not be null");
        }

        this.kind = kind;
        return this;
    }

    @Override
    public ChannelBuilder withAcceptedItemType(@Nullable String acceptedItemType) {
        this.acceptedItemType = acceptedItemType;
        return this;
    }

    /**
     * Sets the auto update policy. See {@link AutoUpdatePolicy} for details.
     *
     * @param policy the auto update policy to use
     * @return channel builder
     */
    @Override
    public ChannelBuilder withAutoUpdatePolicy(@Nullable AutoUpdatePolicy policy) {
        this.autoUpdatePolicy = policy;
        return this;
    }

    /**
     * Builds and returns the channel.
     *
     * @return channel
     */
    @Override
    public Channel build() {
        return new Channel(channelUID, channelTypeUID, acceptedItemType, kind, configuration, defaultTags, properties,
                label, description, autoUpdatePolicy);
    }

}
