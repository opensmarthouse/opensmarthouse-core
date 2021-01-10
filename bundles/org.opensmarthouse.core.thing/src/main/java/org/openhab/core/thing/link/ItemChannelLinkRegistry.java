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
package org.openhab.core.thing.link;

import java.util.Set;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.openhab.core.items.Item;
import org.openhab.core.thing.ChannelUID;
import org.openhab.core.thing.Thing;
import org.openhab.core.thing.ThingUID;
import org.openhab.core.thing.UID;

/**
 * {@link ItemChannelLinkRegistry} tracks all {@link ItemChannelLinkProvider}s
 * and aggregates all {@link ItemChannelLink}s.
 *
 * @author Dennis Nobel - Initial contribution
 * @author Markus Rathgeb - Linked items returns only existing items
 * @author Markus Rathgeb - Rewrite collection handling to improve performance
 */
@NonNullByDefault
public interface ItemChannelLinkRegistry extends LinkRegistry<ItemChannelLink> {

    /**
     * Returns a set of bound channels for the given item name.
     *
     * @param itemName item name
     * @return an unmodifiable set of bound channels for the given item name
     */
    Set<ChannelUID> getBoundChannels(String itemName);

    @Override
    Set<String> getLinkedItemNames(UID uid);

    /**
     * Returns a set of bound items for the given channel UID.
     *
     * @param uid channel UID
     * @return an unmodifiable set of bound items for the given channel UID
     */
    Set<Item> getLinkedItems(UID uid);

    /**
     * Returns a set of bound things for the given item name.
     *
     * @param itemName item name
     * @return an unmodifiable set of bound things for the given item name
     */
    Set<Thing> getBoundThings(String itemName);

    void removeLinksForThing(ThingUID thingUID);

}
