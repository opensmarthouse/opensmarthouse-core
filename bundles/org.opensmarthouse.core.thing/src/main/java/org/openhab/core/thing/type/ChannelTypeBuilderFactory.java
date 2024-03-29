/**
 * Copyright (c) 2020-2021 Contributors to the OpenSmartHouse project
 * Copyright (c) 2010-2021 Contributors to the openHAB project
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
package org.openhab.core.thing.type;

import org.eclipse.jdt.annotation.NonNullByDefault;

/**
 * Interface for {@link ChannelTypeBuilder} supplier.
 *
 * Extracted from {@link ChannelTypeBuilder} static methods.
 *
 * @author Łukas Dywicki - Initial contribution
 */
@NonNullByDefault
public interface ChannelTypeBuilderFactory {

    /**
     * Create an instance of a ChannelTypeBuilder for {@link ChannelType}s of type STATE
     *
     * @param channelTypeUID UID of the ChannelType
     * @param label Label for the ChannelType
     * @param itemType ItemType that can be linked to the ChannelType
     * @return ChannelTypeBuilder for {@link ChannelType}s of type STATE
     */
    StateChannelTypeBuilder state(ChannelTypeUID channelTypeUID, String label, String itemType);

    /**
     * Create an instance of a ChannelTypeBuilder for {@link ChannelType}s of type TRIGGER
     *
     * @param channelTypeUID UID of the ChannelType
     * @param label Label for the ChannelType
     * @return ChannelTypeBuilder for {@link ChannelType}s of type TRGIGGER
     */
    TriggerChannelTypeBuilder trigger(ChannelTypeUID channelTypeUID, String label);
}
