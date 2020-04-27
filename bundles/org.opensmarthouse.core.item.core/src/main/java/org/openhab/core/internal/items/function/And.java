package org.openhab.core.internal.items.function;

import java.util.Set;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.items.GroupFunction;
import org.openhab.core.items.Item;
import org.openhab.core.library.types.DecimalType;
import org.openhab.core.types.State;

/**
 * This does a logical 'and' operation. Only if all items are of 'activeState' this
 * is returned, otherwise the 'passiveState' is returned.
 *
 * Through the getStateAs() method, it can be determined, how many
 * items actually are not in the 'activeState'.
 */
public class And implements GroupFunction {

    protected final State activeState;
    protected final State passiveState;

    public And(@Nullable State activeValue, @Nullable State passiveValue) {
        if (activeValue == null || passiveValue == null) {
            throw new IllegalArgumentException("Parameters must not be null!");
        }
        this.activeState = activeValue;
        this.passiveState = passiveValue;
    }

    @Override
    public State calculate(@Nullable Set<Item> items) {
        if (items == null || items.isEmpty()) {
            // if we do not have any items, we return the passive state
            return passiveState;
        } else {
            for (Item item : items) {
                if (!activeState.equals(item.getStateAs(activeState.getClass()))) {
                    return passiveState;
                }
            }
            return activeState;
        }
    }

    @Override
    public @Nullable <T extends State> T getStateAs(@Nullable Set<Item> items, Class<T> stateClass) {
        State state = calculate(items);
        if (stateClass.isInstance(state)) {
            return stateClass.cast(state);
        } else {
            if (stateClass == DecimalType.class) {
                if (items != null) {
                    return stateClass.cast(new DecimalType(items.size() - count(items, activeState)));
                } else {
                    return stateClass.cast(DecimalType.ZERO);
                }
            } else {
                return null;
            }
        }
    }

    private int count(Set<Item> items, State state) {
        int count = 0;
        for (Item item : items) {
            if (state.equals(item.getStateAs(state.getClass()))) {
                count++;
            }
        }
        return count;
    }

    @Override
    public State[] getParameters() {
        return new State[] { activeState, passiveState };
    }
}