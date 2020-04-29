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
package org.openhab.core.internal.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.MockitoJUnitRunner;
import org.openhab.core.library.items.NumberItem;
import org.openhab.core.test.mockito.MapArgument;
import org.openhab.core.test.mockito.MapBuilderToMock;
import org.openhab.core.types.StateDescription;
import org.openhab.core.types.StateDescriptionFragment;
import org.openhab.core.types.StateDescriptionFragmentBuilder;
import org.openhab.core.types.StateDescriptionFragmentBuilderFactory;
import org.openhab.core.types.StateDescriptionFragmentProvider;
import org.openhab.core.types.StateDescriptionProvider;
import org.openhab.core.types.StateOption;

/**
 * Tests for the StateDescriptionService implementation
 *
 * @author Lyubomir Papazov - Initial contribution
 */
@RunWith(MockitoJUnitRunner.class)
@SuppressWarnings({ "deprecation", "null" })
public class StateDescriptionServiceImplTest {

    private static final String ITEM_NAME = "Item1";
    private static final int STATE_DESCRIPTION_PROVIDER_DEFAULT_SERVICE_RANKING = 0;
    private static final BigDecimal STATE_DESCRIPTION_PROVIDER_DEFAULT_MIN_VALUE = new BigDecimal("0");
    private static final BigDecimal STATE_DESCRIPTION_PROVIDER_DEFAULT_MAX_VALUE = new BigDecimal("0");
    private static final BigDecimal STATE_DESCRIPTION_PROVIDER_DEFAULT_STEP = new BigDecimal("0");
    private static final String STATE_DESCRIPTION_PROVIDER_DEFAULT_PATTERN = "pattern1";
    private static final boolean STATE_DESCRIPTION_PROVIDER_DEFAULT_IS_READONLY = false;
    private static final List<StateOption> STATE_DESCRIPTION_PROVIDER_DEFAULT_OPTIONS = Collections.emptyList();

    @Mock
    private StateDescriptionFragmentBuilderFactory stateDescriptionFragmentBuilderFactory;
    @Mock
    private StateDescriptionFragmentBuilder stateDescriptionFragmentBuilder;
    @Mock
    private StateDescriptionFragment stateDescriptionFragment;
    @Mock
    private StateDescriptionFragment legacyStateDescriptionFragment;
    @Mock
    private StateDescriptionFragmentBuilder legacyStateDescriptionFragmentBuilder;
    @Mock
    private StateDescriptionServiceImpl stateDescriptionService;

    private NumberItem item;;

    @Before
    public void setup() {
        stateDescriptionService = new StateDescriptionServiceImpl(stateDescriptionFragmentBuilderFactory);

        item = new NumberItem(ITEM_NAME);
        item.setStateDescriptionService(stateDescriptionService);
    }

    @Test
    @Ignore("This test does not differ from legacyTestMinValueMaxValueStepAndPatternTwoDescriptionProviders")
    public void legacyTestServiceWithOneStateDescriptionProvider() {
        StateDescriptionProvider stateDescriptionProviderDefault = mock(StateDescriptionProvider.class);
        when(stateDescriptionProviderDefault.getRank()).thenReturn(STATE_DESCRIPTION_PROVIDER_DEFAULT_SERVICE_RANKING);
        StateDescription stateDescription = new StateDescription(STATE_DESCRIPTION_PROVIDER_DEFAULT_MIN_VALUE,
                STATE_DESCRIPTION_PROVIDER_DEFAULT_MAX_VALUE, STATE_DESCRIPTION_PROVIDER_DEFAULT_STEP,
                STATE_DESCRIPTION_PROVIDER_DEFAULT_PATTERN, STATE_DESCRIPTION_PROVIDER_DEFAULT_IS_READONLY,
                STATE_DESCRIPTION_PROVIDER_DEFAULT_OPTIONS);
        when(stateDescriptionProviderDefault.getStateDescription(ITEM_NAME, null)).thenReturn(stateDescription);
        stateDescriptionService.addStateDescriptionProvider(stateDescriptionProviderDefault);

        StateDescription finalStateDescription = item.getStateDescription();

        assertThat(finalStateDescription.getMinimum(), is(STATE_DESCRIPTION_PROVIDER_DEFAULT_MIN_VALUE));
        assertThat(finalStateDescription.getMaximum(), is(STATE_DESCRIPTION_PROVIDER_DEFAULT_MAX_VALUE));
        assertThat(finalStateDescription.getStep(), is(STATE_DESCRIPTION_PROVIDER_DEFAULT_STEP));
        assertThat(finalStateDescription.getPattern(), is(STATE_DESCRIPTION_PROVIDER_DEFAULT_PATTERN));
        assertThat(finalStateDescription.isReadOnly(), is(STATE_DESCRIPTION_PROVIDER_DEFAULT_IS_READONLY));
        assertThat(finalStateDescription.getOptions(), is(STATE_DESCRIPTION_PROVIDER_DEFAULT_OPTIONS));
    }

