package a.d.a;

import a.b.c;
import a.b.f.ClassI;

public class ClassC implements Interfacebe {

    static final Abstractae f517a = new ba();

    static final Abstractaf f518b = new bb();

    static final Abstractu f519c = new az();

    static final Abstractt f520d = new ay();

    static final Abstractap f521e = new bc();

    @Override
    public Abstractae mo1310a() {
        return f517a;
    }

    @Override
    public Abstractae mo1528a(int i) {
        return mo1310a();
    }

    @Override
    public Abstractaf mo1529a(long j) {
        return mo1312b();
    }

    @Override
    public Abstractap mo1311a(String str, c cVar, Abstractae abstractC0180ae) {
        return mo1313b(str, cVar, false, false);
    }

    @Override
    public Abstractap mo1530a(String str, c cVar, Abstractae abstractC0180ae, Abstractbd abstractC0206bd) {
        return mo1311a(str, cVar, abstractC0180ae);
    }

    @Override
    public Abstractbd mo1591a(String str, c cVar, boolean z, boolean z2) {
        switch (str.charAt(0)) {
            case 'B':
            case 'C':
            case 'I':
            case 'S':
            case 'Z':
                return mo1310a();
            case 'D':
                return mo1315d();
            case 'F':
                return mo1314c();
            case 'J':
                return mo1312b();
            case 'V':
                return null;
            default:
                if (!ClassI.m773f(str)) {
                    str = ClassI.m792o(str);
                }
                return mo1313b(str, cVar, z, z2);
        }
    }

    @Override
    public Abstractt mo1531a(double d) {
        return mo1315d();
    }

    @Override
    public Abstractu mo1532a(float f) {
        return mo1314c();
    }

    @Override
    public Abstractaf mo1312b() {
        return f518b;
    }

    @Override
    public Abstractap mo1313b(String str, c cVar, boolean z, boolean z2) {
        return mo1533e();
    }

    @Override
    public Abstractu mo1314c() {
        return f519c;
    }

    @Override
    public Abstractt mo1315d() {
        return f520d;
    }

    @Override
    public Abstractap mo1533e() {
        return f521e;
    }

    @Override
    public Abstractap mo1534f() {
        return f521e;
    }
}
