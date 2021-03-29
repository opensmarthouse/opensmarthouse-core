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
package org.openhab.core.thing.internal.profiles;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.openhab.core.config.core.Configuration;
import org.openhab.core.library.CoreItemFactory;
import org.openhab.core.test.java.JavaOSGiTest;
import org.openhab.core.thing.Channel;
import org.openhab.core.thing.ChannelUID;
import org.openhab.core.thing.binding.builder.ChannelBuilder;
import org.openhab.core.thing.profiles.ProfileCallback;
import org.openhab.core.thing.profiles.ProfileContext;
import org.openhab.core.thing.profiles.ProfileType;
import org.openhab.core.thing.profiles.ProfileTypeProvider;
import org.openhab.core.thing.profiles.ProfileTypeUID;
import org.openhab.core.thing.profiles.SystemProfiles;
import org.openhab.core.thing.type.ChannelType;

/**
 * Test cases for the {@link SystemProfileFactory} class.
 *
 * @author Simon Kaufmann - Initial contribution
 */
public class SystemProfileFactoryOSGiTest extends JavaOSGiTest {

    private final Map<String, Object> properties = Map.of(SystemOffsetProfile.OFFSET_PARAM, BigDecimal.ZERO,
            SystemHysteresisStateProfile.LOWER_PARAM, BigDecimal.TEN);

    private SystemProfileFactory profileFactory;

    @Mock
    private ProfileCallback mockCallback;

    @Mock
    private ProfileContext mockContext;

    @Before
    public void setUp() {
        profileFactory = getService(ProfileTypeProvider.class, SystemProfileFactory.class);
        assertNotNull(profileFactory);

        mockCallback = mock(ProfileCallback.class);

        mockContext = mock(ProfileContext.class);
        when(mockContext.getConfiguration()).thenReturn(new Configuration(properties));
    }

    @Test
    public void systemProfileTypesAndUidsShouldBeAvailable() {
        Collection<ProfileTypeUID> systemProfileTypeUIDs = profileFactory.getSupportedProfileTypeUIDs();
        assertEquals(16, systemProfileTypeUIDs.size());

        Collection<ProfileType> systemProfileTypes = profileFactory.getProfileTypes(null);
        assertEquals(systemProfileTypeUIDs.size(), systemProfileTypes.size());
    }

    @Test
    public void testFactoryCreatesAvailableProfiles() {
        for (ProfileTypeUID profileTypeUID : profileFactory.getSupportedProfileTypeUIDs()) {
            assertNotNull(profileFactory.createProfile(profileTypeUID, mockCallback, mockContext));
        }
    }

    @Test
    public void testGetSuggestedProfileTypeUIDNullChannelType1() {
        assertNull(profileFactory.getSuggestedProfileTypeUID((ChannelType) null, CoreItemFactory.SWITCH));
    }

    @Test
    public void testGetSuggestedProfileTypeUIDNullChannelType2() {
        Channel channel = ChannelBuilder.create(new ChannelUID("test:test:test:test"), CoreItemFactory.SWITCH).build();
        assertEquals(SystemProfiles.DEFAULT,
                profileFactory.getSuggestedProfileTypeUID(channel, CoreItemFactory.SWITCH));
    }
}
