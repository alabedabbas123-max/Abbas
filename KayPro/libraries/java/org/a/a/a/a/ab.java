package org.a.a.a.a;

import java.util.Iterator;
import org.a.a.a.Abstractp;
import org.a.a.a.ClassQ;
import org.a.a.a.Interfacec;
import org.a.a.a.b.ClassA;
import org.a.a.a.b.ClassD;

public class ab extends Abstractm {

    public static int f5116m;

    static final boolean f5117n;

    protected final Abstractp f5118f;

    protected int f5119g;

    protected int f5120h;

    protected int f5121i;

    public final ClassA[] f5122j;

    protected int f5123k;

    protected final ac f5124l;

    static {
        f5117n = !ab.class.desiredAssertionStatus();
        f5116m = 0;
    }

    public ab(Abstractp abstractC1790p, ClassA c1685a, ClassA[] c1758aArr, ay c1710ay) {
        super(c1685a, c1710ay);
        this.f5119g = -1;
        this.f5120h = 1;
        this.f5121i = 0;
        this.f5123k = 0;
        this.f5124l = new ac();
        this.f5122j = c1758aArr;
        this.f5118f = abstractC1790p;
    }

    protected int m7248a(ac c1688ac, Interfacec interfaceC1763c, ClassC c1727c, int i) throws Throwable {
        if (c1688ac.f5128d != null) {
            m7262a(interfaceC1763c, c1688ac.f5128d.f5259f, this.f5119g, c1688ac.f5125a, c1688ac.f5126b, c1688ac.f5127c);
            return c1688ac.f5128d.f5258e;
        }
        if (i == -1 && interfaceC1763c.mo7438b() == this.f5119g) {
            return -1;
        }
        throw new ClassQ(this.f5118f, interfaceC1763c, this.f5119g, c1727c);
    }

    protected int m7249a(Interfacec interfaceC1763c) {
        Abstractn abstractC1738n = (Abstractn) this.f5217d.f5113j.get(this.f5123k);
        int i = this.f5123k;
        ClassC c1727cM7253a = m7253a(interfaceC1763c, abstractC1738n);
        boolean z = c1727cM7253a.f5193f;
        c1727cM7253a.f5193f = false;
        ClassD c1761dM7255a = m7255a(c1727cM7253a);
        if (!z) {
            this.f5122j[this.f5123k].f5247b = c1761dM7255a;
        }
        return m7251a(interfaceC1763c, c1761dM7255a);
    }

    public int m7250a(Interfacec interfaceC1763c, int i) {
        f5116m++;
        this.f5123k = i;
        int iD = interfaceC1763c.mo7441d();
        try {
            this.f5119g = interfaceC1763c.mo7438b();
            this.f5124l.m7269a();
            ClassA c1758a = this.f5122j[i];
            return c1758a.f5247b == null ? m7249a(interfaceC1763c) : m7251a(interfaceC1763c, c1758a.f5247b);
        } finally {
            interfaceC1763c.mo7437a(iD);
        }
    }

    protected int m7251a(Interfacec interfaceC1763c, ClassD c1761d) {
        if (c1761d.f5257d) {
            m7260a(this.f5124l, interfaceC1763c, c1761d);
        }
        int iC = interfaceC1763c.mo7442c(1);
        while (true) {
            ClassD c1761dM7256a = m7256a(c1761d, iC);
            if (c1761dM7256a == null) {
                c1761dM7256a = m7258a(interfaceC1763c, c1761d, iC);
            }
            if (c1761dM7256a == f5216c) {
                break;
            }
            if (iC != -1) {
                m7267b(interfaceC1763c);
            }
            if (c1761dM7256a.f5257d) {
                m7260a(this.f5124l, interfaceC1763c, c1761dM7256a);
                if (iC == -1) {
                    break;
                }
            }
            iC = interfaceC1763c.mo7442c(1);
            c1761d = c1761dM7256a;
        }
        return m7248a(this.f5124l, interfaceC1763c, c1761d.f5255b, iC);
    }

