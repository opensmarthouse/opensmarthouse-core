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
package org.openhab.core.thing.util;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;
import static org.openhab.core.thing.binding.builder.ThingStatusInfoBuilder.create;
import static org.openhab.core.thing.util.ThingHandlerHelper.isHandlerInitialized;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;
import org.openhab.core.thing.Thing;
import org.openhab.core.thing.ThingStatus;
import org.openhab.core.thing.ThingTypeUID;
import org.openhab.core.thing.ThingUID;
import org.openhab.core.thing.binding.ThingHandler;
import org.openhab.core.thing.binding.builder.ThingBuilder;

/**
 * Test for the ThingHandlerHelper
 *
 * @author Simon Kaufmann - Initial contribution
 * @author Wouter Born - Migrate tests from Groovy to Java
 */
@RunWith(MockitoJUnitRunner.class)
public class ThingHandlerHelperTest {

    @Mock
    private Thing thing;

    @Mock
    private ThingHandler thingHandler;

    @Test
    public void assertIsHandlerInitializedWorksCorrectlyForAThingStatus() {
        assertThat(isHandlerInitialized(ThingStatus.UNINITIALIZED), is(false));
        assertThat(isHandlerInitialized(ThingStatus.INITIALIZING), is(false));
        assertThat(isHandlerInitialized(ThingStatus.REMOVING), is(false));
        assertThat(isHandlerInitialized(ThingStatus.REMOVED), is(false));
        assertThat(isHandlerInitialized(ThingStatus.UNKNOWN), is(true));
        assertThat(isHandlerInitialized(ThingStatus.ONLINE), is(true));
        assertThat(isHandlerInitialized(ThingStatus.OFFLINE), is(true));
    }

    @Test
    public void assertIsHandlerInitializedWorksCorrectlyForAThing() {
        when(thing.getStatus()).thenReturn(ThingStatus.UNINITIALIZED);
        assertThat(isHandlerInitialized(thing), is(false));

        when(thing.getStatus()).thenReturn(ThingStatus.INITIALIZING);
        assertThat(isHandlerInitialized(thing), is(false));

        when(thing.getStatus()).thenReturn(ThingStatus.REMOVING);
        assertThat(isHandlerInitialized(thing), is(false));

        when(thing.getStatus()).thenReturn(ThingStatus.REMOVED);
        assertThat(isHandlerInitialized(thing), is(false));

        when(thing.getStatus()).thenReturn(ThingStatus.UNKNOWN);
        assertThat(isHandlerInitialized(thing), is(true));

        when(thing.getStatus()).thenReturn(ThingStatus.ONLINE);
        assertThat(isHandlerInitialized(thing), is(true));

        when(thing.getStatus()).thenReturn(ThingStatus.OFFLINE);
        assertThat(isHandlerInitialized(thing), is(true));
    }

    @Test
    public void assertIsHandlerInitializedWorksCorrectlyForAThingHandler() {
        when(thingHandler.getThing()).thenReturn(thing);

        when(thing.getStatus()).thenReturn(ThingStatus.UNINITIALIZED);
        assertThat(isHandlerInitialized(thingHandler), is(false));

        when(thing.getStatus()).thenReturn(ThingStatus.INITIALIZING);
        assertThat(isHandlerInitialized(thingHandler), is(false));

        when(thing.getStatus()).thenReturn(ThingStatus.REMOVING);
        assertThat(isHandlerInitialized(thingHandler), is(false));

        when(thing.getStatus()).thenReturn(ThingStatus.REMOVED);
        assertThat(isHandlerInitialized(thingHandler), is(false));

        when(thing.getStatus()).thenReturn(ThingStatus.UNKNOWN);
        assertThat(isHandlerInitialized(thingHandler), is(true));

        when(thing.getStatus()).thenReturn(ThingStatus.ONLINE);
        assertThat(isHandlerInitialized(thingHandler), is(true));

        when(thing.getStatus()).thenReturn(ThingStatus.OFFLINE);
        assertThat(isHandlerInitialized(thingHandler), is(true));
    }
}
