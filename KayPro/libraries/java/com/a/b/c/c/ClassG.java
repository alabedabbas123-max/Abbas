package com.a.b.c.c;

import com.a.b.e.c.ClassI;
import com.a.b.e.c.ClassJ;
import com.a.b.g.ClassK;
import com.a.b.g.Interfacea;

public final class ClassG extends Abstractaf implements Comparable {

    final ClassJ f2446a;

    ClassI f2447b = null;

    public ClassG(ClassJ c1217j) {
        this.f2446a = c1217j;
    }

    @Override
    public Enumah mo4469a() {
        return Enumah.TYPE_CALL_SITE_ID_ITEM;
    }

    @Override
    public void mo4471a(ClassT c1113t) {
        ClassI c1216iM4994c = this.f2446a.m4994c();
        ClassH c1101hM4685o = c1113t.m4685o();
        ClassI c1102iM4597a = c1101hM4685o.m4597a(c1216iM4994c);
        if (c1102iM4597a == null) {
            aq c1076aqM4686p = c1113t.m4686p();
            c1102iM4597a = new ClassI(c1216iM4994c);
            c1076aqM4686p.m4511a((Abstractat) c1102iM4597a);
            c1101hM4685o.m4598a(c1216iM4994c, c1102iM4597a);
        }
        this.f2447b = c1102iM4597a;
    }

    @Override
    public void mo4483a(ClassT c1113t, Interfacea interfaceC1303a) {
        int iE = this.f2447b.m4523e();
        if (interfaceC1303a.mo5405a()) {
            interfaceC1303a.mo5403a(0, String.valueOf(m4490h()) + ' ' + this.f2446a.toString());
            interfaceC1303a.mo5403a(4, "call_site_off: " + ClassK.m5480a(iE));
        }
        interfaceC1303a.mo5457d(iE);
    }

    @Override
    public int compareTo(Object obj) {
        return this.f2446a.compareTo(((ClassG) obj).f2446a);
    }

    @Override
    public int mo4484e_() {
        return 4;
    }
}
