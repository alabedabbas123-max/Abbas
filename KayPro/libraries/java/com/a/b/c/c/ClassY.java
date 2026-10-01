package com.a.b.c.c;

import com.a.a.ClassE;
import com.a.b.c.b.ClassJ;
import com.a.b.e.b.ClassA;
import com.a.b.e.c.Abstractf;
import com.a.b.e.c.ClassZ;
import com.a.b.e.d.Interfacee;
import com.a.b.g.ClassK;
import com.a.b.g.Interfacea;

public final class ClassY extends Abstractx implements Comparable {

    private final ClassZ f2528a;

    private final ClassN f2529b;

    public ClassY(ClassZ c1233z, int i, ClassJ c1042j, Interfacee interfaceC1238e) {
        super(i);
        if (c1233z == null) {
            throw new NullPointerException("method == null");
        }
        this.f2528a = c1233z;
        if (c1042j == null) {
            this.f2529b = null;
        } else {
            this.f2529b = new ClassN(c1233z, c1042j, (i & 8) != 0, interfaceC1238e);
        }
    }

    @Override
    public int mo4691a(ClassT c1113t, Interfacea interfaceC1303a, int i, int i2) {
        int iM4508b = c1113t.m4683m().m4508b(this.f2528a);
        int i3 = iM4508b - i;
        int iB = m4695b();
        int iM4519b = Abstractat.m4519b(this.f2529b);
        if ((iM4519b != 0) != ((iB & 1280) == 0)) {
            throw new UnsupportedOperationException("code vs. access_flags mismatch");
        }
        if (interfaceC1303a.mo5405a()) {
            interfaceC1303a.mo5403a(0, String.format("  [%x] %s", Integer.valueOf(i2), this.f2528a.mo3828d()));
            interfaceC1303a.mo5403a(ClassE.m3762a(i3), "    method_idx:   " + ClassK.m5480a(iM4508b));
            interfaceC1303a.mo5403a(ClassE.m3762a(iB), "    access_flags: " + ClassA.m4730d(iB));
            interfaceC1303a.mo5403a(ClassE.m3762a(iM4519b), "    code_off:     " + ClassK.m5480a(iM4519b));
        }
        interfaceC1303a.mo5458e(i3);
        interfaceC1303a.mo5458e(iB);
        interfaceC1303a.mo5458e(iM4519b);
        return iM4508b;
    }

    @Override
    public int compareTo(ClassY c1118y) {
        return this.f2528a.compareTo(c1118y.f2528a);
    }

    public void m4697a(ClassT c1113t) {
        ap c1075apM4683m = c1113t.m4683m();
        aq c1076aqM4674d = c1113t.m4674d();
        c1075apM4683m.m4506a((Abstractf) this.f2528a);
        if (this.f2529b != null) {
            c1076aqM4674d.m4511a((Abstractat) this.f2529b);
        }
    }

    @Override
    public final String mo3828d() {
        return this.f2528a.mo3828d();
    }

    public boolean equals(Object obj) {
        return (obj instanceof ClassY) && compareTo((ClassY) obj) == 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(getClass().getName());
        sb.append('{');
        sb.append(ClassK.m5485c(m4695b()));
        sb.append(' ');
        sb.append(this.f2528a);
        if (this.f2529b != null) {
            sb.append(' ');
            sb.append(this.f2529b);
        }
        sb.append('}');
        return sb.toString();
    }
}
