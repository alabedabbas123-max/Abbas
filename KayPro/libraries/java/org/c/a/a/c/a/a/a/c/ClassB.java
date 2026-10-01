package org.c.a.a.c.a.a.a.c;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import org.c.a.a.b.d.a.ClassP;
import org.c.a.a.b.d.a.ClassW;
import org.c.a.a.b.d.a.ClassX;
import org.c.a.a.b.d.a.ClassY;
import org.c.a.a.b.d.b.Abstractn;
import org.c.a.a.b.d.b.ab;
import org.c.a.a.b.d.b.ac;
import org.c.a.a.b.d.b.ClassG;
import org.c.a.a.b.d.b.ClassP;
import org.c.a.a.b.d.b.Interfacef;
import org.c.a.a.b.d.d.ClassH;
import org.c.a.a.b.d.d.ClassO;
import org.c.a.a.b.d.d.ClassU;
import org.c.a.a.b.d.d.Interfacer;
import org.c.a.a.b.d.e.ClassI;
import org.c.a.a.b.d.e.ClassK;
import org.c.a.a.b.d.e.Interfacel;
import org.c.a.a.c.a.a.a.b.b.ClassB;
import org.c.a.a.c.a.a.a.b.c.ClassC;
import org.c.a.a.c.a.a.d.ClassZ;
import org.c.a.a.d.ClassC;

public class ClassB {

    protected static final ClassC f6049a;

    static final boolean f6050h;

    protected ClassB f6054e;

    protected ClassU f6055f;

    protected Abstracta[] f6051b = new Abstracta[10];

    protected HashMap f6052c = null;

    protected ClassC f6053d = null;

    protected Abstracta f6056g = null;

    static {
        f6050h = !ClassB.class.desiredAssertionStatus();
        f6049a = new ClassC();
    }

    public ClassB(ClassB c2116b, ClassU c2035u) {
        this.f6054e = c2116b;
        this.f6055f = c2035u;
    }

    protected ClassY m8340a(ClassC c2247c, boolean z) {
        ClassY c1949y = new ClassY(c2247c.size());
        Iterator it = c2247c.iterator();
        while (it.hasNext()) {
            ClassG c1971g = (ClassG) it.next();
            ClassB c2107b = (ClassB) c1971g.m8000d();
            ClassX c1948x = new ClassX(c1971g.mo7970e(), c2107b.mo8033d(), c1971g.m8003j().getClass() == ac.class ? ((ac) c1971g.m8003j()).m7968d() : new ClassP(c1971g.m8003j()));
            if (z) {
                c1948x.m7947a(c2107b.m8306g().m8338h());
            }
            c1949y.add(c1948x);
        }
        return c1949y;
    }

    protected Abstractn m8341a(int i, HashSet hashSet, List list, Abstractn abstractC1978n) {
        if (abstractC1978n.getClass() == ClassG.class) {
            ClassG c1971g = (ClassG) abstractC1978n;
            if (c1971g.m8002i().equals("=")) {
                c1971g.m7999b(m8341a(i, hashSet, list, c1971g.m8003j()));
                if (c1971g.m8000d().getClass() == ClassB.class) {
                    ClassB c2107b = (ClassB) c1971g.m8000d();
                    Abstracta abstractC2115aM8306g = c2107b.m8306g();
                    if (hashSet.contains(abstractC2115aM8306g) && abstractC2115aM8306g.m8336f() <= i) {
                        list.add(c1971g);
                        return c2107b;
                    }
                }
            }
        }
        return abstractC1978n;
    }

    protected ClassO m8342a(HashSet hashSet, HashSet hashSet2, ClassG c1971g) {
        ClassB c2107b = (ClassB) c1971g.m8000d();
        Abstracta abstractC2115aM8306g = c2107b.m8306g();
        hashSet.remove(abstractC2115aM8306g);
        hashSet2.remove(abstractC2115aM8306g);
        abstractC2115aM8306g.m8324a(true);
        return new ClassO(abstractC2115aM8306g.mo8370k(), new ClassX(c1971g.mo7970e(), c2107b.mo8033d(), c1971g.m8003j().getClass() == ac.class ? ((ac) c1971g.m8003j()).m7968d() : new ClassP(c1971g.m8003j())));
    }

