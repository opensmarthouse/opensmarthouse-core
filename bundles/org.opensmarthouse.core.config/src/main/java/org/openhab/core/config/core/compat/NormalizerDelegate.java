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
package org.openhab.core.config.core.compat;

import java.util.function.Consumer;
import org.openhab.core.config.core.Normalizer;

/**
 * A compatibility layer for calling config normalizers.
 *
 * @author Łuaksz Dywicki - Initial contribution.
 */
public class NormalizerDelegate implements Normalizer {

    private final Normalizer delegate;
    private final Consumer<Normalizer> closeable;

    public NormalizerDelegate(Normalizer delegate, Consumer<Normalizer> closeable) {
        this.delegate = delegate;
        this.closeable = closeable;
    }

    @Override
    public Object normalize(Object value) {
        try {
            return delegate.normalize(value);
        } finally {
            closeable.accept(delegate);
        }
    }

}
