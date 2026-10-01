package org.c.a.a.b.c;

import org.c.a.a.b.b.Abstracth;

public class ClassV extends Abstracth implements Interfacek {

    protected ClassW f5602g;

    public ClassV(int i, int i2, int i3, int i4, String str) {
        super(i, i2, i3, i4, str);
        this.f5602g = new ClassW(this);
    }

    public ClassV(int i, int i2, int i3, int i4, String str, ClassW c1910w) {
        super(i, i2, i3, i4, str);
        this.f5602g = c1910w;
        c1910w.m7759a(this);
    }

    @Override
    public void mo7710a(Interfacel interfaceC1899l) {
        interfaceC1899l.mo7743a(this);
    }

    public ClassW m7757h() {
        return this.f5602g;
    }
}
