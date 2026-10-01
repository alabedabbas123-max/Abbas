package com.a.b.e.d;

import com.a.b.g.ClassJ;

public final class ClassB extends ClassJ implements Interfacee {

    public static final ClassB f3210a = new ClassB(0);

    public static final ClassB f3211b = m5051b(ClassC.f3255f);

    public static final ClassB f3212c = m5051b(ClassC.f3256g);

    public static final ClassB f3213d = m5051b(ClassC.f3254e);

    public static final ClassB f3214e = m5051b(ClassC.f3253d);

    public static final ClassB f3215f = m5051b(ClassC.f3267r);

    public static final ClassB f3216g = m5051b(ClassC.f3260k);

    public static final ClassB f3217h = m5051b(ClassC.f3270u);

    public static final ClassB f3218i = m5044a(ClassC.f3255f, ClassC.f3255f);

    public static final ClassB f3219j = m5044a(ClassC.f3256g, ClassC.f3256g);

    public static final ClassB f3220k = m5044a(ClassC.f3254e, ClassC.f3254e);

    public static final ClassB f3221l = m5044a(ClassC.f3253d, ClassC.f3253d);

    public static final ClassB f3222m = m5044a(ClassC.f3267r, ClassC.f3267r);

    public static final ClassB f3223n = m5044a(ClassC.f3255f, ClassC.f3267r);

    public static final ClassB f3224o = m5044a(ClassC.f3256g, ClassC.f3267r);

    public static final ClassB f3225p = m5044a(ClassC.f3254e, ClassC.f3267r);

    public static final ClassB f3226q = m5044a(ClassC.f3253d, ClassC.f3267r);

    public static final ClassB f3227r = m5044a(ClassC.f3256g, ClassC.f3255f);

    public static final ClassB f3228s = m5044a(ClassC.f3245J, ClassC.f3255f);

    public static final ClassB f3229t = m5044a(ClassC.f3246K, ClassC.f3255f);

    public static final ClassB f3230u = m5044a(ClassC.f3244I, ClassC.f3255f);

    public static final ClassB f3231v = m5044a(ClassC.f3243H, ClassC.f3255f);

    public static final ClassB f3232w = m5044a(ClassC.f3247L, ClassC.f3255f);

    public static final ClassB f3233x = m5044a(ClassC.f3240E, ClassC.f3255f);

    public static final ClassB f3234y = m5044a(ClassC.f3241F, ClassC.f3255f);

    public static final ClassB f3235z = m5044a(ClassC.f3242G, ClassC.f3255f);

    public static final ClassB f3200A = m5044a(ClassC.f3248M, ClassC.f3255f);

    public static final ClassB f3201B = m5045a(ClassC.f3255f, ClassC.f3245J, ClassC.f3255f);

    public static final ClassB f3202C = m5045a(ClassC.f3256g, ClassC.f3246K, ClassC.f3255f);

    public static final ClassB f3203D = m5045a(ClassC.f3254e, ClassC.f3244I, ClassC.f3255f);

    public static final ClassB f3204E = m5045a(ClassC.f3253d, ClassC.f3243H, ClassC.f3255f);

    public static final ClassB f3205F = m5045a(ClassC.f3267r, ClassC.f3247L, ClassC.f3255f);

    public static final ClassB f3206G = m5045a(ClassC.f3255f, ClassC.f3240E, ClassC.f3255f);

    public static final ClassB f3207H = m5045a(ClassC.f3255f, ClassC.f3241F, ClassC.f3255f);

    public static final ClassB f3208I = m5045a(ClassC.f3255f, ClassC.f3242G, ClassC.f3255f);

    public static final ClassB f3209J = m5045a(ClassC.f3255f, ClassC.f3248M, ClassC.f3255f);

    public ClassB(int i) {
        super(i);
    }

    public static ClassB m5044a(ClassC c1236c, ClassC c1236c2) {
        ClassB c1235b = new ClassB(2);
        c1235b.m5052a(0, c1236c);
        c1235b.m5052a(1, c1236c2);
        return c1235b;
    }

