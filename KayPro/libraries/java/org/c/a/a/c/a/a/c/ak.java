package org.c.a.a.c.a.a.c;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import org.c.a.a.b.d.b.Abstractn;
import org.c.a.a.b.d.b.ah;
import org.c.a.a.b.d.b.ClassE;
import org.c.a.a.b.d.b.ClassG;
import org.c.a.a.b.d.b.ClassM;
import org.c.a.a.b.d.b.ClassQ;
import org.c.a.a.b.d.b.ClassT;
import org.c.a.a.b.d.b.ClassY;
import org.c.a.a.b.d.b.ClassZ;
import org.c.a.a.b.d.d.Abstractw;
import org.c.a.a.b.d.d.Abstractz;
import org.c.a.a.b.d.d.aa;
import org.c.a.a.b.d.d.ab;
import org.c.a.a.b.d.d.ClassH;
import org.c.a.a.b.d.d.ClassL;
import org.c.a.a.b.d.d.ClassU;
import org.c.a.a.b.d.d.ClassV;
import org.c.a.a.b.d.d.ClassY;
import org.c.a.a.b.d.d.Interfaceb;
import org.c.a.a.b.d.d.Interfacer;
import org.c.a.a.b.d.e.ClassI;
import org.c.a.a.c.a.a.a.b.a.ClassB;
import org.c.a.a.c.a.a.a.b.a.ClassC;
import org.c.a.a.c.a.a.a.b.a.Interfacee;
import org.c.a.a.c.a.a.a.b.b.ClassB;
import org.c.a.a.c.a.a.a.b.c.ClassF;
import org.c.a.a.c.a.a.a.c.Abstracta;
import org.c.a.a.d.ClassC;

public class ak {

    protected static final Integer f6113a;

    static final boolean f6114b;

    static {
        f6114b = !ak.class.desiredAssertionStatus();
        f6113a = -1;
    }

    protected static void m8459a(ClassV c2036v, ListIterator listIterator) {
        HashMap map = new HashMap();
        while (listIterator.hasNext()) {
            Interfacer interfaceC2032r = (Interfacer) listIterator.next();
            if (interfaceC2032r.getClass() != ClassF.class) {
                break;
            }
            Interfaceb interfaceC2016bD = ((ClassF) interfaceC2032r).m8068d();
            if (!interfaceC2016bD.mo7867j_()) {
                break;
            }
            Interfacer interfaceC2032r2 = (Interfacer) interfaceC2016bD.mo7868l_().m8846h();
            if (interfaceC2032r2.getClass() != ClassH.class) {
                break;
            }
            Abstractn abstractC1978nM8093b = ((ClassH) interfaceC2032r2).m8093b();
            if (abstractC1978nM8093b.getClass() != ClassG.class) {
                break;
            }
            ClassG c1971g = (ClassG) abstractC1978nM8093b;
            Abstractn abstractC1978nM8003j = c1971g.m8003j();
            if (abstractC1978nM8003j.getClass() != ClassT.class) {
                break;
            }
            Integer numValueOf = Integer.valueOf(((ClassT) abstractC1978nM8003j).m8028d());
            Abstractn abstractC1978nM8000d = c1971g.m8000d();
            if (abstractC1978nM8000d.getClass() != ClassE.class) {
                break;
            }
            Abstractn abstractC1978nM7996g = ((ClassE) abstractC1978nM8000d).m7996g();
            if (abstractC1978nM7996g.getClass() != ClassY.class) {
                break;
            }
            Abstractn abstractC1978nG = ((ClassY) abstractC1978nM7996g).m8038g();
            if (abstractC1978nG.getClass() != ClassQ.class) {
                break;
            } else {
                map.put(numValueOf, ((ClassQ) abstractC1978nG).m8021i());
            }
        }
        Abstractn abstractC1978nM8038g = ((ClassZ) ((ClassE) c2036v.m8123b()).m7996g()).m8038g();
        ClassI c2049i = (ClassI) abstractC1978nM8038g.mo7963f();
        for (Abstractw abstractC2037w : c2036v.m8124d()) {
            if (abstractC2037w.getClass() == aa.class) {
                aa c2007aa = (aa) abstractC2037w;
                if (c2007aa.m8058d() != ClassV.f5820a) {
                    ClassY c2039y = (ClassY) c2007aa.m8058d();
                    ClassT c1984t = (ClassT) c2039y.m8127b();
                    c2039y.m8126a(new ClassM(c1984t.mo7970e(), c2049i, (String) map.get(Integer.valueOf(c1984t.m8028d()))));
                }
            } else if (abstractC2037w.getClass() == ab.class) {
                for (Abstractz abstractC2040z : ((ab) abstractC2037w).m8059d()) {
                    if (abstractC2040z != ClassV.f5820a) {
                        ClassY c2039y2 = (ClassY) abstractC2040z;
                        ClassT c1984t2 = (ClassT) c2039y2.m8127b();
                        c2039y2.m8126a(new ClassM(c1984t2.mo7970e(), c2049i, (String) map.get(Integer.valueOf(c1984t2.m8028d()))));
                    }
                }
            }
        }
        c2036v.m8122a(abstractC1978nM8038g);
    }

