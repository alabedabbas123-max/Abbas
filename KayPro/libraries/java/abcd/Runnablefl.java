package abcd;

@abcd.Interfacexu
class Runnablefl implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.util.Map FH;
    final java.lang.String Hw;
    final abcd.Binderml v5;

    static {
        abcd.wu.j6(abcd.Runnablefl.class, -1401858080030435915L, -3937147665546404295L);
    }

    Runnablefl(abcd.Binderml r1, java.util.Map r2, java.lang.String r3) {
        this.v5 = r1;
        this.FH = r2;
        this.Hw = r3;
    }

    @Override
    @abcd.Interfacesu(method = -1541392253138727820L)
    public void run() {
        java.util.Map r7 = null;
        java.util.ArrayList r5 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 1084821237590194671L, this);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(1084821237590194671L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        r7 = this.FH;
                        r5 = new java.util.ArrayList(r7.keySet());
                        java.util.Collections.sort(r5, java.lang.String.CASE_INSENSITIVE_ORDER);
                        abcd.Binderml.j6(this.v5, this.Hw, r5, 0, r7, new java.util.Hashtable());
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
