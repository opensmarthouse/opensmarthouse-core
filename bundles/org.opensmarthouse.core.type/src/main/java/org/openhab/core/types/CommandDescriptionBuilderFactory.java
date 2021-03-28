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
package org.openhab.core.types;

import org.eclipse.jdt.annotation.NonNullByDefault;

/**
 * A root entry point for creating custom command descriptions.
 *
 * @author Łukasz Dywicki - Initial contribution.
 */
@NonNullByDefault
public interface CommandDescriptionBuilderFactory {

    /**
     * Creates a command description builder.
     *
     * @return Command description builder.
     */
    CommandDescriptionBuilder create();
}
