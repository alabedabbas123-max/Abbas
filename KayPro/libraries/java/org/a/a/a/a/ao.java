package org.a.a.a.a;

import org.a.a.a.Abstractp;
import org.a.a.a.c.ClassK;

public class ao implements Interfacead {

    private final int f5150a;

    public ao(int i) {
        this.f5150a = i;
    }

    @Override
    public void mo7270a(Abstractp abstractC1790p) {
        abstractC1790p.m7459c(this.f5150a);
    }

    @Override
    public boolean mo7271a() {
        return false;
    }

    public Enumaf m7285b() {
        return Enumaf.TYPE;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ao) && this.f5150a == ((ao) obj).f5150a;
    }

    public int hashCode() {
        return ClassK.m7408b(ClassK.m7406a(ClassK.m7406a(ClassK.m7404a(), m7285b().ordinal()), this.f5150a), 2);
    }

    public String toString() {
        return String.format("type(%d)", Integer.valueOf(this.f5150a));
    }
}
