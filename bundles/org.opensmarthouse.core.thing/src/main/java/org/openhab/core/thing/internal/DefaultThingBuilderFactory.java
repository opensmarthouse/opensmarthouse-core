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
package org.openhab.core.thing.internal;

import org.openhab.core.thing.ThingTypeUID;
import org.openhab.core.thing.ThingUID;
import org.openhab.core.thing.binding.ThingBuilderFactory;
import org.openhab.core.thing.binding.builder.BridgeBuilder;
import org.openhab.core.thing.binding.builder.ThingBuilder;
import org.osgi.service.component.annotations.Component;

/**
 * Default implementation of {@link ThingBuilderFactory}.
 *
 * @author Łukasz Dywicki - Initial contribution
 */
@Component(service = ThingBuilderFactory.class)
public class DefaultThingBuilderFactory implements ThingBuilderFactory {

  @Override
  public ThingBuilder createThing(ThingTypeUID thingTypeUID, ThingUID uid) {
    return ThingBuilder.create(thingTypeUID, uid);
  }

  @Override
  public BridgeBuilder createBridge(ThingTypeUID thingTypeUID, ThingUID uid) {
    return BridgeBuilder.create(thingTypeUID, uid);
  }
}
