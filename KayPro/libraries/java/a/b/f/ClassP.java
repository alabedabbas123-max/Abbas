package a.b.f;

import a.b.b.a;
import a.b.b.a.f;
import a.b.b.b;
import a.b.b.e;
import a.b.b.h;
import a.b.b.i;
import a.b.b.j;
import a.b.b.k;
import a.b.b.n;
import a.b.b.p;
import a.b.b.q;
import a.b.b.r;
import a.b.b.s;
import a.b.c;
import a.b.d.a.d;
import a.b.f.w;
import com.blankj.utilcode.constant.MemoryConstants;
import java.util.Arrays;
import a.b.Interfacej;
import a.b.d.Abstractc;
import a.b.d.ClassA;
import a.b.d.ClassB;
import a.b.d.ClassG;
import a.b.d.ClassH;
import a.b.d.ClassJ;
import a.b.d.ClassK;

public class ClassP extends w implements f, d {

    protected final b[] f280a;

    protected final Abstractc[] f281b;

    protected b f282c;

    protected boolean f283d;

    private boolean f284e;

    private int f285f;

    private final int[] f286g;

    private int f287h;

    private final int[] f288i = new int[21];

    private final long[] f289j;

    private final int[] f290k;

    private int f291l;

    private int f292m;

    public ClassP(b[] bVarArr, Abstractc[] abstractC0048cArr) {
        this.f280a = bVarArr;
        this.f281b = abstractC0048cArr;
        this.f286g = new int[abstractC0048cArr.length];
        this.f289j = new long[(bVarArr.length + 63) / 64];
        this.f290k = new int[bVarArr.length];
    }

    private void m851a(boolean z, c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
        if (!z) {
            this.f284e = false;
            boolean z2 = this.f285f == 1;
            m858a();
            if (z2) {
                abstractC0048c.mo324a(cVar, interfaceC0162j, dVar, i, this);
                return;
            }
            return;
        }
        this.f286g[this.f285f] = i;
        this.f285f++;
        this.f284e = this.f285f == this.f281b.length;
        if (this.f284e) {
            this.f284e = m888b(cVar, interfaceC0162j, dVar, i, abstractC0048c) & this.f284e;
            m858a();
        }
    }

    private void m852c(int i, int i2) {
        this.f288i[i] = i2;
        this.f287h |= 1 << i;
    }

    private void m853d(int i, int i2) {
        this.f290k[i] = i2;
        long[] jArr = this.f289j;
        int i3 = i / 64;
        jArr[i3] = jArr[i3] | (1 << i);
    }

    private boolean m854e(int i) {
        return (this.f287h & (1 << i)) != 0;
    }

    private boolean m855f(int i) {
        return (this.f289j[i / 64] & (1 << i)) != 0;
    }

    public int m856a(int i) {
        return this.f286g[i];
    }

    public int m857a(int i, int i2) {
        int i3 = i2 - MemoryConstants.f4579GB;
        return i3 < 0 ? i2 : this.f288i[i3] - i;
    }

    public void m858a() {
        this.f285f = 0;
        this.f287h = 0;
        Arrays.fill(this.f289j, 0L);
        this.f292m = this.f291l;
        this.f291l = 0;
    }

    public void m859a(c cVar, a aVar) {
        this.f283d = m879a(cVar, aVar.a, this.f282c.a);
    }

    public void m860a(c cVar, a.b.b.c cVar2) {
        this.f283d = cVar2.b() == this.f282c.b();
    }

    public void m861a(c cVar, e eVar) {
        this.f283d = eVar.b() == this.f282c.b();
    }

    public void m862a(c cVar, a.b.b.f fVar) {
        this.f283d = fVar.b() == this.f282c.b();
    }

    public void m863a(c cVar, h hVar) {
        h hVar2 = this.f282c;
        this.f283d = m879a(cVar, hVar.b(), hVar2.b()) && m879a(cVar, hVar.c(), hVar2.c());
    }

    public void m864a(c cVar, i iVar) {
        this.f283d = iVar.b() == this.f282c.b();
    }

    public void m865a(c cVar, j jVar) {
        j jVar2 = this.f282c;
        this.f283d = m887b(jVar.b(), jVar2.b()) && m879a(cVar, jVar.c(), jVar2.c());
    }

    public void m866a(c cVar, k kVar) {
        this.f283d = m879a(cVar, kVar.a, this.f282c.a);
    }

    public void m867a(c cVar, n nVar) {
        n nVar2 = this.f282c;
        this.f283d = m879a(cVar, nVar.a, nVar2.a) && m879a(cVar, nVar.b, nVar2.b);
    }

    public void m868a(c cVar, p pVar) {
        throw new UnsupportedOperationException();
    }

    public void m869a(c cVar, r rVar) {
        this.f283d = m879a(cVar, rVar.a, this.f282c.a);
    }

    public void m870a(c cVar, s sVar) {
        this.f283d = sVar.c().equals(this.f282c.c());
    }

