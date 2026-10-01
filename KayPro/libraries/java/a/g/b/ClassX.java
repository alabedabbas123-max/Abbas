package a.g.b;

import a.b.c;
import a.b.d.a.d;
import a.b.f.w;
import a.b.Interfacej;
import a.b.d.Abstractc;
import a.b.d.ClassH;

public class ClassX extends w implements d {

    private final a.b.a.d.w f993a;

    public ClassX(a.b.a.d.w wVar) {
        this.f993a = wVar;
    }

    private void m2598a(Interfacej interfaceC0162j, int i, int i2) {
        if (!this.f993a.a(i) || this.f993a.b(i) > i2) {
            m2600b(interfaceC0162j);
        }
    }

    public static boolean m2599a(Interfacej interfaceC0162j) {
        return ClassQ.m2566a(interfaceC0162j).mo2402r();
    }

    private static void m2600b(Interfacej interfaceC0162j) {
        ai.m2350b(interfaceC0162j).m2366N();
    }

    public void m2601a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
    }

    public void m2602a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassH c0053h) {
        switch (c0053h.f147c) {
            case -84:
            case -82:
            case -80:
                m2598a(interfaceC0162j, i, 1);
                break;
            case -83:
            case -81:
                m2598a(interfaceC0162j, i, 2);
                break;
            case -79:
                m2598a(interfaceC0162j, i, 0);
                break;
        }
    }
}
