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
package org.openhab.core.internal.types;

import org.openhab.core.types.StateDescription;
import org.openhab.core.types.StateDescriptionFragmentBuilder;
import org.openhab.core.types.StateDescriptionFragmentBuilderFactory;
import org.osgi.service.component.annotations.Component;

/**
 * Defauult implementation of {@link StateDescriptionFragmentBuilderFactory}.
 *
 * @author Łukasz Dywicki - Initial contribution
 */
@Component(service = StateDescriptionFragmentBuilderFactory.class)
public class DefaultStateDescriptionFragmentBuilderFactory implements StateDescriptionFragmentBuilderFactory {

  @Override
  public StateDescriptionFragmentBuilder create() {
    return StateDescriptionFragmentBuilder.create();
  }

  @Override
  public StateDescriptionFragmentBuilder create(StateDescription legacy) {
    return StateDescriptionFragmentBuilder.create(legacy);
  }

}
