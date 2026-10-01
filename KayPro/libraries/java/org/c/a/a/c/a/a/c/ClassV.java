package org.c.a.a.c.a.a.c;

import java.util.Collections;
import java.util.ListIterator;
import org.c.a.a.b.d.a.ClassC;
import org.c.a.a.b.d.a.ClassP;
import org.c.a.a.b.d.a.Interfaceaj;
import org.c.a.a.b.d.b.Abstractn;
import org.c.a.a.b.d.b.aa;
import org.c.a.a.b.d.b.ac;
import org.c.a.a.b.d.b.ad;
import org.c.a.a.b.d.b.ClassE;
import org.c.a.a.b.d.b.ClassG;
import org.c.a.a.b.d.b.ClassT;
import org.c.a.a.b.d.d.ClassH;
import org.c.a.a.b.d.d.ClassU;
import org.c.a.a.b.d.d.Interfacer;
import org.c.a.a.b.d.e.ClassK;
import org.c.a.a.b.d.e.Interfacel;

public class ClassV {

    protected static final ClassC f6160a = new ClassC(ClassK.f5859i);

    protected static ClassC m8621a(ListIterator listIterator, aa c1953aa) {
        Interfacer interfaceC2032r = (Interfacer) listIterator.previous();
        listIterator.remove();
        Interfacel interfaceC2052lF = c1953aa.mo7963f();
        ClassG c1971g = (ClassG) ((ClassH) interfaceC2032r).m8093b();
        ClassC c1927c = new ClassC(interfaceC2052lF.mo8143a(interfaceC2052lF.mo8145d() - 1));
        int iM8028d = ((ClassT) ((ClassE) c1971g.m8000d()).m7996g()).m8028d();
        c1927c.add(new ClassP(c1971g.m8003j()));
        int i = iM8028d;
        while (listIterator.hasPrevious()) {
            Interfacer interfaceC2032r2 = (Interfacer) listIterator.previous();
            if (interfaceC2032r2.getClass() == ClassH.class) {
                ClassH c2022h = (ClassH) interfaceC2032r2;
                if (c2022h.m8093b().getClass() == ClassG.class) {
                    ClassG c1971g2 = (ClassG) c2022h.m8093b();
                    if (c1971g2.m8000d().getClass() == ClassE.class) {
                        ClassE c1969e = (ClassE) c1971g2.m8000d();
                        if (c1969e.m7996g().getClass() == ClassT.class) {
                            if (c1969e.m7995d() == c1953aa) {
                                int iM8028d2 = ((ClassT) c1969e.m7996g()).m8028d();
                                c1927c.add(new ClassP(c1971g2.m8003j()));
                                listIterator.remove();
                                i = iM8028d2;
                            } else if (c1969e.m7995d().getClass() == aa.class) {
                                Interfaceaj interfaceC1925aj = (Interfaceaj) c1927c.m8844d();
                                if (interfaceC1925aj.getClass() == ClassP.class) {
                                    Abstractn abstractC1978nM7920a = ((ClassP) interfaceC1925aj).m7920a();
                                    if (abstractC1978nM7920a.getClass() == aa.class && c1969e.m7995d() == abstractC1978nM7920a) {
                                        c1927c.m8845e();
                                        listIterator.next();
                                        c1927c.add(m8621a(listIterator, (aa) abstractC1978nM7920a));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            listIterator.next();
        }
        ListIterator listIterator2 = c1927c.listIterator();
        while (listIterator2.hasNext()) {
            Interfaceaj interfaceC1925aj2 = (Interfaceaj) listIterator2.next();
            if (interfaceC1925aj2.getClass() == ClassP.class) {
                Abstractn abstractC1978nM7920a2 = ((ClassP) interfaceC1925aj2).m7920a();
                if (abstractC1978nM7920a2.getClass() == aa.class) {
                    aa c1953aa2 = (aa) abstractC1978nM7920a2;
                    if (c1953aa2.m7958d().getClass() == ClassT.class && ((ClassT) c1953aa2.m7958d()).m8028d() == 0) {
                        Interfacel interfaceC2052lF2 = c1953aa2.mo7963f();
                        if (interfaceC2052lF.mo8145d() == interfaceC2052lF2.mo8145d() + 1 && interfaceC2052lF.mo8146e().length() == interfaceC2052lF2.mo8146e().length() + 1 && interfaceC2052lF.mo8146e().endsWith(interfaceC2052lF2.mo8146e())) {
                            listIterator2.set(f6160a);
                        }
                    }
                }
            }
        }
        if (i > 0) {
            Interfacel interfaceC2052lMo8143a = interfaceC2052lF.mo8143a(interfaceC2052lF.mo8145d() - 1);
            ClassP c1940p = (interfaceC2052lMo8143a.mo8145d() == 0 && interfaceC2052lMo8143a.mo8160m_()) ? new ClassP(new ClassT(interfaceC2052lMo8143a, 0)) : new ClassP(new ad(interfaceC2052lMo8143a));
            while (true) {
                int i2 = i - 1;
                if (i <= 0) {
                    break;
                }
                c1927c.add(c1940p);
                i = i2;
            }
        }
        Collections.reverse(c1927c);
        return c1927c;
    }

    public static Abstractn m8622a(ClassU c2035u, aa c1953aa) {
        if (c2035u.isEmpty()) {
            return c1953aa;
        }
        Interfacer interfaceC2032r = (Interfacer) c2035u.m8844d();
        if (interfaceC2032r.getClass() != ClassH.class) {
            return c1953aa;
        }
        ClassH c2022h = (ClassH) interfaceC2032r;
        if (c2022h.m8093b().getClass() != ClassG.class) {
            return c1953aa;
        }
        ClassG c1971g = (ClassG) c2022h.m8093b();
        if (c1971g.m8000d().getClass() != ClassE.class) {
            return c1953aa;
        }
        ClassE c1969e = (ClassE) c1971g.m8000d();
        return (c1969e.m7995d() == c1953aa && c1969e.m7996g().getClass() == ClassT.class) ? new ac(c1953aa.mo7970e(), c1953aa.mo7963f(), m8621a(c2035u.listIterator(c2035u.size()), c1953aa)) : c1953aa;
    }
}
