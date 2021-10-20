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
package org.openhab.core.internal.items.function;

import java.math.BigDecimal;
import java.util.Set;
import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.items.GroupFunction;
import org.openhab.core.items.Item;
import org.openhab.core.library.types.DecimalType;
import org.openhab.core.library.types.OnOffType;
import org.openhab.core.library.types.UnDefType;
import org.openhab.core.types.State;

/**
 * This calculates the numeric sum over all item states of decimal type.
 *
 * @author Kai Kreuzer - Initial contribution
 * @author Thomas Eichstädt-Engelen - Added "N" functions
 * @author Gaël L'hopital - Added count function
 */
@NonNullByDefault
public class Sum implements GroupFunction {

    private final OnOffType allMembers;

    public Sum(OnOffType allMembers) {
        this.allMembers = allMembers;
    }

    @Override
    public State calculate(@Nullable Set<Item> items) {
        BigDecimal sum = BigDecimal.ZERO;
        if (items != null) {
            for (Item item : items) {
                DecimalType itemState = item.getStateAs(DecimalType.class);
                if (itemState != null) {
                    sum = sum.add(itemState.toBigDecimal());
                } else {
                    if (OnOffType.ON == allMembers) {
                        return UnDefType.UNDEF;
                    }
                }
            }
        }
        return new DecimalType(sum);
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
        return new State[] { allMembers};
    }

    @Override
    public String toString() {
        return "SUM(" + allMembers + ")";
    }

}