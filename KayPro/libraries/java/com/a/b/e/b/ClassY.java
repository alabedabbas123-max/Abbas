package com.a.b.e.b;

import java.util.BitSet;

class ClassY {

    private final BitSet f3114a;

    private final ClassX f3115b;

    private int f3116c;

    private final ClassX f3117d;

    private boolean f3118e;

    private ClassY(ClassX c1197x, BitSet bitSet, int i, boolean z) {
        this.f3115b = c1197x;
        this.f3114a = bitSet;
        this.f3116c = i;
        this.f3117d = new ClassX(c1197x.m5476d_());
        this.f3118e = z;
    }

    ClassY(ClassX c1197x, BitSet bitSet, int i, boolean z, ClassY c1198y) {
        this(c1197x, bitSet, i, z);
    }

    public ClassX m4923a() {
        if (this.f3115b.m5517k()) {
            this.f3117d.mo3944c_();
        }
        return this.f3117d;
    }

    public void m4925a(int i) {
        m4926a(i, (ClassU) this.f3115b.m5477e(i));
    }

    private void m4926a(int i, ClassU c1194u) {
        boolean z = true;
        if (this.f3114a != null && this.f3114a.get(i)) {
            z = false;
        }
        if (z) {
            c1194u = c1194u.m4890b(this.f3116c);
            if (!this.f3118e) {
                this.f3116c += c1194u.m4898k();
            }
        }
        this.f3118e = false;
        this.f3117d.m5474a(i, (Object) c1194u);
    }
}
