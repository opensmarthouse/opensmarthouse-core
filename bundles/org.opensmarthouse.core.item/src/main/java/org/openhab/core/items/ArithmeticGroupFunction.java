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

/**
 * This interface is only a container for functions that require the core type library
 * for its calculations.
 *
 * @author Kai Kreuzer - Initial contribution
 * @author Thomas Eichstädt-Engelen - Added "N" functions
 * @author Gaël L'hopital - Added count function
 */
@NonNullByDefault
public interface ArithmeticGroupFunction extends GroupFunction {

}
