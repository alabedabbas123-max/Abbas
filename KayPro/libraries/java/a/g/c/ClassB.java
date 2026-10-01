package a.g.c;

import a.b.f.w;
import a.b.g.s;
import a.b.k;
import a.g.ClassF;

public class ClassB extends w implements s {

    private final s f1025a;

    public ClassB() {
        this(null);
    }

    public ClassB(s sVar) {
        this.f1025a = sVar;
    }

    public void m2699a(k kVar) {
        if ((kVar.d & 1552) == 0 && !ClassF.m2862b(kVar) && kVar.o == null) {
            kVar.d |= 16;
            if (this.f1025a != null) {
                this.f1025a.a(kVar);
            }
        }
    }
}
