package a.g;

import a.b.a.b;
import a.b.a.d.j;
import a.b.b.a.f;
import a.b.b.q;
import a.b.c;
import a.b.f.w;
import a.b.g.aq;
import a.b.k;
import a.b.ClassE;
import a.b.ClassH;
import a.b.ClassN;
import a.g.b.ad;

public class ClassA extends w implements j, f, aq {

    private long f731a;

    public void m1880a(c cVar, b bVar) {
        int i = 0;
        this.f731a = -1L;
        cVar.a(bVar.a, this);
        int i2 = bVar.b;
        int[] iArr = bVar.c;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 >= 64 || (this.f731a & (1 << i3)) != 0) {
                iArr[i] = iArr[i3];
                i++;
            }
        }
        bVar.b = i;
    }

    public void m1881a(c cVar, a.b.b.j jVar) {
        cVar.a(jVar.b, this);
    }

    public void m1882a(ClassE c0057e, ClassH c0160h) {
    }

    public void m1883a(k kVar, ClassN c0165n) {
        this.f731a = ad.m2295c(c0165n);
    }

    public void m1884b(c cVar, q qVar) {
        qVar.a(this);
    }
}
