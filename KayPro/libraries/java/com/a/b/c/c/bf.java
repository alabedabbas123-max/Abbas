package com.a.b.c.c;

import com.a.b.e.d.ClassB;
import com.a.b.e.d.ClassC;
import com.a.b.e.d.Interfacee;
import com.a.b.g.ClassK;
import com.a.b.g.Interfacea;

public final class bf extends Abstractat {

    private final Interfacee f2423a;

    public bf(Interfacee interfaceC1238e) {
        super(4, (interfaceC1238e.mo4148d_() * 2) + 4);
        this.f2423a = interfaceC1238e;
    }

    @Override
    protected int mo4468a(Abstractat abstractC1079at) {
        return ClassB.m5050b(this.f2423a, ((bf) abstractC1079at).f2423a);
    }

    @Override
    public Enumah mo4469a() {
        return Enumah.TYPE_TYPE_LIST;
    }

    @Override
    public void mo4471a(ClassT c1113t) {
        be c1091beM4680j = c1113t.m4680j();
        int iMo4148d_ = this.f2423a.mo4148d_();
        for (int i = 0; i < iMo4148d_; i++) {
            c1091beM4680j.m4563a(this.f2423a.mo4145a(i));
        }
    }

    @Override
    protected void mo4473a_(ClassT c1113t, Interfacea interfaceC1303a) {
        be c1091beM4680j = c1113t.m4680j();
        int iMo4148d_ = this.f2423a.mo4148d_();
        if (interfaceC1303a.mo5405a()) {
            interfaceC1303a.mo5403a(0, String.valueOf(m4525g()) + " type_list");
            interfaceC1303a.mo5403a(4, "  size: " + ClassK.m5480a(iMo4148d_));
            for (int i = 0; i < iMo4148d_; i++) {
                ClassC c1236cMo4145a = this.f2423a.mo4145a(i);
                interfaceC1303a.mo5403a(2, "  " + ClassK.m5485c(c1091beM4680j.m4565b(c1236cMo4145a)) + " // " + c1236cMo4145a.mo3828d());
            }
        }
        interfaceC1303a.mo5457d(iMo4148d_);
        for (int i2 = 0; i2 < iMo4148d_; i2++) {
            interfaceC1303a.mo5456c(c1091beM4680j.m4565b(this.f2423a.mo4145a(i2)));
        }
    }

    @Override
    public String mo4474b() {
        throw new RuntimeException("unsupported");
    }

    public Interfacee m4567c() {
        return this.f2423a;
    }

    public int hashCode() {
        return ClassB.m5049b(this.f2423a);
    }
}
