package a;

import a.b.g.s;
import a.b.k;
import a.b.ClassE;
import a.b.f.ClassI;
import a.b.f.ClassZ;

public class ClassP implements s {

    private final ClassZ f1368a;

    public ClassP(ClassZ c0094z) {
        this.f1368a = c0094z;
    }

    public void m3252a(ClassE c0057e) {
        this.f1368a.m941a(c0057e.m415b(), "Note: duplicate definition of library class [" + ClassI.m764c(c0057e.m415b()) + "]");
    }

    public void m3253a(k kVar) {
        this.f1368a.m941a(kVar.b(), "Note: duplicate definition of program class [" + ClassI.m764c(kVar.b()) + "]");
    }
}
