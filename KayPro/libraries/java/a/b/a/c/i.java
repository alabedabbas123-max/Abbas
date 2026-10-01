package a.b.a.c;

public class i extends a.b.a.c.r {

    public int f54a;

    public i() {
    }

    public i(int r1) {
        this.f54a = r1;
    }

    @Override
    public int a() {
        return 7;
    }

    @Override
    public void a(a.b.c r8, a.b.j r9, a.b.a.d r10, int r11, int r12, a.b.a.c.a.b r13) {
        r13.a(r8, r9, r10, r11, r12, this);
    }

    @Override
    public void a(a.b.c r7, a.b.j r8, a.b.a.d r9, int r10, a.b.a.c.a.b r11) {
        r11.a(r7, r8, r9, r10, this);
    }

    @Override
    public void b(a.b.c r8, a.b.j r9, a.b.a.d r10, int r11, int r12, a.b.a.c.a.b r13) {
        r13.b(r8, r9, r10, r11, r12, this);
    }

    @Override
    public boolean equals(java.lang.Object r4) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (super.equals(r4) == true) { $pc0 = 6; continue $sw0; }
                    return false;
                }
                case 6: {
                    if (this.f54a != ((a.b.a.c.i) r4).f54a) { $pc0 = 8; continue $sw0; }
                    return true;
                }
                case 8: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.f54a;
    }

    public java.lang.String toString() {
        return "a:" + this.f54a;
    }
}
