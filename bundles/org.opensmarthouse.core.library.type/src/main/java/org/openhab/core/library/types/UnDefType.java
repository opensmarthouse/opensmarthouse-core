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
import org.openhab.core.types.State;

/**
 * There are situations when item states do not have any defined value.
 * This might be because they have not been initialized yet (never
 * received an state update so far) or because their state is ambiguous
 * (e.g. a dimmed light that is treated as a switch (ON/OFF) will have
 * an undefined state if it is dimmed to 50%).
 *
 * @author Kai Kreuzer - Initial contribution
 * @author Chris Jackson - Rewrite type system for OpenSmartHouse
 */
@NonNullByDefault
public class UnDefType extends PrimitiveType<UnDefType> implements State {
    private static String CONST_NULL = "NULL";
    private static String CONST_UNDEF = "UNDEF";
    public static UnDefType NULL = new UnDefType(CONST_NULL, 0);
    public static UnDefType UNDEF = new UnDefType(CONST_UNDEF, 1);

    private static UnDefType[] values = new UnDefType[] { NULL, UNDEF };

    private UnDefType(String name, int ordinal) {
        super(name, ordinal);
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

    public static UnDefType[] values() {
        return values;
    }
}
