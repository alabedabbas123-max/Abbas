package a.b.c;

import a.b.a.b;
import a.b.a.c;
import a.b.a.d.j;
import a.b.c.ad;
import a.b.k;

public class ClassK implements j {

    private final ad f66a;

    private final ClassN f67b;

    private int f68c;

    public ClassK(k kVar, c cVar) {
        this.f66a = new ad(kVar);
        this.f67b = new ClassN(cVar);
    }

    public int m151a() {
        return this.f68c;
    }

    public void m152a(a.b.c cVar, b bVar) {
        int i = bVar.b;
        int[] iArr = bVar.c;
        int[] iArr2 = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr2[i2] = this.f66a.a(cVar, iArr[i2]);
        }
        this.f68c = this.f67b.m159a(new b(this.f66a.a(cVar, bVar.a), i, iArr2));
    }
}
