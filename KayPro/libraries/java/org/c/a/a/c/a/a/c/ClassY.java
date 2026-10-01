package org.c.a.a.c.a.a.c;

import org.c.a.a.b.a.b.ClassB;
import org.c.a.a.c.b.a.ClassC;

class ClassY implements Interfacez {

    final ClassW f6169a;

    ClassY(ClassW c2168w) {
        this.f6169a = c2168w;
    }

    @Override
    public String mo8638a(ClassC c2207c, String str, String str2) {
        int iM8712c = c2207c.m8712c();
        for (int i = 0; i < iM8712c; i++) {
            int iM8712c2 = c2207c.m8712c();
            int iM8712c3 = c2207c.m8712c();
            c2207c.m8709a(4);
            if (((String) this.f6169a.f6165e[((ClassB) this.f6169a.f6165e[iM8712c2]).m7666b()]).equals(str)) {
                if (iM8712c3 != 0) {
                    return (String) this.f6169a.f6165e[((ClassB) this.f6169a.f6165e[iM8712c3]).m7666b()];
                }
                int iLastIndexOf = str.lastIndexOf(36);
                if (iLastIndexOf == -1) {
                    return null;
                }
                return this.f6169a.m8623a(str.substring(0, iLastIndexOf), str, this.f6169a.f6166f);
            }
        }
        return null;
    }
}
