package org.c.a.a.c.a.a.d;

import java.util.Iterator;
import org.c.a.a.b.d.Abstracta;
import org.c.a.a.b.d.a.ac;
import org.c.a.a.b.d.a.ah;
import org.c.a.a.b.d.a.ClassB;
import org.c.a.a.b.d.a.ClassI;
import org.c.a.a.b.d.a.ClassJ;
import org.c.a.a.b.d.a.ClassK;
import org.c.a.a.b.d.a.ClassN;
import org.c.a.a.b.d.a.ClassP;
import org.c.a.a.b.d.a.ClassQ;
import org.c.a.a.b.d.a.ClassR;
import org.c.a.a.b.d.a.ClassV;
import org.c.a.a.b.d.a.Interfacel;
import org.c.a.a.b.d.b.Abstractn;
import org.c.a.a.b.d.b.ClassG;
import org.c.a.a.b.d.b.ClassQ;
import org.c.a.a.b.d.d.ClassH;
import org.c.a.a.b.d.d.Interfaceb;
import org.c.a.a.b.d.d.Interfacer;
import org.c.a.a.b.d.e.ClassK;
import org.c.a.a.c.a.a.a.b.a.ClassB;
import org.c.a.a.c.a.a.a.b.a.ClassH;
import org.c.a.a.c.a.a.a.b.a.ClassM;
import org.c.a.a.d.ClassC;

public class ClassR extends Abstracta {

    protected String f6241b;

    protected ClassM f6243d;

    protected ClassX f6240a = new ClassX();

    protected ClassC f6242c = new ClassC();

    public void m8666a(String str) {
        this.f6241b = str;
    }

    @Override
    public void mo7764a(ac c1918ac) {
    }

    @Override
    public void mo7766a(ah c1923ah) {
        ClassC c2247cL_;
        ClassR c1942r;
        this.f6243d = (ClassM) c1923ah;
        if (!this.f6243d.m7891g().mo7867j_() || (c2247cL_ = this.f6243d.m7891g().mo7868l_()) == null || c2247cL_.isEmpty()) {
            return;
        }
        Interfacer interfaceC2032r = (Interfacer) c2247cL_.m8846h();
        if (interfaceC2032r.getClass() == ClassH.class) {
            ClassH c2022h = (ClassH) interfaceC2032r;
            if (c2022h.m8093b().getClass() == ClassG.class) {
                ClassG c1971g = (ClassG) c2022h.m8093b();
                if (c1971g.m8000d().getClass() == ClassQ.class) {
                    ClassQ c1981q = (ClassQ) c1971g.m8000d();
                    if (c1981q.mo7963f() == ClassK.f5851a && c1981q.m8020g().equals(this.f6241b) && c1981q.m8021i().equals("$assertionsDisabled")) {
                        c2247cL_.remove(0);
                    }
                }
            }
        }
        Iterator it = c2247cL_.iterator();
        Iterator it2 = this.f6242c.iterator();
        while (it.hasNext()) {
            Interfacer interfaceC2032r2 = (Interfacer) it.next();
            if (interfaceC2032r2.getClass() != ClassH.class) {
                break;
            }
            ClassH c2022h2 = (ClassH) interfaceC2032r2;
            if (c2022h2.m8093b().getClass() != ClassG.class) {
                break;
            }
            ClassG c1971g2 = (ClassG) c2022h2.m8093b();
            if (c1971g2.m8000d().getClass() != ClassQ.class) {
                break;
            }
            ClassQ c1981q2 = (ClassQ) c1971g2.m8000d();
            if (!c1981q2.m8020g().equals(this.f6241b)) {
                break;
            }
            while (true) {
                if (!it2.hasNext()) {
                    c1942r = null;
                    break;
                }
                c1942r = (ClassR) it2.next();
                ClassQ c1941qM7928d = c1942r.m7928d();
                if ((c1941qM7928d.m7922a() & 8) != 0 && c1942r.m7929e().equals(c1981q2.m8021i()) && c1941qM7928d.m7924c().mo8146e().equals(c1981q2.m8022j())) {
                    break;
                }
            }
            if (c1942r == null) {
                break;
            }
            Abstractn abstractC1978nM8003j = c1971g2.m8003j();
            c1942r.m7926a(new ClassP(abstractC1978nM8003j));
            ((ClassH) c1942r.m7928d()).m8303b(abstractC1978nM8003j.mo7970e());
            it.remove();
        }
        if (c2247cL_.isEmpty()) {
            this.f6243d.mo8289a((Interfaceb) null);
            this.f6243d.m8305b(0);
            return;
        }
        this.f6240a.m8675a();
        this.f6243d.m7891g().mo8055a(this.f6240a);
        int iM8676b = this.f6240a.m8676b();
        ClassM c2105m = this.f6243d;
        if (iM8676b == -1) {
            iM8676b = 0;
        }
        c2105m.m8305b(iM8676b);
    }

    @Override
    public void mo7768a(ClassB c1926b) {
        m7773a((Interfacel) c1926b.m7897b());
    }

    @Override
    public void mo7770a(ClassI c1933i) {
        ClassB c2094b = (ClassB) c1933i;
        this.f6242c.clear();
        this.f6243d = null;
        m7863e(c2094b.m8279e());
        if (!this.f6242c.isEmpty()) {
            m7863e(c2094b.m8280f());
        }
        if (this.f6243d == null || this.f6243d.m7891g() != null) {
            return;
        }
        c2094b.m8280f().remove(this.f6243d);
    }

    @Override
    public void mo7771a(ClassJ c1934j) {
        this.f6241b = c1934j.m7894l();
        m7773a((Interfacel) c1934j.m7941e());
    }

    @Override
    public void mo7772a(ClassK c1935k) {
    }

    @Override
    public void mo7774a(ClassN c1938n) {
        this.f6241b = c1938n.m7894l();
        m7773a((Interfacel) c1938n.m7913c());
    }

    @Override
    public void mo7778a(ClassR c1942r) {
        this.f6242c.add(c1942r);
    }

    @Override
    public void mo7782a(ClassV c1946v) {
        this.f6241b = c1946v.m7894l();
        m7773a((Interfacel) c1946v.m7941e());
    }
}
