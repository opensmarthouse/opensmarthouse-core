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
public class StopMoveType extends PrimitiveType<StopMoveType> implements Command {

    private static String CONST_STOP = "STOP";
    private static String CONST_MOVE = "MOVE";
    public static StopMoveType STOP = new StopMoveType(CONST_STOP, 0);
    public static StopMoveType MOVE = new StopMoveType(CONST_MOVE, 1);

    private static StopMoveType[] values = new StopMoveType[] { STOP, MOVE };

    private StopMoveType(String name, int ordinal) {
        super(name, ordinal);
    }

    public static @Nullable StopMoveType valueOf(String value) {
        if (CONST_STOP.equals(value)) {
            return STOP;
        }
        if (CONST_MOVE.equals(value)) {
            return MOVE;
        }
        return null;
    }

    public static StopMoveType[] values() {
        return values;
    }
}
