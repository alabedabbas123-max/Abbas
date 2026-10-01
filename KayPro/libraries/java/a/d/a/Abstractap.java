package a.d.a;

import a.b.c;
import com.baidu.mobstat.Config;

public abstract class Abstractap extends Abstractd {
    public int mo1308a(aa c0176aa) {
        return mo1545b((aw) c0176aa);
    }

    public int mo1535a(ClassV c0227v) {
        return mo1306b((ClassA) c0227v);
    }

    public abstract int mo1536a(String str, c cVar);

    public Abstractae mo1537a(Abstractae abstractC0180ae, Interfacebe interfaceC0207be) {
        return interfaceC0207be.mo1310a();
    }

    public Abstractae mo1303a(Interfacebe interfaceC0207be) {
        return interfaceC0207be.mo1310a();
    }

    public Abstractap mo1304a(ClassA c0175a) {
        return mo1539a((aw) c0175a);
    }

    public abstract Abstractap mo1305a(Abstractap abstractC0191ap);

    public Abstractap mo1538a(av c0197av) {
        return mo1305a((Abstractap) c0197av);
    }

    public Abstractap mo1539a(aw c0198aw) {
        return mo1305a((Abstractap) c0198aw);
    }

    public Abstractap mo1540a(bc c0205bc) {
        return c0205bc;
    }

    public Abstractap mo1541a(ClassR c0223r) {
        return mo1550b((ClassV) c0223r);
    }

    public abstract Abstractap mo1542a(String str, c cVar, Interfacebe interfaceC0207be, boolean z);

    @Override
    public final Abstractbd mo1319a(Abstractbd abstractC0206bd) {
        return mo1305a(abstractC0206bd.mo1558l_());
    }

    public void mo1543a(Abstractae abstractC0180ae, Abstractbd abstractC0206bd) {
    }

    public int mo1306b(ClassA c0175a) {
        return mo1545b((aw) c0175a);
    }

    public abstract int mo1307b(Abstractap abstractC0191ap);

    public int mo1544b(av c0197av) {
        return mo1307b((Abstractap) c0197av);
    }

    public int mo1545b(aw c0198aw) {
        return mo1307b((Abstractap) c0198aw);
    }

    public int mo1546b(bc c0205bc) {
        return 0;
    }

    public int mo1547b(ClassR c0223r) {
        return mo1535a((ClassV) c0223r);
    }

    public Abstractaf mo1548b(Abstractae abstractC0180ae, Interfacebe interfaceC0207be) {
        return interfaceC0207be.mo1312b();
    }

    public Abstractap mo1549b(aa c0176aa) {
        return mo1539a((aw) c0176aa);
    }

    public Abstractap mo1550b(ClassV c0227v) {
        return mo1304a((ClassA) c0227v);
    }

    public final int m1551c(Abstractap abstractC0191ap) {
        return -mo1307b(abstractC0191ap);
    }

    public Abstractu mo1552c(Abstractae abstractC0180ae, Interfacebe interfaceC0207be) {
        return interfaceC0207be.mo1314c();
    }

    public Abstractt mo1553d(Abstractae abstractC0180ae, Interfacebe interfaceC0207be) {
        return interfaceC0207be.mo1315d();
    }

    public Abstractap mo1554e(Abstractae abstractC0180ae, Interfacebe interfaceC0207be) {
        return interfaceC0207be.mo1533e();
    }

    public abstract String mo1555e();

    public boolean equals(Object obj) {
        return obj != null && getClass() == obj.getClass();
    }

    public abstract c mo1556f();

    public abstract boolean mo1557h();

    public int hashCode() {
        return getClass().hashCode();
    }

    @Override
    public final int mo1331j() {
        return 5;
    }

    @Override
    public final Abstractap mo1558l_() {
        return this;
    }

    public abstract int mo1559m();

    public final int m1560n() {
        return -mo1559m();
    }

    public String toString() {
        return Config.APP_VERSION_CODE;
    }
}
