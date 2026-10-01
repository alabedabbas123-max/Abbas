package org.c.a.a.b.d.b;

import org.c.a.a.b.d.e.Interfacel;

public class ClassG extends Abstractc {

    protected Abstractn f5724a;

    protected String f5725d;

    protected Abstractn f5726e;

    protected int f5727f;

    public ClassG(int i, Interfacel interfaceC2052l, Abstractn abstractC1978n, String str, Abstractn abstractC1978n2, int i2) {
        super(i, interfaceC2052l);
        this.f5725d = str;
        this.f5724a = abstractC1978n;
        this.f5726e = abstractC1978n2;
        this.f5727f = i2;
    }

    public void m7997a(String str) {
        this.f5725d = str;
    }

    public void m7998a(Abstractn abstractC1978n) {
        this.f5724a = abstractC1978n;
    }

    @Override
    public void mo7957a(Interfaceo interfaceC1979o) {
        interfaceC1979o.mo7801a(this);
    }

    @Override
    public int mo7954b() {
        return this.f5727f;
    }

    public void m7999b(Abstractn abstractC1978n) {
        this.f5726e = abstractC1978n;
    }

    public Abstractn m8000d() {
        return this.f5724a;
    }

    public Abstractn m8001g() {
        return this.f5724a;
    }

    public String m8002i() {
        return this.f5725d;
    }

    public Abstractn m8003j() {
        return this.f5726e;
    }

    public String toString() {
        return "BinaryOperatorExpression{" + this.f5724a.toString() + ' ' + this.f5725d + ' ' + this.f5726e.toString() + "}";
    }
}
