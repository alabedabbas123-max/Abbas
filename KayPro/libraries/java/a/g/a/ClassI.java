package a.g.a;

import a.b.a.a;
import a.b.a.d.i;
import a.b.c;
import a.b.d.a.d;
import a.b.f.w;
import a.b.Interfacej;
import a.d.ClassB;
import a.d.a.ad;
import a.d.a.av;
import a.d.a.ClassC;
import a.j.ClassB;

public class ClassI extends w implements i, d {

    private final ClassV f795a;

    private final boolean f796b;

    private int f797c;

    private int[] f798d;

    private ad[] f799e;

    public ClassI() {
        this(new aa(new ClassC()));
    }

    private ClassI(aa c0319aa) {
        this(new ClassV(c0319aa, new ClassZ(new ClassB(c0319aa)), true, c0319aa), true);
    }

    public ClassI(ClassV c0349v, boolean z) {
        this.f798d = new int[8096];
        this.f799e = new ad[8096];
        this.f795a = c0349v;
        this.f796b = z;
    }

    private ad m2074a(int i) {
        return m2075a(i, this.f795a.m2207k(i).m1639b());
    }

    private ad m2075a(int i, int i2) {
        return ((av) this.f795a.m2206j(i).m1640b(i2).mo1558l_()).m1582s().mo1335n_();
    }

    public void m2076a(c cVar, a aVar) {
    }

    public void m2077a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        int i = dVar.e;
        this.f797c = -1;
        this.f798d = ClassB.m3142b(this.f798d, i, -1);
        this.f799e = (ad[]) ClassB.m3145b(this.f799e, i, (Object) null);
        if (this.f796b) {
            this.f795a.m2194a(cVar, interfaceC0162j, dVar);
        }
        ad c0179ad = interfaceC0162j.mo946a(cVar).equals("<init>") ? new ad(16777216) : ad.f479a;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f795a.m2196a(i2)) {
                if (this.f795a.m2199c(i2)) {
                    c0179ad = ad.f479a;
                }
                if (this.f799e[i2] != null) {
                    c0179ad = this.f799e[i2];
                } else {
                    this.f799e[i2] = c0179ad;
                }
                if (this.f795a.m2202f(i2)) {
                    c0179ad = c0179ad.m1332j(i2);
                } else if (this.f795a.m2203g(i2)) {
                    ad c0179adM2074a = m2074a(i2);
                    int iM1317a = c0179adM2074a.m1317a(0);
                    if (c0179adM2074a.m1322c(0)) {
                        this.f797c = i2;
                    } else {
                        this.f798d[iM1317a] = i2;
                    }
                    c0179ad = c0179ad.m1333k(iM1317a);
                }
                ad c0179adM2209m = this.f795a.m2209m(i2);
                if (c0179adM2209m != null) {
                    for (int i3 = 0; i3 < c0179adM2209m.m1324e(); i3++) {
                        int iM1317a2 = c0179adM2209m.m1317a(i3);
                        if (iM1317a2 > i2) {
                            this.f799e[iM1317a2] = c0179ad;
                        }
                    }
                    c0179ad = ad.f479a;
                }
            }
        }
    }

    public boolean m2078a() {
        return this.f797c != -1;
    }

    public boolean m2079a(int i, ad c0179ad) {
        return !this.f799e[i].m1320b(c0179ad.m1317a(0));
    }

    public int m2080b() {
        return this.f797c;
    }
}
