package a.b.g;

import a.b.g.s;
import a.b.k;
import a.b.ClassE;

public class ClassF implements s {

    private final int f393a;

    private final int f394b;

    private final s f395c;

    public ClassF(int i, int i2, s sVar) {
        this.f393a = i;
        this.f394b = i2;
        this.f395c = sVar;
    }

    private boolean m1086a(int i) {
        return (this.f393a & (i ^ (-1))) == 0 && (this.f394b & i) == 0;
    }

    public void m1087a(ClassE c0057e) {
        if (m1086a(c0057e.m399a())) {
            this.f395c.a(c0057e);
        }
    }

    public void m1088a(k kVar) {
        if (m1086a(kVar.a())) {
            this.f395c.a(kVar);
        }
    }
}
