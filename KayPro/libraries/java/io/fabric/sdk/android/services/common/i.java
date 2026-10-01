package io.fabric.sdk.android.services.common;

public class i {
    private static final char[] DW = null;
    private static long FH;
    public static final java.util.Comparator<java.io.File> Hw = null;
    private static java.lang.Boolean j6;

    static final class a extends com.almlkaide.kaypro.internal.EnumBase {
        public static final io.fabric.sdk.android.services.common.i.a DW = null;
        private static final java.util.Map<java.lang.String, io.fabric.sdk.android.services.common.i.a> EQ = null;
        public static final io.fabric.sdk.android.services.common.i.a FH = null;
        public static final io.fabric.sdk.android.services.common.i.a Hw = null;
        public static final io.fabric.sdk.android.services.common.i.a VH = null;
        public static final io.fabric.sdk.android.services.common.i.a Zo = null;
        public static final io.fabric.sdk.android.services.common.i.a gn = null;
        public static final io.fabric.sdk.android.services.common.i.a j6 = null;
        public static final io.fabric.sdk.android.services.common.i.a tp = null;
        public static final io.fabric.sdk.android.services.common.i.a u7 = null;
        public static final io.fabric.sdk.android.services.common.i.a v5 = null;
        private static final io.fabric.sdk.android.services.common.i.a[] we = null;

        static {
            j6 = new io.fabric.sdk.android.services.common.i.a("X86_32", 0);
            DW = new io.fabric.sdk.android.services.common.i.a("X86_64", 1);
            FH = new io.fabric.sdk.android.services.common.i.a("ARM_UNKNOWN", 2);
            Hw = new io.fabric.sdk.android.services.common.i.a("PPC", 3);
            v5 = new io.fabric.sdk.android.services.common.i.a("PPC64", 4);
            Zo = new io.fabric.sdk.android.services.common.i.a("ARMV6", 5);
            VH = new io.fabric.sdk.android.services.common.i.a("ARMV7", 6);
            gn = new io.fabric.sdk.android.services.common.i.a("UNKNOWN", 7);
            u7 = new io.fabric.sdk.android.services.common.i.a("ARMV7S", 8);
            tp = new io.fabric.sdk.android.services.common.i.a("ARM64", 9);
            we = new io.fabric.sdk.android.services.common.i.a[]{j6, DW, FH, Hw, v5, Zo, VH, gn, u7, tp};
            EQ = new java.util.HashMap(4);
            EQ.put("armeabi-v7a", VH);
            EQ.put("armeabi", Zo);
            EQ.put("arm64-v8a", tp);
            EQ.put("x86", j6);
        }

