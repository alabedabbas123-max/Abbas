package com.a.b.c.c;

import com.a.a.ClassD;
import com.a.b.e.a.ClassA;
import com.a.b.e.a.ClassE;
import com.a.b.e.c.Abstracta;
import com.a.b.e.c.Abstractv;
import com.a.b.e.c.ab;
import com.a.b.e.c.ac;
import com.a.b.e.c.ad;
import com.a.b.e.c.ae;
import com.a.b.e.c.ClassC;
import com.a.b.e.c.ClassD;
import com.a.b.e.c.ClassE;
import com.a.b.e.c.ClassG;
import com.a.b.e.c.ClassH;
import com.a.b.e.c.ClassK;
import com.a.b.e.c.ClassL;
import com.a.b.e.c.ClassM;
import com.a.b.e.c.ClassN;
import com.a.b.e.c.ClassO;
import com.a.b.e.c.ClassP;
import com.a.b.e.c.ClassS;
import com.a.b.e.c.ClassW;
import com.a.b.e.c.ClassY;
import com.a.b.e.c.ClassZ;
import com.a.b.g.ClassK;
import com.a.b.g.Interfacea;
import java.util.Collection;

public final class bi {

    private final ClassT f2426a;

    private final Interfacea f2427b;

    public bi(ClassT c1113t, Interfacea interfaceC1303a) {
        if (c1113t == null) {
            throw new NullPointerException("file == null");
        }
        if (interfaceC1303a == null) {
            throw new NullPointerException("out == null");
        }
        this.f2426a = c1113t;
        this.f2427b = interfaceC1303a;
    }

    public static void m4572a(ClassT c1113t, ClassA c1161a) {
        be c1091beM4680j = c1113t.m4680j();
        bc c1089bcM4677g = c1113t.m4677g();
        c1091beM4680j.m4562a(c1161a.m4709b());
        for (ClassE c1165e : c1161a.m4712f()) {
            c1089bcM4677g.m4558a(c1165e.m4724a());
            m4573a(c1113t, c1165e.m4725b());
        }
    }

    public static void m4573a(ClassT c1113t, Abstracta abstractC1200a) {
        if (abstractC1200a instanceof ClassC) {
            m4572a(c1113t, ((ClassC) abstractC1200a).m4976a());
            return;
        }
        if (!(abstractC1200a instanceof ClassD)) {
            c1113t.m4669a(abstractC1200a);
            return;
        }
        ClassE c1212eM4977a = ((ClassD) abstractC1200a).m4977a();
        int iD_ = c1212eM4977a.m5476d_();
        for (int i = 0; i < iD_; i++) {
            m4573a(c1113t, c1212eM4977a.m4979a(i));
        }
    }

    public static String m4574b(Abstracta abstractC1200a) {
        if (m4575c(abstractC1200a) == 30) {
            return "null";
        }
        return abstractC1200a.mo4943h() + ' ' + abstractC1200a.mo3828d();
    }

    private static int m4575c(Abstracta abstractC1200a) {
        if (abstractC1200a instanceof ClassH) {
            return 0;
        }
        if (abstractC1200a instanceof ac) {
            return 2;
        }
        if (abstractC1200a instanceof ClassK) {
            return 3;
        }
        if (abstractC1200a instanceof ClassP) {
            return 4;
        }
        if (abstractC1200a instanceof ClassW) {
            return 6;
        }
        if (abstractC1200a instanceof ClassO) {
            return 16;
        }
        if (abstractC1200a instanceof ClassL) {
            return 17;
        }
        if (abstractC1200a instanceof ab) {
            return 21;
        }
        if (abstractC1200a instanceof ClassY) {
            return 22;
        }
        if (abstractC1200a instanceof ad) {
            return 23;
        }
        if (abstractC1200a instanceof ae) {
            return 24;
        }
        if (abstractC1200a instanceof ClassN) {
            return 25;
        }
        if (abstractC1200a instanceof ClassZ) {
            return 26;
        }
        if (abstractC1200a instanceof ClassM) {
            return 27;
        }
        if (abstractC1200a instanceof ClassD) {
            return 28;
        }
        if (abstractC1200a instanceof ClassC) {
            return 29;
        }
        if (abstractC1200a instanceof ClassS) {
            return 30;
        }
        if (abstractC1200a instanceof ClassG) {
            return 31;
        }
        throw new RuntimeException("Shouldn't happen");
    }

