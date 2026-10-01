package com.a.b.a.a;

import com.a.b.a.b.ClassD;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttBootstrapMethods;

public class ClassB extends Abstractu {

    private final ClassD f1737a;

    private final int f1738b;

    public ClassB(ClassD c0932d) {
        super(AttBootstrapMethods.ATTRIBUTE_NAME);
        this.f1737a = c0932d;
        int iD_ = (c0932d.m5476d_() * 4) + 8;
        for (int i = 0; i < c0932d.m5476d_(); i++) {
            iD_ += c0932d.m3956a(i).m3960b().m5476d_() * 2;
        }
        this.f1738b = iD_;
    }

    @Override
    public int mo3765a() {
        return this.f1738b;
    }

    public ClassD m3767b() {
        return this.f1737a;
    }
}
