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
package org.openhab.core.types.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.openhab.core.types.RefreshType;
import org.openhab.core.types.Type;
import org.openhab.core.types.UnDefType;
import org.openhab.core.types.registry.TypeProvider;
import org.osgi.service.component.annotations.Component;

/**
 * Implements the {@link TypeProvider} for the base library types
 * 
 * @author Chris Jackson - Initial contribution
 *
 */
@SuppressWarnings("deprecation")
@Component(immediate = true, service = TypeProvider.class)
public class BaseTypeProvider implements TypeProvider {
    static private final Map<String, Method> types;

    static {
        Map<String, Method> mutableTypes = new ConcurrentHashMap<>();

        addType(mutableTypes, RefreshType.class);
        addType(mutableTypes, UnDefType.class);

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
