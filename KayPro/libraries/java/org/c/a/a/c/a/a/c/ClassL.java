package org.c.a.a.c.a.a.c;

import java.util.Comparator;
import org.c.a.a.b.a.a.ClassW;

public class ClassL implements Comparator {
    @Override
    public int compare(ClassW c1858w, ClassW c1858w2) {
        int iM7654a = c1858w.m7654a() - c1858w2.m7654a();
        return iM7654a == 0 ? c1858w.m7655b() - c1858w2.m7655b() : iM7654a;
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj;
    }
}
