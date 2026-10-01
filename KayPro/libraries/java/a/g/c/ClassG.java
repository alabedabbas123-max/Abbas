package a.g.c;

import a.b.c;
import a.b.d.a.d;
import a.b.f.w;
import a.b.Interfacej;
import a.b.c.ClassV;
import a.b.d.Abstractc;
import a.b.d.ClassA;
import a.b.d.ClassE;

public class ClassG extends w implements d {

    private final ClassV f1035a;

    private final d f1036b;

    public ClassG(ClassV c0036v, d dVar) {
        this.f1035a = c0036v;
        this.f1036b = dVar;
    }

    public void m2728a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassA c0042a) {
        byte b = c0042a.f147c;
        if (b == -89 || b == -56) {
            int i2 = c0042a.f133a;
            int i3 = i + i2;
            if (i2 == 0 || i2 == c0042a.mo322a(i) || this.f1035a.m320f(i) || this.f1035a.m320f(i3)) {
                return;
            }
            Abstractc abstractC0048cM387a = ClassE.m387a(dVar.f, i3);
            if (abstractC0048cM387a.f147c == -89) {
                this.f1035a.m311b(i, new ClassA(b, ((ClassA) abstractC0048cM387a).f133a + i2));
                if (this.f1036b != null) {
                    this.f1036b.a(cVar, interfaceC0162j, dVar, i, c0042a);
                }
            }
        }
    }

    public void m2729a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
    }
}
