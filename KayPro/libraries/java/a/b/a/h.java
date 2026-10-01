package a.b.a;

public class h implements a.b.o {

    public int f73a;
    public int b;
    public int c;
    public int d;
    public java.lang.Object e;

    public h() {
    }

    public h(int r1, int r2, int r3, int r4) {
        this.f73a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
    }

    @Override
    public void a(java.lang.Object r1) {
        this.e = r1;
    }

    public boolean a(int r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2 >= this.f73a) { $pc0 = 5; continue $sw0; }
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    return false;
                }
                case 5: {
                    if (r2 >= this.b) { $pc0 = 8; continue $sw0; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean a(int r2, int r3) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.f73a < r3) { $pc1 = 5; continue $sw1; }
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    return false;
                }
                case 5: {
                    if (this.b <= r2) { $pc1 = 8; continue $sw1; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.Object f() {
        return this.e;
    }
}
