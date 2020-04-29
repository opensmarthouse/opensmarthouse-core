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
package org.openhab.core.thing.internal.firmware;

import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.thing.ThingTypeUID;
import org.openhab.core.thing.binding.firmware.Firmware;
import org.openhab.core.thing.binding.firmware.FirmwareBuilder;
import org.openhab.core.thing.binding.firmware.FirmwareRestriction;

/**
 * Default realization of {@link FirmwareBuilder} type.
 *
 * @author Łukasz Dywicki - Initial contribution
 */
@NonNullByDefault
public final class FirmwareBuilderImpl implements FirmwareBuilder {

    private final ThingTypeUID thingTypeUID;
    private final String version;
    private @Nullable String vendor;
    private @Nullable String model;
    private boolean modelRestricted;
    private @Nullable String description;
    private @Nullable String prerequisiteVersion;
    private @Nullable FirmwareRestriction firmwareRestriction;
    private @Nullable String changelog;
    private @Nullable URL onlineChangelog;
    private @Nullable transient InputStream inputStream;
    private @Nullable String md5Hash;
    private Map<String, String> properties;

    /**
     * Creates a new builder.
     *
     * @param thingTypeUID the thing type UID that is associated with this firmware (not null)
     * @param firmwareVersion the version of the firmware to be created (not null)
     * @throws IllegalArgumentException if given firmware version is null or empty; if the thing type UID is null
     */
    public FirmwareBuilderImpl(ThingTypeUID thingTypeUID, String firmwareVersion) {
        checkNotNull(thingTypeUID, "ThingTypeUID");
        this.thingTypeUID = thingTypeUID;

        checkNotNullOrEmpty(firmwareVersion, "Firmware version");
        this.version = firmwareVersion;

        this.properties = new HashMap<>();
    }

    @Override
    public FirmwareBuilder withVendor(@Nullable String vendor) {
        this.vendor = vendor;
        return this;
    }

    @Override
    public FirmwareBuilder withModel(@Nullable String model) {
        this.model = model;
        return this;
    }

    @Override
    public FirmwareBuilder withModelRestricted(boolean modelRestricted) {
        this.modelRestricted = modelRestricted;
        return this;
    }

    @Override
    public FirmwareBuilder withDescription(@Nullable String description) {
        this.description = description;
        return this;
    }

    @Override
    public FirmwareBuilder withPrerequisiteVersion(@Nullable String prerequisiteVersion) {
        this.prerequisiteVersion = prerequisiteVersion;
        return this;
    }

    @Override
    public FirmwareBuilder withChangelog(@Nullable String changelog) {
        this.changelog = changelog;
        return this;
    }

    @Override
    public FirmwareBuilder withOnlineChangelog(@Nullable URL onlineChangelog) {
        this.onlineChangelog = onlineChangelog;
        return this;
    }

    @Override
    public FirmwareBuilder withInputStream(@Nullable InputStream inputStream) {
        this.inputStream = inputStream;
        return this;
    }

    @Override
    public FirmwareBuilder withProperties(Map<String, String> properties) {
        checkNotNull(properties, "Properties");
        this.properties = properties;
        return this;
    }

    @Override
    public FirmwareBuilder withMd5Hash(@Nullable String md5Hash) {
        this.md5Hash = md5Hash;
        return this;
    }

    @Override
    public FirmwareBuilder withFirmwareRestriction(FirmwareRestriction firmwareRestriction) {
        checkNotNull(firmwareRestriction, "Firmware restriction function");
        this.firmwareRestriction = firmwareRestriction;
        return this;
    }

    private void checkNotNull(@Nullable Object object, String argumentName) {
        if (object == null) {
            throw new IllegalArgumentException(argumentName + " must not be null.");
        }
    }

    private void checkNotNullOrEmpty(@Nullable String string, String argumentName) {
        if (string == null || string.isEmpty()) {
            throw new IllegalArgumentException(argumentName + " must not be null or empty.");
        }
    }

    @Override
    public Firmware build() {
        if (modelRestricted && StringUtils.isEmpty(model)) {
            throw new IllegalArgumentException("Cannot create model restricted firmware without model");
        }

        return new FirmwareImpl(thingTypeUID, vendor, model, modelRestricted, description, version, prerequisiteVersion,
                firmwareRestriction, changelog, onlineChangelog, inputStream, md5Hash, properties);
    }
}
