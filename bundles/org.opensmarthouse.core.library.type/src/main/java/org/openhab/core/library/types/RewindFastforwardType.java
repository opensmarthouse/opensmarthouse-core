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

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.types.Command;
import org.openhab.core.types.State;

/**
 * This type is used by the {@link org.openhab.core.library.items.PlayerItem}.
 *
 * @author Alex Tugarev - Initial contribution
 * @author Chris Jackson - Rewrite type system for OpenSmartHouse
 */
@NonNullByDefault
public class RewindFastforwardType extends AbstractBaseType implements State, Command {

    private static String CONST_REWIND = "REWIND";
    private static String CONST_FASTFORWARD = "FASTFORWARD";
    public static RewindFastforwardType REWIND = new RewindFastforwardType(CONST_REWIND);
    public static RewindFastforwardType FASTFORWARD = new RewindFastforwardType(CONST_FASTFORWARD);

    private final String value;

    private RewindFastforwardType(String value) {
        this.value = value;
    }

    public static @Nullable RewindFastforwardType valueOf(String value) {
        if (CONST_REWIND.equals(value)) {
            return REWIND;
        }
        if (CONST_FASTFORWARD.equals(value)) {
            return FASTFORWARD;
        }
        return null;
    }

    @Override
    public String format(String pattern) {
        return String.format(pattern, this.toString());
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public String toFullString() {
        return value;
    }

    /**
     * Gets the string name of this value
     * 
     * @return the name of the value
     * @deprecated use {@link #toString()} instead
     */
    @Deprecated
    public String name() {
        return toString();
    }
}
