package a.f;

import a.b.a.d.i;
import a.b.c;
import a.b.f.w;
import a.b.g.aq;
import a.b.g.s;
import a.b.k;
import a.b.Abstractm;

public class ClassZ extends w implements i, aq, s {
    public void m1878a(k kVar) {
        String strB = kVar.b();
        String strM1794b = ClassC.m1794b((c) kVar);
        if (strM1794b != null && !strB.equals(strM1794b)) {
            kVar.d |= 65536;
        }
        kVar.a(this);
        kVar.b(this);
    }

    public void m1879a(k kVar, Abstractm abstractC0164m) {
        String strMo946a = abstractC0164m.mo946a((c) kVar);
        String strM1850b = ClassP.m1850b(abstractC0164m);
        if (strM1850b == null || strM1850b.equals(strMo946a)) {
            return;
        }
        abstractC0164m.f430b |= 65536;
    }
}
