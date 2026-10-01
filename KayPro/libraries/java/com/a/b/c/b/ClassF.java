package com.a.b.c.b;

import com.a.b.g.ClassJ;

public final class ClassF extends ClassJ implements Comparable {

    public static final ClassF f2063a = new ClassF(0);

    public ClassF(int i) {
        super(i);
    }

    @Override
    public int compareTo(ClassF c1038f) {
        if (this == c1038f) {
            return 0;
        }
        int iD_ = m5476d_();
        int iD_2 = c1038f.m5476d_();
        int iMin = Math.min(iD_, iD_2);
        for (int i = 0; i < iMin; i++) {
            int iCompareTo = m4344a(i).compareTo(c1038f.m4344a(i));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (iD_ < iD_2) {
            return -1;
        }
        return iD_ > iD_2 ? 1 : 0;
    }

    public ClassG m4344a(int i) {
        return (ClassG) m5477e(i);
    }

    public void m4345a(int i, ClassG c1039g) {
        m5474a(i, (Object) c1039g);
    }
}
