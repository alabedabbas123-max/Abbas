package com.almlkaide.kaypro.internal;

/**
 * Runtime helpers required by {@code tools/decompiler_repair.py}.
 *
 * <p>The recovered engine sources were produced by a DEX decompiler that could
 * not structure the control flow of ~1.9k methods. Those methods are rewritten
 * into a basic-block dispatch loop, which needs one thing the Java language
 * cannot express directly: re-throwing the {@code Throwable} captured by a
 * synthesised {@code catch (Throwable)} without widening every enclosing
 * method's {@code throws} clause.</p>
 *
 * <p>The bytecode being reconstructed already rethrew that exact instance, so
 * this is a faithful translation rather than a behaviour change.</p>
 */
public final class DecompileSupport {

    private DecompileSupport() {
    }

    /**
     * Rethrows {@code t} exactly as-is, bypassing checked-exception analysis.
     *
     * <p>Declared to return {@link RuntimeException} so call sites can be
     * written as {@code throw DecompileSupport.rethrow(t);} and keep javac's
     * reachability analysis correct.</p>
     */
    public static RuntimeException rethrow(Throwable t) {
        if (t == null) {
            throw new NullPointerException("rethrow(null)");
        }
        return DecompileSupport.<RuntimeException>sneakyThrow(t);
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException sneakyThrow(Throwable t) throws T {
        throw (T) t;
    }
}
