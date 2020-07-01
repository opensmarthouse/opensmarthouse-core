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
package org.openhab.core.config.core;

/**
 * The {@link ParameterDeviceProperty} specifies one option of a device configuration parameter. It is used by the
 * binding to map the configuration parameter to the physical device.
 * <p>
 * A {@link ConfigDescriptionParameter} instance can contain a list of {@link ParameterDeviceProperty}s to define the
 * link to the device.
 *
 * @author Chris Jackson - Initial contribution
 */
public class ParameterDeviceProperty {

    private String name;
    private String value;

    /**
     * Default constructor for deserialization e.g. by Gson.
     */
    protected ParameterDeviceProperty() {
    }

    /**
     * Creates a Device Property given the name and value
     * 
     * @param name the device property name
     * @param value the device property value
     */
    public ParameterDeviceProperty(String name, String value) {
        this.name = name;
        this.value = value;
    }

    /**
     * Gets the property name
     * 
     * @return the property name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the property value
     * 
     * @return the property value
     */
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ParameterDeviceProperty [name=\"" + name + "\", value=\"" + value + "\"]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ParameterDeviceProperty other = (ParameterDeviceProperty) obj;
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        if (value == null) {
            if (other.value != null) {
                return false;
            }
        } else if (!value.equals(other.value)) {
            return false;
        }
        return true;
    }

}
