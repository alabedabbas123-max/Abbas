package a;

import a.b.a;
import a.b.b;
import java.util.List;
import a.e.ClassA;
import a.e.ae;
import a.e.af;
import a.e.ClassB;
import a.e.ClassK;
import a.e.ClassL;
import a.e.ClassR;
import a.e.ClassS;
import a.e.ClassV;
import a.e.ClassY;
import a.e.Interfaceo;
import a.j.ClassG;
import a.j.ClassH;
import a.j.ClassJ;
import a.j.ClassL;
import a.j.ClassN;

public class ClassN {

    private final b f1360a;

    private final ClassN f1361b;

    public ClassN(b bVar, ClassN c0509n) {
        this.f1360a = bVar;
        this.f1361b = c0509n;
    }

    private Interfaceo m3244a(Interfaceo interfaceC0275o, boolean z, boolean z2, String str, List list, byte[] bArr, String str2) {
        Interfaceo c0282v;
        if (z) {
            c0282v = new ae(interfaceC0275o);
        } else {
            ClassY c0285y = new ClassY(bArr, interfaceC0275o);
            c0282v = str2 != null ? new ClassV(new ClassK(new ClassG(".class")), new af(str2, c0285y), c0285y) : c0285y;
        }
        ClassL c0272l = new ClassL(new ClassK(new ClassG(str)));
        Interfaceo c0282v2 = list != null ? new ClassV(new ClassL(new ClassK(new ClassJ(new ClassH()).m3155a(list))), c0282v) : c0282v;
        if (!z2) {
            c0282v = interfaceC0275o;
        }
        return new ClassV(c0272l, c0282v2, c0282v);
    }

    private Interfaceo m3245a(ClassE c0243e, Interfaceo interfaceC0275o) {
        String str;
        boolean zM1695d = c0243e.m1695d();
        boolean zM1697e = c0243e.m1697e();
        boolean zM1699f = c0243e.m1699f();
        boolean zM1701g = c0243e.m1701g();
        boolean zM1703h = c0243e.m1703h();
        boolean zM1704i = c0243e.m1704i();
        boolean zM1705j = c0243e.m1705j();
        List listM1707l = c0243e.m1707l();
        List listM1708m = c0243e.m1708m();
        List listM1709n = c0243e.m1709n();
        List listM1710o = c0243e.m1710o();
        List listM1711p = c0243e.m1711p();
        List listM1712q = c0243e.m1712q();
        List listM1713r = c0243e.m1713r();
        List listM1714s = c0243e.m1714s();
        StringBuilder sbAppend = new StringBuilder().append("Preparing output ");
        if (zM1695d) {
            str = "apk";
        } else if (zM1697e) {
            str = "jar";
        } else if (zM1699f) {
            str = "aar";
        } else if (zM1701g) {
            str = "war";
        } else if (zM1703h) {
            str = "ear";
        } else if (zM1704i) {
            str = "jmod";
        } else {
            str = zM1705j ? "zip" : "directory";
        }
        ClassL.m3161a(sbAppend.append(str).append(" [").append(c0243e.m1688a()).append("]").append((listM1707l == null && listM1708m == null && listM1709n == null && listM1710o == null && listM1711p == null && listM1712q == null && listM1713r == null && listM1714s == null) ? "" : " (filtered)").toString());
        ClassR c0278r = new ClassR(c0243e.m1690b(), zM1695d || zM1697e || zM1699f || zM1701g || zM1703h || zM1704i || zM1705j);
        boolean z = zM1695d;
        boolean z2 = z || zM1697e;
        boolean z3 = z2 || zM1699f;
        boolean z4 = z3 || zM1701g;
        boolean z5 = z4 || zM1703h;
        ClassB c0262b = new ClassB(this.f1360a, m3244a(m3244a(m3244a(m3244a(m3244a(m3244a(m3244a(c0278r, z5 || zM1704i, zM1705j, ".zip", listM1714s, null, null), z5, zM1704i, ".jmod", listM1713r, a.a, "classes/"), z4, zM1703h, ".ear", listM1712q, null, null), z3, zM1701g, ".war", listM1711p, null, "classes/"), z2, zM1699f, ".aar", listM1710o, null, null), z, zM1697e, ".jar", listM1709n, null, null), false, zM1695d, ".apk", listM1708m, null, null));
        Interfaceo c0282v = listM1707l != null ? new ClassV(new ClassK(new ClassJ(new ClassH()).m3155a(listM1707l)), c0262b) : c0262b;
        ClassS c0279s = new ClassS(this.f1361b, c0282v, c0282v, ".class");
        return interfaceC0275o != null ? new ClassA(c0279s, interfaceC0275o) : c0279s;
    }

    public Interfaceo m3246a(ClassD c0173d, int i, int i2) {
        Interfaceo interfaceC0275oM3245a = null;
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            interfaceC0275oM3245a = m3245a(c0173d.m1292a(i3), interfaceC0275oM3245a);
        }
        return interfaceC0275oM3245a;
    }
}