    public void m871a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassA c0042a) {
        Abstractc abstractC0048c = this.f281b[this.f285f];
        m851a(m880a(c0042a, abstractC0048c) && m877a(i, c0042a.f133a, ((ClassA) abstractC0048c).f133a), cVar, interfaceC0162j, dVar, i, c0042a);
    }

    public void m872a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassB c0047b) {
        Abstractc abstractC0048c = this.f281b[this.f285f];
        m851a(m880a(c0047b, abstractC0048c) && m879a(cVar, c0047b.f139a, ((ClassB) abstractC0048c).f139a) && m887b(c0047b.f140b, ((ClassB) abstractC0048c).f140b), cVar, interfaceC0162j, dVar, i, c0047b);
    }

    public void m873a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassG c0052g) {
        Abstractc abstractC0048c = this.f281b[this.f285f];
        m851a(m880a(c0052g, abstractC0048c) && m877a(i, c0052g.f151b, ((ClassG) abstractC0048c).f151b) && m881a(c0052g.f149a, ((ClassG) abstractC0048c).f149a) && m878a(i, c0052g.f152d, ((ClassG) abstractC0048c).f152d), cVar, interfaceC0162j, dVar, i, c0052g);
    }

    public void m874a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassH c0053h) {
        Abstractc abstractC0048c = this.f281b[this.f285f];
        m851a(m880a(c0053h, abstractC0048c) && m887b(c0053h.f150a, ((ClassH) abstractC0048c).f150a), cVar, interfaceC0162j, dVar, i, c0053h);
    }

    public void m875a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassJ c0055j) {
        Abstractc abstractC0048c = this.f281b[this.f285f];
        m851a(m880a(c0055j, abstractC0048c) && m877a(i, c0055j.f151b, ((ClassJ) abstractC0048c).f151b) && m887b(c0055j.f153a, ((ClassJ) abstractC0048c).f153a) && m887b(c0055j.f154e, ((ClassJ) abstractC0048c).f154e) && m878a(i, c0055j.f152d, ((ClassJ) abstractC0048c).f152d), cVar, interfaceC0162j, dVar, i, c0055j);
    }

    public void m876a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassK c0056k) {
        Abstractc abstractC0048c = this.f281b[this.f285f];
        m851a(m880a(c0056k, abstractC0048c) && m887b(c0056k.f156b, ((ClassK) abstractC0048c).f156b) && m887b(c0056k.f157d, ((ClassK) abstractC0048c).f157d), cVar, interfaceC0162j, dVar, i, c0056k);
    }

    protected boolean m877a(int i, int i2, int i3) {
        int i4 = i3 - MemoryConstants.f4579GB;
        if (i4 < 0) {
            return i2 == i3;
        }
        if (m854e(i4)) {
            return this.f288i[i4] == i + i2;
        }
        m852c(i4, i + i2);
        return true;
    }

    protected boolean m878a(int i, int[] iArr, int[] iArr2) {
        if (iArr.length != iArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (!m877a(i, iArr[i2], iArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    protected boolean m879a(c cVar, int i, int i2) {
        if (i2 >= 1073741824) {
            this.f291l = (1 << (i2 - MemoryConstants.f4579GB)) | this.f291l;
            return m887b(i, i2);
        }
        if (m855f(i2)) {
            return this.f290k[i2] == i;
        }
        this.f283d = false;
        this.f282c = this.f280a[i2];
        if (cVar.b(i) == this.f282c.a()) {
            cVar.a(i, this);
            if (this.f283d) {
                m853d(i2, i);
            }
        }
        return this.f283d;
    }

    protected boolean m880a(Abstractc abstractC0048c, Abstractc abstractC0048c2) {
        return abstractC0048c.f147c == abstractC0048c2.f147c || abstractC0048c.mo332b() == abstractC0048c2.f147c;
    }

    protected boolean m881a(int[] iArr, int[] iArr2) {
        if (iArr.length != iArr2.length) {
            return false;
        }
        for (int i = 0; i < iArr.length; i++) {
            if (!m887b(iArr[i], iArr2[i])) {
                return false;
            }
        }
        return true;
    }

    public int[] m882a(int i, int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr2[i2] = m857a(i, iArr[i2]);
        }
        return iArr2;
    }

    public int[] m883a(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = m890c(iArr[i]);
        }
        return iArr2;
    }

    public void m884b(c cVar, q qVar) {
        q qVar2 = this.f282c;
        this.f283d = m879a(cVar, qVar.b(), qVar2.b()) && m879a(cVar, qVar.c(), qVar2.c());
    }

    public boolean m885b() {
        return this.f284e;
    }

    public boolean m886b(int i) {
        return (this.f292m & (1 << (i - MemoryConstants.f4579GB))) != 0;
    }

    protected boolean m887b(int i, int i2) {
        int i3 = i2 - MemoryConstants.f4579GB;
        if (i3 < 0) {
            return i == i2;
        }
        if (m854e(i3)) {
            return this.f288i[i3] == i;
        }
        m852c(i3, i);
        return true;
    }

    protected boolean m888b(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
        return true;
    }

    public int m889c() {
        return this.f281b.length;
    }

    public int m890c(int i) {
        int i2 = i - MemoryConstants.f4579GB;
        return i2 < 0 ? i : this.f288i[i2];
    }

    public int m891d(int i) {
        int i2 = i - MemoryConstants.f4579GB;
        return i2 < 0 ? this.f290k[i] : this.f288i[i2];
    }
}
