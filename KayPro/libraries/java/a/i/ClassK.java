package a.i;

import a.b.c;
import a.b.g.aq;
import a.b.g.s;
import a.b.k;
import a.b.o;
import a.b.ClassE;
import a.b.ClassF;
import a.b.ClassH;
import a.b.ClassL;
import a.b.ClassN;

class ClassK implements aq, s {

    final ClassI f1297a;

    private c f1298b;

    private boolean f1299c;

    private ClassK(ClassI c0481i) {
        this.f1297a = c0481i;
    }

    private void m3079a(o oVar) {
        if (this.f1297a.mo3074c(oVar)) {
            ClassH c0480hM3078g = this.f1297a.m3078g(oVar);
            this.f1299c = c0480hM3078g.m3003a(this.f1298b);
            if (this.f1299c) {
                return;
            }
            c0480hM3078g.m3001a((s) this);
            c0480hM3078g.m3000a((aq) this);
        }
    }

    public void m3080a(ClassE c0057e) {
        m3079a((o) c0057e);
    }

    public void m3081a(ClassE c0057e, ClassF c0069f) {
        m3079a(c0069f);
    }

    public void m3082a(ClassE c0057e, ClassH c0160h) {
        m3079a(c0160h);
    }

    public void m3083a(k kVar) {
        m3079a((o) kVar);
    }

    public void m3084a(k kVar, ClassL c0163l) {
        m3079a(c0163l);
    }

    public void m3085a(k kVar, ClassN c0165n) {
        m3079a(c0165n);
    }
}
