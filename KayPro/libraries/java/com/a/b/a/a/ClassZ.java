package com.a.b.a.a;

import com.a.b.e.c.Interfaceb;
import com.a.b.g.ClassE;

public final class ClassZ extends Abstractu {

    private final ClassE f1763a;

    private final Interfaceb f1764b;

    public ClassZ(String str, ClassE c1307e, int i, int i2, Interfaceb interfaceC1209b) {
        this(str, c1307e.m5438a(i, i + i2), interfaceC1209b);
    }

    public ClassZ(String str, ClassE c1307e, Interfaceb interfaceC1209b) {
        super(str);
        if (c1307e == null) {
            throw new NullPointerException("data == null");
        }
        this.f1763a = c1307e;
        this.f1764b = interfaceC1209b;
    }

    @Override
    public int mo3765a() {
        return this.f1763a.m5436a() + 6;
    }
}
