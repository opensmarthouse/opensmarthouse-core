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

import java.util.Collections;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.openhab.core.items.Item;
import org.openhab.core.items.ManagedMetadataProvider;
import org.openhab.core.items.Metadata;
import org.openhab.core.items.MetadataKey;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceEvent;
import org.osgi.framework.ServiceListener;
import org.osgi.framework.ServiceReference;

/**
 * @author Simon Kaufmann - Initial contribution
 */
public class MetadataRegistryImplTest {

    private static final String ITEM_NAME = "itemName";

    @SuppressWarnings("rawtypes")
    private @Mock ServiceReference managedProviderRef;
    private @Mock BundleContext bundleContext;
    private @Mock ManagedMetadataProvider managedProvider;
    private @Mock Item item;

    private MetadataRegistryImpl registry;
    private ServiceListener providerTracker;

    @Before
    @SuppressWarnings("unchecked")
    public void setup() throws Exception {
        MockitoAnnotations.initMocks(this);

        Mockito.when(bundleContext.getService(ArgumentMatchers.same(managedProviderRef))).thenReturn(managedProvider);

        Mockito.when(item.getName()).thenReturn(ITEM_NAME);

        registry = new MetadataRegistryImpl();

        registry.setManagedProvider(managedProvider);
        registry.activate(bundleContext);

        ArgumentCaptor<ServiceListener> captor = ArgumentCaptor.forClass(ServiceListener.class);
        Mockito.verify(bundleContext).addServiceListener(captor.capture(), ArgumentMatchers.any());
        providerTracker = captor.getValue();
        providerTracker.serviceChanged(new ServiceEvent(ServiceEvent.REGISTERED, managedProviderRef));

    }

    @Test
    public void testGetEmpty() throws Exception {
        MetadataKey key = new MetadataKey("namespace", "itemName");

        Metadata res = registry.get(key);
        Assert.assertNull(res);
    }

    @Test
    public void testGet() throws Exception {
        MetadataKey key = new MetadataKey("namespace", "itemName");
        registry.added(managedProvider, new Metadata(key, "value", Collections.emptyMap()));
        registry.added(managedProvider,
                new Metadata(new MetadataKey("other", "itemName"), "other", Collections.emptyMap()));
        registry.added(managedProvider,
                new Metadata(new MetadataKey("namespace", "other"), "other", Collections.emptyMap()));

        Metadata res = registry.get(key);
        Assert.assertNotNull(res);
        Assert.assertEquals("value", res.getValue());
        Assert.assertEquals("namespace", res.getUID().getNamespace());
        Assert.assertEquals("itemName", res.getUID().getItemName());
    }

    @Test
    public void testRemoveItemMetadata() {
        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);

        registry.removeItemMetadata("itemName");

        Mockito.verify(managedProvider).removeItemMetadata(captor.capture());
        Assert.assertEquals("itemName", captor.getValue());
    }

}
