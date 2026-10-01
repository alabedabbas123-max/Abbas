package org.c.a.a.c.a.a.d;

import java.util.Iterator;
import java.util.ListIterator;
import org.c.a.a.b.d.Abstracta;
import org.c.a.a.b.d.a.ac;
import org.c.a.a.b.d.a.ah;
import org.c.a.a.b.d.a.ClassK;
import org.c.a.a.b.d.d.ah;
import org.c.a.a.b.d.d.ClassU;
import org.c.a.a.b.d.d.Interfaceb;
import org.c.a.a.b.d.d.Interfacer;
import org.c.a.a.c.a.a.a.b.a.ClassC;
import org.c.a.a.c.a.a.a.b.a.ClassD;
import org.c.a.a.c.a.a.a.b.a.ClassL;
import org.c.a.a.c.a.a.a.b.a.ClassM;

public class ClassM extends Abstracta {

    protected ClassX f6225a = new ClassX();

    protected int f6226b = 0;

    final ClassL f6227c;

    protected ClassM(ClassL c2190l) {
        this.f6227c = c2190l;
    }

    @Override
    public void mo7764a(ac c1918ac) {
        ClassL c2104l = (ClassL) c1918ac;
        c2104l.mo8289a(m8659b(c2104l.m7874g()));
    }

    @Override
    public void mo7766a(ah c1923ah) {
        ClassM c2105m = (ClassM) c1923ah;
        c2105m.mo8289a(m8659b(c2105m.m7891g()));
    }

    @Override
    public void mo7772a(ClassK c1935k) {
        ClassD c2096d = (ClassD) c1935k;
        c2096d.mo8289a(m8659b(c2096d.m7908g()));
    }

    @Override
    public void mo7855a(ClassU c2035u) {
        if (this.f6227c.f6221c.isEmpty() || c2035u.isEmpty()) {
            return;
        }
        ListIterator listIterator = c2035u.listIterator();
        Iterator it = this.f6227c.f6221c.iterator();
        ClassC c2095c = (ClassC) it.next();
        while (true) {
            c2095c = c2095c;
            if (!listIterator.hasNext()) {
                return;
            }
            Interfacer interfaceC2032r = (Interfacer) listIterator.next();
            this.f6225a.m8675a();
            interfaceC2032r.mo8055a(this.f6225a);
            if (this.f6225a.m8676b() != -1) {
                this.f6226b = this.f6225a.m8676b();
            }
            while (c2095c.mo8269q_() <= this.f6226b) {
                listIterator.previous();
                listIterator.add(new ah(c2095c));
                listIterator.next();
                it.remove();
                if (!it.hasNext()) {
                    return;
                } else {
                    c2095c = (ClassC) it.next();
                }
            }
        }
    }

    protected Interfaceb m8659b(Interfaceb interfaceC2016b) {
        if (this.f6227c.f6221c.isEmpty()) {
            return interfaceC2016b;
        }
        if (interfaceC2016b.getClass() == ClassU.class) {
            interfaceC2016b.mo8055a(this);
            return interfaceC2016b;
        }
        ClassC c2095c = (ClassC) this.f6227c.f6221c.get(0);
        this.f6225a.m8675a();
        interfaceC2016b.mo8055a(this.f6225a);
        if (this.f6225a.m8676b() != -1) {
            this.f6226b = this.f6225a.m8676b();
        }
        if (c2095c.mo8269q_() > this.f6226b) {
            interfaceC2016b.mo8055a(this);
            return interfaceC2016b;
        }
        ClassU c2035u = new ClassU();
        Iterator it = this.f6227c.f6221c.iterator();
        c2035u.add(new ah(c2095c));
        it.next();
        it.remove();
        while (it.hasNext()) {
            ClassC c2095c2 = (ClassC) it.next();
            if (c2095c2.mo8269q_() > this.f6226b) {
                break;
            }
            c2035u.add(new ah(c2095c2));
            it.remove();
        }
        c2035u.add(interfaceC2016b);
        return c2035u;
    }
}
