package abcd;

public class B {
    private static final abcd.B.a j6 = null;
    private final java.lang.Object DW;

    interface a {
    }

    private static class b extends abcd.B.d {
        b() {
        }
    }

    private static class c extends abcd.B.d {
        c() {
        }
    }

    static class d implements abcd.B.a {
        d() {
        }
    }

    static {
        int r0 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = android.os.Build.VERSION.SDK_INT;
                    if (r0 < 19) { $pc0 = 6; continue $sw0; }
                    j6 = new abcd.B.c();
                    return;
                }
                case 6: {
                    if (r0 < 16) { $pc0 = 8; continue $sw0; }
                    j6 = new abcd.B.b();
                    return;
                }
                case 8: {
                    j6 = new abcd.B.d();
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public B(java.lang.Object r1) {
        this.DW = r1;
    }

    public java.lang.Object j6() {
        return this.DW;
    }
}
