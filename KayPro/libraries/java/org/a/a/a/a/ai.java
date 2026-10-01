package org.a.a.a.a;

import org.a.a.a.Abstractp;
import org.a.a.a.c.ClassK;

public final class ai implements Interfacead {

    private final int f5143a;

    private final Interfacead f5144b;

    public ai(int i, Interfacead interfaceC1689ad) {
        this.f5143a = i;
        this.f5144b = interfaceC1689ad;
    }

    @Override
    public void mo7270a(Abstractp abstractC1790p) {
        this.f5144b.mo7270a(abstractC1790p);
    }

    @Override
    public boolean mo7271a() {
        return true;
    }

    public int m7278b() {
        return this.f5143a;
    }

    public Interfacead m7279c() {
        return this.f5144b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ai)) {
            return false;
        }
        ai c1694ai = (ai) obj;
        return this.f5143a == c1694ai.f5143a && this.f5144b.equals(c1694ai.f5144b);
    }

    public int hashCode() {
        return ClassK.m7408b(ClassK.m7407a(ClassK.m7406a(ClassK.m7404a(), this.f5143a), this.f5144b), 2);
    }
}
