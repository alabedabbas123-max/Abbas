package com.a.b.e.c;

import com.a.b.e.d.ClassC;
import com.a.b.g.ClassK;

public final class ClassW extends Abstractu {

    public static final ClassW f3188a = m5020a(0);

    public static final ClassW f3189b = m5020a(1);

    private ClassW(long j) {
        super(j);
    }

    public static ClassW m5020a(long j) {
        return new ClassW(j);
    }

    @Override
    public ClassC mo3825a() {
        return ClassC.f3256g;
    }

    @Override
    public String mo3828d() {
        return Long.toString(mo5017k());
    }

    @Override
    public String mo4943h() {
        return "long";
    }

    public long m5021n() {
        return mo5017k();
    }

    public String toString() {
        long jK = mo5017k();
        return "long{0x" + ClassK.m5481a(jK) + " / " + jK + '}';
    }
}
