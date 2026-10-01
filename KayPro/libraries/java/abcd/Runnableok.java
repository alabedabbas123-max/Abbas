package abcd;

@abcd.Interfacexu
class Runnableok implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.util.Set FH;
    final abcd.yk.a Hw;

    @abcd.Interfacevu
    final abcd.yk v5;

    static {
        abcd.wu.j6(abcd.Runnableok.class, -7932626172141952505L, 403830119156661292L);
    }

    Runnableok(abcd.yk r1, java.util.Set r2, abcd.yk.a r3) {
        this.v5 = r1;
        this.FH = r2;
        this.Hw = r3;
    }

    @Override
    @abcd.Interfacesu(method = -805343711958410448L)
    public void run() {
        java.util.Map<java.lang.String, abcd.yk.g> r2 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 21: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 25; continue $sw0; }
                    abcd.wu.j6(th, 2354084318773793760L, this);
                    $pc0 = 25; continue $sw0;
                }
                case 25: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 27; continue $sw0; }
                    try {
                        abcd.wu.j6(2354084318773793760L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 21; continue $sw0;
                    }
                    $pc0 = 27; continue $sw0;
                }
                case 27: {
                    try {
                        abcd.yk.Hw(this.v5);
                        r2 = abcd.yk.j6(this.v5, this.FH);
                        this.Hw.j6(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof org.json.JSONException) { $pc0 = 10; continue $sw0; }
                        if ($t instanceof abcd.yk.c) { $pc0 = 12; continue $sw0; }
                        if ($t instanceof abcd.yk.b) { $pc0 = 14; continue $sw0; }
                        if ($t instanceof java.lang.InterruptedException) { $pc0 = 16; continue $sw0; }
                        if ($t instanceof android.os.RemoteException) { $pc0 = 18; continue $sw0; }
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 34; continue $sw0;
                }
                case 34: {
                    return;
                }
                case 12: {
                    e = $ex0;
                    try {
                        this.v5.j6(e);
                        this.Hw.j6("Internal error in in-app billing (cancelled).");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 21; continue $sw0;
                    }
                    return;
                }
                case 14: {
                    e = $ex0;
                    try {
                        this.v5.j6(e);
                        this.Hw.j6(e.getMessage());
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 21; continue $sw0;
                    }
                    return;
                }
                case 18: {
                    e = $ex0;
                    try {
                        this.v5.j6(e);
                        this.Hw.j6("Error communicating with Play Store service.");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 21; continue $sw0;
                    }
                    return;
                }
                case 16: {
                    e = $ex0;
                    try {
                        this.v5.j6(e);
                        this.Hw.j6("Internal error in in-app billing (interrupted).");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 21; continue $sw0;
                    }
                    return;
                }
                case 10: {
                    e = $ex0;
                    try {
                        this.v5.j6(e);
                        this.Hw.j6("Internal error in in-app billing (JSON parse).");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 21; continue $sw0;
                    }
                    return;
                }
                case 8: {
                    th = $ex0;
                    try {
                        this.v5.j6(th);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 21; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
