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
package org.openhab.core.library.unit;

import java.util.Objects;
import javax.measure.IncommensurableException;
import javax.measure.Quantity;
import javax.measure.UnconvertibleException;
import javax.measure.Unit;
import javax.measure.UnitConverter;

import org.eclipse.jdt.annotation.Nullable;

import tec.uom.se.AbstractUnit;
import tec.uom.se.quantity.Quantities;

/**
 * A naive copy of {@link org.openhab.core.library.types.QuantityType} with basic functionality to test system of the units.
 *
 * Introduced to avoid cyclic dependency from library.unit to library.type packages.
 *
 * @author Łukasz Dywicki - Initial contribution
 */
public class QType<T extends Quantity<T>> {

    private static final String UNIT_PATTERN = "(?<=\\d)\\s*(?=[a-zA-Z°µ%'](?![\\+\\-]?\\d))";
    private final Quantity<T> quantity;

    public QType(String value) {
        String[] constituents = value.split(UNIT_PATTERN);

        // getQuantity needs a space between numeric value and unit
        String formatted = String.join(" ", constituents);
        quantity = (Quantity<T>) Quantities.getQuantity(formatted);
    }

    public QType(Number value, Unit<T> unit) {
        this.quantity = Quantities.getQuantity(value, unit);
    }

    public static QType<? extends Quantity<?>> valueOf(String value) {
        return new QType(value);
    }

    public @Nullable QType<T> toUnit(String targetUnit) {
        Unit<T> unit = (Unit<T>) AbstractUnit.parse(targetUnit);
        if (unit != null) {
            return (QType<T>) toUnit(unit);
        }

        return null;
    }

    public QType<?> toUnit(Unit<?> targetUnit) {
        if (!targetUnit.equals(getUnit())) {
            try {
                UnitConverter uc = getUnit().getConverterToAny(targetUnit);
                Quantity<?> result = Quantities.getQuantity(uc.convert(quantity.getValue()), targetUnit);

                return new QType<T>(result.getValue(), (Unit<T>) targetUnit);
            } catch (UnconvertibleException | IncommensurableException e) {
                throw new RuntimeException(e);
            }
        }
        return this;
    }

    public Double doubleValue() {
        return quantity.getValue().doubleValue();
    }

    public Unit<T> getUnit() {
        return quantity.getUnit();
    }

    public String toString() {
        return quantity.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof QType)) {
            return false;
        }
        QType<?> qType = (QType<?>) o;
        return Objects.equals(quantity, qType.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity);
    }

}
