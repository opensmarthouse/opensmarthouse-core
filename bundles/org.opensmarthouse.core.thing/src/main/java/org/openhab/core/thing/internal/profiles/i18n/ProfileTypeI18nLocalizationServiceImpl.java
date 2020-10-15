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
package org.openhab.core.thing.internal.profiles.i18n;

import java.util.Locale;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.i18n.TranslationProvider;
import org.openhab.core.thing.profiles.ProfileType;
import org.openhab.core.thing.profiles.ProfileTypeBuilder;
import org.openhab.core.thing.profiles.ProfileTypeBuilderFactory;
import org.openhab.core.thing.profiles.ProfileTypeUID;
import org.openhab.core.thing.profiles.StateProfileType;
import org.openhab.core.thing.profiles.TriggerProfileType;
import org.openhab.core.thing.profiles.i18n.ProfileTypeI18nLocalizationService;
import org.osgi.framework.Bundle;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * Default implementation of {@link ProfileTypeI18nLocalizationService}.
 *
 * @author Łukasz Dywicki - Initial contribution
 */
@Component(service = ProfileTypeI18nLocalizationService.class)
public class ProfileTypeI18nLocalizationServiceImpl implements ProfileTypeI18nLocalizationService {

    private final ProfileTypeBuilderFactory profileTypeBuilderFactory;
    private final ProfileI18nUtil profileI18nUtil;

    @Activate
    public ProfileTypeI18nLocalizationServiceImpl(final @Reference ProfileTypeBuilderFactory profileTypeBuilderFactory,
            final @Reference TranslationProvider i18nProvider) {
        this.profileTypeBuilderFactory = profileTypeBuilderFactory;
        this.profileI18nUtil = new ProfileI18nUtil(i18nProvider);
    }

    @Override
    public ProfileType createLocalizedProfileType(Bundle bundle, ProfileType profileType, @Nullable Locale locale) {
        ProfileTypeUID profileTypeUID = profileType.getUID();
        String defaultLabel = profileType.getLabel();
        String label = profileI18nUtil.getProfileLabel(bundle, profileTypeUID, defaultLabel, locale);

        if (profileType instanceof StateProfileType) {
            return profileTypeBuilderFactory.newState(profileTypeUID, label != null ? label : defaultLabel)
                    .withSupportedItemTypes(profileType.getSupportedItemTypes())
                    .withSupportedItemTypesOfChannel(((StateProfileType) profileType).getSupportedItemTypesOfChannel())
                    .build();
        } else if (profileType instanceof TriggerProfileType) {
            return profileTypeBuilderFactory.newTrigger(profileTypeUID, label != null ? label : defaultLabel)
                    .withSupportedItemTypes(profileType.getSupportedItemTypes())
                    .withSupportedChannelTypeUIDs(((TriggerProfileType) profileType).getSupportedChannelTypeUIDs())
                    .build();
        } else {
            return profileType;
        }
    }
}