    public Abstracta mo8343a(int i) {
        Abstracta abstractC2115a;
        return (i >= this.f6051b.length || (abstractC2115a = this.f6051b[i]) == null) ? this.f6054e.mo8343a(i) : abstractC2115a;
    }

    public ClassB m8344a() {
        return this.f6054e;
    }

    public void m8345a(HashSet hashSet) {
        HashSet hashSet2 = new HashSet(hashSet);
        HashMap map = new HashMap();
        int length = this.f6051b.length;
        for (int i = 0; i < length; i++) {
            for (Abstracta abstractC2115aM8326b = this.f6051b[i]; abstractC2115aM8326b != null; abstractC2115aM8326b = abstractC2115aM8326b.m8326b()) {
                if (abstractC2115aM8326b.f6046g != null) {
                    hashSet2.add(abstractC2115aM8326b.f6046g);
                } else if (map.containsKey(abstractC2115aM8326b.mo8370k())) {
                    map.put(abstractC2115aM8326b.mo8370k(), Boolean.TRUE);
                } else {
                    map.put(abstractC2115aM8326b.mo8370k(), Boolean.FALSE);
                }
                if (!f6050h && abstractC2115aM8326b == abstractC2115aM8326b.m8326b()) {
                    throw new AssertionError();
                }
            }
        }
        if (this.f6056g != null) {
            if (map.containsKey(this.f6056g.mo8370k())) {
                map.put(this.f6056g.mo8370k(), Boolean.TRUE);
            } else {
                map.put(this.f6056g.mo8370k(), Boolean.FALSE);
            }
        }
        if (!map.isEmpty()) {
            ClassD c2118d = new ClassD(hashSet2, map);
            for (int i2 = 0; i2 < length; i2++) {
                for (Abstracta abstractC2115aM8326b2 = this.f6051b[i2]; abstractC2115aM8326b2 != null; abstractC2115aM8326b2 = abstractC2115aM8326b2.m8326b()) {
                    if (abstractC2115aM8326b2.f6046g == null) {
                        abstractC2115aM8326b2.mo8370k().mo8142a(c2118d);
                        abstractC2115aM8326b2.f6046g = c2118d.m8364a();
                    }
                }
            }
            if (this.f6056g != null) {
                this.f6056g.mo8370k().mo8142a(c2118d);
                this.f6056g.f6046g = c2118d.m8364a();
            }
        }
        if (this.f6053d != null) {
            Iterator it = this.f6053d.iterator();
            while (it.hasNext()) {
                ((ClassB) it.next()).m8345a(hashSet2);
            }
        }
    }

    protected void m8346a(HashSet hashSet, HashSet hashSet2, ListIterator listIterator, ClassH c2022h) {
        if (c2022h.m8093b().getClass() == ClassG.class) {
            ClassG c1971g = (ClassG) c2022h.m8093b();
            if (c1971g.m8002i().equals("=")) {
                ClassP c1980p = new ClassP();
                m8341a(Integer.MAX_VALUE, hashSet2, c1980p, c1971g);
                listIterator.remove();
                Iterator<E> it = c1980p.iterator();
                while (it.hasNext()) {
                    listIterator.add(m8342a(hashSet, hashSet2, (ClassG) it.next()));
                }
                if (c1980p.isEmpty() || c1980p.m8844d() != c1971g) {
                    listIterator.add(c2022h);
                }
            }
        }
    }

    protected void m8347a(HashSet hashSet, HashSet hashSet2, ClassC c2110c) {
        Interfacef interfaceC1970fD = c2110c.m8104d();
        if (interfaceC1970fD != null) {
            ClassP c1980p = new ClassP();
            int iM8312j = c2110c.m8312j();
            if (interfaceC1970fD.mo7867j_()) {
                for (Abstractn abstractC1978n : interfaceC1970fD.mo7868l_()) {
                    m8341a(iM8312j, hashSet2, c1980p, abstractC1978n);
                    if (c1980p.isEmpty() || c1980p.m8844d() != abstractC1978n) {
                        c1980p.add(abstractC1978n);
                    }
                }
            } else {
                m8341a(iM8312j, hashSet2, c1980p, (Abstractn) interfaceC1970fD);
                if (c1980p.isEmpty() || c1980p.m8844d() != interfaceC1970fD) {
                    c1980p.add((Abstractn) interfaceC1970fD.mo7865h());
                }
            }
            if (c1980p.size() == 1) {
                m8348a(hashSet, hashSet2, c2110c, (Abstractn) c1980p.m8846h());
            } else {
                m8349a(hashSet, hashSet2, c2110c, c1980p);
            }
        }
    }

