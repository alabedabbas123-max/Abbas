package org.c.a.a.b.d.b;

import java.util.List;
import org.c.a.a.b.d.d.Interfaceb;
import org.c.a.a.b.d.e.Interfacel;

public class ClassU extends Abstracta {

    protected Interfacel f5749d;

    protected List f5750e;

    public ClassU(int i, Interfacel interfaceC2052l, Interfacel interfaceC2052l2, List list, Interfaceb interfaceC2016b) {
        super(i, interfaceC2052l, interfaceC2016b);
        this.f5749d = interfaceC2052l2;
        this.f5750e = list;
    }

    @Override
    public void mo7957a(Interfaceo interfaceC1979o) {
        interfaceC1979o.mo7813a(this);
    }

    public Interfacel m8029g() {
        return this.f5749d;
    }

    public List m8030i() {
        return this.f5750e;
    }

    public String toString() {
        return "LambdaIdentifiersExpression{" + this.f5750e + " -> " + this.f5692a + "}";
    }
}
