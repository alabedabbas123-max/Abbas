package com.a.b.c.b;

import java.util.HashSet;

public final class ClassJ {

    private final int f2071a;

    private ab f2072b;

    private Interfacec f2073c;

    private ClassF f2074d;

    private ac f2075e;

    private ClassS f2076f;

    private ClassM f2077g;

    public ClassJ(int i, ab c1020ab, Interfacec interfaceC1035c) {
        if (c1020ab == null) {
            throw new NullPointerException("unprocessedInsns == null");
        }
        if (interfaceC1035c == null) {
            throw new NullPointerException("unprocessedCatches == null");
        }
        this.f2071a = i;
        this.f2072b = c1020ab;
        this.f2073c = interfaceC1035c;
        this.f2074d = null;
        this.f2075e = null;
        this.f2076f = null;
        this.f2077g = null;
    }

    private void m4358j() {
        if (this.f2077g != null) {
            return;
        }
        this.f2077g = this.f2072b.m4278d();
        this.f2075e = ac.m4279a(this.f2077g, this.f2071a);
        this.f2076f = ClassS.m4430a(this.f2077g);
        this.f2074d = this.f2073c.mo4317a();
        this.f2072b = null;
        this.f2073c = null;
    }

    public void m4359a(Interfacek interfaceC1043k) {
        this.f2072b.m4273a(interfaceC1043k);
    }

    public boolean m4360a() {
        return this.f2071a != 1 && this.f2072b.m4275a();
    }

    public boolean m4361b() {
        return this.f2072b.m4276b();
    }

    public boolean m4362c() {
        return this.f2073c.mo4318b();
    }

    public HashSet m4363d() {
        return this.f2073c.mo4319c();
    }

    public HashSet m4364e() {
        return this.f2072b.m4277c();
    }

    public ClassM m4365f() {
        m4358j();
        return this.f2077g;
    }

    public ClassF m4366g() {
        m4358j();
        return this.f2074d;
    }

    public ac m4367h() {
        m4358j();
        return this.f2075e;
    }

    public ClassS m4368i() {
        m4358j();
        return this.f2076f;
    }
}
