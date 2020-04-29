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
package org.openhab.core.types;

import java.util.List;

import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.types.registry.TypeFactory;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;

/**
 * This is a helper class that helps parsing a string into an OpenSmartHouse type (state or command).
 * This class uses the {@link TypeFactory} service to create {@link Type}s.
 * <p>
 * OpenSmartHouse bundles should not use this static factory class and should instead use the {@link TypeFactory}
 * directly.
 *
 * @author Kai Kreuzer - Initial contribution
 * @author Chris Jackson - Refactor for OpenSmartHouse to use {@link TypeFactory}
 * @deprecated OpenSmartHouse users should use the {@link TypeFactory}
 */
@Deprecated
public final class TypeParser {
    private @Nullable static TypeFactory typeRegistry;

    /**
     * No instances allowed.
     */
    private TypeParser() {
    }

    @Reference(cardinality = ReferenceCardinality.MANDATORY, policy = ReferencePolicy.DYNAMIC)
    public void setTypeProvider(TypeFactory typeRegistry) {
        TypeParser.typeRegistry = typeRegistry;
    }

    public void unsetTypeProvider(TypeFactory typeRegistry) {
        TypeParser.typeRegistry = null;
    }

    /**
     * Parses a string into a type.
     *
     * @param typeName name of the type, for example StringType.
     * @param input input string to parse.
     * @return Parsed type or null, if the type couldn't be parsed.
     */
    public static Type parseType(String typeName, String input) {
        if (typeRegistry == null) {
            return null;
        }
        return typeRegistry.parseType(typeName, input);
    }

    /**
     * Determines a state from a string. Possible state types are passed as a parameter. Note that the order matters
     * here; the first type that accepts the string as a valid value, will be used for the state.
     * <p>
     * Example: The type list is OnOffType.class,StringType.class. The string "ON" is now accepted by the OnOffType and
     * thus OnOffType.ON will be returned (and not a StringType with value "ON").
     *
     * @param types possible types of the state to consider
     * @param input the string to parse
     * @return the corresponding State instance or <code>null</code>
     */
    public static State parseState(List<Class<? extends State>> types, String input) {
        if (typeRegistry == null) {
            return null;
        }
        return typeRegistry.parseState(types, input);
    }

    /**
     * Determines a command from a string. Possible command types are passed as a parameter. Note that the order matters
     * here; the first type that accepts the string as a valid value, will be used for the command.
     * <p>
     * Example: The type list is OnOffType.class,StringType.class. The string "ON" is now accepted by the OnOffType and
     * thus OnOffType.ON will be returned (and not a StringType with value "ON").
     *
     * @param types possible types of the command to consider
     * @param input the string to parse
     * @return the corresponding Command instance or <code>null</code>
     */
    public static Command parseCommand(List<Class<? extends Command>> types, String input) {
        if (typeRegistry == null) {
            return null;
        }
        return typeRegistry.parseCommand(types, input);
    }
}
