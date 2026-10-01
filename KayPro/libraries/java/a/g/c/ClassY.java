package a.g.c;

import a.b.a.a;
import a.b.a.d.i;
import a.b.a.d.m;
import a.b.a.g;
import a.b.a.k;
import a.b.a.l;
import a.b.b.a.f;
import a.b.c;
import a.b.f.w;
import a.b.g.s;
import java.util.Arrays;

public class ClassY extends w implements i, m, f, s {

    private boolean f1115a;

    private void m2806b(c cVar) {
        if (cVar == null || ClassC.m2702b(cVar) == null) {
            return;
        }
        this.f1115a = true;
    }

    public void m2807a(c cVar, a aVar) {
    }

    public void m2808a(c cVar, g gVar) {
        m2806b(cVar);
        m2806b(gVar.e);
    }

    public void m2809a(c cVar, k kVar) {
        int i;
        m2806b(cVar);
        if (this.f1115a) {
            return;
        }
        kVar.a(cVar, this);
        int i2 = kVar.c;
        l[] lVarArr = kVar.d;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            l lVar = lVarArr[i3];
            this.f1115a = false;
            lVar.b(cVar, this);
            lVar.a(cVar, this);
            if (this.f1115a) {
                i = i4;
            } else {
                i = i4 + 1;
                lVarArr[i4] = lVar;
            }
            i3++;
            i4 = i;
        }
        Arrays.fill(lVarArr, i4, i2, (Object) null);
        kVar.c = i4;
        this.f1115a = i4 == 0;
    }

    public void m2810a(c cVar, l lVar) {
        lVar.a(cVar, this);
        lVar.b(cVar, this);
    }

    public void m2811a(c cVar, a.b.b.a aVar) {
        m2806b(aVar.b);
    }

    public void m2812a(a.b.k kVar) {
        int i;
        int i2 = kVar.m;
        a[] aVarArr = kVar.n;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            a aVar = aVarArr[i3];
            this.f1115a = false;
            aVar.a(kVar, this);
            if (this.f1115a) {
                i = i4;
            } else {
                i = i4 + 1;
                aVarArr[i4] = aVar;
            }
            i3++;
            i4 = i;
        }
        Arrays.fill(aVarArr, i4, i2, (Object) null);
        kVar.m = i4;
    }
}
