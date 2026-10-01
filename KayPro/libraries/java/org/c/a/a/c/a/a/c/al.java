package org.c.a.a.c.a.a.c;

import org.c.a.a.b.d.b.Abstractn;
import org.c.a.a.b.d.b.ClassG;
import org.c.a.a.b.d.d.ac;
import org.c.a.a.b.d.d.ClassH;
import org.c.a.a.b.d.d.ClassU;
import org.c.a.a.b.d.d.Interfacer;
import org.c.a.a.c.a.a.a.b.b.ClassB;
import org.c.a.a.c.a.a.a.b.c.ClassD;
import org.c.a.a.c.a.a.a.c.Abstracta;

public class al {

    static final boolean f6115a;

    static {
        f6115a = !al.class.desiredAssertionStatus();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009d  */
    public static Interfacer m8462a(ClassO c2160o, ClassU c2035u, ClassU c2035u2) {
        Abstracta abstractC2115aM8306g;
        ClassG c1971g;
        Abstractn abstractC1978nM8313d = ((ClassD) c2035u.m8845e()).m8313d();
        Class<?> cls = abstractC1978nM8313d.getClass();
        if (cls == ClassB.class) {
            if (c2035u.isEmpty()) {
                abstractC2115aM8306g = null;
            } else {
                Interfacer interfaceC2032r = (Interfacer) c2035u.m8845e();
                if (interfaceC2032r.getClass() == ClassH.class) {
                    Abstractn abstractC1978nM8093b = ((ClassH) interfaceC2032r).m8093b();
                    if (abstractC1978nM8093b.getClass() == ClassG.class && (c1971g = (ClassG) abstractC1978nM8093b) != null && c1971g.m8000d().getClass() == ClassB.class) {
                        ClassB c2107b = (ClassB) abstractC1978nM8313d;
                        ClassB c2107b2 = (ClassB) c1971g.m8001g();
                        if (!f6115a && c2107b2.m8306g() != c2107b.m8306g()) {
                            throw new AssertionError();
                        }
                        abstractC1978nM8313d = c1971g.m8003j();
                        abstractC2115aM8306g = c2107b2.m8306g();
                    } else {
                        abstractC2115aM8306g = null;
                    }
                } else {
                    abstractC2115aM8306g = null;
                }
            }
        } else if (cls == ClassG.class) {
            ClassG c1971g2 = (ClassG) abstractC1978nM8313d;
            if (c1971g2.m8000d().getClass() == ClassB.class) {
                ClassB c2107b3 = (ClassB) c1971g2.m8001g();
                Abstractn abstractC1978nM8003j = c1971g2.m8003j();
                abstractC2115aM8306g = c2107b3.m8306g();
                abstractC1978nM8313d = abstractC1978nM8003j;
            } else {
                abstractC2115aM8306g = null;
            }
        } else {
            abstractC2115aM8306g = null;
        }
        new am(abstractC2115aM8306g).mo7855a(c2035u2);
        c2160o.m8599a(abstractC2115aM8306g);
        return new ac(abstractC1978nM8313d, c2035u2);
    }
}
