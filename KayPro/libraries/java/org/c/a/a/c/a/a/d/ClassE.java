package org.c.a.a.c.a.a.d;

import org.c.a.a.b.d.e.Abstracta;
import org.c.a.a.b.d.e.ClassG;
import org.c.a.a.b.d.e.ClassH;
import org.c.a.a.b.d.e.ClassI;
import org.c.a.a.b.d.e.ClassK;
import org.c.a.a.c.a.a.a.c.Abstracta;
import org.c.a.a.c.a.a.a.c.ClassE;
import org.c.a.a.c.a.a.a.c.ClassJ;
import org.c.a.a.c.a.a.a.c.ClassK;
import org.c.a.a.c.a.a.c.ClassW;

public class ClassE extends Abstracta {

    protected ClassW f6203a;

    protected int f6204b;

    protected String f6205c;

    protected Abstracta f6206d;

    public ClassE(ClassW c2168w) {
        this.f6203a = c2168w;
    }

    public Abstracta m8653a() {
        return this.f6206d;
    }

    public void m8654a(int i, String str) {
        this.f6204b = i;
        this.f6205c = str;
    }

    @Override
    public void mo8129a(ClassG c2047g) {
        this.f6206d = new ClassE(this.f6204b, 0, c2047g, this.f6205c);
    }

    @Override
    public void mo8130a(ClassH c2048h) {
        this.f6206d = new ClassJ(this.f6203a, this.f6204b, 0, (ClassI) c2048h, this.f6205c);
    }

    @Override
    public void mo8131a(ClassI c2049i) {
        this.f6206d = new ClassJ(this.f6203a, this.f6204b, 0, c2049i, this.f6205c);
    }

    @Override
    public void mo8132a(ClassK c2051k) {
        if (c2051k.mo8145d() == 0) {
            this.f6206d = new ClassK(this.f6204b, 0, c2051k, this.f6205c);
        } else {
            this.f6206d = new ClassJ(this.f6203a, this.f6204b, 0, c2051k, this.f6205c);
        }
    }
}
