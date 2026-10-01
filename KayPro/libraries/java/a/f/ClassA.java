package a.f;

import a.b.a.a;
import a.b.a.d;
import a.b.a.d.i;
import a.b.c;
import a.b.f.w;
import a.b.g.aq;
import a.b.g.s;
import a.b.k;
import a.b.o;
import java.util.Arrays;
import a.b.Abstractm;
import a.b.ClassE;
import a.b.Interfacej;

public class ClassA extends w implements i, aq, s {
    private static int m1768a(o[] oVarArr, int i) {
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (ClassB.m1785a(oVarArr[i3])) {
                i2 = i4 + 1;
                oVarArr[i4] = oVarArr[i3];
            } else {
                i2 = i4;
            }
            i3++;
            i4 = i2;
        }
        Arrays.fill(oVarArr, i4, i, (Object) null);
        return i4;
    }

    public void m1769a(c cVar, a aVar) {
    }

    public void m1770a(c cVar, Interfacej interfaceC0162j, d dVar) {
        dVar.i = m1768a((o[]) dVar.j, dVar.i);
    }

    public void m1771a(ClassE c0057e) {
    }

    public void m1772a(k kVar) {
        kVar.m = m1768a((o[]) kVar.n, kVar.m);
        kVar.a(this);
        kVar.b(this);
        kVar.a(this);
    }

    public void m1773a(k kVar, Abstractm abstractC0164m) {
        abstractC0164m.f433e = m1768a((o[]) abstractC0164m.f434f, abstractC0164m.f433e);
        abstractC0164m.mo1267a(kVar, (i) this);
    }
}
