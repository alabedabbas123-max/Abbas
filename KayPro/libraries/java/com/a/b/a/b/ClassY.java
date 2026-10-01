package com.a.b.a.b;

import com.a.b.e.d.ClassC;
import com.a.b.e.d.Interfaced;
import com.a.b.g.ClassK;

public final class ClassY {
    public static ClassP m4077a(ClassP c0944p, ClassP c0944p2) {
        if (c0944p == c0944p2) {
            return c0944p;
        }
        int iM4020b = c0944p.m4020b();
        if (c0944p2.m4020b() != iM4020b) {
            throw new al("mismatched stack depths");
        }
        ClassP c0944pM4013a = null;
        for (int i = 0; i < iM4020b; i++) {
            Interfaced interfaceC1237dM4015a = c0944p.m4015a(i);
            Interfaced interfaceC1237dM4015a2 = c0944p2.m4015a(i);
            Interfaced interfaceC1237dM4079a = m4079a(interfaceC1237dM4015a, interfaceC1237dM4015a2);
            if (interfaceC1237dM4079a != interfaceC1237dM4015a) {
                if (c0944pM4013a == null) {
                    c0944pM4013a = c0944p.m4013a();
                }
                if (interfaceC1237dM4079a == null) {
                    throw new al("incompatible: " + interfaceC1237dM4015a + ", " + interfaceC1237dM4015a2);
                }
                try {
                    c0944pM4013a.m4016a(i, interfaceC1237dM4079a);
                } catch (al e) {
                    e.m3757a("...while merging stack[" + ClassK.m5485c(i) + "]");
                    throw e;
                }
                e.m3757a("...while merging stack[" + ClassK.m5485c(i) + "]");
                throw e;
            }
        }
        if (c0944pM4013a == null) {
            return c0944p;
        }
        c0944pM4013a.mo3944c_();
        return c0944pM4013a;
    }

    public static ClassZ m4078a(ClassZ c0954z, ClassZ c0954z2) {
        if (c0954z == c0954z2) {
            return c0954z;
        }
        int iM4086f = c0954z.m4086f();
        if (c0954z2.m4086f() != iM4086f) {
            throw new al("mismatched maxLocals values");
        }
        ClassZ c0954zMo4062a = null;
        for (int i = 0; i < iM4086f; i++) {
            Interfaced interfaceC1237dM4084c = c0954z.m4084c(i);
            Interfaced interfaceC1237dM4079a = m4079a(interfaceC1237dM4084c, c0954z2.m4084c(i));
            if (interfaceC1237dM4079a != interfaceC1237dM4084c) {
                if (c0954zMo4062a == null) {
                    c0954zMo4062a = c0954z.mo4062a();
                }
                if (interfaceC1237dM4079a == null) {
                    c0954zMo4062a.m4083b(i);
                } else {
                    c0954zMo4062a.mo4066a(i, interfaceC1237dM4079a);
                }
            }
        }
        if (c0954zMo4062a == null) {
            return c0954z;
        }
        c0954zMo4062a.mo3944c_();
        return c0954zMo4062a;
    }

    public static Interfaced m4079a(Interfaced interfaceC1237d, Interfaced interfaceC1237d2) {
        if (interfaceC1237d == null || interfaceC1237d.equals(interfaceC1237d2)) {
            return interfaceC1237d;
        }
        if (interfaceC1237d2 == null) {
            return null;
        }
        ClassC c1236cMo3825a = interfaceC1237d.mo3825a();
        ClassC c1236cMo3825a2 = interfaceC1237d2.mo3825a();
        if (c1236cMo3825a == c1236cMo3825a2) {
            return c1236cMo3825a;
        }
        if (!c1236cMo3825a.m5071o() || !c1236cMo3825a2.m5071o()) {
            if (c1236cMo3825a.m5069m() && c1236cMo3825a2.m5069m()) {
                return ClassC.f3255f;
            }
            return null;
        }
        if (c1236cMo3825a == ClassC.f3259j) {
            return c1236cMo3825a2;
        }
        if (c1236cMo3825a2 == ClassC.f3259j) {
            return c1236cMo3825a;
        }
        if (!c1236cMo3825a.m5072p() || !c1236cMo3825a2.m5072p()) {
            return ClassC.f3267r;
        }
        Interfaced interfaceC1237dM4079a = m4079a(c1236cMo3825a.m5077u(), c1236cMo3825a2.m5077u());
        return interfaceC1237dM4079a == null ? ClassC.f3267r : ((ClassC) interfaceC1237dM4079a).m5076t();
    }

    public static boolean m4080b(Interfaced interfaceC1237d, Interfaced interfaceC1237d2) {
        ClassC c1236cM5077u;
        int i;
        ClassC c1236cM5077u2;
        int i2;
        ClassC c1236cMo3825a = interfaceC1237d.mo3825a();
        ClassC c1236cMo3825a2 = interfaceC1237d2.mo3825a();
        if (c1236cMo3825a.equals(c1236cMo3825a2)) {
            return true;
        }
        int iMo3827c = c1236cMo3825a.mo3827c();
        int iMo3827c2 = c1236cMo3825a2.mo3827c();
        if (iMo3827c == 10) {
            c1236cM5077u = ClassC.f3267r;
            i = 9;
        } else {
            c1236cM5077u = c1236cMo3825a;
            i = iMo3827c;
        }
        if (iMo3827c2 == 10) {
            c1236cM5077u2 = ClassC.f3267r;
            i2 = 9;
        } else {
            c1236cM5077u2 = c1236cMo3825a2;
            i2 = iMo3827c2;
        }
        if (i != 9 || i2 != 9) {
            return c1236cM5077u.m5069m() && c1236cM5077u2.m5069m();
        }
        if (c1236cM5077u == ClassC.f3259j) {
            return false;
        }
        if (c1236cM5077u2 != ClassC.f3259j && c1236cM5077u != ClassC.f3267r) {
            if (!c1236cM5077u.m5072p()) {
                if (c1236cM5077u2.m5072p()) {
                    return c1236cM5077u == ClassC.f3268s || c1236cM5077u == ClassC.f3263n;
                }
                return true;
            }
            if (!c1236cM5077u2.m5072p()) {
                return false;
            }
            do {
                c1236cM5077u = c1236cM5077u.m5077u();
                c1236cM5077u2 = c1236cM5077u2.m5077u();
                if (!c1236cM5077u.m5072p()) {
                    break;
                }
            } while (c1236cM5077u2.m5072p());
            return m4080b(c1236cM5077u, c1236cM5077u2);
        }
        return true;
    }
}
