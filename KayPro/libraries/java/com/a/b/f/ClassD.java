package com.a.b.f;

import com.a.b.e.b.ClassU;

class ClassD extends Abstractag {

    final ClassB f3404a;

    private final ClassU f3405b;

    private final ClassU f3406c;

    ClassD(ClassB c1278b, ClassU c1194u, ClassU c1194u2) {
        this.f3404a = c1278b;
        this.f3405b = c1194u;
        this.f3406c = c1194u2;
    }

    @Override
    public int mo5078a() {
        return this.f3404a.f3401a.m5294g();
    }

    @Override
    public ClassU mo5080a(ClassU c1194u) {
        return c1194u.m4894g() == this.f3405b.m4894g() ? this.f3406c.m4886a(c1194u.m4896i()) : c1194u;
    }
}
