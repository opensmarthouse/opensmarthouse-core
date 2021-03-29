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

import java.util.Set;
import org.eclipse.jdt.annotation.NonNullByDefault;
import org.openhab.core.common.registry.ProviderChangeListener;
import org.openhab.core.common.registry.Registry;
import org.openhab.core.thing.UID;

/**
 * {@link LinkRegistry} is base type for link related repositories.
 *
 * @author Łukasz Dywicki - Initial contribution.
 *
 * @param <L> Concrete type of the link.
 */
@NonNullByDefault
public interface LinkRegistry<L extends AbstractLink> extends ProviderChangeListener<L>, Registry<L, String> {

    /**
     * Returns if an item for a given item name is linked to a channel or thing for a
     * given UID.
     *
     * @param itemName item name
     * @param uid UID
     * @return true if linked, false otherwise
     */
    boolean isLinked(String itemName, UID uid);

    /**
     * Returns if a link for the given item name exists.
     *
     * @param itemName item name
     * @return true if a link exists, otherwise false
     */
    boolean isLinked(String itemName);

    /**
     * Returns if a link for the given UID exists.
     *
     * @param uid UID
     * @return true if a link exists, otherwise false
     */
    boolean isLinked(UID uid);

    /**
     * Returns the item names, which are bound to the given UID.
     *
     * @param uid UID
     * @return a non-null unmodifiable collection of item names that are linked to the given UID.
     */
    Set<String> getLinkedItemNames(UID uid);

    /**
     * Returns all links for a given UID.
     *
     * @param uid a channel UID
     * @return an unmodifiable set of links for the given UID
     */
    Set<L> getLinks(UID uid);

    /**
     * Returns all links for a given item name.
     *
     * @param itemName the name of the item
     * @return an unmodifiable set of links for the given item name
     */
    Set<L> getLinks(String itemName);

}
