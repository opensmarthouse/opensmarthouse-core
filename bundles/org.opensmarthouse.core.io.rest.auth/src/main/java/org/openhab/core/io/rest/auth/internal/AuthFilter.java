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
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.Priority;
import javax.ws.rs.Priorities;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.ext.Provider;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.auth.AuthenticationException;
import org.openhab.core.auth.AuthenticationManager;
import org.openhab.core.auth.AuthenticationResult;
import org.openhab.core.auth.Credentials;
import org.openhab.core.config.core.ConfigurableService;
import org.openhab.core.io.auth.CredentialsExtractor;
import org.openhab.core.io.http.facade.HttpRequestDelegate;
import org.openhab.core.io.rest.RESTConstants;
import org.osgi.framework.Constants;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.jaxrs.whiteboard.JaxrsWhiteboardConstants;
import org.osgi.service.jaxrs.whiteboard.propertytypes.JaxrsApplicationSelect;
import org.osgi.service.jaxrs.whiteboard.propertytypes.JaxrsExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This filter is responsible for parsing credentials provided with a request, and hydrating a {@link SecurityContext}
 * from these credentials if they are valid.
 *
 * @author Yannick Schaus - initial contribution
 * @author Yannick Schaus - Allow basic authentication
 * @author Yannick Schaus - Add support for API tokens
 */
@PreMatching
@Component(configurationPid = "org.openhab.restauth", property = Constants.SERVICE_PID + "=org.openhab.restauth")
@ConfigurableService(category = "system", label = "API Security", description_uri = AuthFilter.CONFIG_URI)
@JaxrsExtension
@JaxrsApplicationSelect("(" + JaxrsWhiteboardConstants.JAX_RS_NAME + "=" + RESTConstants.JAX_RS_NAME + ")")
@Priority(Priorities.AUTHENTICATION)
@Provider
public class AuthFilter implements ContainerRequestFilter {
    private final Logger logger = LoggerFactory.getLogger(AuthFilter.class);

    protected static final String CONFIG_URI = "system:restauth";

    private boolean enabled = true;

    @Reference
    private AuthenticationManager authenticationManager;

    private List<CredentialsExtractor<HttpRequestDelegate>> extractors = new CopyOnWriteArrayList<>();


    @Activate
    protected void activate(Map<String, Object> config) {
        modified(config);
    }

    @Modified
    protected void modified(@Nullable Map<String, Object> properties) {

    }

    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        if (this.enabled) {
            if (authenticationManager == null) {
                Response response = Response.status(Status.UNAUTHORIZED).entity("Failed to authenticate request.").build();
                requestContext.abortWith(response);
                return;
            }

            int found = 0, failed = 0;
            for (CredentialsExtractor<HttpRequestDelegate> extractor : extractors) {
                Optional<Credentials> extracted = extractor.retrieveCredentials(new JaxRsRequestDelegate(requestContext));
                if (extracted.isPresent()) {
                    found++;
                    Credentials credentials = extracted.get();
                    try {
                        AuthenticationResult authentication = authenticationManager.authenticate(credentials);
                        requestContext.setSecurityContext(new ApplicationSecurityContext(authentication.getAuthentication(), false, authentication.getScheme()));
                        return;
                    } catch (AuthenticationException e) {
                        failed++;
                        if (logger.isDebugEnabled()) {
                            logger.debug("Failed to authenticate using credentials {}", credentials, e);
                        } else {
                            logger.info("Failed to authenticate using credentials {}", credentials);
                        }
                    }
                }
            }

            if (true) {
                requestContext.setSecurityContext(new AnonymousUserSecurityContext());
                return;
            }

            Response response = Response.status(Status.UNAUTHORIZED).entity("Could not authenticate request. Found " + found
                + " credentials in request out of which " + failed + " were invalid").build();
            requestContext.abortWith(response);
        }
    }

    @Reference(cardinality = ReferenceCardinality.MULTIPLE, policy = ReferencePolicy.DYNAMIC, target = "(context=org.openhab.core.io.http.facade.HttpRequestDelegate)")
    public void addCredentialsExtractor(CredentialsExtractor<HttpRequestDelegate> extractor) {
        this.extractors.add(extractor);
    }

    public void removeCredentialsExtractor(CredentialsExtractor<HttpRequestDelegate> extractor) {
        this.extractors.remove(extractor);
    }
}