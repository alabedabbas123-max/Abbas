package com.a.b.g;

public class ClassQ extends ClassJ {

    private final ClassN f3501a;

    public ClassQ(int i) {
        super(i);
        this.f3501a = new ClassN(i);
    }

    public ClassQ(ClassQ c1319q) {
        super(c1319q.m5476d_());
        this.f3501a = c1319q.f3501a.m5506f();
        int iD_ = c1319q.m5476d_();
        for (int i = 0; i < iD_; i++) {
            Object objE = c1319q.m5477e(i);
            if (objE != null) {
                m5474a(i, objE);
            }
        }
    }

    private void m5510a(int i) {
        this.f3501a.m5498b(i, -1);
    }

    private void m5511a(int i, int i2) {
        int iM5496b = this.f3501a.m5496b();
        for (int i3 = 0; i3 <= i - iM5496b; i3++) {
            this.f3501a.m5499c(-1);
        }
        this.f3501a.m5498b(i, i2);
    }

    private void m5512e() {
        int iD_ = m5476d_();
        for (int i = 0; i < iD_; i++) {
            Interfacep interfaceC1318p = (Interfacep) m5477e(i);
            if (interfaceC1318p != null) {
                this.f3501a.m5498b(interfaceC1318p.mo3961a(), i);
            }
        }
    }

    protected void m5513a(int i, Interfacep interfaceC1318p) {
        Interfacep interfaceC1318p2 = (Interfacep) m5478f(i);
        m5474a(i, (Object) interfaceC1318p);
        if (interfaceC1318p2 != null) {
            m5510a(interfaceC1318p2.mo3961a());
        }
        if (interfaceC1318p != null) {
            m5511a(interfaceC1318p.mo3961a(), i);
        }
    }

    public final int m5514c(int i) {
        if (i >= this.f3501a.m5496b()) {
            return -1;
        }
        return this.f3501a.m5497b(i);
    }

    @Override
    public void mo5479i() {
        super.mo5479i();
        m5512e();
    }

    public final int m5515j() {
        int iM5496b = this.f3501a.m5496b() - 1;
        while (iM5496b >= 0 && this.f3501a.m5497b(iM5496b) < 0) {
            iM5496b--;
        }
        int i = iM5496b + 1;
        this.f3501a.m5504e(i);
        return i;
    }
}
