package com.a.b.e.c;

import com.a.a.a.ClassB;
import com.a.b.g.ClassK;
import com.a.b.g.ClassT;

public final class af extends ClassT implements Interfaceb {

    private final Abstracta[] f3153a;

    public af(int i) {
        super(i > 1);
        if (i < 1) {
            throw new IllegalArgumentException("size < 1");
        }
        this.f3153a = new Abstracta[i];
    }

    private static Abstracta m4969d(int i) {
        throw new ClassB("invalid constant pool index " + ClassK.m5485c(i));
    }

    @Override
    public int mo4970a() {
        return this.f3153a.length;
    }

    @Override
    public Abstracta mo4971a(int i) {
        try {
            Abstracta abstractC1200a = this.f3153a[i];
            if (abstractC1200a != null) {
                return abstractC1200a;
            }
            m4969d(i);
            return abstractC1200a;
        } catch (IndexOutOfBoundsException e) {
            return m4969d(i);
        }
    }

    public void m4972a(int i, Abstracta abstractC1200a) {
        Abstracta abstractC1200a2;
        m5518l();
        boolean z = abstractC1200a != null && abstractC1200a.mo4942g();
        if (i < 1) {
            throw new IllegalArgumentException("n < 1");
        }
        if (z) {
            if (i == this.f3153a.length - 1) {
                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
            }
            this.f3153a[i + 1] = null;
        }
        if (abstractC1200a != null && this.f3153a[i] == null && (abstractC1200a2 = this.f3153a[i - 1]) != null && abstractC1200a2.mo4942g()) {
            this.f3153a[i - 1] = null;
        }
        this.f3153a[i] = abstractC1200a;
    }

    @Override
    public Abstracta mo4973b(int i) {
        if (i == 0) {
            return null;
        }
        return mo4971a(i);
    }

    @Override
    public Abstracta mo4974c(int i) {
        try {
            return this.f3153a[i];
        } catch (IndexOutOfBoundsException e) {
            return m4969d(i);
        }
    }
}
