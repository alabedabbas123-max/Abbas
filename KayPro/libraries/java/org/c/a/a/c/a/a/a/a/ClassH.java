package org.c.a.a.c.a.a.a.a;

import java.util.HashSet;
import java.util.Iterator;

public class ClassH {

    protected ClassA f5994a;

    protected HashSet f5995b;

    protected ClassA f5996c;

    public ClassH(ClassA c2085a, HashSet hashSet, ClassA c2085a2) {
        this.f5994a = c2085a;
        this.f5995b = hashSet;
        this.f5996c = c2085a2;
    }

    public ClassA m8264a() {
        return this.f5994a;
    }

    public void m8265a(ClassA c2085a) {
        this.f5994a = c2085a;
    }

    public HashSet m8266b() {
        return this.f5995b;
    }

    public void m8267b(ClassA c2085a) {
        this.f5996c = c2085a;
    }

    public ClassA m8268c() {
        return this.f5996c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClassH c2092h = (ClassH) obj;
        if (!this.f5994a.equals(c2092h.f5994a) || !this.f5995b.equals(c2092h.f5995b)) {
            return false;
        }
        if (this.f5996c != null) {
            if (!this.f5996c.equals(c2092h.f5996c)) {
                return false;
            }
        } else if (c2092h.f5996c != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f5996c != null ? this.f5996c.hashCode() : 0) + (((this.f5994a.hashCode() * 31) + this.f5995b.hashCode()) * 31);
    }

    public String toString() {
        String str = "Loop{start=" + this.f5994a.m8213b() + ", members=[";
        if (this.f5995b != null && !this.f5995b.isEmpty()) {
            Iterator it = this.f5995b.iterator();
            str = String.valueOf(str) + ((ClassA) it.next()).m8213b();
            while (it.hasNext()) {
                str = String.valueOf(str) + ", " + ((ClassA) it.next()).m8213b();
            }
        }
        return String.valueOf(str) + "], end=" + (this.f5996c == null ? "" : Integer.valueOf(this.f5996c.m8213b())) + "}";
    }
}
