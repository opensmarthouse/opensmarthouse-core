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
package org.openhab.core.config.discovery.internal;

import org.openhab.core.config.discovery.DiscoveryResultBuilder;
import org.openhab.core.config.discovery.DiscoveryResultBuilderFactory;
import org.openhab.core.thing.ThingUID;
import org.osgi.service.component.annotations.Component;

/**
 * Default implementation of discovery result builder.
 *
 * @author Łukasz Dywicki - Initial contribution.
 */
@Component
public class DiscoveryResultBuilderFactoryImpl implements DiscoveryResultBuilderFactory {

    @Override
    public DiscoveryResultBuilder create(ThingUID thingUID) {
        return new DiscoveryResultBuilderImpl(thingUID);
    }

}
