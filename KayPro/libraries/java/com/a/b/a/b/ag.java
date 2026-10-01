package com.a.b.a.b;

class ag extends ah {

    int f1802a;

    final ab f1803b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ag(ab c0915ab) {
        super(c0915ab.f1783d);
        this.f1803b = c0915ab;
        this.f1802a = c0915ab.f1783d + c0915ab.f1780a.m4009n().m5476d_();
    }

    @Override
    int mo3879a() {
        if (this.f1804c >= this.f1802a) {
            throw new IndexOutOfBoundsException();
        }
        int i = this.f1804c;
        this.f1804c = i + 1;
        return i;
    }
}
