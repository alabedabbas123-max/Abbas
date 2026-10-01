package org.c.a.a.b.d.b;

import org.c.a.a.b.d.a.ClassI;
import org.c.a.a.b.d.e.ClassI;
import org.c.a.a.b.d.e.Interfacee;
import org.c.a.a.b.d.e.Interfacel;

public class ab extends Abstractb {

    protected Interfacee f5694a;

    protected ClassI f5695c;

    protected String f5696d;

    protected Interfacef f5697e;

    protected ClassI f5698f;

    public ab(int i, ClassI c2049i) {
        super(i);
        this.f5695c = c2049i;
    }

    public ab(int i, ClassI c2049i, ClassI c1933i) {
        super(i);
        this.f5695c = c2049i;
        this.f5698f = c1933i;
    }

    public void m7959a(String str, Interfacef interfaceC1970f) {
        this.f5696d = str;
        this.f5697e = interfaceC1970f;
    }

    public void m7960a(Interfacef interfaceC1970f) {
        this.f5697e = interfaceC1970f;
    }

    @Override
    public void mo7957a(Interfaceo interfaceC1979o) {
        interfaceC1979o.mo7787a(this);
    }

    public void m7961a(ClassI c2049i) {
        this.f5695c = c2049i;
    }

    @Override
    public int mo7954b() {
        return 3;
    }

    public Interfacee m7962d() {
        return this.f5694a;
    }

    @Override
    public Interfacel mo7963f() {
        return this.f5695c;
    }

    public ClassI m7964g() {
        return this.f5695c;
    }

    public String m7965i() {
        return this.f5696d;
    }

    public Interfacef m7966j() {
        return this.f5697e;
    }

    public ClassI m7967l() {
        return this.f5698f;
    }
}
