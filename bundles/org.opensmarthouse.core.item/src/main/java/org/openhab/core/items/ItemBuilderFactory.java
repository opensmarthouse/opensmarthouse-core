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
package org.openhab.core.items;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.items.dto.GroupFunctionDTO;

/**
 * Creates a new {@link ItemBuilder} which is based on all available {@link ItemFactory}s.
 *
 * @author Henning Treu - Initial contribution
 */
@NonNullByDefault
public interface ItemBuilderFactory {

    /**
     * Create a new {@link ItemBuilder}, which is initialized by the given item.
     *
     * @param item the template to initialize the builder with
     * @return an ItemBuilder instance
     */
    ItemBuilder newItemBuilder(Item item);

    /**
     * Create a new {@link ItemBuilder}, which is initialized by the given item.
     *
     * @param itemType the item type to create
     * @param itemName the name of the item to create
     * @return an ItemBuilder instance
     */
    ItemBuilder newItemBuilder(String itemType, String itemName);

    // FIXME verify if that's valid approach
    GroupFunction newFunctionBuilder(@Nullable Item baseItem, GroupFunctionDTO function);
}
