package com.a.b.e.a;

import com.a.b.e.c.Abstracta;
import com.a.b.e.c.ad;
import com.a.b.e.c.ae;
import com.a.b.g.ClassT;
import com.a.b.g.Interfacew;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

public final class ClassA extends ClassT implements Interfacew, Comparable {

    private final ae f2817a;

    private final Enumb f2818b;

    private final TreeMap f2819c;

    public ClassA(ae c1205ae, Enumb enumC1162b) {
        if (c1205ae == null) {
            throw new NullPointerException("type == null");
        }
        if (enumC1162b == null) {
            throw new NullPointerException("visibility == null");
        }
        this.f2817a = c1205ae;
        this.f2818b = enumC1162b;
        this.f2819c = new TreeMap();
    }

    @Override
    public int compareTo(ClassA c1161a) {
        int iA = this.f2817a.compareTo((Abstracta) c1161a.f2817a);
        if (iA != 0) {
            return iA;
        }
        int iCompareTo = this.f2818b.compareTo(c1161a.f2818b);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        Iterator it = this.f2819c.values().iterator();
        Iterator it2 = c1161a.f2819c.values().iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iCompareTo2 = ((ClassE) it.next()).compareTo((ClassE) it2.next());
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
        }
        if (it.hasNext()) {
            return 1;
        }
        return it2.hasNext() ? -1 : 0;
    }

    public void m4708a(ClassE c1165e) {
        m5518l();
        if (c1165e == null) {
            throw new NullPointerException("pair == null");
        }
        this.f2819c.put(c1165e.m4724a(), c1165e);
    }

    public ae m4709b() {
        return this.f2817a;
    }

    public void m4710b(ClassE c1165e) {
        m5518l();
        if (c1165e == null) {
            throw new NullPointerException("pair == null");
        }
        ad c1204adM4724a = c1165e.m4724a();
        if (this.f2819c.get(c1204adM4724a) != null) {
            throw new IllegalArgumentException("name already added: " + c1204adM4724a);
        }
        this.f2819c.put(c1204adM4724a, c1165e);
    }

    @Override
    public String mo3828d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2818b.mo3828d());
        sb.append("-annotation ");
        sb.append(this.f2817a.mo3828d());
        sb.append(" {");
        boolean z = true;
        for (ClassE c1165e : this.f2819c.values()) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(c1165e.m4724a().mo3828d());
            sb.append(": ");
            sb.append(c1165e.m4725b().mo3828d());
        }
        sb.append("}");
        return sb.toString();
    }

    public Enumb m4711e() {
        return this.f2818b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ClassA)) {
            return false;
        }
        ClassA c1161a = (ClassA) obj;
        if (this.f2817a.equals(c1161a.f2817a) && this.f2818b == c1161a.f2818b) {
            return this.f2819c.equals(c1161a.f2819c);
        }
        return false;
    }

    public Collection m4712f() {
        return Collections.unmodifiableCollection(this.f2819c.values());
    }

    public int hashCode() {
        return (((this.f2817a.hashCode() * 31) + this.f2819c.hashCode()) * 31) + this.f2818b.hashCode();
    }

    public String toString() {
        return mo3828d();
    }
}
