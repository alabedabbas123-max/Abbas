package com.a.b.f;

import java.util.ArrayList;
import java.util.BitSet;

public class ClassG {

    private final ap f3412a;

    private final ArrayList f3413b;

    private final ClassH[] f3414c;

    public ClassG(ap c1270ap) {
        this.f3412a = c1270ap;
        this.f3413b = c1270ap.m5297j();
        int size = this.f3413b.size();
        this.f3414c = new ClassH[size];
        for (int i = 0; i < size; i++) {
            this.f3414c[i] = new ClassH();
        }
    }

    private void m5340b() {
        int size = this.f3413b.size();
        for (int i = 0; i < size; i++) {
            ClassH c1284h = this.f3414c[i];
            if (c1284h.f3416b != -1) {
                ((aj) this.f3413b.get(c1284h.f3416b)).m5215a((aj) this.f3413b.get(i));
            }
        }
    }

    private void m5341c() {
        int size = this.f3413b.size();
        for (int i = 0; i < size; i++) {
            aj c1264aj = (aj) this.f3413b.get(i);
            ClassH c1284h = this.f3414c[i];
            BitSet bitSetM5230h = c1264aj.m5230h();
            if (bitSetM5230h.cardinality() > 1) {
                for (int iNextSetBit = bitSetM5230h.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSetM5230h.nextSetBit(iNextSetBit + 1)) {
                    int i2 = iNextSetBit;
                    while (i2 != c1284h.f3416b && i2 != -1) {
                        ClassH c1284h2 = this.f3414c[i2];
                        if (c1284h2.f3415a.mo5414b(i)) {
                            break;
                        }
                        c1284h2.f3415a.mo5411a(i);
                        i2 = c1284h2.f3416b;
                    }
                }
            }
        }
    }

    public ClassH[] m5342a() {
        int size = this.f3413b.size();
        ClassI.m5343a(this.f3412a, this.f3414c, false);
        m5340b();
        for (int i = 0; i < size; i++) {
            this.f3414c[i].f3415a = ai.m5199a(size);
        }
        m5341c();
        return this.f3414c;
    }
}
