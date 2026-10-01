package a.g.c;

import a.b.a.a;
import a.b.a.d.i;
import a.b.c;
import a.b.d.a.d;
import a.b.f.w;
import a.b.Interfacej;
import a.b.c.ClassV;

public class ClassV extends w implements i {

    private final ClassA f1107a;

    private final ClassV f1108b;

    private final d f1109c;

    public ClassV(ClassV c0036v, d dVar) {
        this(null, c0036v, dVar);
    }

    public ClassV(ClassA c0409a, ClassV c0036v, d dVar) {
        this.f1107a = c0409a;
        this.f1108b = c0036v;
        this.f1109c = dVar;
    }

    public void m2789a(c cVar, a aVar) {
    }

    public void m2790a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        if (this.f1107a != null) {
            this.f1107a.m2626a(cVar, interfaceC0162j, dVar);
        }
        this.f1108b.m277a(dVar.e);
        dVar.a(cVar, interfaceC0162j, this.f1109c);
        this.f1108b.m284a(cVar, interfaceC0162j, dVar);
    }
}
