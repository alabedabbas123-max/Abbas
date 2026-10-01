package com.a.b.c.c;

import com.a.b.e.a.ClassD;
import com.a.b.e.c.Abstractf;
import com.a.b.e.c.ClassZ;
import com.a.b.g.ClassK;
import com.a.b.g.Interfacea;
import com.a.b.g.Interfacew;
import java.util.ArrayList;

public final class au implements Interfacew, Comparable {

    private final ClassZ f2400a;

    private final ClassD f2401b;

    private final bh f2402c;

    public au(ClassZ c1233z, ClassD c1164d, ClassT c1113t) {
        if (c1233z == null) {
            throw new NullPointerException("method == null");
        }
        if (c1164d == null) {
            throw new NullPointerException("annotationsList == null");
        }
        this.f2400a = c1233z;
        this.f2401b = c1164d;
        int iD_ = c1164d.m5476d_();
        ArrayList arrayList = new ArrayList(iD_);
        for (int i = 0; i < iD_; i++) {
            arrayList.add(new ClassD(new ClassC(c1164d.m4721a(i), c1113t)));
        }
        this.f2402c = new bh(Enumah.TYPE_ANNOTATION_SET_REF_LIST, arrayList);
    }

    @Override
    public int compareTo(au c1080au) {
        return this.f2400a.compareTo(c1080au.f2400a);
    }

    public void m4527a(ClassT c1113t) {
        ap c1075apM4683m = c1113t.m4683m();
        aq c1076aqM4674d = c1113t.m4674d();
        c1075apM4683m.m4506a((Abstractf) this.f2400a);
        c1076aqM4674d.m4511a((Abstractat) this.f2402c);
    }

    public void m4528a(ClassT c1113t, Interfacea interfaceC1303a) {
        int iM4508b = c1113t.m4683m().m4508b(this.f2400a);
        int iE = this.f2402c.m4523e();
        if (interfaceC1303a.mo5405a()) {
            interfaceC1303a.mo5403a(0, "    " + this.f2400a.mo3828d());
            interfaceC1303a.mo5403a(4, "      method_idx:      " + ClassK.m5480a(iM4508b));
            interfaceC1303a.mo5403a(4, "      annotations_off: " + ClassK.m5480a(iE));
        }
        interfaceC1303a.mo5457d(iM4508b);
        interfaceC1303a.mo5457d(iE);
    }

    @Override
    public String mo3828d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2400a.mo3828d());
        sb.append(": ");
        boolean z = true;
        for (ClassD c1097d : this.f2402c.m4571c()) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(c1097d.mo4474b());
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj instanceof au) {
            return this.f2400a.equals(((au) obj).f2400a);
        }
        return false;
    }

    public int hashCode() {
        return this.f2400a.hashCode();
    }
}
