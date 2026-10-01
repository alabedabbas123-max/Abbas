package a.g.b;

import a.b.b.a.f;
import a.b.b.b;
import a.b.b.r;
import a.b.c;
import a.b.d.a.d;
import a.b.f.w;
import a.b.g.aq;
import a.b.k;
import a.b.ClassL;
import a.b.Interfaced;
import a.b.Interfacei;
import a.b.Interfacej;
import a.b.d.Abstractc;
import a.b.d.ClassB;

public class aj extends w implements f, d, aq {

    private final ClassR f934a;

    private boolean f935b = true;

    private boolean f936c = true;

    public aj(ClassR c0399r) {
        this.f934a = c0399r;
    }

    public static boolean m2411a(Interfaced interfaceC0041d) {
        return ClassL.m2541a(interfaceC0041d).mo2339c();
    }

    public static boolean m2412b(Interfaced interfaceC0041d) {
        return ClassL.m2541a(interfaceC0041d).mo2338b();
    }

    private void m2413c(Interfaced interfaceC0041d) {
        ClassL c0393lM2541a = ClassL.m2541a(interfaceC0041d);
        if (c0393lM2541a.mo2339c() || !(c0393lM2541a instanceof ag)) {
            return;
        }
        ((ag) c0393lM2541a).m2343g();
        this.f934a.m2574a();
    }

    private void m2414d(Interfaced interfaceC0041d) {
        ClassL c0393lM2541a = ClassL.m2541a(interfaceC0041d);
        if (c0393lM2541a.mo2338b() || !(c0393lM2541a instanceof ag)) {
            return;
        }
        ((ag) c0393lM2541a).m2342f();
        this.f934a.m2574a();
    }

    public void m2415a(c cVar, b bVar) {
    }

    public void m2416a(c cVar, a.b.b.d dVar) {
        dVar.a(this);
    }

    public void m2417a(c cVar, r rVar) {
        rVar.a(this);
    }

    public void m2418a(c cVar, Interfacei interfaceC0161i) {
    }

    public void m2419a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassB c0047b) {
        switch (c0047b.f147c) {
            case -78:
            case -76:
                this.f935b = true;
                this.f936c = false;
                cVar.a(c0047b.f139a, this);
                break;
            case -77:
            case -75:
                this.f935b = false;
                this.f936c = true;
                cVar.a(c0047b.f139a, this);
                break;
            case 18:
            case 19:
                this.f935b = true;
                this.f936c = true;
                cVar.a(c0047b.f139a, this);
                break;
        }
    }

    public void m2420a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
    }

    public void m2421a(k kVar, ClassL c0163l) {
        if (this.f935b) {
            m2413c(c0163l);
        }
        if (this.f936c) {
            m2414d(c0163l);
        }
    }
}
