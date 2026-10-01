package a.d.a;

import a.b.c;
import a.g.a.aa;

public class av extends Abstractap {

    private final Abstractap f507a;

    private final Abstractbd f508b;

    public av(Abstractap abstractC0191ap, Abstractbd abstractC0206bd) {
        this.f507a = abstractC0191ap;
        this.f508b = abstractC0206bd;
    }

    @Override
    public int mo1308a(aa c0176aa) {
        return this.f507a.mo1308a(c0176aa);
    }

    @Override
    public int mo1535a(ClassV c0227v) {
        return this.f507a.mo1535a(c0227v);
    }

    @Override
    public int mo1536a(String str, c cVar) {
        return this.f507a.mo1536a(str, cVar);
    }

    @Override
    public Abstractae mo1537a(Abstractae abstractC0180ae, Interfacebe interfaceC0207be) {
        return this.f507a.mo1537a(abstractC0180ae, interfaceC0207be);
    }

    @Override
    public Abstractae mo1303a(Interfacebe interfaceC0207be) {
        return this.f507a.mo1303a(interfaceC0207be);
    }

    @Override
    public Abstractap mo1304a(ClassA c0175a) {
        return new av(this.f507a.mo1304a(c0175a), this.f508b);
    }

    @Override
    public Abstractap mo1305a(Abstractap abstractC0191ap) {
        return abstractC0191ap.mo1538a(this);
    }

    @Override
    public Abstractap mo1538a(av c0197av) {
        return equals(c0197av) ? this : new av(this.f507a.mo1305a(c0197av.f507a), this.f508b.mo1319a(c0197av.f508b));
    }

    @Override
    public Abstractap mo1539a(aw c0198aw) {
        return new av(this.f507a.mo1539a(c0198aw), this.f508b);
    }

    @Override
    public Abstractap mo1540a(bc c0205bc) {
        return new av(this.f507a.mo1540a(c0205bc), this.f508b);
    }

    @Override
    public Abstractap mo1541a(ClassR c0223r) {
        return new av(this.f507a.mo1541a(c0223r), this.f508b);
    }

    @Override
    public Abstractap mo1542a(String str, c cVar, Interfacebe interfaceC0207be, boolean z) {
        return ((aa) interfaceC0207be).m1907a(this, str, cVar, z);
    }

    @Override
    public void mo1543a(Abstractae abstractC0180ae, Abstractbd abstractC0206bd) {
        this.f507a.mo1543a(abstractC0180ae, abstractC0206bd);
    }

    @Override
    public int mo1306b(ClassA c0175a) {
        return this.f507a.mo1306b(c0175a);
    }

    @Override
    public int mo1307b(Abstractap abstractC0191ap) {
        return abstractC0191ap.mo1544b(this);
    }

    @Override
    public int mo1544b(av c0197av) {
        return this.f507a.mo1307b(c0197av.f507a);
    }

    @Override
    public int mo1545b(aw c0198aw) {
        return this.f507a.mo1545b(c0198aw);
    }

    @Override
    public int mo1546b(bc c0205bc) {
        return this.f507a.mo1546b(c0205bc);
    }

    @Override
    public int mo1547b(ClassR c0223r) {
        return this.f507a.mo1547b(c0223r);
    }

    @Override
    public Abstractaf mo1548b(Abstractae abstractC0180ae, Interfacebe interfaceC0207be) {
        return this.f507a.mo1548b(abstractC0180ae, interfaceC0207be);
    }

    @Override
    public Abstractap mo1549b(aa c0176aa) {
        return new av(this.f507a.mo1549b(c0176aa), this.f508b);
    }

    @Override
    public Abstractap mo1550b(ClassV c0227v) {
        return new av(this.f507a.mo1550b(c0227v), this.f508b);
    }

    @Override
    public Abstractu mo1552c(Abstractae abstractC0180ae, Interfacebe interfaceC0207be) {
        return this.f507a.mo1552c(abstractC0180ae, interfaceC0207be);
    }

    @Override
    public boolean mo1321c() {
        return this.f507a.mo1321c();
    }

    @Override
    public Abstractt mo1553d(Abstractae abstractC0180ae, Interfacebe interfaceC0207be) {
        return this.f507a.mo1553d(abstractC0180ae, interfaceC0207be);
    }

    @Override
    public boolean mo1309d() {
        return this.f507a.mo1309d();
    }

    @Override
    public Abstractap mo1554e(Abstractae abstractC0180ae, Interfacebe interfaceC0207be) {
        Abstractap abstractC0191apMo1554e = this.f507a.mo1554e(abstractC0180ae, interfaceC0207be);
        return abstractC0191apMo1554e instanceof av ? abstractC0191apMo1554e : ((aa) interfaceC0207be).m1906a(abstractC0191apMo1554e);
    }

    @Override
    public String mo1555e() {
        return this.f507a.mo1555e();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        av c0197av = (av) obj;
        return this.f507a.equals(c0197av.f507a) && this.f508b.equals(c0197av.f508b);
    }

    @Override
    public c mo1556f() {
        return this.f507a.mo1556f();
    }

    @Override
    public boolean mo1557h() {
        return this.f507a.mo1557h();
    }

    @Override
    public int hashCode() {
        return this.f507a.hashCode() ^ this.f508b.hashCode();
    }

    @Override
    public String mo1334k() {
        return this.f507a.mo1334k();
    }

    @Override
    public int mo1559m() {
        return this.f507a.mo1559m();
    }

    public Abstractap m1581q() {
        return this.f507a;
    }

    public Abstractbd m1582s() {
        return this.f508b;
    }

    @Override
    public String toString() {
        return this.f508b.toString() + this.f507a.toString();
    }
}
