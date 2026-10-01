package a.d.a;

import a.b.c;

public class ax extends ClassC {

    static final Abstractap f514f = new aw(null, null, false, true);

    static final Abstractap f515g = new aw("java/lang/Object", null, true, true);

    static final Abstractap f516h = new aw("java/lang/Object", null, true, false);

    @Override
    public Abstractap mo1311a(String str, c cVar, Abstractae abstractC0180ae) {
        return mo1530a(str, cVar, abstractC0180ae, mo1591a(str, cVar, true, true));
    }

    @Override
    public Abstractap mo1530a(String str, c cVar, Abstractae abstractC0180ae, Abstractbd abstractC0206bd) {
        return mo1313b('[' + str, cVar, false, false);
    }

    @Override
    public Abstractap mo1313b(String str, c cVar, boolean z, boolean z2) {
        if (str == null) {
            return f514f;
        }
        if (str.equals("java/lang/Object") && z) {
            return z2 ? f515g : f516h;
        }
        return new aw(str, cVar, z, z2);
    }

    @Override
    public Abstractap mo1534f() {
        return f514f;
    }
}
