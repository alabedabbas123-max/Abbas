package abcd;

final class Runnableky implements java.lang.Runnable {
    private final abcd.jy DW;
    private final abcd.Yx j6;

    Runnableky(abcd.jy r1, abcd.Yx r2) {
        this.DW = r1;
        this.j6 = r2;
    }

    @Override
    public final void run() {
        synchronized (abcd.jy.j6(this.DW)) {
            java.lang.Object r0 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        r0 = abcd.jy.j6(this.DW);
                        $pc0 = 5; continue $sw0;
                    }
                    case 9: {
                        th = $ex0;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 5: {
                        if (abcd.jy.DW(this.DW) == null) { $pc0 = 7; continue $sw0; }
                        try {
                            abcd.jy.DW(this.DW).j6(this.j6.j6());
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 9; continue $sw0;
                        }
                        $pc0 = 7; continue $sw0;
                    }
                    case 7: {
                        try {
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
}
