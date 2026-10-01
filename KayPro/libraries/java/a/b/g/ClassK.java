package a.b.g;

import a.b.g.s;
import a.b.k;
import java.util.List;
import a.b.ClassE;
import a.j.Abstractt;
import a.j.ClassC;
import a.j.ClassJ;

public class ClassK implements s {

    private final Abstractt f403a;

    private final s f404b;

    public ClassK(Abstractt abstractC0515t, s sVar) {
        this.f403a = abstractC0515t;
        this.f404b = sVar;
    }

    public ClassK(String str, s sVar) {
        this(str, (List) null, sVar);
    }

    public ClassK(String str, List list, s sVar) {
        this(new ClassJ(new ClassC(list)).mo3150a(str), sVar);
    }

    public ClassK(List list, s sVar) {
        this(list, (List) null, sVar);
    }

    public ClassK(List list, List list2, s sVar) {
        this(new ClassJ(new ClassC(list2)).m3155a(list), sVar);
    }

    private boolean m1132a(String str) {
        return this.f403a.mo3151a(str);
    }

    public void m1133a(ClassE c0057e) {
        if (m1132a(c0057e.m415b())) {
            this.f404b.a(c0057e);
        }
    }

    public void m1134a(k kVar) {
        if (m1132a(kVar.b())) {
            this.f404b.a(kVar);
        }
    }
}
