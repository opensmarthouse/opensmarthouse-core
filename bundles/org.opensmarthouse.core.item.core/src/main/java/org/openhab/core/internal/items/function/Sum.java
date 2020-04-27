package org.openhab.core.internal.items.function;

import java.math.BigDecimal;
import java.util.Set;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.items.GroupFunction;
import org.openhab.core.items.Item;
import org.openhab.core.library.types.DecimalType;
import org.openhab.core.types.State;

/**
 * This calculates the numeric sum over all item states of decimal type.
 */
public class Sum implements GroupFunction {

    public Sum() {
    }

    @Override
    public State calculate(@Nullable Set<Item> items) {
        BigDecimal sum = BigDecimal.ZERO;
        if (items != null) {
            for (Item item : items) {
                DecimalType itemState = item.getStateAs(DecimalType.class);
                if (itemState != null) {
                    sum = sum.add(itemState.toBigDecimal());
                }
            }
        }
        return new DecimalType(sum);
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