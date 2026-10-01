package com.a.b.a.a;

import com.a.b.e.a.ClassD;
import com.a.b.g.ClassU;

public abstract class Abstractw extends Abstractu {

    private final ClassD f1757a;

    private final int f1758b;

    public Abstractw(String str, ClassD c1164d, int i) {
        super(str);
        try {
            if (c1164d.m5516b_()) {
                throw new ClassU("parameterAnnotations.isMutable()");
            }
            this.f1757a = c1164d;
            this.f1758b = i;
        } catch (NullPointerException e) {
            throw new NullPointerException("parameterAnnotations == null");
        }
    }

    @Override
    public final int mo3765a() {
        return this.f1758b + 6;
    }

    public final ClassD m3785b() {
        return this.f1757a;
    }
}
