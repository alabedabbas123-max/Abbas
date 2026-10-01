package a.b.c;

import a.b.c.a;
import a.b.c.b;
import a.b.f.w;
import a.b.g.aq;
import a.b.k;
import a.b.Abstractg;
import a.b.Abstractm;
import a.b.ClassE;
import a.b.f.ClassA;

class ClassD extends w implements aq {

    final a f42a;

    private ClassD(a aVar) {
        this.f42a = aVar;
    }

    ClassD(a aVar, b bVar) {
        this(aVar);
    }

    public void m105a(ClassE c0057e, Abstractg abstractC0095g) {
    }

    public void m106a(k kVar, Abstractm abstractC0164m) {
        int i = 3;
        int iMo945a = abstractC0164m.mo945a();
        int iM678a = ClassA.m678a(iMo945a);
        if (iM678a < 3) {
            if (kVar.equals(a.a(this.f42a))) {
                i = 0;
            } else if (a.a(this.f42a, kVar, a.a(this.f42a))) {
                i = 1;
            } else if ((a.b(this.f42a) & 8) == 0 && ((a.c(this.f42a) == null || a.a(this.f42a).b(a.c(this.f42a))) && a.a(this.f42a).b(kVar))) {
                i = 2;
            }
            if (iM678a < i) {
                abstractC0164m.f430b = ClassA.m679a(iMo945a, ClassA.m680b(i));
            }
        }
    }
}
