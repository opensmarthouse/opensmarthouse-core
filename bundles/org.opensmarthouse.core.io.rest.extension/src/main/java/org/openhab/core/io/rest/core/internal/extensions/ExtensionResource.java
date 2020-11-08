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
package org.openhab.core.io.rest.core.internal.extensions;

import java.net.URI;
import java.net.URISyntaxException;
import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.stream.Stream;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.auth.Role;
import org.openhab.core.common.ThreadPoolManager;
import org.openhab.core.events.Event;
import org.openhab.core.events.EventPublisher;
import org.openhab.core.extension.Extension;
import org.openhab.core.extension.ExtensionEventFactory;
import org.openhab.core.extension.ExtensionService;
import org.openhab.core.extension.ExtensionType;
import org.openhab.core.io.rest.JSONResponse;
import org.openhab.core.io.rest.LocaleService;
import org.openhab.core.io.rest.RESTConstants;
import org.openhab.core.io.rest.RESTResource;
import org.openhab.core.io.rest.Stream2JSONInputStream;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.jaxrs.whiteboard.JaxrsWhiteboardConstants;
import org.osgi.service.jaxrs.whiteboard.propertytypes.JSONRequired;
import org.osgi.service.jaxrs.whiteboard.propertytypes.JaxrsApplicationSelect;
import org.osgi.service.jaxrs.whiteboard.propertytypes.JaxrsName;
import org.osgi.service.jaxrs.whiteboard.propertytypes.JaxrsResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * This class acts as a REST resource for add-ons and provides methods to install and uninstall them.
 *
 * @author Kai Kreuzer - Initial contribution
 * @author Franck Dechavanne - Added DTOs to ApiResponses
 * @author Markus Rathgeb - Migrated to JAX-RS Whiteboard Specification
 * @author Wouter Born - Migrated to OpenAPI annotations
 */
@Component
@JaxrsResource
@JaxrsName(ExtensionResource.PATH_ADDONS)
@JaxrsApplicationSelect("(" + JaxrsWhiteboardConstants.JAX_RS_NAME + "=" + RESTConstants.JAX_RS_NAME + ")")
@JSONRequired
@Path(ExtensionResource.PATH_ADDONS)
@RolesAllowed({ Role.ADMIN })
@SecurityRequirement(name = "oauth2", scopes = { "admin" })
@Tag(name = ExtensionResource.PATH_ADDONS)
@NonNullByDefault
public class ExtensionResource implements RESTResource {

    private static final String THREAD_POOL_NAME = "addonService";

    public static final String PATH_ADDONS = "addons";

    private final Logger logger = LoggerFactory.getLogger(ExtensionResource.class);
    private final Set<ExtensionService> extensionServices = new CopyOnWriteArraySet<>();
    private final EventPublisher eventPublisher;
    private final LocaleService localeService;

    private @Context @NonNullByDefault({}) UriInfo uriInfo;

    @Activate
    public ExtensionResource(final @Reference EventPublisher eventPublisher,
            final @Reference LocaleService localeService) {
        this.eventPublisher = eventPublisher;
        this.localeService = localeService;
    }

    @Reference(cardinality = ReferenceCardinality.MULTIPLE, policy = ReferencePolicy.DYNAMIC)
    protected void addExtensionService(ExtensionService featureService) {
        extensionServices.add(featureService);
    }

