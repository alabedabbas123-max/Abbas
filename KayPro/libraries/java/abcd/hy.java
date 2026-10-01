package abcd;

final class hy<TResult> implements ny<TResult> {
    private final java.lang.Object DW;
    private Ux<TResult> FH;
    private final java.util.concurrent.Executor j6;

    public hy(java.util.concurrent.Executor r2, Ux<TResult> r3) {
        this.DW = new java.lang.Object();
        this.j6 = r2;
        this.FH = r3;
    }

    static abcd.Ux DW(abcd.hy r0) {
        return r0.FH;
    }

    static java.lang.Object j6(abcd.hy r0) {
        return r0.DW;
    }

    public final void j6(Yx<TResult> r3) {
        java.lang.Object r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.DW;
                    monitor-enter(r0);
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    th = $ex0;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 5: {
                    if (this.FH != null) { $pc0 = 8; continue $sw0; }
                    try {
                        monitor-exit(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    return;
                }
                case 8: {
                    try {
                        monitor-exit(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    this.j6.execute(new abcd.Runnableiy(this, r3));
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
