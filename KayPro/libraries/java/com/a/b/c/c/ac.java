package com.a.b.c.c;

import com.a.b.e.c.ad;
import com.a.b.g.ClassK;
import com.a.b.g.Interfacea;
import com.almlkaide.kaypro.android.dex.DexFormat;

public final class ac extends Abstractaf {
    @Override
    public Enumah mo4469a() {
        return Enumah.TYPE_HEADER_ITEM;
    }

    @Override
    public void mo4471a(ClassT c1113t) {
    }

    @Override
    public void mo4483a(ClassT c1113t, Interfacea interfaceC1303a) {
        int iH = c1113t.m4676f().m4542h();
        Abstractax abstractC1083axM4687q = c1113t.m4687q();
        Abstractax abstractC1083axM4688r = c1113t.m4688r();
        int iM4542h = abstractC1083axM4687q.m4542h();
        int iM4542h2 = (abstractC1083axM4688r.m4542h() + abstractC1083axM4688r.mo4517f_()) - iM4542h;
        String strM4202a = c1113t.m4667a().m4202a();
        if (interfaceC1303a.mo5405a()) {
            interfaceC1303a.mo5403a(8, "magic: " + new ad(strM4202a).m4957i());
            interfaceC1303a.mo5403a(4, "checksum");
            interfaceC1303a.mo5403a(20, "signature");
            interfaceC1303a.mo5403a(4, "file_size:       " + ClassK.m5480a(c1113t.m4671b()));
            interfaceC1303a.mo5403a(4, "header_size:     " + ClassK.m5480a(112));
            interfaceC1303a.mo5403a(4, "endian_tag:      " + ClassK.m5480a(DexFormat.ENDIAN_TAG));
            interfaceC1303a.mo5403a(4, "link_size:       0");
            interfaceC1303a.mo5403a(4, "link_off:        0");
            interfaceC1303a.mo5403a(4, "map_off:         " + ClassK.m5480a(iH));
        }
        for (int i = 0; i < 8; i++) {
            interfaceC1303a.mo3755a((int) strM4202a.charAt(i));
        }
        interfaceC1303a.mo5463g(24);
        interfaceC1303a.mo5457d(c1113t.m4671b());
        interfaceC1303a.mo5457d(112);
        interfaceC1303a.mo5457d(DexFormat.ENDIAN_TAG);
        interfaceC1303a.mo5463g(8);
        interfaceC1303a.mo5457d(iH);
        c1113t.m4677g().m4560b(interfaceC1303a);
        c1113t.m4680j().m4566b(interfaceC1303a);
        c1113t.m4681k().m4534b(interfaceC1303a);
        c1113t.m4682l().m4480a(interfaceC1303a);
        c1113t.m4683m().m4507a(interfaceC1303a);
        c1113t.m4678h().m4631a(interfaceC1303a);
        if (interfaceC1303a.mo5405a()) {
            interfaceC1303a.mo5403a(4, "data_size:       " + ClassK.m5480a(iM4542h2));
            interfaceC1303a.mo5403a(4, "data_off:        " + ClassK.m5480a(iM4542h));
        }
        interfaceC1303a.mo5457d(iM4542h2);
        interfaceC1303a.mo5457d(iM4542h);
    }

    @Override
    public int mo4484e_() {
        return 112;
    }
}
