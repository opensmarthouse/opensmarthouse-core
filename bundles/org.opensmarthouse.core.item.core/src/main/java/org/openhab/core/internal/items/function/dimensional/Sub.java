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
package org.openhab.core.internal.items.function.dimensional;

import java.util.Set;
import javax.measure.Quantity;
import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.items.Item;
import org.openhab.core.library.types.QuantityType;
import org.openhab.core.types.State;
import org.openhab.core.types.UnDefType;

/**
 * Subtract value between members {@link QuantityType}.
 *
 * @author Łukas Dywicki - Initial contribution
 */
@NonNullByDefault
public class Sub extends DimensionalGroupFunction {

    public Sub(Class<? extends Quantity<?>> dimension) {
        super(dimension);
    }

    @Override
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public State calculate(@Nullable Set<Item> items) {
        if (items == null || items.isEmpty()) {
            return UnDefType.UNDEF;
        }

        QuantityType<?> sub = null;
        for (Item item : items) {
            if (isSameDimension(item)) {
                QuantityType itemState = item.getStateAs(QuantityType.class);
                if (itemState == null) {
                    // we got an empty value which means that we can't reliably calculate end value
                    // we break the loop here to avoid invalid results
                    return UnDefType.UNDEF;
                }

                if (sub == null) {
                    sub = itemState; // initialise the sub from the first item
                } else {
                    if (sub.getUnit().isCompatible(itemState.getUnit())) {
                        sub = sub.subtract(itemState);
                    } else {
                        // we got an incompatible value, we must break the loop here to avoid invalid results
                        return UnDefType.UNDEF;
                    }
                }
            }
        }

        return sub;
    }

    @Override
    public String toString() {
        return "SUB()";
    }
}