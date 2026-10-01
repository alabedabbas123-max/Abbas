package a.b.c;

import a.b.a.c.a.a;
import a.b.a.c.a.b;
import a.b.a.c.g;
import a.b.a.c.j;
import a.b.a.d.i;
import a.b.a.d.l;
import a.b.a.d.o;
import a.b.a.d.q;
import a.b.a.d.r;
import a.b.a.h;
import a.b.a.m;
import a.b.a.n;
import a.b.a.p;
import a.b.c;
import a.b.c.ae;
import a.b.c.at;
import a.b.d.a.d;
import a.b.f.w;
import a.b.k;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttLineNumberTable;
import java.lang.reflect.Array;
import java.util.Arrays;
import a.b.Abstractm;
import a.b.Interfacej;
import a.b.d.Abstractc;
import a.b.d.Abstracti;
import a.b.d.ClassA;
import a.b.d.ClassE;
import a.j.ClassB;

public class ClassU extends w implements a, b, i, l, o, q, r, d {

    private final boolean f89a;

    private final boolean f90b;

    private final boolean f91c;

    private int f92d;

    private int f93e;

    private int f94f;

    private int f95g;

    private int f96h;

    private byte[] f97i;

    private int[] f98j;

    private final int[] f99k;

    private final int[] f100l;

    private final int[][] f101m;

    private h[] f102n;

    private m[] f103o;

    private int f104p;

    private final bo f105q;

    private final bv f106r;

    private final at f107s;

    public ClassU() {
        this(false, false, true);
    }

