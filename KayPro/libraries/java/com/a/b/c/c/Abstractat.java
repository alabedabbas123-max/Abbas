package com.a.b.c.c;

import com.a.a.a.ClassB;
import com.a.b.g.Interfacea;

public abstract class Abstractat extends Abstractag implements Comparable {

    private final int f2396a;

    private int f2397b;

    private Abstractax f2398c;

    private int f2399d;

    public Abstractat(int i, int i2) {
        Abstractax.m4535a(i);
        if (i2 < -1) {
            throw new IllegalArgumentException("writeSize < -1");
        }
        this.f2396a = i;
        this.f2397b = i2;
        this.f2398c = null;
        this.f2399d = -1;
    }

    public static int m4519b(Abstractat abstractC1079at) {
        if (abstractC1079at == null) {
            return 0;
        }
        return abstractC1079at.m4523e();
    }

    protected int mo4468a(Abstractat abstractC1079at) {
        throw new UnsupportedOperationException("unsupported");
    }

    public final void m4520a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("writeSize < 0");
        }
        if (this.f2397b >= 0) {
            throw new UnsupportedOperationException("writeSize already set");
        }
        this.f2397b = i;
    }

    protected void mo4470a(Abstractax abstractC1083ax, int i) {
    }

    @Override
    public final void mo4483a(ClassT c1113t, Interfacea interfaceC1303a) {
        interfaceC1303a.mo5465h(this.f2396a);
        try {
            if (this.f2397b < 0) {
                throw new UnsupportedOperationException("writeSize is unknown");
            }
            interfaceC1303a.mo5455b(m4523e());
            mo4473a_(c1113t, interfaceC1303a);
        } catch (RuntimeException e) {
            throw ClassB.m3756a(e, "...while writing " + this);
        }
    }

    protected abstract void mo4473a_(ClassT c1113t, Interfacea interfaceC1303a);

    public final int m4521b(Abstractax abstractC1083ax, int i) {
        if (abstractC1083ax == null) {
            throw new NullPointerException("addedTo == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("offset < 0");
        }
        if (this.f2398c != null) {
            throw new RuntimeException("already written");
        }
        int i2 = this.f2396a - 1;
        int i3 = (i2 ^ (-1)) & (i + i2);
        this.f2398c = abstractC1083ax;
        this.f2399d = i3;
        mo4470a(abstractC1083ax, i3);
        return i3;
    }

    public abstract String mo4474b();

    @Override
    public final int compareTo(Abstractat abstractC1079at) {
        if (this == abstractC1079at) {
            return 0;
        }
        Enumah enumC1067ahA = mo4469a();
        Enumah enumC1067ahA2 = abstractC1079at.mo4469a();
        return enumC1067ahA != enumC1067ahA2 ? enumC1067ahA.compareTo(enumC1067ahA2) : mo4468a(abstractC1079at);
    }

    public final int m4523e() {
        if (this.f2399d < 0) {
            throw new RuntimeException("offset not yet known");
        }
        return this.f2398c.m4537c(this.f2399d);
    }

    @Override
    public final int mo4484e_() {
        if (this.f2397b < 0) {
            throw new UnsupportedOperationException("writeSize is unknown");
        }
        return this.f2397b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Abstractat abstractC1079at = (Abstractat) obj;
        return mo4469a() == abstractC1079at.mo4469a() && mo4468a(abstractC1079at) == 0;
    }

    public final int m4524f() {
        return this.f2396a;
    }

    public final String m4525g() {
        return String.valueOf('[') + Integer.toHexString(m4523e()) + ']';
    }
}
