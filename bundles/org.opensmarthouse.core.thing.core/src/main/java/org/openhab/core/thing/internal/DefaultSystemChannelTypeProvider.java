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
package org.openhab.core.thing.internal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.i18n.LocalizedKey;
import org.openhab.core.thing.CommonTriggerEvents;
import org.openhab.core.thing.UID;
import org.openhab.core.thing.i18n.ChannelTypeI18nLocalizationService;
import org.openhab.core.thing.type.ChannelType;
import org.openhab.core.thing.type.ChannelTypeBuilder;
import org.openhab.core.thing.type.ChannelTypeProvider;
import org.openhab.core.thing.type.ChannelTypeUID;
import org.openhab.core.types.EventDescription;
import org.openhab.core.types.EventOption;
import org.openhab.core.types.StateDescription;
import org.openhab.core.types.StateDescriptionFragmentBuilderFactory;
import org.openhab.core.types.StateOption;
import org.openhab.core.common.osgi.BundleResolver;
import org.osgi.framework.Bundle;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * Implementation providing default system wide channel types
 *
 * @author Ivan Iliev - Initial contribution
 * @author Chris Jackson - Added battery level
 * @author Dennis Nobel - Changed to {@link ChannelTypeProvider}
 * @author Markus Rathgeb - Make battery-low indication read-only
 * @author Moritz Kammerer - Added system trigger types
 * @author Christoph Weitkamp - Added support for translation
 * @author Stefan Triller - Added more system channels
 * @author Christoph Weitkamp - factored out common i18n aspects into ThingTypeI18nLocalizationService
 */
@NonNullByDefault
@Component
public class DefaultSystemChannelTypeProvider implements ChannelTypeProvider {

    static final String BINDING_ID = "system";

    /**
     * Signal strength default system wide {@link ChannelType}. Represents signal strength of a device as a number
     * with values 0, 1, 2, 3 or 4, 0 being worst strength and 4 being best strength.
     */
    private final Function<StateDescriptionFragmentBuilderFactory, ChannelType> SYSTEM_CHANNEL_SIGNAL_STRENGTH = stateDescriptionFragmentBuilderFactory -> ChannelTypeBuilder
            .state(org.openhab.core.thing.DefaultSystemChannelTypeProvider.SYSTEM_CHANNEL_SIGNAL_STRENGTH, "Signal Strength", "Number")
            .withCategory("QualityOfService")
            .withStateDescription(new StateDescription(BigDecimal.ZERO, new BigDecimal(4), BigDecimal.ONE, null, true,
                    Arrays.asList(new StateOption("0", "no signal"), new StateOption("1", "weak"),
                            new StateOption("2", "average"), new StateOption("3", "good"),
                            new StateOption("4", "excellent"))))
            .build();

    /**
     * Low battery default system wide {@link ChannelType}. Represents a low battery warning with possible values
     * on (low battery) and off (battery ok).
     */
    private final Function<StateDescriptionFragmentBuilderFactory, ChannelType> SYSTEM_CHANNEL_LOW_BATTERY = stateDescriptionFragmentBuilderFactory -> ChannelTypeBuilder
            .state(org.openhab.core.thing.DefaultSystemChannelTypeProvider.SYSTEM_CHANNEL_LOW_BATTERY, "Low Battery", "Switch").withCategory("Battery")
            .withStateDescription(new StateDescription(null, null, null, null, true, null))
                    //StateDescriptionFragmentBuilder.create().withReadOnly(true).build().toStateDescription())
            .build();

    /**
     * Battery level default system wide {@link ChannelType}. Represents the battery level as a percentage.
     */
    private final Function<StateDescriptionFragmentBuilderFactory, ChannelType> SYSTEM_CHANNEL_BATTERY_LEVEL = stateDescriptionFragmentBuilderFactory -> ChannelTypeBuilder
            .state(org.openhab.core.thing.DefaultSystemChannelTypeProvider.SYSTEM_CHANNEL_BATTERY_LEVEL, "Battery Level", "Number").withCategory("Battery")
            .withStateDescription(
                    new StateDescription(BigDecimal.ZERO, new BigDecimal(100), BigDecimal.ONE, "%.0f %%", true, null))
            .build();

