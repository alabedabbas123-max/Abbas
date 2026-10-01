package a.b.c;

public class an {

    private a.b.a.i f116a;

    public an(a.b.a.i r1) {
        this.f116a = r1;
    }

    public void a(int r6) {
        int r1 = 0;
        int[] r0 = null;
        int[] r3 = null;
        a.b.a.i r2 = null;
        int r4 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r1 = this.f116a.c;
                    r0 = this.f116a.d;
                    if (r0.length > r1) { $pc0 = 5; continue $sw0; }
                    r3 = new int[r1 + 1];
                    this.f116a.d = r3;
                    java.lang.System.arraycopy(r0, 0, this.f116a.d, 0, r1);
                    r0 = this.f116a.d;
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    r2 = this.f116a;
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
