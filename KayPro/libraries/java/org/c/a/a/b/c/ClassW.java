package org.c.a.a.b.c;

import org.c.a.a.b.b.Abstractd;
import org.c.a.a.d.ClassC;

public class ClassW {

    protected ClassC f5603a = new ClassC();

    protected int f5604b = Integer.MAX_VALUE;

    ClassW(Abstractd abstractC1881d) {
        this.f5603a.add(abstractC1881d);
    }

    public int m7758a() {
        if (this.f5604b == Integer.MAX_VALUE) {
            for (Abstractd abstractC1881d : this.f5603a) {
                if (this.f5604b > abstractC1881d.mo7697e()) {
                    this.f5604b = abstractC1881d.mo7697e();
                }
            }
        }
        return this.f5604b;
    }

    void m7759a(Abstractd abstractC1881d) {
        this.f5603a.add(abstractC1881d);
    }
}
