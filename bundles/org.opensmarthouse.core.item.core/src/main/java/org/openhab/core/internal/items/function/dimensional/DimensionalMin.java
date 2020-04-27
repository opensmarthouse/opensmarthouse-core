package org.openhab.core.internal.items.function.dimensional;

import java.util.Set;
import javax.measure.Quantity;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.items.Item;
import org.openhab.core.library.types.QuantityType;
import org.openhab.core.types.State;
import org.openhab.core.types.UnDefType;

/**
 * This calculates the minimum value of all item states of {@link QuantityType}.
 */
public class DimensionalMin extends DimensionalGroupFunction {

    public DimensionalMin(Class<? extends Quantity<?>> dimension) {
        super(dimension);
    }

    @Override
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public State calculate(@Nullable Set<Item> items) {
        if (items == null || items.isEmpty()) {
            return UnDefType.UNDEF;
        }

        QuantityType<?> min = null;
        for (Item item : items) {
            if (isSameDimension(item)) {
                QuantityType itemState = item.getStateAs(QuantityType.class);
                if (itemState != null) {
                    if (min == null
                            || (min.getUnit().isCompatible(itemState.getUnit()) && min.compareTo(itemState) > 0)) {
                        min = itemState;
                    }
                }
            }
        }

        return min != null ? min : UnDefType.UNDEF;
    }

}
