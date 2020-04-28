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
package org.openhab.core.internal.types;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.types.StateDescription;
import org.openhab.core.types.StateDescriptionFragment;
import org.openhab.core.types.StateDescriptionFragmentBuilder;
import org.openhab.core.types.StateOption;

/**
 * Builds a {@link StateDescriptionFragment} with the relevant parts only.
 *
 * @author Henning Treu - Initial contribution
 * @author Łukasz Dywicki - Refactoring to itnerface.
 */
@NonNullByDefault
public class CoreStateDescriptionFragmentBuilder implements StateDescriptionFragmentBuilder {

    private @Nullable BigDecimal minimum;
    private @Nullable BigDecimal maximum;
    private @Nullable BigDecimal step;
    private @Nullable String pattern;
    private @Nullable Boolean readOnly;
    private @Nullable List<StateOption> options;

    private CoreStateDescriptionFragmentBuilder() {
        //
    }

    private CoreStateDescriptionFragmentBuilder(StateDescription legacy) {
        this.minimum = legacy.getMinimum();
        this.maximum = legacy.getMaximum();
        this.step = legacy.getStep();
        this.pattern = legacy.getPattern();
        this.readOnly = Boolean.valueOf(legacy.isReadOnly());
        if (!legacy.getOptions().isEmpty()) {
            this.options = new ArrayList<>(legacy.getOptions());
        }
    }

    @Override@SuppressWarnings("deprecation")
    public StateDescriptionFragment build() {
        return new StateDescriptionFragmentImpl(minimum, maximum, step, pattern, readOnly, options);
    }

    public static StateDescriptionFragmentBuilder create() {
        return new CoreStateDescriptionFragmentBuilder();
    }

    public static StateDescriptionFragmentBuilder create(StateDescription legacy) {
        return new CoreStateDescriptionFragmentBuilder(legacy);
    }

    @Override
    public StateDescriptionFragmentBuilder withMaximum(BigDecimal maximum) {
        this.maximum = maximum;
        return this;
    }

    @Override
    public StateDescriptionFragmentBuilder withMinimum(BigDecimal minimum) {
        this.minimum = minimum;
        return this;
    }

    @Override
    public StateDescriptionFragmentBuilder withStep(BigDecimal step) {
        this.step = step;
        return this;
    }

    @Override
    public StateDescriptionFragmentBuilder withPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

    @Override
    public StateDescriptionFragmentBuilder withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    @Override
    @SuppressWarnings("null")
    public StateDescriptionFragmentBuilder withOption(StateOption option) {
        if (options == null) {
            options = new ArrayList<>();
        }
        options.add(option);
        return this;
    }

    @Override
    public StateDescriptionFragmentBuilder withOptions(List<StateOption> options) {
        this.options = options;
        return this;
    }
}