    /**
     * System wide trigger {@link ChannelType} without event options.
     */
    private final Function<StateDescriptionFragmentBuilderFactory, ChannelType> SYSTEM_TRIGGER = stateDescriptionFragmentBuilderFactory -> ChannelTypeBuilder
            .trigger(org.openhab.core.thing.DefaultSystemChannelTypeProvider.SYSTEM_TRIGGER, "Trigger").build();

    /**
     * System wide trigger {@link ChannelType} which triggers "PRESSED" and "RELEASED" events.
     */
    private final Function<StateDescriptionFragmentBuilderFactory, ChannelType> SYSTEM_RAWBUTTON = stateDescriptionFragmentBuilderFactory -> ChannelTypeBuilder
            .trigger(org.openhab.core.thing.DefaultSystemChannelTypeProvider.SYSTEM_RAWBUTTON, "Raw button")
            .withEventDescription(new EventDescription(Arrays.asList(new EventOption(CommonTriggerEvents.PRESSED, null),
                    new EventOption(CommonTriggerEvents.RELEASED, null))))
            .build();

    /**
     * System wide trigger {@link ChannelType} which triggers "SHORT_PRESSED", "DOUBLE_PRESSED" and "LONG_PRESSED"
     * events.
     */
    private final Function<StateDescriptionFragmentBuilderFactory, ChannelType> SYSTEM_BUTTON = stateDescriptionFragmentBuilderFactory -> ChannelTypeBuilder
            .trigger(org.openhab.core.thing.DefaultSystemChannelTypeProvider.SYSTEM_BUTTON, "Button")
            .withEventDescription(
                    new EventDescription(Arrays.asList(new EventOption(CommonTriggerEvents.SHORT_PRESSED, null),
                            new EventOption(CommonTriggerEvents.DOUBLE_PRESSED, null),
                            new EventOption(CommonTriggerEvents.LONG_PRESSED, null))))
            .build();

    /**
     * System wide trigger {@link ChannelType} which triggers "DIR1_PRESSED", "DIR1_RELEASED", "DIR2_PRESSED" and
     * "DIR2_RELEASED" events.
     */
    private final Function<StateDescriptionFragmentBuilderFactory, ChannelType> SYSTEM_RAWROCKER = stateDescriptionFragmentBuilderFactory -> ChannelTypeBuilder
            .trigger(org.openhab.core.thing.DefaultSystemChannelTypeProvider.SYSTEM_RAWROCKER, "Raw rocker button")
            .withEventDescription(
                    new EventDescription(Arrays.asList(new EventOption(CommonTriggerEvents.DIR1_PRESSED, null),
                            new EventOption(CommonTriggerEvents.DIR1_RELEASED, null),
                            new EventOption(CommonTriggerEvents.DIR2_PRESSED, null),
                            new EventOption(CommonTriggerEvents.DIR2_RELEASED, null))))
            .build();

    /**
     * Power: default system wide {@link ChannelType} which allows turning off (potentially on) a device
     */
    private final Function<StateDescriptionFragmentBuilderFactory, ChannelType> SYSTEM_POWER = stateDescriptionFragmentBuilderFactory -> ChannelTypeBuilder
            .state(org.openhab.core.thing.DefaultSystemChannelTypeProvider.SYSTEM_POWER, "Power", "Switch")
            .withDescription("Device is operable when channel has state ON").build();

    /**
     * Location: default system wide {@link ChannelType} which displays a location
     */
    private final Function<StateDescriptionFragmentBuilderFactory, ChannelType> SYSTEM_LOCATION = stateDescriptionFragmentBuilderFactory -> ChannelTypeBuilder
            .state(org.openhab.core.thing.DefaultSystemChannelTypeProvider.SYSTEM_LOCATION, "Location", "Location")
            .withDescription("Location in lat./lon./height coordinates")
            .withStateDescription(stateDescriptionFragmentBuilderFactory.create().withReadOnly(true)
                    .withPattern("%2$s°N %3$s°E %1$sm").build().toStateDescription())
            .build();

    /**
     * Motion: default system wide {@link ChannelType} which indications whether motion was detected (state ON)
     */
    private final Function<StateDescriptionFragmentBuilderFactory, ChannelType> SYSTEM_MOTION = stateDescriptionFragmentBuilderFactory -> ChannelTypeBuilder
            .state(org.openhab.core.thing.DefaultSystemChannelTypeProvider.SYSTEM_MOTION, "Motion", "Switch")
            .withDescription("Motion detected by the device").withCategory("Motion").withStateDescription(
                    stateDescriptionFragmentBuilderFactory.create().withReadOnly(true).build().toStateDescription())
            .build();

