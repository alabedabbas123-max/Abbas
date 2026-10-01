package com.a.b.e.c;

import com.a.b.g.Interfacew;

public abstract class Abstracta implements Interfacew, Comparable {
    @Override
    public final int compareTo(Abstracta abstractC1200a) {
        Class<?> cls = getClass();
        Class<?> cls2 = abstractC1200a.getClass();
        return cls != cls2 ? cls.getName().compareTo(cls2.getName()) : mo4941b(abstractC1200a);
    }

    protected abstract int mo4941b(Abstracta abstractC1200a);

    public abstract boolean mo4942g();

    public abstract String mo4943h();
}
