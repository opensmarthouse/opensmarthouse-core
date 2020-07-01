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
package org.openhab.core.thing.xml.internal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.net.URI;
import java.net.URL;
import java.util.List;

import org.junit.Test;
import org.openhab.core.config.core.ConfigDescription;
import org.openhab.core.config.core.ConfigDescriptionParameter;
import org.openhab.core.config.core.ConfigDescriptionParameter.Type;
import org.openhab.core.config.core.ParameterDeviceProperty;
import org.openhab.core.internal.types.CoreCommandDescriptionBuilderFactory;
import org.openhab.core.thing.ThingTypeUID;
import org.openhab.core.thing.internal.type.ChannelTypeBuilderFactoryImpl;
import org.openhab.core.thing.type.ChannelTypeBuilderFactory;
import org.openhab.core.types.CommandDescriptionBuilderFactory;

/**
 * The {@link Example} test case is a usage example how the according {@code ThingType} parser
 * can be used. This example can also be used for manual tests when the schema is extended or
 * changed.
 *
 * @author Michael Grammling - Initial contribution
 * @author Łukasz Dywicki - Added builder factories
 * @author Chris Jackson - Added checks to confirm the test works
 */
public class Example {

    @Test
    public void test() throws Exception {
        ChannelTypeBuilderFactory channelTypeBuilderFactory = new ChannelTypeBuilderFactoryImpl();
        CommandDescriptionBuilderFactory commandDescriptionBuilderFactory = new CoreCommandDescriptionBuilderFactory();

        URL channelsURL = Example.class.getClassLoader().getResource("example/example.xml");

        ThingDescriptionReader reader = new ThingDescriptionReader(channelTypeBuilderFactory,
                commandDescriptionBuilderFactory);
        ThingDescriptionList thingList = (ThingDescriptionList) reader.readFromXML(channelsURL);

        assertNotNull(thingList);
        ThingTypeXmlResult thingType;
        ChannelTypeXmlResult channelType;
        ConfigDescription configDescription;

        assertTrue(thingList.get(0) instanceof ThingTypeXmlResult);
        thingType = (ThingTypeXmlResult) thingList.get(0);
        assertEquals(new ThingTypeUID("hue:lamp"), thingType.getUID());

        assertTrue(thingList.get(1) instanceof ChannelTypeXmlResult);
        channelType = (ChannelTypeXmlResult) thingList.get(1);
        assertNotNull(channelType.getConfigDescription());

        assertTrue(thingList.get(2) instanceof ChannelTypeXmlResult);
        channelType = (ChannelTypeXmlResult) thingList.get(2);
        assertNotNull(channelType.getConfigDescription());
        configDescription = channelType.getConfigDescription();

        assertEquals(new URI("channel-type:hue:brightness"), configDescription.getUID());

        List<ConfigDescriptionParameter> parameters = configDescription.getParameters();
        assertEquals(1, parameters.size());

        ConfigDescriptionParameter parameter = parameters.get(0);

        assertEquals("lastDimValue", parameter.getName());
        assertEquals(Type.BOOLEAN, parameter.getType());
        assertFalse(parameter.isReadOnly());

        List<ParameterDeviceProperty> deviceProperties = parameter.getDeviceProperties();
        assertEquals(2, deviceProperties.size());

        assertEquals("parameter", deviceProperties.get(0).getName());
        assertEquals("12", deviceProperties.get(0).getValue());

        assertEquals("size", deviceProperties.get(1).getName());
        assertEquals("2", deviceProperties.get(1).getValue());
    }
}
