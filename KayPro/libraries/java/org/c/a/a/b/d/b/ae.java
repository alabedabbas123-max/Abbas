package org.c.a.a.b.d.b;

import org.c.a.a.b.d.e.ClassI;
import org.c.a.a.b.d.e.Interfacel;

public class ae extends Abstractn {

    protected int f5700a;

    protected ClassI f5701b;

    protected boolean f5702c;

    public ae(int i, ClassI c2049i) {
        this.f5700a = i;
        this.f5701b = c2049i;
        this.f5702c = true;
    }

    public ae(int i, ClassI c2049i, boolean z) {
        this.f5700a = i;
        this.f5701b = c2049i;
        this.f5702c = z;
    }

    public ae(ClassI c2049i) {
        this.f5701b = c2049i;
        this.f5702c = true;
    }

    @Override
    public void mo7957a(Interfaceo interfaceC1979o) {
        interfaceC1979o.mo7790a(this);
    }

    @Override
    public int mo7954b() {
        return 0;
    }

    public ClassI m7969d() {
        return this.f5701b;
    }

    @Override
    public int mo7970e() {
        return this.f5700a;
    }

    @Override
    public Interfacel mo7963f() {
        return this.f5701b;
    }

    public boolean m7971g() {
        return this.f5702c;
    }

    public String toString() {
        return "ObjectTypeReferenceExpression{" + this.f5701b + "}";
    }
}
