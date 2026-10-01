package com.a.b.f;

import com.a.b.e.b.Abstractj;
import com.a.b.e.b.aa;
import com.a.b.e.b.ClassU;
import com.a.b.e.b.ClassX;

public final class ClassZ extends Abstractan implements Cloneable {

    private Abstractj f3469a;

    ClassZ(Abstractj abstractC1183j, aj c1264aj) {
        super(abstractC1183j.m4842h(), c1264aj);
        this.f3469a = abstractC1183j;
    }

    @Override
    public ClassZ clone() {
        return (ClassZ) super.clone();
    }

    public final void m5400a(int i, ClassU c1194u) {
        ClassX c1197xM4844j = this.f3469a.m4844j();
        int iD_ = c1197xM4844j.m5476d_();
        ClassX c1197x = new ClassX(iD_);
        int i2 = 0;
        while (i2 < iD_) {
            c1197x.m4915a(i2, i2 == i ? c1194u : c1197xM4844j.m4916b(i2));
            i2++;
        }
        c1197x.mo3944c_();
        ClassU c1194uM4916b = c1197xM4844j.m4916b(i);
        if (c1194uM4916b.m4894g() != c1194u.m4894g()) {
            m5262p().m5237o().m5278a(this, c1194uM4916b, c1194u);
        }
        this.f3469a = this.f3469a.mo4802a(m5261o(), c1197x);
    }

    public final void m5401a(ClassX c1197x) {
        if (this.f3469a.m4844j().m5476d_() != c1197x.m5476d_()) {
            throw new RuntimeException("Sources counts don't match");
        }
        this.f3469a = this.f3469a.mo4802a(m5261o(), c1197x);
    }

    @Override
    public final void mo5168a(Abstractag abstractC1261ag) {
        ClassX c1197xM4844j = this.f3469a.m4844j();
        ClassX c1197xM5184a = abstractC1261ag.m5184a(c1197xM4844j);
        if (c1197xM5184a != c1197xM4844j) {
            this.f3469a = this.f3469a.mo4802a(m5261o(), c1197xM5184a);
            m5262p().m5237o().m5279a(this, c1197xM4844j);
        }
    }

    @Override
    public void mo5169a(Interfaceao interfaceC1269ao) {
        if (mo5259i()) {
            interfaceC1269ao.mo5120a(this);
        } else {
            interfaceC1269ao.mo5121b(this);
        }
    }

    @Override
    public ClassX mo5171b() {
        return this.f3469a.m4844j();
    }

    @Override
    public Abstractj mo5172c() {
        return this.f3469a.mo4802a(m5261o(), this.f3469a.m4844j());
    }

    @Override
    public String mo3828d() {
        return mo5172c().mo3828d();
    }

    @Override
    public aa mo5173e() {
        return this.f3469a.m4840f();
    }

    @Override
    public Abstractj mo5174f() {
        return this.f3469a;
    }

    @Override
    public ClassU mo5258g() {
        ClassU c1194uM4916b = this.f3469a.m4840f().m4737a() == 54 ? this.f3469a.m4844j().m4916b(0) : m5261o();
        if (c1194uM4916b == null || c1194uM4916b.m4896i() == null) {
            return null;
        }
        return c1194uM4916b;
    }

    public void m5402h() {
        ClassX c1197xM4844j = this.f3469a.m4844j();
        this.f3469a = this.f3469a.mo4846l();
        m5262p().m5237o().m5279a(this, c1197xM4844j);
    }

    @Override
    public boolean mo5259i() {
        return this.f3469a.m4840f().m4737a() == 2;
    }

    @Override
    public boolean mo5260j() {
        return this.f3469a.m4840f().m4737a() == 4;
    }

    @Override
    public boolean mo5176k() {
        return this.f3469a.m4845k();
    }

    @Override
    public boolean mo5177l() {
        return mo5259i();
    }

    @Override
    public boolean mo5178m() {
        aa c1167aaMo5173e = mo5173e();
        if (c1167aaMo5173e.m4740d() != 1) {
            return true;
        }
        boolean z = aa.m5159a() && mo5258g() != null;
        switch (c1167aaMo5173e.m4737a()) {
            case 2:
            case 5:
            case 55:
                return z;
            default:
                return true;
        }
    }
}
