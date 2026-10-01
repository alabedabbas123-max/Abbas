package org.c.a.a.c.a.a.c;

import org.c.a.a.b.d.Abstracta;
import org.c.a.a.b.d.a.ac;
import org.c.a.a.b.d.a.ClassR;

class ClassF extends Abstracta {

    protected String f6135a;

    protected String f6136b;

    protected boolean f6137c;

    private ClassF() {
    }

    ClassF(ClassF c2151f) {
        this();
    }

    public void m8521a(String str, String str2) {
        this.f6135a = str;
        this.f6136b = str2;
        this.f6137c = false;
    }

    @Override
    public void mo7764a(ac c1918ac) {
        this.f6137c = (c1918ac.m7872d().equals(this.f6135a) && c1918ac.m7875l().equals(this.f6136b)) | this.f6137c;
    }

    @Override
    public void mo7778a(ClassR c1942r) {
        this.f6137c |= c1942r.m7929e().equals(this.f6135a);
    }

    public boolean m8522a() {
        return this.f6137c;
    }
}
