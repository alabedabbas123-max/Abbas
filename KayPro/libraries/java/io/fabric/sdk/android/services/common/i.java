package io.fabric.sdk.android.services.common;

public class i {
    private static final char[] DW = null;
    private static long FH;
    public static final java.util.Comparator<java.io.File> Hw = null;
    private static java.lang.Boolean j6;

    static final enum a extends java.lang.Enum<io.fabric.sdk.android.services.common.i.a> {
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
            java.lang.String r0 = android.os.Build.CPU_ABI;
            if (android.text.TextUtils.isEmpty(r0) == false) goto L6;
            io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Architecture#getValue()::Build.CPU_ABI returned null or empty");
            return gn;
        L6:
            java.lang.String r1 = r0.toLowerCase(java.util.Locale.US);
            io.fabric.sdk.android.services.common.i.a r2 = EQ.get(r1);
            if (r2 == null) goto L9;
            return r2;
        L9:
            return gn;
        }

        public static io.fabric.sdk.android.services.common.i.a valueOf(java.lang.String r1) {
            return (io.fabric.sdk.android.services.common.i.a) java.lang.Enum.valueOf(io.fabric.sdk.android.services.common.i.a.class, r1);
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
        monitor-enter(io.fabric.sdk.android.services.common.i.class);
    L26:
        th = move-exception;
        throw th;
    L5:
        if (FH != (-1)) goto L23;
        long r1 = 0;
        java.lang.String r3 = j6(new java.io.File("/proc/meminfo"), "MemTotal");     // Catch: java.lang.Throwable -> L26
        if (android.text.TextUtils.isEmpty(r3) == true) goto L22;
        java.lang.String r4 = r3.toUpperCase(java.util.Locale.US);     // Catch: java.lang.Throwable -> L26
    L20:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().FH("Fabric", "Unexpected meminfo format while computing RAM: " + r4, e);     // Catch: java.lang.Throwable -> L26
        goto L22
    L10:
        if (r4.endsWith("KB") == false) goto L13;
        r1 = j6(r4, "KB", 1024);     // Catch: java.lang.NumberFormatException -> L20 java.lang.Throwable -> L26
    L31:
    L13:
        if (r4.endsWith("MB") == false) goto L16;
        r1 = j6(r4, "MB", 1048576);     // Catch: java.lang.NumberFormatException -> L20 java.lang.Throwable -> L26
        goto L31
    L16:
        if (r4.endsWith("GB") == false) goto L18;
        r1 = j6(r4, "GB", 1073741824);     // Catch: java.lang.NumberFormatException -> L20 java.lang.Throwable -> L26
        goto L31
    L18:
        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Unexpected meminfo format while computing RAM: " + r4);     // Catch: java.lang.NumberFormatException -> L20 java.lang.Throwable -> L26
    L22:
        FH = r1;     // Catch: java.lang.Throwable -> L26
    L23:
        long r2 = FH;     // Catch: java.lang.Throwable -> L26
        monitor-exit(io.fabric.sdk.android.services.common.i.class);
        return r2;
    }

    public static java.lang.String DW(int r3) {
        if (r3 < 0) goto L6;
        return java.lang.String.format(java.util.Locale.US, "%1$10s", new java.lang.Object[]{java.lang.Integer.valueOf(r3)}).replace(' ', '0');
    L6:
        throw new java.lang.IllegalArgumentException("value must be zero or greater");
    }

    public static java.lang.String DW(android.content.Context r1, java.lang.String r2) {
        int r3 = j6(r1, r2, "string");
        if (r3 > 0) goto L5;
        return "";
    L5:
        return r1.getString(r3);
    }

    public static java.lang.String DW(java.io.InputStream r1) {
        java.util.Scanner r2 = new java.util.Scanner(r1).useDelimiter("\\A");
        if (r2.hasNext() == true) goto L7;
        return "";
    L7:
        return r2.next();
    }

    @android.annotation.SuppressLint({"MissingPermission"})
    public static boolean DW(android.content.Context r2) {
        if (j6(r2, "android.permission.ACCESS_NETWORK_STATE") == false) goto L11;
        android.net.NetworkInfo r3 = ((android.net.ConnectivityManager) r2.getSystemService("connectivity")).getActiveNetworkInfo();
        if (r3 != null) goto L7;
    L9:
        return false;
    L7:
        if (r3.isConnectedOrConnecting() == false) goto L9;
        return true;
    L11:
        return true;
    }

