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
package org.openhab.core.config.core;

/**
 * The {@link NormalizerFactoryImpl} can be used in order to obtain the {@link Normalizer} for any concrete
 * {@link ConfigDescriptionParameter.Type}.
 *
 * @author Simon Kaufmann - Initial contribution
 * @author Thomas Höfer - introduced normalizers map and added precondition check as well as some additional javadoc
 * @author Łukasz Dywicki - Extracted interface
 */
public interface NormalizerFactory {

    /**
     * Returns the {@link Normalizer} for the type of the given config description parameter.
     *
     * @param configDescriptionParameter the config description parameter (must not be null)
     * @return the corresponding {@link Normalizer} (not null)
     * @throws IllegalArgumentException if the given config description parameter is null
     */
    Normalizer getNormalizer(ConfigDescriptionParameter configDescriptionParameter);
}
