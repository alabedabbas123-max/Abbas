package a.b.c;

import a.b.a.a;
import a.b.a.d.i;
import a.b.a.d.m;
import a.b.a.k;
import a.b.a.l;
import a.b.c;
import a.b.c.ap;
import a.b.f.w;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttInnerClasses;

class ClassP extends w implements i, m {

    final ClassO f80a;

    private final Object f81b = new Object();

    private final ClassJ f82c;

    public ClassP(ClassO c0029o, ClassJ c0024j) {
        this.f80a = c0029o;
        this.f82c = c0024j;
    }

    private void m172a(l lVar) {
        lVar.a(this.f81b);
    }

    private boolean m173b(l lVar) {
        return lVar.f() == this.f81b;
    }

    public void m174a(c cVar, a aVar) {
    }

    public void m175a(c cVar, k kVar) {
        kVar.a(cVar, this);
        ap apVar = new ap(kVar);
        for (int i = kVar.c - 1; i >= 0; i--) {
            l lVar = kVar.d[i];
            if (m173b(lVar)) {
                apVar.a(lVar);
            }
        }
        if (kVar.c == 0) {
            this.f82c.m150b(AttInnerClasses.ATTRIBUTE_NAME);
        }
    }

    public void m176a(c cVar, l lVar) {
        a.b.k kVar = (a.b.k) cVar;
        a.b.b.a aVar = (a.b.b.a) kVar.l(lVar.a);
        a.b.b.a aVar2 = (a.b.b.a) kVar.l(lVar.b);
        if (m177a(aVar, cVar) || m177a(aVar2, cVar)) {
            m172a(lVar);
        }
    }

    public boolean m177a(a.b.b.a aVar, c cVar) {
        return aVar != null && aVar.a(cVar).startsWith("java/lang/invoke/MethodHandles");
    }
}
