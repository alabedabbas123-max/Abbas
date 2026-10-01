package org.a.a.a.a;

import org.a.a.a.Abstractp;
import org.a.a.a.c.ClassK;

public final class ah implements Interfacead {

    private final int f5141a;

    private final int f5142b;

    public ah(int i, int i2) {
        this.f5141a = i;
        this.f5142b = i2;
    }

    @Override
    public void mo7270a(Abstractp abstractC1790p) {
        abstractC1790p.m7474b(null, this.f5141a, this.f5142b);
    }

    @Override
    public boolean mo7271a() {
        return true;
    }

    public Enumaf m7277b() {
        return Enumaf.CUSTOM;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ah)) {
            return false;
        }
        ah c1693ah = (ah) obj;
        return this.f5141a == c1693ah.f5141a && this.f5142b == c1693ah.f5142b;
    }

    public int hashCode() {
        return ClassK.m7408b(ClassK.m7406a(ClassK.m7406a(ClassK.m7406a(ClassK.m7404a(), m7277b().ordinal()), this.f5141a), this.f5142b), 3);
    }
}
