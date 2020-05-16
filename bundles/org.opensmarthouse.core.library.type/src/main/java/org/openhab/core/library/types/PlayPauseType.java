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
public class PlayPauseType extends AbstractBaseType implements State, Command {

    private static String CONST_PLAY = "PLAY";
    private static String CONST_PAUSE = "PAUSE";
    public static PlayPauseType PLAY = new PlayPauseType(CONST_PLAY);
    public static PlayPauseType PAUSE = new PlayPauseType(CONST_PAUSE);

    private final String value;

    private PlayPauseType(String value) {
        this.value = value;
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
