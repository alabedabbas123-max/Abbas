package a.f;

import a.b.a.a;
import a.b.a.d.i;
import a.b.a.d.m;
import a.b.a.g;
import a.b.a.k;
import a.b.a.l;
import a.b.b;
import a.b.b.a.f;
import a.b.c;
import a.b.f.w;
import a.b.g.s;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import a.b.ClassE;
import a.b.f.ClassI;
import a.j.Abstractt;
import a.j.ClassH;
import a.j.ClassJ;

public class ClassC extends w implements i, m, f, s {

    private final ClassG f688a;

    private final ClassG f689b;

    private final boolean f690c;

    private final Abstractt f691d;

    private final String f692e;

    private final String f693f;

    private final boolean f694g;

    private final Set f695h = new HashSet();

    private final Map f696i = new HashMap();

    private final Map f697j = new HashMap();

    private final Map f698k = new HashMap();

    private final Map f699l = new HashMap();

    private String f700m;

    private boolean f701n;

    public ClassC(b bVar, b bVar2, ClassG c0297g, ClassG c0297g2, boolean z, List list, String str, String str2, boolean z2) {
        C0294d c0294d = null;
        this.f688a = c0297g;
        this.f689b = c0297g2;
        if (str != null && str.length() > 0) {
            str = str + '/';
        }
        if (str2 != null && str2.length() > 0) {
            str2 = str2 + '/';
        }
        this.f690c = z;
        this.f691d = list == null ? null : new ClassJ(new ClassH()).m3155a(list);
        this.f692e = str;
        this.f693f = str2;
        this.f694g = z2;
        this.f696i.put("", "");
        bVar.a(new ClassE(this));
        bVar2.a(new ClassE(this));
    }

    private String m1789a(String str) {
        String strM1796b = (String) this.f696i.get(str);
        if (strM1796b == null) {
            if (this.f691d != null) {
                if (this.f691d.mo3151a(str.length() > 0 ? str.substring(0, str.length() - 1) : str)) {
                    return str;
                }
            }
            if (this.f693f != null) {
                return this.f693f;
            }
            strM1796b = m1796b(this.f692e != null ? this.f692e : m1789a(ClassI.m744C(str)));
            this.f696i.put(str, strM1796b);
        }
        return strM1796b;
    }

    private String m1790a(String str, Interfacet interfaceC0310t) {
        String str2;
        do {
            str2 = str + interfaceC0310t.mo1778b() + '/';
        } while (this.f696i.containsValue(str2));
        return str2;
    }

    static void m1792a(c cVar, String str) {
        cVar.a(str);
    }

    private boolean m1793a(String str, String str2) {
        int length = str2.length() + 1;
        int length2 = str.length();
        if (length >= length2) {
            return false;
        }
        while (length < length2) {
            if (!Character.isDigit(str.charAt(length))) {
                return false;
            }
            length++;
        }
        return true;
    }

    static String m1794b(c cVar) {
        Object objF = cVar.f();
        if (objF instanceof String) {
            return (String) objF;
        }
        return null;
    }

    private String m1796b(String str) {
        Interfacet c0297g = (Interfacet) this.f697j.get(str);
        if (c0297g == null) {
            aa c0288aa = new aa(this.f690c);
            c0297g = this.f689b != null ? new ClassG(this.f689b, c0288aa) : c0288aa;
            this.f697j.put(str, c0297g);
        }
        return m1790a(str, c0297g);
    }

    private String m1797b(String str, Interfacet interfaceC0310t) {
        String str2;
        String strM1802e;
        do {
            str2 = str + interfaceC0310t.mo1778b();
            strM1802e = m1802e(str2);
        } while (this.f695h.contains(strM1802e));
        if (this.f688a != null && !this.f690c) {
            this.f695h.add(strM1802e);
        }
        return str2;
    }

    private String m1798c(String str) {
        Interfacet c0297g = (Interfacet) this.f698k.get(str);
        if (c0297g == null) {
            aa c0288aa = new aa(this.f690c);
            c0297g = this.f688a != null ? new ClassG(this.f688a, c0288aa) : c0288aa;
            this.f698k.put(str, c0297g);
        }
        return m1797b(str, c0297g);
    }

    private String m1801d(String str) {
        Interfacet c0312v = (Interfacet) this.f699l.get(str);
        if (c0312v == null) {
            c0312v = new ClassV();
            this.f699l.put(str, c0312v);
        }
        return m1797b(str, c0312v);
    }

    public String m1802e(String str) {
        return this.f690c ? str : str.toLowerCase();
    }

    public void m1804a(c cVar, a aVar) {
    }

    public void m1805a(c cVar, g gVar) {
        gVar.a(this);
        this.f701n = m1793a(cVar.b(), cVar.e(gVar.c));
    }

    public void m1806a(c cVar, k kVar) {
        kVar.a(cVar, this);
    }

    public void m1807a(c cVar, l lVar) {
        int i = lVar.a;
        int i2 = lVar.b;
        if (i == 0 || i2 == 0) {
            return;
        }
        String strE = cVar.e(i);
        if (strE.equals(cVar.b())) {
            cVar.a(i2, this);
            this.f701n = m1793a(strE, cVar.e(i2));
        }
    }

    public void m1808a(c cVar, a.b.b.a aVar) {
        aVar.a(this);
    }

    public void m1809a(ClassE c0057e) {
        this.f700m = c0057e.m415b();
    }

    public void m1810a(a.b.k kVar) {
        this.f700m = m1794b((c) kVar);
        if (this.f700m == null) {
            kVar.a(this);
            String strM1789a = this.f700m != null ? this.f700m + '$' : m1789a(ClassI.m744C(kVar.b()));
            this.f700m = (this.f700m == null || !this.f701n) ? m1798c(strM1789a) : m1801d(strM1789a);
            m1792a((c) kVar, this.f700m);
        }
    }
}
