package a.b.g;

import a.b.c;
import a.b.g.aq;
import a.b.k;
import a.b.ClassE;
import a.b.ClassF;
import a.b.ClassH;
import a.b.ClassL;
import a.b.ClassN;
import a.b.f.ClassA;
import a.b.f.ClassI;

public class aj implements aq {

    private final c f335a;

    private final aq f336b;

    public aj(c cVar, aq aqVar) {
        this.f335a = cVar;
        this.f336b = aqVar;
    }

    private boolean m980a(c cVar, int i) {
        int iM678a = ClassA.m678a(i);
        if (iM678a >= 3) {
            return true;
        }
        if (iM678a >= 0 && this.f335a.equals(cVar)) {
            return true;
        }
        if (iM678a < 1 || !ClassI.m743B(this.f335a.b()).equals(ClassI.m743B(cVar.b()))) {
            return iM678a >= 2 && (this.f335a.b(cVar) || this.f335a.c(cVar));
        }
        return true;
    }

    public void m981a(ClassE c0057e, ClassF c0069f) {
        if (m980a(c0057e, c0069f.mo945a())) {
            this.f336b.a(c0057e, c0069f);
        }
    }

    public void m982a(ClassE c0057e, ClassH c0160h) {
        if (m980a(c0057e, c0160h.mo945a())) {
            this.f336b.a(c0057e, c0160h);
        }
    }

    public void m983a(k kVar, ClassL c0163l) {
        if (m980a((c) kVar, c0163l.mo945a())) {
            this.f336b.a(kVar, c0163l);
        }
    }

    public void m984a(k kVar, ClassN c0165n) {
        if (m980a((c) kVar, c0165n.mo945a())) {
            this.f336b.a(kVar, c0165n);
        }
    }
}
