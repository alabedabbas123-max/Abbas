package a.d;

import a.b.b.a;
import a.b.b.a.f;
import a.b.b.e;
import a.b.b.i;
import a.b.b.j;
import a.b.b.k;
import a.b.b.p;
import a.b.b.r;
import a.b.c;
import a.b.f.w;
import a.d.a.Abstractbd;
import a.d.a.Interfacebe;

public class ClassE extends w implements f {

    protected final Interfacebe f556a;

    protected Abstractbd f557b;

    public ClassE(Interfacebe interfaceC0207be) {
        this.f556a = interfaceC0207be;
    }

    public Abstractbd m1613a(c cVar, int i) {
        cVar.a(i, this);
        return this.f557b;
    }

    public void mo1612a(c cVar, a aVar) {
        this.f557b = this.f556a.mo1313b(aVar.a(cVar), aVar.b, false, false);
    }

    public void m1614a(c cVar, a.b.b.c cVar2) {
        this.f557b = this.f556a.mo1531a(cVar2.b());
    }

    public void m1615a(c cVar, e eVar) {
        this.f557b = this.f556a.mo1532a(eVar.b());
    }

    public void m1616a(c cVar, a.b.b.f fVar) {
        this.f557b = this.f556a.mo1528a(fVar.b());
    }

    public void m1617a(c cVar, i iVar) {
        this.f557b = this.f556a.mo1529a(iVar.b());
    }

    public void m1618a(c cVar, j jVar) {
        this.f557b = this.f556a.mo1313b("java/lang/invoke/MethodHandle", jVar.c, false, false);
    }

    public void m1619a(c cVar, k kVar) {
        this.f557b = this.f556a.mo1313b("java/lang/invoke/MethodType", kVar.b, false, false);
    }

    public void m1620a(c cVar, p pVar) {
        this.f557b = this.f556a.mo1311a("" + pVar.b(), null, this.f556a.mo1528a(pVar.c()));
    }

    public void m1621a(c cVar, r rVar) {
        this.f557b = this.f556a.mo1313b("java/lang/String", rVar.e, false, false);
    }
}
