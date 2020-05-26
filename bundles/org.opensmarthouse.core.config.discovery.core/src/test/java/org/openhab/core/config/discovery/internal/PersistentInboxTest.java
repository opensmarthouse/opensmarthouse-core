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

import static org.hamcrest.collection.IsMapContaining.hasEntry;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.nullable;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import java.math.BigDecimal;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.openhab.core.config.core.ConfigDescription;
import org.openhab.core.config.core.ConfigDescriptionBuilder;
import org.openhab.core.config.core.ConfigDescriptionParameter.Type;
import org.openhab.core.config.core.ConfigDescriptionParameterBuilder;
import org.openhab.core.config.core.ConfigDescriptionRegistry;
import org.openhab.core.config.core.Configuration;
import org.openhab.core.config.core.compat.NormalizerFactoryDelegate;
import org.openhab.core.config.discovery.DiscoveryResult;
import org.openhab.core.config.discovery.DiscoveryServiceRegistry;
import org.openhab.core.config.discovery.inbox.events.InboxAddedEvent;
import org.openhab.core.config.discovery.inbox.events.InboxUpdatedEvent;
import org.openhab.core.events.EventPublisher;
import org.openhab.core.storage.Storage;
import org.openhab.core.storage.StorageService;
import org.openhab.core.thing.ManagedThingProvider;
import org.openhab.core.thing.Thing;
import org.openhab.core.thing.ThingRegistry;
import org.openhab.core.thing.ThingTypeUID;
import org.openhab.core.thing.ThingUID;
import org.openhab.core.thing.binding.ThingFactory;
import org.openhab.core.thing.binding.ThingHandlerFactory;
import org.openhab.core.thing.type.ThingType;
import org.openhab.core.thing.type.ThingTypeBuilder;
import org.openhab.core.thing.type.ThingTypeRegistry;

/**
 * @author Simon Kaufmann - Initial contribution
 */
public class PersistentInboxTest {

    private static final ThingTypeUID THING_TYPE_UID = new ThingTypeUID("test", "test");
    private static final ThingUID THING_UID = new ThingUID(THING_TYPE_UID, "test");

    private PersistentInbox inbox;

    @Mock
    private ThingRegistry thingRegistry;
    private Thing lastAddedThing = null;

    @Mock
    private StorageService storageService;

    @Mock
    private Storage<Object> storage;

    @Mock
    private ManagedThingProvider thingProvider;

    @Mock
    private ThingTypeRegistry thingTypeRegistry;

    @Mock
    private ConfigDescriptionRegistry configDescriptionRegistry;

    @Mock
    private ThingHandlerFactory thingHandlerFactory;

    @Mock
    private Thing thing;

    @Mock
    private ThingFactory thingFactory;

    @Before
    public void setup() {
        initMocks(this);
        when(storageService.getStorage(any(String.class), any(ClassLoader.class))).thenReturn(storage);
        doAnswer(invocation -> lastAddedThing = (Thing) invocation.getArguments()[0]).when(thingRegistry)
                .add(any(Thing.class));

        when(thingHandlerFactory.supportsThingType(eq(THING_TYPE_UID))).thenReturn(true);
        when(thingHandlerFactory.createThing(eq(THING_TYPE_UID), any(Configuration.class), eq(THING_UID), any()))
                .thenAnswer(new MockedThingAnswer(thing));

        inbox = new PersistentInbox(storageService, mock(DiscoveryServiceRegistry.class), thingRegistry, thingFactory,
                thingProvider, thingTypeRegistry, configDescriptionRegistry);
        inbox.addThingHandlerFactory(thingHandlerFactory);

        // mork normalizer is static and shared, hence we need to reset its state before each test
        reset(NormalizerFactoryDelegate.getMock());
    }

    @Test
    public void testConfigUpdateNormalizationGuessType() {
        Map<String, Object> props = new HashMap<>();
        props.put("foo", 1);
        Configuration config = new Configuration(props);
        Thing thing = mock(Thing.class);
        when(thing.getUID()).thenReturn(THING_UID);
        when(thing.getThingTypeUID()).thenReturn(THING_TYPE_UID);
        when(thing.getConfiguration()).thenReturn(config);

        when(thingRegistry.get(eq(THING_UID))).thenReturn(thing);

        assertTrue(thing.getConfiguration().get("foo") instanceof BigDecimal);

        inbox.activate();
        inbox.add(new DiscoveryResultBuilderFactoryImpl().create(THING_UID).withProperty("foo", 3).build());

        assertTrue(thing.getConfiguration().get("foo") instanceof BigDecimal);
        assertEquals(new BigDecimal(3), thing.getConfiguration().get("foo"));
    }

