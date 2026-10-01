package abcd;

class Fv implements java.lang.Runnable {
    Fv() {
    }

    @Override
    public void run() {
        android.os.Handler r0 = null;
        java.lang.Runnable r1 = null;
        long r2 = 0L;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        abcd.Hv.j6();
                        abcd.Hv.DW();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 4; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    r0 = abcd.Hv.v5();
                    r1 = abcd.Hv.FH();
                    if (abcd.Hv.Hw().size() != 0) { $pc0 = 9; continue $sw0; }
                    r2 = 1000;
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    r0.postDelayed(r1, r2);
                    return;
                }
                case 9: {
                    r2 = 10;
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    th = $ex0;
                    abcd.yw.j6("Runtime Error", th);
                    { $pc0 = 6; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
