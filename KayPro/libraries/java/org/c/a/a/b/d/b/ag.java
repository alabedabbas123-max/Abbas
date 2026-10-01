package org.c.a.a.b.d.b;

import org.c.a.a.b.d.e.Interfacel;

public class ag extends Abstractb {

    protected String f5705a;

    protected Abstractn f5706c;

    public ag(int i, String str, Abstractn abstractC1978n) {
        super(i);
        this.f5705a = str;
        this.f5706c = abstractC1978n;
    }

    public void m7975a(Abstractn abstractC1978n) {
        this.f5706c = abstractC1978n;
    }

    @Override
    public void mo7957a(Interfaceo interfaceC1979o) {
        interfaceC1979o.mo7792a(this);
    }

    @Override
    public int mo7954b() {
        return 2;
    }

    public String m7976d() {
        return this.f5705a;
    }

    @Override
    public Interfacel mo7963f() {
        return this.f5706c.mo7963f();
    }

    public Abstractn m7977g() {
        return this.f5706c;
    }

    public String toString() {
        return "PreOperatorExpression{" + this.f5705a + " " + this.f5706c + "}";
    }
}
