package a.g.a;

import a.b.b.a.f;
import a.b.b.q;
import a.b.c;
import a.b.d.a.d;
import a.b.f.w;
import a.b.g.aq;
import a.b.k;
import a.b.ClassN;
import a.b.Interfacei;
import a.b.Interfacej;
import a.b.d.Abstractc;
import a.b.d.ClassB;
import a.g.b.ad;

class ClassO extends w implements f, d, aq {

    final ClassJ f824a;

    private int f825b;

    private long f826c;

    private ClassO(ClassJ c0337j) {
        this.f824a = c0337j;
    }

    public void m2151a(c cVar, Interfacei interfaceC0161i) {
    }

    public void m2152a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassB c0047b) {
        switch (c0047b.f147c) {
            case -74:
            case -73:
            case -72:
            case -71:
                this.f825b = 0;
                cVar.a(c0047b.f139a, this);
                for (int i2 = 0; i2 < this.f825b; i2++) {
                    if (i2 < 64 && (this.f826c & (1 << i2)) == 0) {
                        this.f824a.m2109g(i, (this.f824a.f800a.m2206j(i).m1639b() - this.f825b) + i2);
                    }
                }
                break;
        }
    }

    public void m2153a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
    }

    public void m2154a(k kVar, ClassN c0165n) {
        this.f825b = ad.m2290a(c0165n);
        this.f826c = ad.m2295c(c0165n);
    }

    public void m2155b(c cVar, q qVar) {
        qVar.a(this);
    }
}
