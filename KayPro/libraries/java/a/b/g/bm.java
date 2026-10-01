package a.b.g;

import a.b.c;
import a.b.g.s;
import a.b.k;
import a.b.ClassE;

public class bm implements s {

    private final c f387a;

    private final s f388b;

    public bm(c cVar, s sVar) {
        this.f387a = cVar;
        this.f388b = sVar;
    }

    private boolean m1075a(c[] cVarArr) {
        if (cVarArr == null) {
            return false;
        }
        for (c cVar : cVarArr) {
            if (cVar.equals(this.f387a)) {
                return true;
            }
        }
        return false;
    }

    public void m1076a(ClassE c0057e) {
        if (m1075a(c0057e.f166i)) {
            return;
        }
        this.f388b.a(c0057e);
    }

    public void m1077a(k kVar) {
        if (m1075a(kVar.o)) {
            return;
        }
        this.f388b.a(kVar);
    }
}
