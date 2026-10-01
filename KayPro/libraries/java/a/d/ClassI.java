package a.d;

import java.util.Arrays;
import a.d.a.Abstractae;
import a.d.a.Abstractaf;
import a.d.a.Abstractap;
import a.d.a.Abstractbd;
import a.d.a.Abstractd;
import a.d.a.Abstractt;
import a.d.a.Abstractu;
import a.d.a.au;

public class ClassI {

    private static final au f571d = new au();

    protected Abstractbd[] f572a;

    protected int f573b;

    protected int f574c;

    public ClassI(int i) {
        this.f572a = new Abstractbd[i];
    }

    public ClassI(ClassI c0239i) {
        this(c0239i.f572a.length);
        m1638a(c0239i);
    }

    public void mo1635a() {
        Arrays.fill(this.f572a, 0, this.f573b, (Object) null);
        this.f573b = 0;
    }

    public void mo1636a(int i) {
        if (this.f572a.length < i) {
            this.f572a = new Abstractbd[i];
        }
        mo1635a();
        this.f574c = 0;
    }

    public void mo1637a(Abstractbd abstractC0206bd) {
        if (abstractC0206bd.mo1588b()) {
            Abstractbd[] abstractC0206bdArr = this.f572a;
            int i = this.f573b;
            this.f573b = i + 1;
            abstractC0206bdArr[i] = f571d;
        }
        Abstractbd[] abstractC0206bdArr2 = this.f572a;
        int i2 = this.f573b;
        this.f573b = i2 + 1;
        abstractC0206bdArr2[i2] = abstractC0206bd;
        if (this.f574c < this.f573b) {
            this.f574c = this.f573b;
        }
    }

    public void m1638a(ClassI c0239i) {
        if (this.f572a.length < c0239i.f572a.length) {
            this.f572a = new Abstractbd[c0239i.f572a.length];
        }
        System.arraycopy(c0239i.f572a, 0, this.f572a, 0, c0239i.f573b);
        this.f573b = c0239i.f573b;
        this.f574c = c0239i.f574c;
    }

    public int m1639b() {
        return this.f573b;
    }

    public Abstractbd m1640b(int i) {
        return this.f572a[i];
    }

    public boolean m1641b(ClassI c0239i) {
        if (this.f573b != c0239i.f573b) {
            throw new IllegalArgumentException("Stacks have different current sizes [" + this.f573b + "] and [" + c0239i.f573b + "]");
        }
        boolean z = false;
        for (int i = 0; i < this.f573b; i++) {
            Abstractbd abstractC0206bd = this.f572a[i];
            if (abstractC0206bd != null) {
                Abstractbd abstractC0206bd2 = c0239i.f572a[i];
                Abstractbd abstractC0206bdMo1319a = abstractC0206bd2 != null ? abstractC0206bd.mo1319a(abstractC0206bd2) : null;
                z = z || !abstractC0206bd.equals(abstractC0206bdMo1319a);
                this.f572a[i] = abstractC0206bdMo1319a;
            }
        }
        if (this.f574c < c0239i.f574c) {
            this.f574c = c0239i.f574c;
        }
        return z;
    }

    public Abstractbd mo1642c() {
        Abstractbd[] abstractC0206bdArr = this.f572a;
        int i = this.f573b - 1;
        this.f573b = i;
        Abstractbd abstractC0206bd = abstractC0206bdArr[i];
        this.f572a[this.f573b] = null;
        if (abstractC0206bd.mo1588b()) {
            Abstractbd[] abstractC0206bdArr2 = this.f572a;
            int i2 = this.f573b - 1;
            this.f573b = i2;
            abstractC0206bdArr2[i2] = null;
        }
        return abstractC0206bd;
    }

    public Abstractbd m1643c(int i) {
        return this.f572a[(this.f573b - i) - 1];
    }

    public Abstractae m1644d() {
        return mo1642c().mo1404r();
    }

    public Abstractaf m1645e() {
        return mo1642c().mo1466k_();
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClassI c0239i = (ClassI) obj;
        if (this.f573b != c0239i.f573b) {
            return false;
        }
        for (int i = 0; i < this.f573b; i++) {
            Abstractbd abstractC0206bd = this.f572a[i];
            Abstractbd abstractC0206bd2 = c0239i.f572a[i];
            if (abstractC0206bd == null) {
                if (abstractC0206bd2 != null) {
                    return false;
                }
            } else if (!abstractC0206bd.equals(abstractC0206bd2)) {
                return false;
            }
        }
        return true;
    }

