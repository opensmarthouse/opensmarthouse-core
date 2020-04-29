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
package org.openhab.core.thing.binding.firmware;

import org.openhab.core.thing.ThingTypeUID;

/**
 * Factory type for {@link FirmwareBuilder} instances.
 *
 * @author Łuaksz Dywicki - Initial contribution.
 */
public interface FirmwareBuilderFactory {

    /**
     * Creates new firmware builder instance.
     *
     * @param thingTypeUID Thing type.
     * @param firmwareVersion Firmware version.
     * @return Firmware builder.
     */
    FirmwareBuilder create(ThingTypeUID thingTypeUID, String firmwareVersion);

}
