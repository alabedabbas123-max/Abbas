package com.a.b.c.c;

import com.a.a.ClassE;
import com.a.b.e.b.ClassA;
import com.a.b.e.c.ClassN;
import com.a.b.g.ClassK;
import com.a.b.g.Interfacea;

public final class ClassW extends Abstractx implements Comparable {

    private final ClassN f2526a;

    public ClassW(ClassN c1221n, int i) {
        super(i);
        if (c1221n == null) {
            throw new NullPointerException("field == null");
        }
        this.f2526a = c1221n;
    }

    @Override
    public int mo4691a(ClassT c1113t, Interfacea interfaceC1303a, int i, int i2) {
        int iM4481b = c1113t.m4682l().m4481b(this.f2526a);
        int i3 = iM4481b - i;
        int iB = m4695b();
        if (interfaceC1303a.mo5405a()) {
            interfaceC1303a.mo5403a(0, String.format("  [%x] %s", Integer.valueOf(i2), this.f2526a.mo3828d()));
            interfaceC1303a.mo5403a(ClassE.m3762a(i3), "    field_idx:    " + ClassK.m5480a(iM4481b));
            interfaceC1303a.mo5403a(ClassE.m3762a(iB), "    access_flags: " + ClassA.m4729c(iB));
        }
        interfaceC1303a.mo5458e(i3);
        interfaceC1303a.mo5458e(iB);
        return iM4481b;
    }

    @Override
    public int compareTo(ClassW c1116w) {
        return this.f2526a.compareTo(c1116w.f2526a);
    }

    public ClassN m4693a() {
        return this.f2526a;
    }

    public void m4694a(ClassT c1113t) {
        c1113t.m4682l().m4478a(this.f2526a);
    }

    @Override
    public String mo3828d() {
        return this.f2526a.mo3828d();
    }

    public boolean equals(Object obj) {
        return (obj instanceof ClassW) && compareTo((ClassW) obj) == 0;
    }

    public int hashCode() {
        return this.f2526a.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(getClass().getName());
        sb.append('{');
        sb.append(ClassK.m5485c(m4695b()));
        sb.append(' ');
        sb.append(this.f2526a);
        sb.append('}');
        return sb.toString();
    }
}
