package com.a.b.g;

import java.util.NoSuchElementException;

class ClassS implements Interfacem {

    final ClassR f3503a;

    private int f3504b = 0;

    ClassS(ClassR c1320r) {
        this.f3503a = c1320r;
    }

    @Override
    public boolean mo5415a() {
        return this.f3504b < this.f3503a.f3502a.m5496b();
    }

    @Override
    public int mo5416b() {
        if (!mo5415a()) {
            throw new NoSuchElementException();
        }
        ClassN c1316n = this.f3503a.f3502a;
        int i = this.f3504b;
        this.f3504b = i + 1;
        return c1316n.m5497b(i);
    }
}
