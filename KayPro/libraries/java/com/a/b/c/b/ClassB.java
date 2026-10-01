package com.a.b.c.b;

import com.a.b.e.b.ab;
import com.a.b.e.b.ad;
import com.a.b.e.b.ClassB;
import com.a.b.e.b.ClassD;

public final class ClassB {

    private final ClassH[] f2057a;

    private final ClassH[] f2058b;

    private final ClassH[] f2059c;

    public ClassB(ab c1168ab) {
        int iJ = c1168ab.m4746a().m5515j();
        this.f2057a = new ClassH[iJ];
        this.f2058b = new ClassH[iJ];
        this.f2059c = new ClassH[iJ];
        m4330a(c1168ab);
    }

    private void m4330a(ab c1168ab) {
        ClassD c1177dM4746a = c1168ab.m4746a();
        int iD_ = c1177dM4746a.m5476d_();
        for (int i = 0; i < iD_; i++) {
            ClassB c1175bM4821a = c1177dM4746a.m4821a(i);
            int iMo3961a = c1175bM4821a.mo3961a();
            this.f2057a[iMo3961a] = new ClassH(c1175bM4821a.m4813b().m4847a(0).m4841g());
            ad c1170adM4841g = c1175bM4821a.m4818g().m4841g();
            this.f2058b[iMo3961a] = new ClassH(c1170adM4841g);
            this.f2059c[iMo3961a] = new ClassH(c1170adM4841g);
        }
    }

    public ClassH m4331a(int i) {
        return this.f2057a[i];
    }

    public ClassH m4332a(ClassB c1175b) {
        return this.f2057a[c1175b.mo3961a()];
    }

    public ClassH m4333b(ClassB c1175b) {
        return this.f2058b[c1175b.mo3961a()];
    }

    public ClassH m4334c(ClassB c1175b) {
        return this.f2059c[c1175b.mo3961a()];
    }
}
