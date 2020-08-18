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
package org.openhab.core.config.core.internal.normalization;

import static java.util.Map.entry;

import java.util.Map;

import org.openhab.core.config.core.ConfigDescriptionParameter;
import org.openhab.core.config.core.ConfigDescriptionParameter.Type;
import org.openhab.core.config.core.Normalizer;
import org.openhab.core.config.core.NormalizerFactory;
import org.osgi.service.component.annotations.Component;

/**
 * The {@link NormalizerFactoryImpl} can be used in order to obtain the {@link Normalizer} for any concrete
 * {@link ConfigDescriptionParameter.Type}.
 *
 * @author Simon Kaufmann - Initial contribution
 * @author Thomas Höfer - introduced normalizers map and added precondition check as well as some additional javadoc
 * @author Łukasz Dywicki - Separated interface from implementation
 */
@Component(service = NormalizerFactory.class)
public final class NormalizerFactoryImpl implements NormalizerFactory {

    private static final Map<Type, Normalizer> NORMALIZERS = Map.ofEntries(entry(Type.BOOLEAN, new BooleanNormalizer()),
            entry(Type.TEXT, new TextNormalizer()), entry(Type.INTEGER, new IntNormalizer()),
            entry(Type.DECIMAL, new DecimalNormalizer()));

    /**
     * Returns the {@link Normalizer} for the type of the given config description parameter.
     *
     * @param configDescriptionParameter the config description parameter (must not be null)
     * @return the corresponding {@link Normalizer} (not null)
     * @throws IllegalArgumentException if the given config description parameter is null
     */
    @Override
    public Normalizer getNormalizer(ConfigDescriptionParameter configDescriptionParameter) {
        if (configDescriptionParameter == null) {
            throw new IllegalArgumentException("The config description parameter must not be null.");
        }

        Normalizer ret = NORMALIZERS.get(configDescriptionParameter.getType());
        return configDescriptionParameter.isMultiple() ? new ListNormalizer(ret) : ret;
    }
}
