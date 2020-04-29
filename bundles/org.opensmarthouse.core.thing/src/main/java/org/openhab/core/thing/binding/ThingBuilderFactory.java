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
package org.openhab.core.thing.binding;

import org.openhab.core.thing.ThingTypeUID;
import org.openhab.core.thing.ThingUID;
import org.openhab.core.thing.binding.builder.BridgeBuilder;
import org.openhab.core.thing.binding.builder.ThingBuilder;

/**
 * Type which allows to construct a {@link ThingBuilder} or a {@link BridgeBuilder} for further operations related to
 * modelling of these.
 *
 * @author Łuaksz Dywicki - Initial contribution.
 */
public interface ThingBuilderFactory {

    ThingBuilder createThing(ThingTypeUID thingTypeUID, ThingUID uid);

    BridgeBuilder createBridge(ThingTypeUID thingTypeUID, ThingUID uid);

}
