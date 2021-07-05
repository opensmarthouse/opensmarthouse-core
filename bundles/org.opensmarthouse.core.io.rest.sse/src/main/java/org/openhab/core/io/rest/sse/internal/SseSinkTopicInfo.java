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
package org.openhab.core.io.rest.sse.internal;

import java.util.List;
import java.util.function.Predicate;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.auth.Authentication;
import org.openhab.core.auth.AuthorizationManager;
import org.openhab.core.auth.Permissions;
import org.openhab.core.io.rest.sse.internal.util.SseUtil;
import org.openhab.core.items.Item;

/**
 * The specific information we need to hold for a SSE sink which subscribes to event topics.
 *
 * @author Markus Rathgeb - Initial contribution
 */
@NonNullByDefault
public class SseSinkTopicInfo {

    private final List<String> regexFilters;
    private final @Nullable Authentication authentication;

    public SseSinkTopicInfo(String topicFilter, @Nullable Authentication authentication) {
        this.regexFilters = SseUtil.convertToRegex(topicFilter);
        this.authentication = authentication;
    }

    public static Predicate<SseSinkTopicInfo> matchesTopic(final String topic) {
        return info -> info.regexFilters.stream().anyMatch(topic::matches);
    }

    public static Predicate<SseSinkTopicInfo> hasItemAccess(final AuthorizationManager manager, final String item) {
        return info -> {
            if (info.authentication == null) {
                return false;
            }
            return manager.hasPermission(Permissions.READ, item, Item.class, info.authentication);
        };
    }
}