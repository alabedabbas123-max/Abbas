package a.b.a.c;

public class k extends a.b.a.c.m {
    public k() {
    }

    public k(int r2) {
        this.e = r2 + 0;
    }

    @Override
    public int a() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.e < 64) { $pc0 = 5; continue $sw0; }
                    return 251;
                }
                case 5: {
                    return this.e + 0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void a(a.b.c r7, a.b.j r8, a.b.a.d r9, int r10, a.b.a.c.a.a r11) {
        r11.a(r7, r8, r9, r10, this);
    }

    @Override
    public java.lang.String toString() {
        return super.toString() + "Var: ..., Stack: (empty)";
    }
}
