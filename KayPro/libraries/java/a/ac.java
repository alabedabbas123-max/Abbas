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
        int r0 = 0;
        int r6 = 0;
        a.aa r1 = null;
        a.ab r2 = null;
        a.b.g.i r3 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r10 == null) { $pc0 = 13; continue $sw0; }
                    r0 = 0;
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    r6 = r0;
                    if (r6 >= r10.size()) { $pc0 = 18; continue $sw0; }
                    r1 = (a.aa) r10.get(r6);
                    this.d = r1.e;
                    if (this.d == null) { $pc0 = 12; continue $sw0; }
                    r2 = new a.ab(true, true, true);
                    r3 = new a.b.g.i();
                    this.f12a.a(r2.a(r1, r3, null, null, null));
                    if (r3.a() != 0) { $pc0 = 12; continue $sw0; }
                    this.b.a(r2.a(r1, this, null, null, null));
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    r0 = r6 + 1;
                    { $pc0 = 5; continue $sw0; }
                }
                case 18: {
                    return;
                }
                case 13: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
