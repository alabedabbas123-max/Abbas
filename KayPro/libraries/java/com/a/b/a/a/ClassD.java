package com.a.b.a.a;

import com.a.b.e.c.Abstractag;
import com.a.b.e.c.ad;
import com.a.b.e.c.ClassL;
import com.a.b.e.c.ClassO;
import com.a.b.e.c.ClassP;
import com.a.b.e.c.ClassW;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttConstantValue;

public final class ClassD extends Abstractu {

    private final Abstractag f1744a;

    public ClassD(Abstractag abstractC1207ag) {
        super(AttConstantValue.ATTRIBUTE_NAME);
        if ((abstractC1207ag instanceof ad) || (abstractC1207ag instanceof ClassP) || (abstractC1207ag instanceof ClassW) || (abstractC1207ag instanceof ClassO) || (abstractC1207ag instanceof ClassL)) {
            this.f1744a = abstractC1207ag;
        } else {
            if (abstractC1207ag != null) {
                throw new IllegalArgumentException("bad type for constantValue");
            }
            throw new NullPointerException("constantValue == null");
        }
    }

    @Override
    public int mo3765a() {
        return 8;
    }

    public Abstractag m3773b() {
        return this.f1744a;
    }
}
