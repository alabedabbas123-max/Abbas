package a.g;

import a.b.g.aq;
import a.b.k;
import a.b.ClassE;
import a.b.ClassF;
import a.b.ClassH;
import a.b.ClassL;
import a.b.ClassN;
import a.g.b.ag;
import a.g.b.ai;
import a.g.b.ClassL;
import a.g.b.ClassQ;

public class ClassL implements aq {

    private final aq f1128a;

    private final aq f1129b;

    public ClassL(aq aqVar) {
        this(aqVar, null);
    }

    public ClassL(aq aqVar, aq aqVar2) {
        this.f1128a = aqVar;
        this.f1129b = aqVar2;
    }

    public void m2887a(ClassE c0057e, ClassF c0069f) {
    }

    public void m2888a(ClassE c0057e, ClassH c0160h) {
    }

    public void m2889a(k kVar, ClassL c0163l) {
        aq aqVar = ClassL.m2541a(c0163l) instanceof ag ? this.f1128a : this.f1129b;
        if (aqVar != null) {
            aqVar.a(kVar, c0163l);
        }
    }

    public void m2890a(k kVar, ClassN c0165n) {
        aq aqVar = ClassQ.m2566a(c0165n) instanceof ai ? this.f1128a : this.f1129b;
        if (aqVar != null) {
            aqVar.a(kVar, c0165n);
        }
    }
}
