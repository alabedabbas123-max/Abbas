package org.c.a.a.b.d.d;

import org.c.a.a.b.d.b.Abstractn;

public class ClassP extends Abstracts {

    static final boolean f5815c;

    protected int f5816a;

    protected Abstractn f5817b;

    static {
        f5815c = !ClassP.class.desiredAssertionStatus();
    }

    public ClassP(int i, Abstractn abstractC1978n) {
        this.f5816a = i;
        this.f5817b = abstractC1978n;
        if (!f5815c && abstractC1978n == null) {
            throw new AssertionError();
        }
    }

    public ClassP(Abstractn abstractC1978n) {
        this(abstractC1978n.mo7970e(), abstractC1978n);
    }

    public void m8117a(int i) {
        this.f5816a = i;
    }

    public void m8118a(Abstractn abstractC1978n) {
        if (!f5815c && abstractC1978n == null) {
            throw new AssertionError();
        }
        this.f5817b = abstractC1978n;
    }

    @Override
    public void mo8055a(Interfacet interfaceC2034t) {
        interfaceC2034t.mo7853a(this);
    }

    public int m8119b() {
        return this.f5816a;
    }

    public Abstractn m8120d() {
        return this.f5817b;
    }

    public String toString() {
        return "ReturnExpressionStatement{return " + this.f5817b + "}";
    }
}