    @Test
    public void legacyTestMinValueMaxValueStepAndPatternTwoDescriptionProviders() {
        StateDescription stateDescription1 = new StateDescription(new BigDecimal("-1"), new BigDecimal("-1"),
                new BigDecimal("-1"), "pattern1", false, null);
        StateDescription stateDescription2 = new StateDescription(new BigDecimal("-2"), new BigDecimal("-2"),
                new BigDecimal("-2"), "pattern2", false, null);

        registerStateDescriptionProvider(stateDescription1, -1);
        registerStateDescriptionProvider(stateDescription2, -2);

        when(stateDescriptionFragmentBuilderFactory.create()).thenReturn(stateDescriptionFragmentBuilder);
        when(stateDescriptionFragmentBuilder.build()).thenReturn(stateDescriptionFragment);

        when(stateDescriptionFragmentBuilderFactory.create(stateDescription1)).thenReturn(legacyStateDescriptionFragmentBuilder);
        when(legacyStateDescriptionFragmentBuilder.build()).thenReturn(legacyStateDescriptionFragment);
        when(legacyStateDescriptionFragment.merge(stateDescriptionFragment)).thenReturn(legacyStateDescriptionFragment);
        when(legacyStateDescriptionFragment.toStateDescription()).thenReturn(mock(StateDescription.class));

        item.getStateDescription();

        verify(stateDescriptionFragmentBuilderFactory).create(stateDescription1);
        verify(stateDescriptionFragmentBuilderFactory).create();
        verify(legacyStateDescriptionFragmentBuilder).build();
        verify(legacyStateDescriptionFragment).merge(stateDescriptionFragment);
        verify(legacyStateDescriptionFragment).toStateDescription();
        verifyNoMoreInteractions(stateDescriptionFragment, stateDescriptionFragmentBuilderFactory,
                legacyStateDescriptionFragment, legacyStateDescriptionFragmentBuilder,
                stateDescriptionFragmentBuilderFactory);
    }

    @Test
    @Ignore("This test does not differ from legacyTestMinValueMaxValueStepAndPatternTwoDescriptionProviders")
    public void legacyTestIsReadOnlyWhenTwoDescriptionProvidersHigherRankingIsNotReadOnly() {
        StateDescription stateDescription1 = new StateDescription(null, null, null, null, false, null);
        StateDescription stateDescription2 = new StateDescription(null, null, null, null, true, null);

        registerStateDescriptionProvider(stateDescription1, -1);
        registerStateDescriptionProvider(stateDescription2, -2);
        StateDescription finalStateDescription = item.getStateDescription();

        assertThat(finalStateDescription.isReadOnly(), is(stateDescription1.isReadOnly()));
    }

    @Test
    @Ignore("This test does not differ from legacyTestMinValueMaxValueStepAndPatternTwoDescriptionProviders")
    public void legacyTestIsReadOnlyWhenTwoDescriptionProvidersHigherRankingIsReadOnly() {
        StateDescription stateDescription1 = new StateDescription(null, null, null, null, true, null);
        StateDescription stateDescription2 = new StateDescription(null, null, null, null, false, null);

        registerStateDescriptionProvider(stateDescription1, -1);
        registerStateDescriptionProvider(stateDescription2, -2);

        StateDescription finalStateDescription = item.getStateDescription();

        assertThat(finalStateDescription.isReadOnly(), is(stateDescription1.isReadOnly()));
    }

    @Test
    @Ignore("This test does not differ from legacyTestMinValueMaxValueStepAndPatternTwoDescriptionProviders")
    public void legacyTestOptionsWhenTwoDescriptionProvidersHigherRankingProvidesOptions() {
        StateDescription stateDescription1 = new StateDescription(null, null, null, null, false,
                Arrays.asList(new StateOption("value", "label")));
        StateDescription stateDescription2 = new StateDescription(null, null, null, null, false,
                Collections.emptyList());

        registerStateDescriptionProvider(stateDescription1, -1);
        registerStateDescriptionProvider(stateDescription2, -2);
        StateDescription finalStateDescription = item.getStateDescription();

        assertThat(finalStateDescription.getOptions(), is(stateDescription1.getOptions()));
    }

