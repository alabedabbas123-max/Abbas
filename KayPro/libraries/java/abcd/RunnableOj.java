package abcd;

@abcd.Interfacexu
class RunnableOj implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final abcd.Kj.d FH;

    static {
        abcd.wu.j6(abcd.RunnableOj.class, 5884104101721941200L, 303068683987507281L);
    }

    RunnableOj(abcd.Kj.d r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 2518656817458446949L)
    public void run() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 10: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 14; continue $sw0; }
                    abcd.wu.j6(th, -2974048390518603420L, this);
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 7; continue $sw0; }
                    try {
                        abcd.wu.j6(-2974048390518603420L, this);
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
