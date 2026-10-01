package org.c.a.a.b.d.b;

import org.c.a.a.b.d.e.ClassK;
import org.c.a.a.b.d.e.Interfacel;

public class ClassH extends Abstractb {

    public static final ClassH f5728a = new ClassH(true);

    public static final ClassH f5729c = new ClassH(false);

    protected boolean f5730d;

    public ClassH(int i, boolean z) {
        super(i);
        this.f5730d = z;
    }

    protected ClassH(boolean z) {
        this.f5730d = z;
    }

    @Override
    public void mo7957a(Interfaceo interfaceC1979o) {
        interfaceC1979o.mo7802a(this);
    }

    public boolean m8004d() {
        return this.f5730d;
    }

    @Override
    public Interfacel mo7963f() {
        return ClassK.f5851a;
    }

    public boolean m8005g() {
        return !this.f5730d;
    }

    public String toString() {
        return "BooleanExpression{" + this.f5730d + "}";
    }
}
