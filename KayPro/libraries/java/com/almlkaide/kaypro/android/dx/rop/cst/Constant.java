package com.almlkaide.kaypro.android.dx.rop.cst;

import com.almlkaide.kaypro.android.dx.util.ToHuman;

public abstract class Constant implements ToHuman, Comparable<Constant> {
    @Override
    public final int compareTo(Constant constant) {
        return compareTo2(constant);
    }

    protected abstract int compareTo0(Constant constant);

    public abstract boolean isCategory2();

    public abstract String typeName();

    public final int compareTo2(Constant constant) {
        Class<?> cls = getClass();
        Class<?> cls2 = constant.getClass();
        return cls != cls2 ? cls.getName().compareTo(cls2.getName()) : compareTo0(constant);
    }
}
