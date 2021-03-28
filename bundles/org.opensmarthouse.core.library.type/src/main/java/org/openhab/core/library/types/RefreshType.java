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

/**
 *
 * @author Oliver Libutzki - Initial contribution
 * @author Chris Jackson - Rewrite type system for OpenSmartHouse
 */
@NonNullByDefault
public class RefreshType extends PrimitiveType<RefreshType> implements Command {
    private static String CONST_REFRESH = "REFRESH";
    public static RefreshType REFRESH = new RefreshType(CONST_REFRESH, 0);

    private static RefreshType[] values = new RefreshType[] { REFRESH };

    private RefreshType(String name, int ordinal) {
        super(name, ordinal);
    }

    public static @Nullable RefreshType valueOf(String value) {
        if (CONST_REFRESH.equals(value)) {
            return REFRESH;
        }
        return null;
    }

    public static RefreshType[] values() {
        return values;
    }
}
