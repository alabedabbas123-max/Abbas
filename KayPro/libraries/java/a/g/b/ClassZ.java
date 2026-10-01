package a.g.b;

import a.b.a.a;
import a.b.a.d;
import a.b.a.d.i;
import a.b.c;
import a.b.f.w;
import a.b.Interfacej;
import a.g.ClassF;

public class ClassZ extends w implements i {

    private final i f996a;

    private final i f997b;

    public ClassZ(i iVar) {
        this(iVar, null);
    }

    public ClassZ(i iVar, i iVar2) {
        this.f996a = iVar;
        this.f997b = iVar2;
    }

    public void m2613a(c cVar, a aVar) {
    }

    public void m2614a(c cVar, Interfacej interfaceC0162j, d dVar) {
        i iVar = !ClassF.m2859a(dVar) ? this.f996a : this.f997b;
        if (iVar != null) {
            iVar.a(cVar, interfaceC0162j, dVar);
        }
    }
}
