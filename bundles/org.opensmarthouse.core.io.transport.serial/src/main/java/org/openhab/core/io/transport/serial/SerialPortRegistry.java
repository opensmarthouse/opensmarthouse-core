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
package org.openhab.core.io.transport.serial;

import java.net.URI;
import java.util.Collection;

import org.eclipse.jdt.annotation.NonNullByDefault;

/**
 * Registers all {@link SerialPortProvider}s which can be accessed here.
 *
 * @author Matthias Steigenberger - Initial contribution
 * @author Markus Rathgeb - Respect the possible failure of port identifier creation
 * @author Chris Jackson - Split out interface an implementation
 */
@NonNullByDefault
public interface SerialPortRegistry {
    /**
     * Gets the best applicable {@link SerialPortProvider} for the given <code>portName</code>
     *
     * @param portName The port's name.
     * @return all possible {@link SerialPortProvider}. If no provider is available an empty collection is returned
     */
    public Collection<SerialPortProvider> getPortProvidersForPortName(URI portName);

    /**
     * Gets the Collection of {@link SerialPortProvider}
     * 
     * @return Collection of {@link SerialPortProvider}
     */
    public Collection<SerialPortProvider> getPortCreators();
}
