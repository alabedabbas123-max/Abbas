package a.g.b;

import a.b.c;
import a.b.Interfacei;
import a.b.Interfacej;
import a.b.f.ClassI;
import a.b.f.ClassU;
import a.d.a.Abstractbd;
import a.j.ClassB;

public class ai extends ClassQ {

    private static final Abstractbd[] f910e = new Abstractbd[0];

    private volatile Abstractbd f912B;

    private volatile Abstractbd[] f931x;

    private volatile boolean f913f = false;

    private volatile boolean f914g = true;

    private volatile boolean f915h = false;

    private volatile boolean f916i = false;

    private volatile boolean f917j = false;

    private volatile boolean f918k = false;

    private volatile boolean f919l = false;

    private volatile boolean f920m = false;

    private volatile boolean f921n = false;

    private volatile boolean f922o = false;

    private volatile boolean f923p = false;

    private volatile int f924q = 0;

    private volatile int f925r = 0;

    private volatile long f926s = 0;

    private volatile long f927t = 0;

    private volatile long f928u = 0;

    private volatile long f929v = 0;

    private volatile boolean f930w = false;

    private volatile long f932y = 0;

    private volatile boolean f933z = false;

    private volatile boolean f911A = false;

    public ai(c cVar, Interfacej interfaceC0162j) {
        int iM797t = ClassI.m797t(interfaceC0162j.mo949b(cVar));
        iM797t = (interfaceC0162j.mo945a() & 8) == 0 ? iM797t + 1 : iM797t;
        this.f931x = iM797t == 0 ? f910e : new Abstractbd[iM797t];
    }

    private long m2347a(long j, int i) {
        return i < 64 ? j | (1 << i) : j;
    }

    private long m2348a(long j, int i, long j2) {
        long j3 = (-1) << i;
        return ((j3 & j) << 1) | (((-1) ^ j3) & j) | (j2 << i);
    }

    private long m2349b(long j, int i, long j2) {
        long j3 = (-1) << i;
        return (((j3 << 1) & j) >>> 1) | (((-1) ^ j3) & j) | (j2 << 63);
    }

    public static ai m2350b(Interfacej interfaceC0162j) {
        return (ai) ClassU.m907a((Interfacei) interfaceC0162j).f();
    }

    public static void m2351b(c cVar, Interfacej interfaceC0162j) {
        ClassU.m907a((Interfacei) interfaceC0162j).a(new ai(cVar, interfaceC0162j));
    }

    private boolean m2352b(long j, int i) {
        return i >= 64 || ((1 << i) & j) != 0;
    }

    @Override
    public boolean mo2353A() {
        return this.f933z;
    }

    @Override
    public boolean mo2354B() {
        return !this.f991d && this.f911A;
    }

    @Override
    public Abstractbd mo2355C() {
        return this.f912B;
    }

    public void m2356D() {
        this.f913f = true;
    }

    public void m2357E() {
        this.f914g = false;
    }

    public void m2358F() {
        this.f915h = true;
    }

    public void m2359G() {
        this.f916i = true;
    }

    public void m2360H() {
        this.f917j = true;
    }

    public void m2361I() {
        this.f918k = true;
    }

    public void m2362J() {
        this.f919l = true;
    }

    public void m2363K() {
        this.f920m = true;
    }

    public void m2364L() {
        this.f921n = true;
    }

    public void m2365M() {
        this.f922o = true;
    }

    public void m2366N() {
        this.f923p = true;
    }

    public void m2367O() {
        this.f924q++;
    }

    public void m2368P() {
        this.f930w = true;
    }

    public void m2369Q() {
        this.f933z = true;
    }

    public void m2370R() {
        this.f911A = true;
    }

    public synchronized void m2371a(int i, Abstractbd abstractC0206bd) {
        Abstractbd[] abstractC0206bdArr = this.f931x;
        if (this.f931x[i] != null) {
            abstractC0206bd = this.f931x[i].mo1319a(abstractC0206bd);
        }
        abstractC0206bdArr[i] = abstractC0206bd;
    }

    public synchronized void m2372a(long j) {
        this.f926s |= j;
    }

    public synchronized void m2373a(Abstractbd abstractC0206bd) {
        if (this.f912B != null) {
            abstractC0206bd = this.f912B.mo1319a(abstractC0206bd);
        }
        this.f912B = abstractC0206bd;
    }

