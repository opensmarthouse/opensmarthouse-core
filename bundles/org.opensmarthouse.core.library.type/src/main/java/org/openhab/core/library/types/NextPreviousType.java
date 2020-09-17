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
 * This type is used by the {@link org.openhab.core.library.items.PlayerItem}.
 *
 * @author Alex Tugarev - Initial contribution
 * @author Chris Jackson - Rewrite type system for OpenSmartHouse
 */
@NonNullByDefault
public class NextPreviousType extends PrimitiveType<NextPreviousType> implements Command {

    private static String CONST_NEXT = "NEXT";
    private static String CONST_PREVIOUS = "PREVIOUS";
    public static NextPreviousType NEXT = new NextPreviousType(CONST_NEXT, 0);
    public static NextPreviousType PREVIOUS = new NextPreviousType(CONST_PREVIOUS, 1);
    private static NextPreviousType[] values = new NextPreviousType[] { NEXT, PREVIOUS };

    private NextPreviousType(String name, int ordinal) {
        super(name, ordinal);
    }

    public static @Nullable NextPreviousType valueOf(String value) {
        if (CONST_NEXT.equals(value)) {
            return NEXT;
        }
        if (CONST_PREVIOUS.equals(value)) {
            return PREVIOUS;
        }
        return null;
    }

    public static NextPreviousType[] values() {
        return values;
    }
}
