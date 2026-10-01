package com.a.b.e.c;

import com.a.b.g.ClassJ;

public final class ClassE extends ClassJ implements Comparable {
    public ClassE(int i) {
        super(i);
    }

    @Override
    public int compareTo(ClassE c1212e) {
        int iD_ = m5476d_();
        int iD_2 = c1212e.m5476d_();
        int i = iD_ < iD_2 ? iD_ : iD_2;
        for (int i2 = 0; i2 < i; i2++) {
            int iCompareTo = ((Abstracta) m5477e(i2)).compareTo((Abstracta) c1212e.m5477e(i2));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (iD_ < iD_2) {
            return -1;
        }
        return iD_ > iD_2 ? 1 : 0;
    }

    public Abstracta m4979a(int i) {
        return (Abstracta) m5477e(i);
    }

    public void m4980a(int i, Abstracta abstractC1200a) {
        m5474a(i, (Object) abstractC1200a);
    }
}
