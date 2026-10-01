package com.a.b.e.c;

import com.a.b.e.d.ClassC;

public final class ClassG extends Abstractt {

    public static final ClassG f3158a = new ClassG(false);

    public static final ClassG f3159b = new ClassG(true);

    private ClassG(boolean z) {
        super(z ? 1 : 0);
    }

    public static ClassG m4987a(int i) {
        if (i == 0) {
            return f3158a;
        }
        if (i == 1) {
            return f3159b;
        }
        throw new IllegalArgumentException("bogus value: " + i);
    }

    @Override
    public ClassC mo3825a() {
        return ClassC.f3250a;
    }

    @Override
    public String mo3828d() {
        return m4988h_() ? "true" : "false";
    }

    @Override
    public String mo4943h() {
        return "boolean";
    }

    public boolean m4988h_() {
        return mo5016j() != 0;
    }

    public String toString() {
        return m4988h_() ? "boolean{true}" : "boolean{false}";
    }
}
