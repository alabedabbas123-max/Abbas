package com.a.b.c.c;

public abstract class Abstractaf extends Abstractag {

    private int f2345a = -1;

    public final void m4487a(int i) {
        if (this.f2345a != -1) {
            throw new RuntimeException("index already set");
        }
        this.f2345a = i;
    }

    public final boolean m4488f() {
        return this.f2345a >= 0;
    }

    public final int m4489g() {
        if (this.f2345a < 0) {
            throw new RuntimeException("index not yet set");
        }
        return this.f2345a;
    }

    public final String m4490h() {
        return String.valueOf('[') + Integer.toHexString(this.f2345a) + ']';
    }
}
