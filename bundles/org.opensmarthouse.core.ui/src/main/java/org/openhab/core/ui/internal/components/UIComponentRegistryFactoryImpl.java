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
package org.openhab.core.ui.internal.components;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.eclipse.jdt.annotation.NonNull;
import org.openhab.core.common.registry.ManagedProvider;
import org.openhab.core.common.registry.Provider;
import org.openhab.core.storage.StorageService;
import org.openhab.core.ui.components.RootUIComponent;
import org.openhab.core.ui.components.UIComponentRegistryFactory;
import org.openhab.core.ui.components.UIProvider;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;

/**
 * Implementation for a {@link UIComponentRegistryFactory} using a set of {@link UIComponentProvider}.
 *
 * @author Yannick Schaus - Initial contribution
 * @author Łukasz Dywicki - Removed explicit dependency on storage providers.
 */
@Component(service = UIComponentRegistryFactory.class, immediate = true)
public class UIComponentRegistryFactoryImpl implements UIComponentRegistryFactory {
    Map<String, UIComponentRegistryImpl> registries = new ConcurrentHashMap<>();
    Map<String, Set<UIProvider>> providers = new ConcurrentHashMap<>();

    @Override
    public UIComponentRegistryImpl getRegistry(String namespace) {
        UIComponentRegistryImpl registry = registries.get(namespace);
        if (registry == null) {
            Set<UIProvider> namespaceProviders = this.providers.get(namespace);
            ManagedProvider<@NonNull RootUIComponent, @NonNull String> managedProvider = null;
            if (namespaceProviders != null) {
                for (UIProvider provider : namespaceProviders) {
                    if (provider instanceof ManagedProvider) {
                        managedProvider = (ManagedProvider<@NonNull RootUIComponent, @NonNull String>) provider;
                        break;
                    }
                }
            }
            registry = new UIComponentRegistryImpl(namespace, managedProvider, namespaceProviders);
            registries.put(namespace, registry);
        }
        return registry;
    }

    @Reference(cardinality = ReferenceCardinality.MULTIPLE, policy = ReferencePolicy.DYNAMIC)
    void addProvider(UIProvider provider) {
        if (registries.containsKey(provider.getNamespace())) {
            registries.get(provider.getNamespace()).addProvider(provider);
        }
        registerProvider(provider);
    }

    void removeProvider(UIProvider provider) {
        if (registries.containsKey(provider.getNamespace())) {
            registries.get(provider.getNamespace()).removeProvider(provider);
        }
        deregisterProvider(provider);
    }

    private void registerProvider(UIProvider provider) {
        if (!providers.containsKey(provider.getNamespace())) {
            providers.put(provider.getNamespace(), new HashSet<>());
        }
        providers.get(provider.getNamespace()).add(provider);
    }

    private void deregisterProvider(UIProvider provider) {
        if (providers.containsKey(provider.getNamespace())) {
            providers.get(provider.getNamespace()).remove(provider);
        }
    }
}
