package a.b.c;

public class ap {

    private a.b.a.k f118a;

    public ap(a.b.a.k r1) {
        this.f118a = r1;
    }

    private int b(a.b.a.l r5) {
        int r1 = 0;
        a.b.a.l[] r2 = null;
        int r0 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r1 = this.f118a.c;
                    r2 = this.f118a.d;
                    r0 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r0 >= r1) { $pc0 = 6; continue $sw0; }
                    if (r2[r0].equals(r5) == true) { $pc0 = 11; continue $sw0; }
                    r0 = r0 + 1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 11: {
                    return r0;
                }
                case 6: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void a(a.b.a.l r5) {
        a.b.a.l[] r0 = this.f118a.d;
        a.b.a.k r1 = this.f118a;
        int r2 = r1.c;
        r1.c = r2 - 1;
        a.j.b.a(r0, r2, b(r5));
    }
}
