package org.c.a.a.b.d.a;

import org.c.a.a.b.d.c.Interfaced;
import org.c.a.a.b.d.e.Interfacel;
import org.c.a.a.d.ClassB;
import org.c.a.a.d.ClassC;

public class ClassT implements Interfacee {

    protected Interfaced f5674a;

    protected boolean f5675b;

    protected Interfacel f5676c;

    protected boolean f5677d;

    protected String f5678e;

    public ClassT(Interfaced interfaceC1994d, Interfacel interfaceC2052l, boolean z, String str) {
        this.f5674a = interfaceC1994d;
        this.f5676c = interfaceC2052l;
        this.f5677d = z;
        this.f5678e = str;
    }

    public ClassT(Interfacel interfaceC2052l, boolean z, String str) {
        this.f5676c = interfaceC2052l;
        this.f5677d = z;
        this.f5678e = str;
    }

    public void mo7932a(String str) {
        this.f5678e = str;
    }

    @Override
    public void mo7869a(Interfacem interfaceC1937m) {
        interfaceC1937m.mo7780a(this);
    }

    public void m7933a(boolean z) {
        this.f5675b = z;
    }

    @Override
    public ClassT mo7865h() {
        return this;
    }

    public Interfaced m7935d() {
        return this.f5674a;
    }

    public boolean m7936e() {
        return this.f5675b;
    }

    public Interfacel mo7937f() {
        return this.f5676c;
    }

    public boolean m7938g() {
        return this.f5677d;
    }

    public String mo7939i() {
        return this.f5678e;
    }

    @Override
    public boolean mo7867j_() {
        return false;
    }

    @Override
    public ClassC mo7868l_() {
        return ClassB.m8842b(this);
    }

    @Override
    public int size() {
        return 1;
    }

    public String toString() {
        String str = this.f5674a != null ? String.valueOf("FormalParameter{") + this.f5674a + " " : "FormalParameter{";
        return String.valueOf(this.f5677d ? String.valueOf(str) + this.f5676c.mo8143a(this.f5676c.mo8145d() - 1) + "... " : String.valueOf(str) + this.f5676c + " ") + this.f5678e + "}";
    }
}
