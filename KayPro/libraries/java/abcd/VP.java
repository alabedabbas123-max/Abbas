package abcd;

public class VP {
    private static final abcd.UP j6 = null;

    static {
        j6 = new abcd.WP();
    }

    public static byte[] j6(java.lang.String r3) {
        java.io.ByteArrayOutputStream r0 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = new java.io.ByteArrayOutputStream();
                    try {
                        j6.j6(r3, r0);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 6; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return r0.toByteArray();
                }
                case 6: {
                    e = $ex0;
                    throw new java.lang.RuntimeException("exception decoding Hex string: " + e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static byte[] j6(byte[] r2) {
        return j6(r2, 0, r2.length);
    }

    public static byte[] j6(byte[] r2, int r3, int r4) {
        java.io.ByteArrayOutputStream r0 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = new java.io.ByteArrayOutputStream();
                    try {
                        j6.j6(r2, r3, r4, r0);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 6; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return r0.toByteArray();
                }
                case 6: {
                    e = $ex1;
                    throw new java.lang.RuntimeException("exception encoding Hex string: " + e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
