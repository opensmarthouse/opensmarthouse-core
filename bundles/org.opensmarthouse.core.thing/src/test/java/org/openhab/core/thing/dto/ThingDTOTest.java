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
package org.openhab.core.thing.dto;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.hamcrest.collection.IsMapContaining;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.openhab.core.config.core.Configuration;
import org.openhab.core.library.CoreItemFactory;
import org.openhab.core.thing.Bridge;
import org.openhab.core.thing.Channel;
import org.openhab.core.thing.ChannelUID;
import org.openhab.core.thing.Thing;
import org.openhab.core.thing.ThingTypeUID;
import org.openhab.core.thing.ThingUID;
import org.openhab.core.thing.binding.ThingBuilderFactory;
import org.openhab.core.thing.binding.builder.ChannelBuilder;
import org.openhab.core.thing.binding.builder.ThingBuilder;

/**
 * This is the test class for {@link ThingDTO}.
 *
 * @author Christoph Weitkamp - Initial contribution
 */
@RunWith(MockitoJUnitRunner.class)
public class ThingDTOTest {

    private static final ThingTypeUID THING_TYPE_UID = new ThingTypeUID("binding-id", "thing-type-id");
    private static final ThingUID THING_UID = new ThingUID(THING_TYPE_UID, "thing-id");
    private final Map<String, String> properties = Collections.singletonMap("key1", "value1");

    @Test
    public void testThingDTOMapping() {
        Thing subject = mock(Thing.class);
        when(subject.getUID()).thenReturn(THING_UID);
        when(subject.getThingTypeUID()).thenReturn(THING_TYPE_UID);
        when(subject.getBridgeUID()).thenReturn(new ThingUID(new ThingTypeUID("binding-id", "bridge-type-id"), "bridge-id"));
        when(subject.getChannels()).thenReturn(Arrays.asList(
                ChannelBuilder.create(new ChannelUID(THING_UID, "channel1"), CoreItemFactory.STRING).build(),
                ChannelBuilder.create(new ChannelUID(THING_UID, "channel2"), CoreItemFactory.STRING).build())
        );
        when(subject.getConfiguration()).thenReturn(new Configuration(Collections.singletonMap("param1", "value1")));
        when(subject.getProperties()).thenReturn(properties);
        when(subject.getLocation()).thenReturn("Somewhere over the rainbow");

        ThingDTO result = ThingDTOMapper.map(subject);

        assertThat(result, is(instanceOf(ThingDTO.class)));
        assertThat(result.thingTypeUID, equalTo(THING_TYPE_UID.toString()));
        assertThat(result.UID, is(THING_UID.toString()));
        assertThat(result.label, is(subject.getLabel()));
        assertThat(result.bridgeUID, is(subject.getBridgeUID().toString()));
        assertThatChannelsArePresent(result.channels, subject.getChannels());
        assertThat(result.configuration, IsMapContaining.hasEntry("param1", "value1"));
        assertThat(result.properties, IsMapContaining.hasEntry("key1", "value1"));
        assertThat(result.properties, is(subject.getProperties()));
        assertThat(result.location, is(subject.getLocation()));
    }

    @Test
    public void testBridgeDTOMapping() {
        Bridge bridge = mock(Bridge.class);
        when(bridge.getUID()).thenReturn(THING_UID);
        when(bridge.getThingTypeUID()).thenReturn(THING_TYPE_UID);
        when(bridge.getConfiguration()).thenReturn(new Configuration());
        ThingDTO result = ThingDTOMapper.map(bridge);
        assertThat(result, is(instanceOf(ThingDTO.class)));
        assertThat(result.thingTypeUID, is(THING_TYPE_UID.toString()));
        assertThat(result.UID, is(THING_UID.toString()));
    }

    private void assertThatChannelsArePresent(List<ChannelDTO> actual, List<Channel> expected) {
        assertThat(actual, hasSize(expected.size()));
        actual.stream().map(channel -> channel.id).forEach(uid -> {
            Optional<String> mapped = expected.stream().map(Channel::getUID)
                .map(ChannelUID::getId)
                .filter(uid::equals)
                .findFirst();
            assertTrue(mapped.isPresent());
        });
    }

}
