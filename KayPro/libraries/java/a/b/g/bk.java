package a.b.g;

import a.b.c;
import a.b.g.aq;
import a.b.k;
import a.b.ClassE;
import a.b.ClassF;
import a.b.ClassH;
import a.b.ClassL;
import a.b.ClassN;

public class bk implements aq {

    private final c f379a;

    private final boolean f380b;

    private final boolean f381c;

    private final boolean f382d;

    private final boolean f383e;

    private final aq f384f;

    public bk(c cVar, boolean z, boolean z2, boolean z3, boolean z4, aq aqVar) {
        this.f379a = cVar;
        this.f380b = z;
        this.f381c = z2;
        this.f382d = z3;
        this.f383e = z4;
        this.f384f = aqVar;
    }

    public bk(boolean z, boolean z2, boolean z3, boolean z4, aq aqVar) {
        this(null, z, z2, z3, z4, aqVar);
    }

    private c m1064a(c cVar) {
        return this.f379a != null ? this.f379a : cVar;
    }

    public void m1065a(ClassE c0057e, ClassF c0069f) {
        m1064a(c0057e).a(this.f380b, this.f381c, this.f382d, this.f383e, new ax(c0069f.mo946a((c) c0057e), c0069f.mo949b(c0057e), this.f384f));
    }

    public void m1066a(ClassE c0057e, ClassH c0160h) {
        m1064a(c0057e).a(this.f380b, this.f381c, this.f382d, this.f383e, new ay(c0160h.mo946a((c) c0057e), c0160h.mo949b(c0057e), this.f384f));
    }

    public void m1067a(k kVar, ClassL c0163l) {
        m1064a(kVar).a(this.f380b, this.f381c, this.f382d, this.f383e, new ax(c0163l.mo946a((c) kVar), c0163l.mo949b(kVar), this.f384f));
    }

    public void m1068a(k kVar, ClassN c0165n) {
        m1064a(kVar).a(this.f380b, this.f381c, this.f382d, this.f383e, new ay(c0165n.mo946a((c) kVar), c0165n.mo949b(kVar), this.f384f));
    }
}
