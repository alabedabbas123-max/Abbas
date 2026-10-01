package com.a.b.f;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;

public final class ClassI {

    private final boolean f3417a;

    private final ap f3418b;

    private final ArrayList f3419c;

    private final ClassJ[] f3420d;

    private final ArrayList f3421e = new ArrayList();

    private final ClassH[] f3422f;

    private ClassI(ap c1270ap, ClassH[] c1284hArr, boolean z) {
        this.f3418b = c1270ap;
        this.f3422f = c1284hArr;
        this.f3417a = z;
        this.f3419c = c1270ap.m5297j();
        this.f3420d = new ClassJ[this.f3419c.size() + 2];
    }

    public static ClassI m5343a(ap c1270ap, ClassH[] c1284hArr, boolean z) {
        ClassI c1285i = new ClassI(c1270ap, c1284hArr, z);
        c1285i.m5346a();
        return c1285i;
    }

    private BitSet m5345a(aj c1264aj) {
        return this.f3417a ? c1264aj.m5231i() : c1264aj.m5230h();
    }

    private void m5346a() {
        int i;
        aj c1264ajM5293f = this.f3417a ? this.f3418b.m5293f() : this.f3418b.m5289d();
        if (c1264ajM5293f != null) {
            this.f3421e.add(c1264ajM5293f);
            this.f3422f[c1264ajM5293f.m5227e()].f3416b = c1264ajM5293f.m5227e();
        }
        this.f3418b.m5282a(this.f3417a, new ClassK(this, null));
        int size = this.f3421e.size() - 1;
        for (int i2 = size; i2 >= 2; i2--) {
            aj c1264aj = (aj) this.f3421e.get(i2);
            ClassJ c1286j = this.f3420d[c1264aj.m5227e()];
            BitSet bitSetM5345a = m5345a(c1264aj);
            for (int iNextSetBit = bitSetM5345a.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSetM5345a.nextSetBit(iNextSetBit + 1)) {
                aj c1264aj2 = (aj) this.f3419c.get(iNextSetBit);
                if (this.f3420d[c1264aj2.m5227e()] != null && (i = this.f3420d[m5349c(c1264aj2).m5227e()].f3423a) < c1286j.f3423a) {
                    c1286j.f3423a = i;
                }
            }
            this.f3420d[((aj) this.f3421e.get(c1286j.f3423a)).m5227e()].f3427e.add(c1264aj);
            c1286j.f3426d = c1286j.f3424b;
            ArrayList arrayList = this.f3420d[c1286j.f3424b.m5227e()].f3427e;
            while (!arrayList.isEmpty()) {
                aj c1264aj3 = (aj) arrayList.remove(arrayList.size() - 1);
                aj c1264ajM5349c = m5349c(c1264aj3);
                if (this.f3420d[c1264ajM5349c.m5227e()].f3423a < this.f3420d[c1264aj3.m5227e()].f3423a) {
                    this.f3422f[c1264aj3.m5227e()].f3416b = c1264ajM5349c.m5227e();
                } else {
                    this.f3422f[c1264aj3.m5227e()].f3416b = c1286j.f3424b.m5227e();
                }
            }
        }
        for (int i3 = 2; i3 <= size; i3++) {
            aj c1264aj4 = (aj) this.f3421e.get(i3);
            if (this.f3422f[c1264aj4.m5227e()].f3416b != ((aj) this.f3421e.get(this.f3420d[c1264aj4.m5227e()].f3423a)).m5227e()) {
                this.f3422f[c1264aj4.m5227e()].f3416b = this.f3422f[this.f3422f[c1264aj4.m5227e()].f3416b].f3416b;
            }
        }
    }

    private void m5347b(aj c1264aj) {
        if (this.f3420d[this.f3420d[c1264aj.m5227e()].f3426d.m5227e()].f3426d != null) {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            arrayList.add(c1264aj);
            while (!arrayList.isEmpty()) {
                int size = arrayList.size();
                ClassJ c1286j = this.f3420d[((aj) arrayList.get(size - 1)).m5227e()];
                aj c1264aj2 = c1286j.f3426d;
                ClassJ c1286j2 = this.f3420d[c1264aj2.m5227e()];
                if (!hashSet.add(c1264aj2) || c1286j2.f3426d == null) {
                    arrayList.remove(size - 1);
                    if (c1286j2.f3426d != null) {
                        aj c1264aj3 = c1286j2.f3425c;
                        if (this.f3420d[c1264aj3.m5227e()].f3423a < this.f3420d[c1286j.f3425c.m5227e()].f3423a) {
                            c1286j.f3425c = c1264aj3;
                        }
                        c1286j.f3426d = c1286j2.f3426d;
                    }
                } else {
                    arrayList.add(c1264aj2);
                }
            }
        }
    }

    private aj m5349c(aj c1264aj) {
        ClassJ c1286j = this.f3420d[c1264aj.m5227e()];
        if (c1286j.f3426d == null) {
            return c1264aj;
        }
        m5347b(c1264aj);
        return c1286j.f3425c;
    }
}
