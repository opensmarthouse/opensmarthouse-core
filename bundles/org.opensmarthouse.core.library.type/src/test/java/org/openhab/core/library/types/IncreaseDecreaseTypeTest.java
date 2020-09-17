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

import org.junit.Test;

/**
 * @author Chris Jackson - Initial contribution
 */
public class IncreaseDecreaseTypeTest {

    @Test
    public void test() {
        assertEquals(IncreaseDecreaseType.INCREASE, IncreaseDecreaseType.valueOf("INCREASE"));
        assertEquals(0, IncreaseDecreaseType.INCREASE.ordinal());
        assertEquals(2, IncreaseDecreaseType.values().length);
    }

}
