package org.c.a.a.b.d.b;

import org.c.a.a.b.d.e.Interfacel;

public class af extends Abstractb {

    protected String f5703a;

    protected Abstractn f5704c;

    public af(int i, Abstractn abstractC1978n, String str) {
        super(i);
        this.f5703a = str;
        this.f5704c = abstractC1978n;
    }

    public void m7972a(Abstractn abstractC1978n) {
        this.f5704c = abstractC1978n;
    }

    @Override
    public void mo7957a(Interfaceo interfaceC1979o) {
        interfaceC1979o.mo7791a(this);
    }

    @Override
    public int mo7954b() {
        return 1;
    }

    public String m7973d() {
        return this.f5703a;
    }

    @Override
    public Interfacel mo7963f() {
        return this.f5704c.mo7963f();
    }

    public Abstractn m7974g() {
        return this.f5704c;
    }

    public String toString() {
        return "PostOperatorExpression{" + this.f5704c + " " + this.f5703a + "}";
    }
}
