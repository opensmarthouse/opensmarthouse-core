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
package org.openhab.core.internal.items;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.measure.Quantity;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.internal.items.function.And;
import org.openhab.core.internal.items.function.Count;
import org.openhab.core.internal.items.function.Earliest;
import org.openhab.core.internal.items.function.Latest;
import org.openhab.core.internal.items.function.NAnd;
import org.openhab.core.internal.items.function.NOr;
import org.openhab.core.internal.items.function.Or;
import org.openhab.core.internal.items.function.dimensional.Avg;
import org.openhab.core.internal.items.function.dimensional.Max;
import org.openhab.core.internal.items.function.dimensional.Min;
import org.openhab.core.internal.items.function.dimensional.Sub;
import org.openhab.core.internal.items.function.dimensional.Sum;
import org.openhab.core.items.GroupFunction;
import org.openhab.core.items.Item;
import org.openhab.core.items.dto.GroupFunctionDTO;
import org.openhab.core.library.items.NumberItem;
import org.openhab.core.library.types.OnOffType;
import org.openhab.core.library.types.StringType;
import org.openhab.core.types.State;
import org.openhab.core.types.TypeParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Creates {@link GroupFunction}s according to the given parameters.
 *
 * @author Henning Treu - Initial contribution
 * @author Robert Michalak - LATEST and EARLIEST group functions
 */
@NonNullByDefault
public class GroupFunctionHelper {

    private final Logger logger = LoggerFactory.getLogger(GroupFunctionHelper.class);

    /**
     * Creates a {@link GroupFunction} according to the given parameters. In case dimension is given the resulting
     * arithmetic group function will take unit conversion into account.
     *
     * @param function the {@link GroupFunctionDTO} describing the group function.
     * @param baseItem
     * @param dimension an optional interface class from {@link Quantity} defining the dimension for unit conversion.
     * @return a {@link GroupFunction} according to the given parameters.
     */
    public GroupFunction createGroupFunction(GroupFunctionDTO function, @Nullable Item baseItem) {
        Class<? extends Quantity<?>> dimension = getDimension(baseItem);
        if (dimension != null) {
            return createDimensionGroupFunction(function, baseItem, dimension);
        }

        return createDefaultGroupFunction(function, baseItem);
    }

    private List<State> parseStates(@Nullable Item baseItem, String @Nullable [] params) {
        if (params == null || baseItem == null) {
            return Collections.emptyList();
        }

        List<State> states = new ArrayList<>();
        for (String param : params) {
            State state = TypeParser.parseState(baseItem.getAcceptedDataTypes(), param);
            if (state == null) {
                logger.warn("State '{}' is not valid for a group item with base type '{}'", param, baseItem.getType());
                states.clear();
                break;
            } else {
                states.add(state);
            }
        }
        return states;
    }

    private @Nullable Class<? extends Quantity<?>> getDimension(@Nullable Item baseItem) {
        if (baseItem instanceof NumberItem) {
            return ((NumberItem) baseItem).getDimension();
        }
        return null;
    }

    private GroupFunction createDimensionGroupFunction(GroupFunctionDTO function, @Nullable Item baseItem,
            Class<? extends Quantity<?>> dimension) {
        final String functionName = function.name;
        switch (functionName.toUpperCase()) {
            case "AVG":
                return new Avg(dimension);
            case "SUM":
                if (function.params != null && function.params.length == 1) {
                    return new Sum(dimension, OnOffType.from(function.params[0]));
                }
                return new Sum(dimension, OnOffType.ON);
            case "SUB":
                return new Sub(dimension);
            case "MIN":
                return new Min(dimension);
            case "MAX":
                return new Max(dimension);
            default:
                return createDefaultGroupFunction(function, baseItem);
        }
    }

    private GroupFunction createDefaultGroupFunction(GroupFunctionDTO function, @Nullable Item baseItem) {
        final String functionName = function.name;
        final List<State> args;
        switch (functionName.toUpperCase()) {
            case "AND":
                args = parseStates(baseItem, function.params);

                if (args.size() == 2) {
                    return new And(args.get(0), args.get(1));
                } else {
                    logger.error("Group function 'AND' requires two arguments. Using Equality instead.");
                }
                break;
            case "OR":
                args = parseStates(baseItem, function.params);
                if (args.size() == 2) {
                    return new Or(args.get(0), args.get(1));
                } else {
                    logger.error("Group function 'OR' requires two arguments. Using Equality instead.");
                }
                break;
            case "NAND":
                args = parseStates(baseItem, function.params);
                if (args.size() == 2) {
                    return new NAnd(args.get(0), args.get(1));
                } else {
                    logger.error("Group function 'NOT AND' requires two arguments. Using Equality instead.");
                }
                break;
            case "NOR":
                args = parseStates(baseItem, function.params);
                if (args.size() == 2) {
                    return new NOr(args.get(0), args.get(1));
                } else {
                    logger.error("Group function 'NOT OR' requires two arguments. Using Equality instead.");
                }
                break;
            case "COUNT":
                if (function.params != null && function.params.length == 1) {
                    State countParam = new StringType(function.params[0]);
                    return new Count(countParam);
                } else {
                    logger.error("Group function 'COUNT' requires one argument. Using Equality instead.");
                }
                break;
            case "AVG":
                return new org.openhab.core.internal.items.function.Avg();
            case "SUM":
                if (function.params != null && function.params.length == 1) {
                    return new org.openhab.core.internal.items.function.Sum(OnOffType.from(function.params[0]));
                }
                return new org.openhab.core.internal.items.function.Sum(OnOffType.ON);
            case "SUB":
                return new org.openhab.core.internal.items.function.Sub();
            case "MIN":
                return new org.openhab.core.internal.items.function.Min();
            case "MAX":
                return new org.openhab.core.internal.items.function.Max();
            case "LATEST":
                return new Latest();
            case "EARLIEST":
                return new Earliest();
            case "EQUALITY":
                return new GroupFunction.Equality();
            default:
                logger.error("Unknown group function '{}'. Using Equality instead.", functionName);
        }

        return new GroupFunction.Equality();
    }
}
