package org.c.a.a.c.a.a.c;

import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import org.c.a.a.b.d.b.Abstractn;
import org.c.a.a.b.d.b.af;
import org.c.a.a.b.d.b.ag;
import org.c.a.a.b.d.b.ClassE;
import org.c.a.a.b.d.b.ClassG;
import org.c.a.a.b.d.b.ClassH;
import org.c.a.a.b.d.b.ClassI;
import org.c.a.a.b.d.b.ClassP;
import org.c.a.a.b.d.b.ClassT;
import org.c.a.a.b.d.b.ClassV;
import org.c.a.a.b.d.b.ClassY;
import org.c.a.a.b.d.b.Interfacef;
import org.c.a.a.b.d.d.ai;
import org.c.a.a.b.d.d.ClassC;
import org.c.a.a.b.d.d.ClassF;
import org.c.a.a.b.d.d.ClassG;
import org.c.a.a.b.d.d.ClassH;
import org.c.a.a.b.d.d.ClassM;
import org.c.a.a.b.d.d.ClassU;
import org.c.a.a.b.d.d.Interfacer;
import org.c.a.a.c.a.a.a.a.ClassA;
import org.c.a.a.c.a.a.a.b.b.ClassB;
import org.c.a.a.c.a.a.a.b.c.ClassA;
import org.c.a.a.c.a.a.a.b.c.ClassB;
import org.c.a.a.c.a.a.a.b.c.ClassC;
import org.c.a.a.c.a.a.a.c.Abstracta;
import org.c.a.a.c.a.a.d.ClassX;
import org.c.a.a.c.a.a.d.ClassY;

public class ClassR {

    protected static final ClassS f6158a = new ClassS();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:12:0x0029  */
    protected static Interfacef m8606a(ClassU c2035u, int i) {
        if (i > 0) {
            switch (c2035u.size()) {
                case 0:
                    break;
                case 1:
                    Interfacer interfaceC2032r = (Interfacer) c2035u.m8846h();
                    if (interfaceC2032r.getClass() == ClassH.class) {
                        Abstractn abstractC1978nM8093b = ((ClassH) interfaceC2032r).m8093b();
                        if (abstractC1978nM8093b.mo7970e() == i && abstractC1978nM8093b.getClass() == ClassG.class && ((ClassG) abstractC1978nM8093b).m8003j().mo7970e() != 0) {
                            c2035u.clear();
                            return abstractC1978nM8093b;
                        }
                    }
                    break;
                default:
                    ClassP c1980p = new ClassP();
                    ListIterator listIterator = c2035u.listIterator(c2035u.size());
                    while (listIterator.hasPrevious()) {
                        Interfacer interfaceC2032r2 = (Interfacer) listIterator.previous();
                        if (interfaceC2032r2.getClass() == ClassH.class) {
                            Abstractn abstractC1978nM8093b2 = ((ClassH) interfaceC2032r2).m8093b();
                            if (abstractC1978nM8093b2.mo7970e() == i && abstractC1978nM8093b2.getClass() == ClassG.class && ((ClassG) abstractC1978nM8093b2).m8003j().mo7970e() != 0) {
                                c1980p.add(abstractC1978nM8093b2);
                                listIterator.remove();
                            }
                        }
                        if (c1980p.size() > 0) {
                            if (c1980p.size() > 1) {
                                Collections.reverse(c1980p);
                            }
                            return c1980p;
                        }
                    }
                    if (c1980p.size() > 0) {
                        if (c1980p.size() > 1) {
                            Collections.reverse(c1980p);
                        }
                        return c1980p;
                    }
                    break;
            }
        }
        return null;
    }

