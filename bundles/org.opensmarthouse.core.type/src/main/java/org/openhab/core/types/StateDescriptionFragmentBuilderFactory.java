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

import org.eclipse.jdt.annotation.NonNullByDefault;

/**
 * Root entry point for building state description builders.
 *
 * @author Łukasz Dywicki - Initial contribution
 */
@NonNullByDefault
public interface StateDescriptionFragmentBuilderFactory {

    /**
     * Create and return a fresh builder instance.
     *
     * @return a fresh {@link StateDescriptionFragmentBuilder} instance.
     */
    StateDescriptionFragmentBuilder create();

    /**
     * Create a builder instance and initialize all fields from the given {@link StateDescription}.
     * Note: State options will only be taken into account if the list is not empty.
     *
     * @param legacy the {@link StateDescription} this builder be initialized from.
     * @return the builder.
     */
    StateDescriptionFragmentBuilder create(StateDescription legacy);
}