    /**
     * Brightness: default system wide {@link ChannelType} which allows changing the brightness from 0-100%
     */
    private final Function<StateDescriptionFragmentBuilderFactory, ChannelType> SYSTEM_BRIGHTNESS = stateDescriptionFragmentBuilderFactory -> ChannelTypeBuilder
            .state(org.openhab.core.thing.DefaultSystemChannelTypeProvider.SYSTEM_BRIGHTNESS, "Brightness", "Dimmer")
            .withDescription("Controls the brightness and switches the light on and off").withCategory("DimmableLight")
            .withStateDescription(
                    new StateDescription(BigDecimal.ZERO, new BigDecimal(100), null, "%d %%", false, null))
            .build();

    /**
     * Color: default system wide {@link ChannelType} which allows changing the color
     */
    private final Function<StateDescriptionFragmentBuilderFactory, ChannelType> SYSTEM_COLOR = stateDescriptionFragmentBuilderFactory -> ChannelTypeBuilder
            .state(org.openhab.core.thing.DefaultSystemChannelTypeProvider.SYSTEM_COLOR, "Color", "Color")
            .withDescription("Controls the color of the light").withCategory("ColorLight").build();

    /**
     * Color-temperature: default system wide {@link ChannelType} which allows changing the color temperature
     */
    private final Function<StateDescriptionFragmentBuilderFactory, ChannelType> SYSTEM_COLOR_TEMPERATURE = stateDescriptionFragmentBuilderFactory -> ChannelTypeBuilder
            .state(org.openhab.core.thing.DefaultSystemChannelTypeProvider.SYSTEM_COLOR_TEMPERATURE, "Color Temperature", "Dimmer")
            .withDescription("Controls the color temperature of the light").withCategory("ColorLight")
            .withStateDescription(new StateDescription(BigDecimal.ZERO, new BigDecimal(100), null, "%d", false, null))
            .build();

    // media channels

    /**
     * Volume: default system wide {@link ChannelType} which allows changing the audio volume from 0-100%
     */
    private final Function<StateDescriptionFragmentBuilderFactory, ChannelType> SYSTEM_VOLUME = stateDescriptionFragmentBuilderFactory -> ChannelTypeBuilder
            .state(org.openhab.core.thing.DefaultSystemChannelTypeProvider.SYSTEM_VOLUME, "Volume", "Dimmer")
            .withDescription("Change the sound volume of a device")
            .withStateDescription(
                    new StateDescription(BigDecimal.ZERO, new BigDecimal(100), null, "%d %%", false, null))
            .withCategory("SoundVolume").build();

    /**
     * Mute: default system wide {@link ChannelType} which allows muting and un-muting audio
     */
    private final Function<StateDescriptionFragmentBuilderFactory, ChannelType> SYSTEM_MUTE = stateDescriptionFragmentBuilderFactory -> ChannelTypeBuilder
            .state(org.openhab.core.thing.DefaultSystemChannelTypeProvider.SYSTEM_MUTE, "Mute", "Switch").withDescription("Mute audio of the device")
            .withCategory("SoundVolume").build();

    /**
     * Media-control: system wide {@link ChannelType} which controls a media player
     */
    private final Function<StateDescriptionFragmentBuilderFactory, ChannelType> SYSTEM_MEDIA_CONTROL = stateDescriptionFragmentBuilderFactory -> ChannelTypeBuilder
            .state(org.openhab.core.thing.DefaultSystemChannelTypeProvider.SYSTEM_MEDIA_CONTROL, "Media Control", "Player")
            .withCategory("MediaControl").build();

    /**
     * Media-title: default system wide {@link ChannelType} which displays the title of a (played) song
     */
    private final Function<StateDescriptionFragmentBuilderFactory, ChannelType> SYSTEM_MEDIA_TITLE = stateDescriptionFragmentBuilderFactory -> ChannelTypeBuilder
            .state(org.openhab.core.thing.DefaultSystemChannelTypeProvider.SYSTEM_MEDIA_TITLE, "Media Title", "String")
            .withDescription("Title of a (played) media file").withStateDescription(
                    stateDescriptionFragmentBuilderFactory.create().withReadOnly(true).build().toStateDescription())
            .build();