    public static boolean DW(java.lang.String r0) {
        if (r0 != null) goto L4;
    L7:
        return true;
    L4:
        if (r0.length() == 0) goto L7;
        return false;
    }

    public static boolean EQ(android.content.Context r2) {
        if (j6 != null) goto L6;
        j6 = java.lang.Boolean.valueOf(j6(r2, "com.crashlytics.Trace", false));
    L6:
        return j6.booleanValue();
    }

    public static java.lang.String FH(android.content.Context r8) {
        java.lang.String r1 = null;
        java.io.InputStream r9 = r8.getResources().openRawResource(Hw(r8));     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L14
        java.lang.String r2 = j6(r9);     // Catch: java.lang.Exception -> L10 java.lang.Throwable -> L19
        if (DW(r2) == true) goto L8;
        r1 = r2;
    L8:
        j6(r9, "Failed to close icon input stream.");
        return r1;
    L10:
        e = e;
    L16:
        io.fabric.sdk.android.Fabric.getLogger().j6("Fabric", "Could not calculate hash for app icon:" + e.getMessage());     // Catch: java.lang.Throwable -> L19
        j6(r9, "Failed to close icon input stream.");
        return null;
    L19:
        java.lang.Throwable th = th;
    L20:
        j6(r9, "Failed to close icon input stream.");
        throw th;
    L14:
        e = e;
        r9 = null;
    L12:
        th = move-exception;
        th = th;
        r9 = null;
        goto L20
    }

    public static java.lang.String FH(java.lang.String r1) {
        return j6(r1, "SHA-1");
    }

    public static void FH(android.content.Context r1, java.lang.String r2) {
        if (EQ(r1) == false) goto L6;
        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", r2);
        return;
    }

    public static boolean FH() {
        if (android.os.Debug.isDebuggerConnected() == false) goto L5;
    L8:
        return true;
    L5:
        if (android.os.Debug.waitingForDebugger() == true) goto L8;
        return false;
    }

    public static int Hw(android.content.Context r0) {
        return r0.getApplicationContext().getApplicationInfo().icon;
    }

    public static java.lang.String Hw(java.lang.String r1) {
        return j6(r1, "SHA-256");
    }

    public static boolean J0(android.content.Context r3) {
        boolean r4 = we(r3);
        java.lang.String r0 = android.os.Build.TAGS;
        if (r4 == true) goto L9;
        if (r0 == null) goto L9;
        if (r0.contains("test-keys") == false) goto L9;
        return true;
    L9:
        if (new java.io.File("/system/app/Superuser.apk").exists() == false) goto L11;
        return true;
    L11:
        java.io.File r1 = new java.io.File("/system/xbin/su");
        if (r4 == false) goto L14;
        return false;
    L14:
        if (r1.exists() == false) goto L18;
        return true;
    L18:
        return false;
    }

    public static java.lang.String J8(android.content.Context r3) {
        int r1 = j6(r3, "io.fabric.android.build_id", "string");
        if (r1 != 0) goto L5;
        r1 = j6(r3, "com.crashlytics.android.build_id", "string");
    L5:
        if (r1 == 0) goto L7;
        java.lang.String r4 = r3.getResources().getString(r1);
        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Build ID is: " + r4);
        return r4;
    L7:
        return null;
    }

    public static boolean VH(android.content.Context r2) {
        if (we(r2) == false) goto L6;
        return false;
    L6:
        if (((android.hardware.SensorManager) r2.getSystemService("sensor")).getDefaultSensor(8) == null) goto L9;
        return true;
    L9:
        return false;
    }

    public static java.lang.String Ws(android.content.Context r3) {
        int r0 = j6(r3, "com.google.firebase.crashlytics.unity_version", "string");
        if (r0 == 0) goto L5;
        java.lang.String r4 = r3.getResources().getString(r0);
        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Unity Editor version is: " + r4);
        return r4;
    L5:
        return null;
    }

    public static int Zo(android.content.Context r1) {
        if (we(r1) == false) goto L5;
        int r0 = 1;
    L7:
        if (J0(r1) == false) goto L10;
        r0 = r0 | 2;
    L10:
        if (FH() == true) goto L12;
        return r0;
    L12:
        return r0 | 4;
    L5:
        r0 = 0;
        goto L7
    }

    public static java.lang.String gn(android.content.Context r2) {
        int r0 = r2.getApplicationContext().getApplicationInfo().icon;
        if (r0 <= 0) goto L8;
        return r2.getResources().getResourcePackageName(r0);
    L11:
        return r2.getPackageName();
    L8:
        return r2.getPackageName();
    }

