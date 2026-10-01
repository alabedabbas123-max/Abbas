package abcd;

final class Runnablecy implements java.lang.Runnable {
    private final abcd.by DW;
    private final abcd.Yx j6;

    Runnablecy(abcd.by r1, abcd.Yx r2) {
        this.DW = r1;
        this.j6 = r2;
    }

    @Override
    public final void run() {
        java.lang.Object r0 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.j6.FH() == false) { $pc0 = 19; continue $sw0; }
                    abcd.by.j6(this.DW).Zo();
                    return;
                }
                case 19: {
                    try {
                        r0 = abcd.by.DW(this.DW).j6(this.j6);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 9; continue $sw0; }
                        if ($t instanceof abcd.Xx) { $pc0 = 12; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    abcd.by.j6(this.DW).j6(r0);
                    return;
                }
                case 12: {
                    e = $ex0;
                    if ((e.getCause() instanceof java.lang.Exception) == false) { $pc0 = 17; continue $sw0; }
                    abcd.by.j6(this.DW).j6((java.lang.Exception) e.getCause());
                    return;
                }
                case 17: {
                    abcd.by.j6(this.DW).j6(e);
                    return;
                }
                case 9: {
                    e = $ex0;
                    abcd.by.j6(this.DW).j6(e);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
