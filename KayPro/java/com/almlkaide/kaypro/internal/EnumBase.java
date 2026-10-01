package com.almlkaide.kaypro.internal;

import java.io.Serializable;

/**
 * Stand-in for {@link java.lang.Enum} used by recovered engine sources.
 *
 * <p>The decompiler emitted enum types as</p>
 *
 * <pre>{@code
 * public static abstract class a extends com.almlkaide.kaypro.internal.EnumBase { ... }
 * }</pre>
 *
 * <p>which is not legal Java: an {@code enum} may not declare an
 * {@code extends} clause, may not be {@code abstract}, and its constants were
 * lowered into plain {@code static final} fields assigned from a static
 * initialiser — with each constant-specific body emitted as a *separate*
 * top-level type that {@code extends} the enum. None of that can be expressed
 * with the {@code enum} keyword.</p>
 *
 * <p>Those types are therefore rewritten to ordinary classes extending this
 * base, which reproduces the parts of {@code java.lang.Enum} the recovered
 * code actually relies on: {@link #name()}, {@link #ordinal()},
 * {@link #toString()}, identity equality and ordinal ordering.</p>
 */
public abstract class EnumBase implements Comparable<EnumBase>, Serializable {

    private static final long serialVersionUID = 1L;

    private final String $name;
    private final int $ordinal;

    protected EnumBase(String name, int ordinal) {
        this.$name = name;
        this.$ordinal = ordinal;
    }

    public final String name() {
        return $name;
    }

    public final int ordinal() {
        return $ordinal;
    }

    @Override
    public String toString() {
        return $name;
    }

    /** Enum identity semantics: constants are singletons. */
    @Override
    public final boolean equals(Object other) {
        return this == other;
    }

    @Override
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    @Override
    public final int compareTo(EnumBase other) {
        return this.$ordinal - other.$ordinal;
    }

    /** Replacement for {@code com.almlkaide.kaypro.internal.EnumBase.valueOf(Type.values(), name)}. */
    public static <T extends EnumBase> T valueOf(T[] values, String name) {
        if (values != null) {
            for (T value : values) {
                if (value != null && value.name().equals(name)) {
                    return value;
                }
            }
        }
        throw new IllegalArgumentException("No enum constant " + name);
    }
}
