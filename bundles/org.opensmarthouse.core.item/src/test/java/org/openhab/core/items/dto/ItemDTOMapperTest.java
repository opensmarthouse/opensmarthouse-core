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
/**
 * @author Stefan Triller - Initial contribution
 */
package org.openhab.core.items.dto;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;
import org.openhab.core.items.GenericItem;
import org.openhab.core.items.GroupFunction;
import org.openhab.core.items.Item;
import org.openhab.core.items.ItemBuilderFactory;
import org.openhab.core.items.TestNumberItem;
import org.openhab.core.library.types.StringType;
import org.openhab.core.types.State;

/**
 * @author Stefan Triller - Initial contribution
 */
@RunWith(MockitoJUnitRunner.class)
public class ItemDTOMapperTest {

    @Mock
    private ItemBuilderFactory factory;

    @Mock
    private GroupFunction function;

    @Test
    public void testMapFunctionWithNumberItemAndCountFunction() {
        // testing Group:Number:Count(".*hello.*")
        GenericItem item1 = new TestNumberItem("item1");

        GroupFunctionDTO gFuncDTO = new GroupFunctionDTO();
        gFuncDTO.name = "COUNT";
        gFuncDTO.params = new String[] { ".*hello.*" };

        when(factory.newFunctionBuilder(item1, gFuncDTO)).thenReturn(function);
        when(function.getParameters()).thenReturn(new State[] {new StringType()});

        // FIXME This gonna fail
        GroupFunction gFunc = ItemDTOMapper.mapFunction(item1, gFuncDTO, factory);

        assertThat(gFunc, instanceOf(GroupFunction.class));
        assertThat(gFunc.getParameters().length, is(1));
        assertThat(gFunc.getParameters()[0], instanceOf(StringType.class));
    }
}
