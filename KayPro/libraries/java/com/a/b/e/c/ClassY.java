package com.a.b.e.c;

import com.a.b.e.d.ClassC;

public final class ClassY extends Abstractag {

    private static final String[] f3192a = {"static-put", "static-get", "instance-put", "instance-get", "invoke-static", "invoke-instance", "invoke-constructor", "invoke-direct", "invoke-interface"};

    private final int f3193b;

    private final Abstracta f3194c;

    private ClassY(int i, Abstracta abstractC1200a) {
        this.f3193b = i;
        this.f3194c = abstractC1200a;
    }

    public static ClassY m5024a(int i, Abstracta abstractC1200a) {
        if (m5025a(i)) {
            if (!(abstractC1200a instanceof ClassN)) {
                throw new IllegalArgumentException("ref has wrong type: " + abstractC1200a.getClass());
            }
        } else {
            if (!m5026b(i)) {
                throw new IllegalArgumentException("type is out of range: " + i);
            }
            if (!(abstractC1200a instanceof Abstractf)) {
                throw new IllegalArgumentException("ref has wrong type: " + abstractC1200a.getClass());
            }
        }
        return new ClassY(i, abstractC1200a);
    }

    public static boolean m5025a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
            default:
                return false;
        }
    }

    public static boolean m5026b(int i) {
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static String m5027c(int i) {
        return f3192a[i];
    }

    @Override
    public ClassC mo3825a() {
        return ClassC.f3264o;
    }

    @Override
    protected int mo4941b(Abstracta abstractC1200a) {
        ClassY c1232y = (ClassY) abstractC1200a;
        return m5029j() == c1232y.m5029j() ? m5028i().compareTo(c1232y.m5028i()) : m5029j() - c1232y.m5029j();
    }

    @Override
    public String mo3828d() {
        return String.valueOf(m5027c(this.f3193b)) + "," + this.f3194c.toString();
    }

    @Override
    public boolean mo4942g() {
        return false;
    }

    @Override
    public String mo4943h() {
        return "method handle";
    }

    public Abstracta m5028i() {
        return this.f3194c;
    }

    public int m5029j() {
        return this.f3193b;
    }

    public boolean m5030k() {
        return m5025a(this.f3193b);
    }

    public boolean m5031l() {
        return m5026b(this.f3193b);
    }

    public String toString() {
        return "method-handle{" + mo3828d() + "}";
    }
}
