package abcd;

@abcd.Interfacexu
class RunnableHi implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.Ji FH;

    static {
        abcd.wu.j6(abcd.RunnableHi.class, 4379885248179836745L, -159797358290622575L);
    }

    RunnableHi(abcd.Ji r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 1383654197796735980L)
    public void run() {
        java.util.Iterator r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 12: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 17; continue $sw0; }
                    abcd.wu.j6(th, -720885568192460928L, this);
                    $pc0 = 17; continue $sw0;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-720885568192460928L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 12; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        r2 = abcd.Ji.FH(this.FH).iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 12; continue $sw0;
                    }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (r2.hasNext() == false) { $pc0 = 11; continue $sw0; }
                    try {
                        ((abcd.Ji.c) r2.next()).j6();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 12; continue $sw0;
                    }
                    { $pc0 = 7; continue $sw0; }
                }
                case 11: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
