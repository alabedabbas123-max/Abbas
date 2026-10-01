package com.a.b.c.c;

import com.a.b.e.c.Abstractf;
import com.a.b.e.c.ClassZ;
import com.a.b.g.ClassK;
import com.a.b.g.Interfacea;
import com.a.b.g.Interfacew;

public final class al implements Interfacew, Comparable {

    private final ClassZ f2380a;

    private ClassC f2381b;

    public al(ClassZ c1233z, ClassC c1096c) {
        if (c1233z == null) {
            throw new NullPointerException("method == null");
        }
        if (c1096c == null) {
            throw new NullPointerException("annotations == null");
        }
        this.f2380a = c1233z;
        this.f2381b = c1096c;
    }

    @Override
    public int compareTo(al c1071al) {
        return this.f2380a.compareTo(c1071al.f2380a);
    }

    public void m4498a(ClassT c1113t) {
        ap c1075apM4683m = c1113t.m4683m();
        aq c1076aqM4674d = c1113t.m4674d();
        c1075apM4683m.m4506a((Abstractf) this.f2380a);
        this.f2381b = (ClassC) c1076aqM4674d.m4514b(this.f2381b);
    }

    public void m4499a(ClassT c1113t, Interfacea interfaceC1303a) {
        int iM4508b = c1113t.m4683m().m4508b(this.f2380a);
        int iE = this.f2381b.m4523e();
        if (interfaceC1303a.mo5405a()) {
            interfaceC1303a.mo5403a(0, "    " + this.f2380a.mo3828d());
            interfaceC1303a.mo5403a(4, "      method_idx:      " + ClassK.m5480a(iM4508b));
            interfaceC1303a.mo5403a(4, "      annotations_off: " + ClassK.m5480a(iE));
        }
        interfaceC1303a.mo5457d(iM4508b);
        interfaceC1303a.mo5457d(iE);
    }

    @Override
    public String mo3828d() {
        return String.valueOf(this.f2380a.mo3828d()) + ": " + this.f2381b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof al) {
            return this.f2380a.equals(((al) obj).f2380a);
        }
        return false;
    }

    public int hashCode() {
        return this.f2380a.hashCode();
    }
}
