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
package org.openhab.core.library.types.internal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openhab.core.library.types.OnOffType;

/**
 * 
 * @author Chris Jackson - Initial contribution
 *
 */
public class CoreTypeProviderTest {
    @Test
    public void getProvidedTypes() {
        CoreTypeProvider provider = new CoreTypeProvider();

        assertEquals(17, provider.getProvidedTypes().size());
        assertTrue(provider.getProvidedTypes().contains("OnOffType"));
        assertTrue(provider.getProvidedTypes().contains("QuantityType"));
    }

    @Test
    public void t() {
        CoreTypeProvider provider = new CoreTypeProvider();
        assertEquals(OnOffType.ON, provider.createType("OnOffType", "ON"));
    }
}
