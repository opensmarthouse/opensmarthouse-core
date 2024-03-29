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
package org.openhab.core.io.rest.core.internal.item;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.IsCollectionContaining.hasItem;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.openhab.core.config.core.ConfigDescriptionRegistry;
import org.openhab.core.items.Metadata;
import org.openhab.core.items.MetadataKey;
import org.openhab.core.items.MetadataRegistry;

/**
 * Test the {@link MetadataSelectorMatcher}.
 *
 * @author Henning Treu - Initial contribution
 */
public class MetadataSelectorMatcherTest {

    private MetadataSelectorMatcher matcher;

    @Mock
    private ConfigDescriptionRegistry configDescriptionRegistry;

    @Mock
    private MetadataRegistry metadataRegistry;

    @Before
    public void setup() throws Exception {
        initMocks(this);

        when(metadataRegistry.getAll())
                .thenReturn(List.of(new Metadata(new MetadataKey("magic", "test_item"), "test", Map.of()),
                        new Metadata(new MetadataKey("magic2", "test_item"), "test", Map.of()),
                        new Metadata(new MetadataKey("homekit", "test_item"), "test", Map.of()),
                        new Metadata(new MetadataKey("alexa", "test_item"), "test", Map.of())));
        when(metadataRegistry.isInternalNamespace(anyString())).thenReturn(false);

        matcher = new MetadataSelectorMatcher(metadataRegistry);
    }

    @Test
    public void nullSelectorShouldReturnEmptySet() {
        assertThat(matcher.filterNamespaces(null, null), is(Collections.emptySet()));
    }

    @Test
    public void emptySelectorShouldReturnEmptySet() {
        assertThat(matcher.filterNamespaces("", null), is(Collections.emptySet()));
    }

    @Test
    public void specificSelectorShouldReturnSpecificNamespace() {
        assertThat(matcher.filterNamespaces("alexa", null), hasSize(1));
        assertThat(matcher.filterNamespaces("alexa", null), hasItem("alexa"));
        assertThat(matcher.filterNamespaces("magic", null), hasSize(1));
        assertThat(matcher.filterNamespaces("magic", null), hasItem("magic"));
        assertThat(matcher.filterNamespaces("magic2", null), hasSize(1));
        assertThat(matcher.filterNamespaces("magic2", null), hasItem("magic2"));

        assertThat(matcher.filterNamespaces("unknown", null), hasSize(1));
    }

    @Test
    public void regularExpressionShouldMatchSubset() {
        assertThat(matcher.filterNamespaces(".*", null), hasSize(4));
        assertThat(matcher.filterNamespaces("magic.?", null), hasSize(2));
    }

    @Test
    public void nonConfigDescriptionSelectorShouldBeResult() {
        assertThat(matcher.filterNamespaces("magic, foo, bar", null), hasItems("magic", "foo", "bar"));
    }
}
