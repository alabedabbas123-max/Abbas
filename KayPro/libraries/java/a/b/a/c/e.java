package a.b.a.c;

public class e extends a.b.a.c.m {

    public int f52a;

    public e() {
    }

    public e(byte r1) {
        this.f52a = r1;
    }

    public e(int r2) {
        this.f52a = 251 - r2;
    }

    @Override
    public int a() {
        return 251 - this.f52a;
    }

    @Override
    public void a(a.b.c r7, a.b.j r8, a.b.a.d r9, int r10, a.b.a.c.a.a r11) {
        r11.a(r7, r8, r9, r10, this);
    }

    @Override
    public boolean equals(java.lang.Object r4) {
        a.b.a.c.e r5 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (super.equals(r4) == true) { $pc0 = 5; continue $sw0; }
                    return false;
                }
                case 5: {
                    r5 = (a.b.a.c.e) r4;
                    if (this.e == r5.e) { $pc0 = 8; continue $sw0; }
                    return false;
                }
                case 8: {
                    if (this.f52a == r5.f52a) { $pc0 = 11; continue $sw0; }
                    return true;
                }
                case 11: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.f52a;
    }

    @Override
    public java.lang.String toString() {
        return super.toString() + "Var: (chopped " + this.f52a + "), Stack: (empty)";
    }
}
