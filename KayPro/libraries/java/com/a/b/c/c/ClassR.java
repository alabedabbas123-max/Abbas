package com.a.b.c.c;

import com.a.b.c.b.ClassU;
import java.util.Comparator;

class ClassR implements Comparator {

    final ClassP f2499a;

    ClassR(ClassP c1109p) {
        this.f2499a = c1109p;
    }

    @Override
    public int compare(ClassU c1053u, ClassU c1053u2) {
        return c1053u.m4443g() - c1053u2.m4443g();
    }

    @Override
    public boolean equals(Object obj) {
        return obj == this;
    }
}
