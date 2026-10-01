package org.c.a.a.c.a.a.a.a;

import java.util.HashSet;

public class ClassE {

    protected int f5986a;

    protected int f5987b;

    protected ClassA f5988c;

    protected boolean f5989d = false;

    public ClassE(int i, ClassA c2085a) {
        this.f5986a = i;
        this.f5987b = c2085a.m8219d();
        this.f5988c = c2085a;
    }

    public ClassE(ClassA c2085a) {
        this.f5987b = c2085a.m8219d();
        this.f5988c = c2085a;
    }

    public int m8246a() {
        return this.f5986a;
    }

    public void m8247a(HashSet hashSet, ClassA c2085a) {
        if (hashSet.contains(this.f5988c)) {
            this.f5988c = c2085a;
        }
    }

    public void m8248a(ClassA c2085a) {
        this.f5988c = c2085a;
    }

    public void m8249a(ClassA c2085a, ClassA c2085a2) {
        if (this.f5988c == c2085a) {
            this.f5988c = c2085a2;
        }
    }

    public int m8250b() {
        return this.f5987b;
    }

    public ClassA m8251c() {
        return this.f5988c;
    }

    public boolean m8252d() {
        return this.f5989d;
    }

    public String toString() {
        return this.f5989d ? "BasicBlock.SwitchCase{default: " + this.f5988c + "}" : "BasicBlock.SwitchCase{'" + this.f5986a + "': " + this.f5988c + "}";
    }
}
