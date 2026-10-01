package com.a.b.g;

import java.util.NoSuchElementException;

class ClassC implements Interfacem {

    final ClassB f3471a;

    private int f3472b;

    ClassC(ClassB c1304b) {
        this.f3471a = c1304b;
        this.f3472b = ClassD.m5428d(c1304b.f3470a, 0);
    }

    @Override
    public boolean mo5415a() {
        return this.f3472b >= 0;
    }

    @Override
    public int mo5416b() {
        if (!mo5415a()) {
            throw new NoSuchElementException();
        }
        int i = this.f3472b;
        this.f3472b = ClassD.m5428d(this.f3471a.f3470a, this.f3472b + 1);
        return i;
    }
}
