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

import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.items.GroupFunction;
import org.openhab.core.items.Item;
import org.openhab.core.library.types.DecimalType;
import org.openhab.core.library.types.StringType;
import org.openhab.core.types.State;

/**
 * This calculates the number of items in the group matching the
 * regular expression passed in parameter
 * Group:Number:COUNT(".") will count all items having a string state of one character
 * Group:Number:COUNT("[5-9]") will count all items having a string state between 5 and 9
 * ...
 *
 * @author Kai Kreuzer - Initial contribution
 * @author Thomas Eichstädt-Engelen - Added "N" functions
 * @author Gaël L'hopital - Added count function
 */
@NonNullByDefault
public class Count implements GroupFunction {

    protected final Pattern pattern;

    public Count(@Nullable State regExpr) {
        if (regExpr == null) {
            throw new IllegalArgumentException("Parameter must not be null!");
        }
        this.pattern = Pattern.compile(regExpr.toString());
    }

    @Override
    public State calculate(@Nullable Set<Item> items) {
        int count = 0;
        if (items != null) {
            for (Item item : items) {
                Matcher matcher = pattern.matcher(item.getState().toString());
                if (matcher.matches()) {
                    count++;
                }
            }
        }
        return new DecimalType(count);
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
        return new State[] { new StringType(pattern.pattern()) };
    }
}