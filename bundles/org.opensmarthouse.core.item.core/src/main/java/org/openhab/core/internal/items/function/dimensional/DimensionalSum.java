package org.openhab.core.internal.items.function.dimensional;

import java.util.Set;
import javax.measure.Quantity;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.items.Item;
import org.openhab.core.library.types.QuantityType;
import org.openhab.core.types.State;
import org.openhab.core.types.UnDefType;

/**
 * This calculates the numeric sum over all item states of {@link QuantityType}.
 */
public class DimensionalSum extends DimensionalGroupFunction {

    public DimensionalSum(Class<? extends Quantity<?>> dimension) {
        super(dimension);
    }

    @Override
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public State calculate(@Nullable Set<Item> items) {
        if (items == null || items.isEmpty()) {
            return UnDefType.UNDEF;
        }

        QuantityType<?> sum = null;
        for (Item item : items) {
            if (isSameDimension(item)) {
                QuantityType itemState = item.getStateAs(QuantityType.class);
                if (itemState != null) {
                    if (sum == null) {
                        sum = itemState; // initialise the sum from the first item
                    } else if (sum.getUnit().isCompatible(itemState.getUnit())) {
                        sum = sum.add(itemState);
                    }
                }
            }
        }

        return sum != null ? sum : UnDefType.UNDEF;
    }

}