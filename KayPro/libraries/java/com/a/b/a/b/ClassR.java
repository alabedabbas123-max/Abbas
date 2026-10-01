package com.a.b.a.b;

import com.a.b.g.ClassJ;

public final class ClassR extends ClassJ {

    public static final ClassR f1890a = new ClassR(0);

    public ClassR(int i) {
        super(i);
    }

    public static ClassR m4041a(ClassR c0946r, ClassR c0946r2) {
        if (c0946r == f1890a) {
            return c0946r2;
        }
        int iD_ = c0946r.m5476d_();
        int iD_2 = c0946r2.m5476d_();
        ClassR c0946r3 = new ClassR(iD_ + iD_2);
        for (int i = 0; i < iD_; i++) {
            c0946r3.m4044a(i, c0946r.m4042a(i));
        }
        for (int i2 = 0; i2 < iD_2; i2++) {
            c0946r3.m4044a(iD_ + i2, c0946r2.m4042a(i2));
        }
        return c0946r3;
    }

    public ClassS m4042a(int i) {
        return (ClassS) m5477e(i);
    }

    public void m4043a(int i, int i2, int i3) {
        m5474a(i, (Object) new ClassS(i2, i3));
    }

    public void m4044a(int i, ClassS c0947s) {
        if (c0947s == null) {
            throw new NullPointerException("item == null");
        }
        m5474a(i, (Object) c0947s);
    }

    public int m4045b(int i) {
        int iD_ = m5476d_();
        int i2 = 0;
        int i3 = -1;
        int iM4047b = -1;
        while (i2 < iD_) {
            ClassS c0947sM4042a = m4042a(i2);
            int iM4046a = c0947sM4042a.m4046a();
            if (iM4046a <= i && iM4046a > i3) {
                iM4047b = c0947sM4042a.m4047b();
                if (iM4046a == i) {
                    break;
                }
            } else {
                iM4046a = i3;
            }
            i2++;
            i3 = iM4046a;
        }
        return iM4047b;
    }
}
