package org.c.a.a.b.d.b;

import org.c.a.a.b.d.e.ClassI;
import org.c.a.a.b.d.e.Interfacel;

public class ClassM extends Abstractb {

    protected ClassI f5737a;

    protected String f5738c;

    public ClassM(int i, ClassI c2049i, String str) {
        super(i);
        this.f5737a = c2049i;
        this.f5738c = str;
    }

    @Override
    public void mo7957a(Interfaceo interfaceC1979o) {
        interfaceC1979o.mo7807a(this);
    }

    public ClassI m8014d() {
        return this.f5737a;
    }

    @Override
    public Interfacel mo7963f() {
        return this.f5737a;
    }

    public String m8015g() {
        return this.f5738c;
    }

    public String toString() {
        return "EnumConstantReferenceExpression{lastType=" + this.f5737a + ", name=" + this.f5738c + "}";
    }
}
