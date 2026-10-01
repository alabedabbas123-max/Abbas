package com.a.b.c.c;

import com.a.b.e.c.Abstractx;
import com.a.b.e.c.aa;
import com.a.b.g.ClassK;
import com.a.b.g.Interfacea;

public abstract class Abstractaj extends Abstractae {

    private final Abstractx f2379a;

    public Abstractaj(Abstractx abstractC1231x) {
        super(abstractC1231x.m5022n());
        this.f2379a = abstractC1231x;
    }

    @Override
    public void mo4471a(ClassT c1113t) {
        super.mo4471a(c1113t);
        c1113t.m4677g().m4558a(m4495j().m5023o().m4944a());
    }

    @Override
    public final void mo4483a(ClassT c1113t, Interfacea interfaceC1303a) {
        be c1091beM4680j = c1113t.m4680j();
        bc c1089bcM4677g = c1113t.m4677g();
        aa c1201aaM5023o = this.f2379a.m5023o();
        int iM4564b = c1091beM4680j.m4564b(m4486e());
        int iM4559b = c1089bcM4677g.m4559b(c1201aaM5023o.m4944a());
        int iMo4475b = mo4475b(c1113t);
        if (interfaceC1303a.mo5405a()) {
            interfaceC1303a.mo5403a(0, String.valueOf(m4490h()) + ' ' + this.f2379a.mo3828d());
            interfaceC1303a.mo5403a(2, "  class_idx: " + ClassK.m5485c(iM4564b));
            interfaceC1303a.mo5403a(2, String.format("  %-10s %s", String.valueOf(mo4477d()) + ':', ClassK.m5485c(iMo4475b)));
            interfaceC1303a.mo5403a(4, "  name_idx:  " + ClassK.m5480a(iM4559b));
        }
        interfaceC1303a.mo5456c(iM4564b);
        interfaceC1303a.mo5456c(iMo4475b);
        interfaceC1303a.mo5457d(iM4559b);
    }

    protected abstract int mo4475b(ClassT c1113t);

    protected abstract String mo4477d();

    @Override
    public int mo4484e_() {
        return 8;
    }

    public final Abstractx m4495j() {
        return this.f2379a;
    }
}
