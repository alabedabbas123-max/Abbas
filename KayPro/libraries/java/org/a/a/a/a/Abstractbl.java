package org.a.a.a.a;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.a.a.a.c.ClassJ;

public abstract class Abstractbl {

    public static final List f5185d = Collections.unmodifiableList(Arrays.asList("INVALID", "EPSILON", "RANGE", "RULE", "PREDICATE", "ATOM", "ACTION", "SET", "NOT_SET", "WILDCARD", "PRECEDENCE"));

    public static final Map f5186e = Collections.unmodifiableMap(new bm());

    public Abstractn f5187f;

    protected Abstractbl(Abstractn abstractC1738n) {
        if (abstractC1738n == null) {
            throw new NullPointerException("target cannot be null.");
        }
        this.f5187f = abstractC1738n;
    }

    public abstract int mo7286a();

    public abstract boolean mo7287a(int i, int i2, int i3);

    public boolean mo7288b() {
        return false;
    }

    public ClassJ mo7302c() {
        return null;
    }
}
