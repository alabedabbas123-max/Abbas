package org.c.a.a.b.d.b;

import org.c.a.a.b.d.e.Interfacel;

public class ak extends Abstractc {

    protected Abstractn f5711a;

    protected Abstractn f5712d;

    protected Abstractn f5713e;

    public ak(int i, Abstractn abstractC1978n, Abstractn abstractC1978n2, Abstractn abstractC1978n3) {
        super(i, m7981a(abstractC1978n2, abstractC1978n3));
        this.f5711a = abstractC1978n;
        this.f5712d = abstractC1978n2;
        this.f5713e = abstractC1978n3;
    }

    protected static Interfacel m7981a(Abstractn abstractC1978n, Abstractn abstractC1978n2) {
        return abstractC1978n instanceof ad ? abstractC1978n2.mo7963f() : abstractC1978n.mo7963f();
    }

    public void m7982a(Abstractn abstractC1978n) {
        this.f5711a = abstractC1978n;
    }

    @Override
    public void mo7957a(Interfaceo interfaceC1979o) {
        interfaceC1979o.mo7796a(this);
    }

    @Override
    public int mo7954b() {
        return 15;
    }

    public void m7983b(Abstractn abstractC1978n) {
        this.f5712d = abstractC1978n;
    }

    public void m7984c(Abstractn abstractC1978n) {
        this.f5713e = abstractC1978n;
    }

    public Abstractn m7985d() {
        return this.f5711a;
    }

    public Abstractn m7986g() {
        return this.f5712d;
    }

    public Abstractn m7987i() {
        return this.f5713e;
    }

    public String toString() {
        return "TernaryOperatorExpression{" + this.f5711a + " ? " + this.f5712d + " : " + this.f5713e + "}";
    }
}
