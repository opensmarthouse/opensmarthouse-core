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
package org.openhab.core.model.thing.internal;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

import java.util.function.Function;
import java.util.function.Supplier;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.openhab.core.config.core.Configuration;
import org.openhab.core.service.ReadyMarker;
import org.openhab.core.test.mockito.MapArgument;
import org.openhab.core.test.mockito.MapBuilderToMock;
import org.openhab.core.thing.Bridge;
import org.openhab.core.thing.Thing;
import org.openhab.core.thing.ThingTypeUID;
import org.openhab.core.thing.ThingUID;
import org.openhab.core.thing.binding.ThingBuilderFactory;
import org.openhab.core.thing.binding.ThingHandlerFactory;
import org.openhab.core.thing.binding.builder.BridgeBuilder;
import org.openhab.core.thing.binding.builder.ThingBuilder;
import org.openhab.core.common.osgi.BundleResolver;
import org.openhab.core.model.core.EventType;
import org.openhab.core.model.core.ModelRepository;
import org.openhab.core.model.thing.thing.ModelBridge;
import org.openhab.core.model.thing.thing.ModelThing;
import org.openhab.core.model.thing.thing.ThingModel;
import org.junit.Before;
import org.junit.Test;
import org.osgi.framework.Bundle;

/**
 * Test the GenericThingProvider for different {@link ThingHandlerFactory}s for Bridge and Thing.
 *
 * @author Henning Treu - Initial contribution
 */
public class GenericThingProviderMultipleBundlesTest {

    private static final String BRIDGE_ID = "myBridge";
    private static final ThingTypeUID BRIDGE_TYPE_UID = new ThingTypeUID("test:bridge");
    private static final ThingUID BRIDGE_UID = new ThingUID(BRIDGE_TYPE_UID, BRIDGE_ID);

    private static final String THING_ID = "myThing";
    private static final ThingTypeUID THING_TYPE_UID = new ThingTypeUID("test:thing");
    private static final ThingUID THING_UID = new ThingUID(THING_TYPE_UID, THING_ID);

    private static final String BUNDLE_NAME = "myBundle";
    private static final String TEST_MODEL_THINGS = "testModel.things";
    private GenericThingProvider thingProvider;
    private ThingBuilderFactory thingBuilderFactory;
    private ThingHandlerFactory bridgeHandlerFactory;
    private ThingHandlerFactory thingHandlerFactory;

    @Before
    public void setup() {
        thingProvider = new GenericThingProvider();

        Bundle bundle = mock(Bundle.class);
        when(bundle.getSymbolicName()).thenReturn(BUNDLE_NAME);
        BundleResolver bundleResolver = mock(BundleResolver.class);
        when(bundleResolver.resolveBundle(any(Class.class))).thenReturn(bundle);

        thingProvider.setBundleResolver(bundleResolver);

        ModelRepository modelRepository = mock(ModelRepository.class);

        ThingModel thingModel = mock(ThingModel.class);
        EList<ModelThing> dslThings = createModelBridge();
        when(thingModel.getThings()).thenReturn(dslThings);
        when(modelRepository.getModel(TEST_MODEL_THINGS)).thenReturn(thingModel);

        thingProvider.setModelRepository(modelRepository);

        // configure bridgeHandlerFactory to accept the bridge type UID and create a bridge:
        Bridge bridge = mock(Bridge.class);
        when(bridge.getUID()).thenReturn(BRIDGE_UID);
        when(bridge.getThingTypeUID()).thenReturn(BRIDGE_TYPE_UID);
        when(bridge.getConfiguration()).thenReturn(new Configuration());

        bridgeHandlerFactory = mock(ThingHandlerFactory.class);
        when(bridgeHandlerFactory.supportsThingType(BRIDGE_TYPE_UID)).thenReturn(true);
        when(bridgeHandlerFactory.createThing(eq(BRIDGE_TYPE_UID), any(Configuration.class), eq(BRIDGE_UID), eq(null)))
                .thenReturn(bridge);
        thingProvider.addThingHandlerFactory(bridgeHandlerFactory);

        // configure thingHandlerFactory to accept the thing type UID and create a thing:
        Thing thing = mock(Thing.class);
        when(thing.getUID()).thenReturn(THING_UID);
        when(thing.getThingTypeUID()).thenReturn(THING_TYPE_UID);
        when(thing.getConfiguration()).thenReturn(new Configuration());

        thingHandlerFactory = mock(ThingHandlerFactory.class);
        when(thingHandlerFactory.supportsThingType(THING_TYPE_UID)).thenReturn(true);
        when(thingHandlerFactory.createThing(eq(THING_TYPE_UID), any(Configuration.class), eq(THING_UID),
                eq(BRIDGE_UID))).thenReturn(thing);
        thingProvider.addThingHandlerFactory(thingHandlerFactory);

        thingBuilderFactory = mock(ThingBuilderFactory.class);
        thingProvider.setThingBuilderFactory(thingBuilderFactory);
    }

