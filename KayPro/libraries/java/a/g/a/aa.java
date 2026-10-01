package a.g.a;

import a.b.c;
import a.b.d.a.d;
import a.b.f.w;
import a.b.Interfacej;
import a.b.d.Abstractc;
import a.b.d.ClassB;
import a.b.d.ClassH;
import a.d.a.Abstractae;
import a.d.a.Abstractaf;
import a.d.a.Abstractap;
import a.d.a.Abstractbd;
import a.d.a.Abstractt;
import a.d.a.Abstractu;
import a.d.a.ad;
import a.d.a.av;
import a.d.a.Interfacebe;

public class aa extends w implements d, Interfacebe {

    private final Interfacebe f742a;

    private final boolean f743b;

    private Abstractbd f744c;

    public aa(Interfacebe interfaceC0207be) {
        this(interfaceC0207be, true);
    }

    public aa(Interfacebe interfaceC0207be, boolean z) {
        this.f742a = interfaceC0207be;
        this.f743b = z;
    }

    @Override
    public Abstractae mo1310a() {
        return this.f742a.mo1310a();
    }

    @Override
    public Abstractae mo1528a(int i) {
        return this.f742a.mo1528a(i);
    }

    @Override
    public Abstractaf mo1529a(long j) {
        return this.f742a.mo1529a(j);
    }

    public Abstractap m1906a(Abstractap abstractC0191ap) {
        return this.f744c != null ? new av(abstractC0191ap, this.f744c) : abstractC0191ap;
    }

    @Override
    public Abstractap mo1311a(String str, c cVar, Abstractae abstractC0180ae) {
        return m1906a(this.f742a.mo1311a(str, cVar, abstractC0180ae));
    }

    @Override
    public Abstractap mo1530a(String str, c cVar, Abstractae abstractC0180ae, Abstractbd abstractC0206bd) {
        return m1906a(this.f742a.mo1530a(str, cVar, abstractC0180ae, abstractC0206bd));
    }

    public av m1907a(av c0197av, String str, c cVar, boolean z) {
        return new av(c0197av.m1581q().mo1542a(str, cVar, this.f742a, z), this.f743b ? c0197av.m1582s() : this.f744c);
    }

    public Abstractbd m1908a(Abstractbd abstractC0206bd) {
        return abstractC0206bd.mo1331j() == 5 ? m1906a(abstractC0206bd.mo1558l_()) : abstractC0206bd;
    }

    @Override
    public Abstractbd mo1591a(String str, c cVar, boolean z, boolean z2) {
        return m1908a(this.f742a.mo1591a(str, cVar, z, z2));
    }

    @Override
    public Abstractt mo1531a(double d) {
        return this.f742a.mo1531a(d);
    }

    @Override
    public Abstractu mo1532a(float f) {
        return this.f742a.mo1532a(f);
    }

    public void m1909a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassB c0047b) {
        switch (c0047b.f147c) {
            case -78:
            case -76:
                this.f744c = new ad(67108864 | i);
                break;
            case -74:
            case -73:
            case -72:
            case -71:
                this.f744c = new ad(33554432 | i);
                break;
            case -69:
            case -67:
            case -59:
            case 18:
            case 19:
                this.f744c = new ad(134217728 | i);
                break;
            case -64:
                this.f744c = new ad(268435456 | i);
                break;
            default:
                this.f744c = null;
                break;
        }
    }

    public void m1910a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
        this.f744c = null;
    }

    public void m1911a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassH c0053h) {
        switch (c0053h.f147c) {
            case -68:
            case -65:
            case 1:
                this.f744c = new ad(134217728 | i);
                break;
            case 50:
                this.f744c = new ad(i);
                break;
            default:
                this.f744c = null;
                break;
        }
    }

    @Override
    public Abstractaf mo1312b() {
        return this.f742a.mo1312b();
    }

    @Override
    public Abstractap mo1313b(String str, c cVar, boolean z, boolean z2) {
        return m1906a(this.f742a.mo1313b(str, cVar, z, z2));
    }

    @Override
    public Abstractu mo1314c() {
        return this.f742a.mo1314c();
    }

    @Override
    public Abstractt mo1315d() {
        return this.f742a.mo1315d();
    }

    @Override
    public Abstractap mo1533e() {
        return m1906a(this.f742a.mo1533e());
    }

    @Override
    public Abstractap mo1534f() {
        return m1906a(this.f742a.mo1534f());
    }
}
