package com.a.b.f;

import com.a.b.e.b.Abstractj;
import com.a.b.e.b.aa;
import com.a.b.e.b.ClassO;
import com.a.b.e.b.ClassU;
import com.a.b.e.b.ClassX;
import com.a.b.g.Interfacew;

public abstract class Abstractan implements Interfacew, Cloneable {

    private final aj f3369a;

    private ClassU f3370b;

    protected Abstractan(ClassU c1194u, aj c1264aj) {
        if (c1264aj == null) {
            throw new NullPointerException("block == null");
        }
        this.f3369a = c1264aj;
        this.f3370b = c1194u;
    }

    public static Abstractan m5252a(Abstractj abstractC1183j, aj c1264aj) {
        return new ClassZ(abstractC1183j, c1264aj);
    }

    public final void m5253a(ClassO c1188o) {
        if (c1188o != this.f3370b.m4896i()) {
            if (c1188o == null || !c1188o.equals(this.f3370b.m4896i())) {
                this.f3370b = ClassU.m4881b(this.f3370b.m4894g(), this.f3370b.mo3825a(), c1188o);
            }
        }
    }

    public abstract void mo5168a(Abstractag abstractC1261ag);

    public abstract void mo5169a(Interfaceao interfaceC1269ao);

    public abstract ClassX mo5171b();

    protected void m5254b(ClassU c1194u) {
        if (c1194u == null) {
            throw new NullPointerException("result == null");
        }
        this.f3370b = c1194u;
    }

    public final void m5255b(Abstractag abstractC1261ag) {
        ClassU c1194u = this.f3370b;
        this.f3370b = abstractC1261ag.mo5080a(this.f3370b);
        this.f3369a.m5237o().m5277a(this, c1194u);
        mo5168a(abstractC1261ag);
    }

    public boolean m5256b(int i) {
        return this.f3370b != null && this.f3370b.m4894g() == i;
    }

    public abstract Abstractj mo5172c();

    public void m5257c(int i) {
        if (this.f3370b != null) {
            this.f3370b = this.f3370b.m4890b(i);
        }
    }

    public abstract aa mo5173e();

    public abstract Abstractj mo5174f();

    public ClassU mo5258g() {
        if (this.f3370b == null || this.f3370b.m4896i() == null) {
            return null;
        }
        return this.f3370b;
    }

    public boolean mo5259i() {
        return false;
    }

    public boolean mo5260j() {
        return false;
    }

    public abstract boolean mo5176k();

    public abstract boolean mo5177l();

    public abstract boolean mo5178m();

    public Abstractan clone() {
        try {
            return (Abstractan) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("unexpected", e);
        }
    }

    public ClassU m5261o() {
        return this.f3370b;
    }

    public aj m5262p() {
        return this.f3369a;
    }
}
