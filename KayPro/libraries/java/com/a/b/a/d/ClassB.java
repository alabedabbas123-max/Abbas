package com.a.b.a.d;

import com.a.b.a.a.ClassZ;
import com.a.b.a.e.ClassI;
import com.a.b.a.e.Interfacea;
import com.a.b.a.e.Interfacej;
import com.a.b.e.c.ad;
import com.a.b.e.c.Interfaceb;
import com.a.b.g.ClassE;
import com.a.b.g.ClassK;

public class ClassB {
    public final Interfacea m4108a(ClassE c0960e, int i, int i2, Interfacej interfaceC0975j) {
        if (c0960e == null) {
            throw new NullPointerException("cf == null");
        }
        if (i < 0 || i >= 4) {
            throw new IllegalArgumentException("bad context");
        }
        ad c1204ad = null;
        try {
            ClassE c1307eM4130b = c0960e.m4130b();
            Interfaceb interfaceC1209bM4135g = c0960e.m4135g();
            int iM5446f = c1307eM4130b.m5446f(i2);
            int iM5442c = c1307eM4130b.m5442c(i2 + 2);
            c1204ad = (ad) interfaceC1209bM4135g.mo4971a(iM5446f);
            if (interfaceC0975j != null) {
                interfaceC0975j.m4195a(c1307eM4130b, i2, 2, "name: " + c1204ad.mo3828d());
                interfaceC0975j.m4195a(c1307eM4130b, i2 + 2, 4, "length: " + ClassK.m5480a(iM5442c));
            }
            return mo4109a(c0960e, i, c1204ad.m4958j(), i2 + 6, iM5442c, interfaceC0975j);
        } catch (ClassI e) {
            e.m3757a("...while parsing " + (c1204ad != null ? String.valueOf(c1204ad.mo3828d()) + " " : "") + "attribute at offset " + ClassK.m5480a(i2));
            throw e;
        }
    }

    protected Interfacea mo4109a(ClassE c0960e, int i, String str, int i2, int i3, Interfacej interfaceC0975j) {
        ClassE c1307eM4130b = c0960e.m4130b();
        ClassZ c0912z = new ClassZ(str, c1307eM4130b, i2, i3, c0960e.m4135g());
        if (interfaceC0975j != null) {
            interfaceC0975j.m4195a(c1307eM4130b, i2, i3, "attribute data");
        }
        return c0912z;
    }
}
