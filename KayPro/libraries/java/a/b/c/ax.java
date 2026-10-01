package a.b.c;

public class ax {

    private final a.b.k f124a;

    public ax(a.b.k r1) {
        this.f124a = r1;
    }

    private int b(int r5) {
        int r1 = 0;
        int[] r2 = null;
        int r0 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r1 = this.f124a.g;
                    r2 = this.f124a.h;
                    r0 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r0 >= r1) { $pc0 = 8; continue $sw0; }
                    if (r2[r0] == r5) { $pc0 = 11; continue $sw0; }
                    r0 = r0 + 1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 11: {
                    return r0;
                }
                case 8: {
                    return -1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void a(int r6) {
        a.b.k r0 = null;
        int[] r1 = null;
        a.b.k r2 = null;
        int r3 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (b(r6) >= 0) { $pc1 = 6; continue $sw1; }
                    r0 = this.f124a;
                    r1 = this.f124a.h;
                    r2 = this.f124a;
                    r3 = r2.g;
                    r2.g = r3 + 1;
                    r0.h = a.j.b.a(r1, r3, r6);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
