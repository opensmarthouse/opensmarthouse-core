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

import java.util.Map;
import java.util.function.Consumer;
import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.config.discovery.DiscoveryResult;
import org.openhab.core.config.discovery.DiscoveryResultBuilder;
import org.openhab.core.thing.ThingTypeUID;
import org.openhab.core.thing.ThingUID;

/**
 * A delegate for calling delegate service and releasing service reference to underlying builder once process is completed.
 *
 * @author Łukasz Dywicki - Initial contribution.
 */
@NonNullByDefault
class DiscoveryResultBuilderDelegate implements DiscoveryResultBuilder {

    private final DiscoveryResultBuilder delegate;
    private final Consumer<DiscoveryResultBuilder> closeable;

    public DiscoveryResultBuilderDelegate(DiscoveryResultBuilder delegate, Consumer<DiscoveryResultBuilder> closeable) {
        this.delegate = delegate;
        this.closeable = closeable;
    }

    @Override
    public DiscoveryResultBuilder withThingType(@Nullable ThingTypeUID thingTypeUID) {
        return delegate.withThingType(thingTypeUID);
    }

    @Override
    public DiscoveryResultBuilder withProperties(@Nullable Map<String, Object> properties) {
        return delegate.withProperties(properties);
    }

    @Override
    public DiscoveryResultBuilder withProperty(String key, Object value) {
        return delegate.withProperty(key, value);
    }

    @Override
    public DiscoveryResultBuilder withRepresentationProperty(@Nullable String representationProperty) {
        return delegate.withRepresentationProperty(representationProperty);
    }

    @Override
    public DiscoveryResultBuilder withBridge(@Nullable ThingUID bridgeUID) {
        return delegate.withBridge(bridgeUID);
    }

    @Override
    public DiscoveryResultBuilder withLabel(@Nullable String label) {
        return delegate.withLabel(label);
    }

    @Override
    public DiscoveryResultBuilder withTTL(long ttl) {
        return delegate.withTTL(ttl);
    }

    @Override
    public DiscoveryResult build() {
        try {
            return delegate.build();
        } finally {
            closeable.accept(delegate);
        }
    }

}
