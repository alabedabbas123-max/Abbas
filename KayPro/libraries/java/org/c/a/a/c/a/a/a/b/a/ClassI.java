package org.c.a.a.c.a.a.a.b.a;

import org.c.a.a.b.d.a.ClassT;
import org.c.a.a.b.d.c.Interfaced;
import org.c.a.a.b.d.e.Interfacel;
import org.c.a.a.c.a.a.a.c.Abstracta;
import org.c.a.a.c.a.a.a.c.Interfaceg;

public class ClassI extends ClassT implements Interfaceg {

    protected Abstracta f6015f;

    public ClassI(Interfaced interfaceC1994d, Abstracta abstractC2115a, boolean z) {
        super(interfaceC1994d, null, z, null);
        this.f6015f = abstractC2115a;
    }

    public ClassI(Abstracta abstractC2115a, boolean z) {
        super(null, z, null);
        this.f6015f = abstractC2115a;
    }

    @Override
    public void mo7932a(String str) {
        this.f6015f.m8320a(str);
    }

    @Override
    public void mo8304a(Abstracta abstractC2115a) {
        this.f6015f = abstractC2115a;
    }

    @Override
    public Interfacel mo7937f() {
        return this.f6015f.mo8370k();
    }

    @Override
    public String mo7939i() {
        return this.f6015f.mo8337g();
    }

    @Override
    public String toString() {
        String str = this.f5674a != null ? String.valueOf("ClassFileFormalParameter{") + this.f5674a + " " : "ClassFileFormalParameter{";
        Interfacel interfaceC2052lK = this.f6015f.mo8370k();
        return String.valueOf(this.f5677d ? String.valueOf(str) + interfaceC2052lK.mo8143a(interfaceC2052lK.mo8145d() - 1) + "... " : String.valueOf(str) + interfaceC2052lK + " ") + this.f6015f.mo8337g() + "}";
    }
}
