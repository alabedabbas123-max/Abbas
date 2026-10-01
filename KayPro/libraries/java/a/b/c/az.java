package a.b.c;

public class az {

    private a.b.a.n f126a;

    public az(a.b.a.n r1) {
        this.f126a = r1;
    }

    public void a(a.b.a.m r6) {
        int r1 = 0;
        a.b.a.m[] r0 = null;
        a.b.a.m[] r3 = null;
        a.b.a.n r2 = null;
        int r4 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r1 = this.f126a.c;
                    r0 = this.f126a.d;
                    if (r0.length > r1) { $pc0 = 5; continue $sw0; }
                    r3 = new a.b.a.m[r1 + 1];
                    this.f126a.d = r3;
                    java.lang.System.arraycopy(r0, 0, this.f126a.d, 0, r1);
                    r0 = this.f126a.d;
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    r2 = this.f126a;
                    r4 = r2.c;
                    r2.c = r4 + 1;
                    r0[r4] = r6;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
