package com.a.b.e.a;

import com.baidu.mobstat.Config;
import com.a.b.e.c.Abstracta;
import com.a.b.e.c.ad;

public final class ClassE implements Comparable {

    private final ad f2829a;

    private final Abstracta f2830b;

    public ClassE(ad c1204ad, Abstracta abstractC1200a) {
        if (c1204ad == null) {
            throw new NullPointerException("name == null");
        }
        if (abstractC1200a == null) {
            throw new NullPointerException("value == null");
        }
        this.f2829a = c1204ad;
        this.f2830b = abstractC1200a;
    }

    @Override
    public int compareTo(ClassE c1165e) {
        int iA = this.f2829a.compareTo(c1165e.f2829a);
        return iA != 0 ? iA : this.f2830b.compareTo(c1165e.f2830b);
    }

    public ad m4724a() {
        return this.f2829a;
    }

    public Abstracta m4725b() {
        return this.f2830b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ClassE)) {
            return false;
        }
        ClassE c1165e = (ClassE) obj;
        return this.f2829a.equals(c1165e.f2829a) && this.f2830b.equals(c1165e.f2830b);
    }

    public int hashCode() {
        return (this.f2829a.hashCode() * 31) + this.f2830b.hashCode();
    }

    public String toString() {
        return String.valueOf(this.f2829a.mo3828d()) + Config.TRACE_TODAY_VISIT_SPLIT + this.f2830b;
    }
}