    public static ClassB m5045a(ClassC c1236c, ClassC c1236c2, ClassC c1236c3) {
        ClassB c1235b = new ClassB(3);
        c1235b.m5052a(0, c1236c);
        c1235b.m5052a(1, c1236c2);
        c1235b.m5052a(2, c1236c3);
        return c1235b;
    }

    public static ClassB m5046a(ClassC c1236c, ClassC c1236c2, ClassC c1236c3, ClassC c1236c4) {
        ClassB c1235b = new ClassB(4);
        c1235b.m5052a(0, c1236c);
        c1235b.m5052a(1, c1236c2);
        c1235b.m5052a(2, c1236c3);
        c1235b.m5052a(3, c1236c4);
        return c1235b;
    }

    public static String m5047a(Interfacee interfaceC1238e) {
        int iMo4148d_ = interfaceC1238e.mo4148d_();
        if (iMo4148d_ == 0) {
            return "<empty>";
        }
        StringBuilder sb = new StringBuilder(100);
        for (int i = 0; i < iMo4148d_; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(interfaceC1238e.mo4145a(i).mo3828d());
        }
        return sb.toString();
    }

    public static boolean m5048a(Interfacee interfaceC1238e, Interfacee interfaceC1238e2) {
        int iMo4148d_ = interfaceC1238e.mo4148d_();
        if (interfaceC1238e2.mo4148d_() != iMo4148d_) {
            return false;
        }
        for (int i = 0; i < iMo4148d_; i++) {
            if (!interfaceC1238e.mo4145a(i).equals(interfaceC1238e2.mo4145a(i))) {
                return false;
            }
        }
        return true;
    }

    public static int m5049b(Interfacee interfaceC1238e) {
        int iMo4148d_ = interfaceC1238e.mo4148d_();
        int iHashCode = 0;
        for (int i = 0; i < iMo4148d_; i++) {
            iHashCode = (iHashCode * 31) + interfaceC1238e.mo4145a(i).hashCode();
        }
        return iHashCode;
    }

    public static int m5050b(Interfacee interfaceC1238e, Interfacee interfaceC1238e2) {
        int iMo4148d_ = interfaceC1238e.mo4148d_();
        int iMo4148d_2 = interfaceC1238e2.mo4148d_();
        int iMin = Math.min(iMo4148d_, iMo4148d_2);
        for (int i = 0; i < iMin; i++) {
            int iCompareTo = interfaceC1238e.mo4145a(i).compareTo(interfaceC1238e2.mo4145a(i));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (iMo4148d_ == iMo4148d_2) {
            return 0;
        }
        return iMo4148d_ < iMo4148d_2 ? -1 : 1;
    }

    public static ClassB m5051b(ClassC c1236c) {
        ClassB c1235b = new ClassB(1);
        c1235b.m5052a(0, c1236c);
        return c1235b;
    }

    @Override
    public ClassC mo4145a(int i) {
        return m5053b(i);
    }

    @Override
    public Interfacee mo4146a(ClassC c1236c) {
        int iD_ = m5476d_();
        ClassB c1235b = new ClassB(iD_ + 1);
        for (int i = 0; i < iD_; i++) {
            c1235b.m5474a(i, m5477e(i));
        }
        c1235b.m5052a(iD_, c1236c);
        c1235b.mo3944c_();
        return c1235b;
    }

    public void m5052a(int i, ClassC c1236c) {
        m5474a(i, (Object) c1236c);
    }

    public ClassC m5053b(int i) {
        return (ClassC) m5477e(i);
    }

    public ClassB m5054c(ClassC c1236c) {
        int iD_ = m5476d_();
        ClassB c1235b = new ClassB(iD_ + 1);
        c1235b.m5474a(0, (Object) c1236c);
        for (int i = 0; i < iD_; i++) {
            c1235b.m5474a(i + 1, m5478f(i));
        }
        return c1235b;
    }

    public int m5055e() {
        int iD_ = m5476d_();
        int iM5066j = 0;
        for (int i = 0; i < iD_; i++) {
            iM5066j += m5053b(i).m5066j();
        }
        return iM5066j;
    }
}
