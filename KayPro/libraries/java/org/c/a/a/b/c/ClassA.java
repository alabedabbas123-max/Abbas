package org.c.a.a.b.c;

import org.c.a.a.b.b.Abstracta;

public class ClassA extends Abstracta implements Interfacek {

    protected ClassR f5579g;

    public ClassA(int i, int i2, int i3, int i4, String str, ClassR c1905r) {
        super(i, i2, i3, i4, str);
        this.f5579g = c1905r;
        c1905r.m7751a(this);
    }

    public void m7709a(int i) {
        this.f5575d = i;
    }

    @Override
    public void mo7710a(Interfacel interfaceC1899l) {
        interfaceC1899l.mo7727a(this);
    }

    @Override
    public boolean mo7692a(boolean z) {
        if (this.f5575d >= this.f5573b) {
            return false;
        }
        this.f5575d++;
        return true;
    }

    @Override
    public boolean mo7694b(boolean z) {
        if (this.f5575d <= this.f5572a) {
            return false;
        }
        this.f5575d--;
        return true;
    }
}
