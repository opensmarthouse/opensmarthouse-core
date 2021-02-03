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
package org.openhab.core.io.rest.auth.internal;

import java.io.IOException;
import java.lang.reflect.Method;
import javax.annotation.Priority;
import javax.ws.rs.Priorities;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.ext.Provider;
import org.openhab.core.auth.MutableAuthenticationContextHolder;
import org.openhab.core.io.rest.RESTConstants;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.jaxrs.whiteboard.JaxrsWhiteboardConstants;
import org.osgi.service.jaxrs.whiteboard.propertytypes.JaxrsApplicationSelect;
import org.osgi.service.jaxrs.whiteboard.propertytypes.JaxrsExtension;

/**
 * A propagation of security context through {@link org.openhab.core.auth.AuthenticationContextHolder}.
 *
 * @author Łukasz Dywicki - Initial contribution.
 */
@Component
@JaxrsExtension
@JaxrsApplicationSelect("(" + JaxrsWhiteboardConstants.JAX_RS_NAME + "=" + RESTConstants.JAX_RS_NAME + ")")
@Priority(Priorities.AUTHORIZATION)
@Provider
public class AuthzFilter implements ContainerRequestFilter, ContainerResponseFilter {

    private final MutableAuthenticationContextHolder authenticationContextHolder;

    @Activate
    public AuthzFilter(@Reference MutableAuthenticationContextHolder authenticationContextHolder) {
        this.authenticationContextHolder = authenticationContextHolder;
    }

    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        SecurityContext securityContext = requestContext.getSecurityContext();
        if (securityContext instanceof ApplicationSecurityContext) {
            authenticationContextHolder.setAuthentication(((ApplicationSecurityContext) securityContext).getAuthentication());
        }
    }

    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {
        authenticationContextHolder.setAuthentication(null);
    }

}