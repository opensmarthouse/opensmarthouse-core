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
package org.openhab.core.internal.items.function;

import java.math.BigDecimal;
import java.util.Set;
import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.items.GroupFunction;
import org.openhab.core.items.Item;
import org.openhab.core.library.types.DecimalType;
import org.openhab.core.types.State;
import org.openhab.core.types.UnDefType;

/**
 * This calculates the maximum value of all item states of decimal type.
 *
 * @author Kai Kreuzer - Initial contribution
 * @author Thomas Eichstädt-Engelen - Added "N" functions
 * @author Gaël L'hopital - Added count function
 */
@NonNullByDefault
public class Max implements GroupFunction {

    public Max() {
    }

    @Override
    public State calculate(@Nullable Set<Item> items) {
        if (items != null && !items.isEmpty()) {
            BigDecimal max = null;
            for (Item item : items) {
                DecimalType itemState = item.getStateAs(DecimalType.class);
                if (itemState != null) {
                    if (max == null || max.compareTo(itemState.toBigDecimal()) < 0) {
                        max = itemState.toBigDecimal();
                    }
                }
            }
            if (max != null) {
                return new DecimalType(max);
            }
        }
        return UnDefType.UNDEF;
    }

    @Override
    public @Nullable <T extends State> T getStateAs(@Nullable Set<Item> items, Class<T> stateClass) {
        State state = calculate(items);
        if (stateClass.isInstance(state)) {
            return stateClass.cast(state);
        } else {
            return null;
        }
    }

    @Override
    public State[] getParameters() {
        return new State[0];
    }
}