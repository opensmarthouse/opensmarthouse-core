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
package org.openhab.core.library.types;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.openhab.core.types.RefreshType;

/**
 * @author Chris Jackson - Initial contribution for OpenSmartHouse
 */
public class RefreshTypeTest {

    @Test
    public void test() {
        assertEquals(RefreshType.REFRESH, RefreshType.valueOf("REFRESH"));
        assertNull(RefreshType.valueOf("refresh"));

        assertEquals("REFRESH", RefreshType.REFRESH.toString());
        assertEquals("REFRESH", RefreshType.REFRESH.toFullString());
        assertEquals("This is REFRESH", RefreshType.REFRESH.format("This is %s"));
    }

}
