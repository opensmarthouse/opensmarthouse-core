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

import java.util.Set;
import javax.measure.Quantity;
import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.items.GroupFunction;
import org.openhab.core.items.GroupItem;
import org.openhab.core.items.Item;
import org.openhab.core.library.items.NumberItem;
import org.openhab.core.types.State;

/**
 * A base class for dimensional calculations.
 *
 * @author Henning Treu - Initial contribution
 */
@NonNullByDefault
abstract class DimensionalGroupFunction implements GroupFunction {

    protected final Class<? extends Quantity<?>> dimension;

    public DimensionalGroupFunction(Class<? extends Quantity<?>> dimension) {
        this.dimension = dimension;
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

    protected boolean isSameDimension(@Nullable Item item) {
        if (item instanceof GroupItem) {
            return isSameDimension(((GroupItem) item).getBaseItem());
        }
        return item instanceof NumberItem && dimension.equals(((NumberItem) item).getDimension());
    }

}