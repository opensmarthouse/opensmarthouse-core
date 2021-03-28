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
package org.openhab.core.config.core.status;

/**
 * The {@link ConfigStatusCallback} interface is a callback interface to propagate a new configuration status for an
 * entity and to get the current {@link ConfigStatusMessage} from the persistence.
 *
 * @author Thomas Höfer - Initial contribution
 * @author Chris Jackson - Added persistence methods
 */
public interface ConfigStatusCallback {

    /**
     * Based on the given {@link ConfigStatusSource} this operation propagates a new configuration status for an entity
     * after its configuration has been updated.
     *
     * @param configStatusSource the source of the configuration status
     */
    void configUpdated(ConfigStatusSource configStatusSource);

    /**
     * Gets the persisted {@link ConfigStatusInfo} for the entity. The {@link ConfigStatusService} will
     * persist {@link ConfigStatusMessage} for all device configuration parameters and this method allows the binding to
     * read back the persisted state as required.
     * <p>
     * One example of where this may be required is during binding startup where the binding may want to know if
     * configuration is currently {@link ConfigStatusMessage.Type#PENDING} in which case it may need to initiate an
     * update of the parameter with the device.
     * 
     * @param configStatusSource the source of the configuration status
     * @return the persisted {@link ConfigStatusInfo} for the entity
     */
    default ConfigStatusInfo getPersistedConfigStatusInfo(final ConfigStatusSource configStatusSource) {
        return null;
    }

    /**
     * Removes any persisted {@link ConfigStatusInfo} for the entity.
     * 
     * @param configStatusSource the source of the configuration status
     */
    default void removePersistedConfigStatusInfo(final ConfigStatusSource configStatusSource) {
    }
}
