package org.c.a.a.b.d.b;

import org.c.a.a.b.d.e.Interfacel;

public class ClassQ extends Abstractc {

    protected Abstractn f5740a;

    protected String f5741d;

    protected String f5742e;

    protected String f5743f;

    public ClassQ(int i, Interfacel interfaceC2052l, Abstractn abstractC1978n, String str, String str2, String str3) {
        super(i, interfaceC2052l);
        this.f5740a = abstractC1978n;
        this.f5741d = str;
        this.f5742e = str2;
        this.f5743f = str3;
    }

    public ClassQ(Interfacel interfaceC2052l, Abstractn abstractC1978n, String str, String str2, String str3) {
        super(interfaceC2052l);
        this.f5740a = abstractC1978n;
        this.f5741d = str;
        this.f5742e = str2;
        this.f5743f = str3;
    }

    public void m8017a(String str) {
        this.f5742e = str;
    }

    public void m8018a(Abstractn abstractC1978n) {
        this.f5740a = abstractC1978n;
    }

    @Override
    public void mo7957a(Interfaceo interfaceC1979o) {
        interfaceC1979o.mo7809a(this);
    }

    public Abstractn m8019d() {
        return this.f5740a;
    }

    public String m8020g() {
        return this.f5741d;
    }

    public String m8021i() {
        return this.f5742e;
    }

    public String m8022j() {
        return this.f5743f;
    }

    public String toString() {
        return "FieldReferenceExpression{lastType=" + this.f5720c + ", expression=" + this.f5740a + ", name=" + this.f5742e + ", descriptor=" + this.f5743f + "}";
    }
}
