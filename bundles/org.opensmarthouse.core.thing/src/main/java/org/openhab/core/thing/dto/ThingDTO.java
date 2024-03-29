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
import java.util.Map;

/**
 * This is a data transfer object that is used to serialize things.
 *
 * @author Dennis Nobel - Initial contribution
 * @author Thomas Höfer - Added thing and thing type properties
 * @author Stefan Bußweiler - Added new thing status handling
 * @author Simon Kaufmann - Added label
 * @author Chris Jackson - Added thing type version
 */
public class ThingDTO {

    public String label;
    public String bridgeUID;
    public Map<String, Object> configuration;
    public Map<String, String> properties;
    public String UID;
    public String thingTypeUID;
    public List<ChannelDTO> channels;
    public String location;
    public Integer thingTypeVersion;

    public ThingDTO() {
    }

    /**
     * 
     * @param thingTypeUID
     * @param UID
     * @param label
     * @param bridgeUID
     * @param channels
     * @param configuration
     * @param properties
     * @param location
     * @deprecated retained for compatibility with OH3
     */
    @Deprecated
    protected ThingDTO(String thingTypeUID, String UID, String label, String bridgeUID, List<ChannelDTO> channels,
            Map<String, Object> configuration, Map<String, String> properties, String location) {
        this.thingTypeUID = thingTypeUID;
        this.UID = UID;
        this.label = label;
        this.bridgeUID = bridgeUID;
        this.channels = channels;
        this.configuration = configuration;
        this.properties = properties;
        this.location = location;
    }

    /**
     * 
     * @param thingTypeUID
     * @param UID
     * @param thingTypeVersion
     * @param label
     * @param bridgeUID
     * @param channels
     * @param configuration
     * @param properties
     * @param location
     */
    protected ThingDTO(String thingTypeUID, String UID, Integer thingTypeVersion, String label, String bridgeUID,
            List<ChannelDTO> channels, Map<String, Object> configuration, Map<String, String> properties,
            String location) {
        this.thingTypeUID = thingTypeUID;
        this.UID = UID;
        this.label = label;
        this.bridgeUID = bridgeUID;
        this.channels = channels;
        this.configuration = configuration;
        this.properties = properties;
        this.location = location;
        this.thingTypeVersion = thingTypeVersion;
    }
}
