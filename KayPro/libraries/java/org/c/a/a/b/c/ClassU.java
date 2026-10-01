package org.c.a.a.b.c;

import org.c.a.a.b.b.Abstracth;

public class ClassU extends Abstracth implements Interfacek {

    protected ClassF f5601g;

    public ClassU(int i, int i2, int i3, int i4, String str) {
        super(i, i2, i3, i4, str);
    }

    public void m7754a(int i) {
        this.f5575d = i;
    }

    public void m7755a(ClassF c1893f) {
        this.f5601g = c1893f;
    }

    @Override
    public void mo7710a(Interfacel interfaceC1899l) {
        interfaceC1899l.mo7742a(this);
    }

    @Override
    public boolean mo7692a(boolean z) {
        if (this.f5575d >= this.f5573b) {
            return false;
        }
        this.f5575d++;
        if (z || this.f5601g.mo7697e() != 0) {
            return true;
        }
        this.f5601g.m7714a(1);
        return true;
    }

    @Override
    public boolean mo7694b(boolean z) {
        if (this.f5575d <= this.f5572a) {
            return false;
        }
        this.f5575d--;
        if (z || this.f5575d != 1) {
            return true;
        }
        this.f5601g.m7714a(1);
        return true;
    }

    public ClassF m7756h() {
        return this.f5601g;
    }
}
