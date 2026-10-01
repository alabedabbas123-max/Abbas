package a.g.b;

import a.b.b.a.f;
import a.b.b.b;
import a.b.b.q;
import a.b.b.r;
import a.b.c;
import a.b.f.w;
import a.b.g.aq;
import a.b.g.s;
import a.b.k;
import a.b.ClassL;
import a.b.ClassN;
import a.b.Interfaced;
import a.b.Interfacej;
import a.b.g.ar;
import a.g.ClassL;

public class ClassY extends w implements f, aq, s {

    private final aq f994a = new ClassL(this);

    private final aq f995b = new ClassL(new ar(this));

    public static boolean m2603a(Interfaced interfaceC0041d) {
        return ClassL.m2541a(interfaceC0041d).mo2340d();
    }

    public static boolean m2604a(Interfacej interfaceC0162j) {
        return ClassQ.m2566a(interfaceC0162j).mo2390i();
    }

    private static void m2605b(Interfaced interfaceC0041d) {
        ag.m2330b(interfaceC0041d).m2344h();
    }

    private static void m2606b(Interfacej interfaceC0162j) {
        ai.m2350b(interfaceC0162j).m2357E();
    }

    public void m2607a(c cVar, b bVar) {
    }

    public void m2608a(c cVar, r rVar) {
        rVar.a(this.f994a);
    }

    public void m2609a(k kVar) {
        kVar.a(this);
        kVar.a("<clinit>", "()V", this.f994a);
        kVar.a("<init>", "()V", this.f994a);
        kVar.b(this.f995b);
    }

    public void m2610a(k kVar, ClassL c0163l) {
        m2605b(c0163l);
    }

    public void m2611a(k kVar, ClassN c0165n) {
        m2606b(c0165n);
    }

    public void m2612b(c cVar, q qVar) {
        c cVar2 = qVar.c;
        if ((cVar2 == null || cVar2.equals(cVar)) && qVar.a(cVar).equals(cVar.b())) {
            return;
        }
        qVar.a(this.f994a);
    }
}
