package a.b.g;

import a.b.c;
import a.b.g.aq;
import a.b.k;
import java.util.List;
import a.b.ClassE;
import a.b.ClassF;
import a.b.ClassH;
import a.b.ClassL;
import a.b.ClassN;
import a.j.Abstractt;
import a.j.ClassJ;
import a.j.ClassO;

public class ao implements aq {

    private final Abstractt f345a;

    private final aq f346b;

    public ao(Abstractt abstractC0515t, aq aqVar) {
        this.f345a = abstractC0515t;
        this.f346b = aqVar;
    }

    public ao(String str, aq aqVar) {
        this(str, null, aqVar);
    }

    public ao(String str, List list, aq aqVar) {
        this(new ClassJ(new ClassO(list)).mo3150a(str), aqVar);
    }

    private boolean m998a(String str) {
        return this.f345a.mo3151a(str);
    }

    public void m999a(ClassE c0057e, ClassF c0069f) {
        if (m998a(c0069f.mo946a((c) c0057e))) {
            this.f346b.a(c0057e, c0069f);
        }
    }

    public void m1000a(ClassE c0057e, ClassH c0160h) {
        if (m998a(c0160h.mo946a((c) c0057e))) {
            this.f346b.a(c0057e, c0160h);
        }
    }

    public void m1001a(k kVar, ClassL c0163l) {
        if (m998a(c0163l.mo946a((c) kVar))) {
            this.f346b.a(kVar, c0163l);
        }
    }

    public void m1002a(k kVar, ClassN c0165n) {
        if (m998a(c0165n.mo946a((c) kVar))) {
            this.f346b.a(kVar, c0165n);
        }
    }
}
