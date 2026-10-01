package org.c.a.a.b.d.b;

import org.c.a.a.b.d.e.ClassK;
import org.c.a.a.b.d.e.Interfacel;
import org.c.a.a.c.a.a.c.aa;

public class ClassT extends Abstractc {

    static final boolean f5747d;

    protected int f5748a;

    static {
        f5747d = !ClassT.class.desiredAssertionStatus();
    }

    public ClassT(int i, Interfacel interfaceC2052l, int i2) {
        super(i, interfaceC2052l);
        this.f5748a = i2;
        if (!f5747d && !interfaceC2052l.mo8160m_()) {
            throw new AssertionError();
        }
    }

    public ClassT(Interfacel interfaceC2052l, int i) {
        super(interfaceC2052l);
        this.f5748a = i;
        if (!f5747d && !interfaceC2052l.mo8160m_()) {
            throw new AssertionError();
        }
    }

    @Override
    public void mo7957a(Interfaceo interfaceC1979o) {
        interfaceC1979o.mo7812a(this);
    }

    @Override
    public void mo7991a(Interfacel interfaceC2052l) {
        if (!f5747d && (!interfaceC2052l.mo8160m_() || !m8027b(interfaceC2052l))) {
            throw new AssertionError("setType : incompatible types");
        }
        super.mo7991a(interfaceC2052l);
    }

    protected boolean m8027b(Interfacel interfaceC2052l) {
        if (!interfaceC2052l.mo8160m_()) {
            return false;
        }
        switch (aa.m8407b(((ClassK) interfaceC2052l).m8157g())) {
            case 1:
                return this.f5748a >= 0 && this.f5748a <= 1;
            case 2:
                return ((char) this.f5748a) >= 0 && ((char) this.f5748a) <= 65535;
            case 16:
                return -128 <= this.f5748a && this.f5748a <= 127;
            case 32:
                return -32768 <= this.f5748a && this.f5748a <= 32767;
            default:
                return Integer.MIN_VALUE <= this.f5748a && this.f5748a <= Integer.MAX_VALUE;
        }
    }

    public int m8028d() {
        return this.f5748a;
    }

    public String toString() {
        return "IntegerConstantExpression{type=" + this.f5720c + ", value=" + this.f5748a + "}";
    }
}