    public static int j6() {
        return io.fabric.sdk.android.services.common.i.a.Hw().ordinal();
    }

    public static int j6(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
        return r1.getResources().getIdentifier(r2, r3, gn(r1));
    }

    public static int j6(android.content.Context r4, boolean r5) {
        java.lang.Float r6 = v5(r4);
        if (r5 == false) goto L16;
        if (r6 != null) goto L7;
        return 1;
    L7:
        if (r6.floatValue() < 99.0d) goto L11;
        return 3;
    L11:
        if (r6.floatValue() >= 99.0d) goto L14;
        return 2;
    L14:
        return 0;
    L16:
        return 1;
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
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> r4 = ((android.app.ActivityManager) r3.getSystemService("activity")).getRunningAppProcesses();
        if (r4 == null) goto L10;
        java.util.Iterator<android.app.ActivityManager.RunningAppProcessInfo> r5 = r4.iterator();
    L6:
        if (r5.hasNext() == false) goto L10;
        android.app.ActivityManager.RunningAppProcessInfo r0 = r5.next();
        if (r0.processName.equals(r2) == false) goto L6;
        return r0;
    L10:
        return null;
    }

    public static java.lang.String j6(int r0) {
        switch(r0) {
            case 2: goto L15;
            case 3: goto L13;
            case 4: goto L11;
            case 5: goto L9;
            case 6: goto L7;
            case 7: goto L5;
            default: goto L3;
        };
    L3:
        return "?";
    L5:
        return "A";
    L7:
        return "E";
    L9:
        return "W";
    L11:
        return "I";
    L13:
        return "D";
    L15:
        return "V";
    }

    public static java.lang.String j6(java.io.File r7, java.lang.String r8) {
        java.lang.String r2 = null;
        if (r7.exists() == true) goto L29;
    L25:
        return r2;
    L29:
        java.io.BufferedReader r1 = new java.io.BufferedReader(new java.io.FileReader(r7), 1024);     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L18
    L26:
        java.lang.String r3 = r1.readLine();     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L22
        if (r3 == null) goto L13;
        java.lang.String[] r4 = java.util.regex.Pattern.compile("\\s*:\\s*").split(r3, 2);     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L22
        if (r4.length <= 1) goto L26;
        if (r4[0].equals(r8) == false) goto L26;
        r2 = r4[1];     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L22
    L13:
        j6(r1, "Failed to close system file reader.");
    L14:
        e = e;
    L20:
        io.fabric.sdk.android.Fabric.getLogger().FH("Fabric", "Error parsing " + r7, e);     // Catch: java.lang.Throwable -> L22
    L22:
        th = th;
    L23:
        j6(r1, "Failed to close system file reader.");
        throw th;
    L18:
        e = e;
        r1 = null;
    L16:
        th = th;
        r1 = null;
        goto L23
    }

    public static java.lang.String j6(java.io.InputStream r1) {
        return j6(r1, "SHA-1");
    }

    private static java.lang.String j6(java.io.InputStream r3, java.lang.String r4) {
        java.security.MessageDigest r5 = java.security.MessageDigest.getInstance(r4);     // Catch: java.lang.Exception -> L8
        byte[] r0 = new byte[1024];     // Catch: java.lang.Exception -> L8
    L3:
        int r1 = r3.read(r0);     // Catch: java.lang.Exception -> L8
        if (r1 == (-1)) goto L6;
        r5.update(r0, 0, r1);     // Catch: java.lang.Exception -> L8
        goto L3
    L6:
        return j6(r5.digest());
    L8:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().FH("Fabric", "Could not calculate hash for app icon.", e);
        return "";
    }

    private static java.lang.String j6(java.lang.String r0, java.lang.String r1) {
        return j6(r0.getBytes(), r1);
    }

    public static java.lang.String j6(byte[] r6) {
        char[] r0 = new char[r6.length * 2];
        int r1 = 0;
    L4:
        if (r1 >= r6.length) goto L7;
        int r2 = r6[r1] & 255;
        int r3 = r1 * 2;
        char[] r4 = DW;
        r0[r3] = r4[r2 >>> 4];
        r0[r3 + 1] = r4[r2 & 15];
        r1 = r1 + 1;
        goto L4
    L7:
        return new java.lang.String(r0);
    }

    private static java.lang.String j6(byte[] r3, java.lang.String r4) {
        java.security.MessageDigest r5 = java.security.MessageDigest.getInstance(r4);     // Catch: java.security.NoSuchAlgorithmException -> L5
        r5.update(r3);
        return j6(r5.digest());
    L5:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().FH("Fabric", "Could not create hashing algorithm: " + r4 + ", returning empty string.", e);
        return "";
    }

