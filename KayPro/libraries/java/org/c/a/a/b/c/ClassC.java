package org.c.a.a.b.c;

import org.c.a.a.b.b.Abstracta;

public class ClassC extends Abstracta implements Interfacek {

    protected final ClassS f5582g;

    public ClassC(int i, int i2, int i3, int i4, String str, ClassS c1906s) {
        super(i, i2, i3, i4, str);
        this.f5582g = c1906s;
        c1906s.m7753a(this);
    }

    public void m7712a(int i) {
        this.f5575d = i;
    }

    @Override
    public void mo7710a(Interfacel interfaceC1899l) {
        interfaceC1899l.mo7729a(this);
    }

    @Override
    public boolean mo7692a(boolean z) {
        if (this.f5575d >= this.f5573b) {
            return false;
        }
        this.f5575d++;
        if (z || this.f5575d != 1 || this.f5582g.mo7697e() != 0) {
            return true;
        }
        this.f5582g.m7752a(this.f5575d);
        return true;
    }

    @Override
    public boolean mo7694b(boolean z) {
        if (this.f5575d <= this.f5572a) {
            return false;
        }
        this.f5575d--;
        if (!z && this.f5575d == 0) {
            this.f5582g.m7752a(this.f5575d);
        }
        return true;
    }

    public ClassS m7713h() {
        return this.f5582g;
    }
}