    protected static Interfacer m8607a(int i, int i2, int i3, Interfacer interfaceC2032r, ClassU c2035u) {
        boolean z;
        if (c2035u.isEmpty()) {
            return interfaceC2032r;
        }
        Iterator it = c2035u.iterator();
        String str = "label" + i;
        boolean z2 = false;
        while (it.hasNext()) {
            ClassA c2108a = (ClassA) it.next();
            int iM8309b = c2108a.m8309b();
            int iM8310d = c2108a.m8310d();
            if (iM8310d == i2) {
                c2108a.m8307a(new ClassF(str));
                it.remove();
                z2 = true;
            } else if (iM8310d == i3) {
                c2108a.m8307a(new ClassC(str));
                it.remove();
                z2 = true;
            } else if (i2 <= iM8309b && iM8309b < i3) {
                if (i2 > iM8310d || iM8310d >= i3) {
                    c2108a.m8308a(true);
                } else {
                    if (c2108a.m8311e()) {
                        c2108a.m8307a(new ClassF(str));
                        z = true;
                    } else {
                        c2108a.m8307a(ClassF.f5794a);
                        z = z2;
                    }
                    it.remove();
                    z2 = z;
                }
            }
        }
        return z2 ? new ClassM(str, interfaceC2032r) : interfaceC2032r;
    }

    protected static Interfacer m8608a(ClassA c2085a, ClassU c2035u, Abstractn abstractC1978n, ClassU c2035u2) {
        Abstractn abstractC1978nM7974g;
        Abstractn c1958af;
        if (!c2035u.isEmpty()) {
            Interfacer interfaceC2032r = (Interfacer) c2035u.m8844d();
            if (interfaceC2032r.getClass() == ClassH.class) {
                Abstractn abstractC1978nM8093b = ((ClassH) interfaceC2032r).m8093b();
                if (abstractC1978nM8093b.getClass() == ClassG.class) {
                    ClassG c1971g = (ClassG) abstractC1978nM8093b;
                    if (c1971g.m8000d().getClass() == ClassB.class) {
                        Abstracta abstractC2115aM8306g = ((ClassB) c1971g.m8000d()).m8306g();
                        Interfacer interfaceC2032r2 = (Interfacer) c2035u2.m8844d();
                        if (interfaceC2032r2.getClass() == ClassH.class) {
                            Abstractn abstractC1978nM8093b2 = ((ClassH) interfaceC2032r2).m8093b();
                            Class<?> cls = abstractC1978nM8093b2.getClass();
                            if (cls == ClassG.class) {
                                abstractC1978nM7974g = ((ClassG) abstractC1978nM8093b2).m8000d();
                                c1958af = abstractC1978nM8093b2;
                            } else if (cls == ag.class) {
                                ag c1959ag = (ag) abstractC1978nM8093b2;
                                abstractC1978nM7974g = c1959ag.m7977g();
                                c1958af = new af(c1959ag.mo7970e(), abstractC1978nM7974g, c1959ag.m7976d());
                            } else {
                                if (cls != af.class) {
                                    return new ai(abstractC1978n, c2035u2);
                                }
                                abstractC1978nM7974g = ((af) abstractC1978nM8093b2).m7974g();
                                c1958af = abstractC1978nM8093b2;
                            }
                            if (abstractC1978nM7974g.getClass() == ClassB.class && ((ClassB) abstractC1978nM7974g).m8306g() == abstractC2115aM8306g) {
                                c2035u.m8845e();
                                c2035u2.m8845e();
                                return new ClassC(c2085a.m8219d(), c2085a.m8222e(), abstractC1978nM8093b, abstractC1978n == ClassH.f5728a ? null : abstractC1978n, c1958af, c2035u2);
                            }
                        }
                    }
                }
            }
        }
        return new ai(abstractC1978n, c2035u2);
    }

    protected static Interfacer m8609a(ClassA c2085a, ClassU c2035u, ClassU c2035u2) {
        Abstractn abstractC1978nM8093b;
        int iMo7970e;
        Interfacef interfaceC1970fM8606a;
        int size = c2035u2.size();
        if (size > 0 && c2035u2.m8844d() == ClassF.f5794a) {
            c2035u2.m8845e();
            size--;
        }
        switch (size) {
            case 0:
                break;
            case 1:
                Interfacer interfaceC2032r = (Interfacer) c2035u2.m8846h();
                if (interfaceC2032r.getClass() == ClassH.class && (iMo7970e = (abstractC1978nM8093b = ((ClassH) interfaceC2032r).m8093b()).mo7970e()) > 0 && (interfaceC1970fM8606a = m8606a(c2035u, iMo7970e)) != null) {
                    return new ClassC(c2085a.m8219d(), c2085a.m8222e(), interfaceC1970fM8606a, null, abstractC1978nM8093b, null);
                }
                break;
            default:
                ClassX c2202x = new ClassX();
                ((Interfacer) c2035u2.get(0)).mo8055a(c2202x);
                int iM8676b = c2202x.m8676b();
                if (iM8676b > 0) {
                    ClassP c1980pM8615b = m8615b(c2035u2, iM8676b);
                    if (c1980pM8615b.size() > 0) {
                        return new ClassC(c2085a.m8219d(), c2085a.m8222e(), m8606a(c2035u, ((Abstractn) c1980pM8615b.m8846h()).mo7970e()), null, c1980pM8615b, c2035u2);
                    }
                } else {
                    Interfacer interfaceC2032rM8608a = m8608a(c2085a, c2035u, ClassH.f5728a, c2035u2);
                    if (interfaceC2032rM8608a != null) {
                        return interfaceC2032rM8608a;
                    }
                }
        }
        return new ai(ClassH.f5728a, c2035u2);
    }