    public static java.lang.String j6(java.lang.String... r7) {
        if (r7 != null) goto L5;
        return null;
    L5:
        if (r7.length == 0) goto L27;
        java.util.ArrayList r1 = new java.util.ArrayList();
        int r2 = r7.length;
        int r3 = 0;
    L8:
        if (r3 >= r2) goto L13;
        java.lang.String r4 = r7[r3];
        if (r4 == null) goto L12;
        r1.add(r4.replace("-", "").toLowerCase(java.util.Locale.US));
    L12:
        r3 = r3 + 1;
        goto L8
    L13:
        java.util.Collections.sort(r1);
        java.lang.StringBuilder r8 = new java.lang.StringBuilder();
        java.util.Iterator r5 = r1.iterator();
    L15:
        if (r5.hasNext() == false) goto L17;
        r8.append((java.lang.String) r5.next());
        goto L15
    L17:
        java.lang.String r9 = r8.toString();
        if (r9.length() > 0) goto L20;
        return null;
    L20:
        return FH(r9);
    L27:
        return null;
    }

    public static void j6(android.content.Context r0, int r1, java.lang.String r2, java.lang.String r3) {
        if (EQ(r0) == false) goto L6;
        io.fabric.sdk.android.Fabric.getLogger().j6(r1, "Fabric", r3);
        return;
    }

    public static void j6(android.content.Context r0, java.lang.String r1, java.lang.Throwable r2) {
        if (EQ(r0) == false) goto L6;
        io.fabric.sdk.android.Fabric.getLogger().DW("Fabric", r1);
        return;
    }

    public static void j6(java.io.Closeable r0) {
        if (r0 != null) goto L9;
        return;
    L9:
        r0.close();     // Catch: java.lang.RuntimeException -> L5 java.lang.Exception -> L8
        goto L12
    L11:
        return;
    L5:
        e = move-exception;
        throw e;
    }

    public static void j6(java.io.Closeable r2, java.lang.String r3) {
        if (r2 == null) goto L10;
        r2.close();     // Catch: java.io.IOException -> L5
        return;
    L5:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().FH("Fabric", r3, e);
        return;
    }

    public static void j6(java.io.Flushable r2, java.lang.String r3) {
        if (r2 == null) goto L10;
        r2.flush();     // Catch: java.io.IOException -> L5
        return;
    L5:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().FH("Fabric", r3, e);
        return;
    }

    public static void j6(java.io.InputStream r2, java.io.OutputStream r3, byte[] r4) {
    L2:
        int r0 = r2.read(r4);
        if (r0 == (-1)) goto L5;
        r3.write(r4, 0, r0);
        goto L2
    }

    public static boolean j6(android.content.Context r0, java.lang.String r1) {
        if (r0.checkCallingOrSelfPermission(r1) != 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static boolean j6(android.content.Context r2, java.lang.String r3, boolean r4) {
        if (r2 == null) goto L13;
        android.content.res.Resources r0 = r2.getResources();
        if (r0 == null) goto L13;
        int r1 = j6(r2, r3, "bool");
        if (r1 > 0) goto L8;
        int r5 = j6(r2, r3, "string");
        if (r5 <= 0) goto L13;
        return java.lang.Boolean.parseBoolean(r2.getString(r5));
    L8:
        return r0.getBoolean(r1);
    L13:
        return r4;
    }

    public static boolean tp(android.content.Context r0) {
        if ((r0.getApplicationInfo().flags & 2) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static android.content.SharedPreferences u7(android.content.Context r2) {
        return r2.getSharedPreferences("com.crashlytics.prefs", 0);
    }

    public static java.lang.Float v5(android.content.Context r3) {
        android.content.Intent r4 = r3.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (r4 != null) goto L6;
        return null;
    L6:
        return java.lang.Float.valueOf(r4.getIntExtra("level", -1) / r4.getIntExtra("scale", -1));
    }

    public static boolean we(android.content.Context r2) {
        java.lang.String r3 = android.provider.Settings.Secure.getString(r2.getContentResolver(), "android_id");
        if ("sdk".equals(android.os.Build.PRODUCT) == false) goto L5;
    L9:
        return true;
    L5:
        if ("google_sdk".equals(android.os.Build.PRODUCT) == true) goto L9;
        if (r3 == null) goto L9;
        return false;
    }
}
