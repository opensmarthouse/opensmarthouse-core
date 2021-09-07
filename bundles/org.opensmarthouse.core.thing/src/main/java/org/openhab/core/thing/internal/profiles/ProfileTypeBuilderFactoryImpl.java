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
package org.openhab.core.thing.internal.profiles;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.openhab.core.thing.profiles.ProfileTypeBuilder;
import org.openhab.core.thing.profiles.ProfileTypeBuilderFactory;
import org.openhab.core.thing.profiles.ProfileTypeUID;
import org.openhab.core.thing.profiles.StateProfileType;
import org.openhab.core.thing.profiles.TriggerProfileType;
import org.osgi.service.component.annotations.Component;

/**
 * Default implementation of {@link ProfileTypeBuilderFactory}.
 *
 * @author Łukasz Dywicki - Initial contribution
 */
@NonNullByDefault
@Component(service = ProfileTypeBuilderFactory.class)
public final class ProfileTypeBuilderFactoryImpl implements ProfileTypeBuilderFactory {

    @Override
    public ProfileTypeBuilder<StateProfileType> newState(ProfileTypeUID profileTypeUID, String label) {
        return ProfileTypeBuilder.newState(profileTypeUID, label);
    }

    @Override
    public ProfileTypeBuilder<TriggerProfileType> newTrigger(ProfileTypeUID profileTypeUID, String label) {
        return ProfileTypeBuilder.newTrigger(profileTypeUID, label);
    }

}
