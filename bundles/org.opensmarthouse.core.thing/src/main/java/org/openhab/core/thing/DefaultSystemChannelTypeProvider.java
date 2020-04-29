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
package org.openhab.core.thing;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.openhab.core.thing.type.ChannelType;
import org.openhab.core.thing.type.ChannelTypeUID;

/**
 * Default, system wide, channel types which can be used across multiple places.
 * Extracted from {@link org.openhab.core.thing.internal.DefaultSystemChannelTypeProvider}.
 *
 * @author Łukasz Dywicki - Initial contribution
 */
@NonNullByDefault
public interface DefaultSystemChannelTypeProvider {

    String BINDING_ID = "system";

    /**
     * Signal strength default system wide {@link ChannelType}. Represents signal strength of a device as a number
     * with values 0, 1, 2, 3 or 4, 0 being worst strength and 4 being best strength.
     */
    ChannelTypeUID SYSTEM_CHANNEL_SIGNAL_STRENGTH = new ChannelTypeUID(BINDING_ID, "signal-strength");

    /**
     * Low battery default system wide {@link ChannelType}. Represents a low battery warning with possible values
     * on (low battery) and off (battery ok).
     */
    ChannelTypeUID SYSTEM_CHANNEL_LOW_BATTERY = new ChannelTypeUID(BINDING_ID, "low-battery");

    /**
     * Battery level default system wide {@link ChannelType}. Represents the battery level as a percentage.
     */
    ChannelTypeUID SYSTEM_CHANNEL_BATTERY_LEVEL = new ChannelTypeUID(BINDING_ID, "battery-level");

    /**
     * System wide trigger {@link ChannelType} without event options.
     */
    ChannelTypeUID SYSTEM_TRIGGER = new ChannelTypeUID(BINDING_ID, "trigger");

    /**
     * System wide trigger {@link ChannelType} which triggers "PRESSED" and "RELEASED" events.
     */
    ChannelTypeUID SYSTEM_RAWBUTTON = new ChannelTypeUID(BINDING_ID, "rawbutton");

    /**
     * System wide trigger {@link ChannelType} which triggers "SHORT_PRESSED", "DOUBLE_PRESSED" and "LONG_PRESSED"
     * events.
     */
    ChannelTypeUID SYSTEM_BUTTON = new ChannelTypeUID(BINDING_ID, "button");

    /**
     * System wide trigger {@link ChannelType} which triggers "DIR1_PRESSED", "DIR1_RELEASED", "DIR2_PRESSED" and
     * "DIR2_RELEASED" events.
     */
    ChannelTypeUID SYSTEM_RAWROCKER = new ChannelTypeUID(BINDING_ID, "rawrocker");

    /**
     * Power: default system wide {@link ChannelType} which allows turning off (potentially on) a device
     */
    ChannelTypeUID SYSTEM_POWER = new ChannelTypeUID(BINDING_ID, "power");

    /**
     * Location: default system wide {@link ChannelType} which displays a location
     */
    ChannelTypeUID SYSTEM_LOCATION = new ChannelTypeUID(BINDING_ID, "location");

    /**
     * Motion: default system wide {@link ChannelType} which indications whether motion was detected (state ON)
     */
    ChannelTypeUID SYSTEM_MOTION = new ChannelTypeUID(BINDING_ID, "motion");

    /**
     * Brightness: default system wide {@link ChannelType} which allows changing the brightness from 0-100%
     */
    ChannelTypeUID SYSTEM_BRIGHTNESS = new ChannelTypeUID(BINDING_ID, "brightness");

    /**
     * Color: default system wide {@link ChannelType} which allows changing the color
     */
    ChannelTypeUID SYSTEM_COLOR = new ChannelTypeUID(BINDING_ID, "color");

    /**
     * Color-temperature: default system wide {@link ChannelType} which allows changing the color temperature
     */
    ChannelTypeUID SYSTEM_COLOR_TEMPERATURE = new ChannelTypeUID(BINDING_ID, "color-temperature");

    // media channels

    /**
     * Volume: default system wide {@link ChannelType} which allows changing the audio volume from 0-100%
     */
    ChannelTypeUID SYSTEM_VOLUME = new ChannelTypeUID(BINDING_ID, "volume");

    /**
     * Mute: default system wide {@link ChannelType} which allows muting and un-muting audio
     */
    ChannelTypeUID SYSTEM_MUTE = new ChannelTypeUID(BINDING_ID, "mute");

    /**
     * Media-control: system wide {@link ChannelType} which controls a media player
     */
    ChannelTypeUID SYSTEM_MEDIA_CONTROL = new ChannelTypeUID(BINDING_ID, "media-control");

    /**
     * Media-title: default system wide {@link ChannelType} which displays the title of a (played) song
     */
    ChannelTypeUID SYSTEM_MEDIA_TITLE = new ChannelTypeUID(BINDING_ID, "media-title");

    /**
     * Media-artist: default system wide {@link ChannelType} which displays the artist of a (played) song
     */
    ChannelTypeUID SYSTEM_MEDIA_ARTIST = new ChannelTypeUID(BINDING_ID, "media-artist");

    // weather channels

    /**
     * Wind-direction: system wide {@link ChannelType} which shows the wind direction in degrees 0-360
     */
    ChannelTypeUID SYSTEM_WIND_DIRECTION = new ChannelTypeUID(BINDING_ID, "wind-direction");

    /**
     * Wind-speed: system wide {@link ChannelType} which shows the wind speed
     */
    ChannelTypeUID SYSTEM_WIND_SPEED = new ChannelTypeUID(BINDING_ID, "wind-speed");

    /**
     * Outdoor-temperature: system wide {@link ChannelType} which shows the outdoor temperature
     */
    ChannelTypeUID SYSTEM_OUTDOOR_TEMPERATURE = new ChannelTypeUID(BINDING_ID, "outdoor-temperature");

    /**
     * Atmospheric-humidity: system wide {@link ChannelType} which shows the atmospheric humidity
     */
    ChannelTypeUID SYSTEM_ATMOSPHERIC_HUMIDITY = new ChannelTypeUID(BINDING_ID, "atmospheric-humidity");

    /**
     * Barometric-pressure: system wide {@link ChannelType} which shows the barometric pressure
     */
    ChannelTypeUID SYSTEM_BAROMETRIC_PRESSURE = new ChannelTypeUID(BINDING_ID, "barometric-pressure");

}
