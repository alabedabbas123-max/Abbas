package a.b.f;

import a.b.a.a;
import a.b.a.d.i;
import a.b.b.a.e;
import a.b.b.a.f;
import a.b.b.b;
import a.b.b.p;
import a.b.c;
import a.b.c.ag;
import a.b.c.ar;
import a.b.d.a.d;
import a.b.f.w;
import a.b.g.s;
import a.b.k;
import a.b.Interfacej;
import a.b.c.ClassV;
import a.b.d.Abstractc;
import a.b.d.ClassB;
import a.b.d.ClassF;

public class ClassV extends w implements i, f, a.b.b.a.i, d, s {

    private final ClassV f303a = new ClassV();

    private final ag f304b = new ag();

    private boolean f305c;

    private ar f306d;

    public void m912a(c cVar, a aVar) {
    }

    public void m913a(c cVar, b bVar) {
    }

    public void m914a(c cVar, p pVar) {
        char cB = pVar.b();
        pVar.c();
        this.f306d = new ar((k) cVar);
        this.f306d.U(pVar.c());
        this.f306d.Q(ClassF.m388a(cB));
        pVar.a(cVar, this);
    }

    public void m915a(c cVar, p pVar, int i, byte b) {
        this.f306d.D().U(i).U(b).y();
    }

    public void m916a(c cVar, p pVar, int i, char c) {
        this.f306d.D().U(i).U(c).z();
    }

    public void m917a(c cVar, p pVar, int i, double d) {
        this.f306d.D().U(i).b(d).x();
    }

    public void m918a(c cVar, p pVar, int i, float f) {
        this.f306d.D().U(i).b(f).w();
    }

    public void m919a(c cVar, p pVar, int i, int i2) {
        this.f306d.D().U(i).U(i2).u();
    }

    public void m920a(c cVar, p pVar, int i, long j) {
        this.f306d.D().U(i).b(j).v();
    }

    public void m921a(c cVar, p pVar, int i, short s) {
        this.f306d.D().U(i).U(s).A();
    }

    public void m922a(c cVar, p pVar, int i, boolean z) {
        this.f306d.D().U(i).a(z ? 1 : 0).y();
    }

    public void m923a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        this.f303a.m277a(dVar.e);
        dVar.a(cVar, interfaceC0162j, this);
        if (this.f303a.m309a()) {
            this.f303a.m284a(cVar, interfaceC0162j, dVar);
            this.f305c = true;
        }
    }

    public void m924a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassB c0047b) {
        this.f306d = null;
        cVar.a(c0047b.f139a, this);
        if (this.f306d != null) {
            this.f303a.m316c(i, this.f306d.c());
            this.f305c = true;
        }
    }

    public void m925a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
    }

    public void m926a(k kVar) {
        a.b.b.a.d dVar = new a.b.b.a.d();
        kVar.a(new e(21, dVar));
        if (dVar.a() > 0) {
            this.f305c = false;
            kVar.b(new a.b.a.d.a(this));
            if (this.f305c) {
                kVar.a(this.f304b);
            }
        }
    }
}
