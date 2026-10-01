package com.a.b.c.b;

import com.a.b.e.b.ClassU;
import com.a.b.e.b.ClassZ;
import com.a.b.e.d.ClassC;
import java.util.ArrayList;
import java.util.Arrays;

public class ClassV {

    private final ArrayList f2327a;

    private int f2328b = 0;

    private ClassZ f2329c = null;

    private int[] f2330d = null;

    private final int f2331e = 0;

    public ClassV(int i) {
        this.f2327a = new ArrayList(i);
    }

    private static ClassU m4445a(ClassU c1194u) {
        return (c1194u == null || c1194u.mo3825a() != ClassC.f3259j) ? c1194u : c1194u.m4888a(ClassC.f3267r);
    }

    private void m4446a(int i, int i2) {
        boolean z = this.f2330d == null;
        if (i != this.f2331e || z) {
            if (i < this.f2331e) {
                throw new RuntimeException("shouldn't happen");
            }
            if (z || i2 >= this.f2330d.length) {
                int i3 = i2 + 1;
                ClassZ c1199z = new ClassZ(i3);
                int[] iArr = new int[i3];
                Arrays.fill(iArr, -1);
                if (!z) {
                    c1199z.m4931a(this.f2329c);
                    System.arraycopy(this.f2330d, 0, iArr, 0, this.f2330d.length);
                }
                this.f2329c = c1199z;
                this.f2330d = iArr;
            }
        }
    }

    private void m4447a(int i, Enumt enumC1052t, ClassU c1194u) {
        int iM4894g = c1194u.m4894g();
        this.f2327a.add(new ClassU(i, enumC1052t, c1194u));
        if (enumC1052t == Enumt.START) {
            this.f2329c.m4938d(c1194u);
            this.f2330d[iM4894g] = -1;
        } else {
            this.f2329c.m4936c(c1194u);
            this.f2330d[iM4894g] = this.f2327a.size() - 1;
        }
    }

    private void m4448b(int i, Enumt enumC1052t, ClassU c1194u) {
        if (enumC1052t == Enumt.START) {
            throw new RuntimeException("shouldn't happen");
        }
        int i2 = this.f2330d[c1194u.m4894g()];
        if (i2 >= 0) {
            ClassU c1053u = (ClassU) this.f2327a.get(i2);
            if (c1053u.m4433a() == i && c1053u.m4444h().equals(c1194u)) {
                this.f2327a.set(i2, c1053u.m4435a(enumC1052t));
                this.f2329c.m4936c(c1194u);
                return;
            }
        }
        m4452a(i, c1194u, enumC1052t);
    }

    private boolean m4449c(int i, ClassU c1194u) {
        boolean z = false;
        int size = this.f2327a.size() - 1;
        while (size >= 0) {
            ClassU c1053u = (ClassU) this.f2327a.get(size);
            if (c1053u != null) {
                if (c1053u.m4433a() != i) {
                    return false;
                }
                if (c1053u.m4436a(c1194u)) {
                    break;
                }
            }
            size--;
        }
        this.f2329c.m4936c(c1194u);
        this.f2327a.set(size, null);
        this.f2328b++;
        int iM4894g = c1194u.m4894g();
        int i2 = size - 1;
        ClassU c1053u2 = null;
        while (i2 >= 0) {
            c1053u2 = (ClassU) this.f2327a.get(i2);
            if (c1053u2 != null && c1053u2.m4444h().m4894g() == iM4894g) {
                z = true;
                break;
            }
            i2--;
        }
        if (z) {
            this.f2330d[iM4894g] = i2;
            if (c1053u2.m4433a() == i) {
                this.f2327a.set(i2, c1053u2.m4435a(Enumt.END_SIMPLY));
            }
        }
        return true;
    }

