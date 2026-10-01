package a.b.a;

public class t implements a.b.o {

    public int f78a;
    public int b;
    public java.lang.Object c;

    public t() {
    }

    public t(int r1, int r2) {
        this.f78a = r1;
        this.b = r2;
    }

    public java.lang.String a(a.b.c r2) {
        return r2.c(this.f78a);
    }

    public void a(a.b.c r2, a.b.b.a.f r3) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.f78a == 0) { $pc0 = 6; continue $sw0; }
                    r2.a(this.f78a, r3);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void a(java.lang.Object r1) {
        this.c = r1;
    }

    @Override
    public java.lang.Object f() {
        return this.c;
    }
}
