package a.g.b;

import a.b.b.a;
import a.b.b.a.f;
import a.b.b.b;
import a.b.b.q;
import a.b.b.r;
import a.b.c;
import a.b.f.w;
import a.b.g.aq;
import a.b.g.s;
import a.b.Interfacei;

public class ab extends w implements f, aq, s {

    private c f872a;

    public static boolean m2246b(c cVar) {
        return ClassF.m2515b(cVar).mo2318l();
    }

    private static void m2247c(c cVar) {
        ae.m2304f(cVar).m2328v();
    }

    public void m2248a(c cVar) {
        if ((cVar.a() & 1) == 0) {
            m2247c(this.f872a);
        }
    }

    public void m2249a(c cVar, a aVar) {
        if (aVar.b != cVar) {
            this.f872a = cVar;
            aVar.a(this);
        }
    }

    public void m2250a(c cVar, b bVar) {
    }

    public void m2251a(c cVar, r rVar) {
        if (rVar.b != cVar) {
            this.f872a = cVar;
            rVar.a(this);
            rVar.a(this);
        }
    }

    public void m2252a(c cVar, Interfacei interfaceC0161i) {
        if ((interfaceC0161i.mo945a() & 3) == 0) {
            m2247c(this.f872a);
        }
    }

    public void m2253b(c cVar, q qVar) {
        if (qVar.c != cVar) {
            this.f872a = cVar;
            qVar.a(this);
            qVar.a(this);
        }
    }
}
