package abcd;

class Uo {
    static final int[] j6 = null;

    static {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    j6 = new int[abcd.Ir.values().length];
                    try {
                        j6[abcd.Ir.DW.ordinal()] = 1;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc0 = 7; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    try {
                        j6[abcd.Ir.j6.ordinal()] = 2;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc0 = 8; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    try {
                        j6[abcd.Ir.FH.ordinal()] = 3;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc0 = 9; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 7: {
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
