/**
 * Copyright (c) 2020-2021 Contributors to the OpenSmartHouse project
 * Copyright (c) 2010-2021 Contributors to the openHAB project
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
package org.openhab.core.thing.link;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.openhab.core.common.registry.ManagedProvider;
import org.openhab.core.thing.ThingUID;

/**
 * {@link ManagedItemChannelLinkProvider} is responsible for managed {@link ItemChannelLink}s at runtime.
 *
 * @author Dennis Nobel - Initial contribution
 * @author Łuaksz Dywicki - Separated storage implementation from provider interface.
 */
@NonNullByDefault
public interface ManagedItemChannelLinkProvider extends ManagedProvider<ItemChannelLink, String>, ItemChannelLinkProvider {

    /**
     * Remove all links for given #thingUID.
     *
     * @param thingUID Thing id to clear links for.
     */
    void removeLinksForThing(ThingUID thingUID);

}
