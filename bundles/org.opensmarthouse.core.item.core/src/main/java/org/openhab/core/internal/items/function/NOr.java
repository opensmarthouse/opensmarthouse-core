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

import java.util.Set;
import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.items.Item;
import org.openhab.core.types.State;

/**
 * This does a logical 'nor' operation. The state is 'calculated' by
 * the normal 'or' operation and than negated by returning the opposite
 * value. E.g. when the 'or' operation calculates the activeValue the
 * passiveValue will be returned and vice versa.
 *
 * @author Kai Kreuzer - Initial contribution
 * @author Thomas Eichstädt-Engelen - Added "N" functions
 * @author Gaël L'hopital - Added count function
 */
@NonNullByDefault
public class NOr extends Or {

    public NOr(@Nullable State activeValue, @Nullable State passiveValue) {
        super(activeValue, passiveValue);
    }

    @Override
    public State calculate(@Nullable Set<Item> items) {
        State result = super.calculate(items);
        return activeState.equals(result) ? passiveState : activeState;
    }

}