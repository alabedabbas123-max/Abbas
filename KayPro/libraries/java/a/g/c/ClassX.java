package a.g.c;

import a.b.c;
import a.b.g.s;
import a.b.k;
import a.b.ClassE;

public class ClassX implements s {

    private final s f1113a;

    private final s f1114b;

    public ClassX(s sVar, s sVar2) {
        this.f1113a = sVar;
        this.f1114b = sVar2;
    }

    public void m2804a(ClassE c0057e) {
        if (this.f1114b != null) {
            this.f1114b.a(c0057e);
        }
    }

    public void m2805a(k kVar) {
        s sVar = ClassC.m2702b((c) kVar) != null ? this.f1113a : this.f1114b;
        if (sVar != null) {
            sVar.a(kVar);
        }
    }
}
