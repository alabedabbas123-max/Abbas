package abcd;

public class Mn {
    private static java.util.HashSet<java.lang.String> DW;
    private static boolean FH;
    private static java.util.HashSet<java.lang.String> j6;

    private static java.util.HashSet<java.lang.String> DW(java.lang.String r4) {
        java.util.HashSet<java.lang.String> r0 = null;
        java.io.FileReader r1 = null;
        java.io.BufferedReader r2 = null;
        java.lang.String r3 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = new java.util.HashSet();
                    try {
                        r1 = new java.io.FileReader(r4);
                        r2 = new java.io.BufferedReader(r1);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 9; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    try {
                        r3 = r2.readLine();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 9; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r3 == null) { $pc0 = 7; continue $sw0; }
                    try {
                        r0.add(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 9; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc0 = 4; continue $sw0; }
                }
                case 7: {
                    try {
                        r1.close();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 9; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return r0;
                }
                case 9: {
                    e = $ex0;
                    throw new java.lang.RuntimeException("Error with optimize list: " + r4, e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(java.lang.String r1, java.lang.String r2) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (FH == false) { $pc1 = 5; continue $sw1; }
                    return;
                }
                case 5: {
                    if (r1 == null) { $pc1 = 10; continue $sw1; }
                    if (r2 == null) { $pc1 = 10; continue $sw1; }
                    throw new java.lang.RuntimeException("optimize and don't optimize lists  are mutually exclusive.");
                }
                case 10: {
                    if (r1 == null) { $pc1 = 12; continue $sw1; }
                    j6 = DW(r1);
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    if (r2 == null) { $pc1 = 14; continue $sw1; }
                    DW = DW(r2);
                    $pc1 = 14; continue $sw1;
                }
                case 14: {
                    FH = true;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean j6(java.lang.String r2) {
        java.util.HashSet<java.lang.String> r0 = null;
        java.util.HashSet<java.lang.String> r1 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = j6;
                    if (r0 != null) { $pc2 = 5; continue $sw2; }
                    r1 = DW;
                    if (r1 != null) { $pc2 = 9; continue $sw2; }
                    return true;
                }
                case 9: {
                    return !r1.contains(r2);
                }
                case 5: {
                    return r0.contains(r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
