package org.c.a.a.c.c.a.b;

import com.almlkaide.kaypro.android.dex.DexFormat;
import java.util.HashMap;
import java.util.List;
import org.c.a.a.a.a.Interfacea;
import org.c.a.a.b.c.ClassH;
import org.c.a.a.b.d.Abstracta;
import org.c.a.a.b.d.e.ClassC;
import org.c.a.a.b.d.e.ClassG;
import org.c.a.a.b.d.e.ClassH;
import org.c.a.a.b.d.e.ClassI;
import org.c.a.a.b.d.e.ClassK;
import org.c.a.a.b.d.e.ClassP;
import org.c.a.a.b.d.e.ClassQ;
import org.c.a.a.b.d.e.ClassR;
import org.c.a.a.b.d.e.ClassS;
import org.c.a.a.b.d.e.ClassV;
import org.c.a.a.b.d.e.ClassW;
import org.c.a.a.b.d.e.ClassX;
import org.c.a.a.b.d.e.ClassY;
import org.c.a.a.b.d.e.Interfacee;
import org.c.a.a.b.d.e.Interfacet;
import org.c.a.a.b.f.ClassG;
import org.c.a.a.b.f.ClassK;
import org.c.a.a.b.f.ClassO;
import org.c.a.a.c.a.a.c.aa;

public class ClassJ extends Abstracta {

    public static final ClassG f6327ab = new ClassG("boolean");

    public static final ClassG f6328ac = new ClassG("byte");

    public static final ClassG f6329ad = new ClassG("char");

    public static final ClassG f6330ae = new ClassG("double");

    public static final ClassG f6331af = new ClassG("exports");

    public static final ClassG f6332ag = new ClassG("extends");

    public static final ClassG f6333ah = new ClassG("float");

    public static final ClassG f6334ai = new ClassG("int");

    public static final ClassG f6335aj = new ClassG("long");

    public static final ClassG f6336ak = new ClassG("module");

    public static final ClassG f6337al = new ClassG("open");

    public static final ClassG f6338am = new ClassG("opens");

    public static final ClassG f6339an = new ClassG("provides");

    public static final ClassG f6340ao = new ClassG("requires");

    public static final ClassG f6341ap = new ClassG("short");

    public static final ClassG f6342aq = new ClassG("super");

    public static final ClassG f6343ar = new ClassG("to");

    public static final ClassG f6344as = new ClassG("transitive");

    public static final ClassG f6345at = new ClassG("uses");

    public static final ClassG f6346au = new ClassG("void");

    public static final ClassG f6347av = new ClassG("with");

    protected ClassK f6348aA;

    protected String f6350aC;

    protected Interfacea f6352aw;

    protected String f6353ax;

    protected int f6354ay;

    protected ClassH f6355az;

    protected int f6349aB = 0;

    protected HashMap f6351aD = new HashMap();

    public ClassJ(Interfacea interfaceC1817a, String str, int i, ClassH c1895h) {
        this.f6352aw = interfaceC1817a;
        this.f6354ay = i;
        this.f6355az = c1895h;
        int iLastIndexOf = str.lastIndexOf(47);
        this.f6353ax = iLastIndexOf == -1 ? "" : str.substring(0, iLastIndexOf + 1);
    }

    protected static boolean m8786a(String str, String str2) {
        return str2.startsWith(str) && str2.indexOf(47, str.length()) == -1;
    }

    protected ClassK m8787a(ClassI c2049i, String str) {
        String strM8150g = c2049i.m8150g();
        String strM8151i = c2049i.m8151i();
        String strM8152j = c2049i.m8152j();
        if (m8786a(this.f6353ax, strM8150g)) {
            return new ClassK(1, strM8150g, strM8152j, null, str);
        }
        if (m8786a("java/lang/", strM8150g)) {
            return this.f6352aw.mo7045a(new StringBuilder(String.valueOf(this.f6353ax)).append(strM8152j).toString()) ? new ClassK(1, strM8150g, strM8151i, null, str) : new ClassK(1, strM8150g, strM8152j, null, str);
        }
        return new ClassL(this.f6355az, strM8150g, strM8151i, strM8152j, str);
    }

    protected void m8788a(List list, ClassO c2081o) {
        int size = list.size();
        if (size > 0) {
            ((Interfacet) list.get(0)).mo8142a(this);
            for (int i = 1; i < size; i++) {
                this.f6348aA.add(c2081o);
                ((Interfacet) list.get(i)).mo8142a(this);
            }
        }
    }

    @Override
    public void mo8128a(ClassC c2043c) {
        m8788a(c2043c, ClassO.f5934e);
    }

