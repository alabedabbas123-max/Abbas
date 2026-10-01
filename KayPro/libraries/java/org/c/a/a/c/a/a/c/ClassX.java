package org.c.a.a.c.a.a.c;

import org.c.a.a.b.a.b.ClassB;
import org.c.a.a.c.b.a.ClassC;

class ClassX implements Interfacez {

    final ClassW f6168a;

    ClassX(ClassW c2168w) {
        this.f6168a = c2168w;
    }

    @Override
    public String mo8638a(ClassC c2207c, String str, String str2) {
        int iM8712c = c2207c.m8712c();
        for (int i = 0; i < iM8712c; i++) {
            int iM8712c2 = c2207c.m8712c();
            c2207c.m8709a(6);
            if (str2.equals((String) this.f6168a.f6165e[((ClassB) this.f6168a.f6165e[iM8712c2]).m7666b()])) {
                return str;
            }
        }
        return null;
    }
}
