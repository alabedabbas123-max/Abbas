package a.b.c;

import a.b.a.a.a.a;
import a.b.a.a.a.a.b;
import a.b.a.a.a.e;
import a.b.a.a.a.f;
import a.b.a.a.a.g;
import a.b.a.a.a.i;
import a.b.a.a.a.j;
import a.b.a.a.a.l;
import a.b.a.a.q;
import a.b.a.d;
import a.b.c;
import a.b.f.w;
import a.b.k;
import a.b.Interfacei;
import a.b.Interfacej;

public class bq extends w implements b {

    private final k f25a;

    private final q f26b;

    public bq(k kVar, q qVar) {
        this.f25a = kVar;
        this.f26b = qVar;
    }

    public void m56a(c cVar, q qVar, g gVar) {
        this.f26b.f = new g(gVar.c, gVar.b);
    }

    public void m57a(c cVar, q qVar, a.b.a.a.a.k kVar) {
        this.f26b.f = new a.b.a.a.a.k(kVar.c, kVar.a, kVar.b);
    }

    public void m58a(c cVar, q qVar, l lVar) {
        this.f26b.f = new l(lVar.c, lVar.a);
    }

    public void m59a(c cVar, Interfacei interfaceC0161i, q qVar, a.b.a.a.a.b bVar) {
        this.f26b.f = new a.b.a.a.a.b();
    }

    public void m60a(c cVar, Interfacej interfaceC0162j, q qVar, a.b.a.a.a.c cVar2) {
        this.f26b.f = new a.b.a.a.a.c(cVar2.c, cVar2.a);
    }

    public void m61a(c cVar, Interfacej interfaceC0162j, q qVar, i iVar) {
        this.f26b.f = new i(iVar.c, iVar.a);
    }

    public void m62a(c cVar, Interfacej interfaceC0162j, d dVar, q qVar, a aVar) {
        this.f26b.f = new a(aVar.c, aVar.a);
    }

    public void m63a(c cVar, Interfacej interfaceC0162j, d dVar, q qVar, e eVar) {
        a.b.a.a.a.d[] dVarArr = eVar.b;
        a.b.a.a.a.d[] dVarArr2 = new a.b.a.a.a.d[eVar.a];
        e eVar2 = new e(eVar.c, eVar.a, dVarArr2);
        for (int i = 0; i < eVar.a; i++) {
            a.b.a.a.a.d dVar2 = eVar.b[i];
            dVarArr2[i] = new a.b.a.a.a.d(dVar2.a, dVar2.b, dVar2.c);
        }
        eVar2.b = dVarArr2;
        this.f26b.f = eVar2;
    }

    public void m64a(c cVar, Interfacej interfaceC0162j, d dVar, q qVar, f fVar) {
        this.f26b.f = new f(fVar.c, fVar.a);
    }

    public void m65a(c cVar, Interfacej interfaceC0162j, d dVar, q qVar, j jVar) {
        this.f26b.f = new j(jVar.c, jVar.a, jVar.b);
    }
}
