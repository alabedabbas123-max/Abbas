package a.b.g;

import a.b.g.aq;
import a.b.k;
import java.util.List;
import a.b.ClassE;
import a.b.ClassF;
import a.b.ClassH;
import a.b.ClassL;
import a.b.ClassN;
import a.j.Abstractt;
import a.j.ClassC;
import a.j.ClassJ;

public class am implements aq {

    private final Abstractt f342a;

    private final aq f343b;

    public am(Abstractt abstractC0515t, aq aqVar) {
        this.f342a = abstractC0515t;
        this.f343b = aqVar;
    }

    public am(String str, aq aqVar) {
        this(str, null, aqVar);
    }

    public am(String str, List list, aq aqVar) {
        this(new ClassJ(new ClassC(list)).mo3150a(str), aqVar);
    }

    private boolean m991a(String str) {
        return this.f342a.mo3151a(str);
    }

    public void m992a(ClassE c0057e, ClassF c0069f) {
        if (m991a(c0069f.mo949b(c0057e))) {
            this.f343b.a(c0057e, c0069f);
        }
    }

    public void m993a(ClassE c0057e, ClassH c0160h) {
        if (m991a(c0160h.mo949b(c0057e))) {
            this.f343b.a(c0057e, c0160h);
        }
    }

    public void m994a(k kVar, ClassL c0163l) {
        if (m991a(c0163l.mo949b(kVar))) {
            this.f343b.a(kVar, c0163l);
        }
    }

    public void m995a(k kVar, ClassN c0165n) {
        if (m991a(c0165n.mo949b(kVar))) {
            this.f343b.a(kVar, c0165n);
        }
    }
}
