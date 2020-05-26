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
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

/**
 * A delegate type which looks up for {@link NormalizerFactory} in osgi service registry.
 *
 * @author Łuaksz Dywicki - Initial contribution.
 */
public class NormalizerFactoryDelegate implements NormalizerFactory {

    private final BundleContext bundleContext;

    public NormalizerFactoryDelegate() {
        this(FrameworkUtil.getBundle(NormalizerFactoryDelegate.class).getBundleContext());
    }

    public NormalizerFactoryDelegate(BundleContext bundleContext) {
        this.bundleContext = bundleContext;
    }

    @Override
    public Normalizer getNormalizer(ConfigDescriptionParameter configDescriptionParameter) {
        ServiceReference<NormalizerFactory> reference = bundleContext.getServiceReference(NormalizerFactory.class);
        return new NormalizerDelegate(bundleContext.getService(reference).getNormalizer(configDescriptionParameter),
                (svc) -> bundleContext.ungetService(reference));
    }

}
