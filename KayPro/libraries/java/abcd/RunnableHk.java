package abcd;

@abcd.Interfacexu
class RunnableHk implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.Jk FH;

    static {
        abcd.wu.j6(abcd.RunnableHk.class, 81765335761816225L, -1020255049470345640L);
    }

    RunnableHk(abcd.Jk r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 2387352738165188657L)
    public void run() {
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 11: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 15; continue $sw0; }
                    abcd.wu.j6(th, 5353851906303505080L, this);
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 18; continue $sw0; }
                    try {
                        abcd.wu.j6(5353851906303505080L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    $pc0 = 18; continue $sw0;
                }
                case 18: {
                    try {
                        abcd.Jk.j6(this.FH).clear();
                        abcd.Vl.FH(abcd.Jk.j6());
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 8; continue $sw0; }
                        $pc0 = 11; continue $sw0;
                    }
                    $pc0 = 20; continue $sw0;
                }
                case 20: {
                    return;
                }
                case 8: {
                    e = $ex0;
                    try {
                        e.printStackTrace();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
