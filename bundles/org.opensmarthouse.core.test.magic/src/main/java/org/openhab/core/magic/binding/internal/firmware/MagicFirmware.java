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
package org.openhab.core.magic.binding.internal.firmware;

import java.io.InputStream;
import java.net.URL;
import java.util.Collections;
import java.util.Map;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.thing.Thing;
import org.openhab.core.thing.ThingTypeUID;
import org.openhab.core.thing.binding.firmware.Firmware;
import org.openhab.core.thing.binding.firmware.FirmwareRestriction;

/**
 * A stub for making firmware calls.
 *
 * @author Łukasz Dywicki - Initial contribution.
 */
public class MagicFirmware implements Firmware {

    private final ThingTypeUID thingTypeUID;
    private final String version;

    private String model;
    private boolean modelRestricted;

    public MagicFirmware(ThingTypeUID thingTypeUID, String version) {
        this.thingTypeUID = thingTypeUID;
        this.version = version;
    }

    @Override
    public ThingTypeUID getThingTypeUID() {
        return thingTypeUID;
    }

    @Override
    public @Nullable String getVendor() {
        return null;
    }

    @Override
    public @Nullable String getModel() {
        return model;
    }

    @Override
    public boolean isModelRestricted() {
        return modelRestricted;
    }

    @Override
    public @Nullable String getDescription() {
        return null;
    }

    @Override
    public String getVersion() {
        return "";
    }

    @Override
    public @Nullable String getPrerequisiteVersion() {
        return null;
    }

    @Override
    public FirmwareRestriction getFirmwareRestriction() {
        return new FirmwareRestriction() {
            @Override
            public Boolean apply(Thing thing) {
                return false;
            }
        };
    }

    @Override
    public @Nullable String getChangelog() {
        return null;
    }

    @Override
    public @Nullable URL getOnlineChangelog() {
        return null;
    }

    @Override
    public @Nullable InputStream getInputStream() {
        return null;
    }

    @Override
    public @Nullable String getMd5Hash() {
        return null;
    }

    @Override
    public byte @Nullable [] getBytes() {
        return new byte[0];
    }

    @Override
    public Map<String, String> getProperties() {
        return Collections.emptyMap();
    }

    @Override
    public boolean isSuccessorVersion(@Nullable String firmwareVersion) {
        return false;
    }

    @Override
    public boolean isSuitableFor(Thing thing) {
        return false;
    }

    @Override
    public int compareTo(Firmware o) {
        return 0;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setModelRestricted(boolean modelRestricted) {
        this.modelRestricted = modelRestricted;
    }
}
