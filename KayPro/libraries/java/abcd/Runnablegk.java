package abcd;

@abcd.Interfacexu
class Runnablegk implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.lang.Runnable FH;
    final java.lang.Runnable Hw;

    @abcd.Interfacevu
    final abcd.lk v5;

    static {
        abcd.wu.j6(abcd.Runnablegk.class, -843596403928054707L, -460256628598712200L);
    }

    Runnablegk(abcd.lk r1, java.lang.Runnable r2, java.lang.Runnable r3) {
        this.v5 = r1;
        this.FH = r2;
        this.Hw = r3;
    }

    @Override
    @abcd.Interfacesu(method = 1405716372911714416L)
    public void run() {
        java.lang.Process r2 = null;
        java.io.DataOutputStream r3 = null;
        abcd.Runnablefk r4 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 17: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 22; continue $sw0; }
                    abcd.wu.j6(th, -216758816745068085L, this);
                    $pc0 = 22; continue $sw0;
                }
                case 22: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 25; continue $sw0; }
                    try {
                        abcd.wu.j6(-216758816745068085L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 17; continue $sw0;
                    }
                    $pc0 = 25; continue $sw0;
                }
                case 25: {
                    try {
                        r2 = java.lang.Runtime.getRuntime().exec("su");
                        r3 = new java.io.DataOutputStream(r2.getOutputStream());
                        r3.writeBytes("echo hello\n");
                        r3.writeBytes("exit\n");
                        r3.flush();
                        r2.waitFor();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc0 = 14; continue $sw0; }
                        $pc0 = 11; continue $sw0;
                    }
                    if (r2.exitValue() != 0) { $pc0 = 9; continue $sw0; }
                    try {
                        abcd.lk.j6(this.v5, true);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc0 = 14; continue $sw0; }
                        $pc0 = 11; continue $sw0;
                    }
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    try {
                        r4 = new abcd.Runnablefk(this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 17; continue $sw0;
                    }
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    try {
                        com.aide.ui.U.j6(r4);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 17; continue $sw0;
                    }
                    return;
                }
                case 11: {
                    th = $ex0;
                    try {
                        com.aide.ui.U.j6(new abcd.Runnablefk(this));
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 17; continue $sw0;
                    }
                }
                case 14: {
                    try {
                        r4 = new abcd.Runnablefk(this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 17; continue $sw0;
                    }
                    { $pc0 = 10; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
