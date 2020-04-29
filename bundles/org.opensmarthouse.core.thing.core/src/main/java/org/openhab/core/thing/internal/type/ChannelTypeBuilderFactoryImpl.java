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
package org.openhab.core.thing.internal.type;

import org.openhab.core.thing.type.ChannelTypeBuilderFactory;
import org.openhab.core.thing.type.ChannelTypeUID;
import org.openhab.core.thing.type.StateChannelTypeBuilder;
import org.openhab.core.thing.type.TriggerChannelTypeBuilder;

/**
 * Default implementation of {@link ChannelTypeBuilderFactory}.
 *
 * @author Łukas Dywicki - Initial contribution.
 */
public class ChannelTypeBuilderFactoryImpl implements ChannelTypeBuilderFactory {
    @Override
    public StateChannelTypeBuilder state(ChannelTypeUID channelTypeUID, String label, String itemType) {
        return new StateChannelTypeBuilderImpl(channelTypeUID, label, itemType);
    }

    @Override
    public TriggerChannelTypeBuilder trigger(ChannelTypeUID channelTypeUID, String label) {
        return new TriggerChannelTypeBuilderImpl(channelTypeUID, label);
    }
}
