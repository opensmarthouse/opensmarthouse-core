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
package org.openhab.core.library;

/**
 * Standard item types available in item library.
 * Extracted out from {@link org.openhab.core.internal.items.CoreItemFactory} which holds specific implementation logic.
 *
 * @author Łukasz Dywicki - Initial contribution.
 */
public interface CoreItemFactory {

    String CALL = "Call";
    String COLOR = "Color";
    String CONTACT = "Contact";
    String DATETIME = "DateTime";
    String DIMMER = "Dimmer";
    String IMAGE = "Image";
    String LOCATION = "Location";
    String NUMBER = "Number";
    String PLAYER = "Player";
    String ROLLERSHUTTER = "Rollershutter";
    String STRING = "String";
    String SWITCH = "Switch";


}
