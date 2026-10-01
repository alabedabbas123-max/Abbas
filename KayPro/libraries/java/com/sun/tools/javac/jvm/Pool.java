package com.sun.tools.javac.jvm;

import com.sun.tools.javac.code.Symbol;
import java.util.HashMap;
import java.util.Map;

public class Pool {
    public static final int MAX_ENTRIES = 65535;
    public static final int MAX_STRING_LENGTH = 65535;
    Map<Object, Integer> indices;
    Object[] pool;

    int f447pp;

    public Pool(int pp, Object[] pool) {
        this.f447pp = pp;
        this.pool = pool;
        this.indices = new HashMap(pool.length);
        for (int i = 1; i < pp; i++) {
            if (pool[i] != null) {
                this.indices.put(pool[i], Integer.valueOf(i));
            }
        }
    }

    public Pool() {
        this(1, new Object[64]);
    }

    public int numEntries() {
        return this.f447pp;
    }

    public void reset() {
        this.f447pp = 1;
        this.indices.clear();
    }

    private void doublePool() {
        Object[] objArr = this.pool;
        Object[] newpool = new Object[objArr.length * 2];
        System.arraycopy(objArr, 0, newpool, 0, objArr.length);
        this.pool = newpool;
    }

    public int m478put(Object value) {
        if (value instanceof Symbol.MethodSymbol) {
            value = new Method((Symbol.MethodSymbol) value);
        } else if (value instanceof Symbol.VarSymbol) {
            value = new Variable((Symbol.VarSymbol) value);
        }
        Integer index = this.indices.get(value);
        if (index == null) {
            index = Integer.valueOf(this.f447pp);
            this.indices.put(value, index);
            if (this.f447pp == this.pool.length) {
                doublePool();
            }
            Object[] objArr = this.pool;
            int i = this.f447pp;
            this.f447pp = i + 1;
            objArr[i] = value;
            if ((value instanceof Long) || (value instanceof Double)) {
                if (this.f447pp == this.pool.length) {
                    doublePool();
                }
                Object[] objArr2 = this.pool;
                int i2 = this.f447pp;
                this.f447pp = i2 + 1;
                objArr2[i2] = null;
            }
        }
        return index.intValue();
    }

    public int m477get(Object o) {
        Integer n = this.indices.get(o);
        if (n == null) {
            return -1;
        }
        return n.intValue();
    }

    static class Method extends Symbol.DelegatedSymbol {

        Symbol.MethodSymbol f448m;

        Method(Symbol.MethodSymbol m) {
            super(m);
            this.f448m = m;
        }

        @Override
        public boolean equals(Object other) {
            if (!(other instanceof Method)) {
                return false;
            }
            Symbol.MethodSymbol o = ((Method) other).f448m;
            return o.name == this.f448m.name && o.owner == this.f448m.owner && o.type.equals(this.f448m.type);
        }

        @Override
        public int hashCode() {
            return (this.f448m.name.hashCode() * 33) + (this.f448m.owner.hashCode() * 9) + this.f448m.type.hashCode();
        }
    }

    static class Variable extends Symbol.DelegatedSymbol {

        Symbol.VarSymbol f449v;

        Variable(Symbol.VarSymbol v) {
            super(v);
            this.f449v = v;
        }

        @Override
        public boolean equals(Object other) {
            if (!(other instanceof Variable)) {
                return false;
            }
            Symbol.VarSymbol o = ((Variable) other).f449v;
            return o.name == this.f449v.name && o.owner == this.f449v.owner && o.type.equals(this.f449v.type);
        }

        @Override
        public int hashCode() {
            return (this.f449v.name.hashCode() * 33) + (this.f449v.owner.hashCode() * 9) + this.f449v.type.hashCode();
        }
    }
}
