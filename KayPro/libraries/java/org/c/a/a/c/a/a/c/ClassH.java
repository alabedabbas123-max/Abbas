package org.c.a.a.c.a.a.c;

import java.util.HashSet;
import org.c.a.a.c.a.a.a.a.ClassA;
import org.c.a.a.c.a.a.a.a.ClassF;

public class ClassH {
    public static void m8530a(ClassF c2090f) {
        for (ClassA c2085a : c2090f.m8261b()) {
            if (c2085a.m8216c() == 67108864) {
                ClassA c2085aM8227h = c2085a.m8227h();
                if (c2085a == c2085aM8227h) {
                    c2085a.m8234o().remove(c2085a);
                    c2085a.m8206a(134217728);
                } else {
                    HashSet hashSetM8234o = c2085aM8227h.m8234o();
                    hashSetM8234o.remove(c2085a);
                    for (ClassA c2085a2 : c2085a.m8234o()) {
                        c2085a2.m8210a(c2085a, c2085aM8227h);
                        hashSetM8234o.add(c2085a2);
                    }
                    c2085a.m8206a(0);
                }
            }
        }
    }
}
