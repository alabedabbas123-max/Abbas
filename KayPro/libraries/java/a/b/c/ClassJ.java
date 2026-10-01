package a.b.c;

import a.b.a.a;
import a.b.a.d;
import a.b.k;
import a.b.Abstractm;

public class ClassJ {

    private final k f62a;

    private final Abstractm f63b;

    private final d f64c;

    private final boolean f65d;

    public ClassJ(k kVar, Abstractm abstractC0164m, d dVar, boolean z) {
        this.f62a = kVar;
        this.f63b = abstractC0164m;
        this.f64c = dVar;
        this.f65d = z;
    }

    public ClassJ(k kVar, Abstractm abstractC0164m, boolean z) {
        this(kVar, abstractC0164m, null, z);
    }

    public ClassJ(k kVar, boolean z) {
        this(kVar, null, null, z);
    }

    private int m143a(int i, a[] aVarArr, String str) {
        int iM145b = m145b(i, aVarArr, str);
        if (iM145b < 0) {
            return i;
        }
        System.arraycopy(aVarArr, iM145b + 1, aVarArr, iM145b, (i - iM145b) - 1);
        int i2 = i - 1;
        aVarArr[i2] = null;
        return i2;
    }

    private boolean m144a(int i, a[] aVarArr, a aVar) {
        int iM145b = m145b(i, aVarArr, aVar.a(this.f62a));
        if (iM145b < 0) {
            return false;
        }
        aVarArr[iM145b] = aVar;
        return true;
    }

    private int m145b(int i, a[] aVarArr, String str) {
        for (int i2 = 0; i2 < i; i2++) {
            if (aVarArr[i2].a(this.f62a).equals(str)) {
                return i2;
            }
        }
        return -1;
    }

    private a[] m146b(int i, a[] aVarArr, a aVar) {
        if (aVarArr.length <= i) {
            a[] aVarArr2 = new a[i + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, i);
            aVarArr = aVarArr2;
        }
        aVarArr[i] = aVar;
        return aVarArr;
    }

    private a m147c(int i, a[] aVarArr, String str) {
        for (int i2 = 0; i2 < i; i2++) {
            a aVar = aVarArr[i2];
            if (aVar.a(this.f62a).equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    public a m148a(String str) {
        if (this.f64c != null) {
            return m147c(this.f64c.i, this.f64c.j, str);
        }
        return this.f63b != null ? m147c(this.f63b.f433e, this.f63b.f434f, str) : m147c(this.f62a.m, this.f62a.n, str);
    }

    public void m149a(a aVar) {
        if (this.f64c != null) {
            if (this.f65d && m144a(this.f64c.i, this.f64c.j, aVar)) {
                return;
            }
            this.f64c.j = m146b(this.f64c.i, this.f64c.j, aVar);
            this.f64c.i++;
            return;
        }
        if (this.f63b != null) {
            if (this.f65d && m144a(this.f63b.f433e, this.f63b.f434f, aVar)) {
                return;
            }
            this.f63b.f434f = m146b(this.f63b.f433e, this.f63b.f434f, aVar);
            this.f63b.f433e++;
            return;
        }
        if (this.f65d && m144a(this.f62a.m, this.f62a.n, aVar)) {
            return;
        }
        this.f62a.n = m146b(this.f62a.m, this.f62a.n, aVar);
        this.f62a.m++;
    }

    public void m150b(String str) {
        if (this.f64c != null) {
            this.f64c.i = m143a(this.f64c.i, this.f64c.j, str);
        } else if (this.f63b != null) {
            this.f63b.f433e = m143a(this.f63b.f433e, this.f63b.f434f, str);
        } else {
            this.f62a.m = m143a(this.f62a.m, this.f62a.n, str);
        }
    }
}
