package a;

import java.io.File;
import java.io.IOException;
import java.util.List;
import a.j.ClassK;

public class ClassE {

    private File f583a;

    private boolean f584b;

    private List f585c;

    private List f586d;

    private List f587e;

    private List f588f;

    private List f589g;

    private List f590h;

    private List f591i;

    private List f592j;

    private String f593k;

    public ClassE(File file, boolean z) {
        this.f583a = file;
        this.f584b = z;
    }

    private boolean m1685a(String str) {
        return m1686a(this.f583a.getPath(), str);
    }

    private static boolean m1686a(String str, String str2) {
        int length = str.length();
        int length2 = str2.length();
        return str.regionMatches(true, length - length2, str2, 0, length2);
    }

    private String m1687t() {
        try {
            return this.f583a.getCanonicalPath();
        } catch (IOException e) {
            return this.f583a.getPath();
        }
    }

    public String m1688a() {
        if (this.f593k == null) {
            this.f593k = m1687t();
        }
        return this.f593k;
    }

    public void m1689a(List list) {
        if (list == null || list.size() == 0) {
            list = null;
        }
        this.f585c = list;
    }

    public File m1690b() {
        return this.f583a;
    }

    public void m1691b(List list) {
        if (list == null || list.size() == 0) {
            list = null;
        }
        this.f586d = list;
    }

    public void m1692c(List list) {
        if (list == null || list.size() == 0) {
            list = null;
        }
        this.f587e = list;
    }

    public boolean m1693c() {
        return this.f584b;
    }

    public void m1694d(List list) {
        if (list == null || list.size() == 0) {
            list = null;
        }
        this.f588f = list;
    }

    public boolean m1695d() {
        return m1685a(".apk") || m1685a(".ap_");
    }

    public void m1696e(List list) {
        if (list == null || list.size() == 0) {
            list = null;
        }
        this.f589g = list;
    }

    public boolean m1697e() {
        return m1685a(".jar");
    }

    public void m1698f(List list) {
        if (list == null || list.size() == 0) {
            list = null;
        }
        this.f590h = list;
    }

    public boolean m1699f() {
        return m1685a(".aar");
    }

    public void m1700g(List list) {
        this.f591i = (list == null || list.size() == 0) ? null : this.f591i;
    }

    public boolean m1701g() {
        return m1685a(".war");
    }

    public void m1702h(List list) {
        if (list == null || list.size() == 0) {
            list = null;
        }
        this.f592j = list;
    }

    public boolean m1703h() {
        return m1685a(".ear");
    }

    public boolean m1704i() {
        return m1685a(".jmod");
    }

    public boolean m1705j() {
        return m1685a(".zip");
    }

    public boolean m1706k() {
        return (this.f585c == null && this.f586d == null && this.f587e == null && this.f588f == null && this.f589g == null && this.f590h == null && this.f591i == null && this.f592j == null) ? false : true;
    }

    public List m1707l() {
        return this.f585c;
    }

    public List m1708m() {
        return this.f586d;
    }

    public List m1709n() {
        return this.f587e;
    }

    public List m1710o() {
        return this.f588f;
    }

    public List m1711p() {
        return this.f589g;
    }

    public List m1712q() {
        return this.f590h;
    }

    public List m1713r() {
        return this.f591i;
    }

    public List m1714s() {
        return this.f592j;
    }

    public String toString() {
        String strM1688a = m1688a();
        if (this.f585c == null && this.f587e == null && this.f588f == null && this.f589g == null && this.f590h == null && this.f591i == null && this.f592j == null) {
            return strM1688a;
        }
        return strM1688a + "(" + (this.f588f != null ? ClassK.m3157a(this.f588f, true) : "") + ";" + (this.f586d != null ? ClassK.m3157a(this.f586d, true) : "") + ";" + (this.f592j != null ? ClassK.m3157a(this.f592j, true) : "") + ";" + (this.f591i != null ? ClassK.m3157a(this.f591i, true) : "") + ";" + (this.f590h != null ? ClassK.m3157a(this.f590h, true) : "") + ";" + (this.f589g != null ? ClassK.m3157a(this.f589g, true) : "") + ";" + (this.f587e != null ? ClassK.m3157a(this.f587e, true) : "") + ";" + (this.f585c != null ? ClassK.m3157a(this.f585c, true) : "") + ")";
    }
}
