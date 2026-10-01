package a.b;

import a.b.a.a;
import a.b.a.d.i;
import a.b.c;
import a.b.g.aq;
import a.b.g.s;
import a.b.k;

public class ClassN extends Abstractm implements Interfacej {

    private static final a[] f436h = new a[0];

    public c[] f437a;

    public ClassN() {
    }

    public ClassN(int i, int i2, int i3, int i4, a[] aVarArr, c[] cVarArr) {
        super(i, i2, i3, i4, aVarArr);
        this.f437a = cVarArr;
    }

    public ClassN(int i, int i2, int i3, c[] cVarArr) {
        this(i, i2, i3, 0, f436h, cVarArr);
    }

    @Override
    public void mo677a(s sVar) {
        if (this.f437a != null) {
            for (int i = 0; i < this.f437a.length; i++) {
                if (this.f437a[i] != null) {
                    this.f437a[i].a(sVar);
                }
            }
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
