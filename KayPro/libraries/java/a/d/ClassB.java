package a.d;

import a.b.b.a;
import a.b.b.h;
import a.b.b.q;
import a.b.c;
import a.b.g.aq;
import a.b.k;
import a.b.ClassE;
import a.b.ClassF;
import a.b.ClassH;
import a.b.ClassL;
import a.b.ClassN;
import a.b.Interfacej;
import a.b.f.ClassI;
import a.d.a.Abstractap;
import a.d.a.Abstractbd;
import a.d.a.Interfacebe;

public class ClassB extends Abstracth implements aq, Interfacef {

    protected final Interfacebe f554a;

    private c f555e;

    public ClassB(Interfacebe interfaceC0207be) {
        this.f554a = interfaceC0207be;
    }

    @Override
    public Abstractbd mo1599a(c cVar, h hVar, String str) {
        c[] cVarArr = hVar.c;
        return this.f554a.mo1591a(str, (cVarArr == null || !ClassI.m784j(str)) ? null : cVarArr[cVarArr.length - 1], true, true);
    }

    @Override
    public Abstractbd mo1600a(c cVar, q qVar, String str) {
        this.f555e = null;
        qVar.a(this);
        return this.f554a.mo1591a(str, this.f555e, true, true);
    }

    @Override
    public Abstractbd mo1601a(c cVar, Interfacej interfaceC0162j, int i, String str, c cVar2) {
        return this.f554a.mo1591a(str, cVar2, true, i == 0 && (interfaceC0162j.mo945a() & 8) == 0 ? false : true);
    }

    @Override
    public void mo1602a(c cVar, q qVar, int i, Abstractbd abstractC0206bd) {
    }

    @Override
    public void mo1603a(c cVar, q qVar, Abstractap abstractC0191ap) {
    }

    @Override
    public void mo1604a(c cVar, q qVar, Abstractbd abstractC0206bd) {
    }

    @Override
    public void mo1605a(c cVar, Interfacej interfaceC0162j, Abstractbd abstractC0206bd) {
    }

    public void m1606a(ClassE c0057e, ClassF c0069f) {
        this.f555e = c0069f.f188a;
    }

    public void m1607a(ClassE c0057e, ClassH c0160h) {
        c[] cVarArr = c0160h.f427a;
        if (cVarArr == null || !ClassI.m784j(c0160h.mo949b(c0057e))) {
            return;
        }
        this.f555e = cVarArr[cVarArr.length - 1];
    }

    public void m1608a(k kVar, ClassL c0163l) {
        this.f555e = c0163l.f429a;
    }

    public void m1609a(k kVar, ClassN c0165n) {
        c[] cVarArr = c0165n.f437a;
        if (cVarArr == null || !ClassI.m784j(c0165n.mo949b(kVar))) {
            return;
        }
        this.f555e = cVarArr[cVarArr.length - 1];
    }

    @Override
    public Abstractbd mo1610b(c cVar, a aVar) {
        return this.f554a.mo1313b(aVar != null ? aVar.a(cVar) : "java/lang/Throwable", aVar != null ? aVar.b : null, true, false);
    }

    @Override
    public Abstractbd mo1611b(c cVar, q qVar, String str) {
        this.f555e = null;
        qVar.a(this);
        return this.f554a.mo1591a(str, this.f555e, true, true);
    }
}
