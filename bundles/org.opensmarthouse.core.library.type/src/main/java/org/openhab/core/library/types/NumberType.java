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
package org.openhab.core.library.types;

/**
 * The {@link NumberType} class provides a base class that implements the same functionality as the Java {@link Number}
 * class. This is used as the base class for number related {@link Type}s.
 * 
 * @author Chris Jackson - Initial contribution for OpenSmartHouse
 *
 */
public abstract class NumberType extends AbstractBaseType {
    /**
     * Returns the value of the specified number as an {@code int}.
     *
     * @return the numeric value represented by this object after conversion
     *         to type {@code int}.
     */
    public abstract int intValue();

    /**
     * Returns the value of the specified number as a {@code long}.
     *
     * @return the numeric value represented by this object after conversion
     *         to type {@code long}.
     */
    public abstract long longValue();

    /**
     * Returns the value of the specified number as a {@code float}.
     *
     * @return the numeric value represented by this object after conversion
     *         to type {@code float}.
     */
    public abstract float floatValue();

    /**
     * Returns the value of the specified number as a {@code double}.
     *
     * @return the numeric value represented by this object after conversion
     *         to type {@code double}.
     */
    public abstract double doubleValue();

    /**
     * Returns the value of the specified number as a {@code byte}.
     *
     * <p>
     * This implementation returns the result of {@link #intValue} cast
     * to a {@code byte}.
     *
     * @return the numeric value represented by this object after conversion
     *         to type {@code byte}.
     * @since 1.1
     */
    public byte byteValue() {
        return (byte) intValue();
    }

    /**
     * Returns the value of the specified number as a {@code short}.
     *
     * <p>
     * This implementation returns the result of {@link #intValue} cast
     * to a {@code short}.
     *
     * @return the numeric value represented by this object after conversion
     *         to type {@code short}.
     * @since 1.1
     */
    public short shortValue() {
        return (short) intValue();
    }
}
