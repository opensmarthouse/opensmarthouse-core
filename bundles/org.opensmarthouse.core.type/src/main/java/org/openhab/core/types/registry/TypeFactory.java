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
package org.openhab.core.types.registry;

import java.util.List;

import org.openhab.core.types.Command;
import org.openhab.core.types.State;
import org.openhab.core.types.Type;

/**
 * The {@link TypeFactory} allows {@link TypeProvider}s to register and provide a set of {@link Type}s to the
 * OpenSmartHouse framework.
 * 
 * @author Chris Jackson - Initial contribution
 *
 */
public interface TypeFactory {

    /**
     * Parses a string into a type.
     *
     * @param typeName name of the {@link Type}, for example StringType.
     * @param input input string to parse.
     * @return Parsed {@link Type} or null, if the type couldn't be parsed.
     */
    public Type parseType(String typeName, String input);

    /**
     * Determines a state from a string. Possible state types are passed as a parameter. Note that the order matters
     * here; the first type that accepts the string as a valid value, will be used for the state.
     * <p>
     * Example: The type list is OnOffType.class,StringType.class. The string "ON" is now accepted by the OnOffType and
     * thus OnOffType.ON will be returned (and not a StringType with value "ON").
     *
     * @param types possible {@link Type}s of the {@link State} to consider
     * @param input the string to parse
     * @return the corresponding {@link State} instance or <code>null</code>
     */
    public State parseState(List<Class<? extends State>> types, String input);

    /**
     * Determines a command from a string. Possible command types are passed as a parameter. Note that the order matters
     * here; the first type that accepts the string as a valid value, will be used for the command.
     * <p>
     * Example: The type list is OnOffType.class,StringType.class. The string "ON" is now accepted by the OnOffType and
     * thus OnOffType.ON will be returned (and not a StringType with value "ON").
     *
     * @param types possible {@link Types} of the {@link Command} to consider
     * @param input the string to parse
     * @return the corresponding {@link Command} instance or <code>null</code>
     */
    public Command parseCommand(List<Class<? extends Command>> types, String input);
}
