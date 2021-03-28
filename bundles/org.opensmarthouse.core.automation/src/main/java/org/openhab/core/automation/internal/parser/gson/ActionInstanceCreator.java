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
package org.openhab.core.automation.internal.parser.gson;

import java.lang.reflect.Type;

import org.openhab.core.automation.type.ActionType;
import org.openhab.core.automation.type.CompositeActionType;

import com.google.gson.InstanceCreator;

/**
 * This class creates {@link ActionType} instances.
 *
 * @author Ana Dimova - Initial contribution
 */
public class ActionInstanceCreator implements InstanceCreator<CompositeActionType> {

    @Override
    public CompositeActionType createInstance(Type type) {
        return new CompositeActionType(null, null, null, null, null);
    }
}
