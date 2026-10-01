package com.a.b.e.a;

import com.a.b.g.ClassJ;

public final class ClassD extends ClassJ {

    public static final ClassD f2828a = new ClassD(0);

    public ClassD(int i) {
        super(i);
    }

    public static ClassD m4720a(ClassD c1164d, ClassD c1164d2) {
        int iD_ = c1164d.m5476d_();
        if (iD_ != c1164d2.m5476d_()) {
            throw new IllegalArgumentException("list1.size() != list2.size()");
        }
        ClassD c1164d3 = new ClassD(iD_);
        for (int i = 0; i < iD_; i++) {
            c1164d3.m4722a(i, ClassC.m4714a(c1164d.m4721a(i), c1164d2.m4721a(i)));
        }
        c1164d3.mo3944c_();
        return c1164d3;
    }

    public ClassC m4721a(int i) {
        return (ClassC) m5477e(i);
    }

    public void m4722a(int i, ClassC c1163c) {
        c1163c.m5519m();
        m5474a(i, (Object) c1163c);
    }
}
