package a.b.f;

import a.b.a.a;
import a.b.a.d.i;
import a.b.c;
import a.b.c.ae;
import a.b.d.a.d;
import a.b.f.w;
import a.b.g.s;
import a.b.k;
import a.b.Interfacej;
import a.b.c.ClassV;
import a.b.d.Abstractc;
import a.b.d.ClassB;
import a.b.d.ClassH;
import a.d.ClassB;
import a.d.a.ao;
import a.d.a.ClassC;
import a.d.a.Interfacebe;
import a.g.a.ClassV;

public class ClassD extends w implements i, d, s {

    private final Interfacebe f198a = new ao(new ClassC());

    private final ClassV f199b = new ClassV(this.f198a, new ClassB(this.f198a), true);

    private final ClassC f200c = new ClassC(this.f199b);

    private final ClassV f201d = new ClassV();

    private ae f202e;

    private int f203f;

    private int f204g;

    private int f205h;

    private int f206i;

    public void m695a(c cVar, a aVar) {
    }

    public void m696a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        this.f201d.m277a(dVar.e);
        this.f199b.m2194a(cVar, interfaceC0162j, dVar);
        this.f203f = -1;
        this.f204g = -1;
        this.f205h = -1;
        this.f206i = -1;
        dVar.a(cVar, interfaceC0162j, this);
        if (this.f201d.m309a()) {
            this.f201d.m284a(cVar, interfaceC0162j, dVar);
        }
    }

    public void m697a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
        if (abstractC0048c.f147c == -68 && this.f204g == 1 && this.f200c.m692a(cVar, interfaceC0162j, dVar, i, (ClassH) abstractC0048c)) {
            this.f201d.m311b(this.f203f, new ClassB((byte) 18, this.f202e.a(this.f200c.m694c())));
            this.f201d.m314c(i);
            this.f205h = this.f200c.m691a();
            this.f206i = this.f200c.m693b();
        }
        if (this.f206i != -1 && i >= this.f205h && i <= this.f206i) {
            this.f201d.m314c(i);
        }
        this.f203f = i;
        this.f204g = abstractC0048c.mo367b(cVar);
    }

    public void m698a(k kVar) {
        this.f202e = new ae(kVar);
        kVar.b(new a.b.a.d.a(new ClassE(this)));
    }
}