    public static Interfacer m8610a(ClassA c2085a, ClassU c2035u, ClassU c2035u2, ClassU c2035u3) {
        c2035u2.mo8055a(f6158a);
        Interfacer interfaceC2032rM8609a = m8609a(c2085a, c2035u, c2035u2);
        int iM8219d = c2085a.m8232m().m8219d();
        int iM8219d2 = c2085a.m8227h().m8219d();
        if (iM8219d2 <= 0) {
            iM8219d2 = c2085a.m8222e();
        }
        return m8607a(c2085a.m8213b(), iM8219d, iM8219d2, interfaceC2032rM8609a, c2035u3);
    }

    public static Interfacer m8611a(ClassA c2085a, ClassA c2085a2, Abstractn abstractC1978n, ClassU c2035u, ClassU c2035u2) {
        c2035u.mo8055a(f6158a);
        ClassG c2021g = new ClassG(abstractC1978n, c2035u);
        int iM8219d = c2085a.m8232m().m8219d();
        int iM8219d2 = c2085a.m8227h().m8219d();
        if (iM8219d2 <= 0) {
            iM8219d2 = c2085a.m8222e();
        }
        return m8607a(c2085a.m8213b(), iM8219d, iM8219d2, c2021g, c2035u2);
    }

    protected static Interfacer m8612a(ClassO c2160o, ClassU c2035u, Abstractn abstractC1978n, ClassU c2035u2) {
        if (abstractC1978n == null) {
            return null;
        }
        int size = c2035u.size();
        if (size < 3 || c2035u2.size() < 2) {
            return null;
        }
        Interfacer interfaceC2032r = (Interfacer) c2035u.get(size - 2);
        if (interfaceC2032r.getClass() != ClassH.class) {
            return null;
        }
        int iMo7970e = abstractC1978n.mo7970e();
        Abstractn abstractC1978nM8093b = ((ClassH) interfaceC2032r).m8093b();
        if (abstractC1978nM8093b.mo7970e() != iMo7970e || abstractC1978nM8093b.getClass() != ClassG.class) {
            return null;
        }
        ClassG c1971g = (ClassG) abstractC1978nM8093b;
        if (c1971g.m8003j().getClass() != ClassV.class || c1971g.m8000d().getClass() != ClassB.class) {
            return null;
        }
        Abstractn abstractC1978nM8032d = ((ClassV) c1971g.m8003j()).m8032d();
        if (abstractC1978nM8032d.getClass() != ClassB.class) {
            return null;
        }
        Abstracta abstractC2115aM8306g = ((ClassB) abstractC1978nM8032d).m8306g();
        Abstracta abstractC2115aM8306g2 = ((ClassB) c1971g.m8000d()).m8306g();
        if (abstractC2115aM8306g.mo8337g() != null && abstractC2115aM8306g.mo8337g().indexOf(36) == -1) {
            return null;
        }
        Interfacer interfaceC2032r2 = (Interfacer) c2035u2.m8846h();
        if (interfaceC2032r2.getClass() != ClassH.class) {
            return null;
        }
        Abstractn abstractC1978nM8093b2 = ((ClassH) interfaceC2032r2).m8093b();
        if (abstractC1978nM8093b2.getClass() != ClassG.class) {
            return null;
        }
        ClassG c1971g2 = (ClassG) abstractC1978nM8093b2;
        if (c1971g2.m8003j().getClass() != ClassE.class || c1971g2.m8000d().getClass() != ClassB.class || c1971g2.mo7970e() != abstractC1978n.mo7970e()) {
            return null;
        }
        ClassE c1969e = (ClassE) c1971g2.m8003j();
        if (c1969e.m7995d().getClass() != ClassB.class || c1969e.m7996g().getClass() != ClassB.class) {
            return null;
        }
        if (((ClassB) c1969e.m7995d()).m8306g() != abstractC2115aM8306g) {
            return null;
        }
        Abstracta abstractC2115aM8306g3 = ((ClassB) c1969e.m7996g()).m8306g();
        Abstracta abstractC2115aM8306g4 = ((ClassB) c1971g2.m8000d()).m8306g();
        if (abstractC2115aM8306g3.mo8337g() != null && abstractC2115aM8306g3.mo8337g().indexOf(36) == -1) {
            return null;
        }
        Interfacer interfaceC2032r3 = (Interfacer) c2035u.get(size - 3);
        if (interfaceC2032r3.getClass() != ClassH.class) {
            return null;
        }
        Abstractn abstractC1978nM8093b3 = ((ClassH) interfaceC2032r3).m8093b();
        if (abstractC1978nM8093b3.getClass() != ClassG.class) {
            return null;
        }
        ClassG c1971g3 = (ClassG) abstractC1978nM8093b3;
        if (c1971g3.m8000d().getClass() == ClassB.class && ((ClassB) c1971g3.m8000d()).m8306g() == abstractC2115aM8306g) {
            Abstractn abstractC1978nM8003j = c1971g3.m8003j();
            Interfacer interfaceC2032r4 = (Interfacer) c2035u.get(size - 1);
            if (interfaceC2032r4.getClass() != ClassH.class) {
                return null;
            }
            Abstractn abstractC1978nM8093b4 = ((ClassH) interfaceC2032r4).m8093b();
            if (abstractC1978nM8093b4.getClass() != ClassG.class) {
                return null;
            }
            ClassG c1971g4 = (ClassG) abstractC1978nM8093b4;
            if (c1971g4.mo7970e() != iMo7970e || c1971g4.m8000d().getClass() != ClassB.class || c1971g4.m8003j().getClass() != ClassT.class) {
                return null;
            }
            if (((ClassT) c1971g4.m8003j()).m8028d() != 0 || ((ClassB) c1971g4.m8000d()).m8306g() != abstractC2115aM8306g3) {
                return null;
            }
            if (abstractC1978n.getClass() != ClassG.class) {
                return null;
            }
            ClassG c1971g5 = (ClassG) abstractC1978n;
            if (c1971g5.m8000d().getClass() != ClassB.class || c1971g5.m8003j().getClass() != ClassB.class) {
                return null;
            }
            if (((ClassB) c1971g5.m8000d()).m8306g() != abstractC2115aM8306g3 || ((ClassB) c1971g5.m8003j()).m8306g() != abstractC2115aM8306g2) {
                return null;
            }
            Interfacer interfaceC2032r5 = (Interfacer) c2035u2.m8844d();
            if (interfaceC2032r5.getClass() != ClassH.class) {
                return null;
            }
            Abstractn abstractC1978nM8093b5 = ((ClassH) interfaceC2032r5).m8093b();
            if (abstractC1978nM8093b5.mo7970e() != iMo7970e || abstractC1978nM8093b5.getClass() != af.class) {
                return null;
            }
            c2035u.m8845e();
            c2035u.m8845e();
            c2035u.m8845e();
            c2035u2.remove(0);
            c2035u2.m8845e();
            abstractC2115aM8306g4.m8324a(true);
            c2160o.m8599a(abstractC2115aM8306g);
            c2160o.m8599a(abstractC2115aM8306g3);
            c2160o.m8599a(abstractC2115aM8306g2);
            return new ClassB(abstractC2115aM8306g4, abstractC1978nM8003j, c2035u2);
        }
        return null;
    }

