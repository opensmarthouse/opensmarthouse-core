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
package org.openhab.core.library.types.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.openhab.core.library.types.DateTimeType;
import org.openhab.core.library.types.DecimalType;
import org.openhab.core.library.types.HSBType;
import org.openhab.core.library.types.IncreaseDecreaseType;
import org.openhab.core.library.types.NextPreviousType;
import org.openhab.core.library.types.OnOffType;
import org.openhab.core.library.types.OpenClosedType;
import org.openhab.core.library.types.PercentType;
import org.openhab.core.library.types.PlayPauseType;
import org.openhab.core.library.types.PointType;
import org.openhab.core.library.types.QuantityType;
import org.openhab.core.library.types.RawType;
import org.openhab.core.library.types.RewindFastforwardType;
import org.openhab.core.library.types.StopMoveType;
import org.openhab.core.library.types.StringListType;
import org.openhab.core.library.types.StringType;
import org.openhab.core.library.types.UpDownType;
import org.openhab.core.types.Type;
import org.openhab.core.types.registry.TypeProvider;

/**
 * Implements the {@link TypeProvider} for the core OpenSmartHouse types
 * 
 * @author Chris Jackson - Initial contribution
 *
 */
@org.osgi.service.component.annotations.Component(immediate = true, service = TypeProvider.class)
public class CoreTypeProvider implements TypeProvider {
    static private final Map<String, Method> types;

    static {
        Map<String, Method> mutableTypes = new ConcurrentHashMap<>();

        addType(mutableTypes, DateTimeType.class);
        addType(mutableTypes, DecimalType.class);
        addType(mutableTypes, HSBType.class);
        addType(mutableTypes, IncreaseDecreaseType.class);
        addType(mutableTypes, NextPreviousType.class);
        addType(mutableTypes, OnOffType.class);
        addType(mutableTypes, OpenClosedType.class);
        addType(mutableTypes, PercentType.class);
        addType(mutableTypes, PlayPauseType.class);
        addType(mutableTypes, PointType.class);
        addType(mutableTypes, QuantityType.class);
        addType(mutableTypes, RawType.class);
        addType(mutableTypes, RewindFastforwardType.class);
        addType(mutableTypes, StopMoveType.class);
        addType(mutableTypes, StringListType.class);
        addType(mutableTypes, StringType.class);
        addType(mutableTypes, UpDownType.class);

        types = Collections.unmodifiableMap(mutableTypes);
    }

    static private void addType(Map<String, Method> mutableTypes, Class<? extends Type> type) {
        try {
            Method valueOf = type.getMethod("valueOf", String.class);
            mutableTypes.put(type.getSimpleName(), valueOf);
        } catch (NoSuchMethodException | SecurityException | IllegalArgumentException e) {
        }
    }

    @Override
    public Set<String> getProvidedTypes() {
        return types.keySet();
    }

    @Override
    public Type createType(String type, String value) {
        try {
            Type newType = (Type) types.get(type).invoke(type, value);
            if (newType != null) {
                return newType;
            }
        } catch (SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
        }
        throw new IllegalArgumentException("Unable to create Type " + type + " with value " + value);
    }

}