        private a(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        static io.fabric.sdk.android.services.common.i.a Hw() {
            java.lang.String r0 = null;
            java.lang.String r1 = null;
            io.fabric.sdk.android.services.common.i.a r2 = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        r0 = android.os.Build.CPU_ABI;
                        if (android.text.TextUtils.isEmpty(r0) == false) { $pc0 = 6; continue $sw0; }
                        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Architecture#getValue()::Build.CPU_ABI returned null or empty");
                        return gn;
                    }
                    case 6: {
                        r1 = r0.toLowerCase(java.util.Locale.US);
                        r2 = EQ.get(r1);
                        if (r2 == null) { $pc0 = 9; continue $sw0; }
                        return r2;
                    }
                    case 9: {
                        return gn;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public static io.fabric.sdk.android.services.common.i.a valueOf(java.lang.String r1) {
            return (io.fabric.sdk.android.services.common.i.a) com.almlkaide.kaypro.internal.EnumBase.valueOf(io.fabric.sdk.android.services.common.i.a.values(), r1);
        }

        public static io.fabric.sdk.android.services.common.i.a[] values() {
            return (io.fabric.sdk.android.services.common.i.a[]) we.clone();
        }
    }

    static {
        DW = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        FH = -1;
        Hw = new io.fabric.sdk.android.services.common.h();
    }

    public static synchronized long DW() {
        synchronized (io.fabric.sdk.android.services.common.i.class) {
            long r1 = 0L;
            java.lang.String r3 = null;
            java.lang.String r4 = null;
            long r2 = 0L;
            java.lang.Throwable e = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        $pc1 = 5; continue $sw1;
                    }
                    case 26: {
                        th = $ex1;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 5: {
                        if (FH != (-1)) { $pc1 = 23; continue $sw1; }
                        r1 = 0;
                        try {
                            r3 = j6(new java.io.File("/proc/meminfo"), "MemTotal");
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 26; continue $sw1;
                        }
                        if (android.text.TextUtils.isEmpty(r3) == true) { $pc1 = 22; continue $sw1; }
                        try {
                            r4 = r3.toUpperCase(java.util.Locale.US);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 26; continue $sw1;
                        }
                        $pc1 = 10; continue $sw1;
                    }
                    case 20: {
                        e = $ex1;
                        try {
                            io.fabric.sdk.android.Fabric.getLogger().FH("Fabric", "Unexpected meminfo format while computing RAM: " + r4, e);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 26; continue $sw1;
                        }
                        { $pc1 = 22; continue $sw1; }
                    }
                    case 10: {
                        if (r4.endsWith("KB") == false) { $pc1 = 13; continue $sw1; }
                        try {
                            r1 = j6(r4, "KB", 1024);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.lang.NumberFormatException) { $pc1 = 20; continue $sw1; }
                            $pc1 = 26; continue $sw1;
                        }
                        $pc1 = 31; continue $sw1;
                    }
                    case 31: {
                        $pc1 = 13; continue $sw1;
                    }
                    case 13: {
                        if (r4.endsWith("MB") == false) { $pc1 = 16; continue $sw1; }
                        try {
                            r1 = j6(r4, "MB", 1048576);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.lang.NumberFormatException) { $pc1 = 20; continue $sw1; }
                            $pc1 = 26; continue $sw1;
                        }
                        { $pc1 = 31; continue $sw1; }
                    }
                    case 16: {
                        if (r4.endsWith("GB") == false) { $pc1 = 18; continue $sw1; }
                        try {
                            r1 = j6(r4, "GB", 1073741824);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.lang.NumberFormatException) { $pc1 = 20; continue $sw1; }
                            $pc1 = 26; continue $sw1;
                        }
                        { $pc1 = 31; continue $sw1; }
                    }
                    case 18: {
                        try {
                            io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Unexpected meminfo format while computing RAM: " + r4);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.lang.NumberFormatException) { $pc1 = 20; continue $sw1; }
                            $pc1 = 26; continue $sw1;
                        }
                        $pc1 = 22; continue $sw1;
                    }
                    case 22: {
                        try {
                            FH = r1;
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 26; continue $sw1;
                        }
                        $pc1 = 23; continue $sw1;
                    }
                    case 23: {
                        try {
                            r2 = FH;
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 26; continue $sw1;
                        }
                        return r2;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    public static java.lang.String DW(int r3) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r3 < 0) { $pc2 = 6; continue $sw2; }
                    return java.lang.String.format(java.util.Locale.US, "%1$10s", new java.lang.Object[]{java.lang.Integer.valueOf(r3)}).replace(' ', '0');
                }
                case 6: {
                    throw new java.lang.IllegalArgumentException("value must be zero or greater");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String DW(android.content.Context r1, java.lang.String r2) {
        int r3 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r3 = j6(r1, r2, "string");
                    if (r3 > 0) { $pc3 = 5; continue $sw3; }
                    return "";
                }
                case 5: {
                    return r1.getString(r3);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String DW(java.io.InputStream r1) {
        java.util.Scanner r2 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r2 = new java.util.Scanner(r1).useDelimiter("\\A");
                    if (r2.hasNext() == true) { $pc4 = 7; continue $sw4; }
                    return "";
                }
                case 7: {
                    return r2.next();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @android.annotation.SuppressLint({"MissingPermission"})
    public static boolean DW(android.content.Context r2) {
        android.net.NetworkInfo r3 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (j6(r2, "android.permission.ACCESS_NETWORK_STATE") == false) { $pc5 = 11; continue $sw5; }
                    r3 = ((android.net.ConnectivityManager) r2.getSystemService("connectivity")).getActiveNetworkInfo();
                    if (r3 != null) { $pc5 = 7; continue $sw5; }
                    $pc5 = 9; continue $sw5;
                }
                case 9: {
                    return false;
                }
                case 7: {
                    if (r3.isConnectedOrConnecting() == false) { $pc5 = 9; continue $sw5; }
                    return true;
                }
                case 11: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean DW(java.lang.String r0) {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (r0 != null) { $pc6 = 4; continue $sw6; }
                    $pc6 = 7; continue $sw6;
                }
                case 7: {
                    return true;
                }
                case 4: {
                    if (r0.length() == 0) { $pc6 = 7; continue $sw6; }
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean EQ(android.content.Context r2) {
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (j6 != null) { $pc7 = 6; continue $sw7; }
                    j6 = java.lang.Boolean.valueOf(j6(r2, "com.crashlytics.Trace", false));
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    return j6.booleanValue();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String FH(android.content.Context r8) {
        java.lang.String r1 = null;
        java.io.InputStream r9 = null;
        java.lang.String r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r1 = null;
                    try {
                        r9 = r8.getResources().openRawResource(Hw(r8));
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 14; continue $sw8; }
                        $pc8 = 12; continue $sw8;
                    }
                    try {
                        r2 = j6(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 10; continue $sw8; }
                        $pc8 = 19; continue $sw8;
                    }
                    if (DW(r2) == true) { $pc8 = 8; continue $sw8; }
                    r1 = r2;
                    $pc8 = 8; continue $sw8;
                }
                case 8: {
                    j6(r9, "Failed to close icon input stream.");
                    return r1;
                }
                case 10: {
                    e = e;
                    $pc8 = 16; continue $sw8;
                }
                case 16: {
                    try {
                        io.fabric.sdk.android.Fabric.getLogger().j6("Fabric", "Could not calculate hash for app icon:" + e.getMessage());
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 19; continue $sw8;
                    }
                    j6(r9, "Failed to close icon input stream.");
                    return null;
                }
                case 19: {
                    th = th;
                    $pc8 = 20; continue $sw8;
                }
                case 20: {
                    j6(r9, "Failed to close icon input stream.");
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 14: {
                    e = e;
                    r9 = null;
                    throw new java.lang.IllegalStateException();
                }
                case 12: {
                    th = $ex8;
                    th = th;
                    r9 = null;
                    { $pc8 = 20; continue $sw8; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String FH(java.lang.String r1) {
        return j6(r1, "SHA-1");
    }

    public static void FH(android.content.Context r1, java.lang.String r2) {
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    if (EQ(r1) == false) { $pc9 = 6; continue $sw9; }
                    io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", r2);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean FH() {
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    if (android.os.Debug.isDebuggerConnected() == false) { $pc10 = 5; continue $sw10; }
                    $pc10 = 8; continue $sw10;
                }
                case 8: {
                    return true;
                }
                case 5: {
                    if (android.os.Debug.waitingForDebugger() == true) { $pc10 = 8; continue $sw10; }
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static int Hw(android.content.Context r0) {
        return r0.getApplicationContext().getApplicationInfo().icon;
    }

    public static java.lang.String Hw(java.lang.String r1) {
        return j6(r1, "SHA-256");
    }

    public static boolean J0(android.content.Context r3) {
        boolean r4 = false;
        java.lang.String r0 = null;
        java.io.File r1 = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r4 = we(r3);
                    r0 = android.os.Build.TAGS;
                    if (r4 == true) { $pc11 = 9; continue $sw11; }
                    if (r0 == null) { $pc11 = 9; continue $sw11; }
                    if (r0.contains("test-keys") == false) { $pc11 = 9; continue $sw11; }
                    return true;
                }
                case 9: {
                    if (new java.io.File("/system/app/Superuser.apk").exists() == false) { $pc11 = 11; continue $sw11; }
                    return true;
                }
                case 11: {
                    r1 = new java.io.File("/system/xbin/su");
                    if (r4 == false) { $pc11 = 14; continue $sw11; }
                    return false;
                }
                case 14: {
                    if (r1.exists() == false) { $pc11 = 18; continue $sw11; }
                    return true;
                }
                case 18: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String J8(android.content.Context r3) {
        int r1 = 0;
        java.lang.String r4 = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    r1 = j6(r3, "io.fabric.android.build_id", "string");
                    if (r1 != 0) { $pc12 = 5; continue $sw12; }
                    r1 = j6(r3, "com.crashlytics.android.build_id", "string");
                    $pc12 = 5; continue $sw12;
                }
                case 5: {
                    if (r1 == 0) { $pc12 = 7; continue $sw12; }
                    r4 = r3.getResources().getString(r1);
                    io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Build ID is: " + r4);
                    return r4;
                }
                case 7: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean VH(android.content.Context r2) {
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    if (we(r2) == false) { $pc13 = 6; continue $sw13; }
                    return false;
                }
                case 6: {
                    if (((android.hardware.SensorManager) r2.getSystemService("sensor")).getDefaultSensor(8) == null) { $pc13 = 9; continue $sw13; }
                    return true;
                }
                case 9: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String Ws(android.content.Context r3) {
        int r0 = 0;
        java.lang.String r4 = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    r0 = j6(r3, "com.google.firebase.crashlytics.unity_version", "string");
                    if (r0 == 0) { $pc14 = 5; continue $sw14; }
                    r4 = r3.getResources().getString(r0);
                    io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Unity Editor version is: " + r4);
                    return r4;
                }
                case 5: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static int Zo(android.content.Context r1) {
        int r0 = 0;
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    if (we(r1) == false) { $pc15 = 5; continue $sw15; }
                    r0 = 1;
                    $pc15 = 7; continue $sw15;
                }
                case 7: {
                    if (J0(r1) == false) { $pc15 = 10; continue $sw15; }
                    r0 = r0 | 2;
                    $pc15 = 10; continue $sw15;
                }
                case 10: {
                    if (FH() == true) { $pc15 = 12; continue $sw15; }
                    return r0;
                }
                case 12: {
                    return r0 | 4;
                }
                case 5: {
                    r0 = 0;
                    { $pc15 = 7; continue $sw15; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String gn(android.content.Context r2) {
        int r0 = 0;
        java.lang.Throwable $ex16 = null;
        int $pc16 = -1;
        $sw16: while (true) {
            switch ($pc16) {
                case -1: {
                    r0 = r2.getApplicationContext().getApplicationInfo().icon;
                    if (r0 <= 0) { $pc16 = 8; continue $sw16; }
                    return r2.getResources().getResourcePackageName(r0);
                }
                case 11: {
                    return r2.getPackageName();
                }
                case 8: {
                    return r2.getPackageName();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static int j6() {
        return io.fabric.sdk.android.services.common.i.a.Hw().ordinal();
    }

    public static int j6(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
        return r1.getResources().getIdentifier(r2, r3, gn(r1));
    }

    public static int j6(android.content.Context r4, boolean r5) {
        java.lang.Float r6 = null;
        java.lang.Throwable $ex17 = null;
        int $pc17 = -1;
        $sw17: while (true) {
            switch ($pc17) {
                case -1: {
                    r6 = v5(r4);
                    if (r5 == false) { $pc17 = 16; continue $sw17; }
                    if (r6 != null) { $pc17 = 7; continue $sw17; }
                    return 1;
                }
                case 7: {
                    if (r6.floatValue() < 99.0d) { $pc17 = 11; continue $sw17; }
                    return 3;
                }
                case 11: {
                    if (r6.floatValue() >= 99.0d) { $pc17 = 14; continue $sw17; }
                    return 2;
                }
                case 14: {
                    return 0;
                }
                case 16: {
                    return 1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static long j6(android.content.Context r2) {
        android.app.ActivityManager.MemoryInfo r0 = new android.app.ActivityManager.MemoryInfo();
        ((android.app.ActivityManager) r2.getSystemService("activity")).getMemoryInfo(r0);
        return r0.availMem;
    }

    public static long j6(java.lang.String r7) {
        android.os.StatFs r0 = new android.os.StatFs(r7);
        long r1 = r0.getBlockSize();
        return (((long) r0.getBlockCount()) * r1) - (r1 * ((long) r0.getAvailableBlocks()));
    }

    static long j6(java.lang.String r2, java.lang.String r3, int r4) {
        return java.lang.Long.parseLong(r2.split(r3)[0].trim()) * ((long) r4);
    }

    public static android.app.ActivityManager.RunningAppProcessInfo j6(java.lang.String r2, android.content.Context r3) {
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> r4 = null;
        java.util.Iterator<android.app.ActivityManager.RunningAppProcessInfo> r5 = null;
        android.app.ActivityManager.RunningAppProcessInfo r0 = null;
        java.lang.Throwable $ex18 = null;
        int $pc18 = -1;
        $sw18: while (true) {
            switch ($pc18) {
                case -1: {
                    r4 = ((android.app.ActivityManager) r3.getSystemService("activity")).getRunningAppProcesses();
                    if (r4 == null) { $pc18 = 10; continue $sw18; }
                    r5 = r4.iterator();
                    $pc18 = 6; continue $sw18;
                }
                case 6: {
                    if (r5.hasNext() == false) { $pc18 = 10; continue $sw18; }
                    r0 = r5.next();
                    if (r0.processName.equals(r2) == false) { $pc18 = 6; continue $sw18; }
                    return r0;
                }
                case 10: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String j6(int r0) {
        java.lang.Throwable $ex19 = null;
        int $pc19 = -1;
        $sw19: while (true) {
            switch ($pc19) {
                case -1: {
                    switch(r0) {
                        case 2: { $pc19 = 15; continue $sw19; }
                        case 3: { $pc19 = 13; continue $sw19; }
                        case 4: { $pc19 = 11; continue $sw19; }
                        case 5: { $pc19 = 9; continue $sw19; }
                        case 6: { $pc19 = 7; continue $sw19; }
                        case 7: { $pc19 = 5; continue $sw19; }
                        default: { $pc19 = 3; continue $sw19; }
                    };
                }
                case 3: {
                    return "?";
                }
                case 5: {
                    return "A";
                }
                case 7: {
                    return "E";
                }
                case 9: {
                    return "W";
                }
                case 11: {
                    return "I";
                }
                case 13: {
                    return "D";
                }
                case 15: {
                    return "V";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String j6(java.io.File r7, java.lang.String r8) {
        java.lang.String r2 = null;
        java.io.BufferedReader r1 = null;
        java.lang.String r3 = null;
        java.lang.String[] r4 = null;
        java.lang.Throwable $ex20 = null;
        int $pc20 = -1;
        $sw20: while (true) {
            switch ($pc20) {
                case -1: {
                    r2 = null;
                    if (r7.exists() == true) { $pc20 = 29; continue $sw20; }
                    $pc20 = 25; continue $sw20;
                }
                case 25: {
                    return r2;
                }
                case 29: {
                    try {
                        r1 = new java.io.BufferedReader(new java.io.FileReader(r7), 1024);
                    } catch (java.lang.Throwable $t) {
                        $ex20 = $t;
                        if ($t instanceof java.lang.Exception) { $pc20 = 18; continue $sw20; }
                        $pc20 = 16; continue $sw20;
                    }
                    $pc20 = 26; continue $sw20;
                }
                case 26: {
                    try {
                        r3 = r1.readLine();
                    } catch (java.lang.Throwable $t) {
                        $ex20 = $t;
                        if ($t instanceof java.lang.Exception) { $pc20 = 14; continue $sw20; }
                        $pc20 = 22; continue $sw20;
                    }
                    if (r3 == null) { $pc20 = 13; continue $sw20; }
                    try {
                        r4 = java.util.regex.Pattern.compile("\\s*:\\s*").split(r3, 2);
                    } catch (java.lang.Throwable $t) {
                        $ex20 = $t;
                        if ($t instanceof java.lang.Exception) { $pc20 = 14; continue $sw20; }
                        $pc20 = 22; continue $sw20;
                    }
                    if (r4.length <= 1) { $pc20 = 26; continue $sw20; }
                    if (r4[0].equals(r8) == false) { $pc20 = 26; continue $sw20; }
                    try {
                        r2 = r4[1];
                    } catch (java.lang.Throwable $t) {
                        $ex20 = $t;
                        if ($t instanceof java.lang.Exception) { $pc20 = 14; continue $sw20; }
                        $pc20 = 22; continue $sw20;
                    }
                    $pc20 = 13; continue $sw20;
                }
                case 13: {
                    j6(r1, "Failed to close system file reader.");
                    $pc20 = 20; continue $sw20;
                }
                case 14: {
                    e = e;
                    $pc20 = 20; continue $sw20;
                }
                case 20: {
                    try {
                        io.fabric.sdk.android.Fabric.getLogger().FH("Fabric", "Error parsing " + r7, e);
                    } catch (java.lang.Throwable $t) {
                        $ex20 = $t;
                        $pc20 = 22; continue $sw20;
                    }
                    $pc20 = 23; continue $sw20;
                }
                case 22: {
                    th = th;
                    $pc20 = 23; continue $sw20;
                }
                case 23: {
                    j6(r1, "Failed to close system file reader.");
                    throw th;
                }
                case 18: {
                    e = e;
                    r1 = null;
                    throw new java.lang.IllegalStateException();
                }
                case 16: {
                    th = th;
                    r1 = null;
                    { $pc20 = 23; continue $sw20; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String j6(java.io.InputStream r1) {
        return j6(r1, "SHA-1");
    }

    private static java.lang.String j6(java.io.InputStream r3, java.lang.String r4) {
        java.security.MessageDigest r5 = null;
        byte[] r0 = null;
        int r1 = 0;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex21 = null;
        int $pc21 = -1;
        $sw21: while (true) {
            switch ($pc21) {
                case -1: {
                    try {
                        r5 = java.security.MessageDigest.getInstance(r4);
                        r0 = new byte[1024];
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        if ($t instanceof java.lang.Exception) { $pc21 = 8; continue $sw21; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc21 = 3; continue $sw21;
                }
                case 3: {
                    try {
                        r1 = r3.read(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        if ($t instanceof java.lang.Exception) { $pc21 = 8; continue $sw21; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r1 == (-1)) { $pc21 = 6; continue $sw21; }
                    try {
                        r5.update(r0, 0, r1);
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        if ($t instanceof java.lang.Exception) { $pc21 = 8; continue $sw21; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc21 = 3; continue $sw21; }
                }
                case 6: {
                    return j6(r5.digest());
                }
                case 8: {
                    e = $ex21;
                    io.fabric.sdk.android.Fabric.getLogger().FH("Fabric", "Could not calculate hash for app icon.", e);
                    return "";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.lang.String j6(java.lang.String r0, java.lang.String r1) {
        return j6(r0.getBytes(), r1);
    }

    public static java.lang.String j6(byte[] r6) {
        char[] r0 = null;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        char[] r4 = null;
        java.lang.Throwable $ex22 = null;
        int $pc22 = -1;
        $sw22: while (true) {
            switch ($pc22) {
                case -1: {
                    r0 = new char[r6.length * 2];
                    r1 = 0;
                    $pc22 = 4; continue $sw22;
                }
                case 4: {
                    if (r1 >= r6.length) { $pc22 = 7; continue $sw22; }
                    r2 = r6[r1] & 255;
                    r3 = r1 * 2;
                    r4 = DW;
                    r0[r3] = r4[r2 >>> 4];
                    r0[r3 + 1] = r4[r2 & 15];
                    r1 = r1 + 1;
                    { $pc22 = 4; continue $sw22; }
                }
                case 7: {
                    return new java.lang.String(r0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.lang.String j6(byte[] r3, java.lang.String r4) {
        java.security.MessageDigest r5 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex23 = null;
        int $pc23 = -1;
        $sw23: while (true) {
            switch ($pc23) {
                case -1: {
                    try {
                        r5 = java.security.MessageDigest.getInstance(r4);
                    } catch (java.lang.Throwable $t) {
                        $ex23 = $t;
                        if ($t instanceof java.security.NoSuchAlgorithmException) { $pc23 = 5; continue $sw23; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r5.update(r3);
                    return j6(r5.digest());
                }
                case 5: {
                    e = $ex23;
                    io.fabric.sdk.android.Fabric.getLogger().FH("Fabric", "Could not create hashing algorithm: " + r4 + ", returning empty string.", e);
                    return "";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String j6(java.lang.String... r7) {
        java.util.ArrayList r1 = null;
        int r2 = 0;
        int r3 = 0;
        java.lang.String r4 = null;
        java.lang.StringBuilder r8 = null;
        java.util.Iterator r5 = null;
        java.lang.String r9 = null;
        java.lang.Throwable $ex24 = null;
        int $pc24 = -1;
        $sw24: while (true) {
            switch ($pc24) {
                case -1: {
                    if (r7 != null) { $pc24 = 5; continue $sw24; }
                    return null;
                }
                case 5: {
                    if (r7.length == 0) { $pc24 = 27; continue $sw24; }
                    r1 = new java.util.ArrayList();
                    r2 = r7.length;
                    r3 = 0;
                    $pc24 = 8; continue $sw24;
                }
                case 8: {
                    if (r3 >= r2) { $pc24 = 13; continue $sw24; }
                    r4 = r7[r3];
                    if (r4 == null) { $pc24 = 12; continue $sw24; }
                    r1.add(r4.replace("-", "").toLowerCase(java.util.Locale.US));
                    $pc24 = 12; continue $sw24;
                }
                case 12: {
                    r3 = r3 + 1;
                    { $pc24 = 8; continue $sw24; }
                }
                case 13: {
                    java.util.Collections.sort(r1);
                    r8 = new java.lang.StringBuilder();
                    r5 = r1.iterator();
                    $pc24 = 15; continue $sw24;
                }
                case 15: {
                    if (r5.hasNext() == false) { $pc24 = 17; continue $sw24; }
                    r8.append((java.lang.String) r5.next());
                    { $pc24 = 15; continue $sw24; }
                }
                case 17: {
                    r9 = r8.toString();
                    if (r9.length() > 0) { $pc24 = 20; continue $sw24; }
                    return null;
                }
                case 20: {
                    return FH(r9);
                }
                case 27: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(android.content.Context r0, int r1, java.lang.String r2, java.lang.String r3) {
        java.lang.Throwable $ex25 = null;
        int $pc25 = -1;
        $sw25: while (true) {
            switch ($pc25) {
                case -1: {
                    if (EQ(r0) == false) { $pc25 = 6; continue $sw25; }
                    io.fabric.sdk.android.Fabric.getLogger().j6(r1, "Fabric", r3);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(android.content.Context r0, java.lang.String r1, java.lang.Throwable r2) {
        java.lang.Throwable $ex26 = null;
        int $pc26 = -1;
        $sw26: while (true) {
            switch ($pc26) {
                case -1: {
                    if (EQ(r0) == false) { $pc26 = 6; continue $sw26; }
                    io.fabric.sdk.android.Fabric.getLogger().DW("Fabric", r1);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(java.io.Closeable r0) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex27 = null;
        int $pc27 = -1;
        $sw27: while (true) {
            switch ($pc27) {
                case -1: {
                    if (r0 != null) { $pc27 = 9; continue $sw27; }
                    return;
                }
                case 9: {
                    try {
                        r0.close();
                    } catch (java.lang.Throwable $t) {
                        $ex27 = $t;
                        if ($t instanceof java.lang.RuntimeException) { $pc27 = 5; continue $sw27; }
                        if ($t instanceof java.lang.Exception) { $pc27 = 8; continue $sw27; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc27 = 12; continue $sw27; }
                }
                case 11: {
                    return;
                }
                case 5: {
                    e = $ex27;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 8: {
                    $pc27 = 12; continue $sw27;
                }
                case 12: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(java.io.Closeable r2, java.lang.String r3) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex28 = null;
        int $pc28 = -1;
        $sw28: while (true) {
            switch ($pc28) {
                case -1: {
                    if (r2 == null) { $pc28 = 10; continue $sw28; }
                    try {
                        r2.close();
                    } catch (java.lang.Throwable $t) {
                        $ex28 = $t;
                        if ($t instanceof java.io.IOException) { $pc28 = 5; continue $sw28; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 5: {
                    e = $ex28;
                    io.fabric.sdk.android.Fabric.getLogger().FH("Fabric", r3, e);
                    return;
                }
                case 10: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(java.io.Flushable r2, java.lang.String r3) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex29 = null;
        int $pc29 = -1;
        $sw29: while (true) {
            switch ($pc29) {
                case -1: {
                    if (r2 == null) { $pc29 = 10; continue $sw29; }
                    try {
                        r2.flush();
                    } catch (java.lang.Throwable $t) {
                        $ex29 = $t;
                        if ($t instanceof java.io.IOException) { $pc29 = 5; continue $sw29; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 5: {
                    e = $ex29;
                    io.fabric.sdk.android.Fabric.getLogger().FH("Fabric", r3, e);
                    return;
                }
                case 10: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(java.io.InputStream r2, java.io.OutputStream r3, byte[] r4) {
        int r0 = 0;
        java.lang.Throwable $ex30 = null;
        int $pc30 = 2;
        $sw30: while (true) {
            switch ($pc30) {
                case 2: {
                    r0 = r2.read(r4);
                    if (r0 == (-1)) { $pc30 = 5; continue $sw30; }
                    r3.write(r4, 0, r0);
                    { $pc30 = 2; continue $sw30; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean j6(android.content.Context r0, java.lang.String r1) {
        java.lang.Throwable $ex31 = null;
        int $pc31 = -1;
        $sw31: while (true) {
            switch ($pc31) {
                case -1: {
                    if (r0.checkCallingOrSelfPermission(r1) != 0) { $pc31 = 5; continue $sw31; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean j6(android.content.Context r2, java.lang.String r3, boolean r4) {
        android.content.res.Resources r0 = null;
        int r1 = 0;
        int r5 = 0;
        java.lang.Throwable $ex32 = null;
        int $pc32 = -1;
        $sw32: while (true) {
            switch ($pc32) {
                case -1: {
                    if (r2 == null) { $pc32 = 13; continue $sw32; }
                    r0 = r2.getResources();
                    if (r0 == null) { $pc32 = 13; continue $sw32; }
                    r1 = j6(r2, r3, "bool");
                    if (r1 > 0) { $pc32 = 8; continue $sw32; }
                    r5 = j6(r2, r3, "string");
                    if (r5 <= 0) { $pc32 = 13; continue $sw32; }
                    return java.lang.Boolean.parseBoolean(r2.getString(r5));
                }
                case 8: {
                    return r0.getBoolean(r1);
                }
                case 13: {
                    return r4;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean tp(android.content.Context r0) {
        java.lang.Throwable $ex33 = null;
        int $pc33 = -1;
        $sw33: while (true) {
            switch ($pc33) {
                case -1: {
                    if ((r0.getApplicationInfo().flags & 2) == 0) { $pc33 = 5; continue $sw33; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static android.content.SharedPreferences u7(android.content.Context r2) {
        return r2.getSharedPreferences("com.crashlytics.prefs", 0);
    }

    public static java.lang.Float v5(android.content.Context r3) {
        android.content.Intent r4 = null;
        java.lang.Throwable $ex34 = null;
        int $pc34 = -1;
        $sw34: while (true) {
            switch ($pc34) {
                case -1: {
                    r4 = r3.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
                    if (r4 != null) { $pc34 = 6; continue $sw34; }
                    return null;
                }
                case 6: {
                    return java.lang.Float.valueOf(r4.getIntExtra("level", -1) / r4.getIntExtra("scale", -1));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean we(android.content.Context r2) {
        java.lang.String r3 = null;
        java.lang.Throwable $ex35 = null;
        int $pc35 = -1;
        $sw35: while (true) {
            switch ($pc35) {
                case -1: {
                    r3 = android.provider.Settings.Secure.getString(r2.getContentResolver(), "android_id");
                    if ("sdk".equals(android.os.Build.PRODUCT) == false) { $pc35 = 5; continue $sw35; }
                    $pc35 = 9; continue $sw35;
                }
                case 9: {
                    return true;
                }
                case 5: {
                    if ("google_sdk".equals(android.os.Build.PRODUCT) == true) { $pc35 = 9; continue $sw35; }
                    if (r3 == null) { $pc35 = 9; continue $sw35; }
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
