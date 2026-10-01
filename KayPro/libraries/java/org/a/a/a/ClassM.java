package org.a.a.a;

import org.a.a.a.c.ClassH;
import org.a.a.a.c.ClassM;

public class ClassM implements Interfaceab {

    public static final Interfaceab f5335a = new ClassM();

    protected final boolean f5336b;

    public ClassM() {
        this(false);
    }

    public ClassM(boolean z) {
        this.f5336b = z;
    }

    @Override
    public ClassL mo7357b(ClassM c1776m, int i, String str, int i2, int i3, int i4, int i5, int i6) {
        ClassL c1786l = new ClassL(c1776m, i, i2, i3, i4);
        c1786l.m7444a(i5);
        c1786l.m7447b(i6);
        if (str != null) {
            c1786l.m7445a(str);
        } else if (this.f5336b && c1776m.f5294b != null) {
            c1786l.m7445a(((Interfacec) c1776m.f5294b).mo7367a(ClassH.m7387a(i3, i4)));
        }
        return c1786l;
    }
}
