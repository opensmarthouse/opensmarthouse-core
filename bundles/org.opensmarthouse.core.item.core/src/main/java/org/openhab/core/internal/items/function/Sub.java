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
import org.openhab.core.types.State;
import org.openhab.core.types.UnDefType;

/**
 * This subtracts values between members of the group.
 *
 * In this regard this group kind is dependant on the order its members are defined!
 *
 * @author Łukasz Dywicki - Initial contribution
 */
@NonNullByDefault
public class Sub implements GroupFunction {

    public Sub() {
    }

    @Override
    public State calculate(@Nullable Set<Item> items) {
        if (items == null || items.isEmpty()) {
            return UnDefType.UNDEF;
        }

        BigDecimal sub = null;
        for (Item item : items) {
            DecimalType itemState = item.getStateAs(DecimalType.class);
            if (itemState == null) {
                // we got an empty value which means that we can't reliably calculate end value
                // we break the loop here to avoid invalid results
                return UnDefType.UNDEF;
            }

            if (sub == null) {
                sub = itemState.toBigDecimal();
            } else {
                sub = sub.subtract(itemState.toBigDecimal());
            }
        }
        return new DecimalType(sub);
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

    @Override
    public String toString() {
        return "SUB";
    }
}