    public ClassU(boolean z, boolean z2, boolean z3) {
        this.f96h = -1;
        this.f97i = new byte[8096];
        this.f98j = new int[8096];
        this.f99k = new int[32];
        this.f100l = new int[32];
        this.f101m = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 32, 8097);
        this.f102n = new h[16];
        this.f103o = new m[1024];
        this.f105q = new bo();
        this.f106r = new bv();
        this.f107s = new at();
        this.f89a = z;
        this.f90b = z2;
        this.f91c = z3;
    }

    private int m225a(int i, int i2) {
        if (i < 0 || i > this.f93e) {
            throw new IllegalArgumentException("Invalid instruction offset [" + i + "] in code with length [" + this.f93e + "]");
        }
        return m230d(this.f98j[i] + i2) - i;
    }

    private int m226a(a.b.a.o[] oVarArr, int i, int i2) {
        int i3;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i) {
            a.b.a.o oVar = oVarArr[i4];
            if (oVar.b <= 0 || oVar.e >= i2) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                oVarArr[i5] = oVar;
            }
            i4++;
            i5 = i3;
        }
        Arrays.fill(oVarArr, i5, i, (Object) null);
        return i5;
    }

    private int m227a(a.b.a.q[] qVarArr, int i, int i2) {
        int i3;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i) {
            a.b.a.q qVar = qVarArr[i4];
            if (qVar.b <= 0 || qVar.e >= i2) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                qVarArr[i5] = qVar;
            }
            i4++;
            i5 = i3;
        }
        Arrays.fill(qVarArr, i5, i, (Object) null);
        return i5;
    }

    private void m228a(int i, int[] iArr) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = m225a(i, iArr[i2]);
        }
    }

    private void m229c(int i) {
        if (this.f97i.length < i) {
            int i2 = (i * 6) / 5;
            this.f97i = ClassB.m3133a(this.f97i, i2);
            this.f98j = ClassB.m3134a(this.f98j, i2);
            this.f107s.b(i2);
        }
    }

    private int m230d(int i) {
        if (i < 0 || i > this.f100l[this.f96h]) {
            throw new IllegalArgumentException("Instruction offset [" + i + "] out of range in code fragment with length [" + this.f100l[this.f96h] + "] at level " + this.f96h);
        }
        int i2 = this.f101m[this.f96h][i];
        if (i2 == -1) {
            throw new IllegalArgumentException("Invalid instruction offset [" + i + "] in code fragment at level " + this.f96h);
        }
        return i2;
    }

    private boolean m231e(int i) {
        int i2;
        return i <= this.f100l[this.f96h] && (i2 = this.f101m[this.f96h][i]) > -1 && i2 < this.f93e;
    }

    public int m232a(int i, m mVar) {
        m252a((c) null, (Interfacej) null, (a.b.a.d) null, mVar);
        this.f103o = (m[]) ClassB.m3144b(this.f103o, this.f95g + 1);
        int i2 = this.f95g;
        this.f95g = i2 + 1;
        while (i2 > i && (this.f103o[i2 - 1].b > mVar.b || (this.f103o[i2 - 1].b >= mVar.b && this.f103o[i2 - 1].c >= 0))) {
            int i3 = i2 - 1;
            this.f103o[i2] = this.f103o[i3];
            i2 = i3;
        }
        this.f103o[i2] = mVar;
        return i2;
    }

    public int m233a(m mVar) {
        return m232a(0, mVar);
    }

    public void m234a() {
        this.f92d = 0;
        this.f93e = 0;
        this.f94f = 0;
        this.f95g = 0;
        this.f96h = -1;
        this.f107s.a(this.f97i.length);
    }

    public void m235a(int i) {
        this.f96h++;
        if (this.f96h >= 32) {
            throw new IllegalArgumentException("Maximum number of code fragment levels exceeded [" + this.f96h + "]");
        }
        this.f92d += i;
        m229c(this.f92d);
        if (this.f101m[this.f96h].length <= i) {
            this.f101m[this.f96h] = new int[i + 1];
        }
        for (int i2 = 0; i2 <= i; i2++) {
            this.f101m[this.f96h][i2] = -1;
        }
        this.f99k[this.f96h] = this.f93e;
        this.f100l[this.f96h] = i;
    }

    public void m236a(int i, Abstractc abstractC0048c) {
        if (this.f91c) {
            abstractC0048c = abstractC0048c.mo323a();
        }
        int iMo322a = this.f93e + abstractC0048c.mo322a(this.f93e);
        m229c(iMo322a);
        this.f98j[this.f93e] = i;
        this.f101m[this.f96h][i] = this.f93e;
        abstractC0048c.mo324a(null, null, new a.b.a.d(0, 0, 0, 0, this.f97i, 0, (h[]) null, 0, (a.b.a.a[]) null), this.f93e, this.f107s);
        this.f93e = iMo322a;
    }

    public void m237a(h hVar) {
        m251a((c) null, (Interfacej) null, (a.b.a.d) null, hVar);
        if (hVar.a == hVar.b) {
            return;
        }
        h[] hVarArr = this.f102n;
        int i = this.f94f;
        this.f94f = i + 1;
        this.f102n = (h[]) ClassB.m3138a(hVarArr, i, hVar);
    }

    public void m238a(c cVar, a.b.a.a aVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void m239a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        if (this.f96h != -1) {
            throw new IllegalArgumentException("Code fragment not ended [" + this.f96h + "]");
        }
        this.f96h++;
        if (dVar.e < this.f93e) {
            dVar.f = new byte[this.f93e];
        }
        dVar.e = this.f93e;
        System.arraycopy(this.f97i, 0, dVar.f, 0, this.f93e);
        if (dVar.h.length < this.f94f) {
            dVar.h = new h[this.f94f];
        }
        dVar.g = this.f94f;
        System.arraycopy(this.f102n, 0, dVar.h, 0, this.f94f);
        this.f105q.m53a(cVar, interfaceC0162j, dVar);
        this.f106r.m97a(cVar, interfaceC0162j, dVar);
        if (this.f95g > 0 && dVar.a(cVar, AttLineNumberTable.ATTRIBUTE_NAME) == null) {
            new ClassJ((k) cVar, (Abstractm) interfaceC0162j, dVar, false).m149a((a.b.a.a) new n(new ae((k) cVar).c(AttLineNumberTable.ATTRIBUTE_NAME), 0, (m[]) null));
        }
        dVar.b(cVar, interfaceC0162j, this);
        this.f107s.a(cVar, interfaceC0162j, dVar);
        this.f96h--;
    }

    public void m240a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, a.b.a.c.c cVar2) {
        m243a(cVar, interfaceC0162j, dVar, i, (a.b.a.c.m) cVar2);
        cVar2.a(cVar, interfaceC0162j, dVar, i, this);
        cVar2.b(cVar, interfaceC0162j, dVar, i, this);
    }

    public void m241a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, g gVar) {
        m243a(cVar, interfaceC0162j, dVar, i, (a.b.a.c.m) gVar);
        gVar.a(cVar, interfaceC0162j, dVar, i, this);
    }

    public void m242a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, j jVar) {
        m243a(cVar, interfaceC0162j, dVar, i, (a.b.a.c.m) jVar);
        jVar.a(cVar, interfaceC0162j, dVar, i, this);
    }

    public void m243a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, a.b.a.c.m mVar) {
        int i2;
        int iM230d = m230d(i);
        if (this.f104p >= 0) {
            i2 = iM230d - this.f104p;
            this.f104p = iM230d + 1;
        } else {
            i2 = iM230d;
        }
        mVar.e = i2;
    }

    public void m244a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, a.b.a.c.q qVar) {
        qVar.a = m230d(qVar.a);
    }

    public void m245a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, a.b.a.c.r rVar) {
    }

    public void m246a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassA c0042a) {
        try {
            c0042a.f133a = m225a(i, c0042a.f133a);
            this.f98j[i] = -1;
        } catch (IllegalArgumentException e) {
            if (this.f96h == 0 || !this.f89a) {
                throw e;
            }
        }
    }

    public void m247a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
    }

    public void m248a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstracti abstractC0054i) {
        try {
            abstractC0054i.f151b = m225a(i, abstractC0054i.f151b);
            m228a(i, abstractC0054i.f152d);
            this.f98j[i] = -1;
        } catch (IllegalArgumentException e) {
            if (this.f96h == 0 || !this.f89a) {
                throw e;
            }
        }
    }

    public void m249a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.c.l lVar) {
        this.f104p = -1;
        lVar.a(cVar, interfaceC0162j, dVar, this);
    }

    public void m250a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.c.n nVar) {
        this.f104p = 0;
        nVar.a(cVar, interfaceC0162j, dVar, this);
    }

    public void m251a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, h hVar) {
        hVar.a = m230d(hVar.a);
        hVar.b = m230d(hVar.b);
        int i = hVar.c;
        hVar.c = (!this.f90b || m231e(i)) ? m230d(i) : -i;
    }

    public void m252a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, m mVar) {
        mVar.b = m230d(mVar.b);
    }

    public void m253a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, n nVar) {
        if (this.f95g == 0) {
            nVar.a(cVar, interfaceC0162j, dVar, this);
            return;
        }
        nVar.d = new m[this.f95g];
        nVar.c = this.f95g;
        System.arraycopy(this.f103o, 0, nVar.d, 0, this.f95g);
    }

    public void m254a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.o oVar) {
        int iM230d = m230d(oVar.a);
        int iM230d2 = m230d(oVar.a + oVar.b);
        oVar.a = iM230d;
        oVar.b = iM230d2 - iM230d;
    }

    public void m255a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, p pVar) {
        pVar.a(cVar, interfaceC0162j, dVar, this);
        pVar.c = m226a(pVar.d, pVar.c, dVar.d);
    }

    public void m256a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.q qVar) {
        int iM230d = m230d(qVar.a);
        int iM230d2 = m230d(qVar.a + qVar.b);
        qVar.a = iM230d;
        qVar.b = iM230d2 - iM230d;
    }

    public void m257a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.r rVar) {
        rVar.a(cVar, interfaceC0162j, dVar, this);
        rVar.c = m227a(rVar.d, rVar.c, dVar.d);
    }

    public void m258a(Abstractc abstractC0048c) {
        if (this.f91c) {
            abstractC0048c = abstractC0048c.mo323a();
        }
        int iMo322a = this.f93e + abstractC0048c.mo322a(this.f93e);
        m229c(iMo322a);
        abstractC0048c.mo324a(null, null, new a.b.a.d(0, 0, 0, 0, this.f97i, 0, (h[]) null, 0, (a.b.a.a[]) null), this.f93e, this.f107s);
        this.f93e = iMo322a;
    }

    public void m259b() {
        if (this.f96h < 0) {
            throw new IllegalArgumentException("Code fragment not begun [" + this.f96h + "]");
        }
        int iMo322a = this.f99k[this.f96h];
        while (iMo322a < this.f93e) {
            Abstractc abstractC0048cM387a = ClassE.m387a(this.f97i, iMo322a);
            if (this.f98j[iMo322a] >= 0) {
                abstractC0048cM387a.mo324a(null, null, null, iMo322a, this);
                abstractC0048cM387a.mo324a(null, null, new a.b.a.d(0, 0, 0, 0, this.f97i, 0, (h[]) null, 0, (a.b.a.a[]) null), iMo322a, this.f107s);
            }
            iMo322a += abstractC0048cM387a.mo322a(iMo322a);
        }
        this.f92d += (this.f93e - this.f99k[this.f96h]) - this.f100l[this.f96h];
        if (this.f90b) {
            for (int i = 0; i < this.f94f; i++) {
                h hVar = this.f102n[i];
                int i2 = -hVar.c;
                if (i2 > 0) {
                    if (m231e(i2)) {
                        hVar.c = m230d(i2);
                    } else if (this.f96h == 0) {
                        throw new IllegalStateException("Couldn't remap exception handler offset [" + i2 + "]");
                    }
                }
            }
        }
        this.f96h--;
    }

    public void m260b(int i) {
        m229c(this.f93e + 1);
        this.f98j[this.f93e] = i;
        this.f101m[this.f96h][i] = this.f93e;
    }
}
