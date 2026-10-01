package org.a.a.a.a;

import org.a.a.a.Abstractp;
import org.a.a.a.c.ClassK;

public final class aj implements Interfacead {

    private final int f5145a;

    public aj(int i) {
        this.f5145a = i;
    }

    @Override
    public void mo7270a(Abstractp abstractC1790p) {
        abstractC1790p.m7452a(this.f5145a);
    }

    @Override
    public boolean mo7271a() {
        return false;
    }

    public Enumaf m7280b() {
        return Enumaf.MODE;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof aj) && this.f5145a == ((aj) obj).f5145a;
    }

    public int hashCode() {
        return ClassK.m7408b(ClassK.m7406a(ClassK.m7406a(ClassK.m7404a(), m7280b().ordinal()), this.f5145a), 2);
    }

    public String toString() {
        return String.format("mode(%d)", Integer.valueOf(this.f5145a));
    }
}
