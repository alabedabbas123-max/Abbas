package abcd;

public class pw {
    public static int DW = 1;
    public static int FH = 2;
    private static final java.lang.Object Hw = null;
    private static long Zo;
    public static int j6;
    private static org.json.JSONObject v5;

    static {
        Hw = new java.lang.Object();
        v5 = new org.json.JSONObject();
        Zo = -1;
    }

    public static int DW(abcd.lw r2, boolean r3) {
        return j6(j6(r2), DW(j6(r2)), FH(), r3);
    }

    private static java.io.File DW() {
        return new java.io.File(abcd.uw.j6(abcd.wu.j6()), "appstate.json");
    }

    private static java.lang.String DW(java.lang.String r2) {
        return "has_occurred_for_app_version_" + r2;
    }

    public static int FH(abcd.lw r2, boolean r3) {
        return j6(j6(r2), FH(j6(r2)), Hw(), r3);
    }

    private static java.lang.String FH() {
        return com.appfour.backbone.api.Api.getAppVersionCode() + "";
    }

    private static java.lang.String FH(java.lang.String r2) {
        return "has_occurred_for_day_" + r2;
    }

    public static int Hw(abcd.lw r2, boolean r3) {
        return j6(j6(r2), Hw(j6(r2)), Zo(), r3);
    }

    private static java.lang.String Hw() {
        return "" + (com.appfour.backbone.api.Api.getTimeSinceInstall() / 86400000);
    }

    private static java.lang.String Hw(java.lang.String r2) {
        return "has_occurred_for_month_" + r2;
    }

    private static java.lang.String VH() {
        return "" + (com.appfour.backbone.api.Api.getTimeSinceInstall() / 604800000);
    }

    private static java.lang.String Zo() {
        return "" + (com.appfour.backbone.api.Api.getTimeSinceInstall() / (-1616567296));
    }

    private static void Zo(java.lang.String r2) {
        j6(j6(r2), j6());
        j6(DW(r2), FH());
        j6(Hw(r2), Zo());
        j6(v5(r2), VH());
        j6(FH(r2), Hw());
    }

