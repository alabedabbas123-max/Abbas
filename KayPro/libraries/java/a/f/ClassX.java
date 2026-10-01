package a.f;

import a.b.a.a;
import a.b.a.d;
import a.b.a.d.i;
import a.b.a.o;
import a.b.a.p;
import a.b.a.q;
import a.b.a.r;
import a.b.c;
import a.b.f.w;
import a.b.Interfacej;

public class ClassX extends w implements i {

    private final i f728a;

    public ClassX(i iVar) {
        this.f728a = iVar;
    }

    private boolean m1874a(c cVar, Interfacej interfaceC0162j) {
        return interfaceC0162j.mo949b(cVar).charAt(1) != ')';
    }

    public void m1875a(c cVar, a aVar) {
    }

    public void m1876a(c cVar, Interfacej interfaceC0162j, d dVar, p pVar) {
        if (ClassB.m1785a(pVar) || !m1874a(cVar, interfaceC0162j)) {
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < pVar.c; i2++) {
            o oVar = pVar.d[i2];
            if (oVar.a == 0) {
                pVar.d[i] = oVar;
                i++;
            }
        }
        pVar.c = i;
        if (i > 0) {
            this.f728a.a(cVar, interfaceC0162j, dVar, pVar);
        }
    }

    public void m1877a(c cVar, Interfacej interfaceC0162j, d dVar, r rVar) {
        if (ClassB.m1785a(rVar) || !m1874a(cVar, interfaceC0162j)) {
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < rVar.c; i2++) {
            q qVar = rVar.d[i2];
            if (qVar.a == 0) {
                rVar.d[i] = qVar;
                i++;
            }
        }
        rVar.c = i;
        if (i > 0) {
            this.f728a.a(cVar, interfaceC0162j, dVar, rVar);
        }
    }
}
