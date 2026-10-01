package com.a.b.a.a;

import com.a.b.e.c.Abstracta;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttAnnotationDefault;

public final class ClassA extends Abstractu {

    private final Abstracta f1735a;

    private final int f1736b;

    public ClassA(Abstracta abstractC1200a, int i) {
        super(AttAnnotationDefault.ATTRIBUTE_NAME);
        if (abstractC1200a == null) {
            throw new NullPointerException("value == null");
        }
        this.f1735a = abstractC1200a;
        this.f1736b = i;
    }

    @Override
    public int mo3765a() {
        return this.f1736b + 6;
    }

    public Abstracta m3766b() {
        return this.f1735a;
    }
}