    protected static Interfacer m8613a(ClassO c2160o, ClassA c2085a, ClassU c2035u, Abstractn abstractC1978n, ClassU c2035u2) {
        Interfacef interfaceC1970fM8606a;
        c2035u2.mo8055a(f6158a);
        Interfacer interfaceC2032rM8612a = m8612a(c2160o, c2035u, abstractC1978n, c2035u2);
        if (interfaceC2032rM8612a != null) {
            return interfaceC2032rM8612a;
        }
        Interfacer interfaceC2032rM8616b = m8616b(c2160o, c2035u, abstractC1978n, c2035u2);
        if (interfaceC2032rM8616b != null) {
            return interfaceC2032rM8616b;
        }
        int iMo7970e = abstractC1978n == null ? 0 : abstractC1978n.mo7970e();
        switch (c2035u2.size()) {
            case 0:
                if (iMo7970e > 0 && (interfaceC1970fM8606a = m8606a(c2035u, iMo7970e)) != null) {
                    return new ClassC(c2085a.m8219d(), c2085a.m8222e(), interfaceC1970fM8606a, abstractC1978n, null, null);
                }
                break;
            case 1:
                if (iMo7970e <= 0) {
                    return m8608a(c2085a, c2035u, abstractC1978n, c2035u2);
                }
                Interfacer interfaceC2032r = (Interfacer) c2035u2.m8846h();
                Interfacef interfaceC1970fM8606a2 = m8606a(c2035u, iMo7970e);
                if (interfaceC2032r.getClass() == ClassH.class) {
                    Abstractn abstractC1978nM8093b = ((ClassH) interfaceC2032r).m8093b();
                    if (abstractC1978nM8093b.mo7970e() == iMo7970e) {
                        return new ClassC(c2085a.m8219d(), c2085a.m8222e(), interfaceC1970fM8606a2, abstractC1978n, abstractC1978nM8093b, null);
                    }
                    if (interfaceC1970fM8606a2 != null) {
                        return new ClassC(c2085a.m8219d(), c2085a.m8222e(), interfaceC1970fM8606a2, abstractC1978n, null, interfaceC2032r);
                    }
                } else if (interfaceC1970fM8606a2 != null) {
                    return new ClassC(c2085a.m8219d(), c2085a.m8222e(), interfaceC1970fM8606a2, abstractC1978n, null, interfaceC2032r);
                }
                break;
            default:
                if (iMo7970e <= 0) {
                    return m8608a(c2085a, c2035u, abstractC1978n, c2035u2);
                }
                ClassX c2202x = new ClassX();
                ((Interfacer) c2035u2.get(0)).mo8055a(c2202x);
                ClassP c1980pM8615b = m8615b(c2035u2, c2202x.m8676b());
                Interfacef interfaceC1970fM8606a3 = m8606a(c2035u, iMo7970e);
                if (interfaceC1970fM8606a3 != null || c1980pM8615b.size() > 0) {
                    return new ClassC(c2085a.m8219d(), c2085a.m8222e(), interfaceC1970fM8606a3, abstractC1978n, c1980pM8615b, c2035u2);
                }
                break;
        }
        return new ai(abstractC1978n, c2035u2);
    }

