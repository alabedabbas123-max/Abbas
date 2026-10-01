package a.g.b;

import a.b.g.s;
import a.b.k;
import a.b.ClassE;

public class ClassJ implements s {

    private final s f978a;

    private final s f979b;

    public ClassJ(s sVar) {
        this(sVar, null);
    }

    public ClassJ(s sVar, s sVar2) {
        this.f978a = sVar;
        this.f979b = sVar2;
    }

    public void m2532a(ClassE c0057e) {
        s sVar = ClassK.m2534b(c0057e) ? this.f978a : this.f979b;
        if (sVar != null) {
            sVar.a(c0057e);
        }
    }

    public void m2533a(k kVar) {
        s sVar = ClassK.m2534b(kVar) ? this.f978a : this.f979b;
        if (sVar != null) {
            sVar.a(kVar);
        }
    }
}
