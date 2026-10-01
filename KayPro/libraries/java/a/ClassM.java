package a;

import java.util.List;
import a.e.ag;
import a.e.ClassK;
import a.e.ClassU;
import a.e.ClassX;
import a.e.Interfacem;
import a.j.ClassG;
import a.j.ClassH;
import a.j.ClassJ;
import a.j.ClassL;

public class ClassM {
    private static Interfacem m3242a(Interfacem interfaceC0273m, boolean z, boolean z2, boolean z3, List list, String str) {
        if (z) {
            interfaceC0273m = new ClassU(new ClassK(new ClassG(".class")), new ag("classes/", interfaceC0273m), interfaceC0273m);
        }
        ClassX c0284x = new ClassX(interfaceC0273m, z2);
        if (z3) {
            return c0284x;
        }
        return new ClassU(new ClassK(new ClassG(str)), list != null ? new ClassU(new ClassK(new ClassJ(new ClassH()).m3155a(list)), c0284x) : c0284x, interfaceC0273m);
    }

    public static Interfacem m3243a(String str, ClassE c0243e, Interfacem interfaceC0273m) {
        String str2;
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
        StringBuilder sbAppend = new StringBuilder().append(str);
        if (zM1695d) {
            str2 = "apk";
        } else if (zM1697e) {
            str2 = "jar";
        } else if (zM1699f) {
            str2 = "aar";
        } else if (zM1701g) {
            str2 = "war";
        } else if (zM1703h) {
            str2 = "ear";
        } else if (zM1704i) {
            str2 = "jmod";
        } else {
            str2 = zM1705j ? "zip" : "directory";
        }
        ClassL.m3161a(sbAppend.append(str2).append(" [").append(c0243e.m1688a()).append("]").append((listM1707l == null && listM1708m == null && listM1709n == null && listM1710o == null && listM1711p == null && listM1712q == null && listM1713r == null && listM1714s == null) ? "" : " (filtered)").toString());
        Interfacem interfaceC0273mM3242a = m3242a(listM1707l != null ? new ClassU(new ClassK(new ClassJ(new ClassH()).m3155a(listM1707l)), interfaceC0273m) : interfaceC0273m, false, false, zM1695d, listM1708m, ".apk");
        if (zM1695d) {
            return interfaceC0273mM3242a;
        }
        Interfacem interfaceC0273mM3242a2 = m3242a(interfaceC0273mM3242a, false, false, zM1697e, listM1709n, ".jar");
        if (zM1697e) {
            return interfaceC0273mM3242a2;
        }
        Interfacem interfaceC0273mM3242a3 = m3242a(interfaceC0273mM3242a2, false, false, zM1699f, listM1710o, ".aar");
        if (zM1699f) {
            return interfaceC0273mM3242a3;
        }
        Interfacem interfaceC0273mM3242a4 = m3242a(interfaceC0273mM3242a3, true, false, zM1701g, listM1711p, ".war");
        if (zM1701g) {
            return interfaceC0273mM3242a4;
        }
        Interfacem interfaceC0273mM3242a5 = m3242a(interfaceC0273mM3242a4, false, false, zM1703h, listM1712q, ".ear");
        if (zM1703h) {
            return interfaceC0273mM3242a5;
        }
        Interfacem interfaceC0273mM3242a6 = m3242a(interfaceC0273mM3242a5, true, true, zM1704i, listM1713r, ".jmod");
        return !zM1704i ? m3242a(interfaceC0273mM3242a6, false, false, zM1705j, listM1714s, ".zip") : interfaceC0273mM3242a6;
    }
}
