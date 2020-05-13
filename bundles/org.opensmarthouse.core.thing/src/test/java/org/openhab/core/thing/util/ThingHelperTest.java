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
package org.openhab.core.thing.util;

import static java.util.Collections.singletonList;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.openhab.core.config.core.Configuration;
import org.openhab.core.config.core.compat.NormalizerFactoryDelegate;
import org.openhab.core.thing.Channel;
import org.openhab.core.thing.ChannelTestHelper;
import org.openhab.core.thing.ChannelUID;
import org.openhab.core.thing.Thing;
import org.openhab.core.thing.ThingTypeUID;
import org.openhab.core.thing.ThingUID;

/**
 * @author Alex Tugarev - Initial contribution
 */
@RunWith(MockitoJUnitRunner.class)
public class ThingHelperTest {

    private static final ThingTypeUID THING_TYPE_UID = new ThingTypeUID("binding:type");
    private static final ThingUID THING_UID = new ThingUID(THING_TYPE_UID, "thingId");

    @Mock
    private Thing thingA;

    @Mock
    private Thing thingB;

    @Test
    public void twoTechnicalEqualThingInstancesAreDetectedAsEqual() {
        Configuration configurationA = new Configuration();
        configurationA.put("prop1", "value1");
        configurationA.put("prop2", "value2");

        when(thingA.getUID()).thenReturn(THING_UID);
        when(thingA.getChannels()).thenAnswer((invocation) -> Arrays.asList(
                ChannelTestHelper.create(new ChannelUID("binding:type:thingId:channel1"), "itemType"),
                ChannelTestHelper.create(new ChannelUID("binding:type:thingId:channel2"), "itemType")
        ));
        when(thingA.getConfiguration()).thenReturn(configurationA);

        assertTrue(ThingHelper.equals(thingA, thingA));

        Configuration configurationB = new Configuration();
        configurationB.put("prop1", "value1");
        configurationB.put("prop2", "value2");
        when(thingB.getUID()).thenReturn(THING_UID);
        when(thingB.getChannels()).thenAnswer((invocation) -> Arrays.asList(
                ChannelTestHelper.create(new ChannelUID("binding:type:thingId:channel2"), "itemType"),
                ChannelTestHelper.create(new ChannelUID("binding:type:thingId:channel1"), "itemType")
        ));
        when(thingB.getConfiguration()).thenReturn(configurationB);

        assertTrue(ThingHelper.equals(thingA, thingB));
    }

    @Test
    public void twoThingsAreDifferentAfterPropertiesWereModified() {
        // first thing
        Configuration configurationA = new Configuration();
        configurationA.put("prop1", "value1");

        when(thingA.getUID()).thenReturn(THING_UID);
        when(thingA.getChannels()).thenAnswer((invocation) -> Arrays.asList(
                ChannelTestHelper.create(new ChannelUID("binding:type:thingId:channel1"), "itemType"),
                ChannelTestHelper.create(new ChannelUID("binding:type:thingId:channel2"), "itemType")
        ));
        when(thingA.getConfiguration()).thenReturn(configurationA);

        // second thing
        Configuration configurationB = new Configuration();
        configurationB.put("prop1", "value1");

        when(thingB.getUID()).thenReturn(THING_UID);
        when(thingB.getChannels()).thenAnswer((invocation) -> Arrays.asList(
                ChannelTestHelper.create(new ChannelUID("binding:type:thingId:channel2"), "itemType"),
                ChannelTestHelper.create(new ChannelUID("binding:type:thingId:channel1"), "itemType")
        ));
        when(thingB.getConfiguration()).thenReturn(configurationB);

        // actual test
        assertTrue(ThingHelper.equals(thingA, thingB));

        configurationB.put("prop3", "value3");

        assertFalse(ThingHelper.equals(thingA, thingB));
    }

    @Test
    public void twoThingsAreDifferentAfterChannelsWereModified() {
        when(thingA.getUID()).thenReturn(THING_UID);
        when(thingA.getConfiguration()).thenReturn(new Configuration());

        when(thingB.getUID()).thenReturn(THING_UID);
        when(thingB.getConfiguration()).thenReturn(new Configuration());

        assertTrue(ThingHelper.equals(thingA, thingB));

        when(thingB.getChannels()).thenAnswer((invocation) -> singletonList(
                ChannelTestHelper.create(new ChannelUID("binding:type:thingId:channel3"), "itemType3"))
        );

        assertFalse(ThingHelper.equals(thingA, thingB));
    }

    @Test
    public void twoThingsAreDifferentAfterLabelWasModified() {
        when(thingA.getUID()).thenReturn(THING_UID);
        when(thingA.getConfiguration()).thenReturn(new Configuration());
        when(thingA.getLabel()).thenReturn("foo");

        when(thingB.getUID()).thenReturn(THING_UID);
        when(thingB.getConfiguration()).thenReturn(new Configuration());
        when(thingB.getLabel()).thenReturn("foo");

        assertTrue(ThingHelper.equals(thingA, thingB));

        when(thingB.getLabel()).thenReturn("bar");

        assertFalse(ThingHelper.equals(thingA, thingB));
    }

    @Test
    public void twoThingsAreDifferentAfterLocationWasModified() {
        when(thingA.getUID()).thenReturn(THING_UID);
        when(thingA.getConfiguration()).thenReturn(new Configuration());
        when(thingA.getLocation()).thenReturn("foo");

        when(thingB.getUID()).thenReturn(THING_UID);
        when(thingB.getConfiguration()).thenReturn(new Configuration());
        when(thingB.getLocation()).thenReturn("foo");

        assertTrue(ThingHelper.equals(thingA, thingB));

        when(thingB.getLocation()).thenReturn("bar");

        assertFalse(ThingHelper.equals(thingA, thingB));
    }

}
