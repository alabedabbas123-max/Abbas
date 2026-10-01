package a.g.c;

import a.b.a.a;
import a.b.a.d.i;
import a.b.c;
import a.b.d.a.d;
import a.b.f.w;
import a.b.Interfacej;
import a.b.c.ClassV;
import a.b.d.Abstractc;
import a.j.ClassL;

public class aa extends w implements i, d {

    private final d f1006a;

    private final ClassW f1007b;

    private final ClassV f1008c;

    public aa() {
        this(null);
    }

    public aa(d dVar) {
        this.f1007b = new ClassW();
        this.f1008c = new ClassV();
        this.f1006a = dVar;
    }

    public void m2648a(c cVar, a aVar) {
    }

    public void m2649a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        try {
            m2651b(cVar, interfaceC0162j, dVar);
        } catch (RuntimeException e) {
            ClassL.m3161a("Unexpected error while removing unreachable code:");
            ClassL.m3161a("  Class       = [" + cVar.b() + "]");
            ClassL.m3161a("  Method      = [" + interfaceC0162j.mo946a(cVar) + interfaceC0162j.mo949b(cVar) + "]");
            ClassL.m3161a("  Exception   = [" + e.getClass().getName() + "] (" + e.getMessage() + ")");
            throw e;
        }
    }

    public void m2650a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
        if (this.f1007b.m2802a(i)) {
            return;
        }
        this.f1008c.m314c(i);
        if (this.f1006a != null) {
            abstractC0048c.mo324a(cVar, interfaceC0162j, dVar, i, this.f1006a);
        }
    }

    public void m2651b(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        this.f1007b.m2795a(cVar, interfaceC0162j, dVar);
        this.f1008c.m277a(dVar.e);
        dVar.a(cVar, interfaceC0162j, this);
        this.f1008c.m284a(cVar, interfaceC0162j, dVar);
    }
}
