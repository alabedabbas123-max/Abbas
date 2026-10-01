package com.a.b.c.c;

import com.a.b.e.a.ClassC;
import com.a.b.e.a.ClassD;
import com.a.b.e.b.ClassA;
import com.a.b.e.c.Abstracta;
import com.a.b.e.c.ad;
import com.a.b.e.c.ae;
import com.a.b.e.c.ClassD;
import com.a.b.e.c.ClassN;
import com.a.b.e.c.ClassZ;
import com.a.b.e.d.ClassB;
import com.a.b.e.d.Interfacee;
import com.a.b.g.ClassK;
import com.a.b.g.Interfacea;

public final class ClassL extends Abstractaf {

    private final ae f2465a;

    private final int f2466b;

    private final ae f2467c;

    private bf f2468d;

    private final ad f2469e;

    private final ClassK f2470f;

    private ClassV f2471g;

    private ClassF f2472h;

    public ClassL(ae c1205ae, int i, ae c1205ae2, Interfacee interfaceC1238e, ad c1204ad) {
        if (c1205ae == null) {
            throw new NullPointerException("thisClass == null");
        }
        if (interfaceC1238e == null) {
            throw new NullPointerException("interfaces == null");
        }
        this.f2465a = c1205ae;
        this.f2466b = i;
        this.f2467c = c1205ae2;
        this.f2468d = interfaceC1238e.mo4148d_() == 0 ? null : new bf(interfaceC1238e);
        this.f2469e = c1204ad;
        this.f2470f = new ClassK(c1205ae);
        this.f2471g = null;
        this.f2472h = new ClassF();
    }

    @Override
    public Enumah mo4469a() {
        return Enumah.TYPE_CLASS_DEF_ITEM;
    }

    @Override
    public void mo4471a(ClassT c1113t) {
        be c1091beM4680j = c1113t.m4680j();
        aq c1076aqM4686p = c1113t.m4686p();
        aq c1076aqM4674d = c1113t.m4674d();
        aq c1076aqM4675e = c1113t.m4675e();
        bc c1089bcM4677g = c1113t.m4677g();
        c1091beM4680j.m4562a(this.f2465a);
        if (!this.f2470f.m4616c()) {
            c1113t.m4679i().m4511a((Abstractat) this.f2470f);
            ClassD c1211dM4617d = this.f2470f.m4617d();
            if (c1211dM4617d != null) {
                this.f2471g = (ClassV) c1076aqM4686p.m4514b(new ClassV(c1211dM4617d));
            }
        }
        if (this.f2467c != null) {
            c1091beM4680j.m4562a(this.f2467c);
        }
        if (this.f2468d != null) {
            this.f2468d = (bf) c1076aqM4675e.m4514b(this.f2468d);
        }
        if (this.f2469e != null) {
            c1089bcM4677g.m4558a(this.f2469e);
        }
        if (this.f2472h.m4594c()) {
            return;
        }
        if (this.f2472h.m4595d()) {
            this.f2472h = (ClassF) c1076aqM4674d.m4514b(this.f2472h);
        } else {
            c1076aqM4674d.m4511a((Abstractat) this.f2472h);
        }
    }

    @Override
    public void mo4483a(ClassT c1113t, Interfacea interfaceC1303a) {
        boolean zMo5405a = interfaceC1303a.mo5405a();
        be c1091beM4680j = c1113t.m4680j();
        int iM4564b = c1091beM4680j.m4564b(this.f2465a);
        int iM4564b2 = this.f2467c == null ? -1 : c1091beM4680j.m4564b(this.f2467c);
        int iM4519b = Abstractat.m4519b(this.f2468d);
        int iE = this.f2472h.m4594c() ? 0 : this.f2472h.m4523e();
        int iM4559b = this.f2469e == null ? -1 : c1113t.m4677g().m4559b(this.f2469e);
        int iE2 = this.f2470f.m4616c() ? 0 : this.f2470f.m4523e();
        int iM4519b2 = Abstractat.m4519b(this.f2471g);
        if (zMo5405a) {
            interfaceC1303a.mo5403a(0, String.valueOf(m4490h()) + ' ' + this.f2465a.mo3828d());
            interfaceC1303a.mo5403a(4, "  class_idx:           " + ClassK.m5480a(iM4564b));
            interfaceC1303a.mo5403a(4, "  access_flags:        " + ClassA.m4726a(this.f2466b));
            interfaceC1303a.mo5403a(4, "  superclass_idx:      " + ClassK.m5480a(iM4564b2) + " // " + (this.f2467c == null ? "<none>" : this.f2467c.mo3828d()));
            interfaceC1303a.mo5403a(4, "  interfaces_off:      " + ClassK.m5480a(iM4519b));
            if (iM4519b != 0) {
                Interfacee interfaceC1238eM4567c = this.f2468d.m4567c();
                int iMo4148d_ = interfaceC1238eM4567c.mo4148d_();
                for (int i = 0; i < iMo4148d_; i++) {
                    interfaceC1303a.mo5403a(0, "    " + interfaceC1238eM4567c.mo4145a(i).mo3828d());
                }
            }
            interfaceC1303a.mo5403a(4, "  source_file_idx:     " + ClassK.m5480a(iM4559b) + " // " + (this.f2469e == null ? "<none>" : this.f2469e.mo3828d()));
            interfaceC1303a.mo5403a(4, "  annotations_off:     " + ClassK.m5480a(iE));
            interfaceC1303a.mo5403a(4, "  class_data_off:      " + ClassK.m5480a(iE2));
            interfaceC1303a.mo5403a(4, "  static_values_off:   " + ClassK.m5480a(iM4519b2));
        }
        interfaceC1303a.mo5457d(iM4564b);
        interfaceC1303a.mo5457d(this.f2466b);
        interfaceC1303a.mo5457d(iM4564b2);
        interfaceC1303a.mo5457d(iM4519b);
        interfaceC1303a.mo5457d(iM4559b);
        interfaceC1303a.mo5457d(iE);
        interfaceC1303a.mo5457d(iE2);
        interfaceC1303a.mo5457d(iM4519b2);
    }

    public void m4618a(ClassW c1116w) {
        this.f2470f.m4612a(c1116w);
    }

    public void m4619a(ClassW c1116w, Abstracta abstractC1200a) {
        this.f2470f.m4613a(c1116w, abstractC1200a);
    }

    public void m4620a(ClassY c1118y) {
        this.f2470f.m4614a(c1118y);
    }

    public void m4621a(ClassC c1163c, ClassT c1113t) {
        this.f2472h.m4590a(c1163c, c1113t);
    }

    public void m4622a(ClassN c1221n, ClassC c1163c, ClassT c1113t) {
        this.f2472h.m4591a(c1221n, c1163c, c1113t);
    }

    public void m4623a(ClassZ c1233z, ClassC c1163c, ClassT c1113t) {
        this.f2472h.m4592a(c1233z, c1163c, c1113t);
    }

    public void m4624a(ClassZ c1233z, ClassD c1164d, ClassT c1113t) {
        this.f2472h.m4593a(c1233z, c1164d, c1113t);
    }

    public void m4625b(ClassY c1118y) {
        this.f2470f.m4615b(c1118y);
    }

    public ae m4626c() {
        return this.f2465a;
    }

    public ae m4627d() {
        return this.f2467c;
    }

    public Interfacee m4628e() {
        return this.f2468d == null ? ClassB.f3210a : this.f2468d.m4567c();
    }

    @Override
    public int mo4484e_() {
        return 32;
    }
}
