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

/**
 *
 * @author Kai Kreuzer - Initial contribution
 * @author Chris Jackson - Rewrite type system for OpenSmartHouse
 */
@NonNullByDefault
public class IncreaseDecreaseType extends AbstractBaseType implements Command {

    private static String CONST_INCREASE = "INCREASE";
    private static String CONST_DECREASE = "DECREASE";
    public static IncreaseDecreaseType INCREASE = new IncreaseDecreaseType(CONST_INCREASE);
    public static IncreaseDecreaseType DECREASE = new IncreaseDecreaseType(CONST_DECREASE);

    private final String value;

    private IncreaseDecreaseType(String value) {
        this.value = value;
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
