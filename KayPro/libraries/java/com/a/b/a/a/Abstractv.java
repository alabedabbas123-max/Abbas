package com.a.b.a.a;

import com.a.b.a.b.ClassT;
import com.a.b.g.ClassU;

public abstract class Abstractv extends Abstractu {

    private final ClassT f1756a;

    public Abstractv(String str, ClassT c0948t) {
        super(str);
        try {
            if (c0948t.m5516b_()) {
                throw new ClassU("localVariables.isMutable()");
            }
            this.f1756a = c0948t;
        } catch (NullPointerException e) {
            throw new NullPointerException("localVariables == null");
        }
    }

    @Override
    public final int mo3765a() {
        return (this.f1756a.m5476d_() * 10) + 8;
    }

    public final ClassT m3784b() {
        return this.f1756a;
    }
}
