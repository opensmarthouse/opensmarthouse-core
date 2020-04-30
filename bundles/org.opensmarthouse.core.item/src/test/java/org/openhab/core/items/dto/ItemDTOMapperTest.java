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

import org.junit.Ignore;
import org.junit.Test;
import org.openhab.core.items.GenericItem;
import org.openhab.core.items.GroupFunction;
import org.openhab.core.items.TestNumberItem;
import org.openhab.core.library.types.StringType;

/**
 * @author Stefan Triller - Initial contribution
 */
public class ItemDTOMapperTest {

    @Test
    @Ignore
    public void testMapFunctionWithNumberItemAndCountFunction() {
        // testing Group:Number:Count(".*hello.*")
        GenericItem item1 = new TestNumberItem("item1");

        GroupFunctionDTO gFuncDTO = new GroupFunctionDTO();
        gFuncDTO.name = "COUNT";
        gFuncDTO.params = new String[] { ".*hello.*" };

        // FIXME This gonna fail
        GroupFunction gFunc = ItemDTOMapper.mapFunction(item1, gFuncDTO);

        assertThat(gFunc, instanceOf(GroupFunction.class));
        assertThat(gFunc.getParameters().length, is(1));
        assertThat(gFunc.getParameters()[0], instanceOf(StringType.class));
    }
}