    protected void m8789a(Interfacee interfaceC2045e) {
        if (interfaceC2045e != null) {
            this.f6348aA.add(ClassO.f5944o);
            interfaceC2045e.mo8142a(this);
            this.f6348aA.add(ClassO.f5945p);
        }
    }

    @Override
    public void mo8129a(ClassG c2047g) {
        this.f6348aA.add(m8791c(c2047g.m8144b()));
        m8790b(c2047g.mo8145d());
    }

    @Override
    public void mo8130a(ClassH c2048h) {
        if (this.f6350aC == null || (!this.f6350aC.equals(c2048h.m8150g()) && !this.f6350aC.equals(c2048h.m8149b().m8150g()))) {
            c2048h.m8149b().mo8142a(this);
            this.f6348aA.add(ClassO.f5936g);
        }
        this.f6348aA.add(new ClassK(1, c2048h.m8150g(), c2048h.m8152j(), null, this.f6350aC));
        m8789a(c2048h.m8153k());
        m8790b(c2048h.mo8145d());
    }

    @Override
    public void mo8131a(ClassI c2049i) {
        this.f6348aA.add(m8787a(c2049i, this.f6350aC));
        Interfacee interfaceC2045eM8153k = c2049i.m8153k();
        if (this.f6354ay >= 49) {
            if (interfaceC2045eM8153k != null) {
                m8789a(interfaceC2045eM8153k);
            } else if (c2049i.equals(ClassI.f5833f)) {
                this.f6348aA.add(ClassO.f5944o);
                this.f6348aA.add(ClassO.f5946q);
                this.f6348aA.add(ClassO.f5945p);
            }
        }
        m8790b(c2049i.mo8145d());
    }

    @Override
    public void mo8132a(ClassK c2051k) {
        switch (aa.m8407b(c2051k.m8157g())) {
            case 1:
                this.f6348aA.add(f6327ab);
                break;
            case 2:
                this.f6348aA.add(f6329ad);
                break;
            case 4:
                this.f6348aA.add(f6333ah);
                break;
            case 8:
                this.f6348aA.add(f6330ae);
                break;
            case 16:
                this.f6348aA.add(f6328ac);
                break;
            case 32:
                this.f6348aA.add(f6341ap);
                break;
            case 64:
                this.f6348aA.add(f6334ai);
                break;
            case 128:
                this.f6348aA.add(f6335aj);
                break;
            case 256:
                this.f6348aA.add(f6346au);
                break;
        }
        m8790b(c2051k.mo8145d());
    }

    @Override
    public void mo8133a(ClassP c2056p) {
        m8788a(c2056p, ClassO.f5949t);
    }

    @Override
    public void mo8134a(ClassQ c2057q) {
        this.f6348aA.add(m8791c(c2057q.m8163d()));
    }

    @Override
    public void mo8135a(ClassR c2058r) {
        this.f6348aA.add(m8791c(c2058r.m8163d()));
        this.f6348aA.add(ClassO.f5948s);
        this.f6348aA.add(f6332ag);
        this.f6348aA.add(ClassO.f5948s);
        c2058r.m8164e().mo8142a(this);
    }

    @Override
    public void mo8136a(ClassS c2059s) {
        m8788a(c2059s, ClassO.f5934e);
    }

    @Override
    public void mo8137a(ClassV c2062v) {
        m8788a(c2062v, ClassO.f5934e);
    }

    @Override
    public void mo8138a(ClassW c2063w) {
        this.f6348aA.add(ClassO.f5946q);
    }

    @Override
    public void mo8139a(ClassX c2064x) {
        this.f6348aA.add(ClassO.f5947r);
        this.f6348aA.add(f6332ag);
        this.f6348aA.add(ClassO.f5948s);
        c2064x.m8165a().mo8142a(this);
    }

    @Override
    public void mo8140a(ClassY c2065y) {
        this.f6348aA.add(ClassO.f5947r);
        this.f6348aA.add(f6342aq);
        this.f6348aA.add(ClassO.f5948s);
        c2065y.m8166a().mo8142a(this);
    }

    protected void m8790b(int i) {
        switch (i) {
            case 0:
                break;
            case 1:
                this.f6348aA.add(ClassO.f5937h);
                break;
            case 2:
                this.f6348aA.add(ClassO.f5938i);
                break;
            default:
                this.f6348aA.add(m8791c(new String(new char[i]).replaceAll(DexFormat.MAGIC_SUFFIX, "[]")));
                break;
        }
    }

    protected ClassO m8791c(String str) {
        ClassO c2081o = (ClassO) this.f6351aD.get(str);
        if (c2081o != null) {
            return c2081o;
        }
        HashMap map = this.f6351aD;
        ClassO c2081o2 = new ClassO(str);
        map.put(str, c2081o2);
        return c2081o2;
    }
}