    private EList<ModelThing> createModelBridge() {
        ModelBridge bridge = mock(ModelBridge.class);
        when(bridge.getId()).thenReturn(BRIDGE_UID.toString());
        when(bridge.getProperties()).thenReturn(new BasicEList<>(0));
        when(bridge.getChannels()).thenReturn(new BasicEList<>(0));

        EList<ModelThing> modelThings = createModelThing();
        when(bridge.getThings()).thenReturn(modelThings);

        BasicEList<ModelThing> result = new BasicEList<>();
        result.add(bridge);
        return result;
    }

    private EList<ModelThing> createModelThing() {
        ModelThing thing = mock(ModelThing.class);
        // simulate a nested defined thing model with only type id & id given:
        when(thing.getThingTypeId()).thenReturn("thing");
        when(thing.getThingId()).thenReturn(THING_ID);
        when(thing.getBridgeUID()).thenReturn(BRIDGE_UID.toString());
        when(thing.getProperties()).thenReturn(new BasicEList<>(0));
        when(thing.getChannels()).thenReturn(new BasicEList<>(0));

        BasicEList<ModelThing> result = new BasicEList<>();
        result.add(thing);
        return result;
    }

    @Test
    public void testDifferentHandlerFactoriesForBridgeAndThing() {
        BridgeBuilder bridgeBuilder = mock(BridgeBuilder.class, "bridgeBuilder");
        Bridge bridge = mock(Bridge.class, "bridge");
        builder(bridgeBuilder, () -> bridgeBuilder.withConfiguration(any()), bridge::getConfiguration, new MapArgument<>());
        builder(bridgeBuilder, () -> bridgeBuilder.withBridge(any()), bridge::getBridgeUID, new MapArgument<>());
        builder(bridgeBuilder, () -> bridgeBuilder.withLabel(any()), bridge::getLabel, new MapArgument<>());
        builder(bridgeBuilder, () -> bridgeBuilder.withLocation(any()), bridge::getLocation, new MapArgument<>());
        builder(bridgeBuilder, () -> bridgeBuilder.withChannels(anyList()), bridge::getChannels, new MapArgument<>());
        when(bridgeBuilder.build()).thenReturn(bridge);
        when(thingBuilderFactory.createBridge(any(), any())).thenAnswer(new RetainIdentifiers<>(bridgeBuilder, bridge));

        Thing thing = mock(Thing.class, "thing");
        ThingBuilder thingBuilder = mock(ThingBuilder.class, "thingBuilder");
        builder(thingBuilder, () -> thingBuilder.withConfiguration(any()), thing::getConfiguration, new MapArgument<>());
        builder(thingBuilder, () -> thingBuilder.withBridge(any()), thing::getBridgeUID, new MapArgument<>());
        builder(thingBuilder, () -> thingBuilder.withLabel(any()), thing::getLabel, new MapArgument<>());
        builder(thingBuilder, () -> thingBuilder.withLocation(any()), thing::getLocation, new MapArgument<>());
        builder(thingBuilder, () -> thingBuilder.withChannels(anyList()), thing::getChannels, new MapArgument<>());
        when(thingBuilder.build()).thenReturn(thing);
        when(thingBuilderFactory.createThing(any(), any())).thenAnswer(new RetainIdentifiers<>(thingBuilder, thing));

        thingProvider.onReadyMarkerAdded(new ReadyMarker("", BUNDLE_NAME));
        thingProvider.modelChanged(TEST_MODEL_THINGS, EventType.ADDED);

        verify(bridgeHandlerFactory).createThing(eq(BRIDGE_TYPE_UID), any(Configuration.class), eq(BRIDGE_UID),
                eq(null));
        verify(thingHandlerFactory).createThing(eq(THING_TYPE_UID), any(Configuration.class), eq(THING_UID),
                eq(BRIDGE_UID));
    }

    private <T, X> void builder(T mock, Supplier<T> builderCall, Supplier<X> getterCall, Function<InvocationOnMock, X> returnValue) {
        when(builderCall.get()).thenAnswer(new MapBuilderToMock<>(mock, getterCall, returnValue));
    }

    public static class RetainIdentifiers<T extends ThingBuilder> implements Answer<T> {
        private final T builder;
        private final Thing mock;

        RetainIdentifiers(T builder, Thing mock) {
            this.builder = builder;
            this.mock = mock;
        }

        @Override
        public T answer(InvocationOnMock invocation) throws Throwable {
            when(mock.getUID()).thenReturn(invocation.getArgument(1));
            when(mock.getThingTypeUID()).thenReturn(invocation.getArgument(0));
            return builder;
        }
    }

}
