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
package org.openhab.core.config.core.compat;

import org.openhab.core.config.core.ConfigDescriptionParameter;
import org.openhab.core.config.core.Normalizer;
import org.openhab.core.config.core.NormalizerFactory;
import org.openhab.core.config.core.internal.normalization.NormalizerFactoryImpl;

/**
 * Delegate for tests which really gets default implementation of normalizer factory.
 *
 * @author Łukasz Dywicki - Initial contribution.
 */
public class NormalizerFactoryDelegate implements NormalizerFactory {

    @Override
    public Normalizer getNormalizer(ConfigDescriptionParameter configDescriptionParameter) {
        return new NormalizerFactoryImpl().getNormalizer(configDescriptionParameter);
    }

}
