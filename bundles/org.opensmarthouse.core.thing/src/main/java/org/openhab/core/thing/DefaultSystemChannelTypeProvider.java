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

import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.thing.type.ChannelType;
import org.openhab.core.thing.type.ChannelTypeProvider;
import org.openhab.core.thing.type.ChannelTypeUID;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;

/**
 * Default, system wide, channel types which can be used across multiple places.
 * Extracted from {@link org.openhab.core.thing.internal.DefaultSystemChannelTypeProvider}.
 *
 * Earlier this class was used as supplier of constants and channel types. Given mixed responsibilities
 * it was separated and split. Constants now live in {@link SystemChannelTypeConstants} while
 * implementation is now moved to internal package and can not be called directly.
 *
 * @deprecated This class is kept to provide compatibility for OH 2.x APIs and will not receive any
 *             other updates. Please migrate your code to use of {@link SystemChannelTypeConstants} to refer
 *             common channel types.
 *
 * @author Łukasz Dywicki - Extraction from past code base.
 */
@Deprecated
@NonNullByDefault
public class DefaultSystemChannelTypeProvider {

    public final static String BINDING_ID = SystemChannelTypeConstants.BINDING_ID;

    /**
     * Signal strength default system wide {@link ChannelType}. Represents signal strength of a device as a number
     * with values 0, 1, 2, 3 or 4, 0 being worst strength and 4 being best strength.
     */
    public final static ChannelType SYSTEM_CHANNEL_SIGNAL_STRENGTH;

    /**
     * Low battery default system wide {@link ChannelType}. Represents a low battery warning with possible values
     * on (low battery) and off (battery ok).
     */
    public final static ChannelType SYSTEM_CHANNEL_LOW_BATTERY;

    /**
     * Battery level default system wide {@link ChannelType}. Represents the battery level as a percentage.
     */
    public final static ChannelType SYSTEM_CHANNEL_BATTERY_LEVEL;

    /**
     * System wide trigger {@link ChannelType} without event options.
     */
    public final static ChannelType SYSTEM_TRIGGER;

    /**
     * System wide trigger {@link ChannelType} which triggers "PRESSED" and "RELEASED" events.
     */
    public final static ChannelType SYSTEM_RAWBUTTON;

    /**
     * System wide trigger {@link ChannelType} which triggers "SHORT_PRESSED", "DOUBLE_PRESSED" and "LONG_PRESSED"
     * events.
     */
    public final static ChannelType SYSTEM_BUTTON;

    /**
     * System wide trigger {@link ChannelType} which triggers "DIR1_PRESSED", "DIR1_RELEASED", "DIR2_PRESSED" and
     * "DIR2_RELEASED" events.
     */
    public final static ChannelType SYSTEM_RAWROCKER;

    /**
     * Power: default system wide {@link ChannelType} which allows turning off (potentially on) a device
     */
    public final static ChannelType SYSTEM_POWER;

    /**
     * Location: default system wide {@link ChannelType} which displays a location
     */
    public final static ChannelType SYSTEM_LOCATION;

    /**
     * Motion: default system wide {@link ChannelType} which indications whether motion was detected (state ON)
     */
    public final static ChannelType SYSTEM_MOTION;

    /**
     * Brightness: default system wide {@link ChannelType} which allows changing the brightness from 0-100%
     */
    public final static ChannelType SYSTEM_BRIGHTNESS;

    /**
     * Color: default system wide {@link ChannelType} which allows changing the color
     */
    public final static ChannelType SYSTEM_COLOR;

    /**
     * Color-temperature: default system wide {@link ChannelType} which allows changing the color temperature
     */
    public final static ChannelType SYSTEM_COLOR_TEMPERATURE;

    // media channels

    /**
     * Volume: default system wide {@link ChannelType} which allows changing the audio volume from 0-100%
     */
    public final static ChannelType SYSTEM_VOLUME;

    /**
     * Mute: default system wide {@link ChannelType} which allows muting and un-muting audio
     */
    public final static ChannelType SYSTEM_MUTE;

    /**
     * Media-control: system wide {@link ChannelType} which controls a media player
     */
    public final static ChannelType SYSTEM_MEDIA_CONTROL;

    /**
     * Media-title: default system wide {@link ChannelType} which displays the title of a (played) song
     */
    public final static ChannelType SYSTEM_MEDIA_TITLE;

    /**
     * Media-artist: default system wide {@link ChannelType} which displays the artist of a (played) song
     */
    public final static ChannelType SYSTEM_MEDIA_ARTIST;

    // weather channels

    /**
     * Wind-direction: system wide {@link ChannelType} which shows the wind direction in degrees 0-360
     */
    public final static ChannelType SYSTEM_WIND_DIRECTION;

    /**
     * Wind-speed: system wide {@link ChannelType} which shows the wind speed
     */
    public final static ChannelType SYSTEM_WIND_SPEED;

    /**
     * Outdoor-temperature: system wide {@link ChannelType} which shows the outdoor temperature
     */
    public final static ChannelType SYSTEM_OUTDOOR_TEMPERATURE;

    /**
     * Atmospheric-humidity: system wide {@link ChannelType} which shows the atmospheric humidity
     */
    public final static ChannelType SYSTEM_ATMOSPHERIC_HUMIDITY;