    public ClassS m4450a() {
        m4446a(Integer.MAX_VALUE, 0);
        int size = this.f2327a.size();
        int i = size - this.f2328b;
        if (i == 0) {
            return ClassS.f2315a;
        }
        ClassU[] c1053uArr = new ClassU[i];
        if (size == i) {
            this.f2327a.toArray(c1053uArr);
        } else {
            int i2 = 0;
            for (ClassU c1053u : this.f2327a) {
                if (c1053u != null) {
                    c1053uArr[i2] = c1053u;
                    i2++;
                }
            }
        }
        Arrays.sort(c1053uArr);
        ClassS c1051s = new ClassS(i);
        for (int i3 = 0; i3 < i; i3++) {
            c1051s.m4432a(i3, c1053uArr[i3]);
        }
        c1051s.mo3944c_();
        return c1051s;
    }

    public void m4451a(int i, ClassU c1194u) {
        ClassU c1194uM4928a;
        ClassU c1194uM4928a2;
        int iM4894g = c1194u.m4894g();
        ClassU c1194uM4445a = m4445a(c1194u);
        m4446a(i, iM4894g);
        ClassU c1194uM4928a3 = this.f2329c.m4928a(iM4894g);
        if (c1194uM4445a.m4889a(c1194uM4928a3)) {
            return;
        }
        ClassU c1194uM4934b = this.f2329c.m4934b(c1194uM4445a);
        if (c1194uM4934b != null) {
            m4448b(i, Enumt.END_MOVED, c1194uM4934b);
        }
        int i2 = this.f2330d[iM4894g];
        if (c1194uM4928a3 != null) {
            m4447a(i, Enumt.END_REPLACED, c1194uM4928a3);
        } else if (i2 >= 0) {
            ClassU c1053u = (ClassU) this.f2327a.get(i2);
            if (c1053u.m4433a() == i) {
                if (c1053u.m4436a(c1194uM4445a)) {
                    this.f2327a.set(i2, null);
                    this.f2328b++;
                    this.f2329c.m4938d(c1194uM4445a);
                    this.f2330d[iM4894g] = -1;
                    return;
                }
                this.f2327a.set(i2, c1053u.m4435a(Enumt.END_REPLACED));
            }
        }
        if (iM4894g > 0 && (c1194uM4928a2 = this.f2329c.m4928a(iM4894g - 1)) != null && c1194uM4928a2.m4899l()) {
            m4448b(i, Enumt.END_CLOBBERED_BY_NEXT, c1194uM4928a2);
        }
        if (c1194uM4445a.m4899l() && (c1194uM4928a = this.f2329c.m4928a(iM4894g + 1)) != null) {
            m4448b(i, Enumt.END_CLOBBERED_BY_PREV, c1194uM4928a);
        }
        m4447a(i, Enumt.START, c1194uM4445a);
    }

    public void m4452a(int i, ClassU c1194u, Enumt enumC1052t) {
        int iM4894g = c1194u.m4894g();
        ClassU c1194uM4445a = m4445a(c1194u);
        m4446a(i, iM4894g);
        if (this.f2330d[iM4894g] < 0 && !m4449c(i, c1194uM4445a)) {
            m4447a(i, enumC1052t, c1194uM4445a);
        }
    }

    public void m4453a(int i, ClassZ c1199z) {
        int iM4933b = c1199z.m4933b();
        m4446a(i, iM4933b - 1);
        for (int i2 = 0; i2 < iM4933b; i2++) {
            ClassU c1194uM4928a = this.f2329c.m4928a(i2);
            ClassU c1194uM4445a = m4445a(c1199z.m4928a(i2));
            if (c1194uM4928a == null) {
                if (c1194uM4445a != null) {
                    m4451a(i, c1194uM4445a);
                }
            } else if (c1194uM4445a == null) {
                m4454b(i, c1194uM4928a);
            } else if (!c1194uM4445a.m4889a(c1194uM4928a)) {
                m4454b(i, c1194uM4928a);
                m4451a(i, c1194uM4445a);
            }
        }
    }

    public void m4454b(int i, ClassU c1194u) {
        m4452a(i, c1194u, Enumt.END_SIMPLY);
    }
}
