package org.c.a.a.b.c;

import org.c.a.a.b.b.Abstracta;

public class ClassF extends Abstracta implements Interfacek {

    protected final ClassU f5584g;

    public ClassF(int i, int i2, int i3, int i4, String str, ClassU c1908u) {
        super(i, i2, i3, i4, str);
        this.f5584g = c1908u;
        c1908u.m7755a(this);
    }

    public void m7714a(int i) {
        this.f5575d = i;
    }

    @Override
    public void mo7710a(Interfacel interfaceC1899l) {
        interfaceC1899l.mo7732a(this);
    }

    @Override
    public boolean mo7692a(boolean z) {
        if (this.f5575d >= this.f5573b) {
            return false;
        }
        this.f5575d++;
        if (z || this.f5584g.mo7697e() != 0) {
            return true;
        }
        this.f5584g.m7754a(1);
        return true;
    }

    @Override
    public boolean mo7694b(boolean z) {
        if (this.f5575d <= this.f5572a) {
            return false;
        }
        this.f5575d--;
        if (!z && this.f5575d == 0) {
            this.f5584g.m7754a(0);
        }
        return true;
    }

    public ClassU m7715h() {
        return this.f5584g;
    }
}
