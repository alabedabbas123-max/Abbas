package a.b.a;

public class b implements a.b.o {

    public int f46a;
    public int b;
    public int[] c;
    public java.lang.Object d;

    public b() {
    }

    public b(int r1, int r2, int[] r3) {
        this.f46a = r1;
        this.b = r2;
        this.c = r3;
    }

    public void a(a.b.c r3, a.b.b.a.f r4) {
        int r0 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = 0;
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r0 >= this.b) { $pc0 = 6; continue $sw0; }
                    r3.a(this.c[r0], r4);
                    r0 = r0 + 1;
                    { $pc0 = 4; continue $sw0; }
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
        this.d = r1;
    }

    @Override
    public java.lang.Object f() {
        return this.d;
    }
}
