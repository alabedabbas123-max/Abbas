package org.c.a.a.b.d.b;

import org.c.a.a.b.d.e.ClassI;
import org.c.a.a.b.d.e.ClassK;

public class ai extends ClassK {

    protected Interfacef f5709a;

    public ai(int i, ClassI c2049i, String str, Interfacef interfaceC1970f) {
        super(i, ClassK.f5859i, c2049i, str);
        this.f5709a = interfaceC1970f;
    }

    public void m7979a(Interfacef interfaceC1970f) {
        this.f5709a = interfaceC1970f;
    }

    @Override
    public void mo7957a(Interfaceo interfaceC1979o) {
        interfaceC1979o.mo7794a(this);
    }

    @Override
    public int mo7954b() {
        return 1;
    }

    public Interfacef m7980d() {
        return this.f5709a;
    }

    public String toString() {
        return "SuperConstructorInvocationExpression{call super(" + this.f5735e + ")}";
    }
}
