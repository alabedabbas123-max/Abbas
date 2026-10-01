package org.c.a.a.b.a;

import org.c.a.a.b.a.b.Abstracta;
import org.c.a.a.b.a.b.Abstractm;
import org.c.a.a.b.a.b.ClassB;
import org.c.a.a.b.a.b.ClassK;
import org.c.a.a.b.a.b.ClassL;

public class ClassB {

    protected Abstracta[] f5545a;

    public ClassB(Abstracta[] abstractC1863aArr) {
        this.f5545a = abstractC1863aArr;
    }

    public Abstracta m7660a(int i) {
        return this.f5545a[i];
    }

    public String m7661b(int i) {
        return ((ClassL) this.f5545a[((ClassB) this.f5545a[i]).m7666b()]).m7678b();
    }

    public String m7662c(int i) {
        return ((ClassL) this.f5545a[((ClassK) this.f5545a[i]).m7677b()]).m7678b();
    }

    public String m7663d(int i) {
        return ((ClassL) this.f5545a[i]).m7678b();
    }

    public Abstractm m7664e(int i) {
        Abstracta abstractC1863a = this.f5545a[i];
        if (abstractC1863a != null && abstractC1863a.m7665a() == 8) {
            abstractC1863a = this.f5545a[((ClassK) abstractC1863a).m7677b()];
        }
        return (Abstractm) abstractC1863a;
    }

    public String toString() {
        return "ConstantPool";
    }
}
