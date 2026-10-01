package a.g.b;

import a.b.c;
import a.b.f.w;
import a.b.g.aq;
import a.b.g.s;
import a.b.Interfacei;

public class aa extends w implements aq, s {
    public static boolean m2242b(c cVar) {
        return ClassF.m2515b(cVar).mo2317k();
    }

    private static void m2243c(c cVar) {
        ae.m2304f(cVar).m2327u();
    }

    public void m2244a(c cVar) {
        if ((cVar.a() & 1) == 0) {
            m2243c(cVar);
        } else {
            cVar.a(this);
            cVar.b(this);
        }
    }

    public void m2245a(c cVar, Interfacei interfaceC0161i) {
        if ((interfaceC0161i.mo945a() & 3) == 0) {
            m2243c(cVar);
        }
    }
}
