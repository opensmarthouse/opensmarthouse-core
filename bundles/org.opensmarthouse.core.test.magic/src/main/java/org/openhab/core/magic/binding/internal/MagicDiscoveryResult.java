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
package org.openhab.core.magic.binding.internal;

import java.util.Map;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.config.discovery.DiscoveryResult;
import org.openhab.core.config.discovery.DiscoveryResultFlag;
import org.openhab.core.thing.ThingTypeUID;
import org.openhab.core.thing.ThingUID;

/**
 * Fixed implementation of a discovery result.
 *
 * @author Łukasz Dywicki - Initial contribution.
 */
public class MagicDiscoveryResult implements DiscoveryResult {

    private final ThingUID thingUID;
    private final String representationProperty;
    private final Map<String, Object> properties;
    private final String label;

    public MagicDiscoveryResult(ThingUID thingUID, String representationProperty, Map<String, Object> properties, String label) {
        this.thingUID = thingUID;
        this.representationProperty = representationProperty;
        this.properties = properties;
        this.label = label;
    }

    @Override
    public ThingUID getThingUID() {
        return thingUID;
    }

    @Override
    public ThingTypeUID getThingTypeUID() {
        return thingUID.getThingTypeUID();
    }

    @Override
    public String getBindingId() {
        return thingUID.getBindingId();
    }

    @Override
    public Map<String, Object> getProperties() {
        return properties;
    }

    @Override
    public @Nullable String getRepresentationProperty() {
        return representationProperty;
    }

    @Override
    public DiscoveryResultFlag getFlag() {
        return DiscoveryResultFlag.NEW;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public @Nullable ThingUID getBridgeUID() {
        return null;
    }

    @Override
    public long getTimestamp() {
        return 0;
    }

    @Override
    public long getTimeToLive() {
        return 0;
    }
}
