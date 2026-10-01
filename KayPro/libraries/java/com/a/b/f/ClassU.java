package com.a.b.f;

import com.a.b.e.b.ClassU;
import com.a.b.e.b.ClassZ;
import com.a.b.g.ClassN;
import java.util.ArrayList;
import java.util.BitSet;

public class ClassU {

    private final ap f3454a;

    private final ArrayList f3455b;

    private final ClassV f3456c;

    private final BitSet f3457d;

    private ClassU(ap c1270ap) {
        if (c1270ap == null) {
            throw new NullPointerException("method == null");
        }
        ArrayList arrayListM5297j = c1270ap.m5297j();
        this.f3454a = c1270ap;
        this.f3455b = arrayListM5297j;
        this.f3456c = new ClassV(c1270ap);
        this.f3457d = new BitSet(arrayListM5297j.size());
    }

    private ClassV m5384a() {
        if (this.f3454a.m5294g() > 0) {
            int iM5287c = this.f3454a.m5287c();
            while (iM5287c >= 0) {
                this.f3457d.clear(iM5287c);
                m5386a(iM5287c);
                iM5287c = this.f3457d.nextSetBit(0);
            }
        }
        this.f3456c.mo3944c_();
        return this.f3456c;
    }

    public static ClassV m5385a(ap c1270ap) {
        return new ClassU(c1270ap).m5384a();
    }

    private void m5386a(int i) {
        ClassZ c1199zM4939e;
        ClassZ c1199zM5391b = this.f3456c.m5391b(i);
        aj c1264aj = (aj) this.f3455b.get(i);
        ArrayList arrayListM5222c = c1264aj.m5222c();
        int size = arrayListM5222c.size();
        if (i == this.f3454a.m5291e()) {
            return;
        }
        Abstractan abstractC1268an = (Abstractan) arrayListM5222c.get(size - 1);
        boolean z = (abstractC1268an.mo5174f().mo4807b().mo4148d_() != 0) && abstractC1268an.m5261o() != null;
        int i2 = size - 1;
        int i3 = 0;
        ClassZ c1199z = c1199zM5391b;
        while (i3 < size) {
            if (z && i3 == i2) {
                c1199z.mo3944c_();
                c1199zM4939e = c1199z.m4939e();
            } else {
                c1199zM4939e = c1199z;
            }
            Abstractan abstractC1268an2 = (Abstractan) arrayListM5222c.get(i3);
            ClassU c1194uMo5258g = abstractC1268an2.mo5258g();
            if (c1194uMo5258g == null) {
                ClassU c1194uM5261o = abstractC1268an2.m5261o();
                if (c1194uM5261o != null && c1199zM4939e.m4928a(c1194uM5261o.m4894g()) != null) {
                    c1199zM4939e.m4936c(c1199zM4939e.m4928a(c1194uM5261o.m4894g()));
                }
            } else {
                ClassU c1194uM4901n = c1194uMo5258g.m4901n();
                if (!c1194uM4901n.equals(c1199zM4939e.m4930a(c1194uM4901n))) {
                    ClassU c1194uM4929a = c1199zM4939e.m4929a(c1194uM4901n.m4896i());
                    if (c1194uM4929a != null && c1194uM4929a.m4894g() != c1194uM4901n.m4894g()) {
                        c1199zM4939e.m4936c(c1194uM4929a);
                    }
                    this.f3456c.m5390a(abstractC1268an2, c1194uM4901n);
                    c1199zM4939e.m4938d(c1194uM4901n);
                }
            }
            i3++;
            c1199z = c1199zM4939e;
        }
        c1199z.mo3944c_();
        ClassN c1316nM5232j = c1264aj.m5232j();
        int iM5496b = c1316nM5232j.m5496b();
        int iM5233k = c1264aj.m5233k();
        for (int i4 = 0; i4 < iM5496b; i4++) {
            int iM5497b = c1316nM5232j.m5497b(i4);
            if (this.f3456c.m5392b(iM5497b, iM5497b == iM5233k ? c1199z : c1199zM5391b)) {
                this.f3457d.set(iM5497b);
            }
        }
    }
}
