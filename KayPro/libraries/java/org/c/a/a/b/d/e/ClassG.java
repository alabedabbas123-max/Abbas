package org.c.a.a.b.d.e;

public class ClassG extends Abstractm {

    static final boolean f5825c;

    protected String f5826a;

    protected int f5827b;

    static {
        f5825c = !ClassG.class.desiredAssertionStatus();
    }

    public ClassG(String str, int i) {
        this.f5826a = str;
        this.f5827b = i;
    }

    @Override
    public Interfacel mo8143a(int i) {
        if (f5825c || i >= 0) {
            return this.f5827b == i ? this : new ClassG(this.f5826a, i);
        }
        throw new AssertionError();
    }

    @Override
    public void mo8142a(Interfaceu interfaceC2061u) {
        interfaceC2061u.mo8129a(this);
    }

    public String m8144b() {
        return this.f5826a;
    }

    @Override
    public int mo8145d() {
        return this.f5827b;
    }

    @Override
    public String mo8146e() {
        return this.f5826a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClassG c2047g = (ClassG) obj;
        return this.f5827b == c2047g.f5827b && this.f5826a.equals(c2047g.f5826a);
    }

    @Override
    public boolean mo8147f() {
        return true;
    }

    public int hashCode() {
        return (this.f5826a.hashCode() * 31) + this.f5827b;
    }

    public String toString() {
        return "GenericType{" + this.f5826a + "}";
    }
}
