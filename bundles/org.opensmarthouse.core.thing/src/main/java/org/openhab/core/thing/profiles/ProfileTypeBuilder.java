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
package org.openhab.core.thing.profiles;

import java.util.Collection;
import org.openhab.core.thing.type.ChannelTypeUID;

/**
 * Builder for {@link ProfileType} instances.
 *
 * It can be used to obtain instances instead of implementing any of the interfaces derived from {@link ProfileType}.
 *
 * @author Simon Kaufmann - Initial contribution
 * @author Łukasz Dywicki - Refactoring to interface, extraction of {@link ProfileTypeBuilderFactory}.
 *
 * @param <T> the concrete {@link ProfileType} sub-interface.
 */
public interface ProfileTypeBuilder<T extends ProfileType> {

    /**
     * Declare that the given item type(s) are supported by a profile of this type.
     *
     * @param itemType
     * @return the builder itself
     */
    ProfileTypeBuilder<T> withSupportedItemTypes(String... itemType);

    /**
     * Declare that the given item type(s) are supported by a profile of this type.
     *
     * @param itemTypes
     * @return the builder itself
     */
    ProfileTypeBuilder<T> withSupportedItemTypes(Collection<String> itemTypes);

    /**
     * Declare that the given channel type(s) are supported by a profile of this type.
     *
     * @param channelTypeUIDs
     * @return the builder itself
     */
    ProfileTypeBuilder<T> withSupportedChannelTypeUIDs(ChannelTypeUID... channelTypeUIDs);

    /**
     * Declare that the given channel type(s) are supported by a profile of this type.
     *
     * @param channelTypeUIDs
     * @return the builder itself
     */
    ProfileTypeBuilder<T> withSupportedChannelTypeUIDs(Collection<ChannelTypeUID> channelTypeUIDs);

    /**
     * Declare that channels with these item type(s) are compatible with profiles of this type.
     *
     * @param supportedItemTypesOfChannel item types on channel to which this profile type is compatible with
     * @return the builder itself
     */
    ProfileTypeBuilder<T> withSupportedItemTypesOfChannel(String... supportedItemTypesOfChannel);

    /**
     * Declare that channels with these item type(s) are compatible with profiles of this type.
     *
     * @param supportedItemTypesOfChannel item types on channel to which this profile type is compatible with
     * @return the builder itself
     */
    ProfileTypeBuilder<T> withSupportedItemTypesOfChannel(Collection<String> supportedItemTypesOfChannel);

    /**
     * Create a profile type instance with the previously given parameters.
     *
     * @return the according subtype of {@link ProfileType}
     */
    T build();

}
