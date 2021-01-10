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
package org.openhab.core;

import org.opensmarthouse.core.OpenSmartHouse;

/**
 * Provided for compatibility with OpenHAB bindings
 *
 * @author Chris Jackson - Initial contribution
 */
public class OpenHAB {
    /** The program argument name for setting the user data directory path */
    public static final String USERDATA_DIR_PROG_ARGUMENT = OpenSmartHouse.USERDATA_DIR_PROG_ARGUMENT;

    /** The program argument name for setting the main config directory path */
    public static final String CONFIG_DIR_PROG_ARGUMENT = OpenSmartHouse.CONFIG_DIR_PROG_ARGUMENT;

    /** The default main configuration directory name */
    public static final String DEFAULT_CONFIG_FOLDER = OpenSmartHouse.DEFAULT_CONFIG_FOLDER;

    /** The default user data directory name */
    public static final String DEFAULT_USERDATA_FOLDER = OpenSmartHouse.DEFAULT_USERDATA_FOLDER;

    /** The service pid used for the definition of the base package and addons */
    public static final String ADDONS_SERVICE_PID = OpenSmartHouse.ADDONS_SERVICE_PID;

    /** The property to recognize a service instance created by a service factory */
    public static final String SERVICE_CONTEXT = OpenSmartHouse.SERVICE_CONTEXT;

    /** The property to separate service PIDs from their contexts */
    public static final String SERVICE_CONTEXT_MARKER = OpenSmartHouse.SERVICE_CONTEXT_MARKER;

    /** The configuration parameter name used for the base package */
    public static final String CFG_PACKAGE = OpenSmartHouse.CFG_PACKAGE;

    /**
     * Returns the current OpenSmartHouse version, retrieving the information from the core bundle version.
     *
     * @return the OpenSmartHouse runtime version
     */
    public static String getVersion() {
        return OpenSmartHouse.getVersion();
    }

    /**
     * Provides the build number as it can be found in the version.properties file.
     *
     * @return The build string or "Unknown Build No." if none can be identified.
     */
    public static String buildString() {
        return OpenSmartHouse.buildString();
    }

    /**
     * Returns the configuration folder path name. The main config folder <code>&lt;openhab-home&gt;/conf</code> can be
     * overwritten by setting the System property <code>openhab.conf</code>.
     *
     * @return the configuration folder path name
     */
    public static String getConfigFolder() {
        return OpenSmartHouse.getConfigFolder();
    }

    /**
     * Returns the user data folder path name. The main user data folder <code>&lt;openhab-home&gt;/userdata</code> can
     * be overwritten by setting the System property <code>openhab.userdata</code>.
     *
     * @return the user data folder path name
     */
    public static String getUserDataFolder() {
        return OpenSmartHouse.getUserDataFolder();
    }
}
