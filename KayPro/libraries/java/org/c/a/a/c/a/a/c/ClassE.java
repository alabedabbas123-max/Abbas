package org.c.a.a.c.a.a.c;

import java.util.Iterator;
import java.util.List;
import org.c.a.a.b.d.a.Abstracta;
import org.c.a.a.b.d.a.ClassT;
import org.c.a.a.b.d.a.ClassU;
import org.c.a.a.d.ClassC;

class ClassE extends Abstracta {

    protected ClassC f6134a;

    private ClassE() {
        this.f6134a = new ClassC();
    }

    ClassE(ClassE c2150e) {
        this();
    }

    public List m8520a() {
        return this.f6134a;
    }

    @Override
    public void mo7780a(ClassT c1944t) {
        this.f6134a.add(c1944t.mo7939i());
    }

    @Override
    public void mo7781a(ClassU c1945u) {
        Iterator it = c1945u.iterator();
        while (it.hasNext()) {
            ((ClassT) it.next()).mo7869a(this);
        }
    }
}