    @Test
    @Ignore("This test does not differ from legacyTestMinValueMaxValueStepAndPatternTwoDescriptionProviders")
    public void legacyTestOptionsWhenTwoDescriptionProvidersHigherRankingDoesntProvideOptions() {
        StateDescription stateDescription1 = new StateDescription(null, null, null, null, false,
                Collections.emptyList());
        StateDescription stateDescription2 = new StateDescription(null, null, null, null, false,
                Arrays.asList(new StateOption("value", "label")));

        registerStateDescriptionProvider(stateDescription1, -1);
        registerStateDescriptionProvider(stateDescription2, -2);
        StateDescription finalStateDescription = item.getStateDescription();

        assertThat(finalStateDescription.getOptions(), is(stateDescription2.getOptions()));
    }

    @Test
    @Ignore("This test does not differ from legacyTestMinValueMaxValueStepAndPatternTwoDescriptionProviders")
    public void testLegacyProviderMergedBeforeFragmentProvider() {
        StateDescription stateDescription = new StateDescription(null, null, null, "pattern", false, null);
        registerStateDescriptionProvider(stateDescription, 1);

        List<StateOption> options = Collections.singletonList(new StateOption("value", "label"));
        StateDescriptionFragment stateDescriptionFragment = mock(StateDescriptionFragment.class);
        when(stateDescriptionFragment.getMinimum()).thenReturn(BigDecimal.ZERO);
        when(stateDescriptionFragment.getMaximum()).thenReturn(BigDecimal.TEN);
        when(stateDescriptionFragment.getOptions()).thenReturn(options);
        registerStateDescriptionFragmentProvider(stateDescriptionFragment, 1);

        StateDescription finalStateDescription = item.getStateDescription();

        assertThat(finalStateDescription.getMinimum(), is(BigDecimal.ZERO));
        assertThat(finalStateDescription.getMaximum(), is(BigDecimal.TEN));
        assertThat(finalStateDescription.getPattern(), is("pattern"));
        assertThat(finalStateDescription.isReadOnly(), is(false));
        assertThat(finalStateDescription.getOptions(), is(options));
    }

    @Test
    public void testFragmentProviderOrder() {
        List<StateOption> options = Arrays.asList(new StateOption("value", "label"));

        StateDescriptionFragment firstFragment = mock(StateDescriptionFragment.class);
        registerStateDescriptionFragmentProvider(firstFragment, -1);

        StateDescriptionFragment secondFragment = mock(StateDescriptionFragment.class);
        registerStateDescriptionFragmentProvider(secondFragment, -2);

        when(stateDescriptionFragmentBuilderFactory.create()).thenReturn(stateDescriptionFragmentBuilder);
        when(stateDescriptionFragmentBuilder.build()).thenReturn(stateDescriptionFragment);

        item.getStateDescription();

        verify(stateDescriptionFragment).merge(firstFragment);
        verify(stateDescriptionFragment).merge(secondFragment);
        verify(stateDescriptionFragment).toStateDescription();
        verifyNoMoreInteractions(stateDescriptionFragment);
    }

    private void registerStateDescriptionProvider(StateDescription stateDescription, int serviceRanking) {
        StateDescriptionProvider stateDescriptionProvider = mock(StateDescriptionProvider.class);

        when(stateDescriptionProvider.getRank()).thenReturn(serviceRanking);
        when(stateDescriptionProvider.getStateDescription(ITEM_NAME, null)).thenReturn(stateDescription);
        stateDescriptionService.addStateDescriptionProvider(stateDescriptionProvider);
    }

    private void registerStateDescriptionFragmentProvider(StateDescriptionFragment stateDescription,
            int serviceRanking) {
        StateDescriptionFragmentProvider stateDescriptionProvider = mock(StateDescriptionFragmentProvider.class);

        when(stateDescriptionProvider.getRank()).thenReturn(serviceRanking);
        when(stateDescriptionProvider.getStateDescriptionFragment(ITEM_NAME, null)).thenReturn(stateDescription);
        stateDescriptionService.addStateDescriptionFragmentProvider(stateDescriptionProvider);
    }

}
