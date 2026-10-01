package abcd;

final class Runnableiy implements java.lang.Runnable {
    private final abcd.hy DW;
    private final abcd.Yx j6;

    Runnableiy(abcd.hy r1, abcd.Yx r2) {
        this.DW = r1;
        this.j6 = r2;
    }

    @Override
    public final void run() {
        java.lang.Object r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = abcd.hy.j6(this.DW);
                    monitor-enter(r0);
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    th = $ex0;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 5: {
                    if (abcd.hy.DW(this.DW) == null) { $pc0 = 7; continue $sw0; }
                    try {
                        abcd.hy.DW(this.DW).j6(this.j6);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 9; continue $sw0;
                    }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    try {
                        monitor-exit(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 9; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
