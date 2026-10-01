package com.a.b.c.b;

import com.a.b.e.b.ad;
import com.a.b.e.b.ClassU;
import com.a.b.e.b.ClassX;
import com.a.b.g.Interfacea;

public final class ClassQ extends Abstractan {

    private aj[] f2314a;

    public ClassQ(ad c1170ad, ClassX c1197x) {
        super(c1170ad, c1197x);
        if (c1197x.m5476d_() == 0) {
            throw new IllegalArgumentException("registers.size() == 0");
        }
        this.f2314a = null;
    }

    private static aj m4403a(ClassU c1194u, int i) {
        return Abstractl.m4369a(ad.f3049a, ClassU.m4876a(i, c1194u.mo3825a()), c1194u);
    }

    private void m4404c() {
        int iM4898k = 0;
        if (this.f2314a != null) {
            return;
        }
        ClassX c1197xL = m4381l();
        int iD_ = c1197xL.m5476d_();
        this.f2314a = new aj[iD_];
        for (int i = 0; i < iD_; i++) {
            ClassU c1194uM4916b = c1197xL.m4916b(i);
            this.f2314a[i] = m4403a(c1194uM4916b, iM4898k);
            iM4898k += c1194uM4916b.m4898k();
        }
    }

    @Override
    public int mo4229a() {
        m4404c();
        int iA = 0;
        for (aj c1028aj : this.f2314a) {
            iA += c1028aj.mo4229a();
        }
        return iA;
    }

    @Override
    public Abstractl mo4230a(ClassX c1197x) {
        return new ClassQ(m4380k(), c1197x);
    }

    @Override
    protected String mo4231a(boolean z) {
        int iM4898k = 0;
        ClassX c1197xL = m4381l();
        int iD_ = c1197xL.m5476d_();
        StringBuilder sb = new StringBuilder(100);
        for (int i = 0; i < iD_; i++) {
            ClassU c1194uM4916b = c1197xL.m4916b(i);
            aj c1028ajM4403a = m4403a(c1194uM4916b, iM4898k);
            if (i != 0) {
                sb.append('\n');
            }
            sb.append(c1028ajM4403a.mo4231a(z));
            iM4898k += c1194uM4916b.m4898k();
        }
        return sb.toString();
    }

    @Override
    public void mo4232a(Interfacea interfaceC1303a) {
        m4404c();
        for (aj c1028aj : this.f2314a) {
            c1028aj.mo4232a(interfaceC1303a);
        }
    }

    @Override
    protected String mo4233b() {
        return null;
    }
}
