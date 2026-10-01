package com.a.b.c.c;

import com.a.b.e.c.ad;
import com.a.b.e.d.ClassA;
import com.a.b.e.d.ClassB;
import com.a.b.e.d.ClassC;
import com.a.b.g.ClassK;
import com.a.b.g.Interfacea;

public final class av extends Abstractaf {

    private final ClassA f2403a;

    private final ad f2404b;

    private bf f2405c;

    public av(ClassA c1234a) {
        if (c1234a == null) {
            throw new NullPointerException("prototype == null");
        }
        this.f2403a = c1234a;
        this.f2404b = m4530a(c1234a);
        ClassB c1235bM5042c = c1234a.m5042c();
        this.f2405c = c1235bM5042c.m5476d_() == 0 ? null : new bf(c1235bM5042c);
    }

    private static char m4529a(ClassC c1236c) {
        char cCharAt = c1236c.m5064h().charAt(0);
        if (cCharAt == '[') {
            return 'L';
        }
        return cCharAt;
    }

    private static ad m4530a(ClassA c1234a) {
        ClassB c1235bM5042c = c1234a.m5042c();
        int iD_ = c1235bM5042c.m5476d_();
        StringBuilder sb = new StringBuilder(iD_ + 1);
        sb.append(m4529a(c1234a.m5041b()));
        for (int i = 0; i < iD_; i++) {
            sb.append(m4529a(c1235bM5042c.mo4145a(i)));
        }
        return new ad(sb.toString());
    }

    @Override
    public Enumah mo4469a() {
        return Enumah.TYPE_PROTO_ID_ITEM;
    }

    @Override
    public void mo4471a(ClassT c1113t) {
        bc c1089bcM4677g = c1113t.m4677g();
        be c1091beM4680j = c1113t.m4680j();
        aq c1076aqM4675e = c1113t.m4675e();
        c1091beM4680j.m4563a(this.f2403a.m5041b());
        c1089bcM4677g.m4558a(this.f2404b);
        if (this.f2405c != null) {
            this.f2405c = (bf) c1076aqM4675e.m4514b(this.f2405c);
        }
    }

    @Override
    public void mo4483a(ClassT c1113t, Interfacea interfaceC1303a) {
        int iM4559b = c1113t.m4677g().m4559b(this.f2404b);
        int iM4565b = c1113t.m4680j().m4565b(this.f2403a.m5041b());
        int iM4519b = Abstractat.m4519b(this.f2405c);
        if (interfaceC1303a.mo5405a()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f2403a.m5041b().mo3828d());
            sb.append(" proto(");
            ClassB c1235bM5042c = this.f2403a.m5042c();
            int iD_ = c1235bM5042c.m5476d_();
            for (int i = 0; i < iD_; i++) {
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(c1235bM5042c.mo4145a(i).mo3828d());
            }
            sb.append(")");
            interfaceC1303a.mo5403a(0, String.valueOf(m4490h()) + ' ' + sb.toString());
            interfaceC1303a.mo5403a(4, "  shorty_idx:      " + ClassK.m5480a(iM4559b) + " // " + this.f2404b.m4957i());
            interfaceC1303a.mo5403a(4, "  return_type_idx: " + ClassK.m5480a(iM4565b) + " // " + this.f2403a.m5041b().mo3828d());
            interfaceC1303a.mo5403a(4, "  parameters_off:  " + ClassK.m5480a(iM4519b));
        }
        interfaceC1303a.mo5457d(iM4559b);
        interfaceC1303a.mo5457d(iM4565b);
        interfaceC1303a.mo5457d(iM4519b);
    }

    @Override
    public int mo4484e_() {
        return 12;
    }
}
