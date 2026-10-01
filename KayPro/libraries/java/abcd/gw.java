package abcd;

public class gw {
    public static void j6(java.lang.String r8, java.io.File r9, long r10) {
        long r1 = 0L;
        java.net.HttpURLConnection r11 = null;
        java.io.InputStream r12 = null;
        java.lang.Throwable r13 = null;
        java.io.FileOutputStream r3 = null;
        byte[] r4 = null;
        int r5 = 0;
        int r14 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable r15 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (abcd.vw.DW() == false) { $pc0 = 73; continue $sw0; }
                    r1 = java.lang.System.currentTimeMillis();
                    try {
                        r11 = (java.net.HttpURLConnection) new java.net.URL(r8).openConnection();
                        r11.setIfModifiedSince(r10);
                        r12 = r11.getInputStream();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 52; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r13 = null;
                    try {
                        r3 = new java.io.FileOutputStream(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc0 = 41; continue $sw0; }
                        $pc0 = 39; continue $sw0;
                    }
                    try {
                        r4 = new byte[655360];
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc0 = 28; continue $sw0; }
                        $pc0 = 26; continue $sw0;
                    }
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    try {
                        r5 = r12.read(r4);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc0 = 28; continue $sw0; }
                        $pc0 = 26; continue $sw0;
                    }
                    if (r5 == (-1)) { $pc0 = 15; continue $sw0; }
                    try {
                        r3.write(r4, 0, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc0 = 28; continue $sw0; }
                        $pc0 = 26; continue $sw0;
                    }
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    try {
                        r3.close();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc0 = 41; continue $sw0; }
                        $pc0 = 39; continue $sw0;
                    }
                    if (r12 == null) { $pc0 = 18; continue $sw0; }
                    try {
                        r12.close();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 52; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 18; continue $sw0;
                }
                case 18: {
                    try {
                        r14 = r11.getResponseCode();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 52; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r14 != 200) { $pc0 = 22; continue $sw0; }
                    try {
                        r9.setLastModified(r11.getLastModified());
                        abcd.yw.j6("Probes", "Probes download took " + (java.lang.System.currentTimeMillis() - r1) + "ms");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 52; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 22: {
                    if (r14 != 304) { $pc0 = 24; continue $sw0; }
                    try {
                        r9.delete();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 52; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 24: {
                    try {
                        r9.delete();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 52; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 26: {
                    th = th;
                    r15 = null;
                    $pc0 = 32; continue $sw0;
                }
                case 32: {
                    if (r15 != null) { $pc0 = 62; continue $sw0; }
                    try {
                        r3.close();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc0 = 41; continue $sw0; }
                        $pc0 = 39; continue $sw0;
                    }
                }
                case 62: {
                    try {
                        r3.close();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc0 = 39; continue $sw0; }
                        $pc0 = 35; continue $sw0;
                    }
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc0 = 41; continue $sw0; }
                        $pc0 = 39; continue $sw0;
                    }
                }
                case 35: {
                    th = $ex0;
                    try {
                        r15.addSuppressed(th);
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc0 = 41; continue $sw0; }
                        $pc0 = 39; continue $sw0;
                    }
                }
                case 28: {
                    th = $ex0;
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 30; continue $sw0;
                    }
                }
                case 30: {
                    th = $ex0;
                    r15 = th;
                    th = th;
                    $pc0 = 41; continue $sw0;
                }
                case 41: {
                    th = $ex0;
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 39; continue $sw0;
                    }
                }
                case 39: {
                    th = $ex0;
                    if (r12 == null) { $pc0 = 51; continue $sw0; }
                    if (0 != 0) { $pc0 = 56; continue $sw0; }
                    try {
                        r12.close();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 52; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc0 = 51; continue $sw0; }
                }
                case 56: {
                    try {
                        r12.close();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 48; continue $sw0;
                    }
                    $pc0 = 48; continue $sw0;
                }
                case 48: {
                    th = $ex0;
                    try {
                        r13.addSuppressed(th);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 52; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 51; continue $sw0;
                }
                case 51: {
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 52; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 52: {
                    e = $ex0;
                    abcd.yw.j6("Probes", "Probes download error", e);
                    return;
                }
                case 77: {
                    return;
                }
                case 73: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