    protected aa m7252a(Interfacec interfaceC1763c, aa c1686aa, Abstractbl abstractC1724bl, ClassC c1727c, boolean z, boolean z2) {
        switch (abstractC1724bl.mo7286a()) {
            case 1:
                return new aa(c1686aa, abstractC1724bl.f5187f);
            case 2:
            case 5:
            case 7:
                if (z2 && abstractC1724bl.mo7287a(-1, 0, 1114111)) {
                    return new aa(c1686aa, abstractC1724bl.f5187f);
                }
                return null;
            case 3:
                return new aa(c1686aa, abstractC1724bl.f5187f, bg.m7307b(c1686aa.f5167c, ((bc) abstractC1724bl).f5174c.f5221c));
            case 4:
                aw c1708aw = (aw) abstractC1724bl;
                c1727c.f5193f = true;
                if (m7264a(interfaceC1763c, c1708aw.f5154a, c1708aw.f5155b, z)) {
                    return new aa(c1686aa, abstractC1724bl.f5187f);
                }
                return null;
            case 6:
                if (c1686aa.f5167c != null && !c1686aa.f5167c.m7301c()) {
                    return new aa(c1686aa, abstractC1724bl.f5187f);
                }
                return new aa(c1686aa, abstractC1724bl.f5187f, ae.m7272a(c1686aa.m7246c(), this.f5217d.f5112i[((ClassQ) abstractC1724bl).f5229b]));
            case 8:
            case 9:
            default:
                return null;
            case 10:
                throw new UnsupportedOperationException("Precedence predicates are not supported in lexers.");
        }
    }

    protected ClassC m7253a(Interfacec interfaceC1763c, Abstractn abstractC1738n) {
        ClassY c1749y = Abstractax.f5157d;
        ar c1703ar = new ar();
        for (int i = 0; i < abstractC1738n.m7346a(); i++) {
            m7265a(interfaceC1763c, new aa(abstractC1738n.m7347a(i).f5187f, i + 1, c1749y), (ClassC) c1703ar, false, false, false);
        }
        return c1703ar;
    }

    protected Abstractn m7254a(Abstractbl abstractC1724bl, int i) {
        if (abstractC1724bl.mo7287a(i, 0, 1114111)) {
            return abstractC1724bl.f5187f;
        }
        return null;
    }

    protected ClassD m7255a(ClassC c1727c) {
        if (!f5117n && c1727c.f5193f) {
            throw new AssertionError();
        }
        ClassD c1761d = new ClassD(c1727c);
        ClassB c1712b = null;
        Iterator it = c1727c.iterator();
        while (it.hasNext()) {
            ClassB c1712b2 = (ClassB) it.next();
            if (c1712b2.f5165a instanceof bb) {
                c1712b = c1712b2;
                break;
            }
        }
        if (c1712b != null) {
            c1761d.f5257d = true;
            c1761d.f5259f = ((aa) c1712b).m7246c();
            c1761d.f5258e = this.f5217d.f5111h[c1712b.f5165a.f5222d];
        }
        ClassA c1758a = this.f5122j[this.f5123k];
        synchronized (c1758a.f5246a) {
            ClassD c1761d2 = (ClassD) c1758a.f5246a.get(c1761d);
            if (c1761d2 != null) {
                return c1761d2;
            }
            c1761d.f5254a = c1758a.f5246a.size();
            c1727c.m7309a(true);
            c1761d.f5255b = c1727c;
            c1758a.f5246a.put(c1761d, c1761d);
            return c1761d;
        }
    }

    protected ClassD m7256a(ClassD c1761d, int i) {
        if (c1761d.f5256c == null || i < 0 || i > 127) {
            return null;
        }
        return c1761d.f5256c[i + 0];
    }

    protected ClassD m7257a(ClassD c1761d, int i, ClassC c1727c) {
        boolean z = c1727c.f5193f;
        c1727c.f5193f = false;
        ClassD c1761dM7255a = m7255a(c1727c);
        if (!z) {
            m7261a(c1761d, i, c1761dM7255a);
        }
        return c1761dM7255a;
    }

    protected ClassD m7258a(Interfacec interfaceC1763c, ClassD c1761d, int i) {
        ar c1703ar = new ar();
        m7263a(interfaceC1763c, c1761d.f5255b, c1703ar, i);
        if (!c1703ar.isEmpty()) {
            return m7257a(c1761d, i, c1703ar);
        }
        if (!c1703ar.f5193f) {
            m7261a(c1761d, i, f5216c);
        }
        return f5216c;
    }

    public void m7259a() {
        this.f5124l.m7269a();
        this.f5119g = -1;
        this.f5120h = 1;
        this.f5121i = 0;
        this.f5123k = 0;
    }

    protected void m7260a(ac c1688ac, Interfacec interfaceC1763c, ClassD c1761d) {
        c1688ac.f5125a = interfaceC1763c.mo7438b();
        c1688ac.f5126b = this.f5120h;
        c1688ac.f5127c = this.f5121i;
        c1688ac.f5128d = c1761d;
    }

    protected void m7261a(ClassD c1761d, int i, ClassD c1761d2) {
        if (i < 0 || i > 127) {
            return;
        }
        synchronized (c1761d) {
            if (c1761d.f5256c == null) {
                c1761d.f5256c = new ClassD[128];
            }
            c1761d.f5256c[i + 0] = c1761d2;
        }
    }

