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
package org.openhab.core.items;

import java.util.List;
import java.util.Set;
import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.common.registry.ManagedProvider;
import org.openhab.core.storage.StorageService;

/**
 * {@link ManagedItemProvider} is an OSGi service, that allows to add or remove
 * items at runtime by calling {@link ManagedItemProvider#addItem(Item)} or {@link ManagedItemProvider#removeItem(Item)}
 * . An added item is automatically
 * exposed to the {@link ItemRegistry}. Persistence of added Items is handled by
 * a {@link StorageService}. Items are being restored using the given {@link ItemFactory}s.
 *
 * @author Dennis Nobel - Initial contribution, added support for GroupItems
 * @author Thomas Eichstaedt-Engelen - Initial contribution
 * @author Kai Kreuzer - improved return values
 * @author Alex Tugarev - added tags
 * @author Łuaksz Dywicki - Separated storage implementation from interface.
 */
@NonNullByDefault
public interface ManagedItemProvider extends ManagedProvider<Item, String>, ItemProvider {

    /**
     * Removes an item and it´s member if recursive flag is set to true.
     *
     * @param itemName item name to remove
     * @param recursive if set to true all members of the item will be removed, too.
     * @return removed item or null if no item with that name exists
     */
    @Nullable
    Item remove(String itemName, boolean recursive);

}
