package com.a.b.c.c;

import com.a.b.e.c.ClassN;
import com.a.b.g.ClassK;
import com.a.b.g.Interfacea;
import com.a.b.g.Interfacew;

public final class ClassZ implements Interfacew, Comparable {

    private final ClassN f2530a;

    private ClassC f2531b;

    public ClassZ(ClassN c1221n, ClassC c1096c) {
        if (c1221n == null) {
            throw new NullPointerException("field == null");
        }
        if (c1096c == null) {
            throw new NullPointerException("annotations == null");
        }
        this.f2530a = c1221n;
        this.f2531b = c1096c;
    }

    @Override
    public int compareTo(ClassZ c1119z) {
        return this.f2530a.compareTo(c1119z.f2530a);
    }

    public void m4699a(ClassT c1113t) {
        ab c1061abM4682l = c1113t.m4682l();
        aq c1076aqM4674d = c1113t.m4674d();
        c1061abM4682l.m4478a(this.f2530a);
        this.f2531b = (ClassC) c1076aqM4674d.m4514b(this.f2531b);
    }

    public void m4700a(ClassT c1113t, Interfacea interfaceC1303a) {
        int iM4481b = c1113t.m4682l().m4481b(this.f2530a);
        int iE = this.f2531b.m4523e();
        if (interfaceC1303a.mo5405a()) {
            interfaceC1303a.mo5403a(0, "    " + this.f2530a.mo3828d());
            interfaceC1303a.mo5403a(4, "      field_idx:       " + ClassK.m5480a(iM4481b));
            interfaceC1303a.mo5403a(4, "      annotations_off: " + ClassK.m5480a(iE));
        }
        interfaceC1303a.mo5457d(iM4481b);
        interfaceC1303a.mo5457d(iE);
    }

    @Override
    public String mo3828d() {
        return String.valueOf(this.f2530a.mo3828d()) + ": " + this.f2531b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ClassZ) {
            return this.f2530a.equals(((ClassZ) obj).f2530a);
        }
        return false;
    }

    public int hashCode() {
        return this.f2530a.hashCode();
    }
}
