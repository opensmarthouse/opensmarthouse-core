package org.openhab.core.internal.items.function;

import static org.graalvm.compiler.nodeinfo.InputType.State;

import java.time.ZonedDateTime;
import java.util.Set;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.items.GroupFunction;
import org.openhab.core.items.Item;
import org.openhab.core.library.types.DateTimeType;
import org.openhab.core.types.State;
import org.openhab.core.types.UnDefType;

/**
 * This calculates the minimum value of all item states of DateType type.
 *
 * @author Robert Michalak - Initial contribution
 */
public class Earliest implements GroupFunction {

    public Earliest() {
    }

    @Override
    public org.openhab.core.types.State calculate(@Nullable Set<Item> items) {
        if (items != null && !items.isEmpty()) {
            ZonedDateTime max = null;
            for (Item item : items) {
                DateTimeType itemState = item.getStateAs(DateTimeType.class);
                if (itemState != null) {
                    if (max == null || max.isAfter(itemState.getZonedDateTime())) {
                        max = itemState.getZonedDateTime();
                    }
                }
            }
            if (max != null) {
                return new DateTimeType(max);
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