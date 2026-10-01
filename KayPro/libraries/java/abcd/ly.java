package abcd;

final class ly<TResult> implements ny<TResult> {
    private final java.lang.Object DW;
    private Wx<? super TResult> FH;
    private final java.util.concurrent.Executor j6;

    public ly(java.util.concurrent.Executor r2, Wx<? super TResult> r3) {
        this.DW = new java.lang.Object();
        this.j6 = r2;
        this.FH = r3;
    }

    static abcd.Wx DW(abcd.ly r0) {
        return r0.FH;
    }

    static java.lang.Object j6(abcd.ly r0) {
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
                    if (r3.v5() == false) { $pc0 = 15; continue $sw0; }
                    r0 = this.DW;
                    monitor-enter(r0);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    th = $ex0;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 7: {
                    if (this.FH != null) { $pc0 = 10; continue $sw0; }
                    try {
                        monitor-exit(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 12; continue $sw0;
                    }
                    return;
                }
                case 10: {
                    try {
                        monitor-exit(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 12; continue $sw0;
                    }
                    this.j6.execute(new abcd.Runnablemy(this, r3));
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
