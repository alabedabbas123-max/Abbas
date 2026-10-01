package a.b;

import a.b.a.a;
import a.b.a.d.i;
import a.b.c;
import a.b.g.aq;
import a.b.g.s;
import a.b.k;

public class ClassL extends Abstractm implements Interfaced {

    private static final a[] f428h = new a[0];

    public c f429a;

    public ClassL() {
    }

    public ClassL(int i, int i2, int i3, int i4, a[] aVarArr, c cVar) {
        super(i, i2, i3, i4, aVarArr);
        this.f429a = cVar;
    }

    public ClassL(int i, int i2, int i3, c cVar) {
        this(i, i2, i3, 0, f428h, cVar);
    }

    @Override
    public void mo677a(s sVar) {
        if (this.f429a != null) {
            this.f429a.a(sVar);
        }
    }

    @Override
    public void mo1267a(k kVar, i iVar) {
        for (int i = 0; i < this.f433e; i++) {
            this.f434f[i].a(kVar, this, iVar);
        }
    }

    @Override
    public void mo1268a(k kVar, aq aqVar) {
        aqVar.a(kVar, this);
    }
}
