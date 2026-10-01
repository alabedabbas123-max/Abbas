package com.a.b.f;

import com.a.b.e.b.ClassU;
import com.a.b.e.b.ClassX;
import com.a.b.e.b.ClassZ;

public abstract class Abstractag {
    public abstract int mo5078a();

    public abstract ClassU mo5080a(ClassU c1194u);

    public final ClassX m5184a(ClassX c1197x) {
        int iD_ = c1197x.m5476d_();
        ClassX c1197x2 = new ClassX(iD_);
        for (int i = 0; i < iD_; i++) {
            c1197x2.m4915a(i, mo5080a(c1197x.m4916b(i)));
        }
        c1197x2.mo3944c_();
        return c1197x2.equals(c1197x) ? c1197x : c1197x2;
    }

    public final ClassZ m5185a(ClassZ c1199z) {
        int iM4933b = c1199z.m4933b();
        ClassZ c1199z2 = new ClassZ(mo5078a());
        for (int i = 0; i < iM4933b; i++) {
            ClassU c1194uM4928a = c1199z.m4928a(i);
            if (c1194uM4928a != null) {
                c1199z2.m4938d(mo5080a(c1194uM4928a));
            }
        }
        c1199z2.mo3944c_();
        return c1199z2.equals(c1199z) ? c1199z : c1199z2;
    }
}
