package com.a.b.a.b;

import com.a.b.g.ClassD;
import com.a.b.g.ClassN;
import java.util.BitSet;

class ai {

    final ab f1805a;

    private BitSet f1806b;

    private BitSet f1807c;

    private int f1808d;

    ai(ab c0915ab, int i) {
        this.f1805a = c0915ab;
        this.f1808d = i;
        this.f1807c = new BitSet(c0915ab.f1783d);
        this.f1806b = new BitSet(c0915ab.f1783d);
        c0915ab.f1792m = true;
    }

    ai(ab c0915ab, int i, int i2) {
        this(c0915ab, i);
        m3883a(i2);
    }

    int m3882a() {
        return this.f1808d;
    }

    void m3883a(int i) {
        this.f1807c.set(i);
    }

    void m3884a(ClassQ c0945q, int[] iArr) {
        int iNextSetBit = this.f1806b.nextSetBit(0);
        while (iNextSetBit >= 0) {
            int iM5497b = this.f1805a.m3856c(iNextSetBit).m4814c().m5497b(0);
            ClassQ c0945qM4029a = c0945q.m4029a(this.f1808d, iNextSetBit);
            if (c0945qM4029a != null) {
                this.f1805a.m3838a(iM5497b, -1, null, c0945qM4029a, iArr);
            } else {
                ClassD.m5424b(iArr, iNextSetBit);
            }
            iNextSetBit = this.f1806b.nextSetBit(iNextSetBit + 1);
        }
    }

    ClassN m3885b() {
        ClassN c1316n = new ClassN(this.f1806b.size());
        int iNextSetBit = this.f1806b.nextSetBit(0);
        while (iNextSetBit >= 0) {
            c1316n.m5499c(this.f1805a.m3856c(iNextSetBit).m4814c().m5497b(0));
            iNextSetBit = this.f1806b.nextSetBit(iNextSetBit + 1);
        }
        c1316n.mo3944c_();
        return c1316n;
    }

    void m3886b(int i) {
        this.f1806b.set(i);
    }
}
