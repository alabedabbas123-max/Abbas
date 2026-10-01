package org.c.a.a.b.d.e;

public class ClassH extends ClassI {

    static final boolean f5828b;

    protected ClassI f5829a;

    static {
        f5828b = !ClassH.class.desiredAssertionStatus();
    }

    public ClassH(String str, String str2, String str3, Interfacee interfaceC2045e, int i, ClassI c2049i) {
        super(str, str2, str3, interfaceC2045e, i);
        this.f5829a = c2049i;
        if (!f5828b && str3 != null && Character.isDigit(str3.charAt(0)) && str2 != null) {
            throw new AssertionError();
        }
    }

    public ClassH(String str, String str2, String str3, Interfacee interfaceC2045e, ClassI c2049i) {
        super(str, str2, str3, interfaceC2045e);
        this.f5829a = c2049i;
        if (!f5828b && str3 != null && Character.isDigit(str3.charAt(0)) && str2 != null) {
            throw new AssertionError();
        }
    }

    public ClassH(String str, String str2, String str3, ClassI c2049i) {
        super(str, str2, str3);
        this.f5829a = c2049i;
        if (!f5828b && str3 != null && Character.isDigit(str3.charAt(0)) && str2 != null) {
            throw new AssertionError();
        }
    }

    @Override
    public ClassI mo8148a(Interfacee interfaceC2045e) {
        return new ClassH(this.f5845q, this.f5846r, this.f5847s, interfaceC2045e, this.f5849u, this.f5829a);
    }

    @Override
    public Interfacel mo8143a(int i) {
        if (f5828b || i >= 0) {
            return new ClassH(this.f5845q, this.f5846r, this.f5847s, this.f5848t, i, this.f5829a);
        }
        throw new AssertionError();
    }

    @Override
    public void mo8142a(Interfaceu interfaceC2061u) {
        interfaceC2061u.mo8130a(this);
    }

    public ClassI m8149b() {
        return this.f5829a;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClassH) && super.equals(obj) && this.f5829a.equals(((ClassH) obj).f5829a);
    }

    @Override
    public int hashCode() {
        return (super.hashCode() * 31) + this.f5829a.hashCode();
    }

    @Override
    public String toString() {
        return this.f5848t == null ? "InnerObjectType{" + this.f5829a.toString() + "." + this.f5850v + "}" : "InnerObjectType{" + this.f5829a.toString() + "." + this.f5850v + "<" + this.f5848t + ">}";
    }
}
