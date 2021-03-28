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
package org.openhab.core.internal.items.function.dimensional;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Set;

import javax.measure.Quantity;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.items.Item;
import org.openhab.core.library.types.QuantityType;
import org.openhab.core.types.State;
import org.openhab.core.types.UnDefType;


/**
 * This calculates the numeric average over all item states of {@link QuantityType}.
 *
 * @author Henning Treu - Initial contribution
 */
@NonNullByDefault
public class Avg extends DimensionalGroupFunction {

    public Avg(Class<? extends Quantity<?>> dimension) {
        super(dimension);
    }

    @Override
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public State calculate(@Nullable Set<Item> items) {
        if (items == null || items.isEmpty()) {
            return UnDefType.UNDEF;
        }

        QuantityType<?> sum = null;
        int count = 0;
        for (Item item : items) {
            if (isSameDimension(item)) {
                QuantityType itemState = item.getStateAs(QuantityType.class);
                if (itemState != null) {
                    if (sum == null) {
                        sum = itemState; // initialise the sum from the first item
                        count++;
                    } else {
                        sum = sum.add(itemState);
                        count++;
                    }
                }
            }
        }

        if (sum != null && count > 0) {
            BigDecimal result = sum.toBigDecimal().divide(BigDecimal.valueOf(count), RoundingMode.HALF_UP);
            return new QuantityType(result, sum.getUnit());
        }

        return UnDefType.UNDEF;
    }

}