    protected void removeExtensionService(ExtensionService featureService) {
        extensionServices.remove(featureService);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Get all add-ons.", responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = String.class))) })
    public Response getExtensions(
            @HeaderParam("Accept-Language") @Parameter(description = "language") @Nullable String language) {
        logger.debug("Received HTTP GET request at '{}'", uriInfo.getPath());
        Locale locale = localeService.getLocale(language);
        return Response.ok(new Stream2JSONInputStream(getAllExtensions(locale))).build();
    }

    @GET
    @Path("/types")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Get all add-on types.", responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = String.class))) })
    public Response getTypes(
            @HeaderParam("Accept-Language") @Parameter(description = "language") @Nullable String language) {
        logger.debug("Received HTTP GET request at '{}'", uriInfo.getPath());
        Locale locale = localeService.getLocale(language);
        Stream<ExtensionType> addonTypeStream = getAllExtensionTypes(locale).stream().distinct();
        return Response.ok(new Stream2JSONInputStream(addonTypeStream)).build();
    }

    @GET
    @Path("/{addonId: [a-zA-Z_0-9-:]+}")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Get add-on with given ID.", responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = String.class))),
            @ApiResponse(responseCode = "404", description = "Not found") })
    public Response getById(
            @HeaderParam("Accept-Language") @Parameter(description = "language") @Nullable String language,
            @PathParam("addonId") @Parameter(description = "addon ID") String addonId) {
        logger.debug("Received HTTP GET request at '{}'.", uriInfo.getPath());
        Locale locale = localeService.getLocale(language);
        ExtensionService addonService = getExtensionService(addonId);
        Extension responseObject = addonService.getExtension(addonId, locale);
        if (responseObject != null) {
            return Response.ok(responseObject).build();
        }

        return Response.status(404).build();
    }

    @POST
    @Path("/{addonId: [a-zA-Z_0-9-:]+}/install")
    @Operation(summary = "Installs the add-on with the given ID.", responses = {
            @ApiResponse(responseCode = "200", description = "OK") })
    public Response installAddon(final @PathParam("addonId") @Parameter(description = "addon ID") String addonId) {
        ThreadPoolManager.getPool(THREAD_POOL_NAME).submit(() -> {
            try {
                ExtensionService addonService = getExtensionService(addonId);
                addonService.install(addonId);
            } catch (Exception e) {
                logger.error("Exception while installing add-on: {}", e.getMessage());
                postFailureEvent(addonId, e.getMessage());
            }
        });
        return Response.ok(null, MediaType.TEXT_PLAIN).build();
    }

    @POST
    @Path("/url/{url}/install")
    @Operation(summary = "Installs the add-on from the given URL.", responses = {
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "400", description = "The given URL is malformed or not valid.") })
    public Response installExtensionByURL(
            final @PathParam("url") @Parameter(description = "addon install URL") String url) {
        try {
            URI addonURI = new URI(url);
            String addonId = getAddonId(addonURI);
            installAddon(addonId);
        } catch (URISyntaxException | IllegalArgumentException e) {
            logger.error("Exception while parsing the addon URL '{}': {}", url, e.getMessage());
            return JSONResponse.createErrorResponse(Status.BAD_REQUEST, "The given URL is malformed or not valid.");
        }

        return Response.ok(null, MediaType.TEXT_PLAIN).build();
    }

    @POST
    @Path("/{addonId: [a-zA-Z_0-9-:]+}/uninstall")
    @Operation(summary = "Uninstalls the add-on with the given ID.", responses = {
            @ApiResponse(responseCode = "200", description = "OK") })
    public Response uninstallExtension(
            final @PathParam("addonId") @Parameter(description = "addon ID") String addonId) {
        ThreadPoolManager.getPool(THREAD_POOL_NAME).submit(() -> {
            try {
                ExtensionService addonService = getExtensionService(addonId);
                addonService.uninstall(addonId);
            } catch (Exception e) {
                logger.error("Exception while uninstalling add-on: {}", e.getMessage());
                postFailureEvent(addonId, e.getMessage());
            }
        });
        return Response.ok(null, MediaType.TEXT_PLAIN).build();
    }

    private void postFailureEvent(String addonId, @Nullable String msg) {
        Event event = ExtensionEventFactory.createExtensionFailureEvent(addonId, msg);
        eventPublisher.post(event);
    }

    private Stream<Extension> getAllExtensions(Locale locale) {
        return extensionServices.stream().map(s -> s.getExtensions(locale)).flatMap(l -> l.stream());
    }

    private Set<ExtensionType> getAllExtensionTypes(Locale locale) {
        final Collator coll = Collator.getInstance(locale);
        coll.setStrength(Collator.PRIMARY);
        Set<ExtensionType> ret = new TreeSet<>(new Comparator<ExtensionType>() {
            @Override
            public int compare(ExtensionType o1, ExtensionType o2) {
                return coll.compare(o1.getLabel(), o2.getLabel());
            }
        });
        for (ExtensionService addonService : extensionServices) {
            ret.addAll(addonService.getTypes(locale));
        }
        return ret;
    }

    private ExtensionService getExtensionService(final String addonId) {
        for (ExtensionService addonService : extensionServices) {
            for (Extension addon : addonService.getExtensions(Locale.getDefault())) {
                if (addonId.equals(addon.getId())) {
                    return addonService;
                }
            }
        }
        throw new IllegalArgumentException("No add-on service registered for " + addonId);
    }

    private String getAddonId(URI addonURI) {
        for (ExtensionService addonService : extensionServices) {
            String addonId = addonService.getExtensionId(addonURI);
            if (addonId != null && !addonId.isBlank()) {
                return addonId;
            }
        }

        throw new IllegalArgumentException("No add-on service registered for URI " + addonURI);
    }
}