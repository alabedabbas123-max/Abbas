package a.b.g;

import a.b.g.s;
import a.b.k;
import a.b.ClassE;

public class ClassQ implements s {

    private final int f413a;

    private final int f414b;

    private final s f415c;

    public ClassQ(int i, int i2, s sVar) {
        this.f413a = i;
        this.f414b = i2;
        this.f415c = sVar;
    }

    public ClassQ(int i, s sVar) {
        this(i, Integer.MAX_VALUE, sVar);
    }

    public void m1248a(ClassE c0057e) {
    }

    public void m1249a(k kVar) {
        if (kVar.a < this.f413a || kVar.a > this.f414b) {
            return;
        }
        this.f415c.a(kVar);
    }
}
