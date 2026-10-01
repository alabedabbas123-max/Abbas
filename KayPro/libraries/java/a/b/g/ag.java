package a.b.g;

import a.b.g.aq;
import a.b.k;
import a.b.ClassE;
import a.b.ClassF;
import a.b.ClassH;
import a.b.ClassL;
import a.b.ClassN;

public class ag implements aq {

    private final int f329a;

    private final int f330b;

    private final int f331c;

    private final aq f332d;

    public ag(int i, int i2, aq aqVar) {
        this.f329a = i & (-8);
        this.f330b = i2;
        this.f331c = i & 7;
        this.f332d = aqVar;
    }

    private boolean m965a(int i) {
        return (this.f329a & (i ^ (-1))) == 0 && (this.f330b & i) == 0 && (this.f331c == 0 || (this.f331c & i) != 0);
    }

    public void m966a(ClassE c0057e, ClassF c0069f) {
        if (m965a(c0069f.mo945a())) {
            this.f332d.a(c0057e, c0069f);
        }
    }

    public void m967a(ClassE c0057e, ClassH c0160h) {
        if (m965a(c0160h.mo945a())) {
            this.f332d.a(c0057e, c0160h);
        }
    }

    public void m968a(k kVar, ClassL c0163l) {
        if (m965a(c0163l.mo945a())) {
            this.f332d.a(kVar, c0163l);
        }
    }

    public void m969a(k kVar, ClassN c0165n) {
        if (m965a(c0165n.mo945a())) {
            this.f332d.a(kVar, c0165n);
        }
    }
}
