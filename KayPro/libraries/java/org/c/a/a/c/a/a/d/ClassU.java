package org.c.a.a.c.a.a.d;

import org.c.a.a.b.d.Abstracta;
import org.c.a.a.b.d.a.ClassI;
import org.c.a.a.b.d.b.Abstractn;
import org.c.a.a.b.d.b.ClassG;
import org.c.a.a.b.d.d.ClassH;
import org.c.a.a.b.d.d.ClassP;
import org.c.a.a.b.d.d.ClassU;
import org.c.a.a.b.d.d.Interfacer;
import org.c.a.a.c.a.a.a.b.b.ClassB;
import org.c.a.a.c.a.a.c.ClassO;

public class ClassU extends Abstracta {

    protected ClassO f6245a;

    public ClassU(ClassO c2160o) {
        this.f6245a = c2160o;
    }

    @Override
    public void mo7770a(ClassI c1933i) {
    }

    @Override
    public void mo7855a(ClassU c2035u) {
        if (c2035u.size() > 1) {
            Interfacer interfaceC2032r = (Interfacer) c2035u.m8844d();
            if (interfaceC2032r.getClass() == ClassP.class) {
                ClassP c2030p = (ClassP) interfaceC2032r;
                if (c2030p.m8120d().getClass() == ClassB.class) {
                    ClassB c2107b = (ClassB) c2030p.m8120d();
                    Interfacer interfaceC2032r2 = (Interfacer) c2035u.get(c2035u.size() - 2);
                    if (interfaceC2032r2.getClass() == ClassH.class) {
                        ClassH c2022h = (ClassH) interfaceC2032r2;
                        if (c2022h.m8093b().getClass() == ClassG.class) {
                            ClassG c1971g = (ClassG) c2022h.m8093b();
                            Abstractn abstractC1978nM8000d = c1971g.m8000d();
                            if (abstractC1978nM8000d.getClass() == ClassB.class && c2107b.m8306g() == ((ClassB) abstractC1978nM8000d).m8306g() && c2107b.m8306g().m8339i().size() == 2) {
                                c2035u.remove(c2035u.size() - 2);
                                c2030p.m8118a(c1971g.m8003j());
                                int iMo7970e = c1971g.m8003j().mo7970e();
                                if (c2030p.m8119b() > iMo7970e) {
                                    c2030p.m8117a(iMo7970e);
                                }
                                this.f6245a.m8599a(c2107b.m8306g());
                            }
                        }
                    }
                }
            }
        }
        super.mo7855a(c2035u);
    }
}
