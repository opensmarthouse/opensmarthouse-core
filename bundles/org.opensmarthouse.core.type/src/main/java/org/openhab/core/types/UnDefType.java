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
package org.openhab.core.types;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;

/**
 * There are situations when item states do not have any defined value.
 * This might be because they have not been initialized yet (never
 * received an state update so far) or because their state is ambiguous
 * (e.g. a dimmed light that is treated as a switch (ON/OFF) will have
 * an undefined state if it is dimmed to 50%).
 *
 * @author Kai Kreuzer - Initial contribution
 * @author Chris Jackson - Rewrite type system for OpenSmartHouse
 * 
 * @deprecated For OpenSmartHouse use {@link org.openhab.core.library.types.UnDefType} instead
 */
@NonNullByDefault
@Deprecated
public class UnDefType implements State {
    private static String CONST_NULL = "NULL";
    private static String CONST_UNDEF = "UNDEF";
    public static UnDefType NULL = new UnDefType(CONST_NULL);
    public static UnDefType UNDEF = new UnDefType(CONST_UNDEF);

    private final String value;

    private UnDefType(String value) {
        this.value = value;
    }

    public static @Nullable UnDefType valueOf(String value) {
        if (CONST_NULL.equals(value)) {
            return NULL;
        }
        if (CONST_UNDEF.equals(value)) {
            return UNDEF;
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

}