    protected void m8348a(HashSet hashSet, HashSet hashSet2, ClassC c2110c, Abstractn abstractC1978n) {
        if (abstractC1978n.getClass() != ClassG.class) {
            return;
        }
        ClassG c1971g = (ClassG) abstractC1978n;
        if (c1971g.m8000d().getClass() == ClassB.class) {
            ClassB c2107b = (ClassB) c1971g.m8000d();
            Abstracta abstractC2115aM8306g = c2107b.m8306g();
            if (abstractC2115aM8306g.m8332c() || abstractC2115aM8306g.m8336f() > c2110c.m8312j()) {
                return;
            }
            hashSet.remove(abstractC2115aM8306g);
            hashSet2.remove(abstractC2115aM8306g);
            abstractC2115aM8306g.m8324a(true);
            c2110c.m8099a(new ClassW(abstractC2115aM8306g.mo8370k(), new ClassX(c1971g.mo7970e(), c2107b.mo8033d(), c1971g.m8003j().getClass() == ac.class ? ((ac) c1971g.m8003j()).m7968d() : new ClassP(c1971g.m8003j()))));
            c2110c.m8100a((Interfacef) null);
        }
    }

    protected void m8349a(HashSet hashSet, HashSet hashSet2, ClassC c2110c, ClassP c1980p) {
        int iMo8145d;
        int i;
        Interfacel interfaceC2052l;
        Interfacel interfaceC2052l2;
        ClassC c2247c = new ClassC();
        ClassC<Abstracta> c2247c2 = new ClassC();
        Interfacel interfaceC2052l3 = null;
        Interfacel interfaceC2052l4 = null;
        int i2 = 0;
        Iterator<E> it = c1980p.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Abstractn abstractC1978n = (Abstractn) it.next();
            if (abstractC1978n.getClass() != ClassG.class) {
                return;
            }
            ClassG c1971g = (ClassG) abstractC1978n;
            if (c1971g.m8000d().getClass() != ClassB.class) {
                return;
            }
            Abstracta abstractC2115aM8306g = ((ClassB) c1971g.m8000d()).m8306g();
            if (abstractC2115aM8306g.m8332c() || abstractC2115aM8306g.m8336f() > c2110c.m8312j()) {
                return;
            }
            if (interfaceC2052l4 == null) {
                Interfacel interfaceC2052lK = abstractC2115aM8306g.mo8370k();
                Interfacel interfaceC2052lMo8143a = interfaceC2052lK.mo8143a(0);
                iMo8145d = interfaceC2052lK.mo8145d();
                interfaceC2052l2 = interfaceC2052lMo8143a;
                interfaceC2052l = interfaceC2052lK;
                i = iMo8145d;
            } else {
                Interfacel interfaceC2052lK2 = abstractC2115aM8306g.mo8370k();
                if (!interfaceC2052l4.equals(interfaceC2052lK2) && !interfaceC2052l3.equals(interfaceC2052lK2.mo8143a(0))) {
                    return;
                }
                iMo8145d = interfaceC2052lK2.mo8145d();
                if (i3 > iMo8145d) {
                    i3 = iMo8145d;
                }
                if (i2 < iMo8145d) {
                    i = i3;
                    interfaceC2052l = interfaceC2052l4;
                    interfaceC2052l2 = interfaceC2052l3;
                } else {
                    iMo8145d = i2;
                    i = i3;
                    interfaceC2052l = interfaceC2052l4;
                    interfaceC2052l2 = interfaceC2052l3;
                }
            }
            c2247c2.add(abstractC2115aM8306g);
            c2247c.add(c1971g);
            interfaceC2052l3 = interfaceC2052l2;
            interfaceC2052l4 = interfaceC2052l;
            i3 = i;
            i2 = iMo8145d;
        }
        for (Abstracta abstractC2115a : c2247c2) {
            hashSet.remove(abstractC2115a);
            hashSet2.remove(abstractC2115a);
            abstractC2115a.m8324a(true);
        }
        if (i3 == i2) {
            c2110c.m8099a(new ClassW(interfaceC2052l4, m8340a(c2247c, false)));
        } else {
            c2110c.m8099a(new ClassW(interfaceC2052l3, m8340a(c2247c, true)));
        }
        c2110c.m8100a((Interfacef) null);
    }

    public void m8350a(ab c1954ab, Abstracta abstractC2115a) {
        if (this.f6052c == null) {
            this.f6052c = new HashMap();
        }
        this.f6052c.put(c1954ab, abstractC2115a);
    }

    public void m8351a(Abstracta abstractC2115a) {
        if (!f6050h && abstractC2115a.m8326b() != null) {
            throw new AssertionError();
        }
        int iM8333d = abstractC2115a.m8333d();
        if (iM8333d >= this.f6051b.length) {
            Abstracta[] abstractC2115aArr = this.f6051b;
            this.f6051b = new Abstracta[iM8333d * 2];
            System.arraycopy(abstractC2115aArr, 0, this.f6051b, 0, abstractC2115aArr.length);
        }
        Abstracta abstractC2115a2 = this.f6051b[iM8333d];
        if (abstractC2115a2 != abstractC2115a) {
            this.f6051b[iM8333d] = abstractC2115a;
            abstractC2115a.m8321a(abstractC2115a2);
            abstractC2115a.m8322a(this);
        }
    }

    public void m8352a(ClassB c2116b) {
        if (this.f6053d == null) {
            this.f6053d = new ClassC();
        }
        this.f6053d.add(c2116b);
    }

    protected ClassY m8353b(ClassC c2247c, boolean z) {
        ClassY c1949y = new ClassY(c2247c.size());
        Iterator it = c2247c.iterator();
        while (it.hasNext()) {
            ClassO c2029o = (ClassO) it.next();
            ClassX c1948x = (ClassX) c2029o.m7946e();
            if (z) {
                c1948x.m7947a(c2029o.m7945d().mo8145d());
            }
            c1949y.add(c1948x);
        }
        return c1949y;
    }

    public void m8354b() {
        if (this.f6052c != null) {
            for (Map.Entry entry : this.f6052c.entrySet()) {
                ClassI c2049i = (ClassI) ((ab) entry.getKey()).mo7963f();
                ClassI c2049i2 = (ClassI) ((Abstracta) entry.getValue()).mo8370k();
                if (c2049i.m8153k() == null && c2049i2.m8153k() != null) {
                    ((ab) entry.getKey()).m7961a(c2049i.mo8148a(c2049i2.m8153k()));
                }
            }
        }
    }

    public void m8355b(Abstracta abstractC2115a) {
        this.f6056g = abstractC2115a;
    }

    public void mo8356c() {
        boolean zM8359d = m8359d();
        m8361f();
        if (zM8359d) {
            m8362g();
        }
        if (this.f6053d != null) {
            Iterator it = this.f6053d.iterator();
            while (it.hasNext()) {
                ((ClassB) it.next()).mo8356c();
            }
        }
    }

    public void m8357c(Abstracta abstractC2115a) {
        int iM8333d = abstractC2115a.m8333d();
        Abstracta abstractC2115a2 = iM8333d < this.f6051b.length ? this.f6051b[iM8333d] : null;
        if (abstractC2115a2 != null && abstractC2115a2.getClass() != abstractC2115a.getClass()) {
            abstractC2115a2 = null;
        }
        if (abstractC2115a2 == null) {
            if (this.f6053d != null) {
                Iterator it = this.f6053d.iterator();
                while (it.hasNext()) {
                    ((ClassB) it.next()).m8357c(abstractC2115a);
                }
                return;
            }
            return;
        }
        if (abstractC2115a != abstractC2115a2) {
            Iterator it2 = abstractC2115a2.m8339i().iterator();
            while (it2.hasNext()) {
                ((Interfaceg) it2.next()).mo8304a(abstractC2115a);
            }
            abstractC2115a.m8339i().addAll(abstractC2115a2.m8339i());
            abstractC2115a.m8319a(abstractC2115a2.m8335e());
            if (!abstractC2115a.mo8329b(abstractC2115a2)) {
                Interfacel interfaceC2052lK = abstractC2115a.mo8370k();
                Interfacel interfaceC2052lK2 = abstractC2115a2.mo8370k();
                if (!f6050h && (interfaceC2052lK.mo8160m_() != interfaceC2052lK2.mo8160m_() || interfaceC2052lK.mo8154l() != interfaceC2052lK2.mo8154l() || interfaceC2052lK.mo8147f() != interfaceC2052lK2.mo8147f())) {
                    throw new AssertionError();
                }
                if (interfaceC2052lK.mo8160m_()) {
                    if (abstractC2115a2.mo8329b(abstractC2115a)) {
                        ((ClassK) abstractC2115a).m8382a((ClassK) interfaceC2052lK);
                    } else {
                        ((ClassK) abstractC2115a).m8382a(ClassK.f5856f);
                    }
                } else if (interfaceC2052lK.mo8154l()) {
                    if (abstractC2115a2.mo8329b(abstractC2115a)) {
                        ((ClassJ) abstractC2115a).m8381a((ClassI) interfaceC2052lK);
                    } else {
                        ((ClassJ) abstractC2115a).m8381a(ClassI.f5839l);
                    }
                }
            }
            this.f6051b[iM8333d] = abstractC2115a2.m8326b();
        }
    }

    public void m8358d(Abstracta abstractC2115a) {
        int iM8333d = abstractC2115a.m8333d();
        Abstracta abstractC2115a2 = (iM8333d >= this.f6051b.length || this.f6051b[iM8333d] != abstractC2115a) ? null : abstractC2115a;
        if (abstractC2115a2 != null) {
            this.f6051b[iM8333d] = abstractC2115a2.m8326b();
        } else if (this.f6053d != null) {
            Iterator it = this.f6053d.iterator();
            while (it.hasNext()) {
                ((ClassB) it.next()).m8358d(abstractC2115a);
            }
        }
    }

    protected boolean m8359d() {
        boolean z;
        HashMap mapM8360e = m8360e();
        if (mapM8360e.isEmpty()) {
            return false;
        }
        ClassZ c2204z = new ClassZ();
        boolean zM8680c = false;
        for (Map.Entry entry : mapM8360e.entrySet()) {
            ClassU c2035u = ((ClassB) entry.getKey()).f6055f;
            ListIterator listIterator = c2035u.listIterator();
            HashSet hashSet = (HashSet) entry.getValue();
            while (true) {
                if (!listIterator.hasNext()) {
                    z = zM8680c;
                    break;
                }
                Interfacer interfaceC2032r = (Interfacer) listIterator.next();
                c2204z.m8678a();
                interfaceC2032r.mo8055a(c2204z);
                zM8680c |= c2204z.m8680c();
                HashSet hashSetM8679b = c2204z.m8679b();
                hashSetM8679b.retainAll(hashSet);
                if (!hashSetM8679b.isEmpty()) {
                    int iNextIndex = listIterator.nextIndex();
                    Class<?> cls = interfaceC2032r.getClass();
                    if (cls == ClassH.class) {
                        m8346a(hashSet, hashSetM8679b, listIterator, (ClassH) interfaceC2032r);
                    } else if (cls == ClassC.class) {
                        m8347a(hashSet, hashSetM8679b, (ClassC) interfaceC2032r);
                    }
                    if (!hashSetM8679b.isEmpty()) {
                        int size = hashSetM8679b.size() + listIterator.nextIndex();
                        while (listIterator.nextIndex() >= iNextIndex) {
                            listIterator.previous();
                        }
                        ClassC<Abstracta> c2247c = new ClassC(hashSetM8679b);
                        Collections.sort(c2247c, f6049a);
                        for (Abstracta abstractC2115a : c2247c) {
                            listIterator.add(new ClassO(abstractC2115a.mo8370k(), new ClassX(abstractC2115a.mo8337g())));
                            hashSet.remove(abstractC2115a);
                        }
                        while (listIterator.nextIndex() < size) {
                            listIterator.next();
                        }
                    }
                }
                if (hashSet.isEmpty()) {
                    z = zM8680c;
                    break;
                }
            }
            if (!hashSet.isEmpty()) {
                ClassC<Abstracta> c2247c2 = new ClassC(hashSet);
                Collections.sort(c2247c2, f6049a);
                for (Abstracta abstractC2115a2 : c2247c2) {
                    c2035u.add(0, new ClassO(abstractC2115a2.mo8370k(), new ClassX(abstractC2115a2.mo8337g())));
                    abstractC2115a2.m8324a(true);
                }
            }
            zM8680c = z;
        }
        return zM8680c;
    }

    protected HashMap m8360e() {
        HashMap map = new HashMap();
        int length = this.f6051b.length;
        while (true) {
            int i = length - 1;
            if (length <= 0) {
                return map;
            }
            for (Abstracta abstractC2115aM8326b = this.f6051b[i]; abstractC2115aM8326b != null; abstractC2115aM8326b = abstractC2115aM8326b.m8326b()) {
                if (this == abstractC2115aM8326b.m8318a() && !abstractC2115aM8326b.m8332c()) {
                    HashSet hashSet = (HashSet) map.get(abstractC2115aM8326b.m8318a());
                    if (hashSet == null) {
                        HashSet hashSet2 = new HashSet();
                        hashSet2.add(abstractC2115aM8326b);
                        map.put(abstractC2115aM8326b.m8318a(), hashSet2);
                    } else {
                        hashSet.add(abstractC2115aM8326b);
                    }
                }
            }
            length = i;
        }
    }

    protected void m8361f() {
        int length = this.f6051b.length;
        while (true) {
            int i = length - 1;
            if (length <= 0) {
                return;
            }
            for (Abstracta abstractC2115aM8326b = this.f6051b[i]; abstractC2115aM8326b != null; abstractC2115aM8326b = abstractC2115aM8326b.m8326b()) {
                if (this != abstractC2115aM8326b.m8318a() && !abstractC2115aM8326b.m8332c()) {
                    this.f6055f.add(0, new ClassO(abstractC2115aM8326b.mo8370k(), new ClassX(abstractC2115aM8326b.mo8337g())));
                    abstractC2115aM8326b.m8324a(true);
                }
            }
            length = i;
        }
    }

    protected void m8362g() {
        Interfacer interfaceC2032r;
        if (this.f6055f.size() > 1) {
            ClassC c2247c = new ClassC();
            ListIterator listIterator = this.f6055f.listIterator();
            while (listIterator.hasNext()) {
                do {
                    interfaceC2032r = (Interfacer) listIterator.next();
                    if (interfaceC2032r.getClass() == ClassO.class) {
                        break;
                    }
                } while (listIterator.hasNext());
                if (interfaceC2032r.getClass() == ClassO.class) {
                    ClassO c2029o = (ClassO) interfaceC2032r;
                    Interfacel interfaceC2052lD = c2029o.m7945d();
                    Interfacel interfaceC2052lMo8143a = interfaceC2052lD.mo8143a(0);
                    int iMo8145d = interfaceC2052lD.mo8145d();
                    int iMo7900a = c2029o.m7946e().mo7900a();
                    c2247c.clear();
                    c2247c.add(c2029o);
                    int i = iMo8145d;
                    int i2 = iMo8145d;
                    while (listIterator.hasNext()) {
                        Interfacer interfaceC2032r2 = (Interfacer) listIterator.next();
                        if (interfaceC2032r2.getClass() == ClassO.class) {
                            ClassO c2029o2 = (ClassO) interfaceC2032r2;
                            iMo7900a = c2029o2.m7946e().mo7900a();
                            if (iMo7900a != iMo7900a && iMo7900a > 0) {
                                listIterator.previous();
                                break;
                            }
                            Interfacel interfaceC2052lD2 = c2029o2.m7945d();
                            int iMo8145d2 = interfaceC2052lD2.mo8145d();
                            if (!interfaceC2052lD.equals(interfaceC2052lD2)) {
                                if (!interfaceC2052lMo8143a.equals(interfaceC2052lD2.mo8143a(0))) {
                                    listIterator.previous();
                                    break;
                                }
                                if (i2 > iMo8145d2) {
                                    i2 = iMo8145d2;
                                }
                                if (i >= iMo8145d2) {
                                    iMo8145d2 = i;
                                }
                                c2247c.add(c2029o2);
                                i = iMo8145d2;
                            } else {
                                c2247c.add(c2029o2);
                            }
                        } else {
                            listIterator.previous();
                            break;
                        }
                    }
                    int size = c2247c.size();
                    if (size > 1) {
                        while (true) {
                            size--;
                            if (size <= 0) {
                                break;
                            }
                            listIterator.previous();
                            listIterator.remove();
                        }
                        listIterator.previous();
                        if (i2 == i) {
                            listIterator.set(new ClassO(interfaceC2052lD, m8353b(c2247c, false)));
                        } else {
                            listIterator.set(new ClassO(interfaceC2052lMo8143a, m8353b(c2247c, true)));
                        }
                        listIterator.next();
                    }
                }
            }
        }
    }
}
