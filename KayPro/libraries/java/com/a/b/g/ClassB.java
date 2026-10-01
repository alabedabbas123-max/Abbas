package com.a.b.g;

public class ClassB implements Interfaceo {

    int[] f3470a;

    public ClassB(int i) {
        this.f3470a = ClassD.m5423a(i);
    }

    private void m5409c(int i) {
        if (i >= ClassD.m5418a(this.f3470a)) {
            int[] iArrM5423a = ClassD.m5423a(Math.max(i + 1, ClassD.m5418a(this.f3470a) * 2));
            System.arraycopy(this.f3470a, 0, iArrM5423a, 0, this.f3470a.length);
            this.f3470a = iArrM5423a;
        }
    }

    @Override
    public int mo5410a() {
        return ClassD.m5426c(this.f3470a);
    }

    @Override
    public void mo5411a(int i) {
        m5409c(i);
        ClassD.m5419a(this.f3470a, i, true);
    }

    @Override
    public void mo5412a(Interfaceo interfaceC1317o) {
        if (interfaceC1317o instanceof ClassB) {
            ClassB c1304b = (ClassB) interfaceC1317o;
            m5409c(ClassD.m5418a(c1304b.f3470a) + 1);
            ClassD.m5420a(this.f3470a, c1304b.f3470a);
        } else {
            if (!(interfaceC1317o instanceof ClassR)) {
                Interfacem interfaceC1315mMo5413b = interfaceC1317o.mo5413b();
                while (interfaceC1315mMo5413b.mo5415a()) {
                    mo5411a(interfaceC1315mMo5413b.mo5416b());
                }
                return;
            }
            ClassR c1320r = (ClassR) interfaceC1317o;
            int iM5496b = c1320r.f3502a.m5496b();
            if (iM5496b > 0) {
                m5409c(c1320r.f3502a.m5497b(iM5496b - 1));
            }
            for (int i = 0; i < c1320r.f3502a.m5496b(); i++) {
                ClassD.m5419a(this.f3470a, c1320r.f3502a.m5497b(i), true);
            }
        }
    }

    @Override
    public Interfacem mo5413b() {
        return new ClassC(this);
    }

    @Override
    public boolean mo5414b(int i) {
        return i < ClassD.m5418a(this.f3470a) && ClassD.m5421a(this.f3470a, i);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        boolean z = true;
        int iM5428d = ClassD.m5428d(this.f3470a, 0);
        while (iM5428d >= 0) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(iM5428d);
            iM5428d = ClassD.m5428d(this.f3470a, iM5428d + 1);
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
