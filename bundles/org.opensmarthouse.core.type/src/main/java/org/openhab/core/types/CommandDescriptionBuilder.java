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
import org.eclipse.jdt.annotation.NonNullByDefault;

/**
 * Used to build instances of {@link CommandDescription}.
 *
 * @author Henning Treu - Initial contribution
 * @author Łukasz Dywicki - Refactoring to interface.
 */
@NonNullByDefault
public interface CommandDescriptionBuilder {
    /**
     * Build a {@link CommandDescription} from the values of this builder.
     *
     * @return a {@link CommandDescription} from the values of this builder.
     */
    CommandDescription build();

    /**
     * Add a {@link CommandOption} for the resulting {@link CommandDescription}.
     *
     * @param commandOption a {@link CommandOption} for the resulting {@link CommandDescription}.
     * @return this builder.
     */
    CommandDescriptionBuilder withCommandOption(CommandOption commandOption);

    /**
     * Set the {@link CommandOption}s for the resulting {@link CommandDescription}.
     *
     * @param commandOptions the {@link CommandOption}s for the resulting {@link CommandDescription}.
     * @return this builder.
     */
    CommandDescriptionBuilder withCommandOptions(List<CommandOption> commandOptions);
}
