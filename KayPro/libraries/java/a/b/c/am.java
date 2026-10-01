package a.b.c;

public class am {

    private final a.b.a.d f115a;

    public am(a.b.a.d r1) {
        this.f115a = r1;
    }

    void a(a.b.a.h r7) {
        a.b.a.h[] r0 = null;
        int r1 = 0;
        int r2 = 0;
        a.b.a.h[] r3 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.f115a.h;
                    r1 = this.f115a.g;
                    r2 = r1 + 1;
                    if (r0.length >= r2) { $pc0 = 7; continue $sw0; }
                    r3 = new a.b.a.h[r2];
                    java.lang.System.arraycopy(r0, 0, r3, 1, r1);
                    r3[0] = r7;
                    this.f115a.h = r3;
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    this.f115a.g = r2;
                    return;
                }
                case 7: {
                    java.lang.System.arraycopy(r0, 0, r0, 1, r1);
                    r0[0] = r7;
                    { $pc0 = 5; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
