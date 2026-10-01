package org.c.a.a.b.d.a;

import org.c.a.a.b.d.b.Abstractn;

public class ClassP implements Interfaceaj {

    protected Abstractn f5664a;

    public ClassP(Abstractn abstractC1978n) {
        this.f5664a = abstractC1978n;
    }

    public Abstractn m7920a() {
        return this.f5664a;
    }

    @Override
    public void mo7869a(Interfacem interfaceC1937m) {
        interfaceC1937m.mo7776a(this);
    }

    public void m7921a(Abstractn abstractC1978n) {
        this.f5664a = abstractC1978n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassP)) {
            return false;
        }
        ClassP c1940p = (ClassP) obj;
        if (this.f5664a != null) {
            if (this.f5664a.equals(c1940p.f5664a)) {
                return true;
            }
        } else if (c1940p.f5664a == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f5664a != null) {
            return this.f5664a.hashCode();
        }
        return 0;
    }
}