    /**
     * Media-artist: default system wide {@link ChannelType} which displays the artist of a (played) song
     */
    private final Function<StateDescriptionFragmentBuilderFactory, ChannelType> SYSTEM_MEDIA_ARTIST = stateDescriptionFragmentBuilderFactory -> ChannelTypeBuilder
            .state(org.openhab.core.thing.DefaultSystemChannelTypeProvider.SYSTEM_MEDIA_ARTIST, "Media Artist", "String")
            .withDescription("Artist of a (played) media file").withStateDescription(
                    stateDescriptionFragmentBuilderFactory.create().withReadOnly(true).build().toStateDescription())
            .build();

    // weather channels

    /**
     * Wind-direction: system wide {@link ChannelType} which shows the wind direction in degrees 0-360
     */
    private final Function<StateDescriptionFragmentBuilderFactory, ChannelType> SYSTEM_WIND_DIRECTION = stateDescriptionFragmentBuilderFactory -> ChannelTypeBuilder
            .state(org.openhab.core.thing.DefaultSystemChannelTypeProvider.SYSTEM_WIND_DIRECTION, "Wind Direction", "Number:Angle")
            .withDescription("Current wind direction expressed as an angle").withCategory("Wind")
            .withStateDescription(
                    new StateDescription(BigDecimal.ZERO, new BigDecimal(360), null, "%.0f %unit%", true, null))
            .build();

    /**
     * Wind-speed: system wide {@link ChannelType} which shows the wind speed
     */
    private final Function<StateDescriptionFragmentBuilderFactory, ChannelType> SYSTEM_WIND_SPEED = stateDescriptionFragmentBuilderFactory -> ChannelTypeBuilder
            .state(org.openhab.core.thing.DefaultSystemChannelTypeProvider.SYSTEM_WIND_SPEED, "Wind Speed", "Number:Speed")
            .withDescription("Current wind speed").withCategory("Wind")
            .withStateDescription(stateDescriptionFragmentBuilderFactory.create().withReadOnly(true).withPattern("%.1f %unit%")
                    .build().toStateDescription())
            .build();

    /**
     * Outdoor-temperature: system wide {@link ChannelType} which shows the outdoor temperature
     */
    private final Function<StateDescriptionFragmentBuilderFactory, ChannelType> SYSTEM_OUTDOOR_TEMPERATURE = stateDescriptionFragmentBuilderFactory -> ChannelTypeBuilder
            .state(org.openhab.core.thing.DefaultSystemChannelTypeProvider.SYSTEM_OUTDOOR_TEMPERATURE, "Outdoor Temperature", "Number:Temperature")
            .withDescription("Current outdoor temperature").withCategory("Temperature")
            .withStateDescription(stateDescriptionFragmentBuilderFactory.create().withReadOnly(true).withPattern("%.1f %unit%")
                    .build().toStateDescription())
            .build();

    /**
     * Atmospheric-humidity: system wide {@link ChannelType} which shows the atmospheric humidity
     */
    private final Function<StateDescriptionFragmentBuilderFactory, ChannelType> SYSTEM_ATMOSPHERIC_HUMIDITY = stateDescriptionFragmentBuilderFactory -> ChannelTypeBuilder
            .state(org.openhab.core.thing.DefaultSystemChannelTypeProvider.SYSTEM_ATMOSPHERIC_HUMIDITY, "Atmospheric Humidity",
                    "Number:Dimensionless")
            .withDescription("Current atmospheric relative humidity").withCategory("Humidity")
            .withStateDescription(stateDescriptionFragmentBuilderFactory.create().withReadOnly(true).withPattern("%.0f %%")
                    .build().toStateDescription())
            .build();

    /**
     * Barometric-pressure: system wide {@link ChannelType} which shows the barometric pressure
     */
    private final Function<StateDescriptionFragmentBuilderFactory, ChannelType> SYSTEM_BAROMETRIC_PRESSURE = stateDescriptionFragmentBuilderFactory -> ChannelTypeBuilder
            .state(org.openhab.core.thing.DefaultSystemChannelTypeProvider.SYSTEM_BAROMETRIC_PRESSURE, "Barometric Pressure", "Number:Pressure")
            .withDescription("Current barometric pressure").withCategory("Pressure")
            .withStateDescription(stateDescriptionFragmentBuilderFactory.create().withReadOnly(true).withPattern("%.3f %unit%")
                    .build().toStateDescription())
            .build();

