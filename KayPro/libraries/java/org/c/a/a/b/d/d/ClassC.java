package org.c.a.a.b.d.d;

public class ClassC extends Abstracts {

    public static final ClassC f5789a;

    static final boolean f5790c;

    protected String f5791b;

    static {
        f5790c = !ClassC.class.desiredAssertionStatus();
        f5789a = new ClassC();
    }

    protected ClassC() {
        this.f5791b = null;
    }

    public ClassC(String str) {
        if (!f5790c && str == null) {
            throw new AssertionError();
        }
        this.f5791b = str;
    }

    @Override
    public void mo8055a(Interfacet interfaceC2034t) {
        interfaceC2034t.mo7840a(this);
    }

    public String m8085b() {
        return this.f5791b;
    }
}
