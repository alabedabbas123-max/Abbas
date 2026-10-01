package a.g.b;

import a.b.c;
import a.b.d.a.d;
import a.b.f.w;
import a.b.g.aq;
import a.b.g.s;
import a.b.k;
import a.b.ClassN;
import a.b.Interfacej;
import a.b.d.Abstractc;
import a.g.ClassK;

public class aq extends w implements d, aq {

    private final ClassR f955a;

    private final ap f956b = new ap(false, true);

    private final s f957c = new ClassK(new ao());

    public aq(ClassR c0399r) {
        this.f955a = c0399r;
    }

    private void m2461a(c cVar, Interfacej interfaceC0162j) {
        ClassQ c0398qM2566a = ClassQ.m2566a(interfaceC0162j);
        if (c0398qM2566a.mo2388h() || !(c0398qM2566a instanceof ai)) {
            return;
        }
        ((ai) c0398qM2566a).m2356D();
        if (c0398qM2566a.mo2388h()) {
            this.f955a.m2574a();
            if (interfaceC0162j.mo946a(cVar).equals("<clinit>")) {
                cVar.a(this.f957c);
            }
        }
    }

    public static boolean m2462a(Interfacej interfaceC0162j) {
        return ClassQ.m2566a(interfaceC0162j).mo2388h();
    }

    public void m2463a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
        if (this.f956b.m2460b(cVar, interfaceC0162j, dVar, i, abstractC0048c)) {
            m2461a(cVar, interfaceC0162j);
        }
    }

    public void m2464a(k kVar, ClassN c0165n) {
        if ((c0165n.mo945a() & 288) != 0) {
            m2461a((c) kVar, (Interfacej) c0165n);
        }
    }
}
