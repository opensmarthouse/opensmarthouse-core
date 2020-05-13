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
package org.openhab.core.config.discovery.compat;

import org.openhab.core.config.discovery.DiscoveryResultBuilder;
import org.openhab.core.config.discovery.DiscoveryResultBuilderFactory;
import org.openhab.core.thing.ThingUID;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

/**
 * A bit hacky way to keep compatibility of constructors and avoid additional changes in sources of calling types.
 * This is a static lookup for {@link DiscoveryResultBuilderFactory} service. This class is necessary until callers are
 * updated to new way of obtaining builders through factory interface.
 *
 * @author Łukasz Dywicki - Initial contribution.
 */
public class DiscoveryResultBuilderFactoryDelegate implements DiscoveryResultBuilderFactory {

    private final BundleContext bundleContext;

    public DiscoveryResultBuilderFactoryDelegate() {
        this(FrameworkUtil.getBundle(DiscoveryResultBuilderFactoryDelegate.class).getBundleContext());
    }

    public DiscoveryResultBuilderFactoryDelegate(BundleContext bundleContext) {
        this.bundleContext = bundleContext;
    }

    @Override
    public DiscoveryResultBuilder create(ThingUID thingUID) {
        ServiceReference<DiscoveryResultBuilderFactory> reference = bundleContext.getServiceReference(DiscoveryResultBuilderFactory.class);
        return new DiscoveryResultBuilderDelegate(bundleContext.getService(reference).create(thingUID), (svc) -> bundleContext.ungetService(reference));
    }
}
