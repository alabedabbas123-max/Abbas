package org.c.a.a.b.d.b;

import org.c.a.a.b.d.e.Interfacel;

public class ClassE extends Abstractc {

    static final boolean f5721e;

    protected Abstractn f5722a;

    protected Abstractn f5723d;

    static {
        f5721e = !ClassE.class.desiredAssertionStatus();
    }

    public ClassE(int i, Abstractn abstractC1978n, Abstractn abstractC1978n2) {
        super(i, m7992c(abstractC1978n));
        this.f5722a = abstractC1978n;
        this.f5723d = abstractC1978n2;
    }

    protected static Interfacel m7992c(Abstractn abstractC1978n) {
        Interfacel interfaceC2052lMo7963f = abstractC1978n.mo7963f();
        int iMo8145d = interfaceC2052lMo7963f.mo8145d();
        if (f5721e || iMo8145d > 0) {
            return interfaceC2052lMo7963f.mo8143a(iMo8145d > 0 ? iMo8145d - 1 : 0);
        }
        throw new AssertionError("createItemType : negative dimension");
    }

    public void m7993a(Abstractn abstractC1978n) {
        this.f5722a = abstractC1978n;
    }

    @Override
    public void mo7957a(Interfaceo interfaceC1979o) {
        interfaceC1979o.mo7799a(this);
    }

    @Override
    public int mo7954b() {
        return 1;
    }

    public void m7994b(Abstractn abstractC1978n) {
        this.f5723d = abstractC1978n;
    }

    public Abstractn m7995d() {
        return this.f5722a;
    }

    public Abstractn m7996g() {
        return this.f5723d;
    }

    public String toString() {
        return "ArrayExpression{" + this.f5722a + "[" + this.f5723d + "]}";
    }
}
