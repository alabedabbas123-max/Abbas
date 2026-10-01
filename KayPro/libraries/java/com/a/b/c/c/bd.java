package com.a.b.c.c;

import com.a.b.e.c.ad;
import com.a.b.e.c.ae;
import com.a.b.g.ClassK;
import com.a.b.g.Interfacea;

public final class bd extends Abstractae {
    public bd(ae c1205ae) {
        super(c1205ae);
    }

    @Override
    public Enumah mo4469a() {
        return Enumah.TYPE_TYPE_ID_ITEM;
    }

    @Override
    public void mo4471a(ClassT c1113t) {
        c1113t.m4677g().m4558a(m4486e().m4967j());
    }

    @Override
    public void mo4483a(ClassT c1113t, Interfacea interfaceC1303a) {
        ad c1204adM4967j = m4486e().m4967j();
        int iM4559b = c1113t.m4677g().m4559b(c1204adM4967j);
        if (interfaceC1303a.mo5405a()) {
            interfaceC1303a.mo5403a(0, String.valueOf(m4490h()) + ' ' + c1204adM4967j.mo3828d());
            interfaceC1303a.mo5403a(4, "  descriptor_idx: " + ClassK.m5480a(iM4559b));
        }
        interfaceC1303a.mo5457d(iM4559b);
    }

    @Override
    public int mo4484e_() {
        return 4;
    }
}
