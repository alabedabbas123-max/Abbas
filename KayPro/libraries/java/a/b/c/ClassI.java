package a.b.c;

import a.b.a.a;
import a.b.a.d;
import a.b.a.d.i;
import a.b.c;
import a.b.f.w;
import a.b.g.aq;
import a.b.g.s;
import a.b.k;
import java.util.Arrays;
import java.util.Comparator;
import a.b.Abstractm;
import a.b.Interfacej;

public class ClassI extends w implements i, aq, s, Comparator {
    public void m139a(c cVar, a aVar) {
    }

    public void m140a(c cVar, Interfacej interfaceC0162j, d dVar) {
        Arrays.sort(dVar.j, 0, dVar.i, this);
    }

    public void m141a(k kVar) {
        Arrays.sort(kVar.n, 0, kVar.m, this);
        kVar.a(this);
        kVar.b(this);
    }

    public void m142a(k kVar, Abstractm abstractC0164m) {
        Arrays.sort(abstractC0164m.f434f, 0, abstractC0164m.f433e, this);
        abstractC0164m.mo1267a(kVar, (i) this);
    }

    @Override
    public int compare(Object obj, Object obj2) {
        a aVar = (a) obj;
        a aVar2 = (a) obj2;
        if (aVar.a < aVar2.a) {
            return -1;
        }
        return aVar.a > aVar2.a ? 1 : 0;
    }
}
