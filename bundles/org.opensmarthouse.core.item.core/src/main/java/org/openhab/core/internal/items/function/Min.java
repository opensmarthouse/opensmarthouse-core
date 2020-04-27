package org.openhab.core.internal.items.function;

import java.math.BigDecimal;
import java.util.Set;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.items.GroupFunction;
import org.openhab.core.items.Item;
import org.openhab.core.library.types.DecimalType;
import org.openhab.core.types.State;
import org.openhab.core.types.UnDefType;

/**
 * This calculates the minimum value of all item states of decimal type.
 */
public class Min implements GroupFunction {

    public Min() {
    }

    @Override
    public State calculate(@Nullable Set<Item> items) {
        if (items != null && !items.isEmpty()) {
            BigDecimal min = null;
            for (Item item : items) {
                DecimalType itemState = item.getStateAs(DecimalType.class);
                if (itemState != null) {
                    if (min == null || min.compareTo(itemState.toBigDecimal()) > 0) {
                        min = itemState.toBigDecimal();
                    }
                }
            }
            if (min != null) {
                return new DecimalType(min);
            }
        }
        return UnDefType.UNDEF;
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