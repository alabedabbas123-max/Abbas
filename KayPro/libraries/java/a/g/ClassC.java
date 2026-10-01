package a.g;

import a.b.f.w;
import a.b.g.aq;
import a.b.k;
import a.b.ClassN;
import a.b.f.ClassI;
import a.d.a.Abstractbd;
import a.g.a.ah;

public class ClassC extends w implements aq {

    private final aq f998a;

    public ClassC(aq aqVar) {
        this.f998a = aqVar;
    }

    public void m2615a(k kVar, ClassN c0165n) {
        int iM797t = ClassI.m797t(c0165n.mo949b(kVar));
        for (int i = (c0165n.mo945a() & 8) != 0 ? 0 : 1; i < iM797t; i++) {
            Abstractbd abstractC0206bdM1996a = ah.m1996a(c0165n, i);
            if (abstractC0206bdM1996a != null && abstractC0206bdM1996a.mo1321c()) {
                this.f998a.a(kVar, c0165n);
            }
        }
    }
}
