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
package org.openhab.core.config.discovery;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.openhab.core.thing.ThingUID;

/**
 * Factory interface which allows to create a new discovery result bulder.
 *
 * @author Łukasz Dywicki - Initial contribution.
 */
@NonNullByDefault
public interface DiscoveryResultBuilderFactory {

    /**
     * Creates new discovery result builder.
     *
     * @param thingUID Thing identifier.
     * @return Discovery result builder.
     */
    DiscoveryResultBuilder create(ThingUID thingUID);

}
