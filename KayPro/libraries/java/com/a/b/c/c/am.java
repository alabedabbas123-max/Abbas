package com.a.b.c.c;

import com.a.b.e.c.Abstracta;
import com.a.b.e.c.Abstractf;
import com.a.b.e.c.ClassN;
import com.a.b.e.c.ClassQ;
import com.a.b.e.c.ClassY;
import com.a.b.g.ClassK;
import com.a.b.g.Interfacea;

public final class am extends Abstractaf {

    private final int f2382a = 8;

    private final ClassY f2383b;

    public am(ClassY c1232y) {
        this.f2383b = c1232y;
    }

    private int m4500b(ClassT c1113t) {
        Abstracta abstractC1200aM5028i = this.f2383b.m5028i();
        if (this.f2383b.m5030k()) {
            return c1113t.m4682l().m4481b((ClassN) abstractC1200aM5028i);
        }
        if (!this.f2383b.m5031l()) {
            throw new IllegalStateException("Unhandled invocation type");
        }
        if (abstractC1200aM5028i instanceof ClassQ) {
            abstractC1200aM5028i = ((ClassQ) abstractC1200aM5028i).m5003m();
        }
        return c1113t.m4683m().m4508b((Abstractf) abstractC1200aM5028i);
    }

    @Override
    public Enumah mo4469a() {
        return Enumah.TYPE_METHOD_HANDLE_ITEM;
    }

    @Override
    public void mo4471a(ClassT c1113t) {
        c1113t.m4684n().m4502a(this.f2383b);
    }

    @Override
    public void mo4483a(ClassT c1113t, Interfacea interfaceC1303a) {
        int iM4500b = m4500b(c1113t);
        int iM5029j = this.f2383b.m5029j();
        if (interfaceC1303a.mo5405a()) {
            interfaceC1303a.mo5403a(0, String.valueOf(m4490h()) + ' ' + this.f2383b.toString());
            interfaceC1303a.mo5403a(2, "type:     " + ClassK.m5485c(iM5029j) + (" // " + ClassY.m5027c(iM5029j)));
            interfaceC1303a.mo5403a(2, "reserved: " + ClassK.m5485c(0));
            String str = " // " + this.f2383b.m5028i().toString();
            if (this.f2383b.m5030k()) {
                interfaceC1303a.mo5403a(2, "fieldId:  " + ClassK.m5485c(iM4500b) + str);
            } else {
                interfaceC1303a.mo5403a(2, "methodId: " + ClassK.m5485c(iM4500b) + str);
            }
            interfaceC1303a.mo5403a(2, "reserved: " + ClassK.m5485c(0));
        }
        interfaceC1303a.mo5456c(iM5029j);
        interfaceC1303a.mo5456c(0);
        interfaceC1303a.mo5456c(m4500b(c1113t));
        interfaceC1303a.mo5456c(0);
    }

    @Override
    public int mo4484e_() {
        return 8;
    }
}
