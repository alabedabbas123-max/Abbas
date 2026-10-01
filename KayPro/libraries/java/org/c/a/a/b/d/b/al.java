package org.c.a.a.b.d.b;

import org.c.a.a.b.d.e.ClassI;
import org.c.a.a.b.d.e.Interfacel;

public class al extends Abstractb {

    protected ClassI f5714a;

    protected boolean f5715c;

    public al(int i, ClassI c2049i) {
        super(i);
        this.f5714a = c2049i;
        this.f5715c = true;
    }

    @Override
    public void mo7957a(Interfaceo interfaceC1979o) {
        interfaceC1979o.mo7797a(this);
    }

    public ClassI m7988d() {
        return this.f5714a;
    }

    @Override
    public Interfacel mo7963f() {
        return this.f5714a;
    }

    public boolean m7989g() {
        return this.f5715c;
    }

    public String toString() {
        return "ThisExpression{" + this.f5714a + "}";
    }
}