    public static Interfacer m8614a(ClassO c2160o, ClassA c2085a, ClassU c2035u, Abstractn abstractC1978n, ClassU c2035u2, ClassU c2035u3) {
        Interfacer interfaceC2032rM8613a = m8613a(c2160o, c2085a, c2035u, abstractC1978n, c2035u2);
        int iM8219d = c2085a.m8232m().m8219d();
        int iM8219d2 = c2085a.m8227h().m8219d();
        if (iM8219d2 <= 0) {
            iM8219d2 = c2085a.m8222e();
        }
        return m8607a(c2085a.m8213b(), iM8219d, iM8219d2, interfaceC2032rM8613a, c2035u3);
    }

    protected static ClassP m8615b(ClassU c2035u, int i) {
        ClassP c1980p = new ClassP();
        ListIterator listIterator = c2035u.listIterator(c2035u.size());
        while (listIterator.hasPrevious()) {
            Interfacer interfaceC2032r = (Interfacer) listIterator.previous();
            if (interfaceC2032r.getClass() != ClassH.class) {
                break;
            }
            Abstractn abstractC1978nM8093b = ((ClassH) interfaceC2032r).m8093b();
            if (abstractC1978nM8093b.mo7970e() >= i) {
                break;
            }
            listIterator.remove();
            c1980p.add(abstractC1978nM8093b);
        }
        if (c1980p.size() > 1) {
            Collections.reverse(c1980p);
        }
        return c1980p;
    }

