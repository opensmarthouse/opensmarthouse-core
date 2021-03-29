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
package org.openhab.core.thing.dto;

import java.util.List;

/**
 * This is a data transfer object that is used to serialize stripped thing types.
 * Stripped thing types exclude the parameters, configDescription and channels
 *
 * @author Miki Jankov - Initial contribution
 * @author Chris Jackson - Added version
 */
public class StrippedThingTypeDTO {

    public String UID;
    public Integer version;
    public String label;
    public String description;
    public String category;
    public boolean listed;
    public List<String> supportedBridgeTypeUIDs;
    public boolean bridge;

    public StrippedThingTypeDTO() {
    }

    /**
     * @deprecated Provided for backward compatibility with OH3
     */
    @Deprecated
    public StrippedThingTypeDTO(String UID, String label, String description, String category, boolean listed,
            List<String> supportedBridgeTypeUIDs, boolean bridge) {
        this.UID = UID;
        this.label = label;
        this.description = description;
        this.category = category;
        this.listed = listed;
        this.supportedBridgeTypeUIDs = supportedBridgeTypeUIDs;
        this.bridge = bridge;
    }

    public StrippedThingTypeDTO(String UID, Integer version, String label, String description, String category,
            boolean listed, List<String> supportedBridgeTypeUIDs, boolean bridge) {
        this.UID = UID;
        this.version = version;
        this.label = label;
        this.description = description;
        this.category = category;
        this.listed = listed;
        this.supportedBridgeTypeUIDs = supportedBridgeTypeUIDs;
        this.bridge = bridge;
    }
}
