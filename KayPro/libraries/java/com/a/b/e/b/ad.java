package com.a.b.e.b;

import com.baidu.mobstat.Config;
import com.a.b.e.c.ad;
import com.a.b.g.ClassK;

public final class ad {

    public static final ad f3049a = new ad(null, -1, -1);

    private final ad f3050b;

    private final int f3051c;

    private final int f3052d;

    public ad(ad c1204ad, int i, int i2) {
        if (i < -1) {
            throw new IllegalArgumentException("address < -1");
        }
        if (i2 < -1) {
            throw new IllegalArgumentException("line < -1");
        }
        this.f3050b = c1204ad;
        this.f3051c = i;
        this.f3052d = i2;
    }

    public int m4799a() {
        return this.f3052d;
    }

    public boolean m4800a(ad c1170ad) {
        return this.f3052d == c1170ad.f3052d;
    }

    public boolean m4801b(ad c1170ad) {
        return this.f3052d == c1170ad.f3052d && (this.f3050b == c1170ad.f3050b || (this.f3050b != null && this.f3050b.equals(c1170ad.f3050b)));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ad)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ad c1170ad = (ad) obj;
        return this.f3051c == c1170ad.f3051c && m4801b(c1170ad);
    }

    public int hashCode() {
        return this.f3050b.hashCode() + this.f3051c + this.f3052d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(50);
        if (this.f3050b != null) {
            sb.append(this.f3050b.mo3828d());
            sb.append(Config.TRACE_TODAY_VISIT_SPLIT);
        }
        if (this.f3052d >= 0) {
            sb.append(this.f3052d);
        }
        sb.append('@');
        if (this.f3051c < 0) {
            sb.append("????");
        } else {
            sb.append(ClassK.m5485c(this.f3051c));
        }
        return sb.toString();
    }
}
