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

import java.math.BigDecimal;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.types.Command;
import org.openhab.core.types.State;

/**
 *
 * @author Kai Kreuzer - Initial contribution
 * @author Chris Jackson - Rewrite type system for OpenSmartHouse
 */
@NonNullByDefault
public class UpDownType extends PrimitiveType<UpDownType> implements State, Command {

    private static String CONST_UP = "UP";
    private static String CONST_DOWN = "DOWN";
    public static UpDownType UP = new UpDownType(CONST_UP, 0);
    public static UpDownType DOWN = new UpDownType(CONST_DOWN, 1);

    private static UpDownType[] values = new UpDownType[] { UP, DOWN };

    private UpDownType(String name, int ordinal) {
        super(name, ordinal);
    }

    public static @Nullable UpDownType valueOf(String value) {
        if (CONST_UP.equals(value)) {
            return UP;
        }
        if (CONST_DOWN.equals(value)) {
            return DOWN;
        }
        return null;
    }

    @Override
    public <T extends State> @Nullable T as(@Nullable Class<T> target) {
        if (target == DecimalType.class) {
            return target.cast(equals(UP) ? DecimalType.ZERO : new DecimalType(new BigDecimal("1.0")));
        } else if (target == PercentType.class) {
            return target.cast(equals(UP) ? PercentType.ZERO : PercentType.HUNDRED);
        } else {
            return State.super.as(target);
        }
    }

    public static UpDownType[] values() {
        return values;
    }
}
