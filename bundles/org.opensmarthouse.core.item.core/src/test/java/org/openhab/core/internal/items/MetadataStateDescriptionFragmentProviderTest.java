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

import java.math.BigDecimal;
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
import org.openhab.core.types.StateDescriptionFragment;
import org.openhab.core.types.StateDescriptionFragmentBuilder;
import org.openhab.core.types.StateDescriptionFragmentBuilderFactory;
import org.openhab.core.types.StateOption;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceEvent;
import org.osgi.framework.ServiceListener;
import org.osgi.framework.ServiceReference;

/**
 * @author Yannick Schaus - Initial contribution
 */
public class MetadataStateDescriptionFragmentProviderTest {

    private static final String ITEM_NAME = "itemName";
    public static final String PATTERN = "%.1f %unit%";
    public static final double MIN = 18.5;
    public static final String MAX = "34";
    public static final int STEP = 3;
    public static final String READ_ONLY = "true";
    public static final String OPTION_1 = "OPTION1";
    public static final String OPTION_2 = "OPTION2";
    public static final String OPTION_3_LABEL = "Option 3";
    public static final String OPTION_3_VALUE = "3";
    public static final String THREE_OPTIONS = OPTION_1 + "," + OPTION_2 + " , " + OPTION_3_VALUE + " =" + OPTION_3_LABEL + " ";

    @SuppressWarnings("rawtypes")
    private @Mock ServiceReference managedProviderRef;
    private @Mock BundleContext bundleContext;
    private @Mock StateDescriptionFragmentBuilderFactory stateDescriptionFragmentBuilderFactory;
    private @Mock ManagedMetadataProvider managedProvider;
    private @Mock Item item;

    private @Mock MetadataRegistryImpl metadataRegistry;
    private MetadataStateDescriptionFragmentProvider stateDescriptionFragmentProvider;

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

        stateDescriptionFragmentProvider = new MetadataStateDescriptionFragmentProvider(
                stateDescriptionFragmentBuilderFactory, metadataRegistry, new HashMap<>());
    }

    @Test
    public void testEmpty() throws Exception {
        StateDescriptionFragment stateDescriptionFragment = stateDescriptionFragmentProvider
                .getStateDescriptionFragment(ITEM_NAME, null);
        assertNull(stateDescriptionFragment);
    }

    @SuppressWarnings("null")
    @Test
    public void testFragment() throws Exception {
        MetadataKey metadataKey = new MetadataKey("stateDescription", ITEM_NAME);
        Map<String, Object> metadataConfig = new HashMap<>();
        metadataConfig.put("pattern", PATTERN);
        metadataConfig.put("min", MIN);
        metadataConfig.put("max", MAX);
        metadataConfig.put("step", STEP);
        metadataConfig.put("readOnly", READ_ONLY);
        metadataConfig.put("options", THREE_OPTIONS);
        Metadata metadata = new Metadata(metadataKey, "N/A", metadataConfig);
        metadataRegistry.added(managedProvider, metadata);

        StateDescriptionFragmentBuilder mock = mock(StateDescriptionFragmentBuilder.class);
        when(stateDescriptionFragmentBuilderFactory.create()).thenReturn(mock);

        stateDescriptionFragmentProvider.getStateDescriptionFragment(ITEM_NAME, null);

        verify(mock).withPattern("%.1f %unit%");
        verify(mock).withMinimum(new BigDecimal(MIN));
        verify(mock).withMaximum(new BigDecimal(MAX));
        verify(mock).withStep(new BigDecimal(STEP));
        verify(mock).withReadOnly(true);
        verify(mock).withOptions(argThat(list -> {
            assertEquals(3, list.size());
            assertOption(list.get(0), OPTION_1, null);
            assertOption(list.get(1), OPTION_2, null);
            assertOption(list.get(2), OPTION_3_VALUE, OPTION_3_LABEL);
            return true;
        }));

        verify(mock).build();
        verifyNoMoreInteractions(mock);
    }

    private void assertOption(StateOption stateOption, String value, String label) {
        assertEquals(value, stateOption.getValue());
        assertEquals(label, stateOption.getLabel());
    }
}
