package org.c.a.a.b.d.d;

public class ClassF extends Abstracts {

    public static final ClassF f5794a;

    static final boolean f5795c;

    protected String f5796b;

    static {
        f5795c = !ClassF.class.desiredAssertionStatus();
        f5794a = new ClassF();
    }

    protected ClassF() {
        this.f5796b = null;
    }

    public ClassF(String str) {
        if (!f5795c && str == null) {
            throw new AssertionError();
        }
        this.f5796b = str;
    }

    @Override
    public void mo8055a(Interfacet interfaceC2034t) {
        interfaceC2034t.mo7843a(this);
    }

    public String m8088b() {
        return this.f5796b;
    }
}