    public Abstractu m1646f() {
        return mo1642c().mo1590l();
    }

    public Abstractt m1647g() {
        return mo1642c().mo1589i();
    }

    public Abstractap m1648h() {
        return mo1642c().mo1558l_();
    }

    public int hashCode() {
        int iHashCode = this.f573b;
        for (int i = 0; i < this.f573b; i++) {
            Abstractbd abstractC0206bd = this.f572a[i];
            if (abstractC0206bd != null) {
                iHashCode ^= abstractC0206bd.hashCode();
            }
        }
        return iHashCode;
    }

    public void mo1649i() {
        Abstractbd[] abstractC0206bdArr = this.f572a;
        int i = this.f573b - 1;
        this.f573b = i;
        abstractC0206bdArr[i] = null;
    }

    public void mo1650j() {
        Abstractbd[] abstractC0206bdArr = this.f572a;
        int i = this.f573b - 1;
        this.f573b = i;
        abstractC0206bdArr[i] = null;
        Abstractbd[] abstractC0206bdArr2 = this.f572a;
        int i2 = this.f573b - 1;
        this.f573b = i2;
        abstractC0206bdArr2[i2] = null;
    }

    public void mo1651k() {
        this.f572a[this.f573b] = this.f572a[this.f573b - 1].mo1587a();
        this.f573b++;
        if (this.f574c < this.f573b) {
            this.f574c = this.f573b;
        }
    }

    public void mo1652l() {
        this.f572a[this.f573b] = this.f572a[this.f573b - 1].mo1587a();
        this.f572a[this.f573b - 1] = this.f572a[this.f573b - 2].mo1587a();
        this.f572a[this.f573b - 2] = this.f572a[this.f573b];
        this.f573b++;
        if (this.f574c < this.f573b) {
            this.f574c = this.f573b;
        }
    }

    public void mo1653m() {
        this.f572a[this.f573b] = this.f572a[this.f573b - 1].mo1587a();
        this.f572a[this.f573b - 1] = this.f572a[this.f573b - 2];
        this.f572a[this.f573b - 2] = this.f572a[this.f573b - 3];
        this.f572a[this.f573b - 3] = this.f572a[this.f573b];
        this.f573b++;
        if (this.f574c < this.f573b) {
            this.f574c = this.f573b;
        }
    }

    public void mo1654n() {
        this.f572a[this.f573b] = this.f572a[this.f573b - 2];
        this.f572a[this.f573b + 1] = this.f572a[this.f573b - 1];
        this.f573b += 2;
        if (this.f574c < this.f573b) {
            this.f574c = this.f573b;
        }
    }

    public void mo1655o() {
        this.f572a[this.f573b + 1] = this.f572a[this.f573b - 1];
        this.f572a[this.f573b] = this.f572a[this.f573b - 2];
        this.f572a[this.f573b - 1] = this.f572a[this.f573b - 3];
        this.f572a[this.f573b - 2] = this.f572a[this.f573b + 1];
        this.f572a[this.f573b - 3] = this.f572a[this.f573b];
        this.f573b += 2;
        if (this.f574c < this.f573b) {
            this.f574c = this.f573b;
        }
    }

    public void mo1656p() {
        this.f572a[this.f573b + 1] = this.f572a[this.f573b - 1];
        this.f572a[this.f573b] = this.f572a[this.f573b - 2];
        this.f572a[this.f573b - 1] = this.f572a[this.f573b - 3];
        this.f572a[this.f573b - 2] = this.f572a[this.f573b - 4];
        this.f572a[this.f573b - 3] = this.f572a[this.f573b + 1];
        this.f572a[this.f573b - 4] = this.f572a[this.f573b];
        this.f573b += 2;
        if (this.f574c < this.f573b) {
            this.f574c = this.f573b;
        }
    }

    public void mo1657q() {
        Abstractd abstractC0209dMo1587a = this.f572a[this.f573b - 1].mo1587a();
        this.f572a[this.f573b - 1] = this.f572a[this.f573b - 2].mo1587a();
        this.f572a[this.f573b - 2] = abstractC0209dMo1587a;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < this.f573b; i++) {
            Abstractbd abstractC0206bd = this.f572a[i];
            stringBuffer = stringBuffer.append('[').append(abstractC0206bd == null ? "empty" : abstractC0206bd.toString()).append(']');
        }
        return stringBuffer.toString();
    }
}
