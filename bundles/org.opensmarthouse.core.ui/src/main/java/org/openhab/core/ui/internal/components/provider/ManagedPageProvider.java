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
package org.openhab.core.ui.internal.components.provider;

import org.openhab.core.common.registry.ManagedProvider;
import org.openhab.core.common.registry.Provider;
import org.openhab.core.storage.StorageService;
import org.openhab.core.ui.components.UIProvider;
import org.openhab.core.ui.internal.components.UIComponentProvider;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(service = {Provider.class, ManagedProvider.class, UIProvider.class})
public class ManagedPageProvider extends UIComponentProvider {

  @Activate
  public ManagedPageProvider(@Reference StorageService storageService) {
    super("ui:page", storageService);
  }

}
