package com.a.b.a.b;

import com.a.b.e.c.ae;
import com.a.b.e.d.ClassB;
import com.a.b.e.d.Interfacee;
import com.a.b.g.ClassJ;
import com.a.b.g.ClassN;

public final class ClassH extends ClassJ {

    public static final ClassH f1864a = new ClassH(0);

    public ClassH(int i) {
        super(i);
    }

    private static boolean m3969a(ClassI c0937i, ClassI[] c0937iArr, int i) {
        ae c1205aeM3981d = c0937i.m3981d();
        for (int i2 = 0; i2 < i; i2++) {
            ae c1205aeM3981d2 = c0937iArr[i2].m3981d();
            if (c1205aeM3981d2 == c1205aeM3981d || c1205aeM3981d2 == ae.f3130a) {
                return false;
            }
        }
        return true;
    }

    public int m3970a() {
        return (m5476d_() * 8) + 2;
    }

    public ClassI m3971a(int i) {
        return (ClassI) m5477e(i);
    }

    public void m3972a(int i, int i2, int i3, int i4, ae c1205ae) {
        m5474a(i, (Object) new ClassI(i2, i3, i4, c1205ae));
    }

    public void m3973a(int i, ClassI c0937i) {
        if (c0937i == null) {
            throw new NullPointerException("item == null");
        }
        m5474a(i, (Object) c0937i);
    }

    public Interfacee m3974a_() {
        int iD_ = m5476d_();
        if (iD_ == 0) {
            return ClassB.f3210a;
        }
        ClassB c1235b = new ClassB(iD_);
        for (int i = 0; i < iD_; i++) {
            c1235b.m5052a(i, m3971a(i).m3981d().m4966i());
        }
        c1235b.mo3944c_();
        return c1235b;
    }

    public ClassH m3975b(int i) {
        int iD_ = m5476d_();
        ClassI[] c0937iArr = new ClassI[iD_];
        int i2 = 0;
        for (int i3 = 0; i3 < iD_; i3++) {
            ClassI c0937iM3971a = m3971a(i3);
            if (c0937iM3971a.m3978a(i) && m3969a(c0937iM3971a, c0937iArr, i2)) {
                c0937iArr[i2] = c0937iM3971a;
                i2++;
            }
        }
        if (i2 == 0) {
            return f1864a;
        }
        ClassH c0936h = new ClassH(i2);
        for (int i4 = 0; i4 < i2; i4++) {
            c0936h.m3973a(i4, c0937iArr[i4]);
        }
        c0936h.mo3944c_();
        return c0936h;
    }

    public ClassN m3976c(int i) {
        if (i < -1) {
            throw new IllegalArgumentException("noException < -1");
        }
        boolean z = i >= 0;
        int iD_ = m5476d_();
        if (iD_ == 0) {
            return z ? ClassN.m5493a(i) : ClassN.f3497a;
        }
        ClassN c1316n = new ClassN((z ? 1 : 0) + iD_);
        for (int i2 = 0; i2 < iD_; i2++) {
            c1316n.m5499c(m3971a(i2).m3980c());
        }
        if (z) {
            c1316n.m5499c(i);
        }
        c1316n.mo3944c_();
        return c1316n;
    }
}
