package com.a.b.f;

import com.a.b.e.b.aa;
import com.a.b.e.b.ac;
import com.a.b.e.b.ad;
import com.a.b.e.b.af;
import com.a.b.e.b.ClassR;
import com.a.b.e.b.ClassS;
import com.a.b.e.b.ClassU;
import com.a.b.e.b.ClassX;
import com.a.b.e.c.Abstractag;
import com.a.b.e.c.ad;
import com.a.b.e.d.ClassB;
import com.a.b.e.d.Interfaced;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ClassB {

    private final ap f3401a;

    private ClassB(ap c1270ap) {
        this.f3401a = c1270ap;
    }

    private void m5329a() {
        int iM5294g = this.f3401a.m5294g();
        ArrayList arrayListM5332b = m5332b();
        int iMin = Math.min(arrayListM5332b.size(), 5);
        aj c1264ajM5289d = this.f3401a.m5289d();
        HashMap map = new HashMap(iMin);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= iMin) {
                m5331a(map, iM5294g);
                return;
            }
            Abstractag abstractC1207ag = (Abstractag) arrayListM5332b.get(i2);
            ClassU c1194uM4876a = ClassU.m4876a(this.f3401a.m5301n(), abstractC1207ag);
            aa c1167aaM4770f = ac.m4770f(abstractC1207ag);
            if (c1167aaM4770f.m4740d() == 1) {
                c1264ajM5289d.m5211a(new ClassR(ac.m4770f(abstractC1207ag), ad.f3049a, c1194uM4876a, ClassX.f3113a, abstractC1207ag));
            } else {
                aj c1264ajM5289d2 = this.f3401a.m5289d();
                aj c1264ajM5235m = c1264ajM5289d2.m5235m();
                aj c1264ajM5217b = c1264ajM5289d2.m5217b(c1264ajM5235m);
                c1264ajM5217b.m5220b(new af(c1167aaM4770f, ad.f3049a, ClassX.f3113a, ClassB.f3210a, abstractC1207ag));
                c1264ajM5217b.m5217b(c1264ajM5235m).m5211a(new ClassS(ac.m4767e(c1194uM4876a.m4895h()), ad.f3049a, c1194uM4876a, ClassX.f3113a));
            }
            map.put(abstractC1207ag, c1194uM4876a);
            i = i2 + 1;
        }
    }

    public static void m5330a(ap c1270ap) {
        new ClassB(c1270ap).m5329a();
    }

    private void m5331a(HashMap map, int i) {
        ClassU c1194u;
        new HashSet();
        ArrayList[] arrayListArrM5300m = this.f3401a.m5300m();
        for (int i2 = 0; i2 < i; i2++) {
            Abstractan abstractC1268anM5288c = this.f3401a.m5288c(i2);
            if (abstractC1268anM5288c != null) {
                ClassU c1194uM5261o = abstractC1268anM5288c.m5261o();
                Interfaced interfaceC1237dM4895h = abstractC1268anM5288c.m5261o().m4895h();
                if (interfaceC1237dM4895h.mo3830f() && (c1194u = (ClassU) map.get((Abstractag) interfaceC1237dM4895h)) != null && !this.f3401a.m5283a(c1194uM5261o)) {
                    ClassD c1280d = new ClassD(this, c1194uM5261o, c1194u);
                    for (Abstractan abstractC1268an : arrayListArrM5300m[c1194uM5261o.m4894g()]) {
                        if (!abstractC1268an.mo5176k() || abstractC1268an.m5262p().m5231i().cardinality() <= 1) {
                            abstractC1268an.mo5168a(c1280d);
                        }
                    }
                }
            }
        }
    }

    private ArrayList m5332b() {
        int iM5294g = this.f3401a.m5294g();
        HashMap map = new HashMap();
        new HashSet();
        for (int i = 0; i < iM5294g; i++) {
            Abstractan abstractC1268anM5288c = this.f3401a.m5288c(i);
            if (abstractC1268anM5288c != null && abstractC1268anM5288c.mo5173e() != null) {
                ClassU c1194uM5261o = abstractC1268anM5288c.m5261o();
                Interfaced interfaceC1237dM4895h = c1194uM5261o.m4895h();
                if (interfaceC1237dM4895h.mo3830f()) {
                    Abstractag abstractC1207ag = (Abstractag) interfaceC1237dM4895h;
                    if (abstractC1268anM5288c.mo5173e().m4737a() == 56) {
                        ArrayList arrayListM5222c = ((aj) this.f3401a.m5297j().get(abstractC1268anM5288c.m5262p().m5230h().nextSetBit(0))).m5222c();
                        abstractC1268anM5288c = (Abstractan) arrayListM5222c.get(arrayListM5222c.size() - 1);
                    }
                    if (abstractC1268anM5288c.mo5176k()) {
                        boolean z = abstractC1207ag instanceof ad;
                    } else if (!this.f3401a.m5283a(c1194uM5261o)) {
                        Integer num = (Integer) map.get(abstractC1207ag);
                        if (num == null) {
                            map.put(abstractC1207ag, 1);
                        } else {
                            map.put(abstractC1207ag, Integer.valueOf(num.intValue() + 1));
                        }
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Integer) entry.getValue()).intValue() > 1) {
                arrayList.add((Abstractag) entry.getKey());
            }
        }
        Collections.sort(arrayList, new ClassC(this, map));
        return arrayList;
    }
}
