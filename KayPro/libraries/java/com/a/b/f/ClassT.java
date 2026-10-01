package com.a.b.f;

import com.a.b.e.b.aa;
import com.a.b.e.b.ClassT;
import com.a.b.e.b.ClassX;
import com.a.b.e.b.Interfaceah;

class ClassT implements Interfaceao {

    final ClassS f3452a;

    private final Interfaceah f3453b;

    ClassT(ClassS c1295s, Interfaceah interfaceC1174ah) {
        this.f3452a = c1295s;
        this.f3453b = interfaceC1174ah;
    }

    @Override
    public void mo5119a(ac c1257ac) {
    }

    @Override
    public void mo5120a(ClassZ c1302z) {
    }

    @Override
    public void mo5121b(ClassZ c1302z) {
        aa c1167aaM4840f = c1302z.mo5174f().m4840f();
        ClassX c1197xMo5171b = c1302z.mo5171b();
        if (!this.f3452a.m5382a(c1302z) && c1197xMo5171b.m5476d_() == 2) {
            if (c1167aaM4840f.m4740d() == 4) {
                if (ClassS.m5383b(c1197xMo5171b.m4916b(0))) {
                    this.f3452a.m5379a(c1302z, c1197xMo5171b.m4921f(), ClassT.m4875b(c1167aaM4840f.m4737a()), null);
                    return;
                } else {
                    if (ClassS.m5383b(c1197xMo5171b.m4916b(1))) {
                        this.f3452a.m5379a(c1302z, c1197xMo5171b.m4922g(), c1167aaM4840f.m4737a(), null);
                        return;
                    }
                    return;
                }
            }
            if (this.f3453b.mo4811a(c1167aaM4840f, c1197xMo5171b.m4916b(0), c1197xMo5171b.m4916b(1))) {
                c1302z.m5402h();
            } else if (c1167aaM4840f.m4742f() && this.f3453b.mo4811a(c1167aaM4840f, c1197xMo5171b.m4916b(1), c1197xMo5171b.m4916b(0))) {
                c1302z.m5401a(ClassX.m4910a(c1197xMo5171b.m4916b(1), c1197xMo5171b.m4916b(0)));
                c1302z.m5402h();
            }
        }
    }
}
