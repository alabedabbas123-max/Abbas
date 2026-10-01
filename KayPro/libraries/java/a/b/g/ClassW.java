package a.b.g;

import a.b.c;
import a.b.g.s;
import a.b.k;
import a.b.ClassE;

public class ClassW implements s {

    private final c[] f421a;

    private final s f422b;

    public ClassW(c[] cVarArr, s sVar) {
        this.f421a = cVarArr;
        this.f422b = sVar;
    }

    private boolean m1260a(c cVar) {
        if (this.f421a == null) {
            return false;
        }
        for (int i = 0; i < this.f421a.length; i++) {
            if (this.f421a[i].equals(cVar)) {
                return true;
            }
        }
        return false;
    }

    public void m1261a(ClassE c0057e) {
        if (m1260a((c) c0057e)) {
            return;
        }
        this.f422b.a(c0057e);
    }

    public void m1262a(k kVar) {
        if (m1260a((c) kVar)) {
            return;
        }
        this.f422b.a(kVar);
    }
}
