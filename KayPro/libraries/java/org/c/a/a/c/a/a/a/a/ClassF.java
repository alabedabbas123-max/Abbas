package org.c.a.a.c.a.a.a.a;

import java.util.HashSet;
import org.c.a.a.b.a.ClassD;
import org.c.a.a.d.ClassC;

public class ClassF {

    protected ClassD f5990a;

    protected ClassC f5991b = new ClassG(this);

    protected int[] f5992c = null;

    public ClassF(ClassD c1877d) {
        this.f5990a = c1877d;
    }

    public int m8253a(int i) {
        if (this.f5992c == null) {
            return 0;
        }
        return this.f5992c[i];
    }

    public ClassD m8254a() {
        return this.f5990a;
    }

    public ClassA m8255a(int i, int i2) {
        return m8256a(0, i, i2);
    }

    public ClassA m8256a(int i, int i2, int i3) {
        ClassA c2085a = new ClassA(this, this.f5991b.size(), i, i2, i3, true);
        this.f5991b.add(c2085a);
        return c2085a;
    }

    public ClassA m8257a(int i, int i2, int i3, HashSet hashSet) {
        ClassA c2085a = new ClassA(this, this.f5991b.size(), i, i2, i3, true, hashSet);
        this.f5991b.add(c2085a);
        return c2085a;
    }

    public ClassA m8258a(int i, int i2, int i3, boolean z) {
        ClassA c2085a = new ClassA(this, this.f5991b.size(), i, i2, i3, z);
        this.f5991b.add(c2085a);
        return c2085a;
    }

    public ClassA m8259a(ClassA c2085a) {
        ClassA c2085a2 = new ClassA(this, this.f5991b.size(), c2085a);
        this.f5991b.add(c2085a2);
        return c2085a2;
    }

    public void m8260a(int[] iArr) {
        this.f5992c = iArr;
    }

    public ClassC m8261b() {
        return this.f5991b;
    }

    public ClassA m8262c() {
        return (ClassA) this.f5991b.get(0);
    }
}
