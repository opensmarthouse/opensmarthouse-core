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
public class OnOffType extends PrimitiveType<OnOffType> implements State, Command {
    private static String CONST_ON = "ON";
    private static String CONST_OFF = "OFF";
    public static OnOffType ON = new OnOffType(CONST_ON, 0);
    public static OnOffType OFF = new OnOffType(CONST_OFF, 1);
    private static OnOffType[] values = new OnOffType[] { ON, OFF };

    private OnOffType(String name, int ordinal) {
        super(name, ordinal);
    }

    /**
     * Converts a String value "ON" or "1" to {@link OnOffType#ON} or else to {@link OnOffType#OFF}.
     *
     * @param state String to convert to {@link OnOffType}
     * @return returns the ON or OFF state based on the String
     */
    public static OnOffType from(String state) {
        return from(CONST_ON.equalsIgnoreCase(state) || "1".equalsIgnoreCase(state));
    }

    public static @Nullable OnOffType valueOf(String value) {
        if (CONST_ON.equals(value)) {
            return ON;
        }
        if (CONST_OFF.equals(value)) {
            return OFF;
        }
        return null;
    }

    /**
     * @param state boolean to convert to {@link OnOffType}
     * @return returns the ON or OFF state based on the boolean
     */
    public static OnOffType from(boolean state) {
        return state ? ON : OFF;
    }

    @Override
    public <T extends State> @Nullable T as(@Nullable Class<T> target) {
        if (target == DecimalType.class) {
            return target.cast(this == ON ? new DecimalType(1) : DecimalType.ZERO);
        } else if (target == PercentType.class) {
            return target.cast(this == ON ? PercentType.HUNDRED : PercentType.ZERO);
        } else if (target == HSBType.class) {
            return target.cast(this == ON ? HSBType.WHITE : HSBType.BLACK);
        } else if (target == OpenClosedType.class) {
            return target.cast(this == ON ? OpenClosedType.OPEN : OpenClosedType.CLOSED);
        } else if (target == OnOffType.class) {
            return target.cast(this);
        }
        return null;
    }

    public static OnOffType[] values() {
        return values;
    }
}
