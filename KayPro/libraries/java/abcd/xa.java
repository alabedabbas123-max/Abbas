package abcd;

@abcd.Interfacexu
class xa extends abcd.za.d {

    @abcd.Interfacetu
    private static boolean FH;

    @abcd.Interfaceuu
    private static boolean Hw;

    @abcd.Interfacevu
    final abcd.za v5;

    static {
        abcd.wu.j6(abcd.xa.class, -138465097617559095L, -6266881370596813027L);
    }

    xa(abcd.za r1) {
        this.v5 = r1;
        super(null);
    }

    @Override
    @abcd.Interfacesu(method = 1459063639956626340L)
    protected void FH(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 12: {
                    th = $ex0;
                    if (Hw == false) { $pc0 = 16; continue $sw0; }
                    abcd.wu.j6(th, -8092432158135002424L, this, r5);
                    $pc0 = 16; continue $sw0;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc0 = 7; continue $sw0; }
                    try {
                        abcd.wu.j6(-8092432158135002424L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 12; continue $sw0;
                    }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (r5.toUpperCase(java.util.Locale.US).endsWith(".CLASS") == false) { $pc0 = 9; continue $sw0; }
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    try {
                        new java.io.File(r5).delete();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 12; continue $sw0;
                    }
                    return;
                }
                case 9: {
                    if (r5.toUpperCase(java.util.Locale.US).endsWith(".DEX") == true) { $pc0 = 10; continue $sw0; }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
