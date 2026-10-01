package com.a.b.a.a;

import com.a.b.e.a.ClassC;
import com.a.b.g.ClassU;

public abstract class Abstractt extends Abstractu {

    private final ClassC f1753a;

    private final int f1754b;

    public Abstractt(String str, ClassC c1163c, int i) {
        super(str);
        try {
            if (c1163c.m5516b_()) {
                throw new ClassU("annotations.isMutable()");
            }
            this.f1753a = c1163c;
            this.f1754b = i;
        } catch (NullPointerException e) {
            throw new NullPointerException("annotations == null");
        }
    }

    @Override
    public final int mo3765a() {
        return this.f1754b + 6;
    }

    public final ClassC m3782b() {
        return this.f1753a;
    }
}
