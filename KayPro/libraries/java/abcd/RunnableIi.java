package abcd;

@abcd.Interfacexu
class RunnableIi implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.nio.channels.InterruptibleChannel FH;

    @abcd.Interfacevu
    final abcd.Ji Hw;

    static {
        abcd.wu.j6(abcd.RunnableIi.class, 4379885248179836745L, -159873158420168256L);
    }

    RunnableIi(abcd.Ji r1, java.nio.channels.InterruptibleChannel r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = -2118055098731350821L)
    public void run() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -755807237633406861L, this);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 14; continue $sw0; }
                    try {
                        abcd.wu.j6(-755807237633406861L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    try {
                        this.FH.close();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 13; continue $sw0; }
                        $pc0 = 8; continue $sw0;
                    }
                    return;
                }
                case 13: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
