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
package org.opensmarthouse.core.io.transport.serial.purejavacomm.internal;

import org.openhab.core.io.transport.serial.PortInUseException;
import org.openhab.core.io.transport.serial.SerialPort;
import org.openhab.core.io.transport.serial.SerialPortIdentifier;

import purejavacomm.CommPortIdentifier;

/**
 * Serial port identifier bound to library.
 * 
 * @author Łukasz Dywicki - initial contribution from ConnectorIO
 */
public class PureJavaCommSerialPortIdentifier implements SerialPortIdentifier {

    private final CommPortIdentifier identifier;

    public PureJavaCommSerialPortIdentifier(CommPortIdentifier identifier) {
        this.identifier = identifier;
    }

    @Override
    public String getName() {
        return identifier.getName();
    }

    @Override
    public SerialPort open(String owner, int timeout) throws PortInUseException {
        try {
            return new PureJavaCommSerialPort((purejavacomm.SerialPort) identifier.open(owner, timeout));
        } catch (purejavacomm.PortInUseException e) {
            PortInUseException exception = new PortInUseException(e);
            exception.setStackTrace(e.getStackTrace());
            throw exception;
        }
    }

    @Override
    public boolean isCurrentlyOwned() {
        return identifier.isCurrentlyOwned();
    }

    @Override
    public String getCurrentOwner() {
        return identifier.getCurrentOwner();
    }

    @Override
    public String toString() {
        return getName() + " (pure java comm)";
    }
}
