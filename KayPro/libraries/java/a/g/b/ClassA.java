package a.g.b;

import a.b.b.a;
import a.b.b.a.f;
import a.b.b.b;
import a.b.b.h;
import a.b.b.j;
import a.b.b.q;
import a.b.b.r;
import a.b.c;
import a.b.d.a.d;
import a.b.f.w;
import a.b.g.aq;
import a.b.g.s;
import a.b.Interfacei;
import a.b.Interfacej;
import a.b.d.Abstractc;
import a.b.d.ClassB;

public class ClassA extends w implements f, d, aq, s {

    private Interfacej f871a;

    public static boolean m2226a(Interfacej interfaceC0162j) {
        return ClassQ.m2566a(interfaceC0162j).mo2398n();
    }

    public static boolean m2227b(Interfacej interfaceC0162j) {
        return ClassQ.m2566a(interfaceC0162j).mo2399o();
    }

    public static boolean m2228c(Interfacej interfaceC0162j) {
        return ClassQ.m2566a(interfaceC0162j).mo2400p();
    }

    private static void m2229d(Interfacej interfaceC0162j) {
        ai.m2350b(interfaceC0162j).m2362J();
    }

    private static void m2230e(Interfacej interfaceC0162j) {
        ai.m2350b(interfaceC0162j).m2363K();
    }

    private static void m2231f(Interfacej interfaceC0162j) {
        ai.m2350b(interfaceC0162j).m2364L();
    }

    public void m2232a(c cVar) {
        if ((cVar.a() & 1) == 0) {
            m2230e(this.f871a);
        }
    }

    public void m2233a(c cVar, a aVar) {
        aVar.a(this);
    }

    public void m2234a(c cVar, b bVar) {
    }

    public void m2235a(c cVar, h hVar) {
        hVar.b(cVar, this);
    }

    public void m2236a(c cVar, j jVar) {
        cVar.a(jVar.b, this);
    }

    public void m2237a(c cVar, r rVar) {
        rVar.a(this);
        rVar.a(this);
    }

    public void m2238a(c cVar, Interfacei interfaceC0161i) {
        int iMo945a = interfaceC0161i.mo945a();
        if ((iMo945a & 2) != 0) {
            m2229d(this.f871a);
        } else if ((iMo945a & 4) != 0) {
            m2231f(this.f871a);
        } else if ((iMo945a & 1) == 0) {
            m2230e(this.f871a);
        }
    }

    public void m2239a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassB c0047b) {
        this.f871a = interfaceC0162j;
        cVar.a(c0047b.f139a, this);
    }

    public void m2240a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
    }

    public void m2241b(c cVar, q qVar) {
        cVar.a(qVar.a, this);
        qVar.a(this);
        qVar.a(this);
    }
}
