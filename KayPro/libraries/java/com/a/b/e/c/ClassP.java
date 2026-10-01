package com.a.b.e.c;

import androidx.core.app.FrameMetricsAggregator;
import com.a.b.e.d.ClassC;
import com.a.b.g.ClassK;

public final class ClassP extends Abstractt {

    private static final ClassP[] f3177h = new ClassP[FrameMetricsAggregator.EVERY_DURATION];

    public static final ClassP f3170a = m5001a(-1);

    public static final ClassP f3171b = m5001a(0);

    public static final ClassP f3172c = m5001a(1);

    public static final ClassP f3173d = m5001a(2);

    public static final ClassP f3174e = m5001a(3);

    public static final ClassP f3175f = m5001a(4);

    public static final ClassP f3176g = m5001a(5);

    private ClassP(int i) {
        super(i);
    }

    public static ClassP m5001a(int i) {
        int length = (Integer.MAX_VALUE & i) % f3177h.length;
        ClassP c1223p = f3177h[length];
        if (c1223p != null && c1223p.m5002i_() == i) {
            return c1223p;
        }
        ClassP c1223p2 = new ClassP(i);
        f3177h[length] = c1223p2;
        return c1223p2;
    }

    @Override
    public ClassC mo3825a() {
        return ClassC.f3255f;
    }

    @Override
    public String mo3828d() {
        return Integer.toString(mo5016j());
    }

    @Override
    public String mo4943h() {
        return "int";
    }

    public int m5002i_() {
        return mo5016j();
    }

    public String toString() {
        int iJ = mo5016j();
        return "int{0x" + ClassK.m5480a(iJ) + " / " + iJ + '}';
    }
}
