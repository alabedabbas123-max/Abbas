package com.a.b.e.b;

import com.a.b.g.ClassT;

public final class ClassZ extends ClassT {

    public static final ClassZ f3119a = new ClassZ(0);

    private final ClassU[] f3120b;

    private int f3121c;

    public ClassZ(int i) {
        super(i != 0);
        this.f3120b = new ClassU[i];
        this.f3121c = 0;
    }

    public ClassU m4928a(int i) {
        try {
            return this.f3120b[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("bogus reg");
        }
    }

    public ClassU m4929a(ClassO c1188o) {
        int length = this.f3120b.length;
        for (int i = 0; i < length; i++) {
            ClassU c1194u = this.f3120b[i];
            if (c1194u != null && c1188o.equals(c1194u.m4896i())) {
                return c1194u;
            }
        }
        return null;
    }

    public ClassU m4930a(ClassU c1194u) {
        return m4928a(c1194u.m4894g());
    }

    public void m4931a(ClassZ c1199z) {
        int iM4933b = c1199z.m4933b();
        for (int i = 0; i < iM4933b; i++) {
            ClassU c1194uM4928a = c1199z.m4928a(i);
            if (c1194uM4928a != null) {
                m4938d(c1194uM4928a);
            }
        }
    }

    public void m4932a(ClassZ c1199z, boolean z) {
        ClassU c1194uM4887a;
        m5518l();
        ClassU[] c1194uArr = c1199z.f3120b;
        int length = this.f3120b.length;
        int iMin = Math.min(length, c1194uArr.length);
        this.f3121c = -1;
        for (int i = 0; i < iMin; i++) {
            ClassU c1194u = this.f3120b[i];
            if (c1194u != null && (c1194uM4887a = c1194u.m4887a(c1194uArr[i], z)) != c1194u) {
                this.f3120b[i] = c1194uM4887a;
            }
        }
        while (iMin < length) {
            this.f3120b[iMin] = null;
            iMin++;
        }
    }

    public int m4933b() {
        return this.f3120b.length;
    }

    public ClassU m4934b(ClassU c1194u) {
        int length = this.f3120b.length;
        for (int i = 0; i < length; i++) {
            ClassU c1194u2 = this.f3120b[i];
            if (c1194u2 != null && c1194u.m4891b(c1194u2)) {
                return c1194u2;
            }
        }
        return null;
    }

    public ClassZ m4935b(int i) {
        int length = this.f3120b.length;
        ClassZ c1199z = new ClassZ(length + i);
        for (int i2 = 0; i2 < length; i2++) {
            ClassU c1194u = this.f3120b[i2];
            if (c1194u != null) {
                c1199z.m4938d(c1194u.m4893c(i));
            }
        }
        c1199z.f3121c = this.f3121c;
        if (m5517k()) {
            c1199z.mo3944c_();
        }
        return c1199z;
    }

    public void m4936c(ClassU c1194u) {
        try {
            this.f3120b[c1194u.m4894g()] = null;
            this.f3121c = -1;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("bogus reg");
        }
    }

    public int m4937d() {
        int i = this.f3121c;
        if (i < 0) {
            int length = this.f3120b.length;
            i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (this.f3120b[i2] != null) {
                    i++;
                }
            }
            this.f3121c = i;
        }
        return i;
    }

    public void m4938d(ClassU c1194u) {
        int i;
        ClassU c1194u2;
        m5518l();
        if (c1194u == null) {
            throw new NullPointerException("spec == null");
        }
        this.f3121c = -1;
        try {
            int iM4894g = c1194u.m4894g();
            this.f3120b[iM4894g] = c1194u;
            if (iM4894g > 0 && (c1194u2 = this.f3120b[(i = iM4894g - 1)]) != null && c1194u2.m4898k() == 2) {
                this.f3120b[i] = null;
            }
            if (c1194u.m4898k() == 2) {
                this.f3120b[iM4894g + 1] = null;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("spec.getReg() out of range");
        }
    }

    public ClassZ m4939e() {
        int length = this.f3120b.length;
        ClassZ c1199z = new ClassZ(length);
        for (int i = 0; i < length; i++) {
            ClassU c1194u = this.f3120b[i];
            if (c1194u != null) {
                c1199z.m4938d(c1194u);
            }
        }
        c1199z.f3121c = this.f3121c;
        return c1199z;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ClassZ)) {
            return false;
        }
        ClassZ c1199z = (ClassZ) obj;
        ClassU[] c1194uArr = c1199z.f3120b;
        int length = this.f3120b.length;
        if (length != c1194uArr.length || m4937d() != c1199z.m4937d()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            ClassU c1194u = this.f3120b[i];
            Object obj2 = c1194uArr[i];
            if (c1194u != obj2 && (c1194u == null || !c1194u.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int length = this.f3120b.length;
        int iHashCode = 0;
        for (int i = 0; i < length; i++) {
            ClassU c1194u = this.f3120b[i];
            iHashCode = (iHashCode * 31) + (c1194u == null ? 0 : c1194u.hashCode());
        }
        return iHashCode;
    }

    public String toString() {
        boolean z = false;
        int length = this.f3120b.length;
        StringBuilder sb = new StringBuilder(length * 25);
        sb.append('{');
        for (int i = 0; i < length; i++) {
            ClassU c1194u = this.f3120b[i];
            if (c1194u != null) {
                if (z) {
                    sb.append(", ");
                } else {
                    z = true;
                }
                sb.append(c1194u);
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
