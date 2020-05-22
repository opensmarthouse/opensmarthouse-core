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
package org.openhab.core.thing.internal.link;

import java.util.Collection;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.openhab.core.common.registry.DefaultAbstractManagedProvider;
import org.openhab.core.storage.StorageService;
import org.openhab.core.thing.ThingUID;
import org.openhab.core.thing.link.ItemChannelLink;
import org.openhab.core.thing.link.ItemChannelLinkProvider;
import org.openhab.core.thing.link.ManagedItemChannelLinkProvider;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 *
 * {@link ManagedItemChannelLinkProvider} is responsible for managed {@link ItemChannelLink}s at runtime.
 *
 * @author Dennis Nobel - Initial contribution
 * @author Łukasz Dywicki - Separated storage based implementation from {@link ManagedItemChannelLinkProvider} interface
 */
@NonNullByDefault
@Component(immediate = true, service = { ItemChannelLinkProvider.class, ManagedItemChannelLinkProvider.class })
public class StorageItemChannelLinkProvider extends DefaultAbstractManagedProvider<ItemChannelLink, String>
        implements  ManagedItemChannelLinkProvider {

    @Activate
    public StorageItemChannelLinkProvider(final @Reference StorageService storageService) {
        super(storageService);
    }

    @Override
    protected String getStorageName() {
        return ItemChannelLink.class.getName();
    }

    @Override
    protected String keyToString(String key) {
        return key;
    }

    @Override
    public void removeLinksForThing(ThingUID thingUID) {
        Collection<ItemChannelLink> itemChannelLinks = getAll();
        for (ItemChannelLink itemChannelLink : itemChannelLinks) {
            if (itemChannelLink.getLinkedUID().getThingUID().equals(thingUID)) {
                this.remove(itemChannelLink.getUID());
            }
        }
    }
}
