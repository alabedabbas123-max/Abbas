package com.a.b.a.b;

import com.a.b.e.c.ae;
import com.a.b.e.c.ClassY;
import com.a.b.g.ClassJ;

public class ClassD extends ClassJ {

    public static final ClassD f1855a = new ClassD(0);

    public ClassD(int i) {
        super(i);
    }

    public ClassE m3956a(int i) {
        return (ClassE) m5477e(i);
    }

    public void m3957a(int i, ClassE c0933e) {
        if (c0933e == null) {
            throw new NullPointerException("item == null");
        }
        m5474a(i, (Object) c0933e);
    }

    public void m3958a(int i, ae c1205ae, ClassY c1232y, ClassC c0931c) {
        m3957a(i, new ClassE(c1205ae, c1232y, c0931c));
    }
}
