package com.a.b.f;

import com.a.b.e.b.Abstractj;
import com.a.b.e.b.aa;
import com.a.b.e.b.ac;
import com.a.b.e.b.af;
import com.a.b.e.b.ag;
import com.a.b.e.b.ClassH;
import com.a.b.e.b.ClassI;
import com.a.b.e.b.ClassR;
import com.a.b.e.b.ClassS;
import com.a.b.e.b.ClassU;
import com.a.b.e.b.ClassX;
import com.a.b.e.c.Abstracta;
import com.a.b.e.c.Abstractag;
import com.a.b.e.c.Abstractv;
import com.a.b.e.c.aa;
import com.a.b.e.c.ad;
import com.a.b.e.c.ae;
import com.a.b.e.c.ah;
import com.a.b.e.c.ClassZ;
import com.a.b.e.d.ClassB;
import com.a.b.e.d.ClassC;
import com.a.b.e.d.Interfaced;
import com.a.b.g.Interfacew;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ClassL {

    private final ap f3430a;

    private final int f3431b;

    private final ArrayList f3432c = new ArrayList();

    private ClassL(ap c1270ap) {
        this.f3430a = c1270ap;
        this.f3431b = c1270ap.m5294g();
    }

    private int m5350a(ClassU c1194u) {
        int i;
        int i2 = 0;
        while (true) {
            i = i2;
            if (i >= this.f3432c.size() || ((ClassP) this.f3432c.get(i)).f3438a.get(c1194u.m4894g())) {
                break;
            }
            i2 = i + 1;
        }
        return i;
    }

    private Abstractan m5351a(Abstractan abstractC1268an) {
        ArrayList arrayListM5222c = ((aj) this.f3430a.m5297j().get(abstractC1268an.m5262p().m5230h().nextSetBit(0))).m5222c();
        return (Abstractan) arrayListM5222c.get(arrayListM5222c.size() - 1);
    }

    private void m5353a() {
        for (ClassP c1292p : this.f3432c) {
            if (c1292p.f3442e && c1292p.f3439b == Enumq.NONE) {
                int iNextSetBit = c1292p.f3438a.nextSetBit(0);
                Abstractan abstractC1268anM5288c = this.f3430a.m5288c(iNextSetBit);
                Abstractan abstractC1268anM5351a = m5351a(abstractC1268anM5288c);
                int iMo5016j = ((Abstractv) abstractC1268anM5351a.mo5171b().m4916b(0).m4895h()).mo5016j();
                ArrayList arrayList = new ArrayList(iMo5016j);
                HashSet hashSet = new HashSet();
                m5358a(abstractC1268anM5288c, abstractC1268anM5351a, iMo5016j, arrayList);
                hashSet.add(abstractC1268anM5351a);
                hashSet.add(abstractC1268anM5288c);
                for (Abstractan abstractC1268an : this.f3430a.m5290d(iNextSetBit)) {
                    m5359a(abstractC1268an, abstractC1268anM5351a, arrayList, hashSet);
                    hashSet.add(abstractC1268an);
                }
                this.f3430a.m5281a(hashSet);
                this.f3430a.m5299l();
                am.m5245a(this.f3430a, this.f3431b);
                m5365b();
            }
        }
    }

    private void m5354a(ClassU c1194u, Abstractan abstractC1268an, ClassP c1292p, ArrayList arrayList) {
        switch (abstractC1268an.mo5173e().m4737a()) {
            case 2:
                c1292p.f3438a.set(abstractC1268an.m5261o().m4894g());
                arrayList.add(abstractC1268an.m5261o());
                return;
            case 7:
            case 8:
            case 43:
                if (c1292p.f3439b.compareTo(Enumq.METHOD) < 0) {
                    c1292p.f3439b = Enumq.METHOD;
                    return;
                }
                return;
            case 33:
            case 35:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                c1292p.f3439b = Enumq.INTER;
                return;
            case 38:
                if (abstractC1268an.mo5171b().m4916b(1).m4895h().mo3830f()) {
                    return;
                }
                c1292p.f3442e = false;
                return;
            case 39:
                if (!abstractC1268an.mo5171b().m4916b(2).m4895h().mo3830f()) {
                    c1292p.f3442e = false;
                }
                break;
            case 47:
                break;
            case 48:
                c1292p.f3439b = Enumq.GLOBAL;
                return;
            default:
                return;
        }
        if (abstractC1268an.mo5171b().m4916b(0).m4895h().mo3827c() == 9) {
            c1292p.f3442e = false;
            ClassX c1197xMo5171b = abstractC1268an.mo5171b();
            if (c1197xMo5171b.m4916b(0).m4894g() == c1194u.m4894g()) {
                int iM5350a = m5350a(c1197xMo5171b.m4916b(1));
                if (iM5350a != this.f3432c.size()) {
                    ClassP c1292p2 = (ClassP) this.f3432c.get(iM5350a);
                    m5363a(c1292p2, c1292p);
                    if (c1292p.f3439b.compareTo(c1292p2.f3439b) < 0) {
                        c1292p.f3439b = c1292p2.f3439b;
                        return;
                    }
                    return;
                }
                return;
            }
            int iM5350a2 = m5350a(c1197xMo5171b.m4916b(0));
            if (iM5350a2 != this.f3432c.size()) {
                ClassP c1292p3 = (ClassP) this.f3432c.get(iM5350a2);
                m5363a(c1292p, c1292p3);
                if (c1292p3.f3439b.compareTo(c1292p.f3439b) < 0) {
                    c1292p3.f3439b = c1292p.f3439b;
                }
            }
        }
    }

    private void m5355a(ClassU c1194u, ClassP c1292p) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c1194u);
        while (!arrayList.isEmpty()) {
            ClassU c1194u2 = (ClassU) arrayList.remove(arrayList.size() - 1);
            for (Abstractan abstractC1268an : this.f3430a.m5290d(c1194u2.m4894g())) {
                if (abstractC1268an.mo5173e() == null) {
                    m5360a(abstractC1268an, c1292p, arrayList);
                } else {
                    m5354a(c1194u2, abstractC1268an, c1292p, arrayList);
                }
            }
        }
    }

    private void m5356a(Abstractan abstractC1268an, ClassU c1194u, HashSet hashSet) {
        ae c1205ae = new ae(ClassH.f3067b);
        m5366b(abstractC1268an, ClassX.f3113a, null, 40, c1205ae);
        aj c1264ajM5262p = abstractC1268an.m5262p();
        aj c1264ajM5217b = c1264ajM5262p.m5217b(c1264ajM5262p.m5235m());
        Abstractan abstractC1268an2 = (Abstractan) c1264ajM5217b.m5222c().get(0);
        ClassU c1194uM4876a = ClassU.m4876a(this.f3430a.m5301n(), c1205ae);
        m5357a(abstractC1268an2, ClassX.f3113a, c1194uM4876a, 56, null);
        aj c1264ajM5217b2 = c1264ajM5217b.m5217b(c1264ajM5217b.m5235m());
        Abstractan abstractC1268an3 = (Abstractan) c1264ajM5217b2.m5222c().get(0);
        m5366b(abstractC1268an3, ClassX.m4910a(c1194uM4876a, c1194u), null, 52, new ClassZ(c1205ae, new aa(new ad("<init>"), new ad("(I)V"))));
        hashSet.add(abstractC1268an3);
        aj c1264ajM5217b3 = c1264ajM5217b2.m5217b(c1264ajM5217b2.m5235m());
        Abstractan abstractC1268an4 = (Abstractan) c1264ajM5217b3.m5222c().get(0);
        m5366b(abstractC1268an4, ClassX.m4909a(c1194uM4876a), null, 35, null);
        c1264ajM5217b3.m5210a(c1264ajM5217b3.m5233k(), this.f3430a.m5293f().m5227e());
        hashSet.add(abstractC1268an4);
    }

    private void m5357a(Abstractan abstractC1268an, ClassX c1197x, ClassU c1194u, int i, Abstracta abstractC1200a) {
        Abstractj abstractC1183jMo5174f = abstractC1268an.mo5174f();
        aa c1167aaM4767e = i == 56 ? ac.m4767e(c1194u.mo3825a()) : ac.m4749a(i, c1194u, c1197x, abstractC1200a);
        ClassZ c1302z = new ClassZ(abstractC1200a == null ? new ClassS(c1167aaM4767e, abstractC1183jMo5174f.m4841g(), c1194u, c1197x) : new ClassR(c1167aaM4767e, abstractC1183jMo5174f.m4841g(), c1194u, c1197x, abstractC1200a), abstractC1268an.m5262p());
        ArrayList arrayListM5222c = abstractC1268an.m5262p().m5222c();
        arrayListM5222c.add(arrayListM5222c.lastIndexOf(abstractC1268an), c1302z);
        this.f3430a.m5276a(c1302z);
    }

    private void m5358a(Abstractan abstractC1268an, Abstractan abstractC1268an2, int i, ArrayList arrayList) {
        ClassC c1236cMo3825a = abstractC1268an.m5261o().mo3825a();
        for (int i2 = 0; i2 < i; i2++) {
            Abstracta abstractC1200aM4975a = ah.m4975a(c1236cMo3825a.m5077u());
            ClassU c1194uM4876a = ClassU.m4876a(this.f3430a.m5301n(), (Abstractag) abstractC1200aM4975a);
            arrayList.add(c1194uM4876a);
            m5357a(abstractC1268an, ClassX.f3113a, c1194uM4876a, 5, abstractC1200aM4975a);
        }
    }

    private void m5359a(Abstractan abstractC1268an, Abstractan abstractC1268an2, ArrayList arrayList, HashSet hashSet) {
        int size = arrayList.size();
        switch (abstractC1268an.mo5173e().m4737a()) {
            case 34:
                Interfacew interfaceC1325wM4895h = abstractC1268an2.mo5171b().m4916b(0).m4895h();
                Abstractan abstractC1268anM5364b = m5364b(abstractC1268an);
                m5357a(abstractC1268anM5364b, ClassX.f3113a, abstractC1268anM5364b.m5261o(), 5, (Abstracta) interfaceC1325wM4895h);
                hashSet.add(abstractC1268anM5364b);
                break;
            case 38:
                Abstractan abstractC1268anM5364b2 = m5364b(abstractC1268an);
                ClassX c1197xMo5171b = abstractC1268an.mo5171b();
                int iMo5016j = ((Abstractv) c1197xMo5171b.m4916b(1).m4895h()).mo5016j();
                if (iMo5016j < size) {
                    ClassU c1194u = (ClassU) arrayList.get(iMo5016j);
                    m5357a(abstractC1268anM5364b2, ClassX.m4909a(c1194u), c1194u.m4890b(abstractC1268anM5364b2.m5261o().m4894g()), 2, null);
                } else {
                    m5356a(abstractC1268anM5364b2, c1197xMo5171b.m4916b(1), hashSet);
                    hashSet.add((Abstractan) abstractC1268anM5364b2.m5262p().m5222c().get(2));
                }
                hashSet.add(abstractC1268anM5364b2);
                break;
            case 39:
                ClassX c1197xMo5171b2 = abstractC1268an.mo5171b();
                int iMo5016j2 = ((Abstractv) c1197xMo5171b2.m4916b(2).m4895h()).mo5016j();
                if (iMo5016j2 < size) {
                    ClassU c1194uM4916b = c1197xMo5171b2.m4916b(0);
                    ClassU c1194uM4890b = c1194uM4916b.m4890b(((ClassU) arrayList.get(iMo5016j2)).m4894g());
                    m5357a(abstractC1268an, ClassX.m4909a(c1194uM4916b), c1194uM4890b, 2, null);
                    arrayList.set(iMo5016j2, c1194uM4890b.m4901n());
                } else {
                    m5356a(abstractC1268an, c1197xMo5171b2.m4916b(2), hashSet);
                }
                break;
            case 57:
                ArrayList arrayListM4835c = ((ClassI) abstractC1268an.mo5174f()).m4835c();
                for (int i = 0; i < size; i++) {
                    ClassU c1194uM4876a = ClassU.m4876a(((ClassU) arrayList.get(i)).m4894g(), (Interfaced) arrayListM4835c.get(i));
                    m5357a(abstractC1268an, ClassX.f3113a, c1194uM4876a, 5, (Abstracta) arrayListM4835c.get(i));
                    arrayList.set(i, c1194uM4876a);
                }
                break;
        }
    }

    private void m5360a(Abstractan abstractC1268an, ClassP c1292p, ArrayList arrayList) {
        int iM5350a = m5350a(abstractC1268an.m5261o());
        if (iM5350a == this.f3432c.size()) {
            c1292p.f3438a.set(abstractC1268an.m5261o().m4894g());
            arrayList.add(abstractC1268an.m5261o());
            return;
        }
        ClassP c1292p2 = (ClassP) this.f3432c.get(iM5350a);
        if (c1292p2 != c1292p) {
            c1292p.f3442e = false;
            c1292p.f3438a.or(c1292p2.f3438a);
            if (c1292p.f3439b.compareTo(c1292p2.f3439b) < 0) {
                c1292p.f3439b = c1292p2.f3439b;
            }
            m5367b(c1292p, c1292p2);
            this.f3432c.remove(iM5350a);
        }
    }

    public static void m5361a(ap c1270ap) {
        new ClassL(c1270ap).m5368c();
    }

    private void m5363a(ClassP c1292p, ClassP c1292p2) {
        if (!c1292p2.f3441d.contains(c1292p)) {
            c1292p2.f3441d.add(c1292p);
        }
        if (c1292p.f3440c.contains(c1292p2)) {
            return;
        }
        c1292p.f3440c.add(c1292p2);
    }

    private Abstractan m5364b(Abstractan abstractC1268an) {
        return (Abstractan) ((aj) this.f3430a.m5297j().get(abstractC1268an.m5262p().m5231i().nextSetBit(0))).m5222c().get(0);
    }

    private void m5365b() {
        for (int i = 0; i < this.f3430a.m5294g(); i++) {
            Abstractan abstractC1268anM5288c = this.f3430a.m5288c(i);
            if (abstractC1268anM5288c != null && abstractC1268anM5288c.mo5173e() != null && abstractC1268anM5288c.mo5173e().m4737a() == 2) {
                ArrayList[] arrayListArrM5300m = this.f3430a.m5300m();
                ClassU c1194uM4916b = abstractC1268anM5288c.mo5171b().m4916b(0);
                ClassU c1194uM5261o = abstractC1268anM5288c.m5261o();
                if (c1194uM4916b.m4894g() >= this.f3431b || c1194uM5261o.m4894g() >= this.f3431b) {
                    ClassM c1289m = new ClassM(this, c1194uM5261o, c1194uM4916b);
                    Iterator it = arrayListArrM5300m[c1194uM5261o.m4894g()].iterator();
                    while (it.hasNext()) {
                        ((Abstractan) it.next()).mo5168a(c1289m);
                    }
                }
            }
        }
    }

    private void m5366b(Abstractan abstractC1268an, ClassX c1197x, ClassU c1194u, int i, Abstracta abstractC1200a) {
        Abstractj abstractC1183jMo5174f = abstractC1268an.mo5174f();
        aa c1167aaM4749a = ac.m4749a(i, c1194u, c1197x, abstractC1200a);
        ClassZ c1302z = new ClassZ(abstractC1200a == null ? new ag(c1167aaM4749a, abstractC1183jMo5174f.m4841g(), c1197x, ClassB.f3210a) : new af(c1167aaM4749a, abstractC1183jMo5174f.m4841g(), c1197x, ClassB.f3210a, abstractC1200a), abstractC1268an.m5262p());
        ArrayList arrayListM5222c = abstractC1268an.m5262p().m5222c();
        arrayListM5222c.add(arrayListM5222c.lastIndexOf(abstractC1268an), c1302z);
        this.f3430a.m5276a(c1302z);
    }

    private void m5367b(ClassP c1292p, ClassP c1292p2) {
        for (ClassP c1292p3 : c1292p2.f3441d) {
            c1292p3.f3440c.remove(c1292p2);
            c1292p3.f3440c.add(c1292p);
            c1292p.f3441d.add(c1292p3);
        }
        for (ClassP c1292p4 : c1292p2.f3440c) {
            c1292p4.f3441d.remove(c1292p2);
            c1292p4.f3441d.add(c1292p);
            c1292p.f3440c.add(c1292p4);
        }
    }

    private void m5368c() {
        this.f3430a.m5275a(new ClassN(this));
        for (ClassP c1292p : this.f3432c) {
            if (c1292p.f3439b != Enumq.NONE) {
                for (ClassP c1292p2 : c1292p.f3440c) {
                    if (c1292p.f3439b.compareTo(c1292p2.f3439b) > 0) {
                        c1292p2.f3439b = c1292p.f3439b;
                    }
                }
            }
        }
        m5353a();
    }

    public void m5369c(Abstractan abstractC1268an) {
        int iM4737a = abstractC1268an.mo5173e().m4737a();
        ClassU c1194uM5261o = abstractC1268an.m5261o();
        if (iM4737a == 56 && c1194uM5261o.m4895h().mo3827c() == 9) {
            m5355a(c1194uM5261o, m5370d(abstractC1268an));
            return;
        }
        if (iM4737a == 3 && c1194uM5261o.m4895h().mo3827c() == 9) {
            ClassP c1292p = new ClassP(c1194uM5261o.m4894g(), this.f3431b, Enumq.NONE);
            this.f3432c.add(c1292p);
            m5355a(c1194uM5261o, c1292p);
        } else if (iM4737a == 55 && c1194uM5261o.m4895h().mo3827c() == 9) {
            ClassP c1292p2 = new ClassP(c1194uM5261o.m4894g(), this.f3431b, Enumq.NONE);
            this.f3432c.add(c1292p2);
            m5355a(c1194uM5261o, c1292p2);
        }
    }

    private ClassP m5370d(Abstractan abstractC1268an) {
        ClassP c1292p;
        ClassU c1194uM5261o = abstractC1268an.m5261o();
        Abstractan abstractC1268anM5351a = m5351a(abstractC1268an);
        switch (abstractC1268anM5351a.mo5173e().m4737a()) {
            case 5:
            case 40:
                c1292p = new ClassP(c1194uM5261o.m4894g(), this.f3431b, Enumq.NONE);
                break;
            case 38:
            case 43:
            case 45:
                ClassU c1194uM4916b = abstractC1268anM5351a.mo5171b().m4916b(0);
                int iM5350a = m5350a(c1194uM4916b);
                if (iM5350a != this.f3432c.size()) {
                    ClassP c1292p2 = (ClassP) this.f3432c.get(iM5350a);
                    c1292p2.f3438a.set(c1194uM5261o.m4894g());
                    return c1292p2;
                }
                c1292p = c1194uM4916b.mo3825a() != ClassC.f3259j ? new ClassP(c1194uM5261o.m4894g(), this.f3431b, Enumq.GLOBAL) : new ClassP(c1194uM5261o.m4894g(), this.f3431b, Enumq.NONE);
                break;
            case 41:
            case 42:
                if (!abstractC1268anM5351a.mo5171b().m4916b(0).m4895h().mo3830f()) {
                    c1292p = new ClassP(c1194uM5261o.m4894g(), this.f3431b, Enumq.GLOBAL);
                } else {
                    c1292p = new ClassP(c1194uM5261o.m4894g(), this.f3431b, Enumq.NONE);
                    c1292p.f3442e = true;
                }
                break;
            case 46:
                c1292p = new ClassP(c1194uM5261o.m4894g(), this.f3431b, Enumq.GLOBAL);
                break;
            default:
                return null;
        }
        this.f3432c.add(c1292p);
        return c1292p;
    }
}
