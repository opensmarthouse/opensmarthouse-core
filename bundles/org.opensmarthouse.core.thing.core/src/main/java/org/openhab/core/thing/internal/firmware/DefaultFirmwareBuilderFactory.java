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
package org.openhab.core.thing.internal.firmware;

import org.openhab.core.thing.ThingTypeUID;
import org.openhab.core.thing.binding.firmware.FirmwareBuilder;
import org.openhab.core.thing.binding.firmware.FirmwareBuilderFactory;
import org.osgi.service.component.annotations.Component;

/**
 * Default implementation of {@link FirmwareBuilderFactory}.
 *
 * This type is extracted from incarnations of {@link FirmwareBuilderImpl} which offered a static create method.
 *
 * @author Łukasz Dywicki - Initial contribution.
 */
@Component(service = FirmwareBuilderFactory.class)
public class DefaultFirmwareBuilderFactory implements FirmwareBuilderFactory {

    @Override
    public FirmwareBuilder create(ThingTypeUID thingTypeUID, String firmwareVersion) {
        return new FirmwareBuilderImpl(thingTypeUID, firmwareVersion);
    }
}
