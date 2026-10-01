package abcd;

final class fy<TResult> implements ny<TResult> {
    private final java.lang.Object DW;
    private abcd.Tx FH;
    private final java.util.concurrent.Executor j6;

    public fy(java.util.concurrent.Executor r2, abcd.Tx r3) {
        this.DW = new java.lang.Object();
        this.j6 = r2;
        this.FH = r3;
    }

    static abcd.Tx DW(abcd.fy r0) {
        return r0.FH;
    }

    static java.lang.Object j6(abcd.fy r0) {
        return r0.DW;
    }

    public final void j6(abcd.Yx r2) {
        java.lang.Object r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2.FH() == false) { $pc0 = 15; continue $sw0; }
                    r3 = this.DW;
                    monitor-enter(r3);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    th = $ex0;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 7: {
                    if (this.FH != null) { $pc0 = 10; continue $sw0; }
                    try {
                        monitor-exit(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 12; continue $sw0;
                    }
                    return;
                }
                case 10: {
                    try {
                        monitor-exit(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 12; continue $sw0;
                    }
                    this.j6.execute(new abcd.Runnablegy(this));
                    return;
                }
                case 15: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
