package a.d.a;

import a.b.c;

public class ao extends ClassC implements Interfacebe {

    private final Interfacebe f506h;

    static final Abstractae f492k = new am(-1);

    static final Abstractae f493l = new am(0);

    static final Abstractae f494m = new am(1);

    static final Abstractae f495n = new am(2);

    static final Abstractae f496o = new am(3);

    static final Abstractae f497p = new am(4);

    static final Abstractae f498q = new am(5);

    static final Abstractaf f499r = new an(0);

    static final Abstractaf f500s = new an(1);

    static final Abstractu f501t = new al(0.0f);

    static final Abstractu f502u = new al(1.0f);

    static final Abstractu f503v = new al(2.0f);

    static final Abstractt f504w = new ak(0.0d);

    static final Abstractt f505x = new ak(1.0d);

    private static int f490f = Float.floatToIntBits(0.0f);

    private static long f491g = Double.doubleToLongBits(0.0d);

    public ao() {
        this(new ClassB());
    }

    public ao(Interfacebe interfaceC0207be) {
        this.f506h = interfaceC0207be;
    }

    @Override
    public Abstractae mo1528a(int i) {
        switch (i) {
            case -1:
                return f492k;
            case 0:
                return f493l;
            case 1:
                return f494m;
            case 2:
                return f495n;
            case 3:
                return f496o;
            case 4:
                return f497p;
            case 5:
                return f498q;
            default:
                return new am(i);
        }
    }

    @Override
    public Abstractaf mo1529a(long j) {
        if (j == 0) {
            return f499r;
        }
        return j == 1 ? f500s : new an(j);
    }

    @Override
    public Abstractap mo1311a(String str, c cVar, Abstractae abstractC0180ae) {
        return this.f506h.mo1311a(str, cVar, abstractC0180ae);
    }

    @Override
    public Abstractap mo1530a(String str, c cVar, Abstractae abstractC0180ae, Abstractbd abstractC0206bd) {
        return this.f506h.mo1530a(str, cVar, abstractC0180ae, abstractC0206bd);
    }

    @Override
    public Abstractt mo1531a(double d) {
        if (d == 0.0d && Double.doubleToLongBits(d) == f491g) {
            return f504w;
        }
        return d == 1.0d ? f505x : new ak(d);
    }

    @Override
    public Abstractu mo1532a(float f) {
        if (f == 0.0f && Float.floatToIntBits(f) == f490f) {
            return f501t;
        }
        if (f == 1.0f) {
            return f502u;
        }
        return f == 2.0f ? f503v : new al(f);
    }

    @Override
    public Abstractap mo1313b(String str, c cVar, boolean z, boolean z2) {
        return this.f506h.mo1313b(str, cVar, z, z2);
    }

    @Override
    public Abstractap mo1533e() {
        return this.f506h.mo1533e();
    }

    @Override
    public Abstractap mo1534f() {
        return this.f506h.mo1534f();
    }
}
