package org.c.a.a.c.a.a.c;

import com.almlkaide.kaypro.android.dx.cf.attrib.AttCode;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttLocalVariableTable;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttLocalVariableTypeTable;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttRuntimeInvisibleParameterAnnotations;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttRuntimeVisibleParameterAnnotations;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.c.a.a.b.a.ClassA;
import org.c.a.a.b.a.ClassC;
import org.c.a.a.b.a.ClassD;
import org.c.a.a.b.a.a.ah;
import org.c.a.a.b.a.a.ai;
import org.c.a.a.b.a.a.ClassB;
import org.c.a.a.b.a.a.ClassF;
import org.c.a.a.b.a.a.ClassL;
import org.c.a.a.b.a.a.ClassM;
import org.c.a.a.b.a.a.ClassR;
import org.c.a.a.b.d.a.ClassU;
import org.c.a.a.b.d.a.Interfacee;
import org.c.a.a.b.d.b.Abstractn;
import org.c.a.a.b.d.b.ab;
import org.c.a.a.b.d.b.ad;
import org.c.a.a.b.d.d.ClassU;
import org.c.a.a.b.d.e.ClassH;
import org.c.a.a.b.d.e.ClassI;
import org.c.a.a.b.d.e.ClassK;
import org.c.a.a.b.d.e.Interfacel;
import org.c.a.a.c.a.a.a.b.a.ClassI;
import org.c.a.a.c.a.a.a.b.a.Interfacee;
import org.c.a.a.c.a.a.a.b.b.ClassB;
import org.c.a.a.c.a.a.a.c.Abstracta;
import org.c.a.a.c.a.a.a.c.ClassB;
import org.c.a.a.c.a.a.a.c.ClassH;
import org.c.a.a.c.a.a.a.c.ClassJ;
import org.c.a.a.c.a.a.a.c.ClassK;
import org.c.a.a.c.a.a.a.c.ClassL;
import org.c.a.a.c.a.a.d.ag;
import org.c.a.a.c.a.a.d.ClassD;
import org.c.a.a.c.a.a.d.ClassE;
import org.c.a.a.c.a.a.d.ClassG;
import org.c.a.a.c.a.a.d.ClassT;

public class ClassO {

    protected Abstracta[] f6147e;

    protected ClassW f6148f;

    protected ac f6149g;

    protected ClassU f6150h;

    protected ClassE f6153k;

    protected ClassD f6154l;

    protected ClassQ f6155m;

    protected ClassH f6143a = new ClassH();

    protected HashSet f6144b = new HashSet();

    protected HashSet f6145c = new HashSet();

    protected ClassB f6146d = new ClassL();

    protected ClassT f6151i = new ClassT(this.f6145c);

    protected ClassP f6152j = new ClassP();

