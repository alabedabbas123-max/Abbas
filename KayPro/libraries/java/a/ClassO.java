package a;

import a.ab;
import a.b.a.d.i;
import a.b.b;
import a.b.c;
import a.b.f.w;
import a.b.g.aq;
import a.b.g.s;
import a.b.k;
import java.util.List;
import a.b.ClassE;
import a.b.ClassL;
import a.b.ClassN;
import a.b.Interfacei;
import a.b.f.ClassI;
import a.b.f.ClassZ;
import a.b.g.ClassC;
import a.b.g.ClassG;
import a.b.g.Interfacen;
import a.g.ClassF;
import a.g.ClassH;

public class ClassO extends w implements aq, s {

    private final b f1362a;

    private final b f1363b;

    private final ClassZ f1364c;

    private c f1365d;

    private Interfacei f1366e;

    private boolean f1367f;

    public ClassO(b bVar, b bVar2, ClassZ c0094z) {
        this.f1362a = bVar;
        this.f1363b = bVar2;
        this.f1364c = c0094z;
    }

    public void m3247a(ClassE c0057e) {
    }

    public void m3248a(k kVar) {
        if (ClassF.m2862b(kVar)) {
            return;
        }
        this.f1364c.m942a(this.f1365d.b(), kVar.b(), "Note: the configuration keeps the entry point '" + ClassI.m764c(this.f1365d.b()) + " { " + (this.f1367f ? ClassI.m749a(0, this.f1366e.mo946a(this.f1365d), this.f1366e.mo949b(this.f1365d)) : ClassI.m751a(this.f1365d.b(), 0, this.f1366e.mo946a(this.f1365d), this.f1366e.mo949b(this.f1365d))) + "; }', but not the descriptor class '" + ClassI.m764c(kVar.b()) + "'");
    }

    public void m3249a(k kVar, ClassL c0163l) {
    }

    public void m3250a(k kVar, ClassN c0165n) {
        this.f1365d = kVar;
        this.f1366e = c0165n;
        this.f1367f = false;
        c[] cVarArr = c0165n.f437a;
        if (cVarArr != null) {
            int length = cVarArr.length;
            if (ClassI.m784j(c0165n.mo949b(kVar))) {
                length--;
            }
            for (int i = 0; i < length; i++) {
                if (cVarArr[i] != null) {
                    cVarArr[i].a(this);
                }
            }
        }
    }

    public void m3251a(List list) {
        this.f1362a.a(new ClassG());
        this.f1363b.a(new ClassG());
        ClassF c0446f = new ClassF();
        Interfacen interfaceC0148nA = new ab(true, true, true).a(list, c0446f, c0446f, c0446f, (i) null);
        this.f1362a.a(interfaceC0148nA);
        this.f1363b.a(interfaceC0148nA);
        this.f1362a.a(new ClassC(new ClassH(this)));
    }
}
