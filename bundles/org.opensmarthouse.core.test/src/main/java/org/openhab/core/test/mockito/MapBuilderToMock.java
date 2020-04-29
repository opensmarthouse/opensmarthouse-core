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
package org.openhab.core.test.mockito;

import static org.mockito.Mockito.when;

import java.util.function.Function;
import java.util.function.Supplier;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

/**
 * Answer for mocking operation which involves a call on another mock.
 *
 * @author Łukasz Dywicki - Initial contribution.
 *
 * @param <T> Type of first mock
 * @param <X> Value to be passed to second mock.
 */
public class MapBuilderToMock<T, X> implements Answer<T> {
    private final T builder;
    private final Supplier<X> getter;
    private final Function<InvocationOnMock, X> returnValue;

    public MapBuilderToMock(T builder, Supplier<X> getter, Function<InvocationOnMock, X> returnValue) {
        this.builder = builder;
        this.getter = getter;
        this.returnValue = returnValue;
    }
    @Override
    public T answer(InvocationOnMock invocation) throws Throwable {
        when(getter.get()).thenReturn(returnValue.apply(invocation));
        return builder;
    }
}
