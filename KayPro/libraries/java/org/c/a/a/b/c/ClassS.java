package org.c.a.a.b.c;

import org.c.a.a.b.b.Abstracth;

public class ClassS extends Abstracth implements Interfacek {

    protected ClassC f5597g;

    public ClassS(int i, int i2, int i3, int i4, String str) {
        super(i, i2, i3, i4, str);
    }

    public void m7752a(int i) {
        this.f5575d = i;
    }

    void m7753a(ClassC c1890c) {
        this.f5597g = c1890c;
    }

    @Override
    public void mo7710a(Interfacel interfaceC1899l) {
        interfaceC1899l.mo7740a(this);
    }

    @Override
    public boolean mo7692a(boolean z) {
        if (this.f5575d >= this.f5573b) {
            return false;
        }
        this.f5575d++;
        if (z || this.f5575d != 1 || this.f5597g.mo7697e() != 0) {
            return true;
        }
        this.f5597g.m7712a(this.f5575d);
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
        this.f5597g.m7712a(this.f5575d);
        return true;
    }
}
