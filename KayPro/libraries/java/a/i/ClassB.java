package a.i;

import a.b.a.a.a;
import a.b.a.a.b.f;
import a.b.a.a.b.g;
import a.b.a.a.d;
import a.b.a.a.e;
import a.b.a.a.h;
import a.b.a.a.j;
import a.b.a.b;
import a.b.a.d.i;
import a.b.a.k;
import a.b.a.p;
import a.b.a.r;
import a.b.c;
import a.b.c.af;
import a.b.c.av;
import a.b.f.w;
import a.b.g.aq;
import a.b.g.s;
import a.b.o;
import java.util.Arrays;
import a.b.Abstractm;
import a.b.ClassE;
import a.b.Interfacej;
import a.b.c.ClassL;

public class ClassB extends w implements f, g, i, aq, s {

    private final ClassN f1274a;

    private int[] f1275b = new int[256];

    private int[] f1276c = new int[256];

    private final af f1277d = new af();

    private final ClassL f1278e = new ClassL();

    public ClassB(ClassN c0486n) {
        this.f1274a = c0486n;
    }

    private int m2955a(b[] bVarArr, int i) {
        int i2;
        if (this.f1276c.length < i) {
            this.f1276c = new int[i];
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            b bVar = bVarArr[i3];
            if (this.f1274a.mo3074c(bVar)) {
                this.f1276c[i3] = i4;
                i2 = i4 + 1;
                bVarArr[i4] = bVar;
            } else {
                this.f1276c[i3] = -1;
                i2 = i4;
            }
            i3++;
            i4 = i2;
        }
        Arrays.fill(bVarArr, i4, i, (Object) null);
        return i4;
    }

    private int m2956a(a.b.b.b[] bVarArr, int i) {
        int i2;
        if (this.f1275b.length < i) {
            this.f1275b = new int[i];
        }
        int i3 = 1;
        int i4 = 1;
        boolean z = false;
        while (i3 < i) {
            this.f1275b[i3] = i4;
            a.b.b.b bVar = bVarArr[i3];
            boolean zMo3074c = bVar != null ? this.f1274a.mo3074c(bVar) : z;
            if (zMo3074c) {
                this.f1275b[i3] = i4;
                i2 = i4 + 1;
                bVarArr[i4] = bVar;
            } else {
                this.f1275b[i3] = -1;
                i2 = i4;
            }
            i3++;
            i4 = i2;
            z = zMo3074c;
        }
        Arrays.fill(bVarArr, i4, i, (Object) null);
        return i4;
    }

    private int m2957a(o[] oVarArr, int i) {
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            o oVar = oVarArr[i3];
            if (this.f1274a.mo3074c(oVar)) {
                i2 = i4 + 1;
                oVarArr[i4] = oVar;
            } else {
                i2 = i4;
            }
            i3++;
            i4 = i2;
        }
        if (i4 < i) {
            Arrays.fill(oVarArr, i4, i, (Object) null);
        }
        return i4;
    }

    private c[] m2959a(c[] cVarArr) {
        int iM2957a;
        if (cVarArr != null && (iM2957a = m2957a((o[]) cVarArr, cVarArr.length)) != 0) {
            if (iM2957a == cVarArr.length) {
                return cVarArr;
            }
            c[] cVarArr2 = new c[iM2957a];
            System.arraycopy(cVarArr, 0, cVarArr2, 0, iM2957a);
            return cVarArr2;
        }
        return null;
    }

    private boolean[] m2960a(a.b.b.b[] bVarArr, int[] iArr, int i) {
        boolean[] zArr = new boolean[i];
        for (int i2 = 0; i2 < i; i2++) {
            if (!this.f1274a.mo3074c(bVarArr[iArr[i2]])) {
                zArr[i2] = true;
            }
        }
        return zArr;
    }

    public void m2961a(c cVar, a aVar) {
        aVar.b = m2957a((o[]) aVar.c, aVar.b);
        aVar.a(cVar, this);
    }

    public void m2962a(c cVar, a aVar, a.b.a.a.c cVar2) {
        cVar2.a(cVar, this);
    }

    public void m2963a(c cVar, a aVar, e eVar) {
        eVar.a = m2957a((o[]) eVar.b, eVar.a);
        eVar.b(cVar, aVar, this);
    }

    public void m2964a(c cVar, a aVar, h hVar) {
    }

    public void m2965a(c cVar, d dVar) {
        dVar.c = m2957a((o[]) dVar.d, dVar.c);
        dVar.a(cVar, this);
    }

    public void m2966a(c cVar, a.b.a.a aVar) {
    }

    public void m2967a(c cVar, a.b.a.c cVar2) {
        int iM2955a = m2955a(cVar2.d, cVar2.c);
        if (iM2955a < cVar2.c) {
            cVar2.c = iM2955a;
            this.f1278e.m156a(this.f1276c);
            cVar.a(this.f1278e);
        }
    }

    public void m2968a(c cVar, a.b.a.g gVar) {
        if (gVar.f == null || this.f1274a.mo3074c(gVar.f)) {
            return;
        }
        gVar.d = 0;
        gVar.f = null;
    }

    public void m2969a(c cVar, k kVar) {
        kVar.c = m2957a((o[]) kVar.d, kVar.c);
    }

    public void m2970a(c cVar, Interfacej interfaceC0162j, j jVar) {
        for (int i = 0; i < jVar.c; i++) {
            jVar.d[i] = m2957a(jVar.e[i], jVar.d[i]);
        }
        jVar.a(cVar, interfaceC0162j, this);
    }

    public void m2971a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        dVar.i = m2957a((o[]) dVar.j, dVar.i);
        dVar.b(cVar, interfaceC0162j, this);
    }

    public void m2972a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, p pVar) {
        pVar.c = m2957a((o[]) pVar.d, pVar.c);
    }

    public void m2973a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, r rVar) {
        rVar.c = m2957a((o[]) rVar.d, rVar.c);
    }

    public void m2974a(ClassE c0057e) {
        c0057e.f166i = m2959a(c0057e.f166i);
    }

    public void m2975a(a.b.k kVar) {
        if (kVar.g > 0) {
            new av(m2960a(kVar.c, kVar.h, kVar.g)).a(kVar);
        }
        int iM2956a = m2956a(kVar.c, kVar.b);
        int i = kVar.i;
        kVar.i = m2957a(kVar.j, kVar.i);
        if (kVar.i < i) {
            kVar.d |= 262144;
        }
        int i2 = kVar.k;
        kVar.k = m2957a(kVar.l, kVar.k);
        if (kVar.k < i2) {
            kVar.d |= 131072;
        }
        kVar.m = m2957a((o[]) kVar.n, kVar.m);
        kVar.a(this);
        kVar.b(this);
        kVar.a(this);
        if (iM2956a < kVar.b) {
            kVar.b = iM2956a;
            this.f1277d.a(this.f1275b);
            this.f1277d.a(kVar);
        }
        ClassD c0476d = new ClassD(this);
        kVar.a(new a.b.a.d.a(c0476d));
        kVar.b(new a.b.a.d.a(c0476d));
        kVar.a(c0476d);
        kVar.o = m2959a(kVar.o);
    }

    public void m2976a(a.b.k kVar, Abstractm abstractC0164m) {
        abstractC0164m.f433e = m2957a((o[]) abstractC0164m.f434f, abstractC0164m.f433e);
        abstractC0164m.mo1267a(kVar, (i) this);
    }
}
