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
package org.openhab.core.library.types;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.openhab.core.types.UnDefType;

/**
 * @author Chris Jackson - Initial contribution for OpenSmartHouse
 */
public class UnDefTypeTest {
    @Test
    public void test() {
        assertEquals(UnDefType.NULL, UnDefType.valueOf("NULL"));
        assertNull(UnDefType.valueOf("null"));
        assertEquals(UnDefType.UNDEF, UnDefType.valueOf("UNDEF"));
        assertNull(UnDefType.valueOf("undef"));

        assertEquals("NULL", UnDefType.NULL.toString());
        assertEquals("NULL", UnDefType.NULL.toFullString());
        assertEquals("This is NULL", UnDefType.NULL.format("This is %s"));

        assertEquals("UNDEF", UnDefType.UNDEF.toString());
        assertEquals("UNDEF", UnDefType.UNDEF.toFullString());
        assertEquals("This is UNDEF", UnDefType.UNDEF.format("This is %s"));
    }

}
