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
package org.openhab.core.io.http.auth.basic.internal;

import java.util.Base64;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.openhab.core.auth.Credentials;
import org.openhab.core.auth.UsernamePasswordCredentials;
import org.openhab.core.io.auth.CredentialsExtractor;
import org.openhab.core.io.http.facade.HttpRequestDelegate;
import org.osgi.service.component.annotations.Component;

/**
 * Extract user name and password from incoming request.
 *
 * @author Łukasz Dywicki - Initial contribution, migration to Http request facade.
 */
@Component(property = { "context=org.openhab.core.io.http.facade.HttpRequestDelegate" })
public class BasicCredentialsExtractor implements CredentialsExtractor<HttpRequestDelegate> {

    @Override
    public Optional<Credentials> retrieveCredentials(HttpRequestDelegate request) {
        return request.getAuthorizationHeader()
            .filter(header -> header.contains(" "))
            .flatMap(this::process);
    }

    private Optional<UsernamePasswordCredentials> process(String authenticationHeader) {
        String[] tokens = authenticationHeader.split(" ");
        if (tokens.length == 2) {
            String authType = tokens[0];
            if (HttpServletRequest.BASIC_AUTH.equalsIgnoreCase(authType)) {
                String usernameAndPassword = new String(Base64.getDecoder().decode(tokens[1]));

                tokens = usernameAndPassword.split(":");
                if (tokens.length == 2) {
                    String username = tokens[0];
                    String password = tokens[1];

                    return Optional.of(new UsernamePasswordCredentials(username, password));
                }
            }
        }

        return Optional.empty();
    }
}
