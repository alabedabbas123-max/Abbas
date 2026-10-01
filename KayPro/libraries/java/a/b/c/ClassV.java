package a.b.c;

import a.b.a.a.a.a.a;
import a.b.a.a.a.a.b;
import a.b.a.a.a.e;
import a.b.a.a.a.f;
import a.b.a.a.b.h;
import a.b.a.c.g;
import a.b.a.c.j;
import a.b.a.c.m;
import a.b.a.c.n;
import a.b.a.d.i;
import a.b.a.d.l;
import a.b.a.d.o;
import a.b.a.d.q;
import a.b.a.d.r;
import a.b.a.p;
import a.b.c;
import a.b.c.at;
import a.b.d.a.d;
import a.b.f.w;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import a.b.Interfacej;
import a.b.d.Abstractc;
import a.b.d.ClassA;
import a.b.d.ClassB;
import a.b.d.ClassE;
import a.b.d.ClassG;
import a.b.d.ClassH;
import a.b.d.ClassJ;
import a.b.d.ClassK;
import a.j.ClassB;
import a.j.ClassL;

public class ClassV extends w implements a, b, h, a.b.a.c.a.a, a.b.a.c.a.b, i, l, o, q, r, d {

    public Abstractc[] f108a;

    public Abstractc[] f109b;

    public Abstractc[] f110c;

    public Abstractc[] f111d;

    public boolean[] f112e;

    private final boolean f113f;

    private final boolean f114g;

    private int f115h;

    private boolean f116i;

    private boolean f117j;

    private Map f118k;

    private int[] f119l;

    private int f120m;

    private boolean f121n;

    private int f122o;

    private final bo f123p;

    private final bv f124q;

    private final at f125r;

    public ClassV() {
        this(true, true);
    }

    public ClassV(boolean z, boolean z2) {
        this.f118k = new HashMap();
        this.f108a = new Abstractc[8096];
        this.f109b = new Abstractc[8096];
        this.f110c = new Abstractc[8096];
        this.f111d = new Abstractc[8096];
        this.f112e = new boolean[8096];
        this.f119l = new int[8096];
        this.f123p = new bo();
        this.f124q = new bv();
        this.f125r = new at();
        this.f113f = z;
        this.f114g = z2;
    }

    private int m261a(int i, int i2) {
        return m273i(i + i2) - m273i(i);
    }

    private int m262a(int i, int i2, int i3) {
        if (!m274j(i2)) {
            i2 += i;
        }
        return m273i(i2) - i3;
    }

    private int m263a(byte[] bArr, int i) {
        int iMo322a = 0;
        this.f120m = 0;
        this.f121n = false;
        do {
            Abstractc abstractC0048cM387a = ClassE.m387a(bArr, iMo322a);
            m271d(iMo322a, abstractC0048cM387a);
            iMo322a += abstractC0048cM387a.mo322a(iMo322a);
            if (this.f120m > iMo322a) {
                this.f121n = true;
            }
        } while (iMo322a < i);
        this.f119l[iMo322a] = this.f120m;
        return this.f120m;
    }

