package org.c.a.a.c.d.b;

import org.c.a.a.b.b.ClassB;
import org.c.a.a.b.b.ClassI;
import org.c.a.a.c.d.c.Abstractb;

class ClassE extends Abstractb {

    final ClassA f6380a;

    ClassE(ClassA c2228a) {
        this.f6380a = c2228a;
    }

    @Override
    public void mo7701a(ClassB c1879b) {
        if (this.f6385f) {
            if (this.f6381b == 0) {
                this.f6385f = false;
                return;
            }
            this.f6381b--;
            if (this.f6381b == 0) {
                m8827g();
            }
            this.f6382c++;
        }
    }

    @Override
    public void mo7706a(ClassI c1886i) {
        if (this.f6385f) {
            this.f6381b++;
            this.f6382c++;
        }
    }
}
