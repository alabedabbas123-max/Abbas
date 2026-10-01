package com.a.b.a.b;

import com.a.b.e.c.ad;
import com.a.b.g.ClassJ;

public final class ClassT extends ClassJ {

    public static final ClassT f1893a = new ClassT(0);

    public ClassT(int i) {
        super(i);
    }

    public static ClassT m4048a(ClassT c0948t, ClassT c0948t2) {
        if (c0948t == f1893a) {
            return c0948t2;
        }
        int iD_ = c0948t.m5476d_();
        int iD_2 = c0948t2.m5476d_();
        ClassT c0948t3 = new ClassT(iD_ + iD_2);
        for (int i = 0; i < iD_; i++) {
            c0948t3.m4054a(i, c0948t.m4050a(i));
        }
        for (int i2 = 0; i2 < iD_2; i2++) {
            c0948t3.m4054a(iD_ + i2, c0948t2.m4050a(i2));
        }
        c0948t3.mo3944c_();
        return c0948t3;
    }

    public static ClassT m4049b(ClassT c0948t, ClassT c0948t2) {
        int iD_ = c0948t.m5476d_();
        ClassT c0948t3 = new ClassT(iD_);
        for (int i = 0; i < iD_; i++) {
            ClassU c0949uM4050a = c0948t.m4050a(i);
            ClassU c0949uM4052a = c0948t2.m4052a(c0949uM4050a);
            if (c0949uM4052a != null) {
                c0949uM4050a = c0949uM4050a.m4057a(c0949uM4052a.m4056c());
            }
            c0948t3.m4054a(i, c0949uM4050a);
        }
        c0948t3.mo3944c_();
        return c0948t3;
    }

    public ClassU m4050a(int i) {
        return (ClassU) m5477e(i);
    }

    public ClassU m4051a(int i, int i2) {
        int iD_ = m5476d_();
        for (int i3 = 0; i3 < iD_; i3++) {
            ClassU c0949u = (ClassU) m5477e(i3);
            if (c0949u != null && c0949u.m4059a(i, i2)) {
                return c0949u;
            }
        }
        return null;
    }

    public ClassU m4052a(ClassU c0949u) {
        int iD_ = m5476d_();
        for (int i = 0; i < iD_; i++) {
            ClassU c0949u2 = (ClassU) m5477e(i);
            if (c0949u2 != null && c0949u2.m4060a(c0949u)) {
                return c0949u2;
            }
        }
        return null;
    }

    public void m4053a(int i, int i2, int i3, ad c1204ad, ad c1204ad2, ad c1204ad3, int i4) {
        m5474a(i, (Object) new ClassU(i2, i3, c1204ad, c1204ad2, c1204ad3, i4));
    }

    public void m4054a(int i, ClassU c0949u) {
        if (c0949u == null) {
            throw new NullPointerException("item == null");
        }
        m5474a(i, (Object) c0949u);
    }
}
