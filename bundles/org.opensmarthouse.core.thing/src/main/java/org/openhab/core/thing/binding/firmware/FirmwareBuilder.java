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
package org.openhab.core.thing.binding.firmware;

import java.io.InputStream;
import java.net.URL;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;

/**
 * The builder to create a {@link Firmware}.
 *
 * @author Thomas Höfer - Initial contribution
 * @author Dimitar Ivanov - Extracted as separate class for Firmware, introduced firmware restriction
 *         function
 * @author Łukasz Dywicki - Extracted interface from concrete class.
 */
@NonNullByDefault
public interface FirmwareBuilder {
    /**
     * Adds the vendor to the builder.
     *
     * @param vendor the vendor to be added to the builder (can be null)
     * @return the updated builder
     */
    FirmwareBuilder withVendor(@Nullable String vendor);

    /**
     * Adds the model to the builder.
     *
     * @param model the model to be added to the builder (can be null)
     * @return the updated builder
     */
    FirmwareBuilder withModel(@Nullable String model);

    /**
     * Sets the modelRestricted flag in the builder.
     *
     * @param modelRestricted the modelRestricted flag to be added to the builder
     * @return the updated builder
     */
    FirmwareBuilder withModelRestricted(boolean modelRestricted);

    /**
     * Adds the description to the builder.
     *
     * @param description the description to be added to the builder (can be null)
     * @return the updated builder
     */
    FirmwareBuilder withDescription(@Nullable String description);

    /**
     * Adds the prerequisite version to the builder.
     *
     * @param prerequisiteVersion the prerequisite version to be added to the builder (can be null)
     * @return the updated builder
     */
    FirmwareBuilder withPrerequisiteVersion(@Nullable String prerequisiteVersion);

    /**
     * Adds the changelog to the builder.
     *
     * @param changelog the changelog to be added to the builder (can be null)
     * @return the updated builder
     */
    FirmwareBuilder withChangelog(@Nullable String changelog);

    /**
     * Adds the online changelog to the builder.
     *
     * @param onlineChangelog the online changelog to be added to the builder (can be null)
     * @return the updated builder
     */
    FirmwareBuilder withOnlineChangelog(@Nullable URL onlineChangelog);

    /**
     * Adds the input stream for the binary content to the builder.
     *
     * @param inputStream the input stream for the binary content to be added to the builder (can be null)
     * @return the updated builder
     */
    FirmwareBuilder withInputStream(@Nullable InputStream inputStream);

    /**
     * Adds the properties to the builder.
     *
     * @param properties the properties to be added to the builder (not null)
     * @return the updated builder
     * @throws IllegalArgumentException if the given properties are null
     */
    FirmwareBuilder withProperties(Map<String, String> properties);

    /**
     * Adds the given md5 hash value to the builder.
     *
     * @param md5Hash the md5 hash value to be added to the builder (can be null)
     * @return the updated builder
     */
    FirmwareBuilder withMd5Hash(@Nullable String md5Hash);

    /**
     * An additional restriction can be applied on the firmware by providing a
     * {@link FirmwareRestriction} function.
     *
     * @param firmwareRestriction a {@link FirmwareRestriction} for applying an additional
     *            restriction function on the firmware (not null)
     * @return the updated builder
     * @throws IllegalArgumentException if the given function is null
     */
    FirmwareBuilder withFirmwareRestriction(FirmwareRestriction firmwareRestriction);

    /**
     * Builds the firmware.
     *
     * @return the firmware instance based on this builder
     * @throws IllegalArgumentException when the model restricted property ({@link #withModelRestricted(boolean)}) is
     *             set to true, but the model ({@link #withModel(String)}) is not set
     */
    Firmware build();
}
