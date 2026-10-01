package org.a.a.a.c;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ClassJ {

    public static final ClassJ f5288a = m7396a(0, 1114111);

    public static final ClassJ f5289b;

    protected List f5290c;

    protected boolean f5291d;

    static {
        f5288a.m7402b(true);
        f5289b = new ClassJ(new int[0]);
        f5289b.m7402b(true);
    }

    public ClassJ(int... iArr) {
        if (iArr == null) {
            this.f5290c = new ArrayList(2);
            return;
        }
        this.f5290c = new ArrayList(iArr.length);
        for (int i : iArr) {
            m7400b(i);
        }
    }

    public static ClassJ m7395a(int i) {
        ClassJ c1773j = new ClassJ(new int[0]);
        c1773j.m7400b(i);
        return c1773j;
    }

    public static ClassJ m7396a(int i, int i2) {
        ClassJ c1773j = new ClassJ(new int[0]);
        c1773j.m7401b(i, i2);
        return c1773j;
    }

    public int m7397a() {
        int size = this.f5290c.size();
        if (size == 1) {
            ClassH c1771h = (ClassH) this.f5290c.get(0);
            return (c1771h.f5287e - c1771h.f5286d) + 1;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            ClassH c1771h2 = (ClassH) this.f5290c.get(i2);
            i += (c1771h2.f5287e - c1771h2.f5286d) + 1;
        }
        return i;
    }

    public String m7398a(boolean z) {
        StringBuilder sb = new StringBuilder();
        if (this.f5290c == null || this.f5290c.isEmpty()) {
            return "{}";
        }
        if (m7397a() > 1) {
            sb.append("{");
        }
        Iterator it = this.f5290c.iterator();
        while (it.hasNext()) {
            ClassH c1771h = (ClassH) it.next();
            int i = c1771h.f5286d;
            int i2 = c1771h.f5287e;
            if (i == i2) {
                if (i == -1) {
                    sb.append("<EOF>");
                } else if (z) {
                    sb.append("'").appendCodePoint(i).append("'");
                } else {
                    sb.append(i);
                }
            } else if (z) {
                sb.append("'").appendCodePoint(i).append("'..'").appendCodePoint(i2).append("'");
            } else {
                sb.append(i).append("..").append(i2);
            }
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        if (m7397a() > 1) {
            sb.append("}");
        }
        return sb.toString();
    }

    protected void m7399a(ClassH c1771h) {
        if (this.f5291d) {
            throw new IllegalStateException("can't alter readonly IntervalSet");
        }
        if (c1771h.f5287e < c1771h.f5286d) {
            return;
        }
        ListIterator listIterator = this.f5290c.listIterator();
        while (listIterator.hasNext()) {
            ClassH c1771h2 = (ClassH) listIterator.next();
            if (c1771h.equals(c1771h2)) {
                return;
            }
            if (c1771h.m7391d(c1771h2) || !c1771h.m7390c(c1771h2)) {
                ClassH c1771hM7392e = c1771h.m7392e(c1771h2);
                listIterator.set(c1771hM7392e);
                while (listIterator.hasNext()) {
                    ClassH c1771h3 = (ClassH) listIterator.next();
                    if (!c1771hM7392e.m7391d(c1771h3) && c1771hM7392e.m7390c(c1771h3)) {
                        return;
                    }
                    listIterator.remove();
                    listIterator.previous();
                    listIterator.set(c1771hM7392e.m7392e(c1771h3));
                    listIterator.next();
                }
                return;
            }
            if (c1771h.m7388a(c1771h2)) {
                listIterator.previous();
                listIterator.add(c1771h);
                return;
            }
        }
        this.f5290c.add(c1771h);
    }

    public void m7400b(int i) {
        if (this.f5291d) {
            throw new IllegalStateException("can't alter readonly IntervalSet");
        }
        m7401b(i, i);
    }

    public void m7401b(int i, int i2) {
        m7399a(ClassH.m7387a(i, i2));
    }

    public void m7402b(boolean z) {
        if (this.f5291d && !z) {
            throw new IllegalStateException("can't alter readonly IntervalSet");
        }
        this.f5291d = z;
    }

    public boolean m7403c(int i) {
        int size = this.f5290c.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            ClassH c1771h = (ClassH) this.f5290c.get(i3);
            int i4 = c1771h.f5286d;
            if (c1771h.f5287e < i) {
                i2 = i3 + 1;
            } else {
                if (i4 <= i) {
                    return true;
                }
                size = i3 - 1;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ClassJ)) {
            return false;
        }
        return this.f5290c.equals(((ClassJ) obj).f5290c);
    }

    public int hashCode() {
        int iM7404a = ClassK.m7404a();
        Iterator it = this.f5290c.iterator();
        while (true) {
            int i = iM7404a;
            if (!it.hasNext()) {
                return ClassK.m7408b(i, this.f5290c.size() * 2);
            }
            ClassH c1771h = (ClassH) it.next();
            iM7404a = ClassK.m7406a(ClassK.m7406a(i, c1771h.f5286d), c1771h.f5287e);
        }
    }

    public String toString() {
        return m7398a(false);
    }
}
