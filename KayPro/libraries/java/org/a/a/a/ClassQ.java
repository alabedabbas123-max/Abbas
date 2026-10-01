package org.a.a.a;

import java.util.Locale;
import org.a.a.a.a.ClassC;
import org.a.a.a.c.ClassH;
import org.a.a.a.c.ClassN;

public class ClassQ extends ClassT {

    private final int f5351a;

    private final ClassC f5352b;

    public ClassQ(Abstractp abstractC1790p, Interfacec interfaceC1763c, int i, ClassC c1727c) {
        super(abstractC1790p, interfaceC1763c, null);
        this.f5351a = i;
        this.f5352b = c1727c;
    }

    @Override
    public Interfacec mo7472b() {
        return (Interfacec) super.mo7472b();
    }

    @Override
    public String toString() {
        String strM7409a = "";
        if (this.f5351a >= 0 && this.f5351a < mo7472b().mo7440c()) {
            strM7409a = ClassN.m7409a(mo7472b().mo7367a(ClassH.m7387a(this.f5351a, this.f5351a)), false);
        }
        return String.format(Locale.getDefault(), "%s('%s')", ClassQ.class.getSimpleName(), strM7409a);
    }
}
