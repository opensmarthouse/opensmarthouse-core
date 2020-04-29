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
package org.openhab.core.types;

import java.math.BigDecimal;
import java.util.List;
import org.eclipse.jdt.annotation.NonNullByDefault;

/**
 * Builds a {@link StateDescriptionFragment} with the relevant parts only.
 *
 * @author Henning Treu - Initial contribution
 */
@NonNullByDefault
public interface StateDescriptionFragmentBuilder {
    /**
     * Build a {@link StateDescriptionFragment} from the values of this builder.
     *
     * @return a {@link StateDescriptionFragment} from the values of this builder.
     */
    StateDescriptionFragment build();

    /**
     * Set the maximum for the resulting {@link StateDescriptionFragment}.
     *
     * @param maximum the maximum for the resulting {@link StateDescriptionFragment}.
     * @return this builder.
     */
    StateDescriptionFragmentBuilder withMaximum(BigDecimal maximum);

    /**
     * Set the minimum for the resulting {@link StateDescriptionFragment}.
     *
     * @param minimum the minimum for the resulting {@link StateDescriptionFragment}.
     * @return this builder.
     */
    StateDescriptionFragmentBuilder withMinimum(BigDecimal minimum);

    /**
     * Set the step for the resulting {@link StateDescriptionFragment}.
     *
     * @param step the step for the resulting {@link StateDescriptionFragment}.
     * @return this builder.
     */
    StateDescriptionFragmentBuilder withStep(BigDecimal step);

    /**
     * Set the pattern for the resulting {@link StateDescriptionFragment}.
     *
     * @param pattern the pattern for the resulting {@link StateDescriptionFragment}.
     * @return this builder.
     */
    StateDescriptionFragmentBuilder withPattern(String pattern);

    /**
     * Set readOnly for the resulting {@link StateDescriptionFragment}.
     *
     * @param readOnly readOnly for the resulting {@link StateDescriptionFragment}.
     * @return this builder.
     */
    StateDescriptionFragmentBuilder withReadOnly(Boolean readOnly);

    /**
     * Ass a {@link StateOption} for the resulting {@link StateDescriptionFragment}.
     *
     * @param option a {@link StateOption} for the resulting {@link StateDescriptionFragment}.
     * @return this builder.
     */
    StateDescriptionFragmentBuilder withOption(StateOption option);

    /**
     * Set the {@link StateOption}s for the resulting {@link StateDescriptionFragment}.
     *
     * @param options the {@link StateOption}s for the resulting {@link StateDescriptionFragment}.
     * @return this builder.
     */
    StateDescriptionFragmentBuilder withOptions(List<StateOption> options);
}
