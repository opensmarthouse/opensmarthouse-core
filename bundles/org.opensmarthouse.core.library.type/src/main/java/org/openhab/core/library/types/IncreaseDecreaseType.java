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

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.types.Command;

/**
 *
 * @author Kai Kreuzer - Initial contribution
 * @author Chris Jackson - Rewrite type system for OpenSmartHouse
 */
@NonNullByDefault
public class IncreaseDecreaseType extends PrimitiveType<IncreaseDecreaseType> implements Command {

    private static String CONST_INCREASE = "INCREASE";
    private static String CONST_DECREASE = "DECREASE";
    public static IncreaseDecreaseType INCREASE = new IncreaseDecreaseType(CONST_INCREASE, 0);
    public static IncreaseDecreaseType DECREASE = new IncreaseDecreaseType(CONST_DECREASE, 1);
    private static IncreaseDecreaseType[] values = new IncreaseDecreaseType[] { INCREASE, DECREASE };

    private IncreaseDecreaseType(String name, int ordinal) {
        super(name, ordinal);
    }

    public static @Nullable IncreaseDecreaseType valueOf(String value) {
        if (CONST_INCREASE.equals(value)) {
            return INCREASE;
        }
        if (CONST_DECREASE.equals(value)) {
            return DECREASE;
        }
        return null;
    }

    public static IncreaseDecreaseType[] values() {
        return values;
    }
}
