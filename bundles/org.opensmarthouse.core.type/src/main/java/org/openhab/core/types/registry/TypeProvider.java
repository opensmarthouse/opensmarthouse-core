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
package org.openhab.core.types.registry;

import java.util.Map;
import java.util.Set;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.openhab.core.types.Type;

/**
 * A {@link TypeProvider} is registered with the {@link TypeFactory} and provides {@link Type}s to the OpenSmartHouse
 * framework.
 * 
 * @author Chris Jackson - Initial contribution
 *
 */
@NonNullByDefault
public interface TypeProvider {

    /**
     * Gets a {@link Set} of string names of the {@link Type}s provided by this {@link TypeProvider}
     * 
     * @return a {@link Map} of string names of the {@link Type}s provided by this {@link TypeProvider}
     */
    Set<String> getProvidedTypes();

    /**
     * Creates a {@link Type} given the name of the type, and the value
     * 
     * @param type the {@link Type} name
     * @param value a {@link String} containing the value
     * @return the {@link Type}
     */
    Type createType(String type, String value);

}
