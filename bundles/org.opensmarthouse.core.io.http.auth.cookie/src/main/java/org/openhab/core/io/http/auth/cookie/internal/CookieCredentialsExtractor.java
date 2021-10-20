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
package org.openhab.core.io.http.auth.cookie.internal;

import java.util.Optional;

import org.openhab.core.auth.Credentials;
import org.openhab.core.auth.cookie.CookieCredentials;
import org.openhab.core.io.auth.CredentialsExtractor;
import org.openhab.core.io.http.facade.Cookie;
import org.openhab.core.io.http.facade.HttpRequestDelegate;
import org.osgi.service.component.annotations.Component;

/**
 * Extract session information from cookie inincoming request.
 *
 * @author Łukasz Dywicki - Initial contribution.
 */
@Component(property = { "context=org.openhab.core.io.http.facade.HttpRequestDelegate" })
public class CookieCredentialsExtractor implements CredentialsExtractor<HttpRequestDelegate> {

    public static final String SESSIONID_COOKIE_NAME = "X-OPENHAB-SESSIONID";

    @Override
    public Optional<Credentials> retrieveCredentials(HttpRequestDelegate request) {
        return request.getCookie(SESSIONID_COOKIE_NAME).map(this::process);
    }

    private CookieCredentials process(Cookie cookie) {
        return new CookieCredentials(cookie.getName(), cookie.getValue());
    }
}
