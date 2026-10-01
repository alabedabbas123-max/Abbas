package a.b.c;

import a.b.a.a.a;
import a.b.a.a.d;

public class ClassG {

    private d f50a;

    public ClassG(d dVar) {
        this.f50a = dVar;
    }

    public void m114a(a aVar) {
        int i = this.f50a.c;
        a[] aVarArr = this.f50a.d;
        if (aVarArr.length <= i) {
            this.f50a.d = new a[i + 1];
            System.arraycopy(aVarArr, 0, this.f50a.d, 0, i);
            aVarArr = this.f50a.d;
        }
        d dVar = this.f50a;
        int i2 = dVar.c;
        dVar.c = i2 + 1;
        aVarArr[i2] = aVar;
    }
}
