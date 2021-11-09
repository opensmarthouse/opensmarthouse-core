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
package org.openhab.core.config.discovery.usbserial;

import org.eclipse.jdt.annotation.NonNullByDefault;

/**
 * Listener interface for {@link UsbSerialDiscovery}s.
 *
 * @author Henning Sudbrock - Initial contribution
 */
@NonNullByDefault
public interface UsbSerialDiscoveryListener {

    /**
     * Called when a new serial port provided by a USB device is discovered.
     */
    void usbSerialDeviceDiscovered(UsbSerialDeviceInformation usbSerialDeviceInformation);

    /**
     * Called when a serial port provided by a USB device has been removed.
     */
    void usbSerialDeviceRemoved(UsbSerialDeviceInformation usbSerialDeviceInformation);
}