    public static void m8460a(ClassB c2094b, ClassV c2036v) {
        ClassE c1969e = (ClassE) c2036v.m8123b();
        Class<?> cls = c1969e.m7995d().getClass();
        if (cls == ClassQ.class) {
            ClassQ c1981q = (ClassQ) c1969e.m7995d();
            if (c1981q.m8022j().equals("[I") && c1981q.m8021i().startsWith("$SwitchMap$")) {
                m8459a(c2036v, ((ClassC) ((Interfacee) ((ClassB) ((ClassC) c2094b.m8270a(c1981q.m8020g())).m7941e()).m8280f().get(0)).m8297g()).listIterator());
                return;
            }
            return;
        }
        if (cls == ClassY.class) {
            ClassY c1989y = (ClassY) c1969e.m7995d();
            String strJ = c1989y.m8040j();
            if (c1989y.m8041l().equals("()[I") && strJ.startsWith("$SWITCH_TABLE$")) {
                for (Interfacee interfaceC2097e : c2094b.m8280f()) {
                    if (interfaceC2097e.mo8294r_().m7685b().equals(strJ)) {
                        m8459a(c2036v, ((ClassC) interfaceC2097e.m8297g()).listIterator(3));
                        return;
                    }
                }
            }
        }
    }

    public static void m8461a(ClassO c2160o, ClassU c2035u, ClassV c2036v) {
        int size = c2035u.size();
        ClassV c2036v2 = (ClassV) c2035u.get(size - 2);
        if (c2036v2.m8123b().mo7970e() == c2036v.m8123b().mo7970e() && c2036v2.m8123b().getClass() == ClassY.class) {
            Abstractn abstractC1978nM8123b = c2036v2.m8123b();
            if (abstractC1978nM8123b.getClass() == ClassY.class) {
                Abstractn abstractC1978nG = ((ClassY) abstractC1978nM8123b).m8038g();
                if (abstractC1978nG.getClass() == ClassB.class) {
                    Abstracta abstractC2115aM8306g = ((ClassB) abstractC1978nG).m8306g();
                    Interfacer interfaceC2032r = (Interfacer) c2035u.get(size - 4);
                    if (interfaceC2032r.getClass() == ClassH.class) {
                        Abstractn abstractC1978nM8093b = ((ClassH) interfaceC2032r).m8093b();
                        if (abstractC1978nM8093b.getClass() == ClassG.class) {
                            Abstractn abstractC1978nM8000d = ((ClassG) abstractC1978nM8093b).m8000d();
                            if (abstractC1978nM8000d.getClass() == ClassB.class && abstractC2115aM8306g.equals(((ClassB) abstractC1978nM8000d).m8306g())) {
                                Interfacer interfaceC2032r2 = (Interfacer) c2035u.get(size - 3);
                                if (interfaceC2032r2.getClass() == ClassH.class) {
                                    Abstractn abstractC1978nM8093b2 = ((ClassH) interfaceC2032r2).m8093b();
                                    if (abstractC1978nM8093b2.getClass() == ClassG.class) {
                                        ClassG c1971g = (ClassG) abstractC1978nM8093b2;
                                        Abstractn abstractC1978nM8003j = c1971g.m8003j();
                                        if (abstractC1978nM8003j.getClass() == ClassT.class && f6113a.equals(Integer.valueOf(((ClassT) abstractC1978nM8003j).m8028d()))) {
                                            Abstractn abstractC1978nM8123b2 = c2036v.m8123b();
                                            if (abstractC1978nM8123b2.getClass() == ClassB.class) {
                                                Abstracta abstractC2115aM8306g2 = ((ClassB) abstractC1978nM8123b2).m8306g();
                                                if (abstractC2115aM8306g2.equals(((ClassB) c1971g.m8000d()).m8306g())) {
                                                    ClassY c1989y = (ClassY) c2036v2.m8123b();
                                                    if (c1989y.m8040j().equals("hashCode") && c1989y.m8041l().equals("()I")) {
                                                        HashMap map = new HashMap();
                                                        Iterator it = c2036v2.m8124d().iterator();
                                                        while (it.hasNext()) {
                                                            Interfaceb interfaceC2016bM8125b = ((Abstractw) it.next()).m8125b();
                                                            if (!f6114b && (interfaceC2016bM8125b == null || interfaceC2016bM8125b.getClass() != ClassU.class || ((ClassU) interfaceC2016bM8125b).isEmpty())) {
                                                                throw new AssertionError();
                                                            }
                                                            for (Interfacer interfaceC2032r3 : (ClassU) interfaceC2016bM8125b) {
                                                                if (interfaceC2032r3.getClass() != ClassL.class) {
                                                                    break;
                                                                }
                                                                ClassL c2026l = (ClassL) interfaceC2032r3;
                                                                Abstractn abstractC1978nM8110d = c2026l.m8110d();
                                                                if (abstractC1978nM8110d.getClass() != ClassY.class) {
                                                                    break;
                                                                }
                                                                Abstractn abstractC1978n = (Abstractn) ((ClassY) abstractC1978nM8110d).m8036d().mo7865h();
                                                                if (abstractC1978n.getClass() != ah.class) {
                                                                    break;
                                                                }
                                                                String strM7978d = ((ah) abstractC1978n).m7978d();
                                                                Interfacer interfaceC2032r4 = (Interfacer) c2026l.m8111e().mo7865h();
                                                                if (interfaceC2032r4.getClass() != ClassH.class) {
                                                                    break;
                                                                }
                                                                Abstractn abstractC1978nM8093b3 = ((ClassH) interfaceC2032r4).m8093b();
                                                                if (abstractC1978nM8093b3.getClass() != ClassG.class) {
                                                                    break;
                                                                }
                                                                Abstractn abstractC1978nM8003j2 = ((ClassG) abstractC1978nM8093b3).m8003j();
                                                                if (abstractC1978nM8003j2.getClass() != ClassT.class) {
                                                                    break;
                                                                } else {
                                                                    map.put(Integer.valueOf(((ClassT) abstractC1978nM8003j2).m8028d()), strM7978d);
                                                                }
                                                            }
                                                        }
                                                        for (Abstractw abstractC2037w : c2036v.m8124d()) {
                                                            if (abstractC2037w.getClass() == aa.class) {
                                                                aa c2007aa = (aa) abstractC2037w;
                                                                if (c2007aa.m8058d() != ClassV.f5820a) {
                                                                    ClassY c2039y = (ClassY) c2007aa.m8058d();
                                                                    ClassT c1984t = (ClassT) c2039y.m8127b();
                                                                    c2039y.m8126a(new ah(c1984t.mo7970e(), (String) map.get(Integer.valueOf(c1984t.m8028d()))));
                                                                }
                                                            } else if (abstractC2037w.getClass() == ab.class) {
                                                                for (Abstractz abstractC2040z : ((ab) abstractC2037w).m8059d()) {
                                                                    if (abstractC2040z != ClassV.f5820a) {
                                                                        ClassY c2039y2 = (ClassY) abstractC2040z;
                                                                        ClassT c1984t2 = (ClassT) c2039y2.m8127b();
                                                                        c2039y2.m8126a(new ah(c1984t2.mo7970e(), (String) map.get(Integer.valueOf(c1984t2.m8028d()))));
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        Interfacer interfaceC2032r5 = (Interfacer) c2035u.get(size - 4);
                                                        if (interfaceC2032r5.getClass() == ClassH.class) {
                                                            Abstractn abstractC1978nM8093b4 = ((ClassH) interfaceC2032r5).m8093b();
                                                            if (abstractC1978nM8093b4.getClass() == ClassG.class) {
                                                                c2036v.m8122a(((ClassG) abstractC1978nM8093b4).m8003j());
                                                                c2035u.subList(size - 4, size - 1).clear();
                                                                c2160o.m8599a(abstractC2115aM8306g);
                                                                c2160o.m8599a(abstractC2115aM8306g2);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
