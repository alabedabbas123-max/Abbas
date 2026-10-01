package com.a.b.e.b;

import com.a.b.e.c.ClassP;
import com.a.b.e.d.ClassC;

public final class ClassG implements Interfaceah {

    public static final ClassG f3063a = new ClassG();

    public static final ClassG f3064b = new ClassG(true);

    private final boolean f3065c;

    private ClassG() {
        this.f3065c = false;
    }

    private ClassG(boolean z) {
        this.f3065c = z;
    }

    private int m4834a(ClassX c1197x) {
        int iD_ = c1197x.m5476d_();
        int iM4898k = 0;
        for (int i = 0; i < iD_; i++) {
            iM4898k += c1197x.m4916b(i).m4898k();
        }
        return iM4898k;
    }

    @Override
    public int mo4810a() {
        return 16;
    }

    @Override
    public boolean mo4811a(aa c1167aa, ClassU c1194u, ClassU c1194u2) {
        if (c1194u.mo3825a() != ClassC.f3255f) {
            return false;
        }
        if (!(c1194u2.m4895h() instanceof ClassP)) {
            if ((c1194u.m4895h() instanceof ClassP) && c1167aa.m4737a() == 15) {
                return ((ClassP) c1194u.m4895h()).m5018l();
            }
            return false;
        }
        ClassP c1223p = (ClassP) c1194u2.m4895h();
        switch (c1167aa.m4737a()) {
            case 14:
            case 16:
            case 17:
            case 18:
            case 20:
            case 21:
            case 22:
                return c1223p.m5018l();
            case 15:
                return ClassP.m5001a(-c1223p.m5002i_()).m5018l();
            case 19:
            default:
                return false;
            case 23:
            case 24:
            case 25:
                return c1223p.m5019m();
        }
    }

    @Override
    public boolean mo4812a(aa c1167aa, ClassX c1197x) {
        return !this.f3065c && c1167aa.m4741e() && m4834a(c1197x) >= 6;
    }
}
