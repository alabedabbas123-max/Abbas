package org.c.a.a.b.d.d;

import org.c.a.a.b.d.e.ClassI;
import org.c.a.a.d.ClassC;

public class af extends Abstracts {

    protected int f5778a;

    protected ClassI f5779b;

    protected ClassC f5780c = null;

    protected String f5781d;

    protected Interfaceb f5782e;

    public af(int i, ClassI c2049i, String str, Interfaceb interfaceC2016b) {
        this.f5778a = i;
        this.f5779b = c2049i;
        this.f5781d = str;
        this.f5782e = interfaceC2016b;
    }

    @Override
    public void mo8055a(Interfacet interfaceC2034t) {
        interfaceC2034t.mo7835a(this);
    }

    public void m8071a(ClassI c2049i) {
        if (this.f5780c == null) {
            this.f5780c = new ClassC();
        }
        this.f5780c.add(c2049i);
    }

    public int m8072b() {
        return this.f5778a;
    }

    public ClassI m8073d() {
        return this.f5779b;
    }

    public ClassC m8074e() {
        return this.f5780c;
    }

    public String mo8075f() {
        return this.f5781d;
    }

    public Interfaceb m8076g() {
        return this.f5782e;
    }
}
