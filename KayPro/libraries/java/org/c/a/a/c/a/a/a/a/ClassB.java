package org.c.a.a.c.a.a.a.a;

import java.util.HashSet;
import org.c.a.a.d.ClassC;

public class ClassB {

    protected String f5983a;

    protected ClassC f5984b;

    protected ClassA f5985c;

    public ClassB(String str, ClassA c2085a) {
        this.f5983a = str;
        this.f5985c = c2085a;
    }

    public String m8238a() {
        return this.f5983a;
    }

    public void m8239a(String str) {
        if (this.f5984b == null) {
            this.f5984b = new ClassC();
        }
        this.f5984b.add(str);
    }

    public void m8240a(HashSet hashSet, ClassA c2085a) {
        if (hashSet.contains(this.f5985c)) {
            this.f5985c = c2085a;
        }
    }

    public void m8241a(ClassA c2085a) {
        this.f5985c = c2085a;
    }

    public void m8242a(ClassA c2085a, ClassA c2085a2) {
        if (this.f5985c == c2085a) {
            this.f5985c = c2085a2;
        }
    }

    public ClassC m8243b() {
        return this.f5984b;
    }

    public ClassA m8244c() {
        return this.f5985c;
    }

    public String toString() {
        return this.f5984b == null ? "BasicBlock.Handler{" + this.f5983a + " -> " + this.f5985c + "}" : "BasicBlock.Handler{" + this.f5983a + ", " + this.f5984b + " -> " + this.f5985c + "}";
    }
}
