package abcd;

final class jy<TResult> implements ny<TResult> {
    private final java.lang.Object DW;
    private abcd.Vx FH;
    private final java.util.concurrent.Executor j6;

    public jy(java.util.concurrent.Executor r2, abcd.Vx r3) {
        this.DW = new java.lang.Object();
        this.j6 = r2;
        this.FH = r3;
    }

    static abcd.Vx DW(abcd.jy r0) {
        return r0.FH;
    }

    static java.lang.Object j6(abcd.jy r0) {
        return r0.DW;
    }

    public final void j6(Yx<TResult> r3) {
        synchronized (this.DW) {
            java.lang.Object r0 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if (r3.v5() == false) { $pc0 = 5; continue $sw0; }
                        return;
                    }
                    case 5: {
                        if (r3.FH() == true) { $pc0 = 19; continue $sw0; }
                        r0 = this.DW;
                        $pc0 = 9; continue $sw0;
                    }
                    case 14: {
                        th = $ex0;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 9: {
                        if (this.FH != null) { $pc0 = 12; continue $sw0; }
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 14; continue $sw0;
                        }
                        return;
                    }
                    case 12: {
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 14; continue $sw0;
                        }
                        this.j6.execute(new abcd.Runnableky(this, r3));
                        return;
                    }
                    case 19: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }
}
