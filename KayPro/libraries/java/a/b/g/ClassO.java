package a.b.g;

import a.b.b;
import a.b.c;
import a.b.g.s;
import a.b.k;
import a.b.ClassE;

public class ClassO implements s {

    private final b f408a;

    private final s f409b;

    private final s f410c;

    public ClassO(b bVar, s sVar, s sVar2) {
        this.f408a = bVar;
        this.f409b = sVar;
        this.f410c = sVar2;
    }

    private s m1138a(c cVar) {
        return this.f408a.a(cVar.b()) != null ? this.f409b : this.f410c;
    }

    public void m1139a(ClassE c0057e) {
        s sVarM1138a = m1138a((c) c0057e);
        if (sVarM1138a != null) {
            sVarM1138a.a(c0057e);
        }
    }

    public void m1140a(k kVar) {
        s sVarM1138a = m1138a((c) kVar);
        if (sVarM1138a != null) {
            sVarM1138a.a(kVar);
        }
    }
}
