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
package org.openhab.core.config.discovery.internal;

import static org.mockito.Mockito.when;

import java.util.Map;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.openhab.core.config.core.Configuration;
import org.openhab.core.thing.Thing;
import org.openhab.core.thing.ThingTypeUID;
import org.openhab.core.thing.ThingUID;

/**
 * A very basic mock stub for {@link org.openhab.core.thing.binding.ThingFactory#createThing} which simply uses received
 * arguments to mock given 'thing' instance.
 *
 * @author Łukasz Dywicki - Initial contribution.
 */
public class MockedThingAnswer implements Answer<Thing> {

    private final Thing mock;

    public MockedThingAnswer(Thing mock) {
        this.mock = mock;
    }

    @Override
    public Thing answer(InvocationOnMock invocation) throws Throwable {
        when(mock.getUID()).thenReturn((ThingUID) invocation.getArguments()[0]);
        when(mock.getThingTypeUID()).thenReturn((ThingTypeUID) invocation.getArguments()[4]);
        when(mock.getBridgeUID()).thenReturn((ThingUID) invocation.getArguments()[3]);
        when(mock.getConfiguration()).thenReturn((Configuration) invocation.getArguments()[1]);
        when(mock.getProperties()).thenReturn((Map) invocation.getArguments()[2]);

        return mock;
    }
}
