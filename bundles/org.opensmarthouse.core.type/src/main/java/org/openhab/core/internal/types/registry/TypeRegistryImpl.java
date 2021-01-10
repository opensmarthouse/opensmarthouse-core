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
package org.openhab.core.internal.types.registry;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

import org.openhab.core.types.Command;
import org.openhab.core.types.State;
import org.openhab.core.types.Type;
import org.openhab.core.types.registry.TypeProvider;
import org.openhab.core.types.registry.TypeFactory;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implements the OpenSmartHouse {@link TypeFactory}
 * 
 * @author Chris Jackson - Initial contribution
 *
 */
@Component(immediate = true, service = TypeFactory.class)
public class TypeRegistryImpl implements TypeFactory {
    /**
     * The logger
     */
    private final Logger logger = LoggerFactory.getLogger(TypeRegistryImpl.class);

    /**
     * The registry of all known {@link TypeProvider}s
     */
    private Map<String, TypeProvider> typeProviders = new ConcurrentHashMap<>();

    @org.osgi.service.component.annotations.Reference(cardinality = ReferenceCardinality.MULTIPLE, policy = ReferencePolicy.DYNAMIC)
    public void addTypeProvider(TypeProvider typeProvider) {
        synchronized (typeProviders) {
            for (String type : typeProvider.getProvidedTypes()) {
                if (typeProviders.get(type) != null && typeProviders.get(type) != typeProvider) {
                    throw new IllegalArgumentException("TypeProvider " + typeProvider.getClass().getSimpleName()
                            + " provides types also provided by " + typeProviders.get(type).getClass().getSimpleName());
                }

                typeProviders.put(type, typeProvider);
            }
        }
        logger.debug("Added TypeProvider {} which provides {}", typeProvider.getClass().getSimpleName(),
                typeProvider.getProvidedTypes());
    }

    public void removeTypeProvider(TypeProvider typeProvider) {
        synchronized (typeProviders) {
            Iterator<Entry<String, TypeProvider>> iterator = typeProviders.entrySet().iterator();
            while (iterator.hasNext()) {
                Entry<String, TypeProvider> entry = iterator.next();
                if (entry.getValue().equals(typeProvider)) {
                    iterator.remove();
                }
            }
        }
    }

    @Override
    public Type parseType(String typeName, String input) {
        TypeProvider provider = typeProviders.get(typeName);
        if (provider == null) {
            return null;
        }

        try {
            return provider.createType(typeName, input);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    @Override
    public State parseState(List<Class<? extends State>> types, String input) {
        for (Class<? extends Type> type : types) {
            Type state = parseType(type.getSimpleName(), input);
            if (state != null) {
                return (State) state;
            }
        }
        return null;
    }

    @Override
    public Command parseCommand(List<Class<? extends Command>> types, String input) {
        for (Class<? extends Type> type : types) {
            Type command = parseType(type.getSimpleName(), input);
            if (command != null) {
                return (Command) command;
            }
        }
        return null;
    }
}
