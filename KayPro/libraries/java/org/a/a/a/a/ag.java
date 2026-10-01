package org.a.a.a.a;

import org.a.a.a.Abstractp;
import org.a.a.a.c.ClassK;

public final class ag implements Interfacead {

    private final int f5140a;

    public ag(int i) {
        this.f5140a = i;
    }

    @Override
    public void mo7270a(Abstractp abstractC1790p) {
        abstractC1790p.m7461d(this.f5140a);
    }

    @Override
    public boolean mo7271a() {
        return false;
    }

    public Enumaf m7276b() {
        return Enumaf.CHANNEL;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ag) && this.f5140a == ((ag) obj).f5140a;
    }

    public int hashCode() {
        return ClassK.m7408b(ClassK.m7406a(ClassK.m7406a(ClassK.m7404a(), m7276b().ordinal()), this.f5140a), 2);
    }

    public String toString() {
        return String.format("channel(%d)", Integer.valueOf(this.f5140a));
    }
}
