package a.b.c;

import a.b.a.a.h;
import a.b.b.q;
import a.b.c;
import a.b.c.a;
import a.b.d.a.d;
import a.b.g.aq;
import a.b.Interfacej;
import a.b.d.Abstractc;
import a.b.d.ClassB;
import a.b.f.ClassI;
import a.b.g.bj;

class ClassE extends bj implements d {

    final a f43a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassE(a aVar, aq aqVar) {
        super(aqVar);
        this.f43a = aVar;
    }

    @Override
    public void mo107a(c cVar, a.b.a.a.a aVar, h hVar) {
        a.a(this.f43a, 8);
        a.a(this.f43a, hVar.d);
        super.mo107a(cVar, aVar, hVar);
    }

    public void m108a(c cVar, a.b.b.a aVar) {
        a.a(this.f43a, aVar.b);
    }

    public void m109a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassB c0047b) {
        a.a(this.f43a, interfaceC0162j.mo945a());
        cVar.a(c0047b.f139a, this);
    }

    public void m110a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
    }

    @Override
    public void mo111b(c cVar, q qVar) {
        if (ClassI.m773f(qVar.a(cVar))) {
            a.a(this.f43a, qVar.c);
        } else {
            cVar.a(qVar.a, this);
        }
        super.mo111b(cVar, qVar);
    }
}
