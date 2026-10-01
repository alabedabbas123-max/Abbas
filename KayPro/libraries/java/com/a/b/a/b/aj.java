package com.a.b.a.b;

import com.a.b.e.b.ClassB;
import com.a.b.g.ClassK;
import com.a.b.g.ClassN;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;

class aj {

    final ab f1809a;

    private final HashMap f1810b = new HashMap();

    private final BitSet f1811c;

    private int f1812d;

    private int f1813e;

    private final ah f1814f;

    private final ArrayList f1815g;

    aj(ab c0915ab, ah c0921ah, ArrayList arrayList) {
        this.f1809a = c0915ab;
        this.f1811c = new BitSet(c0915ab.f1783d);
        this.f1814f = c0921ah;
        this.f1815g = arrayList;
    }

    private int m3887a(int i) {
        Integer num = (Integer) this.f1810b.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        if (!m3889b(i, this.f1812d)) {
            return i;
        }
        int iMo3879a = this.f1814f.mo3879a();
        this.f1811c.set(i);
        this.f1810b.put(Integer.valueOf(i), Integer.valueOf(iMo3879a));
        while (this.f1815g.size() <= iMo3879a) {
            this.f1815g.add(null);
        }
        this.f1815g.set(iMo3879a, (ClassN) this.f1815g.get(i));
        return iMo3879a;
    }

    private void m3888a(int i, int i2) {
        ClassN c1316nM5493a;
        ClassB c1175bM3856c = this.f1809a.m3856c(i);
        ClassN c1316nM4814c = c1175bM3856c.m4814c();
        int i3 = -1;
        if (this.f1809a.m3847a(c1175bM3856c)) {
            c1316nM5493a = ClassN.m5494a(m3887a(c1316nM4814c.m5497b(0)), c1316nM4814c.m5497b(1));
        } else {
            ai c0922aiM3860e = this.f1809a.m3860e(i);
            if (c0922aiM3860e == null) {
                int iM4815d = c1175bM3856c.m4815d();
                int iM5496b = c1316nM4814c.m5496b();
                ClassN c1316n = new ClassN(iM5496b);
                int i4 = 0;
                while (i4 < iM5496b) {
                    int iM5497b = c1316nM4814c.m5497b(i4);
                    int iM3887a = m3887a(iM5497b);
                    c1316n.m5499c(iM3887a);
                    if (iM4815d != iM5497b) {
                        iM3887a = i3;
                    }
                    i4++;
                    i3 = iM3887a;
                }
                c1316n.mo3944c_();
                c1316nM5493a = c1316n;
            } else {
                if (c0922aiM3860e.f1808d != this.f1812d) {
                    throw new RuntimeException("ret instruction returns to label " + ClassK.m5485c(c0922aiM3860e.f1808d) + " expected: " + ClassK.m5485c(this.f1812d));
                }
                c1316nM5493a = ClassN.m5493a(this.f1813e);
                i3 = this.f1813e;
            }
        }
        this.f1809a.m3844a(new ClassB(i2, this.f1809a.m3837a(c1175bM3856c.m4813b()), c1316nM5493a, i3), (ClassN) this.f1815g.get(i2));
    }

    private boolean m3889b(int i, int i2) {
        ClassN c1316n = (ClassN) this.f1815g.get(i);
        return c1316n != null && c1316n.m5496b() > 0 && c1316n.m5501d() == i2;
    }

    void m3890a(ClassB c1175b) {
        this.f1813e = c1175b.m4814c().m5497b(0);
        this.f1812d = c1175b.m4814c().m5497b(1);
        int iM3887a = m3887a(this.f1812d);
        int iNextSetBit = this.f1811c.nextSetBit(0);
        while (iNextSetBit >= 0) {
            this.f1811c.clear(iNextSetBit);
            int iIntValue = ((Integer) this.f1810b.get(Integer.valueOf(iNextSetBit))).intValue();
            m3888a(iNextSetBit, iIntValue);
            if (this.f1809a.m3847a(this.f1809a.m3856c(iNextSetBit))) {
                new aj(this.f1809a, this.f1814f, this.f1815g).m3890a(this.f1809a.m3856c(iIntValue));
            }
            iNextSetBit = this.f1811c.nextSetBit(0);
        }
        this.f1809a.m3857c(new ClassB(c1175b.mo3961a(), c1175b.m4813b(), ClassN.m5493a(iM3887a), iM3887a), (ClassN) this.f1815g.get(c1175b.mo3961a()));
    }
}
