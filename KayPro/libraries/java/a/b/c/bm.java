package a.b.c;

import a.b.a.a;
import a.b.a.d;
import a.b.a.d.i;
import a.b.c;
import a.b.c.aa;
import a.b.c.ab;
import a.b.c.ae;
import a.b.f.w;
import a.b.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import a.b.ClassL;
import a.b.ClassN;
import a.b.Interfacej;
import a.b.d.Abstractc;
import a.f.ad;
import a.f.Interfacet;

public class bm extends w implements i {

    private final k f15a;

    private final ClassR f16b;

    private final ae f17c;

    private final Interfacet f18d;

    private final List f19e = new ArrayList();

    private Abstractc[] f20f;

    public bm(k kVar) {
        this.f15a = kVar;
        this.f16b = new ClassR(kVar);
        this.f17c = new ae(kVar);
        this.f18d = ad.m1784a(kVar);
    }

    public ab m45a(int i, String str, String str2, int i2) {
        return m46a(i, str, str2, null, i2);
    }

    public ab m46a(int i, String str, String str2, c[] cVarArr, int i2) {
        bn c0008bn = new bn(this, new ClassN(i, this.f17c.c(str), this.f17c.c(str2), cVarArr), i2);
        this.f19e.add(c0008bn);
        return c0008bn;
    }

    public bm m47a(int i, String str, String str2) {
        this.f16b.m187a(new ClassL(i, this.f17c.c(str), this.f17c.c(str2), null));
        return this;
    }

    public void m48a() {
        Iterator it = this.f19e.iterator();
        while (it.hasNext()) {
            ((bn) it.next()).m51j();
        }
    }

    public void m49a(c cVar, a aVar) {
    }

    public void m50a(c cVar, Interfacej interfaceC0162j, d dVar) {
        ClassV c0036v = new ClassV();
        ((ClassN) interfaceC0162j).mo1267a(this.f15a, (i) new aa(c0036v));
        c0036v.m279a(0, this.f20f);
        c0036v.m284a(cVar, interfaceC0162j, dVar);
    }
}
