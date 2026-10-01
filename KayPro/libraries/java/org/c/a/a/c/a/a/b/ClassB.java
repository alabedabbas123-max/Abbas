package org.c.a.a.c.a.a.b;

import com.almlkaide.kaypro.android.dx.cf.attrib.AttAnnotationDefault;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttCode;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttConstantValue;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttLineNumberTable;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttRuntimeInvisibleAnnotations;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttRuntimeVisibleAnnotations;
import java.util.List;
import org.c.a.a.b.a.ClassA;
import org.c.a.a.b.a.ClassC;
import org.c.a.a.b.a.ClassD;
import org.c.a.a.b.a.a.ak;
import org.c.a.a.b.a.a.al;
import org.c.a.a.b.a.a.am;
import org.c.a.a.b.a.a.ClassB;
import org.c.a.a.b.a.a.ClassD;
import org.c.a.a.b.a.a.ClassF;
import org.c.a.a.b.a.a.ClassG;
import org.c.a.a.b.a.a.ClassK;
import org.c.a.a.b.a.a.ClassO;
import org.c.a.a.b.a.b.Abstractm;
import org.c.a.a.b.a.b.ClassC;
import org.c.a.a.b.a.b.ClassD;
import org.c.a.a.b.a.b.ClassE;
import org.c.a.a.b.a.b.ClassF;
import org.c.a.a.b.a.b.ClassL;
import org.c.a.a.b.d.ClassB;
import org.c.a.a.b.d.a.ad;
import org.c.a.a.b.d.a.ae;
import org.c.a.a.b.d.a.af;
import org.c.a.a.b.d.a.ag;
import org.c.a.a.b.d.a.ClassP;
import org.c.a.a.b.d.a.ClassR;
import org.c.a.a.b.d.a.Interfaceh;
import org.c.a.a.b.d.a.Interfacez;
import org.c.a.a.b.d.b.Abstractn;
import org.c.a.a.b.d.b.ah;
import org.c.a.a.b.d.b.ClassL;
import org.c.a.a.b.d.b.ClassR;
import org.c.a.a.b.d.b.ClassT;
import org.c.a.a.b.d.b.ClassX;
import org.c.a.a.b.d.c.Interfaced;
import org.c.a.a.b.d.c.Interfaceg;
import org.c.a.a.b.d.e.Interfacel;
import org.c.a.a.b.e.ClassA;
import org.c.a.a.c.a.a.a.b.a.ClassA;
import org.c.a.a.c.a.a.a.b.a.ClassB;
import org.c.a.a.c.a.a.a.b.a.ClassC;
import org.c.a.a.c.a.a.a.b.a.ClassD;
import org.c.a.a.c.a.a.a.b.a.ClassF;
import org.c.a.a.c.a.a.a.b.a.ClassH;
import org.c.a.a.c.a.a.a.b.a.ClassJ;
import org.c.a.a.c.a.a.a.b.a.ClassL;
import org.c.a.a.c.a.a.a.b.a.ClassM;
import org.c.a.a.c.a.a.c.ac;
import org.c.a.a.c.a.a.c.ad;
import org.c.a.a.c.a.a.c.af;
import org.c.a.a.c.a.a.c.ClassB;
import org.c.a.a.c.a.a.c.ClassW;
import org.c.a.a.d.ClassC;

public class ClassB {
    protected List m8383a(ac c2133ac, ClassB c2147b, ClassA c1821a) {
        ClassC[] c1876cArrM7589g = c1821a.m7589g();
        if (c1876cArrM7589g == null) {
            return null;
        }
        ClassC c2247c = new ClassC(c1876cArrM7589g.length);
        for (ClassC c1876c : c1876cArrM7589g) {
            Interfaced interfaceC1994dM8391a = m8391a(c2147b, c1876c);
            Interfacel interfaceC2052lM8413a = c2133ac.m8413a(c1876c);
            c2247c.add(new ClassH(interfaceC1994dM8391a, c1876c.m7679a(), interfaceC2052lM8413a, new ClassR(c1876c.m7681b(), m8389a(c1876c, interfaceC2052lM8413a))));
        }
        return c2247c;
    }

