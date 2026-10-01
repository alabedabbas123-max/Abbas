package a.b.f;

import a.b.c;
import a.b.g.s;
import a.b.k;
import a.b.ClassE;

public class ClassG implements s {
    private void m735a(c cVar, c cVar2) {
        if (cVar2 != null) {
            cVar2.a(cVar);
        }
    }

    public void m736a(ClassE c0057e) {
        m735a(c0057e, c0057e.f164g);
        c[] cVarArr = c0057e.f165h;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                m735a(c0057e, cVar);
            }
        }
    }

    public void m737a(k kVar) {
        m735a(kVar, kVar.e());
        for (int i = 0; i < kVar.g; i++) {
            m735a(kVar, kVar.k(i));
        }
    }
}