    protected void m7262a(Interfacec interfaceC1763c, ae c1690ae, int i, int i2, int i3, int i4) throws Throwable {
        interfaceC1763c.mo7439b(i2);
        this.f5120h = i3;
        this.f5121i = i4;
        if (c1690ae == null || this.f5118f == null) {
            return;
        }
        c1690ae.m7274a(this.f5118f, interfaceC1763c, i);
    }

    protected void m7263a(Interfacec interfaceC1763c, ClassC c1727c, ClassC c1727c2, int i) {
        Iterator it = c1727c.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            ClassB c1712b = (ClassB) it.next();
            boolean z = c1712b.f5166b == i2;
            if (!z || !((aa) c1712b).m7247d()) {
                int iM7346a = c1712b.f5165a.m7346a();
                for (int i3 = 0; i3 < iM7346a; i3++) {
                    Abstractn abstractC1738nM7254a = m7254a(c1712b.f5165a.m7347a(i3), i);
                    if (abstractC1738nM7254a != null) {
                        ae c1690aeM7246c = ((aa) c1712b).m7246c();
                        if (m7265a(interfaceC1763c, new aa((aa) c1712b, abstractC1738nM7254a, c1690aeM7246c != null ? c1690aeM7246c.m7273a(interfaceC1763c.mo7438b() - this.f5119g) : c1690aeM7246c), c1727c2, z, true, i == -1)) {
                            i2 = c1712b.f5166b;
                            break;
                        }
                    }
                }
            }
        }
    }

    protected boolean m7264a(Interfacec interfaceC1763c, int i, int i2, boolean z) {
        if (this.f5118f == null) {
            return true;
        }
        if (!z) {
            return this.f5118f.m7473a(null, i, i2);
        }
        int i3 = this.f5121i;
        int i4 = this.f5120h;
        int iB = interfaceC1763c.mo7438b();
        int iD = interfaceC1763c.mo7441d();
        try {
            m7267b(interfaceC1763c);
            return this.f5118f.m7473a(null, i, i2);
        } finally {
            this.f5121i = i3;
            this.f5120h = i4;
            interfaceC1763c.mo7439b(iB);
            interfaceC1763c.mo7437a(iD);
        }
    }

    protected boolean m7265a(Interfacec interfaceC1763c, aa c1686aa, ClassC c1727c, boolean z, boolean z2, boolean z3) {
        int i = 0;
        if (c1686aa.f5165a instanceof bb) {
            if (c1686aa.f5167c == null || c1686aa.f5167c.m7301c()) {
                if (c1686aa.f5167c == null || c1686aa.f5167c.mo7298a()) {
                    c1727c.add(c1686aa);
                    return true;
                }
                c1727c.add(new aa(c1686aa, c1686aa.f5165a, Abstractax.f5157d));
                z = true;
            }
            if (c1686aa.f5167c == null || c1686aa.f5167c.mo7298a()) {
                return z;
            }
            boolean zM7265a = z;
            for (int i2 = 0; i2 < c1686aa.f5167c.mo7299b(); i2++) {
                if (c1686aa.f5167c.mo7300b(i2) != Integer.MAX_VALUE) {
                    zM7265a = m7265a(interfaceC1763c, new aa(c1686aa, (Abstractn) this.f5217d.f5104a.get(c1686aa.f5167c.mo7300b(i2)), c1686aa.f5167c.mo7297a(i2)), c1727c, zM7265a, z2, z3);
                }
            }
            return zM7265a;
        }
        if (!c1686aa.f5165a.m7352b() && (!z || !c1686aa.m7247d())) {
            c1727c.add(c1686aa);
        }
        Abstractn abstractC1738n = c1686aa.f5165a;
        while (true) {
            int i3 = i;
            if (i3 >= abstractC1738n.m7346a()) {
                return z;
            }
            aa c1686aaM7252a = m7252a(interfaceC1763c, c1686aa, abstractC1738n.m7347a(i3), c1727c, z2, z3);
            if (c1686aaM7252a != null) {
                z = m7265a(interfaceC1763c, c1686aaM7252a, c1727c, z, z2, z3);
            }
            i = i3 + 1;
        }
    }

    public int m7266b() {
        return this.f5120h;
    }

    public void m7267b(Interfacec interfaceC1763c) {
        if (interfaceC1763c.mo7442c(1) == 10) {
            this.f5120h++;
            this.f5121i = 0;
        } else {
            this.f5121i++;
        }
        interfaceC1763c.mo7436a();
    }

    public int m7268c() {
        return this.f5121i;
    }
}
