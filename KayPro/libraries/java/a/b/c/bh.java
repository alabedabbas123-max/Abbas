package a.b.c;

import a.b.c;
import a.b.f.w;
import a.b.g.aq;
import a.b.g.s;
import a.b.k;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import a.b.ClassL;
import a.b.ClassN;
import a.b.Interfaced;
import a.b.Interfacei;
import a.b.Interfacej;

public class bh extends w implements aq, s {

    private Set f5a = new HashSet();

    private Set f6b = new HashSet();

    public void m22a(c cVar) {
    }

    public void m23a(c cVar, Interfacei interfaceC0161i) {
    }

    public void m24a(k kVar) {
        ClassR c0032r = new ClassR(kVar);
        Iterator it = this.f5a.iterator();
        while (it.hasNext()) {
            c0032r.m190b((Interfacej) it.next());
        }
        this.f5a.clear();
        Iterator it2 = this.f6b.iterator();
        while (it2.hasNext()) {
            c0032r.m189b((Interfaced) it2.next());
        }
        this.f6b.clear();
    }

    public void m25a(k kVar, ClassL c0163l) {
        this.f6b.add(c0163l);
    }

    public void m26a(k kVar, ClassN c0165n) {
        this.f5a.add(c0165n);
    }
}
