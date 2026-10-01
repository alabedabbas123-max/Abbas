package a.g.b;

import a.b.c;

public class ae extends ClassF {

    private volatile boolean f888b = false;

    private volatile boolean f889c = false;

    private volatile boolean f890d = false;

    private volatile boolean f891e = false;

    private volatile boolean f892f = false;

    private volatile boolean f893g = false;

    private volatile boolean f894h = false;

    private volatile boolean f895i = false;

    private volatile boolean f896j = false;

    private volatile boolean f897k = true;

    private volatile c f898l;

    private volatile c f899m;

    public static void m2303e(c cVar) {
        cVar.a(new ae());
    }

    public static ae m2304f(c cVar) {
        return (ae) cVar.f();
    }

    public void m2305a(ClassF c0387f) {
        this.f888b |= c0387f.mo2310d();
        this.f889c |= c0387f.mo2311e();
        this.f890d |= c0387f.mo2312f();
        this.f891e |= c0387f.mo2313g();
        this.f892f |= c0387f.mo2314h();
        this.f893g |= c0387f.mo2315i();
        this.f894h |= c0387f.mo2316j();
        this.f895i |= c0387f.mo2317k();
        this.f896j |= c0387f.mo2318l();
    }

    public void m2306a(boolean z) {
        this.f892f = z;
    }

    public void m2307c(c cVar) {
        this.f898l = cVar;
    }

    @Override
    public boolean mo2308c() {
        return false;
    }

    public void m2309d(c cVar) {
        this.f899m = cVar;
    }

    @Override
    public boolean mo2310d() {
        return this.f888b;
    }

    @Override
    public boolean mo2311e() {
        return this.f889c;
    }

    @Override
    public boolean mo2312f() {
        return this.f890d;
    }

    @Override
    public boolean mo2313g() {
        return this.f891e;
    }

    @Override
    public boolean mo2314h() {
        return this.f892f;
    }

    @Override
    public boolean mo2315i() {
        return this.f893g;
    }

    @Override
    public boolean mo2316j() {
        return !this.f976a && this.f894h;
    }

    @Override
    public boolean mo2317k() {
        return this.f895i;
    }

    @Override
    public boolean mo2318l() {
        return this.f896j;
    }

    @Override
    public c mo2319m() {
        return this.f898l;
    }

    @Override
    public c mo2320n() {
        return this.f899m;
    }

    public void m2321o() {
        this.f888b = true;
    }

    public void m2322p() {
        this.f889c = true;
    }

    public void m2323q() {
        this.f890d = true;
    }

    public void m2324r() {
        this.f891e = true;
    }

    public void m2325s() {
        this.f893g = true;
    }

    public void m2326t() {
        this.f894h = true;
    }

    public void m2327u() {
        this.f895i = true;
    }

    public void m2328v() {
        this.f896j = true;
    }
}
