package a.d;

import java.util.Arrays;
import a.d.a.Abstractae;
import a.d.a.Abstractaf;
import a.d.a.Abstractap;
import a.d.a.Abstractbd;
import a.d.a.Abstractt;
import a.d.a.Abstractu;
import a.d.a.ad;
import a.d.a.au;

public class ClassL {

    private static final au f580c = new au();

    protected Abstractbd[] f581a;

    protected int f582b;

    public ClassL(int i) {
        this.f581a = new Abstractbd[i];
        this.f582b = i;
    }

    public ClassL(ClassL c0242l) {
        this(c0242l.f582b);
        m1675a(c0242l);
    }

    public int m1674a() {
        return this.f582b;
    }

    public void m1675a(ClassL c0242l) {
        if (this.f582b < c0242l.f582b) {
            throw new IllegalArgumentException("Variable frame is too small [" + this.f582b + "] compared to other frame [" + c0242l.f582b + "]");
        }
        System.arraycopy(c0242l.f581a, 0, this.f581a, 0, c0242l.f582b);
    }

    public boolean m1676a(ClassL c0242l, boolean z) {
        if (this.f582b != c0242l.f582b) {
            throw new IllegalArgumentException("Variable frames have different sizes [" + this.f582b + "] and [" + c0242l.f582b + "]");
        }
        boolean z2 = false;
        for (int i = 0; i < this.f582b; i++) {
            Abstractbd abstractC0206bd = this.f581a[i];
            Abstractbd abstractC0206bd2 = c0242l.f581a[i];
            if (abstractC0206bd == null || abstractC0206bd2 == null || abstractC0206bd.mo1331j() != abstractC0206bd2.mo1331j()) {
                z2 = z2 || abstractC0206bd != null;
                this.f581a[i] = null;
                if (z) {
                    c0242l.f581a[i] = null;
                }
            } else {
                Abstractbd abstractC0206bdMo1319a = abstractC0206bd.mo1319a(abstractC0206bd2);
                z2 = z2 || !abstractC0206bd.equals(abstractC0206bdMo1319a);
                this.f581a[i] = abstractC0206bdMo1319a;
            }
        }
        return z2;
    }

    public void mo1672b(int i) {
        if (this.f581a.length < i) {
            this.f581a = new Abstractbd[i];
        } else {
            Arrays.fill(this.f581a, 0, this.f582b, (Object) null);
        }
        this.f582b = i;
    }

    public void mo1673b(int i, Abstractbd abstractC0206bd) {
        if (i < 0 || i >= this.f582b) {
            throw new IndexOutOfBoundsException("Variable index [" + i + "] out of bounds [" + this.f582b + "]");
        }
        this.f581a[i] = abstractC0206bd;
        if (abstractC0206bd.mo1588b()) {
            this.f581a[i + 1] = f580c;
        }
    }

    public Abstractbd m1677c(int i) {
        if (i < 0 || i >= this.f582b) {
            throw new IndexOutOfBoundsException("Variable index [" + i + "] out of bounds [" + this.f582b + "]");
        }
        return this.f581a[i];
    }

    public Abstractbd m1678d(int i) {
        if (i < 0 || i >= this.f582b) {
            throw new IndexOutOfBoundsException("Variable index [" + i + "] out of bounds [" + this.f582b + "]");
        }
        return this.f581a[i];
    }

    public Abstractae m1679e(int i) {
        return m1678d(i).mo1404r();
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClassL c0242l = (ClassL) obj;
        if (this.f582b != c0242l.f582b) {
            return false;
        }
        for (int i = 0; i < this.f582b; i++) {
            Abstractbd abstractC0206bd = this.f581a[i];
            Abstractbd abstractC0206bd2 = c0242l.f581a[i];
            if (abstractC0206bd != null && abstractC0206bd2 != null && abstractC0206bd.mo1331j() == abstractC0206bd2.mo1331j() && !abstractC0206bd.equals(abstractC0206bd2)) {
                return false;
            }
        }
        return true;
    }

    public Abstractaf m1680f(int i) {
        return m1678d(i).mo1466k_();
    }

    public Abstractu m1681g(int i) {
        return m1678d(i).mo1590l();
    }

    public Abstractt m1682h(int i) {
        return m1678d(i).mo1589i();
    }

    public int hashCode() {
        int iHashCode = this.f582b;
        for (int i = 0; i < this.f582b; i++) {
            Abstractbd abstractC0206bd = this.f581a[i];
            if (abstractC0206bd != null) {
                iHashCode ^= abstractC0206bd.hashCode();
            }
        }
        return iHashCode;
    }

    public Abstractap m1683i(int i) {
        return m1678d(i).mo1558l_();
    }

    public ad m1684j(int i) {
        return m1678d(i).mo1335n_();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < this.f582b; i++) {
            Abstractbd abstractC0206bd = this.f581a[i];
            stringBuffer = stringBuffer.append('[').append(abstractC0206bd == null ? "empty" : abstractC0206bd.toString()).append(']');
        }
        return stringBuffer.toString();
    }
}
