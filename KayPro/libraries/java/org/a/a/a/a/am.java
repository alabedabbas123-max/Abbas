package org.a.a.a.a;

import org.a.a.a.Abstractp;
import org.a.a.a.c.ClassK;

public final class am implements Interfacead {

    private final int f5148a;

    public am(int i) {
        this.f5148a = i;
    }

    @Override
    public void mo7270a(Abstractp abstractC1790p) {
        abstractC1790p.m7456b(this.f5148a);
    }

    @Override
    public boolean mo7271a() {
        return false;
    }

    public Enumaf m7283b() {
        return Enumaf.PUSH_MODE;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof am) && this.f5148a == ((am) obj).f5148a;
    }

    public int hashCode() {
        return ClassK.m7408b(ClassK.m7406a(ClassK.m7406a(ClassK.m7404a(), m7283b().ordinal()), this.f5148a), 2);
    }

    public String toString() {
        return String.format("pushMode(%d)", Integer.valueOf(this.f5148a));
    }
}
