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
package org.openhab.core.config.core.dto;

/**
 * This is a data transfer object that is used to serialize device parameter options
 *
 * @author Chris Jackson - Initial contribution
 */
public class ParameterDevicePropertyDTO {

    public String name;
    public String value;

    public ParameterDevicePropertyDTO() {
    }

    public ParameterDevicePropertyDTO(String name, String value) {
        this.name = name;
        this.value = value;
    }
}
