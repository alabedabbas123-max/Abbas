package a.f;

import a.b.b.a;
import a.b.b.a.f;
import a.b.c;
import a.b.c.ae;
import a.b.f.w;
import a.b.g.aq;
import a.b.g.s;
import a.b.k;
import a.b.Abstractg;
import a.b.Abstractm;
import a.b.ClassE;

public class ClassF extends w implements f, aq, s {
    public void m1814a(c cVar, a aVar) {
        String strM1794b = ClassC.m1794b(cVar);
        if (strM1794b != null) {
            aVar.a = new ae((k) cVar).c(strM1794b);
        }
    }

    public void m1815a(ClassE c0057e) {
        c0057e.f159b = ClassC.m1794b(c0057e);
        c0057e.m406a((aq) this);
        c0057e.m417b((aq) this);
    }

    public void m1816a(ClassE c0057e, Abstractg abstractC0095g) {
        String strM1850b = ClassP.m1850b(abstractC0095g);
        if (strM1850b != null) {
            abstractC0095g.f314c = strM1850b;
        }
    }

    public void m1817a(k kVar) {
        kVar.d(this);
        kVar.a(this);
        kVar.b(this);
    }

    public void m1818a(k kVar, Abstractm abstractC0164m) {
        String strMo946a = abstractC0164m.mo946a((c) kVar);
        String strM1850b = ClassP.m1850b(abstractC0164m);
        if (strM1850b == null || strM1850b.equals(strMo946a)) {
            return;
        }
        abstractC0164m.f431c = new ae(kVar).c(strM1850b);
    }
}
