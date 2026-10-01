package abcd;

final class HH implements java.util.concurrent.Callable<java.lang.Object> {
    private final abcd.IE DW;
    private final abcd.CH FH;
    private final abcd.lF Hw;
    private final abcd.MH[] VH;
    private final int Zo;
    private final abcd.NH j6;
    private final int v5;

    HH(abcd.NH r1, abcd.IE r2, abcd.CH r3, abcd.lF r4, int r5, int r6, abcd.MH[] r7) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
        this.Hw = r4;
        this.v5 = r5;
        this.Zo = r6;
        this.VH = r7;
    }

    @Override
    public java.lang.Object call() {
        abcd.IE r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.DW.DW();
                    try {
                        new abcd.IH(this.j6, this.FH, r0).j6(this.Hw, this.VH, this.Zo, this.v5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 6; continue $sw0;
                    }
                    r0.FH();
                    this.Hw.DW();
                    return null;
                }
                case 6: {
                    th = $ex0;
                    r0.FH();
                    this.Hw.DW();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
