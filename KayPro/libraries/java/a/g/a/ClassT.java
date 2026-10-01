package a.g.a;

import a.b.b.q;
import a.b.c;
import a.b.Interfaced;
import a.b.Interfacei;
import a.b.Interfacej;
import a.d.ClassB;
import a.d.a.Abstractbd;
import a.d.a.Interfacebe;

public class ClassT extends ClassB {

    private final boolean f839e;

    private final boolean f840f;

    private final boolean f841g;

    public ClassT(Interfacebe interfaceC0207be, boolean z, boolean z2, boolean z3) {
        super(interfaceC0207be);
        this.f839e = z;
        this.f840f = z2;
        this.f841g = z3;
    }

    @Override
    public Abstractbd mo1600a(c cVar, q qVar, String str) {
        Interfacei interfaceC0161i;
        Abstractbd abstractC0206bdM1994a;
        return (!this.f839e || (interfaceC0161i = qVar.e) == null || (abstractC0206bdM1994a = ah.m1994a((Interfaced) interfaceC0161i)) == null) ? super.mo1600a(cVar, qVar, str) : abstractC0206bdM1994a;
    }

    @Override
    public Abstractbd mo1601a(c cVar, Interfacej interfaceC0162j, int i, String str, c cVar2) {
        Abstractbd abstractC0206bdM1996a;
        return (!this.f840f || (abstractC0206bdM1996a = ah.m1996a(interfaceC0162j, i)) == null) ? super.mo1601a(cVar, interfaceC0162j, i, str, cVar2) : abstractC0206bdM1996a;
    }

    @Override
    public Abstractbd mo1611b(c cVar, q qVar, String str) {
        Interfacei interfaceC0161i;
        Abstractbd abstractC0206bdM1995a;
        return (!this.f841g || (interfaceC0161i = qVar.e) == null || (abstractC0206bdM1995a = ah.m1995a((Interfacej) interfaceC0161i)) == null) ? super.mo1611b(cVar, qVar, str) : abstractC0206bdM1995a;
    }
}
