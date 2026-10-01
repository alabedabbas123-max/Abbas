package com.a.b.f;

import com.a.b.e.b.ac;
import com.a.b.e.b.ad;
import com.a.b.e.b.ClassO;
import com.a.b.e.b.ClassS;
import com.a.b.e.b.ClassU;
import com.a.b.e.b.ClassX;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;

class au implements Interfaceao {

    final Runnableas f3393a;

    private final aj f3394b;

    private final ClassU[] f3395c;

    private final HashSet f3396d = new HashSet();

    private final HashMap f3397e = new HashMap();

    private final aw f3398f = new aw(this);

    au(Runnableas runnableC1273as, aj c1264aj) {
        this.f3393a = runnableC1273as;
        this.f3394b = c1264aj;
        this.f3395c = runnableC1273as.f3390e[c1264aj.m5227e()];
        runnableC1273as.f3390e[c1264aj.m5227e()] = null;
    }

    private void m5321a(int i, ClassU c1194u) {
        int iM4894g = c1194u.m4894g();
        ClassO c1188oM4896i = c1194u.m4896i();
        this.f3395c[i] = c1194u;
        for (int length = this.f3395c.length - 1; length >= 0; length--) {
            if (iM4894g == this.f3395c[length].m4894g()) {
                this.f3395c[length] = c1194u;
            }
        }
        if (c1188oM4896i == null) {
            return;
        }
        this.f3393a.m5307a(c1194u);
        for (int length2 = this.f3395c.length - 1; length2 >= 0; length2--) {
            ClassU c1194u2 = this.f3395c[length2];
            if (iM4894g != c1194u2.m4894g() && c1188oM4896i.equals(c1194u2.m4896i())) {
                this.f3395c[length2] = c1194u2.m4886a((ClassO) null);
            }
        }
    }

    private void m5324b() {
        av c1276av = new av(this);
        BitSet bitSetM5231i = this.f3394b.m5231i();
        for (int iNextSetBit = bitSetM5231i.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSetM5231i.nextSetBit(iNextSetBit + 1)) {
            ((aj) this.f3393a.f3386a.m5297j().get(iNextSetBit)).m5214a(c1276av);
        }
    }

    public void m5326a() {
        this.f3394b.m5216a(this);
        m5324b();
        ArrayList arrayListM5222c = this.f3394b.m5222c();
        for (int size = arrayListM5222c.size() - 1; size >= 0; size--) {
            Abstractan abstractC1268an = (Abstractan) arrayListM5222c.get(size);
            Abstractan abstractC1268an2 = (Abstractan) this.f3397e.get(abstractC1268an);
            if (abstractC1268an2 != null) {
                arrayListM5222c.set(size, abstractC1268an2);
            } else if (abstractC1268an.mo5259i() && !this.f3396d.contains(abstractC1268an)) {
                arrayListM5222c.remove(size);
            }
        }
        boolean z = true;
        for (aj c1264aj : this.f3394b.m5208a()) {
            if (c1264aj != this.f3394b) {
                this.f3393a.f3390e[c1264aj.m5227e()] = z ? this.f3395c : Runnableas.m5314b(this.f3395c);
                z = false;
            }
        }
    }

    @Override
    public void mo5119a(ac c1257ac) {
        m5327a((Abstractan) c1257ac);
    }

    void m5327a(Abstractan abstractC1268an) {
        ClassU c1194uM5261o = abstractC1268an.m5261o();
        if (c1194uM5261o == null) {
            return;
        }
        int iM4894g = c1194uM5261o.m4894g();
        if (this.f3393a.m5311b(iM4894g)) {
            return;
        }
        abstractC1268an.m5257c(this.f3393a.f3387b);
        m5321a(iM4894g, abstractC1268an.m5261o());
        this.f3393a.f3387b++;
    }

    @Override
    public void mo5120a(ClassZ c1302z) {
        ClassU c1194uO = c1302z.m5261o();
        int iM4894g = c1194uO.m4894g();
        int iM4894g2 = c1302z.mo5171b().m4916b(0).m4894g();
        c1302z.mo5168a(this.f3398f);
        int iM4894g3 = c1302z.mo5171b().m4916b(0).m4894g();
        ClassO c1188oM4896i = this.f3395c[iM4894g2].m4896i();
        ClassO c1188oM4896i2 = c1194uO.m4896i();
        if (c1188oM4896i2 == null) {
            c1188oM4896i2 = c1188oM4896i;
        }
        ClassO c1188oM5305a = this.f3393a.m5305a(iM4894g3);
        boolean z = c1188oM5305a == null || c1188oM4896i2 == null || c1188oM4896i2.equals(c1188oM5305a);
        ClassU c1194uM4881b = ClassU.m4881b(iM4894g3, c1194uO.mo3825a(), c1188oM4896i2);
        if (!aa.m5159a() || (z && Runnableas.m5313b(c1188oM4896i2, c1188oM4896i) && this.f3393a.f3389d == 0)) {
            m5321a(iM4894g, c1194uM4881b);
            return;
        }
        if (z && c1188oM4896i == null && this.f3393a.f3389d == 0) {
            this.f3397e.put(c1302z, Abstractan.m5252a(new ClassS(ac.m4797s(c1194uM4881b), ad.f3049a, (ClassU) null, ClassX.m4909a(ClassU.m4877a(c1194uM4881b.m4894g(), c1194uM4881b.mo3825a(), c1188oM4896i2))), this.f3394b));
            m5321a(iM4894g, c1194uM4881b);
        } else {
            m5327a((Abstractan) c1302z);
            this.f3396d.add(c1302z);
        }
    }

    @Override
    public void mo5121b(ClassZ c1302z) {
        c1302z.mo5168a(this.f3398f);
        m5327a((Abstractan) c1302z);
    }
}
