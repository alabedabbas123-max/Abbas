package org.c.a.a.c.c.a.b;

import java.util.Iterator;
import org.c.a.a.b.d.Abstracta;
import org.c.a.a.b.d.c.ClassA;
import org.c.a.a.b.d.c.ClassB;
import org.c.a.a.b.d.c.ClassC;
import org.c.a.a.c.c.a.a.ClassB;

public class ClassB extends Abstracta {

    final ClassA f6282a;

    protected ClassB(ClassA c2213a) {
        this.f6282a = c2213a;
    }

    @Override
    public void mo7820a(ClassA c1991a) {
        this.f6282a.m8768b(c1991a);
    }

    @Override
    public void mo7821a(ClassB c1992b) {
        this.f6282a.m8768b(c1992b);
    }

    @Override
    public void mo7822a(ClassC c1993c) {
        if (c1993c.size() > 0) {
            Iterator it = c1993c.iterator();
            ((ClassB) it.next()).mo8042a(this);
            while (it.hasNext()) {
                this.f6282a.f6292D.m8776a(this.f6282a.f6348aA);
                ClassB.m8744k(this.f6282a.f6292D);
                this.f6282a.f6348aA = new ClassK(this.f6282a);
                ((ClassB) it.next()).mo8042a(this);
            }
        }
    }
}
