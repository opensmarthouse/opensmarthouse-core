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
package org.openhab.core.thing.internal.profiles;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.openhab.core.thing.profiles.ProfileType;
import org.openhab.core.thing.profiles.ProfileTypeUID;
import org.openhab.core.thing.profiles.StateProfileType;
import org.openhab.core.thing.profiles.TriggerProfileType;
import org.openhab.core.thing.type.ChannelTypeUID;

/**
 * Builder for {@link ProfileType} instances.
 *
 * It can be used to obtain instances instead of implementing any of the interfaces derived from {@link ProfileType}.
 *
 * @author Simon Kaufmann - Initial contribution
 *
 * @param <T> the concrete {@link ProfileType} sub-interface.
 */
@NonNullByDefault
public abstract class ProfileTypeBuilderImpl<T extends ProfileType> {

    protected final ProfileTypeUID profileTypeUID;
    protected final Collection<String> supportedItemTypes = new HashSet<>();
    protected final Collection<String> supportedItemTypesOfChannel = new HashSet<>();
    protected final Collection<ChannelTypeUID> supportedChannelTypeUIDs = new HashSet<>();
    protected final String label;

    ProfileTypeBuilderImpl(ProfileTypeUID profileTypeUID, String label) {
        this.profileTypeUID = profileTypeUID;
        this.label = label;
    }

    public ProfileTypeBuilderImpl<T> withSupportedItemTypes(String... itemType) {
        supportedItemTypes.addAll(Arrays.asList(itemType));
        return this;
    }

    public ProfileTypeBuilderImpl<T> withSupportedItemTypes(Collection<String> itemTypes) {
        supportedItemTypes.addAll(itemTypes);
        return this;
    }

    public ProfileTypeBuilderImpl<T> withSupportedChannelTypeUIDs(ChannelTypeUID... channelTypeUIDs) {
        supportedChannelTypeUIDs.addAll(Arrays.asList(channelTypeUIDs));
        return this;
    }

    public ProfileTypeBuilderImpl<T> withSupportedChannelTypeUIDs(Collection<ChannelTypeUID> channelTypeUIDs) {
        supportedChannelTypeUIDs.addAll(channelTypeUIDs);
        return this;
    }

    public ProfileTypeBuilderImpl<T> withSupportedItemTypesOfChannel(String... supportedItemTypesOfChannel) {
        this.supportedItemTypesOfChannel.addAll(Arrays.asList(supportedItemTypesOfChannel));
        return this;
    }

    public ProfileTypeBuilderImpl<T> withSupportedItemTypesOfChannel(Collection<String> supportedItemTypesOfChannel) {
        this.supportedItemTypesOfChannel.addAll(supportedItemTypesOfChannel);
        return this;
    }

    static class StateProfileTypeBuilder extends ProfileTypeBuilderImpl<StateProfileType> {

        public StateProfileTypeBuilder(ProfileTypeUID profileTypeUID, String label) {
            super(profileTypeUID, label);
        }

        public StateProfileType build() {
            return new StateProfileTypeImpl(profileTypeUID, label, supportedItemTypes, supportedItemTypesOfChannel);
        }
    }

    static class TriggerProfileTypeBuilder extends ProfileTypeBuilderImpl<TriggerProfileType> {

        public TriggerProfileTypeBuilder(ProfileTypeUID profileTypeUID, String label) {
            super(profileTypeUID, label);
        }

        public TriggerProfileType build() {
            return new TriggerProfileTypeImpl(profileTypeUID, label, supportedItemTypes, supportedChannelTypeUIDs);
        }
    }

}
