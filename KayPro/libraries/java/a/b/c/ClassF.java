package a.b.c;

import a.b.a.a.a;
import a.b.a.a.b.f;
import a.b.a.a.c;
import a.b.a.a.d;
import a.b.a.a.h;
import a.b.a.a.j;
import a.b.c.ad;
import a.b.c.ai;
import a.b.f.w;
import a.b.k;
import a.b.Interfacej;

public class ClassF extends w implements f {

    private static final h[] f44a = new h[0];

    private final k f45b;

    private final c f46c;

    private final ClassG f47d;

    private final bk f48e;

    private final ad f49f;

    public ClassF(k kVar, c cVar) {
        this.f45b = kVar;
        this.f46c = cVar;
        this.f47d = null;
        this.f48e = null;
        this.f49f = new ad(kVar);
    }

    public ClassF(k kVar, d dVar) {
        this.f45b = kVar;
        this.f46c = null;
        this.f47d = new ClassG(dVar);
        this.f48e = null;
        this.f49f = new ad(kVar);
    }

    public ClassF(k kVar, j jVar) {
        this.f45b = kVar;
        this.f46c = null;
        this.f47d = null;
        this.f48e = new bk(jVar);
        this.f49f = new ad(kVar);
    }

    public void m112a(a.b.c cVar, a aVar) {
        a aVar2 = new a(this.f49f.a(cVar, aVar.a), 0, aVar.b > 0 ? new h[aVar.b] : f44a);
        aVar2.d = aVar.d;
        aVar.a(cVar, new ai(this.f45b, aVar2, false));
        if (this.f46c != null) {
            this.f46c.a = aVar2;
        } else {
            this.f47d.m114a(aVar2);
        }
    }

    public void m113a(a.b.c cVar, Interfacej interfaceC0162j, int i, a aVar) {
        a aVar2 = new a(this.f49f.a(cVar, aVar.a), 0, aVar.b > 0 ? new h[aVar.b] : f44a);
        aVar2.d = aVar.d;
        aVar.a(cVar, new ai(this.f45b, aVar2, false));
        this.f48e.m40a(i, aVar2);
    }
}
