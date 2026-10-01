package a.g.c;

import a.b.c;
import a.b.d.a.d;
import a.b.f.w;
import a.b.Interfacej;
import a.b.c.ClassV;
import a.b.d.Abstractc;
import a.b.d.ClassA;
import a.b.d.ClassE;
import a.b.d.ClassH;

public class ClassH extends w implements d {

    private final ClassV f1037a;

    private final d f1038b;

    public ClassH(ClassV c0036v, d dVar) {
        this.f1037a = c0036v;
        this.f1038b = dVar;
    }

    public void m2730a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassA c0042a) {
        byte b = c0042a.f147c;
        if (b == -89 || b == -56) {
            int i2 = c0042a.f133a + i;
            if (this.f1037a.m320f(i) || this.f1037a.m320f(i2)) {
                return;
            }
            Abstractc abstractC0048cM387a = ClassE.m387a(dVar.f, i2);
            switch (abstractC0048cM387a.f147c) {
                case -84:
                case -83:
                case -82:
                case -81:
                case -80:
                case -79:
                    this.f1037a.m311b(i, new ClassH(abstractC0048cM387a.f147c));
                    if (this.f1038b != null) {
                        this.f1038b.a(cVar, interfaceC0162j, dVar, i, c0042a);
                    }
                    break;
            }
        }
    }

    public void m2731a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
    }
}
