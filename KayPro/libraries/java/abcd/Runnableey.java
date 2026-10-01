package abcd;

final class Runnableey implements java.lang.Runnable {
    private final abcd.dy DW;
    private final abcd.Yx j6;

    Runnableey(abcd.dy r1, abcd.Yx r2) {
        this.DW = r1;
        this.j6 = r2;
    }

    @Override
    public final void run() {
        abcd.Yx r0 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        r0 = (abcd.Yx) abcd.dy.j6(this.DW).j6(this.j6);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 8; continue $sw0; }
                        if ($t instanceof abcd.Xx) { $pc0 = 11; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r0 != null) { $pc0 = 6; continue $sw0; }
                    this.DW.j6(new java.lang.NullPointerException("Continuation returned null"));
                    return;
                }
                case 6: {
                    r0.j6(abcd._x.DW, this.DW);
                    r0.j6(abcd._x.DW, this.DW);
                    r0.j6(abcd._x.DW, this.DW);
                    return;
                }
                case 11: {
                    e = $ex0;
                    if ((e.getCause() instanceof java.lang.Exception) == false) { $pc0 = 16; continue $sw0; }
                    abcd.dy.DW(this.DW).j6((java.lang.Exception) e.getCause());
                    return;
                }
                case 16: {
                    abcd.dy.DW(this.DW).j6(e);
                    return;
                }
                case 8: {
                    e = $ex0;
                    abcd.dy.DW(this.DW).j6(e);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