    private int m264a(a.b.a.h[] hVarArr, int i) {
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            a.b.a.h hVar = hVarArr[i3];
            if (hVar.a < hVar.b) {
                i2 = i4 + 1;
                hVarArr[i4] = hVar;
            } else {
                i2 = i4;
            }
            i3++;
            i4 = i2;
        }
        return i4;
    }

    private void m265a(int i, int[] iArr, int i2) {
        for (int i3 = 0; i3 < iArr.length; i3++) {
            iArr[i3] = m262a(i, iArr[i3], i2);
        }
    }

    private void m266a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, byte[] bArr, int i) {
        int iMo322a = 0;
        this.f120m = 0;
        do {
            Abstractc abstractC0048cM387a = ClassE.m387a(bArr, iMo322a);
            m269b(cVar, interfaceC0162j, dVar, iMo322a, abstractC0048cM387a);
            iMo322a += abstractC0048cM387a.mo322a(iMo322a);
        } while (iMo322a < i);
    }

    private boolean m267a(a.b.a.d dVar) {
        if (!this.f117j) {
            return false;
        }
        byte[] bArr = dVar.f;
        int i = dVar.e;
        for (int i2 = 0; i2 < i; i2++) {
            Abstractc abstractC0048c = this.f110c[i2];
            if (abstractC0048c != null && abstractC0048c.mo322a(i2) != ClassE.m387a(bArr, i2).mo322a(i2)) {
                return false;
            }
        }
        return true;
    }

    private void m268b(a.b.a.d dVar) {
        int i = dVar.e;
        for (int i2 = 0; i2 < i; i2++) {
            Abstractc abstractC0048c = this.f110c[i2];
            if (abstractC0048c != null) {
                abstractC0048c.m382a(dVar, i2);
            }
        }
    }

    private void m269b(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
        Abstractc abstractC0048c2 = this.f108a[i];
        if (abstractC0048c2 != null) {
            abstractC0048c2.mo324a(cVar, interfaceC0162j, dVar, i, this);
        }
        Abstractc abstractC0048c3 = this.f109b[i];
        if (abstractC0048c3 != null) {
            abstractC0048c3.mo324a(cVar, interfaceC0162j, dVar, i, this);
        }
        Abstractc abstractC0048c4 = this.f110c[i];
        if (abstractC0048c4 != null) {
            abstractC0048c4.mo324a(cVar, interfaceC0162j, dVar, i, this);
        } else if (!this.f112e[i]) {
            abstractC0048c.mo324a(cVar, interfaceC0162j, dVar, i, this);
        }
        Abstractc abstractC0048c5 = this.f111d[i];
        if (abstractC0048c5 != null) {
            abstractC0048c5.mo324a(cVar, interfaceC0162j, dVar, i, this);
        }
    }

    private int m270c(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        byte[] bArr = dVar.f;
        int i = dVar.e;
        if (this.f119l.length < i + 1) {
            this.f119l = new int[i + 1];
        }
        int iM263a = m263a(bArr, i);
        if (this.f121n) {
            dVar.f = new byte[iM263a];
        }
        this.f125r.a(iM263a);
        m266a(cVar, interfaceC0162j, dVar, bArr, i);
        return iM263a;
    }

    private void m271d(int i, Abstractc abstractC0048c) {
        Abstractc abstractC0048c2 = this.f108a[i];
        if (abstractC0048c2 != null) {
            this.f120m = abstractC0048c2.mo322a(this.f120m) + this.f120m;
        }
        this.f119l[i] = this.f120m;
        Abstractc abstractC0048c3 = this.f109b[i];
        if (abstractC0048c3 != null) {
            this.f120m = abstractC0048c3.mo322a(this.f120m) + this.f120m;
        }
        Abstractc abstractC0048c4 = this.f110c[i];
        if (abstractC0048c4 != null) {
            this.f120m = abstractC0048c4.mo322a(this.f120m) + this.f120m;
        } else if (!this.f112e[i]) {
            this.f120m += abstractC0048c.mo322a(this.f120m);
        }
        Abstractc abstractC0048c5 = this.f111d[i];
        if (abstractC0048c5 != null) {
            this.f120m = abstractC0048c5.mo322a(this.f120m) + this.f120m;
        }
    }

    private int m273i(int i) {
        if (!m274j(i)) {
            if (i < 0 || i > this.f115h) {
                throw new IllegalArgumentException("Invalid instruction offset [" + i + "] in code with length [" + this.f115h + "]");
            }
            return this.f119l[i];
        }
        int iM275k = m275k(i);
        ClassZ c0040z = (ClassZ) this.f118k.get(Integer.valueOf(iM275k));
        if (c0040z == null) {
            throw new IllegalArgumentException("Reference to unknown label identifier [" + iM275k + "]");
        }
        return c0040z.f132b;
    }

    public static boolean m274j(int i) {
        return ((-16777216) & i) == 536870912;
    }

    private static int m275k(int i) {
        return (-536870913) & i;
    }

    public ClassZ m276a(int i, int i2, int i3, int i4) {
        ClassX c0038x = new ClassX(i, i2, i3, i4);
        this.f118k.put(new Integer(i), c0038x);
        return c0038x;
    }

    public void m277a(int i) {
        this.f118k.clear();
        if (this.f109b.length < i) {
            this.f108a = new Abstractc[i];
            this.f109b = new Abstractc[i];
            this.f110c = new Abstractc[i];
            this.f111d = new Abstractc[i];
            this.f112e = new boolean[i];
        } else {
            Arrays.fill(this.f108a, 0, i, (Object) null);
            Arrays.fill(this.f109b, 0, i, (Object) null);
            Arrays.fill(this.f110c, 0, i, (Object) null);
            Arrays.fill(this.f111d, 0, i, (Object) null);
            Arrays.fill(this.f112e, 0, i, false);
        }
        this.f115h = i;
        this.f116i = false;
        this.f117j = true;
    }

    public void m278a(int i, Abstractc abstractC0048c) {
        if (i < 0 || i >= this.f115h) {
            throw new IllegalArgumentException("Invalid instruction offset [" + i + "] in code with length [" + this.f115h + "]");
        }
        Abstractc[] abstractC0048cArr = this.f109b;
        if (this.f114g) {
            abstractC0048c = abstractC0048c.mo323a();
        }
        abstractC0048cArr[i] = abstractC0048c;
        this.f116i = true;
        this.f117j = false;
    }

    public void m279a(int i, Abstractc[] abstractC0048cArr) {
        if (i < 0 || i >= this.f115h) {
            throw new IllegalArgumentException("Invalid instruction offset [" + i + "] in code with length [" + this.f115h + "]");
        }
        Abstractc c0039y = new ClassY(this, abstractC0048cArr);
        Abstractc[] abstractC0048cArr2 = this.f108a;
        if (this.f114g) {
            c0039y = c0039y.mo323a();
        }
        abstractC0048cArr2[i] = c0039y;
        this.f116i = true;
        this.f117j = false;
    }

    public void m280a(c cVar, a.b.a.a.q qVar) {
        qVar.a(cVar, this);
    }

    public void m281a(c cVar, a.b.a.a.q qVar, a.b.a.a.a.h hVar) {
    }

    public void m282a(c cVar, a.b.a.a.r rVar) {
        rVar.a(cVar, this);
    }

    public void m283a(c cVar, a.b.a.a aVar) {
    }

    public void m284a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        try {
            m313b(cVar, interfaceC0162j, dVar);
        } catch (RuntimeException e) {
            ClassL.m3161a("Unexpected error while editing code:");
            ClassL.m3161a("  Class       = [" + cVar.b() + "]");
            ClassL.m3161a("  Method      = [" + interfaceC0162j.mo946a(cVar) + interfaceC0162j.mo949b(cVar) + "]");
            ClassL.m3161a("  Exception   = [" + e.getClass().getName() + "] (" + e.getMessage() + ")");
            throw e;
        }
    }

    public void m285a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, a.b.a.c.c cVar2) {
        m288a(cVar, interfaceC0162j, dVar, i, (m) cVar2);
        cVar2.a(cVar, interfaceC0162j, dVar, i, this);
        cVar2.b(cVar, interfaceC0162j, dVar, i, this);
    }

    public void m286a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, g gVar) {
        m288a(cVar, interfaceC0162j, dVar, i, (m) gVar);
        gVar.a(cVar, interfaceC0162j, dVar, i, this);
    }

    public void m287a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, j jVar) {
        m288a(cVar, interfaceC0162j, dVar, i, (m) jVar);
        jVar.a(cVar, interfaceC0162j, dVar, i, this);
    }

    public void m288a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, m mVar) {
        int i2;
        int iM273i = m273i(i);
        if (this.f122o >= 0) {
            i2 = iM273i - this.f122o;
            this.f122o = iM273i + 1;
        } else {
            i2 = iM273i;
        }
        mVar.e = i2;
    }

    public void m289a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, a.b.a.c.q qVar) {
        qVar.a = m273i(qVar.a);
    }

    public void m290a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, a.b.a.c.r rVar) {
    }

    public void m291a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassA c0042a) {
        c0042a.f133a = m262a(i, c0042a.f133a, this.f120m);
        this.f125r.a(cVar, interfaceC0162j, dVar, this.f120m, c0042a);
        this.f120m += c0042a.mo322a(this.f120m);
    }

    public void m292a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassB c0047b) {
        this.f125r.a(cVar, interfaceC0162j, dVar, this.f120m, c0047b);
        this.f120m += c0047b.mo322a(this.f120m);
    }

    public void m293a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassG c0052g) {
        c0052g.f151b = m262a(i, c0052g.f151b, this.f120m);
        m265a(i, c0052g.f152d, this.f120m);
        this.f125r.a(cVar, interfaceC0162j, dVar, this.f120m, c0052g);
        this.f120m += c0052g.mo322a(this.f120m);
    }

    public void m294a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassH c0053h) {
        this.f125r.a(cVar, interfaceC0162j, dVar, this.f120m, c0053h);
        this.f120m += c0053h.mo322a(this.f120m);
    }

    public void m295a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassJ c0055j) {
        c0055j.f151b = m262a(i, c0055j.f151b, this.f120m);
        m265a(i, c0055j.f152d, this.f120m);
        this.f125r.a(cVar, interfaceC0162j, dVar, this.f120m, c0055j);
        this.f120m += c0055j.mo322a(this.f120m);
    }

    public void m296a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassK c0056k) {
        this.f125r.a(cVar, interfaceC0162j, dVar, this.f120m, c0056k);
        this.f120m += c0056k.mo322a(this.f120m);
    }

    public void m297a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.a.q qVar, e eVar) {
        eVar.a(cVar, interfaceC0162j, dVar, qVar, this);
    }

    public void m298a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.a.q qVar, e eVar, a.b.a.a.a.d dVar2) {
        dVar2.b = m261a(dVar2.a, dVar2.b);
        dVar2.a = m273i(dVar2.a);
    }

    public void m299a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.a.q qVar, f fVar) {
        fVar.a = m273i(fVar.a);
    }

    public void m300a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.c.l lVar) {
        this.f122o = -1;
        lVar.a(cVar, interfaceC0162j, dVar, this);
    }

    public void m301a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, n nVar) {
        this.f122o = 0;
        nVar.a(cVar, interfaceC0162j, dVar, this);
    }

    public void m302a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.h hVar) {
        hVar.a = m273i(hVar.a);
        hVar.b = m273i(hVar.b);
        hVar.c = m273i(hVar.c);
    }

    public void m303a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.m mVar) {
        mVar.b = m273i(mVar.b);
    }

    public void m304a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.n nVar) {
        nVar.a(cVar, interfaceC0162j, dVar, this);
    }

    public void m305a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.o oVar) {
        oVar.b = m261a(oVar.a, oVar.b);
        oVar.a = m273i(oVar.a);
    }

    public void m306a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, p pVar) {
        pVar.a(cVar, interfaceC0162j, dVar, this);
    }

    public void m307a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.q qVar) {
        qVar.b = m261a(qVar.a, qVar.b);
        qVar.a = m273i(qVar.a);
    }

    public void m308a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.r rVar) {
        rVar.a(cVar, interfaceC0162j, dVar, this);
    }

    public boolean m309a() {
        return this.f116i;
    }

    public void m310b(int i) {
        if (this.f109b.length < i) {
            this.f108a = (Abstractc[]) ClassB.m3144b(this.f108a, i);
            this.f109b = (Abstractc[]) ClassB.m3144b(this.f109b, i);
            this.f110c = (Abstractc[]) ClassB.m3144b(this.f110c, i);
            this.f111d = (Abstractc[]) ClassB.m3144b(this.f111d, i);
            this.f112e = ClassB.m3139a(this.f112e, i);
        } else {
            Arrays.fill(this.f108a, this.f115h, i, (Object) null);
            Arrays.fill(this.f109b, this.f115h, i, (Object) null);
            Arrays.fill(this.f110c, this.f115h, i, (Object) null);
            Arrays.fill(this.f111d, this.f115h, i, (Object) null);
            Arrays.fill(this.f112e, this.f115h, i, false);
        }
        this.f115h = i;
    }

    public void m311b(int i, Abstractc abstractC0048c) {
        if (i < 0 || i >= this.f115h) {
            throw new IllegalArgumentException("Invalid instruction offset [" + i + "] in code with length [" + this.f115h + "]");
        }
        Abstractc[] abstractC0048cArr = this.f110c;
        if (this.f114g) {
            abstractC0048c = abstractC0048c.mo323a();
        }
        abstractC0048cArr[i] = abstractC0048c;
        this.f116i = true;
    }

    public void m312b(int i, Abstractc[] abstractC0048cArr) {
        if (i < 0 || i >= this.f115h) {
            throw new IllegalArgumentException("Invalid instruction offset [" + i + "] in code with length [" + this.f115h + "]");
        }
        Abstractc c0039y = new ClassY(this, abstractC0048cArr);
        Abstractc[] abstractC0048cArr2 = this.f109b;
        if (this.f114g) {
            c0039y = c0039y.mo323a();
        }
        abstractC0048cArr2[i] = c0039y;
        this.f116i = true;
        this.f117j = false;
    }

    public void m313b(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        if (this.f116i) {
            if (m267a(dVar)) {
                m268b(dVar);
            } else {
                dVar.e = m270c(cVar, interfaceC0162j, dVar);
                dVar.a(cVar, interfaceC0162j, this);
                dVar.g = m264a(dVar.h, dVar.g);
                dVar.b(cVar, interfaceC0162j, this);
            }
            this.f125r.a(cVar, interfaceC0162j, dVar);
        }
        if (this.f113f) {
            this.f123p.m53a(cVar, interfaceC0162j, dVar);
            this.f124q.m97a(cVar, interfaceC0162j, dVar);
        }
    }

    public void m314c(int i) {
        if (i < 0 || i >= this.f115h) {
            throw new IllegalArgumentException("Invalid instruction offset [" + i + "] in code with length [" + this.f115h + "]");
        }
        this.f112e[i] = true;
        this.f116i = true;
        this.f117j = false;
    }

    public void m315c(int i, Abstractc abstractC0048c) {
        if (i < 0 || i >= this.f115h) {
            throw new IllegalArgumentException("Invalid instruction offset [" + i + "] in code with length [" + this.f115h + "]");
        }
        Abstractc[] abstractC0048cArr = this.f111d;
        if (this.f114g) {
            abstractC0048c = abstractC0048c.mo323a();
        }
        abstractC0048cArr[i] = abstractC0048c;
        this.f116i = true;
        this.f117j = false;
    }

    public void m316c(int i, Abstractc[] abstractC0048cArr) {
        if (i < 0 || i >= this.f115h) {
            throw new IllegalArgumentException("Invalid instruction offset [" + i + "] in code with length [" + this.f115h + "]");
        }
        Abstractc c0039y = new ClassY(this, abstractC0048cArr);
        Abstractc[] abstractC0048cArr2 = this.f110c;
        if (this.f114g) {
            c0039y = c0039y.mo323a();
        }
        abstractC0048cArr2[i] = c0039y;
        this.f116i = true;
    }

    public void m317d(int i) {
        if (i < 0 || i >= this.f115h) {
            throw new IllegalArgumentException("Invalid instruction offset [" + i + "] in code with length [" + this.f115h + "]");
        }
        this.f112e[i] = false;
    }

    public void m318d(int i, Abstractc[] abstractC0048cArr) {
        if (i < 0 || i >= this.f115h) {
            throw new IllegalArgumentException("Invalid instruction offset [" + i + "] in code with length [" + this.f115h + "]");
        }
        Abstractc c0039y = new ClassY(this, abstractC0048cArr);
        Abstractc[] abstractC0048cArr2 = this.f111d;
        if (this.f114g) {
            c0039y = c0039y.mo323a();
        }
        abstractC0048cArr2[i] = c0039y;
        this.f116i = true;
        this.f117j = false;
    }

    public void m319e(int i) {
        if (i < 0 || i >= this.f115h) {
            throw new IllegalArgumentException("Invalid instruction offset [" + i + "] in code with length [" + this.f115h + "]");
        }
        this.f108a[i] = null;
        this.f109b[i] = null;
        this.f110c[i] = null;
        this.f111d[i] = null;
        this.f112e[i] = false;
    }

    public boolean m320f(int i) {
        return (this.f108a[i] == null && this.f109b[i] == null && this.f110c[i] == null && this.f111d[i] == null && !this.f112e[i]) ? false : true;
    }

    public ClassZ m321g(int i) {
        ClassZ c0040z = new ClassZ(i);
        this.f118k.put(new Integer(i), c0040z);
        return c0040z;
    }
}
