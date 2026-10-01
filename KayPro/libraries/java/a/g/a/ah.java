package a.g.a;

import a.b.b.q;
import a.b.c;
import a.b.Interfaced;
import a.b.Interfacei;
import a.b.Interfacej;
import a.d.ClassB;
import a.d.a.Abstractap;
import a.d.a.Abstractbd;
import a.d.a.Interfacebe;
import a.g.ClassF;
import a.g.b.ag;
import a.g.b.ai;
import a.g.b.ClassL;
import a.g.b.ClassQ;

public class ah extends ClassB {

    private boolean f772e;

    private boolean f773f;

    private boolean f774g;

    public ah(Interfacebe interfaceC0207be, boolean z, boolean z2, boolean z3) {
        super(interfaceC0207be);
        this.f772e = z;
        this.f773f = z2;
        this.f774g = z3;
    }

    public static Abstractbd m1994a(Interfaced interfaceC0041d) {
        return ClassL.m2541a(interfaceC0041d).mo2341e();
    }

    public static Abstractbd m1995a(Interfacej interfaceC0162j) {
        return ClassQ.m2566a(interfaceC0162j).mo2355C();
    }

    public static Abstractbd m1996a(Interfacej interfaceC0162j, int i) {
        return ClassQ.m2566a(interfaceC0162j).mo2382d(i);
    }

    private static void m1997a(Interfaced interfaceC0041d, Abstractap abstractC0191ap) {
        if (ClassF.m2860a(interfaceC0041d)) {
            return;
        }
        ag.m2330b(interfaceC0041d).m2334a(abstractC0191ap);
    }

    private static void m1998a(Interfaced interfaceC0041d, Abstractbd abstractC0206bd) {
        if (ClassF.m2860a(interfaceC0041d)) {
            return;
        }
        ag.m2330b(interfaceC0041d).m2335a(abstractC0206bd);
    }

    private static void m1999a(Interfacej interfaceC0162j, int i, Abstractbd abstractC0206bd) {
        if (ClassF.m2861a(interfaceC0162j)) {
            return;
        }
        ai.m2350b(interfaceC0162j).m2371a(i, abstractC0206bd);
    }

    private static void m2000a(Interfacej interfaceC0162j, Abstractbd abstractC0206bd) {
        if (ClassF.m2861a(interfaceC0162j)) {
            return;
        }
        ai.m2350b(interfaceC0162j).m2373a(abstractC0206bd);
    }

    @Override
    public void mo1602a(c cVar, q qVar, int i, Abstractbd abstractC0206bd) {
        Interfacei interfaceC0161i;
        if (!this.f773f || (interfaceC0161i = qVar.e) == null) {
            return;
        }
        m1999a((Interfacej) interfaceC0161i, i, abstractC0206bd);
    }

    @Override
    public void mo1603a(c cVar, q qVar, Abstractap abstractC0191ap) {
        Interfacei interfaceC0161i;
        if (!this.f772e || (interfaceC0161i = qVar.e) == null) {
            return;
        }
        m1997a((Interfaced) interfaceC0161i, abstractC0191ap);
    }

    @Override
    public void mo1604a(c cVar, q qVar, Abstractbd abstractC0206bd) {
        Interfacei interfaceC0161i;
        if (!this.f772e || (interfaceC0161i = qVar.e) == null) {
            return;
        }
        m1998a((Interfaced) interfaceC0161i, abstractC0206bd);
    }

    @Override
    public void mo1605a(c cVar, Interfacej interfaceC0162j, Abstractbd abstractC0206bd) {
        if (this.f774g) {
            m2000a(interfaceC0162j, abstractC0206bd);
        }
    }
}
