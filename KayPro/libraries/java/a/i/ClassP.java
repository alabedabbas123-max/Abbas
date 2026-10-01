package a.i;

import a.b.a.a;
import a.b.a.b;
import a.b.a.d.i;
import a.b.a.d.j;
import a.b.c;
import a.b.f.w;
import a.b.o;

class ClassP extends w implements i, j {

    final ClassN f1311a;

    private int f1312b;

    private ClassP(ClassN c0486n, int i) {
        this.f1311a = c0486n;
        this.f1312b = i;
    }

    public void m3100a(c cVar, a aVar) {
    }

    public void m3101a(c cVar, b bVar) {
        this.f1311a.mo3068a((o) bVar);
        this.f1311a.m3097a(cVar, bVar.a);
        bVar.a(cVar, this.f1311a);
    }

    public void m3102a(c cVar, a.b.a.c cVar2) {
        if (this.f1311a.mo3073b((o) cVar2)) {
            this.f1311a.mo3068a((o) cVar2);
            this.f1311a.m3097a(cVar, cVar2.a);
        }
        cVar2.a(cVar, this.f1312b, this);
    }
}
