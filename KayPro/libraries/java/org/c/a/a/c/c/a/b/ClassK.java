package org.c.a.a.c.c.a.b;

import org.c.a.a.b.d.b.Abstractn;
import org.c.a.a.b.f.ClassH;
import org.c.a.a.b.f.Interfacep;
import org.c.a.a.d.ClassC;

public class ClassK extends ClassC {

    static final boolean f6356c;

    protected int f6357a = 0;

    final ClassJ f6358b;

    static {
        f6356c = !ClassJ.class.desiredAssertionStatus();
    }

    public ClassK(ClassJ c2222j) {
        this.f6358b = c2222j;
    }

    public void m8792a(int i) {
        if (i == 0 || i < this.f6358b.f6349aB) {
            return;
        }
        super.add(new ClassH(i));
        ClassJ c2222j = this.f6358b;
        this.f6357a = i;
        c2222j.f6349aB = i;
    }

    public void m8793a(Abstractn abstractC1978n) {
        m8792a(abstractC1978n.mo7970e());
    }

    @Override
    public boolean add(Interfacep interfaceC2082p) {
        if (f6356c || !(interfaceC2082p instanceof ClassH)) {
            return super.add(interfaceC2082p);
        }
        throw new AssertionError();
    }

    public int m8795b() {
        return this.f6357a;
    }
}
