package a.b.g;

import a.b.c;
import a.b.g.s;
import a.b.k;
import a.b.ClassE;

public class ClassT implements s {

    private final s f418a;

    public ClassT(s sVar) {
        this.f418a = sVar;
    }

    public void m1252a(ClassE c0057e) {
        if ((c0057e.m399a() & 1536) == 0) {
            c0057e.m407a(this.f418a);
            return;
        }
        c[] cVarArr = c0057e.f166i;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.a(this);
            }
        }
    }

    public void m1253a(k kVar) {
        if ((kVar.a() & 1536) == 0) {
            kVar.a(this.f418a);
            return;
        }
        c[] cVarArr = kVar.o;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.a(this);
            }
        }
    }
}
