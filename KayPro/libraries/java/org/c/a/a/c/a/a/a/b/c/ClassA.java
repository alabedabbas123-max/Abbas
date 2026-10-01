package org.c.a.a.c.a.a.a.b.c;

import org.c.a.a.b.d.d.Abstracts;
import org.c.a.a.b.d.d.Interfacer;
import org.c.a.a.b.d.d.Interfacet;

public class ClassA extends Abstracts {

    protected int f6027a;

    protected int f6028b;

    protected boolean f6029c = false;

    protected Interfacer f6030d = null;

    public ClassA(int i, int i2) {
        this.f6027a = i;
        this.f6028b = i2;
    }

    public void m8307a(Interfacer interfaceC2032r) {
        this.f6030d = interfaceC2032r;
    }

    @Override
    public void mo8055a(Interfacet interfaceC2034t) {
        if (this.f6030d != null) {
            this.f6030d.mo8055a(interfaceC2034t);
        }
    }

    public void m8308a(boolean z) {
        this.f6029c = z;
    }

    public int m8309b() {
        return this.f6027a;
    }

    public int m8310d() {
        return this.f6028b;
    }

    public boolean m8311e() {
        return this.f6029c;
    }

    public String toString() {
        return this.f6030d == null ? "ClassFileBreakContinueStatement{}" : "ClassFileBreakContinueStatement{" + this.f6030d + "}";
    }
}
