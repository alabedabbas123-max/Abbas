package com.a.b.e.a;

import com.a.b.e.c.ae;
import com.a.b.g.ClassT;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

public final class ClassC extends ClassT implements Comparable {

    public static final ClassC f2826a = new ClassC();

    private final TreeMap f2827b = new TreeMap();

    static {
        f2826a.mo3944c_();
    }

    public static ClassC m4713a(ClassC c1163c, ClassA c1161a) {
        ClassC c1163c2 = new ClassC();
        c1163c2.m4718b(c1163c);
        c1163c2.m4716a(c1161a);
        c1163c2.mo3944c_();
        return c1163c2;
    }

    public static ClassC m4714a(ClassC c1163c, ClassC c1163c2) {
        ClassC c1163c3 = new ClassC();
        c1163c3.m4718b(c1163c);
        c1163c3.m4718b(c1163c2);
        c1163c3.mo3944c_();
        return c1163c3;
    }

    @Override
    public int compareTo(ClassC c1163c) {
        Iterator it = this.f2827b.values().iterator();
        Iterator it2 = c1163c.f2827b.values().iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iCompareTo = ((ClassA) it.next()).compareTo((ClassA) it2.next());
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (it.hasNext()) {
            return 1;
        }
        return it2.hasNext() ? -1 : 0;
    }

    public void m4716a(ClassA c1161a) {
        m5518l();
        if (c1161a == null) {
            throw new NullPointerException("annotation == null");
        }
        ae c1205aeM4709b = c1161a.m4709b();
        if (this.f2827b.containsKey(c1205aeM4709b)) {
            throw new IllegalArgumentException("duplicate type: " + c1205aeM4709b.mo3828d());
        }
        this.f2827b.put(c1205aeM4709b, c1161a);
    }

    public int m4717b() {
        return this.f2827b.size();
    }

    public void m4718b(ClassC c1163c) {
        m5518l();
        if (c1163c == null) {
            throw new NullPointerException("toAdd == null");
        }
        Iterator it = c1163c.f2827b.values().iterator();
        while (it.hasNext()) {
            m4716a((ClassA) it.next());
        }
    }

    public Collection m4719d() {
        return Collections.unmodifiableCollection(this.f2827b.values());
    }

    public boolean equals(Object obj) {
        if (obj instanceof ClassC) {
            return this.f2827b.equals(((ClassC) obj).f2827b);
        }
        return false;
    }

    public int hashCode() {
        return this.f2827b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("annotations{");
        boolean z = true;
        for (ClassA c1161a : this.f2827b.values()) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(c1161a.mo3828d());
        }
        sb.append("}");
        return sb.toString();
    }
}
