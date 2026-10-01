package abcd;

@abcd.Interfacexu
class Ll extends java.lang.Thread {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.Ol FH;

    static {
        abcd.wu.j6(abcd.Ll.class, -5925735092384612688L, -3471693816017974185L);
    }

    Ll(abcd.Ol r1, java.lang.String r2) {
        this.FH = r1;
        super(r2);
    }

    @Override
    @abcd.Interfacesu(method = 1232421720753091416L)
    public void run() {
        abcd.Ol r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 19;
        $sw0: while (true) {
            switch ($pc0) {
                case 19: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 23; continue $sw0; }
                    abcd.wu.j6(th, -4719406164269163991L, this);
                    $pc0 = 23; continue $sw0;
                }
                case 23: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 27; continue $sw0; }
                    try {
                        abcd.wu.j6(-4719406164269163991L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 19; continue $sw0;
                    }
                    $pc0 = 27; continue $sw0;
                }
                case 27: {
                    try {
                        abcd.Ol.j6(this.FH).waitFor();
                        abcd.Ol.j6(this.FH, abcd.Ol.j6(this.FH).exitValue());
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.InterruptedException) { $pc0 = 24; continue $sw0; }
                        $pc0 = 26; continue $sw0;
                    }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    try {
                        r0 = this.FH;
                        monitor-enter(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 26; continue $sw0;
                    }
                    try {
                        abcd.Ol.Hw(this.FH);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 15; continue $sw0;
                    }
                    if (abcd.Ol.FH(this.FH) > 0) { $pc0 = 13; continue $sw0; }
                    try {
                        this.FH.notifyAll();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 15; continue $sw0;
                    }
                    try {
                        abcd.Ol.v5(this.FH).j6();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 25; continue $sw0; }
                        $pc0 = 15; continue $sw0;
                    }
                    $pc0 = 13; continue $sw0;
                }
                case 13: {
                    try {
                        monitor-exit(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 15; continue $sw0;
                    }
                    { $pc0 = 36; continue $sw0; }
                }
                case 18: {
                    return;
                }
                case 15: {
                    th = $ex0;
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 26; continue $sw0;
                    }
                }
                case 24: {
                    $pc0 = 25; continue $sw0;
                }
                case 25: {
                    $pc0 = 26; continue $sw0;
                }
                case 26: {
                    $pc0 = 36; continue $sw0;
                }
                case 36: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