    protected List m8384a(ac c2133ac, ClassB c2147b, ClassB c2094b, ClassA c1821a) {
        ClassK c1846k;
        ClassD[] c1877dArrM7590h = c1821a.m7590h();
        if (c1877dArrM7590h == null) {
            return null;
        }
        ClassC c2247c = new ClassC(c1877dArrM7590h.length);
        int length = c1877dArrM7590h.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return c2247c;
            }
            ClassD c1877d = c1877dArrM7590h[i2];
            String strM7685b = c1877d.m7685b();
            Interfaced interfaceC1994dM8392a = m8392a(c2147b, c1877d);
            ClassD c1839d = (ClassD) c1877d.m7684a(AttAnnotationDefault.ATTRIBUTE_NAME);
            Interfaceg interfaceC1997gM8472a = c1839d != null ? c2147b.m8472a(c1839d.m7632a()) : null;
            ClassF c1841f = (ClassF) c1877d.m7684a(AttCode.ATTRIBUTE_NAME);
            int iM7612b = 0;
            if (c1841f != null && (c1846k = (ClassK) c1841f.m7634a(AttLineNumberTable.ATTRIBUTE_NAME)) != null) {
                iM7612b = c1846k.m7640a()[0].m7612b();
            }
            if ("<init>".equals(strM7685b)) {
                ad c2134adM8416a = c2133ac.m8416a(c1877d);
                c2247c.add(new ClassD(c2094b, c1821a, c1877d, interfaceC1994dM8392a, c2134adM8416a.f6080a, c2134adM8416a.f6081b, c2134adM8416a.f6083d, iM7612b));
            } else if ("<clinit>".equals(strM7685b)) {
                c2247c.add(new ClassM(c2094b, c1821a, c1877d, iM7612b));
            } else {
                ad c2134adM8420b = c2133ac.m8420b(c1877d);
                ClassL c2104l = new ClassL(c2094b, c1821a, c1877d, interfaceC1994dM8392a, strM7685b, c2134adM8420b.f6080a, c2134adM8420b.f6082c, c2134adM8420b.f6081b, c2134adM8420b.f6083d, interfaceC1997gM8472a, iM7612b);
                c2247c.add(c2104l);
                if ((c1821a.m7585c() & 512) != 0 && c2104l.m7870a() == 1) {
                    c2104l.mo8287a(65537);
                }
            }
            i = i2 + 1;
        }
    }

    protected List m8385a(ak[] c1833akArr) {
        if (c1833akArr == null || c1833akArr.length == 0) {
            return null;
        }
        ClassC c2247c = new ClassC(c1833akArr.length);
        for (ak c1833ak : c1833akArr) {
            c2247c.add(new ae(c1833ak.m7623a(), c1833ak.m7624b(), c1833ak.m7625c()));
        }
        return c2247c;
    }

    protected List m8386a(al[] c1834alArr) {
        if (c1834alArr == null || c1834alArr.length == 0) {
            return null;
        }
        ClassC c2247c = new ClassC(c1834alArr.length);
        for (al c1834al : c1834alArr) {
            c2247c.add(new af(c1834al.m7626a(), c1834al.m7627b(), c1834al.m7628c() == null ? null : new ClassC(c1834al.m7628c())));
        }
        return c2247c;
    }

    protected List m8387a(am[] c1835amArr) {
        if (c1835amArr == null || c1835amArr.length == 0) {
            return null;
        }
        ClassC c2247c = new ClassC(c1835amArr.length);
        for (am c1835am : c1835amArr) {
            c2247c.add(new ag(c1835am.m7629a(), c1835am.m7630b() == null ? null : new ClassC(c1835am.m7630b())));
        }
        return c2247c;
    }

    protected ad m8388a(ClassA c1821a) {
        ClassO c1850o = (ClassO) c1821a.m7580a("Module");
        return new ad(c1850o.m7644b(), c1821a.m7586d(), c1850o.m7643a(), c1850o.m7645c(), m8385a(c1850o.m7646d()), m8386a(c1850o.m7647e()), m8386a(c1850o.m7648f()), new ClassC(c1850o.m7649g()), m8387a(c1850o.m7650h()));
    }

    protected ClassP m8389a(ClassC c1876c, Interfacel interfaceC2052l) {
        Abstractn c1960ah;
        ClassG c1842g = (ClassG) c1876c.m7680a(AttConstantValue.ATTRIBUTE_NAME);
        if (c1842g == null) {
            return null;
        }
        Abstractm abstractC1875mM7637a = c1842g.m7637a();
        switch (abstractC1875mM7637a.m7665a()) {
            case 1:
                c1960ah = new ah(((ClassL) abstractC1875mM7637a).m7678b());
                break;
            case 2:
            default:
                throw new ClassA("Invalid attributes");
            case 3:
                c1960ah = new ClassT(interfaceC2052l, ((ClassE) abstractC1875mM7637a).m7669b());
                break;
            case 4:
                c1960ah = new ClassR(((ClassD) abstractC1875mM7637a).m7668b());
                break;
            case 5:
                c1960ah = new ClassX(((ClassF) abstractC1875mM7637a).m7670b());
                break;
            case 6:
                c1960ah = new ClassL(((ClassC) abstractC1875mM7637a).m7667b());
                break;
        }
        return new ClassP(c1960ah);
    }

    protected Interfaced m8390a(ClassB c2147b, ClassA c1821a) {
        return c2147b.m8471a((ClassB) c1821a.m7580a(AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME), (ClassB) c1821a.m7580a(AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME));
    }

    protected Interfaced m8391a(ClassB c2147b, ClassC c1876c) {
        return c2147b.m8471a((ClassB) c1876c.m7680a(AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME), (ClassB) c1876c.m7680a(AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME));
    }

    protected Interfaced m8392a(ClassB c2147b, ClassD c1877d) {
        return c2147b.m8471a((ClassB) c1877d.m7684a(AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME), (ClassB) c1877d.m7684a(AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME));
    }

    protected ClassJ m8393a(ac c2133ac, ClassB c2147b, ClassA c1821a, ClassB c2094b) {
        Interfaced interfaceC1994dM8390a = m8390a(c2147b, c1821a);
        af c2136afM8417a = c2133ac.m8417a(c1821a);
        return new ClassJ(interfaceC1994dM8390a, c1821a.m7585c(), c2136afM8417a.f6088a.m8150g(), c2136afM8417a.f6088a.m8152j(), c2136afM8417a.f6089b, c2136afM8417a.f6091d, m8398e(c2133ac, c2147b, c1821a, c2094b));
    }

    public void m8394a(ClassA c2066a) {
        Interfaceh interfaceC1932hM8393a;
        ClassW c2168w = (ClassW) c2066a.m8168a("objectTypeMaker");
        ac c2133ac = (ac) c2066a.m8168a("signatureParser");
        ClassA c1821a = (ClassA) c2066a.m8167a();
        ClassB c2147b = new ClassB(c2168w);
        int iM7585c = c1821a.m7585c();
        if ((iM7585c & 16384) != 0) {
            interfaceC1932hM8393a = m8395b(c2133ac, c2147b, c1821a, null);
        } else if ((iM7585c & 8192) != 0) {
            interfaceC1932hM8393a = m8396c(c2133ac, c2147b, c1821a, null);
        } else if ((32768 & iM7585c) != 0) {
            interfaceC1932hM8393a = m8388a(c1821a);
        } else {
            interfaceC1932hM8393a = (iM7585c & 512) != 0 ? m8393a(c2133ac, c2147b, c1821a, (ClassB) null) : m8397d(c2133ac, c2147b, c1821a, null);
        }
        c2066a.m8171b("majorVersion", Integer.valueOf(c1821a.m7584b()));
        c2066a.m8171b("minorVersion", Integer.valueOf(c1821a.m7579a()));
        c2066a.m8170a(new ClassB(interfaceC1932hM8393a));
    }

    protected ClassF m8395b(ac c2133ac, ClassB c2147b, ClassA c1821a, ClassB c2094b) {
        Interfaced interfaceC1994dM8390a = m8390a(c2147b, c1821a);
        af c2136afM8417a = c2133ac.m8417a(c1821a);
        return new ClassF(interfaceC1994dM8390a, c1821a.m7585c(), c2136afM8417a.f6088a.m8150g(), c2136afM8417a.f6088a.m8152j(), c2136afM8417a.f6091d, m8398e(c2133ac, c2147b, c1821a, c2094b));
    }

    protected ClassA m8396c(ac c2133ac, ClassB c2147b, ClassA c1821a, ClassB c2094b) {
        Interfaced interfaceC1994dM8390a = m8390a(c2147b, c1821a);
        af c2136afM8417a = c2133ac.m8417a(c1821a);
        return new ClassA(interfaceC1994dM8390a, c1821a.m7585c(), c2136afM8417a.f6088a.m8150g(), c2136afM8417a.f6088a.m8152j(), m8398e(c2133ac, c2147b, c1821a, c2094b));
    }

    protected ClassC m8397d(ac c2133ac, ClassB c2147b, ClassA c1821a, ClassB c2094b) {
        Interfaced interfaceC1994dM8390a = m8390a(c2147b, c1821a);
        af c2136afM8417a = c2133ac.m8417a(c1821a);
        return new ClassC(interfaceC1994dM8390a, c1821a.m7585c(), c2136afM8417a.f6088a.m8150g(), c2136afM8417a.f6088a.m8152j(), c2136afM8417a.f6089b, c2136afM8417a.f6090c, c2136afM8417a.f6091d, m8398e(c2133ac, c2147b, c1821a, c2094b));
    }

    protected ClassB m8398e(ac c2133ac, ClassB c2147b, ClassA c1821a, ClassB c2094b) {
        ClassB c2094b2 = new ClassB(c1821a.m7586d(), c2094b);
        c2094b2.m8271a(m8383a(c2133ac, c2147b, c1821a));
        c2094b2.m8276b(m8384a(c2133ac, c2147b, c2094b2, c1821a));
        c2094b2.m8277c(m8399f(c2133ac, c2147b, c1821a, c2094b2));
        return c2094b2;
    }

    protected List m8399f(ac c2133ac, ClassB c2147b, ClassA c1821a, ClassB c2094b) {
        Interfacez interfaceC1950zM8393a;
        List<ClassA> listM7592j = c1821a.m7592j();
        if (listM7592j == null) {
            return null;
        }
        ClassC c2247c = new ClassC(listM7592j.size());
        for (ClassA c1821a2 : listM7592j) {
            int iM7585c = c1821a2.m7585c();
            if ((iM7585c & 16384) != 0) {
                interfaceC1950zM8393a = m8395b(c2133ac, c2147b, c1821a2, c2094b);
            } else if ((iM7585c & 8192) != 0) {
                interfaceC1950zM8393a = m8396c(c2133ac, c2147b, c1821a2, c2094b);
            } else {
                interfaceC1950zM8393a = (iM7585c & 512) != 0 ? m8393a(c2133ac, c2147b, c1821a2, c2094b) : m8397d(c2133ac, c2147b, c1821a2, c2094b);
            }
            c2247c.add(interfaceC1950zM8393a);
        }
        return c2247c;
    }
}
