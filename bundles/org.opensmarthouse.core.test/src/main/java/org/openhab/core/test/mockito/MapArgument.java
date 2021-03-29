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
package org.openhab.core.test.mockito;

import java.util.function.Function;
import org.mockito.invocation.InvocationOnMock;

/**
 * Function used in combination with {@link MapBuilderToMock} to move values from builder to mock.
 *
 * @author Łukasz Dywicki - Initial contribution
 * @param <X> Expected type for an argument.
 */
public class MapArgument<X> implements Function<InvocationOnMock, X> {
    private final int index;

    public MapArgument() {
        this(0);
    }

    public MapArgument(int index) {
        this.index = index;
    }
    @Override
    public X apply(InvocationOnMock invocationOnMock) {
        return invocationOnMock.getArgument(index);
    }
}
