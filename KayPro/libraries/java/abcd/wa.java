package abcd;

@abcd.Interfacexu
class wa extends abcd.za.d {

    @abcd.Interfacetu
    private static boolean FH;

    @abcd.Interfaceuu
    private static boolean Hw;

    @abcd.Interfacevu
    final abcd.za Zo;
    final java.lang.String v5;

    static {
        abcd.wu.j6(abcd.wa.class, -138465097617559095L, -6266770808682746200L);
    }

    wa(abcd.za r1, java.lang.String r2) {
        this.Zo = r1;
        this.v5 = r2;
        super(null);
    }

    @Override
    @abcd.Interfacesu(method = -2704588980197683563L)
    protected void DW(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 11: {
                    th = $ex0;
                    if (Hw == false) { $pc0 = 15; continue $sw0; }
                    abcd.wu.j6(th, -197586489804212497L, this, r5);
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc0 = 19; continue $sw0; }
                    try {
                        abcd.wu.j6(-197586489804212497L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    $pc0 = 19; continue $sw0;
                }
                case 19: {
                    try {
                        new java.io.File(r5).getAbsolutePath();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 16; continue $sw0; }
                        $pc0 = 11; continue $sw0;
                    }
                    if (new java.io.File(r5).getCanonicalPath().equals(this.v5) == false) { $pc0 = 9; continue $sw0; }
                    return;
                }
                case 9: {
                    try {
                        new java.io.File(r5).delete();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 16; continue $sw0; }
                        $pc0 = 11; continue $sw0;
                    }
                    return;
                }
                case 16: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 52700490146919312L)
    protected void FH(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 8: {
                    th = $ex1;
                    if (Hw == false) { $pc1 = 12; continue $sw1; }
                    abcd.wu.j6(th, 89075701794184155L, this, r5);
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(89075701794184155L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    try {
                        new java.io.File(r5).delete();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