    public ClassO(ClassW c2168w, ac c2133ac, Interfacee interfaceC2097e, boolean z, List list, Interfacel interfaceC2052l) {
        ClassA c1821aMo8292k = interfaceC2097e.mo8292k();
        ClassD c1877dMo8294r_ = interfaceC2097e.mo8294r_();
        this.f6148f = c2168w;
        this.f6149g = c2133ac;
        this.f6153k = new ClassE(c2168w);
        this.f6154l = new ClassD(c2168w);
        this.f6155m = new ClassQ(interfaceC2052l);
        if (c1821aMo8292k.m7589g() != null) {
            for (ClassC c1876c : c1821aMo8292k.m7589g()) {
                String strM7682c = c1876c.m7682c();
                if (strM7682c.charAt(strM7682c.length() - 1) == ';') {
                    c2168w.m8636a(strM7682c).mo8142a(this.f6151i);
                }
                this.f6145c.add(c1876c.m7681b());
            }
        }
        c2168w.m8636a(c1821aMo8292k.m7586d()).mo8142a(this.f6151i);
        if (c1821aMo8292k.m7587e() != null) {
            c2168w.m8636a(c1821aMo8292k.m7587e()).mo8142a(this.f6151i);
        }
        if (c1821aMo8292k.m7588f() != null) {
            for (String str : c1821aMo8292k.m7588f()) {
                c2168w.m8636a(str).mo8142a(this.f6151i);
            }
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Interfacel) it.next()).mo8142a(this.f6151i);
            }
        }
        m8595a(c1877dMo8294r_);
        int i = 0;
        if ((c1877dMo8294r_.m7683a() & 8) == 0) {
            if (this.f6143a.m8371a(0) == null) {
                this.f6143a.m8375a(0, new ClassJ(c2168w, 0, 0, c2168w.m8636a(c1821aMo8292k.m7586d()), "this"));
                this.f6145c.add("this");
            }
            i = 1;
        }
        if (z) {
            if ((c1821aMo8292k.m7585c() & 16384) != 0) {
                if (this.f6143a.m8371a(1) == null) {
                    this.f6143a.m8375a(1, new ClassJ(c2168w, 1, 0, ClassI.f5841n, "this$enum$name"));
                    this.f6145c.add("this$enum$name");
                }
                if (this.f6143a.m8371a(2) == null) {
                    this.f6143a.m8375a(2, new ClassK(2, 0, ClassK.f5856f, "this$enum$index"));
                    this.f6145c.add("this$enum$index");
                }
            } else if (c1821aMo8292k.m7591i() != null && (c1821aMo8292k.m7585c() & 8) == 0 && this.f6143a.m8371a(1) == null) {
                this.f6143a.m8375a(1, new ClassJ(c2168w, 1, 0, c2168w.m8636a(c1821aMo8292k.m7591i().m7586d()), "this$0"));
                this.f6145c.add("this$0");
            }
        }
        if (list != null && !list.isEmpty()) {
            int size = list.size() - 1;
            boolean z2 = (c1877dMo8294r_.m7683a() & 128) != 0;
            m8594a(c1821aMo8292k, list, z2, i, size);
            this.f6150h = new ClassU();
            ClassR c1853r = (ClassR) c1877dMo8294r_.m7684a(AttRuntimeVisibleParameterAnnotations.ATTRIBUTE_NAME);
            ClassR c1853r2 = (ClassR) c1877dMo8294r_.m7684a(AttRuntimeInvisibleParameterAnnotations.ATTRIBUTE_NAME);
            if (c1853r == null && c1853r2 == null) {
                int i2 = i;
                int i3 = 0;
                while (i3 <= size) {
                    Abstracta abstractC2115aM8371a = this.f6143a.m8371a(i2);
                    this.f6150h.add(new ClassI(abstractC2115aM8371a, z2 && i3 == size));
                    i3++;
                    i2 = ((ClassK.f5857g.equals(abstractC2115aM8371a.mo8370k()) || ClassK.f5854d.equals(abstractC2115aM8371a.mo8370k())) ? i2 + 1 : i2) + 1;
                }
            } else {
                ClassB[] c1837bArrM7651a = c1853r == null ? null : c1853r.m7651a();
                ClassB[] c1837bArrM7651a2 = c1853r2 == null ? null : c1853r2.m7651a();
                ClassB c2147b = new ClassB(c2168w);
                int i4 = i;
                int i5 = 0;
                while (i5 <= size) {
                    Abstracta abstractC2115aM8371a2 = this.f6143a.m8371a(i4);
                    this.f6150h.add(new ClassI(c2147b.m8471a((c1837bArrM7651a == null || c1837bArrM7651a.length <= i5) ? null : c1837bArrM7651a[i5], (c1837bArrM7651a2 == null || c1837bArrM7651a2.length <= i5) ? null : c1837bArrM7651a2[i5]), abstractC2115aM8371a2, z2 && i5 == size));
                    i4 = ((ClassK.f5857g.equals(abstractC2115aM8371a2.mo8370k()) || ClassK.f5854d.equals(abstractC2115aM8371a2.mo8370k())) ? i4 + 1 : i4) + 1;
                    i5++;
                }
            }
        }
        this.f6147e = this.f6143a.m8376a(this.f6146d);
    }

    public Abstracta m8589a(int i, int i2) {
        Abstracta abstractC2115aMo8343a = this.f6147e[i];
        if (abstractC2115aMo8343a == null) {
            abstractC2115aMo8343a = this.f6146d.mo8343a(i);
            if (abstractC2115aMo8343a == null) {
                abstractC2115aMo8343a = new ClassJ(this.f6148f, i, i2, ClassI.f5839l, "SYNTHETIC_LOCAL_VARIABLE_" + i, true);
            }
        } else if (abstractC2115aMo8343a.m8318a() != this.f6146d) {
            ClassB c2116bM8592a = m8592a(abstractC2115aMo8343a.m8318a(), this.f6146d);
            c2116bM8592a.m8357c(abstractC2115aMo8343a);
            if (abstractC2115aMo8343a.m8318a() != c2116bM8592a) {
                abstractC2115aMo8343a.m8318a().m8358d(abstractC2115aMo8343a);
                c2116bM8592a.m8351a(abstractC2115aMo8343a);
            }
        }
        abstractC2115aMo8343a.m8327b(i2);
        return abstractC2115aMo8343a;
    }

    public Abstracta m8590a(int i, int i2, Abstractn abstractC1978n) {
        Abstracta abstractC2115aMo8343a;
        Abstracta abstractC2115aM8651a;
        Abstracta abstractC2115aM8377b = this.f6143a.m8377b(i, i2);
        if (abstractC2115aM8377b == null) {
            abstractC2115aMo8343a = this.f6146d.mo8343a(i);
        } else {
            abstractC2115aMo8343a = this.f6146d.mo8343a(i);
            if (abstractC2115aMo8343a == null || abstractC2115aM8377b.m8335e() >= abstractC2115aMo8343a.m8335e()) {
                this.f6143a.m8372a(i, i2);
                abstractC2115aMo8343a = abstractC2115aM8377b;
            }
        }
        if (abstractC2115aMo8343a == null) {
            this.f6154l.m8652a(i, i2);
            if (abstractC1978n.getClass() == ClassB.class) {
                ((ClassB) abstractC1978n).m8306g().mo8368a(this.f6154l);
            } else {
                abstractC1978n.mo7963f().mo8142a(this.f6154l);
            }
            abstractC2115aM8651a = this.f6154l.m8651a();
        } else if (abstractC1978n.getClass() == ClassB.class) {
            ClassK c2125k = (ClassK) ((ClassB) abstractC1978n).m8306g();
            if (abstractC2115aMo8343a.mo8329b(c2125k)) {
                abstractC2115aMo8343a.mo8331c(c2125k);
                c2125k.mo8334d(abstractC2115aMo8343a);
                abstractC2115aM8651a = abstractC2115aMo8343a;
            } else {
                this.f6154l.m8652a(i, i2);
                c2125k.mo8368a(this.f6154l);
                abstractC2115aM8651a = this.f6154l.m8651a();
            }
        } else {
            Interfacel interfaceC2052lMo7963f = abstractC1978n.mo7963f();
            if (abstractC2115aMo8343a.mo8325a(interfaceC2052lMo7963f)) {
                abstractC2115aMo8343a.mo8328b(interfaceC2052lMo7963f);
                abstractC2115aM8651a = abstractC2115aMo8343a;
            } else {
                this.f6154l.m8652a(i, i2);
                interfaceC2052lMo7963f.mo8142a(this.f6154l);
                abstractC2115aM8651a = this.f6154l.m8651a();
            }
        }
        abstractC2115aM8651a.m8327b(i2);
        m8603b(abstractC2115aM8651a);
        return abstractC2115aM8651a;
    }

    public Abstracta m8591a(int i, int i2, ClassI c2049i) {
        if (i == -1) {
            ClassB c2116b = this.f6146d;
            ClassJ c2124j = new ClassJ(this.f6148f, i, i2, c2049i, null, true);
            c2116b.m8355b(c2124j);
            return c2124j;
        }
        Abstracta abstractC2115aM8372a = this.f6143a.m8372a(i, i2);
        if (abstractC2115aM8372a == null) {
            abstractC2115aM8372a = new ClassJ(this.f6148f, i, i2, c2049i, null, true);
        } else {
            abstractC2115aM8372a.m8324a(true);
        }
        this.f6146d.m8351a(abstractC2115aM8372a);
        return abstractC2115aM8372a;
    }

    protected ClassB m8592a(ClassB c2116b, ClassB c2116b2) {
        HashSet hashSet = new HashSet();
        while (c2116b != null) {
            hashSet.add(c2116b);
            c2116b = c2116b.m8344a();
        }
        for (ClassB c2116bM8344a = c2116b2; c2116bM8344a != null; c2116bM8344a = c2116bM8344a.m8344a()) {
            if (hashSet.contains(c2116bM8344a)) {
                return c2116bM8344a;
            }
        }
        return null;
    }

    public void m8593a() {
        this.f6146d.m8345a(this.f6145c);
        this.f6146d.mo8356c();
    }

    protected void m8594a(ClassA c1821a, List list, boolean z, int i, int i2) {
        String str;
        int i3;
        HashMap map = new HashMap();
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i5 > i2) {
                break;
            }
            Interfacel interfaceC2052l = (Interfacel) list.get(i5);
            if (map.containsKey(interfaceC2052l)) {
                map.put(interfaceC2052l, Boolean.TRUE);
            } else {
                map.put(interfaceC2052l, Boolean.FALSE);
            }
            i4 = i5 + 1;
        }
        if (c1821a.m7591i() != null) {
            int i6 = 1;
            for (ClassI c2049iM8636a = this.f6148f.m8636a(c1821a.m7591i().m7586d()); c2049iM8636a != null && c2049iM8636a.getClass() == ClassH.class; c2049iM8636a = ((ClassH) c2049iM8636a).m8149b()) {
                i6++;
            }
            str = String.valueOf("param") + i6;
        } else {
            str = "param";
        }
        StringBuilder sb = new StringBuilder();
        ClassG c2185g = new ClassG();
        int i7 = i;
        for (int i8 = 0; i8 <= i2; i8++) {
            Interfacel interfaceC2052l2 = (Interfacel) list.get(i8);
            if (this.f6143a.m8371a(i7) == null) {
                sb.setLength(0);
                sb.append(str);
                if (i8 == i2 && z) {
                    sb.append("VarArgs");
                } else {
                    if (interfaceC2052l2.mo8145d() > 0) {
                        sb.append("ArrayOf");
                    }
                    interfaceC2052l2.mo8142a(c2185g);
                    sb.append(c2185g.m8655a());
                }
                int length = sb.length();
                if (((Boolean) map.get(interfaceC2052l2)).booleanValue()) {
                    i3 = 2;
                    sb.append(1);
                } else {
                    i3 = 1;
                }
                int i9 = i3;
                String string = sb.toString();
                while (this.f6145c.contains(string)) {
                    sb.setLength(length);
                    sb.append(i9);
                    string = sb.toString();
                    i9++;
                }
                this.f6145c.add(string);
                this.f6153k.m8654a(i7, string);
                interfaceC2052l2.mo8142a(this.f6153k);
                Abstracta abstractC2115aM8653a = this.f6153k.m8653a();
                abstractC2115aM8653a.m8324a(true);
                this.f6143a.m8375a(i7, abstractC2115aM8653a);
            }
            i7 = ((ClassK.f5857g.equals(interfaceC2052l2) || ClassK.f5854d.equals(interfaceC2052l2)) ? i7 + 1 : i7) + 1;
        }
    }

    protected void m8595a(ClassD c1877d) {
        Abstracta c2125k;
        ClassF c1841f = (ClassF) c1877d.m7684a(AttCode.ATTRIBUTE_NAME);
        if (c1841f != null) {
            ClassL c1847l = (ClassL) c1841f.m7634a(AttLocalVariableTable.ATTRIBUTE_NAME);
            if (c1847l != null) {
                boolean z = (c1877d.m7683a() & 8) != 0;
                for (ah c1830ah : c1847l.m7641a()) {
                    int iM7617e = c1830ah.m7617e();
                    int iM7613a = (z || iM7617e != 0) ? c1830ah.m7613a() : 0;
                    String strM7616d = c1830ah.m7616d();
                    String strM7615c = c1830ah.m7615c();
                    if (strM7616d.charAt(strM7616d.length() - 1) == ';') {
                        c2125k = new ClassJ(this.f6148f, iM7617e, iM7613a, this.f6148f.m8636a(strM7616d), strM7615c);
                    } else {
                        int iM8409d = ac.m8409d(strM7616d);
                        c2125k = iM8409d == 0 ? new ClassK(iM7617e, iM7613a, strM7616d, strM7615c) : new ClassJ(this.f6148f, iM7617e, iM7613a, this.f6149g.m8412a(strM7616d.substring(iM8409d)).mo8143a(iM8409d), strM7615c);
                    }
                    this.f6143a.m8375a(iM7617e, c2125k);
                    this.f6145c.add(strM7615c);
                    this.f6144b.add(strM7615c);
                }
            }
            ClassM c1848m = (ClassM) c1841f.m7634a(AttLocalVariableTypeTable.ATTRIBUTE_NAME);
            if (c1848m != null) {
                ag c2179ag = new ag(this.f6143a);
                for (ai c1831ai : c1848m.m7642a()) {
                    c2179ag.m8649a(c1831ai);
                    this.f6149g.m8412a(c1831ai.m7621d()).mo8142a(c2179ag);
                }
            }
        }
    }

    public void m8596a(Abstractn abstractC1978n) {
        abstractC1978n.mo7957a(this.f6155m);
    }

    public void m8597a(Abstractn abstractC1978n, Interfacel interfaceC2052l) {
        this.f6152j.m8605a(interfaceC2052l);
        abstractC1978n.mo7957a(this.f6152j);
    }

    public void m8598a(ClassU c2035u) {
        ClassB c2116b = this.f6146d;
        this.f6146d = new ClassB(this.f6146d, c2035u);
        c2116b.m8352a(this.f6146d);
    }

    public void m8599a(Abstracta abstractC2115a) {
        int iM8333d = abstractC2115a.m8333d();
        if (iM8333d < this.f6147e.length) {
            this.f6147e[iM8333d] = null;
            this.f6146d.m8358d(abstractC2115a);
        }
    }

    public boolean m8600a(String str) {
        return this.f6144b.contains(str);
    }

    public Interfacee m8601b() {
        return this.f6150h;
    }

    public Abstracta m8602b(int i, int i2, Abstractn abstractC1978n) {
        Abstracta abstractC2115aMo8343a;
        Abstracta abstractC2115aM8377b = this.f6143a.m8377b(i, i2);
        Class<?> cls = abstractC1978n.getClass();
        if (abstractC2115aM8377b == null) {
            abstractC2115aMo8343a = this.f6146d.mo8343a(i);
        } else {
            abstractC2115aMo8343a = this.f6146d.mo8343a(i);
            if (abstractC2115aMo8343a == null || abstractC2115aM8377b.m8335e() >= abstractC2115aMo8343a.m8335e()) {
                this.f6143a.m8372a(i, i2);
                abstractC2115aMo8343a = abstractC2115aM8377b;
            }
        }
        if (abstractC2115aMo8343a == null) {
            this.f6154l.m8652a(i, i2);
            if (cls == ClassB.class) {
                ((ClassB) abstractC1978n).m8306g().mo8368a(this.f6154l);
            } else {
                abstractC1978n.mo7963f().mo8142a(this.f6154l);
            }
            abstractC2115aMo8343a = this.f6154l.m8651a();
        } else if (cls == ClassB.class) {
            Abstracta abstractC2115aM8306g = ((ClassB) abstractC1978n).m8306g();
            if (abstractC2115aMo8343a.mo8329b(abstractC2115aM8306g)) {
                abstractC2115aMo8343a.mo8331c(abstractC2115aM8306g);
                abstractC2115aM8306g.mo8334d(abstractC2115aMo8343a);
            } else {
                this.f6154l.m8652a(i, i2);
                abstractC2115aM8306g.mo8368a(this.f6154l);
                abstractC2115aMo8343a = this.f6154l.m8651a();
            }
        } else if (cls == ad.class) {
            Interfacel interfaceC2052lK = abstractC2115aMo8343a.mo8370k();
            if (interfaceC2052lK.mo8145d() == 0 && interfaceC2052lK.mo8160m_()) {
                this.f6154l.m8652a(i, i2);
                abstractC1978n.mo7963f().mo8142a(this.f6154l);
                abstractC2115aMo8343a = this.f6154l.m8651a();
            } else {
                ((ad) abstractC1978n).mo7991a(abstractC2115aMo8343a.mo8370k());
            }
        } else {
            Interfacel interfaceC2052lMo7963f = abstractC1978n.mo7963f();
            if (abstractC2115aMo8343a.mo8325a(interfaceC2052lMo7963f)) {
                abstractC2115aMo8343a.mo8328b(interfaceC2052lMo7963f);
            } else {
                this.f6154l.m8652a(i, i2);
                interfaceC2052lMo7963f.mo8142a(this.f6154l);
                abstractC2115aMo8343a = this.f6154l.m8651a();
            }
            if (cls == ab.class) {
                this.f6146d.m8350a((ab) abstractC1978n, abstractC2115aMo8343a);
            }
        }
        abstractC2115aMo8343a.m8327b(i2);
        m8603b(abstractC2115aMo8343a);
        return abstractC2115aMo8343a;
    }

    protected void m8603b(Abstracta abstractC2115a) {
        int iM8333d = abstractC2115a.m8333d();
        if (iM8333d >= this.f6147e.length) {
            Abstracta[] abstractC2115aArr = this.f6147e;
            this.f6147e = new Abstracta[iM8333d * 2];
            System.arraycopy(abstractC2115aArr, 0, this.f6147e, 0, abstractC2115aArr.length);
        }
        this.f6147e[iM8333d] = abstractC2115a;
        if (abstractC2115a.m8318a() == null) {
            this.f6146d.m8351a(abstractC2115a);
        }
    }

    public void m8604c() {
        this.f6146d.m8354b();
        this.f6146d = this.f6146d.m8344a();
    }
}
