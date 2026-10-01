package abcd;

@abcd.Interfacexu
class RunnableRj implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final abcd.Kj.d FH;

    static {
        abcd.wu.j6(abcd.RunnableRj.class, 5884104101721941200L, 303448477634184960L);
    }

    RunnableRj(abcd.Kj.d r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -2191758840502088329L)
    public void run() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 10: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 14; continue $sw0; }
                    abcd.wu.j6(th, -2968679498702388471L, this);
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 7; continue $sw0; }
                    try {
                        abcd.wu.j6(-2968679498702388471L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 10; continue $sw0;
                    }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (abcd.Kj.DW(this.FH.Hw) != this.FH) { $pc0 = 17; continue $sw0; }
                    try {
                        abcd.Kj.j6(this.FH.Hw);
                        abcd.Kj.j6(this.FH.Hw, null);
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
