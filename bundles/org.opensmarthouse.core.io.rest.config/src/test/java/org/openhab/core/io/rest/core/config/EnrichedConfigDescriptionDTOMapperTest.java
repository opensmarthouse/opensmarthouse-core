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
package org.openhab.core.io.rest.core.config;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.openhab.core.config.core.ConfigDescription;
import org.openhab.core.config.core.ConfigDescriptionBuilder;
import org.openhab.core.config.core.ConfigDescriptionParameter;
import org.openhab.core.config.core.ConfigDescriptionParameter.Type;
import org.openhab.core.config.core.ConfigDescriptionParameterBuilder;
import org.openhab.core.config.core.ParameterDeviceProperty;
import org.openhab.core.config.core.dto.ConfigDescriptionDTO;
import org.openhab.core.config.core.dto.ConfigDescriptionParameterDTO;

/**
 * @author Christoph Weitkamp - Initial contribution
 * @author Chris Jackson - Added Device configuration
 */
public class EnrichedConfigDescriptionDTOMapperTest {

    private static final URI CONFIG_URI = URI.create("system:ephemeris");
    private static final String CONFIG_PARAMETER_NAME = "test";
    private static final String CONFIG_PARAMETER_DEFAULT_VALUE = "first value,second value,third value";

    @Test
    public void testDeviceProperties() {
        List<ParameterDeviceProperty> deviceProperties = new ArrayList<>();
        deviceProperties.add(new ParameterDeviceProperty("name1", "value1"));
        deviceProperties.add(new ParameterDeviceProperty("name2", "value2"));

        ConfigDescriptionParameter configDescriptionParameter = ConfigDescriptionParameterBuilder
                .create(CONFIG_PARAMETER_NAME, Type.TEXT).withMultiple(true).withDeviceProperties(deviceProperties)
                .build();
        ConfigDescription configDescription = ConfigDescriptionBuilder.create(CONFIG_URI)
                .withParameter(configDescriptionParameter).build();

        ConfigDescriptionDTO cddto = EnrichedConfigDescriptionDTOMapper.map(configDescription);
        assertThat(cddto.parameters, hasSize(1));

        ConfigDescriptionParameterDTO cdpdto = cddto.parameters.get(0);
        assertThat(cdpdto, instanceOf(EnrichedConfigDescriptionParameterDTO.class));
        assertThat(cdpdto.defaultValue, is(nullValue()));
        EnrichedConfigDescriptionParameterDTO ecdpdto = (EnrichedConfigDescriptionParameterDTO) cdpdto;
        assertThat(ecdpdto.defaultValues, is(nullValue()));

        assertEquals(2, ecdpdto.deviceProperties.size());
    }

    @Test
    public void testThatDefaultValuesAreEmptyIfMultipleIsTrue() {
        ConfigDescriptionParameter configDescriptionParameter = ConfigDescriptionParameterBuilder
                .create(CONFIG_PARAMETER_NAME, Type.TEXT).withMultiple(true).build();
        ConfigDescription configDescription = ConfigDescriptionBuilder.create(CONFIG_URI)
                .withParameter(configDescriptionParameter).build();

        ConfigDescriptionDTO cddto = EnrichedConfigDescriptionDTOMapper.map(configDescription);
        assertThat(cddto.parameters, hasSize(1));

        ConfigDescriptionParameterDTO cdpdto = cddto.parameters.get(0);
        assertThat(cdpdto, instanceOf(EnrichedConfigDescriptionParameterDTO.class));
        assertThat(cdpdto.defaultValue, is(nullValue()));
        EnrichedConfigDescriptionParameterDTO ecdpdto = (EnrichedConfigDescriptionParameterDTO) cdpdto;
        assertThat(ecdpdto.defaultValues, is(nullValue()));
    }

    @Test
    public void testThatDefaultValueIsNotAList() {
        ConfigDescriptionParameter configDescriptionParameter = ConfigDescriptionParameterBuilder
                .create(CONFIG_PARAMETER_NAME, Type.TEXT).withDefault(CONFIG_PARAMETER_DEFAULT_VALUE).build();
        ConfigDescription configDescription = ConfigDescriptionBuilder.create(CONFIG_URI)
                .withParameter(configDescriptionParameter).build();

        ConfigDescriptionDTO cddto = EnrichedConfigDescriptionDTOMapper.map(configDescription);
        assertThat(cddto.parameters, hasSize(1));

        ConfigDescriptionParameterDTO cdpdto = cddto.parameters.get(0);
        assertThat(cdpdto, instanceOf(EnrichedConfigDescriptionParameterDTO.class));
        assertThat(cdpdto.defaultValue, is(CONFIG_PARAMETER_DEFAULT_VALUE));
        EnrichedConfigDescriptionParameterDTO ecdpdto = (EnrichedConfigDescriptionParameterDTO) cdpdto;
        assertThat(ecdpdto.defaultValues, is(nullValue()));
    }

    @Test
    public void testThatDefaultValuesAreAList() {
        ConfigDescriptionParameter configDescriptionParameter = ConfigDescriptionParameterBuilder
                .create(CONFIG_PARAMETER_NAME, Type.TEXT).withDefault(CONFIG_PARAMETER_DEFAULT_VALUE).withMultiple(true)
                .build();
        ConfigDescription configDescription = ConfigDescriptionBuilder.create(CONFIG_URI)
                .withParameter(configDescriptionParameter).build();

        ConfigDescriptionDTO cddto = EnrichedConfigDescriptionDTOMapper.map(configDescription);
        assertThat(cddto.parameters, hasSize(1));

        ConfigDescriptionParameterDTO cdpdto = cddto.parameters.get(0);
        assertThat(cdpdto, instanceOf(EnrichedConfigDescriptionParameterDTO.class));
        assertThat(cdpdto.defaultValue, is(CONFIG_PARAMETER_DEFAULT_VALUE));
        EnrichedConfigDescriptionParameterDTO ecdpdto = (EnrichedConfigDescriptionParameterDTO) cdpdto;
        assertThat(ecdpdto.defaultValues, is(notNullValue()));
        assertThat(ecdpdto.defaultValues, hasSize(3));
        assertThat(ecdpdto.defaultValues, is(equalTo(List.of("first value", "second value", "third value"))));
    }
}