    public synchronized void m2374a(ClassQ c0398q) {
        this.f915h |= c0398q.mo2392j();
        this.f916i |= c0398q.mo2394k();
        this.f917j |= c0398q.mo2396l();
        this.f918k |= c0398q.mo2397m();
        this.f919l |= c0398q.mo2398n();
        this.f920m |= c0398q.mo2399o();
        this.f921n |= c0398q.mo2400p();
        this.f922o |= c0398q.mo2401q();
    }

    @Override
    public boolean mo2375a() {
        return false;
    }

    @Override
    public boolean mo2376a(int i) {
        return m2352b(this.f926s, i);
    }

    public synchronized void m2377b(long j) {
        this.f928u |= j;
    }

    public synchronized void m2378b(Abstractbd abstractC0206bd) {
        this.f912B = abstractC0206bd;
    }

    @Override
    public boolean mo2379b(int i) {
        return !this.f990c && m2352b(this.f928u, i);
    }

    public synchronized void m2380c(long j) {
        this.f929v |= j;
    }

    @Override
    public boolean mo2381c(int i) {
        if (!this.f988a && (!this.f989b || i == 0)) {
            if (m2352b(this.f930w ? this.f929v | this.f927t : this.f929v, i)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Abstractbd mo2382d(int i) {
        if (this.f931x != null) {
            return this.f931x[i];
        }
        return null;
    }

    public synchronized void m2383d(long j) {
        this.f932y |= j;
    }

    @Override
    public boolean mo2384e(int i) {
        return m2352b(this.f932y, i);
    }

    public synchronized void m2385f(int i) {
        this.f925r = i;
    }

    public synchronized void m2386g(int i) {
        this.f926s = m2347a(this.f926s, i);
    }

    public synchronized void m2387h(int i) {
        this.f927t = m2348a(this.f927t, i, 1L);
        this.f928u = m2348a(this.f928u, i, 1L);
        this.f929v = m2348a(this.f929v, i, 1L);
        this.f932y = m2348a(this.f932y, i, 1L);
        this.f931x = (Abstractbd[]) ClassB.m3137a(this.f931x, this.f931x.length, i, (Object) null);
    }

    @Override
    public boolean mo2388h() {
        return !this.f988a && this.f913f;
    }

    public synchronized void m2389i(int i) {
        this.f927t = m2349b(this.f927t, i, 1L);
        this.f928u = m2349b(this.f928u, i, 1L);
        this.f929v = m2349b(this.f929v, i, 1L);
        this.f932y = m2349b(this.f932y, i, 1L);
        ClassB.m3130a(this.f931x, this.f931x.length, i);
    }

    @Override
    public boolean mo2390i() {
        return this.f914g;
    }

    public synchronized void m2391j(int i) {
        this.f928u = m2347a(this.f928u, i);
    }

    @Override
    public boolean mo2392j() {
        return this.f915h;
    }

    public synchronized void m2393k(int i) {
        this.f929v = m2347a(this.f929v, i);
    }

    @Override
    public boolean mo2394k() {
        return this.f916i;
    }

    public synchronized void m2395l(int i) {
        this.f932y = m2347a(this.f932y, i);
    }

    @Override
    public boolean mo2396l() {
        return this.f917j;
    }

    @Override
    public boolean mo2397m() {
        return this.f918k;
    }

    @Override
    public boolean mo2398n() {
        return this.f919l;
    }

    @Override
    public boolean mo2399o() {
        return this.f920m;
    }

    @Override
    public boolean mo2400p() {
        return this.f921n;
    }

    @Override
    public boolean mo2401q() {
        return this.f922o;
    }

    @Override
    public boolean mo2402r() {
        return this.f923p;
    }

    @Override
    public int mo2403s() {
        return this.f924q;
    }

    @Override
    public int mo2404t() {
        return this.f925r;
    }

    @Override
    public boolean mo2405u() {
        return (this.f926s | ((-1) << this.f925r)) != -1;
    }

    @Override
    public long mo2406v() {
        return this.f926s;
    }

    @Override
    public long mo2407w() {
        if (this.f990c) {
            return 0L;
        }
        return this.f928u;
    }

    @Override
    public long mo2408x() {
        if (this.f988a) {
            return 0L;
        }
        return this.f989b ? this.f929v & 1 : this.f929v;
    }

    @Override
    public boolean mo2409y() {
        return !this.f989b && this.f930w;
    }

    @Override
    public long mo2410z() {
        return this.f932y;
    }
}
