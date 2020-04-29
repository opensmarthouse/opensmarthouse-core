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
package org.openhab.core.internal.items;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.initMocks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.openhab.core.items.Item;
import org.openhab.core.items.ManagedMetadataProvider;
import org.openhab.core.items.Metadata;
import org.openhab.core.items.MetadataKey;
import org.openhab.core.types.CommandDescription;
import org.openhab.core.types.CommandDescriptionBuilder;
import org.openhab.core.types.CommandDescriptionBuilderFactory;
import org.openhab.core.types.CommandOption;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceEvent;
import org.osgi.framework.ServiceListener;
import org.osgi.framework.ServiceReference;

/**
 * @author Yannick Schaus - Initial contribution
 */
public class MetadataCommandDescriptionProviderTest {

    private static final String ITEM_NAME = "itemName";
    public static final String OPTION_1 = "OPTION1";
    public static final String OPTION_2 = "OPTION2";
    public static final String OPTION_3_LABEL = "Option 3";
    public static final String OPTION_3_COMMAND = "3";
    public static final String OPTIONS = OPTION_1 +"," + OPTION_2 +" , "+ OPTION_3_COMMAND +" =" + OPTION_3_LABEL + "  ";

    @SuppressWarnings("rawtypes")
    private @Mock ServiceReference managedProviderRef;
    private @Mock BundleContext bundleContext;
    private @Mock CommandDescriptionBuilderFactory commandDescriptionBuilderFactory;
    private @Mock ManagedMetadataProvider managedProvider;
    private @Mock Item item;

    private @Mock MetadataRegistryImpl metadataRegistry;
    private MetadataCommandDescriptionProvider commandDescriptionProvider;

    private ServiceListener providerTracker;

    @Before
    @SuppressWarnings("unchecked")
    public void setup() throws Exception {
        initMocks(this);

        when(bundleContext.getService(same(managedProviderRef))).thenReturn(managedProvider);

        when(item.getName()).thenReturn(ITEM_NAME);

        metadataRegistry = new MetadataRegistryImpl();

        metadataRegistry.setManagedProvider(managedProvider);
        metadataRegistry.activate(bundleContext);

        ArgumentCaptor<ServiceListener> captor = ArgumentCaptor.forClass(ServiceListener.class);
        verify(bundleContext).addServiceListener(captor.capture(), any());
        providerTracker = captor.getValue();
        providerTracker.serviceChanged(new ServiceEvent(ServiceEvent.REGISTERED, managedProviderRef));

        commandDescriptionProvider = new MetadataCommandDescriptionProvider(commandDescriptionBuilderFactory,
                metadataRegistry, new HashMap<>());
    }

    @Test
    public void testEmpty() throws Exception {
        CommandDescription commandDescription = commandDescriptionProvider.getCommandDescription(ITEM_NAME, null);
        assertNull(commandDescription);
    }

    @Test
    public void testEmptyConfig() throws Exception {
        MetadataKey metadataKey = new MetadataKey("commandDescription", ITEM_NAME);
        // Map<String, Object> metadataConfig = new HashMap<>();
        Metadata metadata = new Metadata(metadataKey, "N/A", null);

        metadataRegistry.added(managedProvider, metadata);
        CommandDescription commandDescription = commandDescriptionProvider.getCommandDescription(ITEM_NAME, null);
        assertNull(commandDescription);
    }

    @Test
    public void testOptions() throws Exception {
        MetadataKey metadataKey = new MetadataKey("commandDescription", ITEM_NAME);
        Map<String, Object> metadataConfig = new HashMap<>();
        metadataConfig.put("options", OPTIONS);

        Metadata metadata = new Metadata(metadataKey, "N/A", metadataConfig);
        metadataRegistry.added(managedProvider, metadata);

        CommandDescriptionBuilder mock = mock(CommandDescriptionBuilder.class);
        when(commandDescriptionBuilderFactory.create()).thenReturn(mock);

        commandDescriptionProvider.getCommandDescription(ITEM_NAME, null);

        verify(mock).withCommandOption(new CommandOption(OPTION_1, null));
        verify(mock).withCommandOption(new CommandOption(OPTION_2, null));
        verify(mock).withCommandOption(new CommandOption(OPTION_3_COMMAND, OPTION_3_LABEL));
        verify(mock).build();

        verifyNoMoreInteractions(mock);
    }
}
