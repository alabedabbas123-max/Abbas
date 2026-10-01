package com.a.b.f.a;

import com.a.b.e.b.Abstractf;
import com.a.b.e.b.aa;
import com.a.b.e.b.ClassO;
import com.a.b.e.b.ClassU;
import com.a.b.e.b.ClassX;
import com.a.b.e.c.ClassP;
import com.a.b.f.Abstractag;
import com.a.b.f.Abstractan;
import com.a.b.f.ac;
import com.a.b.f.aj;
import com.a.b.f.ap;
import com.a.b.f.ClassR;
import com.a.b.f.ClassZ;
import com.a.b.g.Interfacem;
import com.a.b.g.Interfaceo;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ClassA extends Abstractl {

    private final Map f3285c;

    private final ArrayList f3286d;

    private final ArrayList f3287e;

    private final ArrayList f3288f;

    private final BitSet f3289g;

    private final ClassR f3290h;

    private final int f3291i;

    private final BitSet f3292j;

    private final BitSet f3293k;

    private final boolean f3294l;

    public ClassA(ap c1270ap, ClassI c1248i, boolean z) {
        super(c1270ap, c1248i);
        this.f3289g = new BitSet(c1270ap.m5294g());
        this.f3290h = new ClassR(c1248i, c1270ap.m5294g());
        this.f3294l = z;
        this.f3291i = c1270ap.m5295h();
        this.f3292j = new BitSet(this.f3291i * 2);
        this.f3292j.set(0, this.f3291i);
        this.f3293k = new BitSet(this.f3291i * 2);
        this.f3285c = new TreeMap();
        this.f3286d = new ArrayList();
        this.f3287e = new ArrayList();
        this.f3288f = new ArrayList();
    }

    private int m5082a(int i, int i2, Enumc enumC1242c) {
        int iMo5122a = enumC1242c.mo5122a(this.f3292j, i);
        while (true) {
            int i3 = 1;
            while (i3 < i2 && !this.f3292j.get(iMo5122a + i3)) {
                i3++;
            }
            if (i3 == i2) {
                return iMo5122a;
            }
            iMo5122a = enumC1242c.mo5122a(this.f3292j, iMo5122a + i3);
        }
    }

    private int m5083a(int i, ClassZ c1302z, int[] iArr, BitSet bitSet) {
        ClassX c1197xMo5171b = c1302z.mo5171b();
        int iD_ = c1197xMo5171b.m5476d_();
        int i2 = 0;
        ClassX c1197xM5115a = m5115a(c1302z.m5262p().m5239q());
        BitSet bitSet2 = new BitSet(this.f3321a.m5294g());
        int i3 = i;
        for (int i4 = 0; i4 < iD_; i4++) {
            ClassU c1194uM4916b = c1197xMo5171b.m4916b(i4);
            int iM4894g = c1194uM4916b.m4894g();
            int i5 = iArr[i4];
            if (i4 != 0) {
                i3 += iArr[i4 - 1];
            }
            if (this.f3289g.get(iM4894g) && this.f3290h.m5079a(iM4894g) == i3) {
                i2 += i5;
            } else {
                if (m5097b(i3, i5)) {
                    return -1;
                }
                if (this.f3289g.get(iM4894g) || !m5090a(c1194uM4916b, i3) || bitSet2.get(iM4894g)) {
                    if (this.f3290h.m5374a(c1197xM5115a, i3, i5) || this.f3290h.m5374a(c1197xMo5171b, i3, i5)) {
                        return -1;
                    }
                    bitSet.set(i4);
                } else {
                    i2 += i5;
                }
            }
            bitSet2.set(iM4894g);
        }
        return i2;
    }

    private int m5084a(ClassZ c1302z, int i, int[] iArr, BitSet bitSet) {
        Enumc enumC1242c;
        int i2 = 0;
        Enumc enumC1242c2 = Enumc.f3298c;
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            if (i5 == 2) {
                if (m5110f(i4)) {
                    i3++;
                } else {
                    i2++;
                }
                i4 += 2;
            } else {
                i4++;
            }
        }
        if (i2 > i3) {
            enumC1242c = m5110f(this.f3291i) ? Enumc.f3297b : Enumc.f3296a;
        } else if (i3 > 0) {
            enumC1242c = m5110f(this.f3291i) ? Enumc.f3296a : Enumc.f3297b;
        } else {
            enumC1242c = enumC1242c2;
        }
        int i6 = this.f3291i;
        while (true) {
            int iM5082a = m5082a(i6, i, enumC1242c);
            if (m5083a(iM5082a, c1302z, iArr, bitSet) >= 0) {
                return iM5082a;
            }
            i6 = iM5082a + 1;
            bitSet.clear();
        }
    }

    private void m5086a(int i, int i2) {
        this.f3292j.set(i, i + i2, true);
    }

    private void m5087a(ac c1257ac) {
        ClassU c1194uO = c1257ac.m5261o();
        int iM4894g = c1194uO.m4894g();
        int iM4898k = c1194uO.m4898k();
        ClassX c1197xMo5171b = c1257ac.mo5171b();
        int iD_ = c1197xMo5171b.m5476d_();
        ArrayList arrayList = new ArrayList();
        ClassG c1246g = new ClassG(iD_ + 1);
        if (this.f3289g.get(iM4894g)) {
            c1246g.m5124a(this.f3290h.m5079a(iM4894g));
        } else {
            arrayList.add(c1194uO);
        }
        for (int i = 0; i < iD_; i++) {
            ClassU c1194uM5261o = this.f3321a.m5288c(c1197xMo5171b.m4916b(i).m4894g()).m5261o();
            int iM4894g2 = c1194uM5261o.m4894g();
            if (this.f3289g.get(iM4894g2)) {
                c1246g.m5124a(this.f3290h.m5079a(iM4894g2));
            } else {
                arrayList.add(c1194uM5261o);
            }
        }
        for (int i2 = 0; i2 < c1246g.m5125b(); i2++) {
            m5093a(arrayList, c1246g.m5123a(), iM4898k, false);
        }
        int iM5099c = m5099c(this.f3291i, iM4898k);
        while (!m5093a(arrayList, iM5099c, iM4898k, false)) {
            iM5099c = m5099c(iM5099c + 1, iM4898k);
        }
    }

    private void m5088a(ClassZ c1302z) {
        int iM5094b = m5094b(c1302z);
        ClassX c1197xMo5171b = c1302z.mo5171b();
        int iD_ = c1197xMo5171b.m5476d_();
        int i = 0;
        int i2 = iM5094b;
        while (i < iD_) {
            ClassU c1194uM4916b = c1197xMo5171b.m4916b(i);
            int iM4894g = c1194uM4916b.m4894g();
            int iM4898k = c1194uM4916b.m4898k();
            int i3 = i2 + iM4898k;
            if (!this.f3289g.get(iM4894g)) {
                ClassO c1188oM5106e = m5106e(iM4894g);
                m5096b(c1194uM4916b, i2);
                if (c1188oM5106e != null) {
                    m5086a(i2, iM4898k);
                    ArrayList arrayList = (ArrayList) this.f3285c.get(c1188oM5106e);
                    int size = arrayList.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        ClassU c1194u = (ClassU) arrayList.get(i4);
                        if (-1 == c1197xMo5171b.m4918c(c1194u.m4894g())) {
                            m5091a(c1194u, i2, iM4898k);
                        }
                    }
                }
            }
            i++;
            i2 = i3;
        }
    }

    private boolean m5090a(ClassU c1194u, int i) {
        return (m5108e(i, c1194u.m4898k()) || this.f3290h.m5373a(c1194u, i)) ? false : true;
    }

    private boolean m5091a(ClassU c1194u, int i, int i2) {
        if (c1194u.m4898k() > i2 || this.f3289g.get(c1194u.m4894g()) || !m5090a(c1194u, i)) {
            return false;
        }
        m5096b(c1194u, i);
        return true;
    }

    private boolean m5092a(ArrayList arrayList, int i) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ClassU c1194u = (ClassU) it.next();
            if (!this.f3289g.get(c1194u.m4894g()) && !m5090a(c1194u, i)) {
                return false;
            }
        }
        return true;
    }

    private boolean m5093a(ArrayList arrayList, int i, int i2, boolean z) {
        Iterator it = arrayList.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            ClassU c1194u = (ClassU) it.next();
            if (!this.f3289g.get(c1194u.m4894g())) {
                boolean zM5091a = m5091a(c1194u, i, i2);
                z2 = !zM5091a || z2;
                if (zM5091a && z) {
                    m5086a(i, c1194u.m4898k());
                }
            }
        }
        return !z2;
    }

    private int m5094b(ClassZ c1302z) {
        int iA;
        BitSet bitSet;
        int iM5083a;
        ClassX c1197xMo5171b = c1302z.mo5171b();
        int iD_ = c1197xMo5171b.m5476d_();
        int[] iArr = new int[iD_];
        int i = 0;
        int i2 = 0;
        while (i < iD_) {
            iArr[i] = c1197xMo5171b.m4916b(i).m4898k();
            int i3 = iArr[i] + i2;
            i++;
            i2 = i3;
        }
        int i4 = 0;
        BitSet bitSet2 = null;
        int iM5084a = -1;
        int i5 = Integer.MIN_VALUE;
        for (int i6 = 0; i6 < iD_; i6++) {
            int iM4894g = c1197xMo5171b.m4916b(i6).m4894g();
            if (i6 != 0) {
                i4 -= iArr[i6 - 1];
            }
            if (this.f3289g.get(iM4894g) && (iA = this.f3290h.m5079a(iM4894g) + i4) >= 0 && !m5108e(iA, i2) && (iM5083a = m5083a(iA, c1302z, iArr, (bitSet = new BitSet(iD_)))) >= 0) {
                int iCardinality = iM5083a - bitSet.cardinality();
                if (iCardinality > i5) {
                    bitSet2 = bitSet;
                    iM5084a = iA;
                    i5 = iCardinality;
                }
                if (iM5083a == i2) {
                    break;
                }
            }
        }
        if (iM5084a == -1) {
            bitSet2 = new BitSet(iD_);
            iM5084a = m5084a(c1302z, i2, iArr, bitSet2);
        }
        for (int iNextSetBit = bitSet2.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSet2.nextSetBit(iNextSetBit + 1)) {
            c1302z.m5400a(iNextSetBit, m5142a(c1302z, c1197xMo5171b.m4916b(iNextSetBit)));
        }
        return iM5084a;
    }

    private void m5096b(ClassU c1194u, int i) {
        int iM4894g = c1194u.m4894g();
        if (this.f3289g.get(iM4894g) || !m5090a(c1194u, i)) {
            throw new RuntimeException("attempt to add invalid register mapping");
        }
        int iM4898k = c1194u.m4898k();
        this.f3290h.mo5081a(c1194u.m4894g(), i, iM4898k);
        this.f3289g.set(iM4894g);
        this.f3293k.set(i, iM4898k + i);
    }

    private boolean m5097b(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            if (this.f3292j.get(i3)) {
                return true;
            }
        }
        return false;
    }

    private int m5098c(int i) {
        aa c1167aaMo5173e;
        Abstractan abstractC1268anM5288c = this.f3321a.m5288c(i);
        if (abstractC1268anM5288c == null || (c1167aaMo5173e = abstractC1268anM5288c.mo5173e()) == null || c1167aaMo5173e.m4737a() != 3) {
            return -1;
        }
        return ((ClassP) ((Abstractf) abstractC1268anM5288c.mo5174f()).m4833g_()).m5002i_();
    }

    private int m5099c(int i, int i2) {
        return m5082a(i, i2, m5103d(i2));
    }

    private void m5101c() {
        int i;
        int i2;
        for (ArrayList arrayList : this.f3285c.values()) {
            int size = arrayList.size();
            int i3 = -1;
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    i = i3;
                    i2 = 0;
                    break;
                }
                ClassU c1194u = (ClassU) arrayList.get(i4);
                int iM5098c = m5098c(c1194u.m4894g());
                if (iM5098c >= 0) {
                    int iM4898k = c1194u.m4898k();
                    m5096b(c1194u, iM5098c);
                    i2 = iM4898k;
                    i = iM5098c;
                    break;
                }
                i4++;
                i3 = iM5098c;
            }
            if (i >= 0) {
                m5093a(arrayList, i, i2, true);
            }
        }
    }

    private int m5102d(int i, int i2) {
        Enumc enumC1242cM5103d = m5103d(i2);
        int iMo5122a = enumC1242cM5103d.mo5122a(this.f3293k, i);
        while (true) {
            int i3 = 1;
            while (i3 < i2 && !this.f3293k.get(iMo5122a + i3)) {
                i3++;
            }
            if (i3 == i2) {
                return iMo5122a;
            }
            iMo5122a = enumC1242cM5103d.mo5122a(this.f3293k, iMo5122a + i3);
        }
    }

    private Enumc m5103d(int i) {
        Enumc enumC1242c = Enumc.f3298c;
        if (i == 2) {
            return m5110f(this.f3291i) ? Enumc.f3296a : Enumc.f3297b;
        }
        return enumC1242c;
    }

    private void m5105d() {
        for (ArrayList arrayList : this.f3285c.values()) {
            boolean z = false;
            int i = this.f3291i;
            while (true) {
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 1;
                while (i2 < size) {
                    ClassU c1194u = (ClassU) arrayList.get(i2);
                    int iM4898k = c1194u.m4898k();
                    i2++;
                    i3 = (this.f3289g.get(c1194u.m4894g()) || iM4898k <= i3) ? i3 : iM4898k;
                }
                int iM5102d = m5102d(i, i3);
                boolean zM5093a = m5092a(arrayList, iM5102d) ? m5093a(arrayList, iM5102d, i3, true) : z;
                int i4 = iM5102d + 1;
                if (!zM5093a) {
                    i = i4;
                    z = zM5093a;
                }
            }
        }
    }

    private ClassO m5106e(int i) {
        for (Map.Entry entry : this.f3285c.entrySet()) {
            Iterator it = ((ArrayList) entry.getValue()).iterator();
            while (it.hasNext()) {
                if (((ClassU) it.next()).m4894g() == i) {
                    return (ClassO) entry.getKey();
                }
            }
        }
        return null;
    }

    private void m5107e() {
        int iM5294g = this.f3321a.m5294g();
        for (int i = 0; i < iM5294g; i++) {
            if (!this.f3289g.get(i)) {
                int iM5098c = m5098c(i);
                ClassU c1194uB = m5143b(i);
                if (iM5098c >= 0) {
                    m5096b(c1194uB, iM5098c);
                }
            }
        }
    }

    private boolean m5108e(int i, int i2) {
        return i < this.f3291i && i + i2 > this.f3291i;
    }

    private void m5109f() {
        Iterator it = this.f3287e.iterator();
        while (it.hasNext()) {
            m5088a((ClassZ) it.next());
        }
    }

    public static boolean m5110f(int i) {
        return (i & 1) == 0;
    }

    private void m5111g() {
        for (ClassZ c1302z : this.f3286d) {
            ClassU c1194uO = c1302z.m5261o();
            int iM4894g = c1194uO.m4894g();
            BitSet bitSetM5230h = c1302z.m5262p().m5230h();
            if (bitSetM5230h.cardinality() == 1) {
                ArrayList arrayListM5222c = ((aj) this.f3321a.m5297j().get(bitSetM5230h.nextSetBit(0))).m5222c();
                Abstractan abstractC1268an = (Abstractan) arrayListM5222c.get(arrayListM5222c.size() - 1);
                if (abstractC1268an.mo5173e().m4737a() == 43) {
                    ClassU c1194uM4916b = abstractC1268an.mo5171b().m4916b(0);
                    int iM4894g2 = c1194uM4916b.m4894g();
                    int iM4898k = c1194uM4916b.m4898k();
                    boolean zM5091a = this.f3289g.get(iM4894g);
                    boolean z = this.f3289g.get(iM4894g2);
                    boolean zM5091a2 = (!z) & zM5091a ? m5091a(c1194uM4916b, this.f3290h.m5079a(iM4894g), iM4898k) : z;
                    if ((!zM5091a) & zM5091a2) {
                        zM5091a = m5091a(c1194uO, this.f3290h.m5079a(iM4894g2), iM4898k);
                    }
                    if (!zM5091a || !zM5091a2) {
                        int iM5099c = m5099c(this.f3291i, iM4898k);
                        ArrayList arrayList = new ArrayList(2);
                        arrayList.add(c1194uO);
                        arrayList.add(c1194uM4916b);
                        while (!m5093a(arrayList, iM5099c, iM4898k, false)) {
                            iM5099c = m5099c(iM5099c + 1, iM4898k);
                        }
                    }
                    boolean z2 = abstractC1268an.mo5174f().mo4807b().mo4148d_() != 0;
                    int iA = this.f3290h.m5079a(iM4894g);
                    if (iA != this.f3290h.m5079a(iM4894g2) && !z2) {
                        ((ClassZ) abstractC1268an).m5400a(0, m5142a(abstractC1268an, c1194uM4916b));
                        m5096b(abstractC1268an.mo5171b().m4916b(0), iA);
                    }
                }
            }
        }
    }

    private void m5112h() {
        Iterator it = this.f3288f.iterator();
        while (it.hasNext()) {
            m5087a((ac) it.next());
        }
    }

    private void m5113i() {
        ClassU c1194uB;
        int iM5294g = this.f3321a.m5294g();
        for (int i = 0; i < iM5294g; i++) {
            if (!this.f3289g.get(i) && (c1194uB = m5143b(i)) != null) {
                int iM4898k = c1194uB.m4898k();
                int iM5099c = m5099c(this.f3291i, iM4898k);
                while (!m5090a(c1194uB, iM5099c)) {
                    iM5099c = m5099c(iM5099c + 1, iM4898k);
                }
                m5096b(c1194uB, iM5099c);
            }
        }
    }

    private void m5114j() {
        this.f3321a.m5280a(new ClassB(this));
    }

    ClassX m5115a(Interfaceo interfaceC1317o) {
        ClassX c1197x = new ClassX(interfaceC1317o.mo5410a());
        Interfacem interfaceC1315mMo5413b = interfaceC1317o.mo5413b();
        int i = 0;
        while (interfaceC1315mMo5413b.mo5415a()) {
            c1197x.m4915a(i, m5143b(interfaceC1315mMo5413b.mo5416b()));
            i++;
        }
        return c1197x;
    }

    @Override
    public boolean mo5116a() {
        return true;
    }

    @Override
    public Abstractag mo5117b() {
        m5114j();
        m5101c();
        m5107e();
        m5109f();
        m5105d();
        m5111g();
        m5112h();
        m5113i();
        return this.f3290h;
    }
}
