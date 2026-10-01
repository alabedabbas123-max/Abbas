package com.a.b.c.b;

import com.a.b.g.ClassJ;

public final class ClassS extends ClassJ {

    public static final ClassS f2315a = new ClassS(0);

    public ClassS(int i) {
        super(i);
    }

    public static ClassS m4430a(ClassM c1045m) {
        int iD_ = c1045m.m5476d_();
        ClassV c1054v = new ClassV(iD_);
        for (int i = 0; i < iD_; i++) {
            Abstractl abstractC1044lM4387a = c1045m.m4387a(i);
            if (abstractC1044lM4387a instanceof ClassW) {
                c1054v.m4453a(abstractC1044lM4387a.m4378i(), ((ClassW) abstractC1044lM4387a).m4455c());
            } else if (abstractC1044lM4387a instanceof ClassX) {
                c1054v.m4451a(abstractC1044lM4387a.m4378i(), ((ClassX) abstractC1044lM4387a).m4457c());
            }
        }
        return c1054v.m4450a();
    }

    public ClassU m4431a(int i) {
        return (ClassU) m5477e(i);
    }

    public void m4432a(int i, ClassU c1053u) {
        m5474a(i, (Object) c1053u);
    }
}
