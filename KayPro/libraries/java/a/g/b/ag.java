package a.g.b;

import a.b.a.a;
import a.b.a.d.i;
import a.b.a.e;
import a.b.c;
import a.b.Interfaced;
import a.d.ClassE;
import a.d.a.Abstractap;
import a.d.a.Abstractbd;
import a.d.a.ac;
import a.d.a.ao;
import a.d.a.Interfacebe;

public class ag extends ClassL implements i {

    private static final Interfacebe f901a = new ao();

    private static final ClassE f902b = new ClassE(f901a);

    private static final ac f903c = new ac(f901a);

    private volatile boolean f904d;

    private volatile boolean f905e;

    private volatile boolean f906f;

    private volatile Abstractap f907g;

    private volatile Abstractbd f908h;

    public ag(c cVar, Interfaced interfaceC0041d) {
        this.f906f = true;
        boolean z = (interfaceC0041d.mo945a() & 64) != 0;
        this.f905e = z;
        this.f904d = z;
        m2337b(cVar, interfaceC0041d);
    }

    public ag(ag c0363ag) {
        this.f906f = true;
        this.f904d = c0363ag.f904d;
        this.f905e = c0363ag.f905e;
        this.f906f = c0363ag.f906f;
        this.f907g = c0363ag.f907g;
        this.f908h = c0363ag.f908h;
    }

    public static ag m2330b(Interfaced interfaceC0041d) {
        return (ag) interfaceC0041d.f();
    }

    public static void m2331c(c cVar, Interfaced interfaceC0041d) {
        interfaceC0041d.a(new ag(cVar, interfaceC0041d));
    }

    public void m2332a(c cVar, a aVar) {
    }

    public void m2333a(c cVar, Interfaced interfaceC0041d, e eVar) {
        this.f908h = f902b.m1613a(cVar, eVar.c);
    }

    public synchronized void m2334a(Abstractap abstractC0191ap) {
        if (this.f907g != null) {
            abstractC0191ap = this.f907g.mo1305a(abstractC0191ap);
        }
        this.f907g = abstractC0191ap;
    }

    public synchronized void m2335a(Abstractbd abstractC0206bd) {
        if (this.f908h != null) {
            abstractC0206bd = this.f908h.mo1319a(abstractC0206bd);
        }
        this.f908h = abstractC0206bd;
    }

    @Override
    public boolean mo2336a() {
        return false;
    }

    public void m2337b(c cVar, Interfaced interfaceC0041d) {
        int iA = interfaceC0041d.mo945a();
        this.f908h = null;
        if ((iA & 8) != 0) {
            interfaceC0041d.mo947a(cVar, new a.b.a.d.a(this));
        }
        if (this.f908h == null) {
            if (ap.f949a || (iA & 16) == 0) {
                this.f908h = f903c.m1316a(interfaceC0041d.mo949b(cVar));
            }
        }
    }

    @Override
    public boolean mo2338b() {
        return this.f904d;
    }

    @Override
    public boolean mo2339c() {
        return this.f905e;
    }

    @Override
    public boolean mo2340d() {
        return this.f906f;
    }

    @Override
    public Abstractbd mo2341e() {
        return this.f908h;
    }

    public void m2342f() {
        this.f904d = true;
    }

    public void m2343g() {
        this.f905e = true;
    }

    public void m2344h() {
        this.f906f = false;
    }
}
