package org.c.a.a.b.d.b;

import org.c.a.a.b.d.e.ClassI;
import org.c.a.a.b.d.e.Interfacel;

public class am extends Abstractn {

    protected int f5716a;

    protected Interfacel f5717b;

    protected Interfacel f5718c;

    public am(int i, Interfacel interfaceC2052l) {
        this.f5716a = i;
        this.f5717b = interfaceC2052l;
        this.f5718c = ClassI.f5833f.mo8148a(interfaceC2052l);
    }

    public am(Interfacel interfaceC2052l) {
        this.f5717b = interfaceC2052l;
        this.f5718c = ClassI.f5833f.mo8148a(interfaceC2052l);
    }

    @Override
    public void mo7957a(Interfaceo interfaceC1979o) {
        interfaceC1979o.mo7798a(this);
    }

    @Override
    public int mo7954b() {
        return 0;
    }

    public Interfacel m7990d() {
        return this.f5717b;
    }

    @Override
    public int mo7970e() {
        return this.f5716a;
    }

    @Override
    public Interfacel mo7963f() {
        return this.f5718c;
    }

    public String toString() {
        return "TypeReferenceDotClassExpression{" + this.f5717b + "}";
    }
}