    protected static Interfacer m8616b(ClassO c2160o, ClassU c2035u, Abstractn abstractC1978n, ClassU c2035u2) {
        if (abstractC1978n == null) {
            return null;
        }
        if (c2035u.size() < 1 || c2035u2.size() < 1) {
            return null;
        }
        if (abstractC1978n.getClass() != ClassY.class) {
            return null;
        }
        ClassY c1989y = (ClassY) abstractC1978n;
        if (!c1989y.m8040j().equals("hasNext") || !c1989y.m8039i().equals("java/util/Iterator") || c1989y.m8038g().getClass() != ClassB.class) {
            return null;
        }
        Abstracta abstractC2115aM8306g = ((ClassB) c1989y.m8038g()).m8306g();
        if (abstractC2115aM8306g.mo8337g() != null && abstractC2115aM8306g.mo8337g().indexOf(36) == -1) {
            return null;
        }
        Interfacer interfaceC2032r = (Interfacer) c2035u.m8844d();
        if (interfaceC2032r.getClass() != ClassH.class) {
            return null;
        }
        ClassH c2022h = (ClassH) interfaceC2032r;
        if (c2022h.m8093b().getClass() != ClassG.class) {
            return null;
        }
        ClassG c1971g = (ClassG) c2022h.m8093b();
        if (c1971g == null || c1971g.m8000d().getClass() != ClassB.class || c1971g.m8003j().getClass() != ClassY.class || c1971g.mo7970e() != abstractC1978n.mo7970e()) {
            return null;
        }
        ClassY c1989y2 = (ClassY) c1971g.m8003j();
        if (!c1989y2.m8040j().equals("iterator") || !c1989y2.m8041l().equals("()Ljava/util/Iterator;")) {
            return null;
        }
        if (((ClassB) c1971g.m8000d()).m8306g() != abstractC2115aM8306g) {
            return null;
        }
        Abstractn abstractC1978nG = c1989y2.m8038g();
        Interfacer interfaceC2032r2 = (Interfacer) c2035u2.get(0);
        if (interfaceC2032r2.getClass() != ClassH.class) {
            return null;
        }
        ClassH c2022h2 = (ClassH) interfaceC2032r2;
        if (c2022h2.m8093b().getClass() != ClassG.class) {
            return null;
        }
        ClassG c1971g2 = (ClassG) c2022h2.m8093b();
        if (c1971g2.m8000d().getClass() != ClassB.class) {
            return null;
        }
        Abstractn abstractC1978nM8003j = c1971g2.m8003j();
        if (c1971g2.m8003j().getClass() == ClassI.class) {
            abstractC1978nM8003j = ((ClassI) abstractC1978nM8003j).m8007d();
        }
        if (abstractC1978nM8003j.getClass() != ClassY.class) {
            return null;
        }
        ClassY c1989y3 = (ClassY) abstractC1978nM8003j;
        if (!c1989y3.m8040j().equals("next") || !c1989y3.m8039i().equals("java/util/Iterator") || c1989y3.m8038g().getClass() != ClassB.class) {
            return null;
        }
        if (((ClassB) c1989y3.m8038g()).m8306g() != abstractC2115aM8306g) {
            return null;
        }
        ClassY c2203y = new ClassY(abstractC2115aM8306g);
        int size = c2035u2.size();
        for (int i = 1; i < size; i++) {
            ((Interfacer) c2035u2.get(i)).mo8055a(c2203y);
        }
        if (c2203y.m8677a()) {
            return null;
        }
        Abstracta abstractC2115aM8306g2 = ((ClassB) c1971g2.m8000d()).m8306g();
        c2035u.m8845e();
        c2035u2.remove(0);
        abstractC2115aM8306g2.m8324a(true);
        c2160o.m8599a(abstractC2115aM8306g);
        return new ClassB(abstractC2115aM8306g2, abstractC1978nG, c2035u2);
    }
}
