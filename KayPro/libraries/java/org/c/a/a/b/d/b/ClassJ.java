package org.c.a.a.b.d.b;

import org.c.a.a.b.d.e.ClassI;
import org.c.a.a.b.d.e.ClassK;

public class ClassJ extends ClassK {

    protected Interfacef f5733a;

    public ClassJ(int i, ClassI c2049i, String str, Interfacef interfaceC1970f) {
        super(i, ClassK.f5859i, c2049i, str);
        this.f5733a = interfaceC1970f;
    }

    public void m8009a(Interfacef interfaceC1970f) {
        this.f5733a = interfaceC1970f;
    }

    @Override
    public void mo7957a(Interfaceo interfaceC1979o) {
        interfaceC1979o.mo7804a(this);
    }

    @Override
    public int mo7954b() {
        return 1;
    }

    public Interfacef m8010d() {
        return this.f5733a;
    }

    public String toString() {
        return "ConstructorInvocationExpression{call this(" + this.f5735e + ")}";
    }
}