    @Test
    public void testConfigUpdateNormalizationWithConfigDescription() throws Exception {
        Map<String, Object> props = new HashMap<>();
        props.put("foo", "1");
        Configuration config = new Configuration(props);
        Thing thing = mock(Thing.class);
        when(thing.getUID()).thenReturn(THING_UID);
        when(thing.getThingTypeUID()).thenReturn(THING_TYPE_UID);
        when(thing.getConfiguration()).thenReturn(config);
        configureConfigDescriptionRegistryMock("foo", Type.TEXT);
        when(thingRegistry.get(eq(THING_UID))).thenReturn(thing);
        when(NormalizerFactoryDelegate.getMock().normalize(3)).thenReturn("3");

        assertTrue(thing.getConfiguration().get("foo") instanceof String);

        inbox.activate();
        inbox.add(new DiscoveryResultBuilderFactoryImpl().create(THING_UID).withProperty("foo", 3).build());

        assertTrue(thing.getConfiguration().get("foo") instanceof String);
        assertEquals("3", thing.getConfiguration().get("foo"));
    }

    @Test
    public void testApproveNormalization() throws Exception {
        DiscoveryResult result = new DiscoveryResultBuilderFactoryImpl().create(THING_UID).withProperty("foo", 3)
                .build();
        configureConfigDescriptionRegistryMock("foo", Type.TEXT);
        when(storage.getValues()).thenReturn(Collections.singletonList(result));

        when(thingFactory.createThing(eq(THING_UID), any(Configuration.class), any(Map.class), nullable(ThingUID.class),
                eq(THING_TYPE_UID), anyList())).thenAnswer(new MockedThingAnswer(thing));
        when(NormalizerFactoryDelegate.getMock().normalize(3)).thenReturn("3");

        inbox.activate();
        inbox.approve(THING_UID, "Test");

        assertTrue(lastAddedThing.getConfiguration().get("foo") instanceof String);
        assertEquals("3", lastAddedThing.getConfiguration().get("foo"));
    }

    @Test
    public void testEmittedAddedResultIsReadFromStorage() {
        DiscoveryResult result = new DiscoveryResultBuilderFactoryImpl().create(THING_UID).withProperty("foo", 3)
                .build();

        EventPublisher eventPublisher = mock(EventPublisher.class);
        inbox.setEventPublisher(eventPublisher);

        when(storage.get(THING_UID.toString())) //
                .thenReturn(null) //
                .thenReturn(
                        new DiscoveryResultBuilderFactoryImpl().create(THING_UID).withProperty("foo", "bar").build());

        inbox.activate();
        inbox.add(result);

        // 1st call checks existence of the result in the storage (returns null)
        // 2nd call retrieves the stored instance before the event gets emitted
        // (modified due to storage mock configuration)
        verify(storage, times(2)).get(THING_UID.toString());

        ArgumentCaptor<InboxAddedEvent> eventCaptor = ArgumentCaptor.forClass(InboxAddedEvent.class);
        verify(eventPublisher).post(eventCaptor.capture());
        assertThat(eventCaptor.getValue().getDiscoveryResult().properties, hasEntry("foo", "bar"));
    }

    @Test
    public void testEmittedUpdatedResultIsReadFromStorage() {
        DiscoveryResult result = new DiscoveryResultBuilderFactoryImpl().create(THING_UID).withProperty("foo", 3)
                .build();

        EventPublisher eventPublisher = mock(EventPublisher.class);
        inbox.setEventPublisher(eventPublisher);

        when(storage.get(THING_UID.toString())) //
                .thenReturn(result) //
                .thenReturn(
                        new DiscoveryResultBuilderFactoryImpl().create(THING_UID).withProperty("foo", "bar").build());

        inbox.activate();
        inbox.add(result);

        // 1st call checks existence of the result in the storage (returns the original result)
        // 2nd call retrieves the stored instance before the event gets emitted
        // (modified due to storage mock configuration)
        verify(storage, times(2)).get(THING_UID.toString());

        ArgumentCaptor<InboxUpdatedEvent> eventCaptor = ArgumentCaptor.forClass(InboxUpdatedEvent.class);
        verify(eventPublisher).post(eventCaptor.capture());
        assertThat(eventCaptor.getValue().getDiscoveryResult().properties, hasEntry("foo", "bar"));
    }

    private void configureConfigDescriptionRegistryMock(String paramName, Type type) throws URISyntaxException {
        URI configDescriptionURI = new URI("thing-type:test:test");
        ThingType thingType = ThingTypeBuilder.instance(THING_TYPE_UID, "Test")
                .withConfigDescriptionURI(configDescriptionURI).build();
        ConfigDescription configDesc = ConfigDescriptionBuilder.create(configDescriptionURI)
                .withParameter(ConfigDescriptionParameterBuilder.create(paramName, type).build()).build();

        when(thingTypeRegistry.getThingType(THING_TYPE_UID)).thenReturn(thingType);
        when(configDescriptionRegistry.getConfigDescription(eq(configDescriptionURI))).thenReturn(configDesc);
    }
}
