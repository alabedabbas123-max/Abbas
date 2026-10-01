package abcd;

@abcd.Interfacexu
class Runnablezh implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final abcd.RunnableAh FH;

    static {
        abcd.wu.j6(abcd.Runnablezh.class, -6708075855096698041L, 209484110154447900L);
    }

    Runnablezh(abcd.RunnableAh r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -1604616484233296160L)
    public void run() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 10: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 14; continue $sw0; }
                    abcd.wu.j6(th, 6597588957349062715L, this);
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 7; continue $sw0; }
                    try {
                        abcd.wu.j6(6597588957349062715L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 10; continue $sw0;
                    }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (abcd.Ch.DW(this.FH.v5.VH) == null) { $pc0 = 17; continue $sw0; }
                    try {
                        abcd.Ch.DW(this.FH.v5.VH).j6(this.FH.Hw);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 10; continue $sw0;
                    }
                    return;
                }
                case 17: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
