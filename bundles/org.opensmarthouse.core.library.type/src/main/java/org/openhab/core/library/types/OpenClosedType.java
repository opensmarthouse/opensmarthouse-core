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
import org.openhab.core.types.State;

/**
 *
 * @author Kai Kreuzer - Initial contribution
 * @author Chris Jackson - Refactor type system for OpenSmartHouse
 */
@NonNullByDefault
public class OpenClosedType extends PrimitiveType<OpenClosedType> implements State, Command {
    private static String CONST_OPEN = "OPEN";
    private static String CONST_CLOSED = "CLOSED";

    public static OpenClosedType OPEN = new OpenClosedType(CONST_OPEN, 0);
    public static OpenClosedType CLOSED = new OpenClosedType(CONST_CLOSED, 1);

    private static OpenClosedType[] values = new OpenClosedType[] { OPEN, CLOSED };

    private OpenClosedType(String name, int ordinal) {
        super(name, ordinal);
    }

    public static @Nullable OpenClosedType valueOf(String value) {
        if (CONST_OPEN.equals(value)) {
            return OPEN;
        }
        if (CONST_CLOSED.equals(value)) {
            return CLOSED;
        }
        return null;
    }

    @Override
    public <T extends State> @Nullable T as(@Nullable Class<T> target) {
        if (target == DecimalType.class) {
            return target.cast(this == OPEN ? new DecimalType(1) : DecimalType.ZERO);
        } else if (target == PercentType.class) {
            return target.cast(this == OPEN ? PercentType.HUNDRED : PercentType.ZERO);
        } else if (target == HSBType.class) {
            return target.cast(this == OPEN ? HSBType.WHITE : HSBType.BLACK);
        } else if (target == OpenClosedType.class) {
            return target.cast(this == OPEN ? OpenClosedType.OPEN : OpenClosedType.CLOSED);
        } else if (target == OnOffType.class) {
            return target.cast(this);
        }
        return null;
    }

    public static OpenClosedType[] values() {
        return values;
    }
}
