package com.a.b.c.b;

import com.a.b.c.ClassA;
import java.util.ArrayList;

public final class aa {

    private final ab f2015a;

    private ArrayList f2016b;

    public aa(ClassA c0984a, int i, int i2, int i3, int i4) {
        this.f2015a = new ab(c0984a, i, i3, i4);
        this.f2016b = new ArrayList(i2);
    }

    private void m4245b() {
        int size = this.f2016b.size();
        for (int i = 0; i < size; i++) {
            this.f2015a.m4274a((Abstractl) this.f2016b.get(i));
        }
        this.f2016b = null;
    }

    public ab m4246a() {
        if (this.f2016b == null) {
            throw new UnsupportedOperationException("already processed");
        }
        m4245b();
        return this.f2015a;
    }

    public void m4247a(int i, ClassH c1040h) {
        this.f2015a.m4272a(i, c1040h);
    }

    public void m4248a(Abstractl abstractC1044l) {
        this.f2015a.m4274a(abstractC1044l);
    }

    public void m4249b(Abstractl abstractC1044l) {
        this.f2016b.add(abstractC1044l);
    }
}
