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
package org.openhab.core.internal.types;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openhab.core.types.RefreshType;
import org.openhab.core.types.UnDefType;
import org.openhab.core.types.internal.BaseTypeProvider;

/**
 * 
 * @author Chris Jackson - Initial contribution
 *
 */
public class BaseTypeProviderTest {
    @Test
    public void getProvidedTypes() {
        BaseTypeProvider provider = new BaseTypeProvider();

        assertEquals(2, provider.getProvidedTypes().size());
        assertTrue(provider.getProvidedTypes().contains("UnDefType"));
        assertTrue(provider.getProvidedTypes().contains("RefreshType"));
    }

    @Test
    public void t() {
        BaseTypeProvider provider = new BaseTypeProvider();
        assertEquals(UnDefType.NULL, provider.createType("UnDefType", "NULL"));
        assertEquals(RefreshType.REFRESH, provider.createType("RefreshType", "REFRESH"));
    }
}
