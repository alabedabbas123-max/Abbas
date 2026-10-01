package abcd;

public class Lw extends abcd.Jw {
    public Lw(java.io.BufferedReader r3) {
        super("failed to parse: " + j6(r3));
    }

    public Lw(java.lang.String r1) {
        super(r1);
    }

    public static java.lang.String j6(java.io.BufferedReader r2) {
        java.lang.StringBuffer r0 = null;
        java.lang.String r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2 != null) { $pc0 = 13; continue $sw0; }
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    r0 = new java.lang.StringBuffer();
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    try {
                        r1 = r2.readLine();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 12; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r1 == null) { $pc0 = 10; continue $sw0; }
                    try {
                        r0.append(r1);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 12; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    return r0.toString();
                }
                case 13: {
                    try {
                        r2.reset();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 11; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc0 = 4; continue $sw0; }
                }
                case 11: {
                    throw new java.lang.IllegalStateException();
                }
                case 12: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
