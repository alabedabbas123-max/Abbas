package a.b.c;

import a.b.a.d.i;
import a.b.a.d.m;
import a.b.a.k;
import a.b.a.l;
import a.b.c;
import a.b.c.a;
import a.b.c.b;
import a.b.f.w;
import a.b.g.s;
import a.b.ClassE;
import a.b.f.ClassA;

class ClassC extends w implements i, m, s {

    final a f41a;

    private ClassC(a aVar) {
        this.f41a = aVar;
    }

    ClassC(a aVar, b bVar) {
        this(aVar);
    }

    public void m100a(c cVar, a.b.a.a aVar) {
    }

    public void m101a(c cVar, k kVar) {
        kVar.a(cVar, this);
    }

    public void m102a(c cVar, l lVar) {
        int i;
        int iM678a;
        int i2 = lVar.a;
        if (i2 == 0 || !cVar.e(i2).equals(cVar.b()) || (iM678a = ClassA.m678a((i = lVar.d))) >= 3) {
            return;
        }
        int i3 = a.a(this.f41a, cVar, a.a(this.f41a)) ? 1 : 3;
        if (iM678a < i3) {
            lVar.d = ClassA.m679a(i, ClassA.m680b(i3));
        }
    }

    public void m103a(ClassE c0057e) {
    }

    public void m104a(a.b.k kVar) {
        int iA = kVar.a();
        int iM678a = ClassA.m678a(iA);
        if (iM678a < 3) {
            int i = a.a(this.f41a, kVar, a.a(this.f41a)) ? 1 : 3;
            if (iM678a < i) {
                kVar.d = ClassA.m679a(iA, ClassA.m680b(i));
            }
        }
        kVar.a(this);
    }
}
