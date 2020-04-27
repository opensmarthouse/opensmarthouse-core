package org.openhab.core.internal.items.function;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Set;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.items.GroupFunction;
import org.openhab.core.items.Item;
import org.openhab.core.library.types.DecimalType;
import org.openhab.core.types.State;
import org.openhab.core.types.UnDefType;

/**
 * This calculates the numeric average over all item states of decimal type.
 */
public class Avg implements GroupFunction {

    public Avg() {
    }

    @Override
    public State calculate(@Nullable Set<Item> items) {
        BigDecimal sum = BigDecimal.ZERO;
        int count = 0;
        if (items != null) {
            for (Item item : items) {
                DecimalType itemState = item.getStateAs(DecimalType.class);
                if (itemState != null) {
                    sum = sum.add(itemState.toBigDecimal());
                    count++;
                }
            }
        }
        if (count > 0) {
            return new DecimalType(sum.divide(BigDecimal.valueOf(count), RoundingMode.HALF_UP));
        } else {
            return UnDefType.UNDEF;
        }
    }

    @Override
    public @Nullable <T extends State> T getStateAs(@Nullable Set<Item> items, Class<T> stateClass) {
        State state = calculate(items);
        if (stateClass.isInstance(state)) {
            return stateClass.cast(state);
        } else {
            return null;
        }
    }

    @Override
    public State[] getParameters() {
        return new State[0];
    }
}
