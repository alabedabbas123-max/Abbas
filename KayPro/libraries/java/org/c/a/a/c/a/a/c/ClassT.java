package org.c.a.a.c.a.a.c;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.c.a.a.b.d.a.ab;
import org.c.a.a.c.a.a.a.b.a.Interfacek;

public class ClassT {

    protected static final ClassU f6159a = new ClassU();

    public static ab m8617a(List list, List list2, List list3) {
        int size = list != null ? list.size() : 0;
        if (list2 != null) {
            size += list2.size();
        }
        if (list3 != null) {
            size += list3.size();
        }
        ab c1917ab = new ab(size);
        m8619a(c1917ab, list);
        m8619a(c1917ab, list2);
        m8619a(c1917ab, list3);
        return c1917ab;
    }

    protected static void m8618a(List list) {
        char c;
        Iterator it = list.iterator();
        int i = 0;
        char c2 = 0;
        while (it.hasNext()) {
            int iMo8269q_ = ((Interfacek) it.next()).mo8269q_();
            if (iMo8269q_ > 0 && iMo8269q_ != i) {
                if (i <= 0) {
                    c = c2;
                } else if (c2 == 0) {
                    c = iMo8269q_ > i ? (char) 1 : (char) 2;
                } else if (c2 == 1) {
                    if (iMo8269q_ < i) {
                        c2 = 3;
                        break;
                    }
                    c = c2;
                } else {
                    if (c2 == 2 && iMo8269q_ > i) {
                        c2 = 3;
                        break;
                    }
                    c = c2;
                }
                c2 = c;
                i = iMo8269q_;
            }
        }
        switch (c2) {
            case 2:
                Collections.reverse(list);
                break;
            case 3:
                Collections.sort(list, f6159a);
                break;
        }
    }

    protected static void m8619a(List list, List list2) {
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        m8618a(list2);
        if (list.isEmpty()) {
            list.addAll(list2);
            return;
        }
        int size = list.size();
        int size2 = list2.size();
        int i = 0;
        int i2 = 0;
        int i3 = size;
        int i4 = 0;
        int iMo8269q_ = 0;
        while (i < size2) {
            while (true) {
                if (i >= size2) {
                    iMo8269q_ = iMo8269q_;
                    break;
                }
                int i5 = i + 1;
                iMo8269q_ = ((Interfacek) list2.get(i)).mo8269q_();
                if (iMo8269q_ > 0) {
                    i = i5;
                    iMo8269q_ = iMo8269q_;
                    break;
                }
                i = i5;
            }
            if (iMo8269q_ == 0) {
                list.addAll(list2.subList(i2, i));
            } else {
                while (i4 < i3 && ((Interfacek) list.get(i4)).mo8269q_() <= iMo8269q_) {
                    i4++;
                }
                list.addAll(i4, list2.subList(i2, i));
                int i6 = i - i2;
                i4 += i6;
                i2 = i;
                i3 = i6 + i3;
            }
        }
    }
}
