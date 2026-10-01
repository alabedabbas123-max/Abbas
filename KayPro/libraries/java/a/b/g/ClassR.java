package a.b.g;

import a.b.g.s;
import a.b.k;
import java.util.Set;
import a.b.ClassE;

public class ClassR implements s {

    private final int f416a;

    private final Set f417b;

    public ClassR(int i) {
        this(i, null);
    }

    public ClassR(int i, Set set) {
        this.f416a = i;
        this.f417b = set;
    }

    public void m1250a(ClassE c0057e) {
    }

    public void m1251a(k kVar) {
        if (kVar.a > this.f416a && this.f417b != null) {
            this.f417b.add(new Integer(kVar.a));
        }
        kVar.a = this.f416a;
    }
}
