package a.g.b;

import a.b.c;
import a.b.g.s;
import a.b.k;
import a.b.ClassE;

public class ar implements s {

    private final s f958a;

    private final s f959b;

    public ar(s sVar) {
        this(sVar, null);
    }

    public ar(s sVar, s sVar2) {
        this.f958a = sVar;
        this.f959b = sVar2;
    }

    public void m2465a(ClassE c0057e) {
        if (this.f959b != null) {
            this.f959b.a(c0057e);
        }
    }

    public void m2466a(k kVar) {
        s sVar = as.m2467a((c) kVar) ? this.f958a : this.f959b;
        if (sVar != null) {
            sVar.a(kVar);
        }
    }
}
