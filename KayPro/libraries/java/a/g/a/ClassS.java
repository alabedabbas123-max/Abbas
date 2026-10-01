package a.g.a;

import a.b.a.a;
import a.b.a.d.i;
import a.b.a.d.l;
import a.b.a.h;
import a.b.c;
import a.b.d.a.d;
import a.b.f.w;
import a.b.Interfacej;
import a.b.d.Abstractc;
import a.b.d.ClassB;
import a.b.d.ClassK;
import a.d.ClassB;
import a.d.a.Abstractbd;
import a.d.a.ad;
import a.d.a.ClassC;
import a.j.ClassB;

public class ClassS extends w implements i, l, d {

    private final ClassV f830a;

    private final boolean f831b;

    private final ClassI f832c;

    private final boolean f833d;

    private long[] f834e;

    private long[] f835f;

    private long[] f836g;

    private boolean f837h;

    private long f838i;

    public ClassS() {
        this(new aa(new ClassC()));
    }

    private ClassS(aa c0319aa) {
        this(new ClassV(c0319aa, new ClassZ(new ClassB(c0319aa)), true, c0319aa), true);
    }

    private ClassS(ClassV c0349v, boolean z) {
        this(c0349v, z, new ClassI(c0349v, false), true);
    }

    public ClassS(ClassV c0349v, boolean z, ClassI c0336i, boolean z2) {
        this.f834e = new long[8096];
        this.f835f = new long[8096];
        this.f836g = new long[8096];
        this.f830a = c0349v;
        this.f831b = z;
        this.f832c = c0336i;
        this.f833d = z2;
    }

    private long m2164a(ad c0179ad) {
        long j = 0;
        int iM1324e = c0179ad.m1324e();
        for (int i = 0; i < iM1324e; i++) {
            j |= this.f834e[c0179ad.m1317a(i)];
        }
        return j;
    }

    public void m2165a(int i, int i2, boolean z) {
        if (i2 < 64) {
            if (z) {
                long[] jArr = this.f834e;
                jArr[i] = jArr[i] | (1 << i2);
            } else {
                long[] jArr2 = this.f834e;
                jArr2[i] = jArr2[i] & ((1 << i2) ^ (-1));
            }
        }
    }

    public void m2166a(c cVar, a aVar) {
    }

    public void m2167a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        Abstractbd abstractC0206bdC;
        Abstractbd abstractC0206bdC2;
        int i = dVar.e;
        int i2 = dVar.d;
        this.f834e = ClassB.m3136a(this.f834e, i, 0L);
        this.f835f = ClassB.m3136a(this.f835f, i, 0L);
        this.f836g = ClassB.m3136a(this.f836g, i, 0L);
        if (this.f831b) {
            this.f830a.m2194a(cVar, interfaceC0162j, dVar);
        }
        if (this.f833d) {
            this.f832c.m2077a(cVar, interfaceC0162j, dVar);
        }
        if (i2 > 64) {
            i2 = 64;
        }
        do {
            this.f837h = false;
            this.f838i = 0L;
            for (int i3 = i - 1; i3 >= 0; i3--) {
                if (this.f830a.m2196a(i3)) {
                    ad c0179adM2209m = this.f830a.m2209m(i3);
                    if (c0179adM2209m != null) {
                        this.f838i = m2164a(c0179adM2209m);
                    }
                    this.f838i |= this.f835f[i3];
                    this.f835f[i3] = this.f838i;
                    dVar.a(cVar, interfaceC0162j, i3, this);
                    this.f838i |= this.f834e[i3];
                    if (((this.f834e[i3] ^ (-1)) & this.f838i) != 0) {
                        this.f834e[i3] = this.f838i;
                        ad c0179adM2208l = this.f830a.m2208l(i3);
                        if (c0179adM2208l != null && i3 < c0179adM2208l.m1326f()) {
                            this.f837h = true;
                        }
                    }
                }
            }
            dVar.a(cVar, interfaceC0162j, this);
        } while (this.f837h);
        for (int i4 = 0; i4 < i; i4++) {
            if (this.f830a.m2196a(i4)) {
                for (int i5 = 0; i5 < i2; i5++) {
                    if (m2173a(i4, i5) && (abstractC0206bdC2 = this.f830a.m2204h(i4).m1677c(i5)) != null && abstractC0206bdC2.mo1588b()) {
                        m2176c(i4, i5, true);
                        m2165a(i4, i5 + 1, true);
                        m2176c(i4, i5 + 1, true);
                    }
                    if (m2175b(i4, i5) && (abstractC0206bdC = this.f830a.m2205i(i4).m1677c(i5)) != null && abstractC0206bdC.mo1588b()) {
                        m2176c(i4, i5, true);
                        m2174b(i4, i5 + 1, true);
                        m2176c(i4, i5 + 1, true);
                    }
                }
            }
        }
    }

    public void m2168a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassB c0047b) {
        if (i == this.f832c.m2080b()) {
            this.f838i |= 1;
        }
    }

    public void m2169a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
    }

    public void m2170a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassK c0056k) {
        int i2 = c0056k.f156b;
        if (i2 < 64) {
            long j = 1 << i2;
            if (c0056k.m398g()) {
                this.f838i = j | this.f838i;
                return;
            }
            this.f838i &= (-1) ^ j;
            long[] jArr = this.f835f;
            jArr[i] = j | jArr[i];
        }
    }

    public void m2171a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, h hVar) {
        long j = this.f834e[hVar.c];
        if (j != 0) {
            int i = hVar.b;
            for (int i2 = hVar.a; i2 < i; i2++) {
                if (this.f830a.m2196a(i2) && (((this.f834e[i2] & this.f835f[i2]) ^ (-1)) & j) != 0) {
                    long[] jArr = this.f834e;
                    jArr[i2] = jArr[i2] | j;
                    long[] jArr2 = this.f835f;
                    jArr2[i2] = jArr2[i2] | j;
                    this.f837h = true;
                }
            }
        }
    }

    public boolean m2172a(int i) {
        return this.f830a.m2196a(i);
    }

    public boolean m2173a(int i, int i2) {
        if (i2 >= 64) {
            return this.f830a.m2204h(i).m1677c(i2) != null;
        }
        return (this.f834e[i] & (1 << i2)) != 0;
    }

    public void m2174b(int i, int i2, boolean z) {
        if (i2 < 64) {
            if (z) {
                long[] jArr = this.f835f;
                jArr[i] = jArr[i] | (1 << i2);
            } else {
                long[] jArr2 = this.f835f;
                jArr2[i] = jArr2[i] & ((1 << i2) ^ (-1));
            }
        }
    }

    public boolean m2175b(int i, int i2) {
        if (i2 >= 64) {
            return this.f830a.m2205i(i).m1677c(i2) != null;
        }
        return (this.f835f[i] & (1 << i2)) != 0;
    }

    public void m2176c(int i, int i2, boolean z) {
        if (i2 < 64) {
            if (z) {
                long[] jArr = this.f836g;
                jArr[i] = jArr[i] | (1 << i2);
            } else {
                long[] jArr2 = this.f836g;
                jArr2[i] = jArr2[i] & ((1 << i2) ^ (-1));
            }
        }
    }

    public boolean m2177c(int i, int i2) {
        if (i2 >= 64) {
            return this.f830a.m2204h(i).m1677c(i2) != null && this.f830a.m2204h(i).m1677c(i2).mo1588b();
        }
        return (this.f836g[i] & (1 << i2)) != 0;
    }
}
