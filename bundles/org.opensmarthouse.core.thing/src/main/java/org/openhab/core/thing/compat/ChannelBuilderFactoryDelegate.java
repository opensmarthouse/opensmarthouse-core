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
package org.openhab.core.thing.compat;

import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.thing.Channel;
import org.openhab.core.thing.ChannelUID;
import org.openhab.core.thing.binding.builder.ChannelBuilder;
import org.openhab.core.thing.binding.builder.ChannelBuilderFactory;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

/**
 * A delegate which finds a channel builder at runtime.
 * For compatibility reasons only.
 *
 * @author Łukasz Dywicki - Initial contribution.
 */
public class ChannelBuilderFactoryDelegate implements ChannelBuilderFactory {

    private final BundleContext bundleContext;

    public ChannelBuilderFactoryDelegate() {
        this(FrameworkUtil.getBundle(ChannelBuilderFactoryDelegate.class).getBundleContext());
    }

    public ChannelBuilderFactoryDelegate(BundleContext bundleContext) {
        this.bundleContext = bundleContext;
    }

    @Override
    public ChannelBuilder create(ChannelUID channelUID, @Nullable String acceptedItemType) {
        ServiceReference<ChannelBuilderFactory> reference = bundleContext.getServiceReference(ChannelBuilderFactory.class);
        return new ChannelBuilderDelegate(bundleContext.getService(reference).create(channelUID, acceptedItemType),
            (svc) -> bundleContext.ungetService(reference));
    }

    @Override
    public ChannelBuilder create(Channel channel) {
        ServiceReference<ChannelBuilderFactory> reference = bundleContext.getServiceReference(ChannelBuilderFactory.class);
        return new ChannelBuilderDelegate(bundleContext.getService(reference).create(channel),
            (svc) -> bundleContext.ungetService(reference));
    }
}
