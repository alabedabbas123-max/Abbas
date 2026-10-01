package abcd;

@abcd.Interfacexu
class ba {

    @abcd.Interfacetu
    private static boolean DW;

    @abcd.Interfaceuu
    private static boolean FH;
    static final int[] j6 = null;

    static {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        abcd.wu.j6(abcd.ba.class, 340607572698323840L, -1304889476635432900L);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 12; continue $sw0;
                    }
                    if (DW == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(1133788793453881355L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 12; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        j6 = new int[abcd.ca.a.values().length];
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 12; continue $sw0;
                    }
                    try {
                        j6[abcd.ca.a.j6.ordinal()] = 1;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc0 = 17; continue $sw0; }
                        $pc0 = 12; continue $sw0;
                    }
                    $pc0 = 21; continue $sw0;
                }
                case 21: {
                    try {
                        j6[abcd.ca.a.DW.ordinal()] = 2;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc0 = 18; continue $sw0; }
                        $pc0 = 12; continue $sw0;
                    }
                    $pc0 = 25; continue $sw0;
                }
                case 25: {
                    try {
                        j6[abcd.ca.a.FH.ordinal()] = 3;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc0 = 19; continue $sw0; }
                        $pc0 = 12; continue $sw0;
                    }
                    $pc0 = 29; continue $sw0;
                }
                case 29: {
                    try {
                        j6[abcd.ca.a.Hw.ordinal()] = 4;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc0 = 20; continue $sw0; }
                        $pc0 = 12; continue $sw0;
                    }
                    return;
                }
                case 30: {
                    return;
                }
                case 12: {
                    th = $ex0;
                    if (FH == false) { $pc0 = 16; continue $sw0; }
                    abcd.wu.j6(th, 1133788793453881355L, null);
                    $pc0 = 16; continue $sw0;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 17: {
                    return;
                }
                case 18: {
                    return;
                }
                case 19: {
                    return;
                }
                case 20: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
