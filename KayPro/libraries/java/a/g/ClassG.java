package a.g;

import a.b.c;
import a.b.g.s;
import a.b.k;
import a.b.ClassE;

public class ClassG implements s {

    private final s f1122a;

    private final s f1123b;

    public ClassG(s sVar) {
        this(sVar, null);
    }

    public ClassG(s sVar, s sVar2) {
        this.f1122a = sVar;
        this.f1123b = sVar2;
    }

    private s m2871a(c cVar) {
        return ClassF.m2862b(cVar) ? this.f1122a : this.f1123b;
    }

    public void m2872a(ClassE c0057e) {
        s sVarM2871a = m2871a((c) c0057e);
        if (sVarM2871a != null) {
            sVarM2871a.a(c0057e);
        }
    }

    public void m2873a(k kVar) {
        s sVarM2871a = m2871a((c) kVar);
        if (sVarM2871a != null) {
            sVarM2871a.a(kVar);
        }
    }
}
