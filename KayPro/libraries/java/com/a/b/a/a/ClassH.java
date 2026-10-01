package com.a.b.a.a;

import com.a.b.g.ClassU;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttInnerClasses;

public final class ClassH extends Abstractu {

    private final ClassX f1748a;

    public ClassH(ClassX c0910x) {
        super(AttInnerClasses.ATTRIBUTE_NAME);
        try {
            if (c0910x.m5516b_()) {
                throw new ClassU("innerClasses.isMutable()");
            }
            this.f1748a = c0910x;
        } catch (NullPointerException e) {
            throw new NullPointerException("innerClasses == null");
        }
    }

    @Override
    public int mo3765a() {
        return (this.f1748a.m5476d_() * 8) + 8;
    }

    public ClassX m3777b() {
        return this.f1748a;
    }
}
