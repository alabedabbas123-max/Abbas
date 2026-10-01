package org.c.a.a.b.d.b;

import org.c.a.a.b.d.e.Interfacel;

public class ClassI extends Abstractc {

    protected Abstractn f5731a;

    protected boolean f5732d;

    public ClassI(int i, Interfacel interfaceC2052l, Abstractn abstractC1978n) {
        super(i, interfaceC2052l);
        this.f5731a = abstractC1978n;
        this.f5732d = true;
    }

    public ClassI(int i, Interfacel interfaceC2052l, Abstractn abstractC1978n, boolean z) {
        super(i, interfaceC2052l);
        this.f5731a = abstractC1978n;
        this.f5732d = z;
    }

    public ClassI(Interfacel interfaceC2052l, Abstractn abstractC1978n) {
        super(interfaceC2052l);
        this.f5731a = abstractC1978n;
        this.f5732d = true;
    }

    public void m8006a(Abstractn abstractC1978n) {
        this.f5731a = abstractC1978n;
    }

    @Override
    public void mo7957a(Interfaceo interfaceC1979o) {
        interfaceC1979o.mo7803a(this);
    }

    @Override
    public int mo7954b() {
        return 3;
    }

    public Abstractn m8007d() {
        return this.f5731a;
    }

    public boolean m8008g() {
        return this.f5732d;
    }

    public String toString() {
        return "CastExpression{cast (" + this.f5720c + ") " + this.f5731a + "}";
    }
}
