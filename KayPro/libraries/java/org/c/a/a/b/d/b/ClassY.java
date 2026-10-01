package org.c.a.a.b.d.b;

import org.c.a.a.b.d.e.Interfacel;

public class ClassY extends ClassZ {

    protected Interfacef f5754a;

    public ClassY(int i, Interfacel interfaceC2052l, Abstractn abstractC1978n, String str, String str2, String str3) {
        super(i, interfaceC2052l, abstractC1978n, str, str2, str3);
    }

    public ClassY(int i, Interfacel interfaceC2052l, Abstractn abstractC1978n, String str, String str2, String str3, Interfacef interfaceC1970f) {
        super(i, interfaceC2052l, abstractC1978n, str, str2, str3);
        this.f5754a = interfaceC1970f;
    }

    public void m8035a(Interfacef interfaceC1970f) {
        this.f5754a = interfaceC1970f;
    }

    @Override
    public void mo7957a(Interfaceo interfaceC1979o) {
        interfaceC1979o.mo7817a(this);
    }

    @Override
    public int mo7954b() {
        return 1;
    }

    public Interfacef m8036d() {
        return this.f5754a;
    }

    public String toString() {
        return "MethodInvocationExpression{call " + this.f5755d + " . " + this.f5757f + "(" + this.f5758g + ")}";
    }
}
