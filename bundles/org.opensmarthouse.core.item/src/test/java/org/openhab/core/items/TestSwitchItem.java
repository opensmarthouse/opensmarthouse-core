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
/**
 * @author Stefan Triller - Initial contribution
 */
package org.openhab.core.items;

import java.util.Collections;
import java.util.List;
import org.openhab.core.types.Command;
import org.openhab.core.types.State;

/**
 * Test item for switch operations.
 *
 * @author Łukasz Dywicki - initial contribution.
 */
public class TestSwitchItem extends GenericItem {

    public static final String TEST_SWITCH = "TestSwitch";

    public TestSwitchItem(String name) {
        super(TEST_SWITCH, name);
    }

    @Override
    public List<Class<? extends State>> getAcceptedDataTypes() {
        return Collections.emptyList();
    }

    @Override
    public List<Class<? extends Command>> getAcceptedCommandTypes() {
        return Collections.emptyList();
    }

}