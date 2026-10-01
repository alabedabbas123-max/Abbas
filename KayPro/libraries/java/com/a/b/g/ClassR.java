package com.a.b.g;

public class ClassR implements Interfaceo {

    final ClassN f3502a = new ClassN();

    public ClassR() {
        this.f3502a.m5508g();
    }

    @Override
    public int mo5410a() {
        return this.f3502a.m5496b();
    }

    @Override
    public void mo5411a(int i) {
        int iM5507g = this.f3502a.m5507g(i);
        if (iM5507g < 0) {
            this.f3502a.m5500c(-(iM5507g + 1), i);
        }
    }

    @Override
    public void mo5412a(Interfaceo interfaceC1317o) {
        int iM5428d = 0;
        if (!(interfaceC1317o instanceof ClassR)) {
            if (!(interfaceC1317o instanceof ClassB)) {
                Interfacem interfaceC1315mMo5413b = interfaceC1317o.mo5413b();
                while (interfaceC1315mMo5413b.mo5415a()) {
                    mo5411a(interfaceC1315mMo5413b.mo5416b());
                }
                return;
            } else {
                ClassB c1304b = (ClassB) interfaceC1317o;
                while (iM5428d >= 0) {
                    this.f3502a.m5499c(iM5428d);
                    iM5428d = ClassD.m5428d(c1304b.f3470a, iM5428d + 1);
                }
                this.f3502a.m5508g();
                return;
            }
        }
        ClassR c1320r = (ClassR) interfaceC1317o;
        int iM5496b = this.f3502a.m5496b();
        int iM5496b2 = c1320r.f3502a.m5496b();
        int i = 0;
        while (iM5428d < iM5496b2 && i < iM5496b) {
            while (iM5428d < iM5496b2 && c1320r.f3502a.m5497b(iM5428d) < this.f3502a.m5497b(i)) {
                mo5411a(c1320r.f3502a.m5497b(iM5428d));
                iM5428d++;
            }
            if (iM5428d == iM5496b2) {
                break;
            }
            while (i < iM5496b && c1320r.f3502a.m5497b(iM5428d) >= this.f3502a.m5497b(i)) {
                i++;
            }
        }
        while (iM5428d < iM5496b2) {
            mo5411a(c1320r.f3502a.m5497b(iM5428d));
            iM5428d++;
        }
        this.f3502a.m5508g();
    }

    @Override
    public Interfacem mo5413b() {
        return new ClassS(this);
    }

    @Override
    public boolean mo5414b(int i) {
        return this.f3502a.m5505f(i) >= 0;
    }

    public String toString() {
        return this.f3502a.toString();
    }
}
