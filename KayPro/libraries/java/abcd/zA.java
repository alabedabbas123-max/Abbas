package abcd;

public class zA {
    static abcd.AA j6;

    static {
        j6 = new abcd.AA();
    }

    public static java.lang.String j6(byte[] r11) {
        java.io.ByteArrayOutputStream r0 = null;
        byte[] r1 = null;
        java.lang.StringBuilder r2 = null;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        java.lang.StringBuilder r6 = null;
        java.lang.StringBuilder r7 = null;
        int r9 = 0;
        byte r8 = 0;
        int r10 = 0;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        r0 = new java.io.ByteArrayOutputStream();
                        j6.j6(r11, 0, r11.length, r0);
                        r1 = r0.toByteArray();
                        r2 = new java.lang.StringBuilder();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 25; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r3 = 0;
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r3 >= r1.length) { $pc0 = 23; continue $sw0; }
                    try {
                        r4 = r3 + 32;
                        r5 = java.lang.Math.min(r4, r1.length);
                        r6 = new java.lang.StringBuilder();
                        r7 = new java.lang.StringBuilder();
                        r6.append(java.lang.String.format("%08x: ", new java.lang.Object[]{java.lang.Integer.valueOf(r3 / 2)}));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 25; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (r3 >= r5) { $pc0 = 18; continue $sw0; }
                    try {
                        r6.append(java.lang.Character.valueOf((char) r1[r3]));
                        r6.append(java.lang.Character.valueOf((char) r1[r3 + 1]));
                        r9 = r3 + 2;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 25; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if ((r9 % 4) != 0) { $pc0 = 11; continue $sw0; }
                    try {
                        r6.append(' ');
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 25; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    try {
                        r8 = r11[r3 / 2];
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 25; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r8 >= 32) { $pc0 = 14; continue $sw0; }
                    $pc0 = 16; continue $sw0;
                }
                case 16: {
                    try {
                        r7.append('.');
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 25; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 17; continue $sw0;
                }
                case 17: {
                    r3 = r9;
                    { $pc0 = 7; continue $sw0; }
                }
                case 14: {
                    if (r8 >= 127) { $pc0 = 16; continue $sw0; }
                    try {
                        r7.append(java.lang.Character.valueOf((char) r8));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 25; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc0 = 17; continue $sw0; }
                }
                case 18: {
                    try {
                        r2.append(r6.toString());
                        r10 = r6.length();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 25; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 20; continue $sw0;
                }
                case 20: {
                    if (r10 >= 50) { $pc0 = 22; continue $sw0; }
                    try {
                        r2.append(' ');
                        r10 = r10 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 25; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc0 = 20; continue $sw0; }
                }
                case 22: {
                    try {
                        r2.append("  ");
                        r2.append(r7);
                        r2.append("\n");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 25; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r3 = r4;
                    { $pc0 = 4; continue $sw0; }
                }
                case 23: {
                    return r2.toString();
                }
                case 25: {
                    e = $ex0;
                    throw new java.lang.IllegalStateException(e.getClass().getName() + ": " + e.getMessage());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
