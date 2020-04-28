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
package org.openhab.core.internal.types;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.openhab.core.types.CommandDescription;
import org.openhab.core.types.CommandDescriptionBuilder;
import org.openhab.core.types.CommandOption;

/**
 * Used to build instances of {@link CommandDescription}.
 *
 * @author Henning Treu - Initial contribution
 */
@NonNullByDefault
public class CoreCommandDescriptionBuilder implements CommandDescriptionBuilder {

    private final List<CommandOption> commandOptions = new ArrayList<>();

    private CoreCommandDescriptionBuilder() {
        // prevent public instantiation
    }

    /**
     * Create and return a fresh builder instance.
     *
     * @return a fresh {@link CommandDescriptionBuilder} instance.
     */
    public static CommandDescriptionBuilder create() {
        return new CoreCommandDescriptionBuilder();
    }

    @Override
    public CommandDescription build() {
        CommandDescriptionImpl commandDescription = new CommandDescriptionImpl();
        commandOptions.forEach(co -> commandDescription.addCommandOption(co));
        return commandDescription;
    }

    @Override
    public CommandDescriptionBuilder withCommandOption(CommandOption commandOption) {
        commandOptions.add(commandOption);
        return this;
    }

    @Override
    public CommandDescriptionBuilder withCommandOptions(List<CommandOption> commandOptions) {
        this.commandOptions.clear();
        this.commandOptions.addAll(commandOptions);
        return this;
    }
}
