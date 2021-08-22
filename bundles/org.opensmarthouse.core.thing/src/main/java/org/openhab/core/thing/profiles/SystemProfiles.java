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
package org.openhab.core.thing.profiles;

import static org.openhab.core.thing.profiles.ProfileTypeUID.SYSTEM_SCOPE;

import org.eclipse.jdt.annotation.NonNullByDefault;

/**
 * System profile constants.
 *
 * @author Simon Kaufmann - Initial contribution
 */
@NonNullByDefault
public interface SystemProfiles {

    ProfileTypeUID DEFAULT = new ProfileTypeUID(SYSTEM_SCOPE, "default");
    ProfileTypeUID FOLLOW = new ProfileTypeUID(SYSTEM_SCOPE, "follow");
    ProfileTypeUID OFFSET = new ProfileTypeUID(SYSTEM_SCOPE, "offset");
    ProfileTypeUID HYSTERESIS = new ProfileTypeUID(SYSTEM_SCOPE, "hysteresis");
    ProfileTypeUID RAWBUTTON_ON_OFF_SWITCH = new ProfileTypeUID(SYSTEM_SCOPE, "rawbutton-on-off-switch");
    ProfileTypeUID RAWBUTTON_TOGGLE_PLAYER = new ProfileTypeUID(SYSTEM_SCOPE, "rawbutton-toggle-player");
    ProfileTypeUID RAWBUTTON_TOGGLE_ROLLERSHUTTER = new ProfileTypeUID(SYSTEM_SCOPE, "rawbutton-toggle-rollershutter");
    ProfileTypeUID RAWBUTTON_TOGGLE_SWITCH = new ProfileTypeUID(SYSTEM_SCOPE, "rawbutton-toggle-switch");
    ProfileTypeUID RAWROCKER_DIMMER = new ProfileTypeUID(SYSTEM_SCOPE, "rawrocker-to-dimmer");
    ProfileTypeUID RAWROCKER_NEXT_PREVIOUS = new ProfileTypeUID(SYSTEM_SCOPE, "rawrocker-to-next-previous");
    ProfileTypeUID RAWROCKER_ON_OFF = new ProfileTypeUID(SYSTEM_SCOPE, "rawrocker-to-on-off");
    ProfileTypeUID RAWROCKER_PLAY_PAUSE = new ProfileTypeUID(SYSTEM_SCOPE, "rawrocker-to-play-pause");
    ProfileTypeUID RAWROCKER_REWIND_FASTFORWARD = new ProfileTypeUID(SYSTEM_SCOPE, "rawrocker-to-rewind-fastforward");
    ProfileTypeUID RAWROCKER_STOP_MOVE = new ProfileTypeUID(SYSTEM_SCOPE, "rawrocker-to-stop-move");
    ProfileTypeUID RAWROCKER_UP_DOWN = new ProfileTypeUID(SYSTEM_SCOPE, "rawrocker-to-up-down");
    ProfileTypeUID TIMESTAMP_CHANGE = new ProfileTypeUID(SYSTEM_SCOPE, "timestamp-change");
    ProfileTypeUID TIMESTAMP_OFFSET = new ProfileTypeUID(SYSTEM_SCOPE, "timestamp-offset");
    ProfileTypeUID TIMESTAMP_TRIGGER = new ProfileTypeUID(SYSTEM_SCOPE, "timestamp-trigger");
    ProfileTypeUID TIMESTAMP_UPDATE = new ProfileTypeUID(SYSTEM_SCOPE, "timestamp-update");

}