    private final Collection<ChannelType> CHANNEL_TYPES;

    private final Map<LocalizedKey, @Nullable ChannelType> localizedChannelTypeCache = new ConcurrentHashMap<>();

    private final ChannelTypeI18nLocalizationService channelTypeI18nLocalizationService;
    private final BundleResolver bundleResolver;
    private final StateDescriptionFragmentBuilderFactory stateDescriptionFragmentBuilderFactory;

    @Activate
    public DefaultSystemChannelTypeProvider(
            final @Reference ChannelTypeI18nLocalizationService channelTypeI18nLocalizationService,
            final @Reference BundleResolver bundleResolver,
            final @Reference StateDescriptionFragmentBuilderFactory stateDescriptionFragmentBuilderFactory) {
        this.channelTypeI18nLocalizationService = channelTypeI18nLocalizationService;
        this.bundleResolver = bundleResolver;
        this.stateDescriptionFragmentBuilderFactory = stateDescriptionFragmentBuilderFactory;
        CHANNEL_TYPES = Collections.unmodifiableList(Stream.of(SYSTEM_CHANNEL_SIGNAL_STRENGTH, SYSTEM_CHANNEL_LOW_BATTERY,
                SYSTEM_CHANNEL_BATTERY_LEVEL, SYSTEM_TRIGGER, SYSTEM_RAWBUTTON, SYSTEM_BUTTON, SYSTEM_RAWROCKER,
                SYSTEM_POWER, SYSTEM_LOCATION, SYSTEM_MOTION, SYSTEM_BRIGHTNESS, SYSTEM_COLOR,
                SYSTEM_COLOR_TEMPERATURE, SYSTEM_VOLUME, SYSTEM_MUTE, SYSTEM_MEDIA_CONTROL, SYSTEM_MEDIA_TITLE,
                SYSTEM_MEDIA_ARTIST, SYSTEM_WIND_DIRECTION, SYSTEM_WIND_SPEED, SYSTEM_OUTDOOR_TEMPERATURE,
                SYSTEM_ATMOSPHERIC_HUMIDITY, SYSTEM_BAROMETRIC_PRESSURE)
            .map(function -> function.apply(stateDescriptionFragmentBuilderFactory))
            .collect(Collectors.toList()));
    }

    @Override
    public Collection<ChannelType> getChannelTypes(@Nullable Locale locale) {
        final List<ChannelType> allChannelTypes = new ArrayList<>();
        final Bundle bundle = bundleResolver.resolveBundle(DefaultSystemChannelTypeProvider.class);

        for (final ChannelType channelType : CHANNEL_TYPES) {
            allChannelTypes.add(createLocalizedChannelType(bundle, channelType, locale));
        }
        return allChannelTypes;
    }

    @Override
    public @Nullable ChannelType getChannelType(ChannelTypeUID channelTypeUID, @Nullable Locale locale) {
        final Bundle bundle = bundleResolver.resolveBundle(DefaultSystemChannelTypeProvider.class);

        for (final ChannelType channelType : CHANNEL_TYPES) {
            if (channelTypeUID.equals(channelType.getUID())) {
                return createLocalizedChannelType(bundle, channelType, locale);
            }
        }
        return null;
    }

    private ChannelType createLocalizedChannelType(Bundle bundle, ChannelType channelType, @Nullable Locale locale) {
        LocalizedKey localizedKey = getLocalizedChannelTypeKey(channelType.getUID(), locale);

        ChannelType cachedEntry = localizedChannelTypeCache.get(localizedKey);
        if (cachedEntry != null) {
            return cachedEntry;
        }

        ChannelType localizedChannelType = localize(bundle, channelType, locale);
        if (localizedChannelType != null) {
            localizedChannelTypeCache.put(localizedKey, localizedChannelType);
            return localizedChannelType;
        } else {
            return channelType;
        }
    }

    private @Nullable ChannelType localize(Bundle bundle, ChannelType channelType, @Nullable Locale locale) {
        if (channelTypeI18nLocalizationService == null) {
            return null;
        }
        return channelTypeI18nLocalizationService.createLocalizedChannelType(bundle, channelType, locale);
    }

    private LocalizedKey getLocalizedChannelTypeKey(UID uid, @Nullable Locale locale) {
        return new LocalizedKey(uid, locale != null ? locale.toLanguageTag() : null);
    }
}