    private static void gn() {
        long r0 = 0L;
        java.io.FileReader r2 = null;
        java.lang.Throwable r3 = null;
        java.io.BufferedReader r4 = null;
        java.lang.StringBuilder r5 = null;
        char[] r6 = null;
        int r7 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable r1 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = DW().lastModified();
                    r2 = new java.io.FileReader(DW());
                    r3 = null;
                    try {
                        r4 = new java.io.BufferedReader(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc0 = 29; continue $sw0; }
                        $pc0 = 27; continue $sw0;
                    }
                    try {
                        r5 = new java.lang.StringBuilder();
                        r6 = new char[65536];
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc0 = 16; continue $sw0; }
                        $pc0 = 14; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        r7 = r4.read(r6, 0, r6.length);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc0 = 16; continue $sw0; }
                        $pc0 = 14; continue $sw0;
                    }
                    if (r7 < 0) { $pc0 = 8; continue $sw0; }
                    try {
                        r5.append(r6, 0, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc0 = 16; continue $sw0; }
                        $pc0 = 14; continue $sw0;
                    }
                    { $pc0 = 5; continue $sw0; }
                }
                case 8: {
                    try {
                        v5 = new org.json.JSONObject(r5.toString());
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc0 = 16; continue $sw0; }
                        $pc0 = 14; continue $sw0;
                    }
                    if (r0 == 0) { $pc0 = 11; continue $sw0; }
                    try {
                        Zo = r0;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc0 = 16; continue $sw0; }
                        $pc0 = 14; continue $sw0;
                    }
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    try {
                        r4.close();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc0 = 29; continue $sw0; }
                        $pc0 = 27; continue $sw0;
                    }
                    r2.close();
                    return;
                }
                case 14: {
                    th = th;
                    r1 = null;
                    $pc0 = 20; continue $sw0;
                }
                case 20: {
                    if (r1 != null) { $pc0 = 42; continue $sw0; }
                    try {
                        r4.close();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc0 = 29; continue $sw0; }
                        $pc0 = 27; continue $sw0;
                    }
                }
                case 42: {
                    try {
                        r4.close();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc0 = 27; continue $sw0; }
                        $pc0 = 23; continue $sw0;
                    }
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc0 = 29; continue $sw0; }
                        $pc0 = 27; continue $sw0;
                    }
                }
                case 23: {
                    th = $ex0;
                    try {
                        r1.addSuppressed(th);
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc0 = 29; continue $sw0; }
                        $pc0 = 27; continue $sw0;
                    }
                }
                case 16: {
                    th = $ex0;
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 18; continue $sw0;
                    }
                }
                case 18: {
                    th = $ex0;
                    r1 = th;
                    th = th;
                    $pc0 = 39; continue $sw0;
                }
                case 29: {
                    th = $ex0;
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 27; continue $sw0;
                    }
                }
                case 27: {
                    th = $ex0;
                    if (0 != 0) { $pc0 = 46; continue $sw0; }
                    r2.close();
                    $pc0 = 39; continue $sw0;
                }
                case 39: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 46: {
                    try {
                        r2.close();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 35; continue $sw0;
                    }
                    return;
                }
                case 35: {
                    th = $ex0;
                    r3.addSuppressed(th);
                    { $pc0 = 39; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static int j6(abcd.lw r2, boolean r3) {
        return j6(j6(r2), j6(j6(r2)), j6(), r3);
    }

    private static int j6(java.lang.String r12, java.lang.String r13, java.lang.String r14, boolean r15) {
        synchronized (Hw) {
            long r0 = 0L;
            java.lang.Object r2 = null;
            boolean r5 = false;
            abcd.tw r3 = null;
            int r16 = 0;
            abcd.tw r17 = null;
            int r18 = 0;
            int r19 = 0;
            int r110 = 0;
            int r111 = 0;
            int r112 = 0;
            java.lang.Throwable e = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        r0 = java.lang.System.currentTimeMillis();
                        r2 = Hw;
                        r5 = true;
                        try {
                            r3 = new abcd.tw(v5(), true);
                            r3.j6();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.lang.Throwable) { $pc1 = 55; continue $sw1; }
                            if ($t instanceof java.io.IOException) { $pc1 = 57; continue $sw1; }
                            $pc1 = 53; continue $sw1;
                        }
                        $pc1 = 6; continue $sw1;
                    }
                    case 50: {
                        th = $ex1;
                        try {
                            r3.DW();
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.lang.Throwable) { $pc1 = 55; continue $sw1; }
                            if ($t instanceof java.io.IOException) { $pc1 = 57; continue $sw1; }
                            $pc1 = 53; continue $sw1;
                        }
                    }
                    case 6: {
                        if (DW().exists() == true) { $pc1 = 8; continue $sw1; }
                        if (r15 == true) { $pc1 = 31; continue $sw1; }
                        try {
                            r16 = j6;
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 50; continue $sw1;
                        }
                        try {
                            r3.DW();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.lang.Throwable) { $pc1 = 55; continue $sw1; }
                            if ($t instanceof java.io.IOException) { $pc1 = 57; continue $sw1; }
                            $pc1 = 53; continue $sw1;
                        }
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 53; continue $sw1;
                        }
                        return r16;
                    }
                    case 31: {
                        try {
                            r3.DW();
                            r17 = new abcd.tw(v5(), false);
                            r17.j6();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.lang.Throwable) { $pc1 = 55; continue $sw1; }
                            if ($t instanceof java.io.IOException) { $pc1 = 57; continue $sw1; }
                            $pc1 = 53; continue $sw1;
                        }
                        $pc1 = 33; continue $sw1;
                    }
                    case 47: {
                        th = $ex1;
                        try {
                            r17.DW();
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.lang.Throwable) { $pc1 = 55; continue $sw1; }
                            if ($t instanceof java.io.IOException) { $pc1 = 57; continue $sw1; }
                            $pc1 = 53; continue $sw1;
                        }
                    }
                    case 33: {
                        if (DW().exists() == true) { $pc1 = 35; continue $sw1; }
                        $pc1 = 43; continue $sw1;
                    }
                    case 43: {
                        try {
                            Zo(r12);
                            u7();
                            abcd.yw.j6("App state", "Saving appstate elapsed " + (java.lang.System.currentTimeMillis() - r0) + "ms.");
                            r18 = FH;
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 47; continue $sw1;
                        }
                        try {
                            r17.DW();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.lang.Throwable) { $pc1 = 55; continue $sw1; }
                            if ($t instanceof java.io.IOException) { $pc1 = 57; continue $sw1; }
                            $pc1 = 53; continue $sw1;
                        }
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 53; continue $sw1;
                        }
                        return r18;
                    }
                    case 35: {
                        if (Zo == DW().lastModified()) { $pc1 = 38; continue $sw1; }
                        try {
                            gn();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 47; continue $sw1;
                        }
                        $pc1 = 38; continue $sw1;
                    }
                    case 38: {
                        if (r14.equals(v5.optString(r13, null)) == false) { $pc1 = 43; continue $sw1; }
                        try {
                            r19 = DW;
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 47; continue $sw1;
                        }
                        try {
                            r17.DW();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.lang.Throwable) { $pc1 = 55; continue $sw1; }
                            if ($t instanceof java.io.IOException) { $pc1 = 57; continue $sw1; }
                            $pc1 = 53; continue $sw1;
                        }
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 53; continue $sw1;
                        }
                        return r19;
                    }
                    case 8: {
                        if (Zo == DW().lastModified()) { $pc1 = 10; continue $sw1; }
                        try {
                            gn();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 50; continue $sw1;
                        }
                        $pc1 = 12; continue $sw1;
                    }
                    case 12: {
                        if (r14.equals(v5.optString(r13, null)) == false) { $pc1 = 19; continue $sw1; }
                        if (r5 == false) { $pc1 = 15; continue $sw1; }
                        try {
                            abcd.yw.j6("App state", "Reading appstate value elapsed " + (java.lang.System.currentTimeMillis() - r0) + "ms.");
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 50; continue $sw1;
                        }
                        $pc1 = 15; continue $sw1;
                    }
                    case 15: {
                        try {
                            r110 = DW;
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 50; continue $sw1;
                        }
                        try {
                            r3.DW();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.lang.Throwable) { $pc1 = 55; continue $sw1; }
                            if ($t instanceof java.io.IOException) { $pc1 = 57; continue $sw1; }
                            $pc1 = 53; continue $sw1;
                        }
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 53; continue $sw1;
                        }
                        return r110;
                    }
                    case 19: {
                        if (r15 == true) { $pc1 = 31; continue $sw1; }
                        if (r5 == false) { $pc1 = 22; continue $sw1; }
                        try {
                            abcd.yw.j6("App state", "Reading appstate value elapsed " + (java.lang.System.currentTimeMillis() - r0) + "ms.");
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 50; continue $sw1;
                        }
                        $pc1 = 22; continue $sw1;
                    }
                    case 22: {
                        try {
                            r111 = j6;
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 50; continue $sw1;
                        }
                        try {
                            r3.DW();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.lang.Throwable) { $pc1 = 55; continue $sw1; }
                            if ($t instanceof java.io.IOException) { $pc1 = 57; continue $sw1; }
                            $pc1 = 53; continue $sw1;
                        }
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 53; continue $sw1;
                        }
                        return r111;
                    }
                    case 10: {
                        r5 = false;
                        throw new java.lang.IllegalStateException();
                    }
                    case 53: {
                        th = $ex1;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 55: {
                        e = $ex1;
                        try {
                            abcd.yw.j6("I/O error accessing appstate", e);
                            r112 = j6;
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 53; continue $sw1;
                        }
                        return r112;
                    }
                    case 57: {
                        throw new java.lang.IllegalStateException();
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    private static java.lang.String j6() {
        return "true";
    }

    private static java.lang.String j6(abcd.lw r2) {
        return "event_" + r2.DW();
    }

    private static java.lang.String j6(java.lang.String r2) {
        return "has_occurred_" + r2;
    }

    private static void j6(java.lang.String r1, java.lang.String r2) {
        v5.put(r1, r2);
    }

    private static void u7() {
        long r0 = 0L;
        java.io.File r2 = null;
        java.io.FileOutputStream r3 = null;
        java.lang.Throwable r4 = null;
        java.io.BufferedWriter r5 = null;
        long r6 = 0L;
        java.lang.Throwable r1 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = DW().lastModified();
                    r2 = java.io.File.createTempFile("tmp", "json", DW().getParentFile());
                    try {
                        r3 = new java.io.FileOutputStream(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 51; continue $sw2;
                    }
                    r4 = null;
                    try {
                        r5 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(r3));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc2 = 41; continue $sw2; }
                        $pc2 = 39; continue $sw2;
                    }
                    try {
                        r5.write(v5.toString(4));
                        r5.flush();
                        r3.getFD().sync();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc2 = 28; continue $sw2; }
                        $pc2 = 26; continue $sw2;
                    }
                    try {
                        r5.close();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc2 = 41; continue $sw2; }
                        $pc2 = 39; continue $sw2;
                    }
                    try {
                        r3.close();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 51; continue $sw2;
                    }
                    if (r2.renameTo(DW()) == false) { $pc2 = 25; continue $sw2; }
                    try {
                        r6 = DW().lastModified();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 51; continue $sw2;
                    }
                    if (r6 == 0) { $pc2 = 23; continue $sw2; }
                    if (r6 != r0) { $pc2 = 19; continue $sw2; }
                    try {
                        r6 = r6 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 51; continue $sw2;
                    }
                    if (DW().setLastModified(r6) == true) { $pc2 = 19; continue $sw2; }
                    try {
                        throw new java.io.IOException("Could not bump app state last modified.");
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 51; continue $sw2;
                    }
                }
                case 19: {
                    try {
                        Zo = r6;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 51; continue $sw2;
                    }
                    r2.delete();
                    return;
                }
                case 23: {
                    try {
                        throw new java.io.IOException("App state file vanished after creation.");
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 51; continue $sw2;
                    }
                }
                case 25: {
                    try {
                        throw new java.io.IOException("Could not rename temp file to app state file.");
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 51; continue $sw2;
                    }
                }
                case 28: {
                    th = $ex2;
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 30; continue $sw2;
                    }
                }
                case 30: {
                    th = $ex2;
                    r1 = th;
                    th = th;
                    $pc2 = 32; continue $sw2;
                }
                case 32: {
                    if (r1 != null) { $pc2 = 58; continue $sw2; }
                    try {
                        r5.close();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc2 = 41; continue $sw2; }
                        $pc2 = 39; continue $sw2;
                    }
                }
                case 58: {
                    try {
                        r5.close();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc2 = 39; continue $sw2; }
                        $pc2 = 35; continue $sw2;
                    }
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc2 = 41; continue $sw2; }
                        $pc2 = 39; continue $sw2;
                    }
                }
                case 35: {
                    th = $ex2;
                    try {
                        r1.addSuppressed(th);
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc2 = 41; continue $sw2; }
                        $pc2 = 39; continue $sw2;
                    }
                }
                case 26: {
                    th = th;
                    r1 = null;
                    $pc2 = 50; continue $sw2;
                }
                case 39: {
                    th = $ex2;
                    if (0 != 0) { $pc2 = 54; continue $sw2; }
                    try {
                        r3.close();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 51; continue $sw2;
                    }
                    $pc2 = 50; continue $sw2;
                }
                case 50: {
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 51; continue $sw2;
                    }
                }
                case 54: {
                    try {
                        r3.close();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc2 = 51; continue $sw2; }
                        $pc2 = 47; continue $sw2;
                    }
                    return;
                }
                case 47: {
                    th = $ex2;
                    try {
                        r4.addSuppressed(th);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 51; continue $sw2;
                    }
                    return;
                }
                case 41: {
                    th = $ex2;
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 39; continue $sw2;
                    }
                }
                case 51: {
                    th = $ex2;
                    r2.delete();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static int v5(abcd.lw r2, boolean r3) {
        return j6(j6(r2), v5(j6(r2)), VH(), r3);
    }

    private static java.io.File v5() {
        return new java.io.File(abcd.uw.j6(abcd.wu.j6()), "appstate.json.lock");
    }

    private static java.lang.String v5(java.lang.String r2) {
        return "has_occurred_for_week_" + r2;
    }
}
