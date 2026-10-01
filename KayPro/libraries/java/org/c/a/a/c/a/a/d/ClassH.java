package org.c.a.a.c.a.a.d;

import java.util.Collections;
import org.c.a.a.b.d.Abstracta;
import org.c.a.a.b.d.a.ac;
import org.c.a.a.b.d.a.ah;
import org.c.a.a.b.d.a.ClassI;
import org.c.a.a.b.d.a.ClassK;
import org.c.a.a.b.d.a.ClassQ;
import org.c.a.a.b.d.a.ClassR;
import org.c.a.a.b.d.a.ClassU;
import org.c.a.a.b.d.b.ab;
import org.c.a.a.b.d.b.ClassP;
import org.c.a.a.b.d.b.ClassT;
import org.c.a.a.b.d.b.Interfacef;
import org.c.a.a.b.d.d.ClassU;
import org.c.a.a.c.a.a.a.b.a.ClassB;
import org.c.a.a.c.a.a.a.b.a.ClassD;
import org.c.a.a.c.a.a.a.b.a.ClassG;
import org.c.a.a.c.a.a.a.b.a.ClassH;
import org.c.a.a.c.a.a.a.b.a.ClassL;
import org.c.a.a.d.ClassC;

public class ClassH extends Abstracta {

    protected ClassC f6209a = new ClassC();

    protected int f6210b;

    protected int f6211c;

    protected Interfacef f6212d;

    public ClassC m8656a() {
        if (!this.f6209a.isEmpty()) {
            Collections.sort(this.f6209a, ClassI.f6213a);
        }
        return new ClassC(this.f6209a);
    }

    @Override
    public void mo7764a(ac c1918ac) {
        if ((c1918ac.m7870a() & 9) != 0) {
            if (c1918ac.m7872d().equals("values") || c1918ac.m7872d().equals("valueOf")) {
                ClassL c2104l = (ClassL) c1918ac;
                c2104l.mo8287a(c2104l.m7870a() | 4096);
            }
        }
    }

    @Override
    public void mo7766a(ah c1923ah) {
    }

    @Override
    public void mo7770a(ClassI c1933i) {
        ClassB c2094b = (ClassB) c1933i;
        this.f6209a.clear();
        m7863e(c2094b.m8279e());
        m7863e(c2094b.m8280f());
    }

    @Override
    public void mo7772a(ClassK c1935k) {
        ClassD c2096d = (ClassD) c1935k;
        if (c2096d.m7908g().getClass() != ClassU.class) {
            c2096d.mo8287a(4096);
            return;
        }
        ClassU c2035u = (ClassU) c2096d.m7908g();
        if (c2035u.size() == 1) {
            c2096d.mo8287a(4096);
            return;
        }
        ((ClassU) c2096d.m7910p_()).subList(0, 2).clear();
        c2035u.remove(0);
        c2096d.mo8287a(0);
    }

    @Override
    public void mo7777a(ClassQ c1941q) {
        if ((c1941q.m7922a() & 16384) != 0) {
            ClassH c2100h = (ClassH) c1941q;
            c2100h.m7925d().mo7869a(this);
            c2100h.m8301a(c2100h.m7922a() | 4096);
        }
    }

    @Override
    public void mo7778a(ClassR c1942r) {
        m7773a(c1942r.m7931g());
        this.f6209a.add(new ClassG(this.f6210b, c1942r.m7929e(), this.f6211c, this.f6212d));
    }

    @Override
    public void mo7787a(ab c1954ab) {
        ClassP c1980p = (ClassP) c1954ab.m7966j();
        ClassT c1984t = (ClassT) c1980p.get(1);
        this.f6210b = c1954ab.mo7970e();
        this.f6211c = c1984t.m8028d();
        if (c1980p.size() == 2) {
            this.f6212d = null;
        } else {
            c1980p.subList(0, 2).clear();
            this.f6212d = c1980p;
        }
    }
}
