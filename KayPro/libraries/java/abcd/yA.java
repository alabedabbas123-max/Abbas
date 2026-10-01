package abcd;

public class yA {
    static java.lang.Object DW;
    static java.lang.reflect.Method FH;
    static abcd.InterfacetA Hw;
    static java.lang.reflect.Method j6;

    static {
        java.lang.Class<?> r2 = null;
        java.lang.Class<?> r3 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    Hw = abcd.uA.j6(abcd.yA.class.getName());
                    try {
                        r2 = java.lang.Class.forName("android.util.Base64");
                        j6 = r2.getMethod("encode", new java.lang.Class[]{byte[].class, java.lang.Integer.TYPE});
                        Hw.Hw(r2.getName() + " is available.");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 5; continue $sw0; }
                        if ($t instanceof java.lang.ClassNotFoundException) { $pc0 = 21; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    e = $ex0;
                    Hw.j6("Failed to initialize use of android.util.Base64", e);
                    $pc0 = 22; continue $sw0;
                }
                case 22: {
                    try {
                        r3 = java.lang.Class.forName("org.bouncycastle.util.encoders.Base64Encoder");
                        DW = r3.newInstance();
                        FH = r3.getMethod("encode", new java.lang.Class[]{byte[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.io.OutputStream.class});
                        Hw.Hw(r3.getName() + " is available.");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 10; continue $sw0; }
                        if ($t instanceof java.lang.ClassNotFoundException) { $pc0 = 12; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    e = $ex0;
                    Hw.j6("Failed to initialize use of org.bouncycastle.util.encoders.Base64Encoder", e);
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    if (j6 == null) { $pc0 = 16; continue $sw0; }
                    return;
                }
                case 16: {
                    if (FH == null) { $pc0 = 19; continue $sw0; }
                    return;
                }
                case 19: {
                    throw new java.lang.IllegalStateException("No base64 encoder implementation is available.");
                }
                case 12: {
                    $pc0 = 21; continue $sw0;
                }
                case 21: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public yA() {
    }

    public static java.lang.String j6(byte[] r7) {
        java.io.ByteArrayOutputStream r0 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 3;
        $sw1: while (true) {
            switch ($pc1) {
                case 12: {
                    e = $ex1;
                    throw new java.lang.IllegalStateException(e.getClass().getName() + ": " + e.getMessage());
                }
                case 3: {
                    if (j6 == null) { $pc1 = 7; continue $sw1; }
                    return new java.lang.String((byte[]) j6.invoke(null, new java.lang.Object[]{r7, 2}));
                }
                case 7: {
                    if (FH == null) { $pc1 = 11; continue $sw1; }
                    try {
                        r0 = new java.io.ByteArrayOutputStream();
                        FH.invoke(DW, new java.lang.Object[]{r7, 0, java.lang.Integer.valueOf(r7.length), r0});
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 12; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return new java.lang.String(r0.toByteArray());
                }
                case 11: {
                    throw new java.lang.IllegalStateException("No base64 encoder implementation is available.");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
