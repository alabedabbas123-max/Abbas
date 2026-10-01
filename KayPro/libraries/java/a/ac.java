package a;

public class ac implements a.b.g.s {

    private final a.b.b f12a;
    private final a.b.b b;
    private final a.b.f.z c;
    private java.lang.String d;

    public ac(a.b.b r1, a.b.b r2, a.b.f.z r3) {
        this.f12a = r1;
        this.b = r2;
        this.c = r3;
    }

    @Override
    public void a(a.b.e r5) {
        java.lang.String r0 = r5.b();
        this.c.a(r0, "Note: the configuration explicitly specifies '" + a.b.f.i.c(this.d) + "' to keep library class '" + a.b.f.i.c(r0) + "'");
    }

    @Override
    public void a(a.b.k r1) {
    }

    public void a(java.util.List r10) {
        if (r10 == null) goto L13;
        int r0 = 0;
    L5:
        int r6 = r0;
        if (r6 >= r10.size()) goto L18;
        a.aa r1 = (a.aa) r10.get(r6);
        this.d = r1.e;
        if (this.d == null) goto L12;
        a.ab r2 = new a.ab(true, true, true);
        a.b.g.i r3 = new a.b.g.i();
        this.f12a.a(r2.a(r1, r3, null, null, null));
        if (r3.a() != 0) goto L12;
        this.b.a(r2.a(r1, this, null, null, null));
    L12:
        r0 = r6 + 1;
        goto L5
    L18:
        return;
    }
}
