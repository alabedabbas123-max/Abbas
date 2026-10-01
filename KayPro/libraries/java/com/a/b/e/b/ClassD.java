package com.a.b.e.b;

import com.a.b.g.ClassK;
import com.a.b.g.ClassN;
import com.a.b.g.ClassQ;
import com.a.b.g.Interfacep;

public final class ClassD extends ClassQ {

    private int f3060a;

    public ClassD(int i) {
        super(i);
        this.f3060a = -1;
    }

    private ClassD(ClassD c1177d) {
        super(c1177d);
        this.f3060a = c1177d.f3060a;
    }

    public ClassB m4821a(int i) {
        return (ClassB) m5477e(i);
    }

    public ClassB m4822a(ClassB c1175b) {
        int iM4815d = c1175b.m4815d();
        ClassN c1316nM4814c = c1175b.m4814c();
        switch (c1316nM4814c.m5496b()) {
            case 0:
                return null;
            case 1:
                return m4825b(c1316nM4814c.m5497b(0));
            default:
                return iM4815d != -1 ? m4825b(iM4815d) : m4825b(c1316nM4814c.m5497b(0));
        }
    }

    public void m4823a(int i, ClassB c1175b) {
        super.m5513a(i, (Interfacep) c1175b);
        this.f3060a = -1;
    }

    public void m4824a(Interfacel interfaceC1185l) {
        int iD_ = m5476d_();
        for (int i = 0; i < iD_; i++) {
            m4821a(i).m4813b().m4849a(interfaceC1185l);
        }
    }

    public ClassB m4825b(int i) {
        int iC = m5514c(i);
        if (iC < 0) {
            throw new IllegalArgumentException("no such label: " + ClassK.m5485c(i));
        }
        return m4821a(iC);
    }

    public int m4826e() {
        if (this.f3060a == -1) {
            ClassE c1178e = new ClassE();
            m4824a(c1178e);
            this.f3060a = c1178e.m4832a();
        }
        return this.f3060a;
    }

    public int m4827f() {
        int iD_ = m5476d_();
        int i = 0;
        int iD_2 = 0;
        while (i < iD_) {
            ClassB c1175b = (ClassB) m5478f(i);
            i++;
            iD_2 = c1175b != null ? c1175b.m4813b().m5476d_() + iD_2 : iD_2;
        }
        return iD_2;
    }

    public int m4828g() {
        int i;
        int iD_ = m5476d_();
        int i2 = 0;
        int i3 = 0;
        while (i2 < iD_) {
            ClassB c1175b = (ClassB) m5478f(i2);
            if (c1175b != null) {
                ClassM c1186mM4813b = c1175b.m4813b();
                int iD_2 = c1186mM4813b.m5476d_();
                i = i3;
                for (int i4 = 0; i4 < iD_2; i4++) {
                    if (c1186mM4813b.m4847a(i4).m4840f().m4737a() != 54) {
                        i++;
                    }
                }
            } else {
                i = i3;
            }
            i2++;
            i3 = i;
        }
        return i3;
    }

    public ClassD m4829h() {
        return new ClassD(this);
    }
}
