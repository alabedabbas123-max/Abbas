package org.a.a.a.a;

import java.util.Arrays;

public class ClassR extends Abstractax {

    static final boolean f5231c;

    public final Abstractax[] f5232a;

    public final int[] f5233b;

    static {
        f5231c = !ClassR.class.desiredAssertionStatus();
    }

    public ClassR(bg c1719bg) {
        this(new Abstractax[]{c1719bg.f5181a}, new int[]{c1719bg.f5182b});
    }

    public ClassR(Abstractax[] abstractC1709axArr, int[] iArr) {
        super(m7290a(abstractC1709axArr, iArr));
        if (!f5231c && (abstractC1709axArr == null || abstractC1709axArr.length <= 0)) {
            throw new AssertionError();
        }
        if (!f5231c && (iArr == null || iArr.length <= 0)) {
            throw new AssertionError();
        }
        this.f5232a = abstractC1709axArr;
        this.f5233b = iArr;
    }

    @Override
    public Abstractax mo7297a(int i) {
        return this.f5232a[i];
    }

    @Override
    public boolean mo7298a() {
        return this.f5233b[0] == Integer.MAX_VALUE;
    }

    @Override
    public int mo7299b() {
        return this.f5233b.length;
    }

    @Override
    public int mo7300b(int i) {
        return this.f5233b[i];
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ClassR) && hashCode() == obj.hashCode()) {
            ClassR c1742r = (ClassR) obj;
            return Arrays.equals(this.f5233b, c1742r.f5233b) && Arrays.equals(this.f5232a, c1742r.f5232a);
        }
        return false;
    }

    public String toString() {
        if (mo7298a()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < this.f5233b.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            if (this.f5233b[i] == Integer.MAX_VALUE) {
                sb.append("$");
            } else {
                sb.append(this.f5233b[i]);
                if (this.f5232a[i] != null) {
                    sb.append(' ');
                    sb.append(this.f5232a[i].toString());
                } else {
                    sb.append("null");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
