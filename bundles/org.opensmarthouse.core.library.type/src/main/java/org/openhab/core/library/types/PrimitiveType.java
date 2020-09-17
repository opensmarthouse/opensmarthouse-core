package org.openhab.core.library.types;

/**
 * Primitive type definition - primitives define constant values
 * 
 * @author Chris Jackson
 *
 * @param <T>
 */
public abstract class PrimitiveType<T> extends AbstractBaseType {
    final int ordinal;
    final String name;

    protected PrimitiveType(String name, int ordinal) {
        this.name = name;
        this.ordinal = ordinal;
    }

    /**
     * Returns the number of this enumeration constant, which represents the order in which it was originally declared,
     * starting from zero.
     * 
     * @return the number of this constant.
     */
    public final int ordinal() {
        return ordinal;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public String toFullString() {
        return name;
    }

    @Override
    public String format(String pattern) {
        return String.format(pattern, this.toString());
    }

    /**
     * Gets the string name of this value
     * 
     * @return the name of the value
     * @deprecated use {@link #toString()} instead
     */
    @Deprecated
    public String name() {
        return toString();
    }
}
