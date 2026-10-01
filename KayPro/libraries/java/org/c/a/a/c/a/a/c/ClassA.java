package org.c.a.a.c.a.a.c;

import java.util.Iterator;
import java.util.List;
import org.c.a.a.b.d.a.ClassS;
import org.c.a.a.c.a.a.a.b.a.ClassH;

public class ClassA {
    public static void m8401a(List list) {
        int size;
        int i;
        int i2;
        int i3;
        int i4;
        ClassH c2100h;
        int i5 = 1;
        int i6 = 0;
        if (list == null || (size = list.size()) <= 1) {
            return;
        }
        ClassH c2100h2 = (ClassH) list.get(0);
        int i7 = 0;
        while (i5 < size) {
            ClassH c2100h3 = (ClassH) list.get(i5);
            if (c2100h2.mo8269q_() != 0 && c2100h2.m7922a() == c2100h3.m7922a() && c2100h2.m7924c().equals(c2100h3.m7924c())) {
                int iMo8269q_ = c2100h3.mo8269q_();
                if (iMo8269q_ <= 0) {
                    i4 = i5;
                    c2100h = c2100h2;
                    i = i6;
                    i2 = i7;
                    i3 = size;
                } else if (iMo8269q_ == c2100h2.mo8269q_()) {
                    i4 = i5;
                    i2 = i7;
                    i3 = size;
                    ClassH c2100h4 = c2100h2;
                    i = i5;
                    c2100h = c2100h4;
                } else {
                    m8402a(list, c2100h2, i7, i6);
                    int i8 = i6 - i7;
                    int i9 = i5 - i8;
                    i2 = i9;
                    i3 = size - i8;
                    i = i9;
                    c2100h = c2100h3;
                    i4 = i9;
                }
            } else {
                i = i5;
                i2 = i5;
                i3 = size;
                i4 = i5;
                c2100h = c2100h3;
            }
            size = i3;
            i7 = i2;
            i6 = i;
            c2100h2 = c2100h;
            i5 = i4 + 1;
        }
        m8402a(list, c2100h2, i7, i6);
    }

    protected static void m8402a(List list, ClassH c2100h, int i, int i2) {
        if (i < i2) {
            List listSubList = list.subList(i + 1, i2 + 1);
            ClassS c1943s = new ClassS(i2 - i);
            c1943s.add(c2100h.m7925d());
            Iterator it = listSubList.iterator();
            while (it.hasNext()) {
                c1943s.add(((ClassH) it.next()).m7925d());
            }
            c2100h.m8302a(c1943s);
            listSubList.clear();
        }
    }
}
