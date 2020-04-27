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
package org.openhab.core.internal.items;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import javax.measure.quantity.Length;
import javax.measure.quantity.Temperature;

import org.junit.Before;
import org.junit.Test;
import org.openhab.core.i18n.UnitProvider;
import org.openhab.core.items.Item;
import org.openhab.core.library.items.NumberItem;
import org.openhab.core.library.types.DecimalType;
import org.openhab.core.library.types.PercentType;
import org.openhab.core.library.types.QuantityType;
import org.openhab.core.library.unit.ImperialUnits;
import org.openhab.core.types.State;
import org.openhab.core.types.StateDescription;
import org.openhab.core.types.UnDefType;

/**
 * Test the {@link ItemStateConverterImpl}.
 *
 * @author Henning Treu - Initial contribution
 */
public class ItemStateConverterImplTest {

    private ItemStateConverterImpl itemStateConverter;

    @Before
    public void setup() {
        UnitProvider unitProvider = Mockito.mock(UnitProvider.class);
        Mockito.when(unitProvider.getUnit(Temperature.class)).thenReturn(ImperialUnits.FAHRENHEIT);
        itemStateConverter = new ItemStateConverterImpl(unitProvider);
    }

    @Test
    public void testNullState() {
        State undef = itemStateConverter.convertToAcceptedState(null, null);

        Assert.assertThat(undef, CoreMatchers.is(UnDefType.NULL));
    }

    @Test
    public void testNoConversion() {
        Item item = new NumberItem("number");
        State originalState = new DecimalType(12.34);
        State state = itemStateConverter.convertToAcceptedState(originalState, item);

        Assert.assertTrue(originalState == state);
    }

    @Test
    public void testStateConversion() {
        Item item = new NumberItem("number");
        State originalState = new PercentType("42");
        State convertedState = itemStateConverter.convertToAcceptedState(originalState, item);

        Assert.assertThat(convertedState, CoreMatchers.is(new DecimalType("0.42")));
    }

    @Test
    public void numberItemWithoutDimensionShouldConvertToDecimalType() {
        Item item = new NumberItem("number");
        State originalState = new QuantityType<>("12.34 °C");
        State convertedState = itemStateConverter.convertToAcceptedState(originalState, item);

        Assert.assertThat(convertedState, CoreMatchers.is(new DecimalType("12.34")));
    }

    @Test
    public void numberItemWitDimensionShouldConvertToItemStateDescriptionUnit() {
        NumberItem item = Mockito.mock(NumberItem.class);
        StateDescription stateDescription = Mockito.mock(StateDescription.class);
        Mockito.when(item.getStateDescription()).thenReturn(stateDescription);
        Mockito.doReturn(Temperature.class).when(item).getDimension();
        Mockito.when(stateDescription.getPattern()).thenReturn("%.1f K");

        State originalState = new QuantityType<>("12.34 °C");
        State convertedState = itemStateConverter.convertToAcceptedState(originalState, item);

        Assert.assertThat(convertedState, CoreMatchers.is(new QuantityType<>("285.49 K")));
    }

    @Test
    public void numberItemWitDimensionShouldConvertToLocaleBasedUnit() {
        NumberItem item = Mockito.mock(NumberItem.class);
        Mockito.doReturn(Temperature.class).when(item).getDimension();

        State originalState = new QuantityType<>("12.34 °C");
        State convertedState = itemStateConverter.convertToAcceptedState(originalState, item);

        Assert.assertThat(convertedState, CoreMatchers.is(new QuantityType<>("54.212 °F")));
    }

    @Test
    public void numberItemShouldNotConvertUnitsWhereMeasurmentSystemEquals() {
        NumberItem item = Mockito.mock(NumberItem.class);
        Mockito.doReturn(Length.class).when(item).getDimension();

        QuantityType<Length> originalState = new QuantityType<>("100 cm");

        @SuppressWarnings("unchecked")
        QuantityType<Length> convertedState = (QuantityType<Length>) itemStateConverter
                .convertToAcceptedState(originalState, item);

        Assert.assertThat(convertedState.getUnit(), CoreMatchers.is(originalState.getUnit()));
    }

}
