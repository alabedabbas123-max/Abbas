package com.a.b.e.b;

import com.a.b.e.d.Interfaced;

class ClassW {

    private int f3110a;

    private Interfaced f3111b;

    private ClassO f3112c;

    private ClassW() {
    }

    ClassW(ClassW c1196w) {
        this();
    }

    public ClassU m4907a() {
        return new ClassU(this.f3110a, this.f3111b, this.f3112c, null);
    }

    public void m4908a(int i, Interfaced interfaceC1237d, ClassO c1188o) {
        this.f3110a = i;
        this.f3111b = interfaceC1237d;
        this.f3112c = c1188o;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ClassU) {
            return ((ClassU) obj).m4884e(this.f3110a, this.f3111b, this.f3112c);
        }
        return false;
    }

    public int hashCode() {
        return ClassU.m4885f(this.f3110a, this.f3111b, this.f3112c);
    }
}