    /**
     * Barometric-pressure: system wide {@link ChannelType} which shows the barometric pressure
     */
    public final static ChannelType SYSTEM_BAROMETRIC_PRESSURE;

    public final static AtomicReference<ChannelTypeProvider> PROVIDER = new AtomicReference<>();

    static {
        Bundle bundle = FrameworkUtil.getBundle(DefaultSystemChannelTypeProvider.class);

        if (bundle == null) {
            throw new ExceptionInInitializerError(
                    "DefaultSystemChannelTypeProvider is legacy API working only under OSGi to bridge OH 2.x bindings.");
        }

        @Nullable
        ServiceReference<ChannelTypeProvider> lookup = null;
        int waitTime = 0;
        while (waitTime < 10000) {
            // lets wait up to 10 seconds to get default channel type provider in place
            // it might not be very fortunate way unless we get bindings using specific
            try {
                Collection<ServiceReference<ChannelTypeProvider>> reference = bundle.getBundleContext()
                        .getServiceReferences(ChannelTypeProvider.class,
                                "(component.name=org.openhab.core.thing.internal.DefaultSystemChannelTypeProvider)");
                if (reference != null && reference.size() > 0) {
                    lookup = reference.iterator().next();
                    break;
                }
                waitTime += 100;
                Thread.sleep(100);
            } catch (InterruptedException | InvalidSyntaxException e) {
                throw new RuntimeException(e);
            }
        }

        @NonNull
        ChannelTypeProvider provider = bundle.getBundleContext().getService(lookup);

        SYSTEM_CHANNEL_SIGNAL_STRENGTH = getChannel(provider,
                SystemChannelTypeConstants.SYSTEM_CHANNEL_SIGNAL_STRENGTH);
        SYSTEM_CHANNEL_LOW_BATTERY = getChannel(provider, SystemChannelTypeConstants.SYSTEM_CHANNEL_LOW_BATTERY);
        SYSTEM_CHANNEL_BATTERY_LEVEL = getChannel(provider, SystemChannelTypeConstants.SYSTEM_CHANNEL_BATTERY_LEVEL);
        SYSTEM_TRIGGER = getChannel(provider, SystemChannelTypeConstants.SYSTEM_TRIGGER);
        SYSTEM_RAWBUTTON = getChannel(provider, SystemChannelTypeConstants.SYSTEM_RAWBUTTON);
        SYSTEM_BUTTON = getChannel(provider, SystemChannelTypeConstants.SYSTEM_BUTTON);
        SYSTEM_RAWROCKER = getChannel(provider, SystemChannelTypeConstants.SYSTEM_RAWROCKER);
        SYSTEM_POWER = getChannel(provider, SystemChannelTypeConstants.SYSTEM_POWER);
        SYSTEM_LOCATION = getChannel(provider, SystemChannelTypeConstants.SYSTEM_LOCATION);
        SYSTEM_MOTION = getChannel(provider, SystemChannelTypeConstants.SYSTEM_MOTION);
        SYSTEM_BRIGHTNESS = getChannel(provider, SystemChannelTypeConstants.SYSTEM_BRIGHTNESS);
        SYSTEM_COLOR = getChannel(provider, SystemChannelTypeConstants.SYSTEM_COLOR);
        SYSTEM_COLOR_TEMPERATURE = getChannel(provider, SystemChannelTypeConstants.SYSTEM_COLOR_TEMPERATURE);
        SYSTEM_VOLUME = getChannel(provider, SystemChannelTypeConstants.SYSTEM_VOLUME);
        SYSTEM_MUTE = getChannel(provider, SystemChannelTypeConstants.SYSTEM_MUTE);
        SYSTEM_MEDIA_CONTROL = getChannel(provider, SystemChannelTypeConstants.SYSTEM_MEDIA_CONTROL);
        SYSTEM_MEDIA_TITLE = getChannel(provider, SystemChannelTypeConstants.SYSTEM_MEDIA_TITLE);
        SYSTEM_MEDIA_ARTIST = getChannel(provider, SystemChannelTypeConstants.SYSTEM_MEDIA_ARTIST);
        SYSTEM_WIND_DIRECTION = getChannel(provider, SystemChannelTypeConstants.SYSTEM_WIND_DIRECTION);
        SYSTEM_WIND_SPEED = getChannel(provider, SystemChannelTypeConstants.SYSTEM_WIND_SPEED);
        SYSTEM_OUTDOOR_TEMPERATURE = getChannel(provider, SystemChannelTypeConstants.SYSTEM_OUTDOOR_TEMPERATURE);
        SYSTEM_ATMOSPHERIC_HUMIDITY = getChannel(provider, SystemChannelTypeConstants.SYSTEM_ATMOSPHERIC_HUMIDITY);
        SYSTEM_BAROMETRIC_PRESSURE = getChannel(provider, SystemChannelTypeConstants.SYSTEM_BAROMETRIC_PRESSURE);

        bundle.getBundleContext().ungetService(lookup);
    }

    @NonNull
    private static ChannelType getChannel(@NonNull ChannelTypeProvider provider, ChannelTypeUID constant) {
        return Objects.requireNonNull(provider.getChannelType(constant, null));
    }

}
