package com.a.b.f;

import com.a.b.e.b.ab;
import com.a.b.e.b.ClassU;
import com.a.b.g.Interfacem;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;

public class am {
    public static ap m5243a(ab c1168ab, int i, boolean z) {
        ap c1270apM5264a = ap.m5264a(c1168ab, i, z);
        m5244a(c1270apM5264a);
        m5246a(c1270apM5264a, ClassU.m5385a(c1270apM5264a), 0);
        new Runnableas(c1270apM5264a).run();
        c1270apM5264a.m5273a();
        return c1270apM5264a;
    }

    private static void m5244a(ap c1270ap) {
        m5249b(c1270ap);
        m5250c(c1270ap);
        m5251d(c1270ap);
    }

    public static void m5245a(ap c1270ap, int i) {
        m5246a(c1270ap, ClassU.m5385a(c1270ap), i);
        new Runnableas(c1270ap, i).run();
    }

    private static void m5246a(ap c1270ap, ClassV c1298v, int i) {
        ArrayList arrayListM5297j = c1270ap.m5297j();
        int size = arrayListM5297j.size();
        int iM5294g = c1270ap.m5294g() - i;
        ClassH[] c1284hArrM5342a = new ClassG(c1270ap).m5342a();
        BitSet[] bitSetArr = new BitSet[iM5294g];
        BitSet[] bitSetArr2 = new BitSet[iM5294g];
        for (int i2 = 0; i2 < iM5294g; i2++) {
            bitSetArr[i2] = new BitSet(size);
            bitSetArr2[i2] = new BitSet(size);
        }
        int size2 = arrayListM5297j.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Iterator it = ((aj) arrayListM5297j.get(i3)).m5222c().iterator();
            while (it.hasNext()) {
                ClassU c1194uM5261o = ((Abstractan) it.next()).m5261o();
                if (c1194uM5261o != null && c1194uM5261o.m4894g() - i >= 0) {
                    bitSetArr[c1194uM5261o.m4894g() - i].set(i3);
                }
            }
        }
        for (int i4 = 0; i4 < iM5294g; i4++) {
            BitSet bitSet = (BitSet) bitSetArr[i4].clone();
            while (true) {
                int iNextSetBit = bitSet.nextSetBit(0);
                if (iNextSetBit < 0) {
                    break;
                }
                bitSet.clear(iNextSetBit);
                Interfacem interfaceC1315mMo5413b = c1284hArrM5342a[iNextSetBit].f3415a.mo5413b();
                while (interfaceC1315mMo5413b.mo5415a()) {
                    int iMo5416b = interfaceC1315mMo5413b.mo5416b();
                    if (!bitSetArr2[i4].get(iMo5416b)) {
                        bitSetArr2[i4].set(iMo5416b);
                        int i5 = i4 + i;
                        ClassU c1194uM4928a = c1298v.m5388a(iMo5416b).m4928a(i5);
                        if (c1194uM4928a == null) {
                            ((aj) arrayListM5297j.get(iMo5416b)).m5209a(i5);
                        } else {
                            ((aj) arrayListM5297j.get(iMo5416b)).m5212a(c1194uM4928a);
                        }
                        if (!bitSetArr[i4].get(iMo5416b)) {
                            bitSet.set(iMo5416b);
                        }
                    }
                }
            }
        }
    }

    private static boolean m5247a(aj c1264aj) {
        return c1264aj.m5230h().cardinality() > 1 && c1264aj.m5231i().cardinality() > 1;
    }

    private static boolean m5248a(aj c1264aj, aj c1264aj2) {
        ArrayList arrayListM5222c = c1264aj.m5222c();
        Abstractan abstractC1268an = (Abstractan) arrayListM5222c.get(arrayListM5222c.size() - 1);
        if (c1264aj.m5231i().cardinality() <= 1 || c1264aj2.m5230h().cardinality() <= 1) {
            return (abstractC1268an.m5261o() != null || abstractC1268an.mo5171b().m5476d_() > 0) && c1264aj2.m5230h().cardinality() > 1;
        }
        return true;
    }

    private static void m5249b(ap c1270ap) {
        ArrayList arrayListM5297j = c1270ap.m5297j();
        for (int size = arrayListM5297j.size() - 1; size >= 0; size--) {
            aj c1264aj = (aj) arrayListM5297j.get(size);
            if (m5247a(c1264aj)) {
                c1264aj.m5238p();
            }
        }
    }

    private static void m5250c(ap c1270ap) {
        ArrayList arrayListM5297j = c1270ap.m5297j();
        for (int size = arrayListM5297j.size() - 1; size >= 0; size--) {
            aj c1264aj = (aj) arrayListM5297j.get(size);
            if (!c1264aj.m5240r() && c1264aj.m5230h().cardinality() > 1 && ((Abstractan) c1264aj.m5222c().get(0)).mo5260j()) {
                BitSet bitSet = (BitSet) c1264aj.m5230h().clone();
                for (int iNextSetBit = bitSet.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1)) {
                    ((aj) arrayListM5297j.get(iNextSetBit)).m5217b(c1264aj).m5222c().add(0, ((Abstractan) c1264aj.m5222c().get(0)).clone());
                }
                c1264aj.m5222c().remove(0);
            }
        }
    }

    private static void m5251d(ap c1270ap) {
        ArrayList arrayListM5297j = c1270ap.m5297j();
        for (int size = arrayListM5297j.size() - 1; size >= 0; size--) {
            aj c1264aj = (aj) arrayListM5297j.get(size);
            BitSet bitSet = (BitSet) c1264aj.m5231i().clone();
            for (int iNextSetBit = bitSet.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1)) {
                aj c1264aj2 = (aj) arrayListM5297j.get(iNextSetBit);
                if (m5248a(c1264aj, c1264aj2)) {
                    c1264aj.m5217b(c1264aj2);
                }
            }
        }
    }
}
