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
package org.openhab.core.io.rest.core.item;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import java.net.URI;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.openhab.core.items.GenericItem;
import org.openhab.core.items.GroupItem;
import org.openhab.core.items.ItemFactory;
import org.openhab.core.library.CoreItemFactory;
import org.openhab.core.test.java.JavaTest;
import org.openhab.core.types.StateDescriptionFragmentBuilderFactory;
import org.openhab.core.types.UnDefType;
import org.osgi.framework.BundleContext;

/**
 * @author Kai Kreuzer - Initial contribution
 */
public class EnrichedItemDTOMapperTest extends JavaTest {

    @Mock
    private ItemFactory itemFactory;

    @Mock
    private BundleContext bundleContext;

    @Mock
    private StateDescriptionFragmentBuilderFactory stateDescriptionFragmentBuilderFactory;

    @Mock
    GenericItem switchItem;// = itemFactory.createItem(CoreItemFactory.SWITCH, "TestSwitch");

    @Mock
    GenericItem numberItem;// = itemFactory.createItem(CoreItemFactory.NUMBER, "");

    @Mock
    GenericItem stringItem;// = itemFactory.createItem(CoreItemFactory.STRING, "");

    @Before
    public void setup() {
        initMocks(this);

        when(switchItem.getState()).thenReturn(UnDefType.NULL);
        when(switchItem.getType()).thenReturn(CoreItemFactory.SWITCH);
        when(numberItem.getState()).thenReturn(UnDefType.NULL);
        when(numberItem.getType()).thenReturn(CoreItemFactory.NUMBER);
        when(stringItem.getState()).thenReturn(UnDefType.NULL);
        when(stringItem.getType()).thenReturn(CoreItemFactory.STRING);
    }

    @Test
    public void testFiltering() {
        GroupItem group = new GroupItem("TestGroup");
        GroupItem subGroup = new GroupItem("TestSubGroup");

        group.addMember(subGroup);
        group.addMember(switchItem);
        group.addMember(numberItem);
        subGroup.addMember(stringItem);

        EnrichedGroupItemDTO dto = (EnrichedGroupItemDTO) EnrichedItemDTOMapper.map(bundleContext,
                stateDescriptionFragmentBuilderFactory, group, false, null, URI.create(""),
                null);
        assertThat(dto.members.length, is(0));

        dto = (EnrichedGroupItemDTO) EnrichedItemDTOMapper.map(bundleContext, stateDescriptionFragmentBuilderFactory,
                group, true, null, null, null);
        assertThat(dto.members.length, is(3));
        assertThat(((EnrichedGroupItemDTO) dto.members[0]).members.length, is(1));

        dto = (EnrichedGroupItemDTO) EnrichedItemDTOMapper.map(bundleContext, stateDescriptionFragmentBuilderFactory,
                group, true,
                i -> CoreItemFactory.NUMBER.equals(i.getType()), null, null);
        assertThat(dto.members.length, is(1));

        dto = (EnrichedGroupItemDTO) EnrichedItemDTOMapper.map(bundleContext, stateDescriptionFragmentBuilderFactory,
                group, true,
                i -> CoreItemFactory.NUMBER.equals(i.getType()) || i instanceof GroupItem, null, null);
        assertThat(dto.members.length, is(2));
        assertThat(((EnrichedGroupItemDTO) dto.members[0]).members.length, is(0));

        dto = (EnrichedGroupItemDTO) EnrichedItemDTOMapper.map(bundleContext, stateDescriptionFragmentBuilderFactory,
                group, true,
                i -> CoreItemFactory.NUMBER.equals(i.getType()) || i instanceof GroupItem, null, null);
        assertThat(dto.members.length, is(2));
        assertThat(((EnrichedGroupItemDTO) dto.members[0]).members.length, is(0));

        dto = (EnrichedGroupItemDTO) EnrichedItemDTOMapper.map(bundleContext, stateDescriptionFragmentBuilderFactory,
                group, true,
                i -> CoreItemFactory.NUMBER.equals(i.getType()) || i.getType().equals(CoreItemFactory.STRING)
                        || i instanceof GroupItem,
                null, null);
        assertThat(dto.members.length, is(2));
        assertThat(((EnrichedGroupItemDTO) dto.members[0]).members.length, is(1));
    }
}
