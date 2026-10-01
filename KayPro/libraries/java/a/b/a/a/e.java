package a.b.a.a;

public class e extends a.b.a.a.h {

    public int f41a;
    public a.b.a.a.h[] b;

    public e() {
    }

    public e(int r1, int r2, a.b.a.a.h[] r3) {
        super(r1);
        this.f41a = r2;
        this.b = r3;
    }

    @Override
    public char a() {
        return '[';
    }

    @Override
    public void a(a.b.c r1, a.b.a.a.a r2, a.b.a.a.b.g r3) {
        r3.a(r1, r2, this);
    }

    public void b(a.b.c r3, a.b.a.a.a r4, a.b.a.a.b.g r5) {
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
                    if (r0 >= this.f41a) { $pc0 = 6; continue $sw0; }
                    this.b[r0].a(r3, r4, r5);
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
}
