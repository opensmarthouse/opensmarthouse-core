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
public class PlayPauseType extends PrimitiveType<PlayPauseType> implements State, Command {

    private static String CONST_PLAY = "PLAY";
    private static String CONST_PAUSE = "PAUSE";
    public static PlayPauseType PLAY = new PlayPauseType(CONST_PLAY, 0);
    public static PlayPauseType PAUSE = new PlayPauseType(CONST_PAUSE, 1);

    private static PlayPauseType[] values = new PlayPauseType[] { PLAY, PAUSE };

    private PlayPauseType(String name, int ordinal) {
        super(name, ordinal);
    }

    public static @Nullable PlayPauseType valueOf(String value) {
        if (CONST_PLAY.equals(value)) {
            return PLAY;
        }
        if (CONST_PAUSE.equals(value)) {
            return PAUSE;
        }
        return null;
    }

    public static PlayPauseType[] values() {
        return values;
    }
}
