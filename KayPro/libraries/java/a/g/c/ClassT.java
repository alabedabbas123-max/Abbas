package a.g.c;

import a.b.c;
import a.b.f.w;
import a.b.g.aq;
import a.b.k;
import a.b.ClassN;
import a.b.Interfacej;
import a.b.f.ClassR;
import a.g.ClassF;

public class ClassT extends w implements aq {

    private final aq f1075a;

    private final ClassR f1076b;

    public ClassT() {
        this(null);
    }

    public ClassT(aq aqVar) {
        this.f1076b = new ClassR();
        this.f1075a = aqVar;
    }

    public void m2773a(k kVar, ClassN c0165n) {
        String strA = c0165n.mo946a((c) kVar);
        if ((c0165n.f430b & 1050) != 0 || strA.equals("<init>")) {
            return;
        }
        if ((kVar.d & 16) == 0) {
            if (ClassF.m2861a(c0165n)) {
                return;
            }
            if (kVar.o != null && this.f1076b.m906a((c) kVar, (Interfacej) c0165n)) {
                return;
            }
        }
        c0165n.f430b |= 16;
        if (this.f1075a != null) {
            this.f1075a.a(kVar, c0165n);
        }
    }
}
