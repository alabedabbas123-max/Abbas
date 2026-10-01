package abcd;

public class qw {
    private static volatile long DW;
    private static volatile boolean FH;
    private static volatile java.lang.String Hw;
    private static volatile java.util.UUID VH;
    private static volatile long Zo;
    private static final java.lang.Object gn = null;
    private static volatile long j6;
    private static final abcd.tw tp = null;
    private static final abcd.tw u7 = null;
    private static volatile java.util.UUID v5;

    public static class a {
        public boolean DW;
        public java.lang.String j6;

        public a(java.lang.String r1, boolean r2) {
            this.j6 = r1;
            this.DW = r2;
        }
    }

    static {
        gn = new java.lang.Object();
        u7 = new abcd.tw(Hw(), true);
        tp = new abcd.tw(Hw(), false);
    }

    public static void DW() {
        synchronized (gn) {
            java.lang.String r0 = null;
            java.lang.Object r1 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        r0 = android.provider.Settings.Secure.getString(abcd.wu.j6().getContentResolver(), "android_id");
                        r1 = gn;
                        try {
                            Hw = r0;
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 7; continue $sw0;
                        }
                        return;
                    }
                    case 7: {
                        th = $ex0;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    private static java.io.File FH() {
        return new java.io.File(abcd.uw.j6(abcd.wu.j6()), "sessionid.txt");
    }

    private static java.io.File Hw() {
        return new java.io.File(abcd.uw.j6(abcd.wu.j6()), "sessionid.txt.lock");
    }

    private static void VH() {
        java.io.File r1 = null;
        long r2 = 0L;
        long r3 = 0L;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (gn() == false) { $pc1 = 27; continue $sw1; }
                    abcd.yw.j6("SessionIds", "Session ID file may be outdated.");
                    try {
                        tp.j6();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 22; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    try {
                        r1 = FH();
                        r2 = r1.lastModified();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 19; continue $sw1;
                    }
                    if (r2 == 0) { $pc1 = 18; continue $sw1; }
                    try {
                        DW = r2;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 19; continue $sw1;
                    }
                    if (gn() == false) { $pc1 = 15; continue $sw1; }
                    try {
                        abcd.yw.j6("SessionIds", "Session ID file is outdated - touching");
                        r3 = java.lang.System.currentTimeMillis();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 19; continue $sw1;
                    }
                    if (r1.setLastModified(r3) == false) { $pc1 = 14; continue $sw1; }
                    try {
                        DW = r3;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 19; continue $sw1;
                    }
                    { $pc1 = 15; continue $sw1; }
                }
                case 14: {
                    try {
                        throw new java.io.IOException("Could not touch session file");
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 19; continue $sw1;
                    }
                }
                case 15: {
                    try {
                        tp.DW();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 22; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 18: {
                    try {
                        throw new java.io.IOException("Session file vanished");
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 19; continue $sw1;
                    }
                }
                case 19: {
                    th = $ex1;
                    try {
                        tp.DW();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 22; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 22: {
                    e = $ex1;
                    abcd.yw.j6("Error touching session ID file", e);
                    FH = true;
                    v5 = null;
                    return;
                }
                case 27: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static boolean Zo() {
        java.io.File r1 = null;
        boolean r4 = false;
        long r5 = 0L;
        long r6 = 0L;
        java.io.File r7 = null;
        java.io.FileOutputStream r8 = null;
        java.io.OutputStreamWriter r9 = null;
        java.util.UUID r0 = null;
        long r2 = 0L;
        java.lang.Throwable r3 = null;
        java.lang.Throwable r10 = null;
        java.lang.Throwable r11 = null;
        java.lang.Throwable r12 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    abcd.yw.j6("SessionIds", "Loading/updating session ID from/on disk");
                    r1 = FH();
                    r4 = false;
                    try {
                        u7.j6();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 75; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    try {
                        r5 = r1.lastModified();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 72; continue $sw2;
                    }
                    if (r5 != 0) { $pc2 = 7; continue $sw2; }
                    $pc2 = 9; continue $sw2;
                }
                case 9: {
                    try {
                        u7.DW();
                        tp.j6();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 72; continue $sw2;
                    }
                    try {
                        r6 = r1.lastModified();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 69; continue $sw2;
                    }
                    if (r6 != 0) { $pc2 = 13; continue $sw2; }
                    $pc2 = 15; continue $sw2;
                }
                case 15: {
                    try {
                        abcd.yw.j6("SessionIds", "Session ID file on disk does not exist or is outdated - updating");
                        r7 = java.io.File.createTempFile("tmp", "txt", r1.getParentFile());
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 69; continue $sw2;
                    }
                    try {
                        r8 = new java.io.FileOutputStream(r7);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 66; continue $sw2;
                    }
                    try {
                        r9 = new java.io.OutputStreamWriter(r8, "UTF-8");
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc2 = 53; continue $sw2; }
                        $pc2 = 51; continue $sw2;
                    }
                    try {
                        r0 = java.util.UUID.randomUUID();
                        r9.write(r0.toString());
                        r9.flush();
                        r8.getFD().sync();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc2 = 38; continue $sw2; }
                        $pc2 = 36; continue $sw2;
                    }
                    try {
                        r9.close();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc2 = 53; continue $sw2; }
                        $pc2 = 51; continue $sw2;
                    }
                    try {
                        r8.close();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 66; continue $sw2;
                    }
                    if (r7.renameTo(r1) == false) { $pc2 = 35; continue $sw2; }
                    try {
                        v5 = r0;
                        r2 = r1.lastModified();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 66; continue $sw2;
                    }
                    if (r2 == 0) { $pc2 = 33; continue $sw2; }
                    try {
                        DW = r2;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 66; continue $sw2;
                    }
                    try {
                        r7.delete();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 30; continue $sw2;
                    }
                    r4 = true;
                    $pc2 = 27; continue $sw2;
                }
                case 27: {
                    try {
                        tp.DW();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 72; continue $sw2;
                    }
                    $pc2 = 28; continue $sw2;
                }
                case 28: {
                    try {
                        u7.DW();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 75; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc2 = 77; continue $sw2;
                }
                case 77: {
                    return r4;
                }
                case 30: {
                    th = th;
                    $pc2 = 70; continue $sw2;
                }
                case 70: {
                    try {
                        tp.DW();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 72; continue $sw2;
                    }
                }
                case 33: {
                    try {
                        throw new java.io.IOException("Session file vanished after creation");
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 66; continue $sw2;
                    }
                }
                case 35: {
                    try {
                        throw new java.io.IOException("Could not rename temp file over session ID file");
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 66; continue $sw2;
                    }
                }
                case 36: {
                    th = $ex2;
                    r3 = th;
                    r10 = null;
                    $pc2 = 43; continue $sw2;
                }
                case 43: {
                    if (r10 != null) { $pc2 = 91; continue $sw2; }
                    try {
                        r9.close();
                        throw r3;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc2 = 53; continue $sw2; }
                        $pc2 = 51; continue $sw2;
                    }
                }
                case 91: {
                    try {
                        r9.close();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc2 = 51; continue $sw2; }
                        $pc2 = 46; continue $sw2;
                    }
                    try {
                        throw r3;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc2 = 53; continue $sw2; }
                        $pc2 = 51; continue $sw2;
                    }
                }
                case 46: {
                    th = $ex2;
                    try {
                        r10.addSuppressed(th);
                        throw r3;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc2 = 53; continue $sw2; }
                        $pc2 = 51; continue $sw2;
                    }
                }
                case 38: {
                    th = $ex2;
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 41; continue $sw2;
                    }
                }
                case 41: {
                    th = $ex2;
                    r10 = th;
                    r3 = th;
                    $pc2 = 58; continue $sw2;
                }
                case 51: {
                    th = $ex2;
                    r11 = th;
                    r12 = null;
                    $pc2 = 58; continue $sw2;
                }
                case 58: {
                    if (r12 != null) { $pc2 = 88; continue $sw2; }
                    try {
                        r8.close();
                        throw r11;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 66; continue $sw2;
                    }
                }
                case 88: {
                    try {
                        r8.close();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc2 = 66; continue $sw2; }
                        $pc2 = 61; continue $sw2;
                    }
                    $pc2 = 98; continue $sw2;
                }
                case 98: {
                    try {
                        throw r11;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 66; continue $sw2;
                    }
                }
                case 61: {
                    th = $ex2;
                    try {
                        r12.addSuppressed(th);
                        throw r11;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 66; continue $sw2;
                    }
                }
                case 53: {
                    th = $ex2;
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 56; continue $sw2;
                    }
                }
                case 56: {
                    th = $ex2;
                    r12 = th;
                    r11 = th;
                    $pc2 = 13; continue $sw2;
                }
                case 66: {
                    th = $ex2;
                    try {
                        r7.delete();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 69; continue $sw2;
                    }
                }
                case 13: {
                    if (java.lang.System.currentTimeMillis() >= (900000 + r6)) { $pc2 = 15; continue $sw2; }
                    try {
                        abcd.yw.j6("SessionIds", "Session ID file on disk seems to be valid, loading from disk (2)");
                        u7();
                        DW = r6;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 69; continue $sw2;
                    }
                    $pc2 = 7; continue $sw2;
                }
                case 69: {
                    th = th;
                    { $pc2 = 70; continue $sw2; }
                }
                case 7: {
                    if (java.lang.System.currentTimeMillis() >= (r5 + 900000)) { $pc2 = 9; continue $sw2; }
                    try {
                        abcd.yw.j6("SessionIds", "Session ID file on disk seems to be valid, loading from disk");
                        u7();
                        DW = r5;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 72; continue $sw2;
                    }
                    throw new java.lang.IllegalStateException();
                }
                case 72: {
                    th = $ex2;
                    try {
                        u7.DW();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 75; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 75: {
                    e = $ex2;
                    abcd.yw.j6("Error reading, creating or updating session ID file", e);
                    FH = true;
                    v5 = null;
                    { $pc2 = 77; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static boolean gn() {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (DW >= (java.lang.System.currentTimeMillis() - 60000)) { $pc3 = 5; continue $sw3; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.qw.a j6(long r6, boolean r8) {
        abcd.qw.a r7 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (java.lang.Math.abs(r6 - java.lang.System.currentTimeMillis()) > 900000) { $pc4 = 5; continue $sw4; }
                    r7 = j6(r8);
                    if (r7 == null) { $pc4 = 17; continue $sw4; }
                    return r7;
                }
                case 17: {
                    return new abcd.qw.a(abcd.Aw.j6(abcd.Aw.j6), false);
                }
                case 5: {
                    if (java.lang.Math.abs(Zo - r6) <= 900000) { $pc4 = 7; continue $sw4; }
                    $pc4 = 11; continue $sw4;
                }
                case 11: {
                    Zo = r6;
                    VH = java.util.UUID.randomUUID();
                    return new abcd.qw.a(abcd.Aw.j6(VH), true);
                }
                case 7: {
                    if (VH == null) { $pc4 = 11; continue $sw4; }
                    return new abcd.qw.a(abcd.Aw.j6(VH), false);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static abcd.qw.a j6(boolean r3) {
        synchronized (gn) {
            boolean r0 = false;
            java.lang.Object r1 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex5 = null;
            int $pc5 = -1;
            $sw5: while (true) {
                switch ($pc5) {
                    case -1: {
                        if (FH == false) { $pc5 = 6; continue $sw5; }
                        return null;
                    }
                    case 6: {
                        r0 = false;
                        if (v5() == true) { $pc5 = 16; continue $sw5; }
                        r1 = gn;
                        try {
                            r0 = Zo();
                        } catch (java.lang.Throwable $t) {
                            $ex5 = $t;
                            $pc5 = 13; continue $sw5;
                        }
                        j6 = java.lang.System.currentTimeMillis();
                        $pc5 = 18; continue $sw5;
                    }
                    case 18: {
                        VH();
                        return new abcd.qw.a(abcd.Aw.j6(v5), r0);
                    }
                    case 13: {
                        th = $ex5;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 16: {
                        if (r3 == false) { $pc5 = 18; continue $sw5; }
                        j6 = java.lang.System.currentTimeMillis();
                        { $pc5 = 18; continue $sw5; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    public static java.lang.String j6() {
        return Hw;
    }

    private static void u7() {
        java.io.FileInputStream r0 = null;
        java.lang.Throwable r1 = null;
        java.io.BufferedReader r2 = null;
        java.lang.Throwable r4 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = new java.io.FileInputStream(FH());
                    r1 = null;
                    try {
                        r2 = new java.io.BufferedReader(new java.io.InputStreamReader(r0, "UTF-8"));
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc6 = 27; continue $sw6; }
                        $pc6 = 25; continue $sw6;
                    }
                    try {
                        v5 = java.util.UUID.fromString(r2.readLine());
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc6 = 10; continue $sw6; }
                        if ($t instanceof java.lang.IllegalArgumentException) { $pc6 = 12; continue $sw6; }
                        $pc6 = 8; continue $sw6;
                    }
                    try {
                        r2.close();
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc6 = 27; continue $sw6; }
                        $pc6 = 25; continue $sw6;
                    }
                    r0.close();
                    return;
                }
                case 12: {
                    e = $ex6;
                    try {
                        throw new java.io.IOException(e);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc6 = 10; continue $sw6; }
                        $pc6 = 8; continue $sw6;
                    }
                }
                case 10: {
                    th = $ex6;
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 16; continue $sw6;
                    }
                }
                case 16: {
                    th = $ex6;
                    r4 = th;
                    th = th;
                    $pc6 = 18; continue $sw6;
                }
                case 18: {
                    if (r4 != null) { $pc6 = 38; continue $sw6; }
                    try {
                        r2.close();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc6 = 27; continue $sw6; }
                        $pc6 = 25; continue $sw6;
                    }
                }
                case 38: {
                    try {
                        r2.close();
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc6 = 25; continue $sw6; }
                        $pc6 = 21; continue $sw6;
                    }
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc6 = 27; continue $sw6; }
                        $pc6 = 25; continue $sw6;
                    }
                }
                case 21: {
                    th = $ex6;
                    try {
                        r4.addSuppressed(th);
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc6 = 27; continue $sw6; }
                        $pc6 = 25; continue $sw6;
                    }
                }
                case 8: {
                    th = th;
                    r4 = null;
                    $pc6 = 35; continue $sw6;
                }
                case 25: {
                    th = $ex6;
                    if (0 != 0) { $pc6 = 40; continue $sw6; }
                    r0.close();
                    $pc6 = 35; continue $sw6;
                }
                case 35: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 40: {
                    try {
                        r0.close();
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 32; continue $sw6;
                    }
                    return;
                }
                case 32: {
                    th = $ex6;
                    r1.addSuppressed(th);
                    return;
                }
                case 27: {
                    th = $ex6;
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 25; continue $sw6;
                    }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static boolean v5() {
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (java.lang.System.currentTimeMillis() >= (j6 + 900000)) { $pc7 = 5; continue $sw7; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
