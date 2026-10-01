package abcd;

@abcd.Interfacexu
class Runnabletl implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.ul FH;

    static {
        abcd.wu.j6(abcd.Runnabletl.class, -401236586759554245L, 734561498111404740L);
    }

    Runnabletl(abcd.ul r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 244530054151070079L)
    public void run() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 10: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 14; continue $sw0; }
                    abcd.wu.j6(th, 644979709064516700L, this);
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 7; continue $sw0; }
                    try {
                        abcd.wu.j6(644979709064516700L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 10; continue $sw0;
                    }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (abcd.ul.FH(this.FH) == null) { $pc0 = 17; continue $sw0; }
                    try {
                        abcd.ul.FH(this.FH).FH();
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
