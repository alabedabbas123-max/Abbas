package a.b.a.d;

public class p implements a.b.a.d.o {

    private int f68a;
    private int b;
    private boolean c;

    public p() {
        this.f68a = Integer.MAX_VALUE;
        this.b = 0;
    }

    public int a() {
        return this.b;
    }

    @Override
    public void a(a.b.c r3, a.b.j r4, a.b.a.d r5, a.b.a.m r6) {
        int r0 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = r6.c;
                    if (this.f68a <= r0) { $pc0 = 6; continue $sw0; }
                    this.f68a = r0;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (this.b >= r0) { $pc0 = 9; continue $sw0; }
                    this.b = r0;
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    if (r6.a() == null) { $pc0 = 12; continue $sw0; }
                    this.c = true;
                    return;
                }
                case 12: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean b() {
        return this.c;
    }
}
