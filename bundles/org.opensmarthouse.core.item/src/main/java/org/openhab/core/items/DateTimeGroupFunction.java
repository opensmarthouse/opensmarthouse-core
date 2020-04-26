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

import org.eclipse.jdt.annotation.NonNullByDefault;

/**
 * This interface is a container for group functions that require {@link org.openhab.core.library.types.DateTimeType}s
 * for its calculations.
 *
 * @author Robert Michalak - Initial contribution
 */
@NonNullByDefault
public interface DateTimeGroupFunction extends GroupFunction {

}
