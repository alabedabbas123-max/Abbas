package com.a.b.e.b;

import com.a.b.g.ClassJ;

public final class ClassM extends ClassJ {
    public ClassM(int i) {
        super(i);
    }

    public Abstractj m4847a(int i) {
        return (Abstractj) m5477e(i);
    }

    public void m4848a(int i, Abstractj abstractC1183j) {
        m5474a(i, (Object) abstractC1183j);
    }

    public void m4849a(Interfacel interfaceC1185l) {
        int iD_ = m5476d_();
        for (int i = 0; i < iD_; i++) {
            m4847a(i).mo4805a(interfaceC1185l);
        }
    }

    public boolean m4850a(ClassM c1186m) {
        int iD_;
        if (c1186m == null || (iD_ = m5476d_()) != c1186m.m5476d_()) {
            return false;
        }
        for (int i = 0; i < iD_; i++) {
            if (!m4847a(i).mo4806a(c1186m.m4847a(i))) {
                return false;
            }
        }
        return true;
    }

    public Abstractj m4851e() {
        return m4847a(m5476d_() - 1);
    }
}