    public void m4576a(ClassA c1161a, boolean z) {
        int i;
        boolean z2 = z && this.f2427b.mo5405a();
        bc c1089bcM4677g = this.f2426a.m4677g();
        be c1091beM4680j = this.f2426a.m4680j();
        ae c1205aeM4709b = c1161a.m4709b();
        int iM4564b = c1091beM4680j.m4564b(c1205aeM4709b);
        if (z2) {
            this.f2427b.mo5404a("  type_idx: " + ClassK.m5480a(iM4564b) + " // " + c1205aeM4709b.mo3828d());
        }
        this.f2427b.mo5458e(c1091beM4680j.m4564b(c1161a.m4709b()));
        Collection<ClassE> collectionM4712f = c1161a.m4712f();
        int size = collectionM4712f.size();
        if (z2) {
            this.f2427b.mo5404a("  size: " + ClassK.m5480a(size));
        }
        this.f2427b.mo5458e(size);
        int i2 = 0;
        for (ClassE c1165e : collectionM4712f) {
            ad c1204adM4724a = c1165e.m4724a();
            int iM4559b = c1089bcM4677g.m4559b(c1204adM4724a);
            Abstracta abstractC1200aM4725b = c1165e.m4725b();
            if (z2) {
                this.f2427b.mo5403a(0, "  elements[" + i2 + "]:");
                i = i2 + 1;
                this.f2427b.mo5404a("    name_idx: " + ClassK.m5480a(iM4559b) + " // " + c1204adM4724a.mo3828d());
            } else {
                i = i2;
            }
            this.f2427b.mo5458e(iM4559b);
            if (z2) {
                this.f2427b.mo5404a("    value: " + m4574b(abstractC1200aM4725b));
            }
            m4577a(abstractC1200aM4725b);
            i2 = i;
        }
        if (z2) {
            this.f2427b.mo5407c();
        }
    }

    public void m4577a(Abstracta abstractC1200a) {
        int iM4575c = m4575c(abstractC1200a);
        switch (iM4575c) {
            case 0:
            case 2:
            case 4:
            case 6:
                ClassD.m3759a(this.f2427b, iM4575c, ((Abstractv) abstractC1200a).mo5017k());
                return;
            case 1:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 18:
            case 19:
            case 20:
            default:
                throw new RuntimeException("Shouldn't happen");
            case 3:
                ClassD.m3760b(this.f2427b, iM4575c, ((Abstractv) abstractC1200a).mo5017k());
                return;
            case 16:
                ClassD.m3761c(this.f2427b, iM4575c, ((ClassO) abstractC1200a).mo5017k() << 32);
                return;
            case 17:
                ClassD.m3761c(this.f2427b, iM4575c, ((ClassL) abstractC1200a).mo5017k());
                return;
            case 21:
                ClassD.m3760b(this.f2427b, iM4575c, this.f2426a.m4681k().m4533b(((ab) abstractC1200a).m4950i()));
                return;
            case 22:
                ClassD.m3760b(this.f2427b, iM4575c, this.f2426a.m4684n().m4503b((ClassY) abstractC1200a));
                return;
            case 23:
                ClassD.m3760b(this.f2427b, iM4575c, this.f2426a.m4677g().m4559b((ad) abstractC1200a));
                return;
            case 24:
                ClassD.m3760b(this.f2427b, iM4575c, this.f2426a.m4680j().m4564b((ae) abstractC1200a));
                return;
            case 25:
                ClassD.m3760b(this.f2427b, iM4575c, this.f2426a.m4682l().m4481b((ClassN) abstractC1200a));
                return;
            case 26:
                ClassD.m3760b(this.f2427b, iM4575c, this.f2426a.m4683m().m4508b((ClassZ) abstractC1200a));
                return;
            case 27:
                ClassD.m3760b(this.f2427b, iM4575c, this.f2426a.m4682l().m4481b(((ClassM) abstractC1200a).m4998i()));
                return;
            case 28:
                this.f2427b.mo3755a(iM4575c);
                m4578a((ClassD) abstractC1200a, false);
                return;
            case 29:
                this.f2427b.mo3755a(iM4575c);
                m4576a(((ClassC) abstractC1200a).m4976a(), false);
                return;
            case 30:
                this.f2427b.mo3755a(iM4575c);
                return;
            case 31:
                this.f2427b.mo3755a(iM4575c | (((ClassG) abstractC1200a).mo5016j() << 5));
                return;
        }
    }

    public void m4578a(ClassD c1211d, boolean z) {
        boolean z2 = z && this.f2427b.mo5405a();
        ClassE c1212eM4977a = c1211d.m4977a();
        int iD_ = c1212eM4977a.m5476d_();
        if (z2) {
            this.f2427b.mo5404a("  size: " + ClassK.m5480a(iD_));
        }
        this.f2427b.mo5458e(iD_);
        for (int i = 0; i < iD_; i++) {
            Abstracta abstractC1200aM4979a = c1212eM4977a.m4979a(i);
            if (z2) {
                this.f2427b.mo5404a("  [" + Integer.toHexString(i) + "] " + m4574b(abstractC1200aM4979a));
            }
            m4577a(abstractC1200aM4979a);
        }
        if (z2) {
            this.f2427b.mo5407c();
        }
    }
}
