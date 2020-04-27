package org.openhab.core.internal.items.function;

import java.util.Set;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.items.Item;
import org.openhab.core.types.State;

/**
 * This does a logical 'nor' operation. The state is 'calculated' by
 * the normal 'or' operation and than negated by returning the opposite
 * value. E.g. when the 'or' operation calculates the activeValue the
 * passiveValue will be returned and vice versa.
 */
public class NOr extends Or {

    public NOr(@Nullable State activeValue, @Nullable State passiveValue) {
        super(activeValue, passiveValue);
    }

    @Override
    public State calculate(@Nullable Set<Item> items) {
        State result = super.calculate(items);
        return activeState.equals(result) ? passiveState : activeState;
    }

}