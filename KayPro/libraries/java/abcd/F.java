package abcd;

@abcd.Interfacexu
public final class F {

    @abcd.Interfaceru(field = -2978191133919069431L)
    private static abcd.G DW;

    @abcd.Interfaceru(field = 5439055544819666505L)
    private static com.google.firebase.analytics.FirebaseAnalytics FH;

    @abcd.Interfaceru(field = -4694706514906550408L)
    private static boolean Hw;

    @abcd.Interfaceuu
    private static boolean Zo;

    @abcd.Interfaceru(field = -4035392214186612805L)
    private static java.lang.String j6;

    @abcd.Interfacetu
    private static boolean v5;

    static {
        abcd.wu.j6(abcd.F.class, 5610107662420460160L, 5610107662420460160L);     // Catch: java.lang.Throwable -> L8
        if (v5 == false) goto L6;
        abcd.wu.j6(1404809298436198767L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        j6 = "unknown";     // Catch: java.lang.Throwable -> L8
        Hw = false;     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        if (Zo == false) goto L12;
        abcd.wu.j6(th, 1404809298436198767L, null);
    L12:
        throw th;
    }

    @abcd.Interfacesu(method = -1836758413888555827L)
    private F() {
    L8:
        th = move-exception;
        if (Zo == false) goto L12;
        abcd.wu.j6(th, -3127245079101136995L, null);
    L12:
        throw th;
    L4:
        if (v5 == false) goto L6;
        abcd.wu.j6(-3127245079101136995L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    public static void DW(android.app.Activity r7, java.lang.String r8) {
    L7:
        th = move-exception;
        if (Zo == false) goto L11;
        abcd.wu.j6(th, 1418056004630788889L, null, r7, r8);
    L11:
        throw th;
    L3:
        if (v5 == false) goto L5;
        abcd.wu.j6(1418056004630788889L, null, r7, r8);     // Catch: java.lang.Throwable -> L7
    L5:
        j6(r7, r8, null);     // Catch: java.lang.Throwable -> L7
    }

    public static void DW(android.content.Context r5) {
    L11:
        th = move-exception;
        if (Zo == false) goto L15;
        abcd.wu.j6(th, -3005592755486308344L, null, r5);
    L15:
        throw th;
    L4:
        if (v5 == false) goto L7;
        abcd.wu.j6(-3005592755486308344L, null, r5);     // Catch: java.lang.Throwable -> L11
    L7:
        if (FH() == true) goto L9;
        return;
    L9:
        VH("startSession");     // Catch: java.lang.Throwable -> L11
    }

    public static void DW(java.lang.String r6) {
    L11:
        th = move-exception;
        if (Zo == false) goto L15;
        abcd.wu.j6(th, 1585715275549250560L, null, r6);
    L15:
        throw th;
    L4:
        if (v5 == false) goto L7;
        abcd.wu.j6(1585715275549250560L, null, r6);     // Catch: java.lang.Throwable -> L11
    L7:
        if (FH() == true) goto L9;
        return;
    L9:
        VH("logLevelEnd: " + r6);     // Catch: java.lang.Throwable -> L11
        android.os.Bundle r3 = new android.os.Bundle();     // Catch: java.lang.Throwable -> L11
        r3.putString("level_name", r6);     // Catch: java.lang.Throwable -> L11
        FH.j6("level_end", r3);     // Catch: java.lang.Throwable -> L11
    }

    public static boolean DW() {
    L8:
        th = move-exception;
        if (Zo == false) goto L12;
        abcd.wu.j6(th, 3963217086836114455L, null);
    L12:
        throw th;
    L4:
        if (v5 == false) goto L6;
        abcd.wu.j6(3963217086836114455L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        return Hw;
    }

    public static void FH(java.lang.String r6) {
    L11:
        th = move-exception;
        if (Zo == false) goto L15;
        abcd.wu.j6(th, 2923279749780514351L, null, r6);
    L15:
        throw th;
    L4:
        if (v5 == false) goto L7;
        abcd.wu.j6(2923279749780514351L, null, r6);     // Catch: java.lang.Throwable -> L11
    L7:
        if (FH() == true) goto L9;
        return;
    L9:
        VH("logLevelStart: " + r6);     // Catch: java.lang.Throwable -> L11
        android.os.Bundle r3 = new android.os.Bundle();     // Catch: java.lang.Throwable -> L11
        r3.putString("level_name", r6);     // Catch: java.lang.Throwable -> L11
        FH.j6("level_start", r3);     // Catch: java.lang.Throwable -> L11
    }

    @abcd.Interfacesu(method = 300248079910346667L)
    private static boolean FH() {
    L16:
        th = move-exception;
        if (Zo == false) goto L20;
        abcd.wu.j6(th, 880104102092781125L, null);
    L20:
        throw th;
    L4:
        if (v5 == false) goto L7;
        abcd.wu.j6(880104102092781125L, null);     // Catch: java.lang.Throwable -> L16
    L7:
        if (Hw == false) goto L15;
        FH.j6(DW.j6());     // Catch: java.lang.Throwable -> L16
        if (DW.j6() == true) goto L12;
        return false;
    L12:
        return true;
    L15:
        throw new java.lang.IllegalStateException("Analytics not initialized");     // Catch: java.lang.Throwable -> L16
    }

    public static void Hw(java.lang.String r5) {
    L8:
        th = move-exception;
        if (Zo == false) goto L12;
        abcd.wu.j6(th, -557607551129886915L, null, r5);
    L12:
        throw th;
    L4:
        if (v5 == false) goto L6;
        abcd.wu.j6(-557607551129886915L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        FH.j6("a4_os_arch", r5);     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = 4725891368456651679L)
    private static void VH(java.lang.String r5) {
    L7:
        th = move-exception;
        if (Zo == false) goto L11;
        abcd.wu.j6(th, -5053611035144370651L, null, r5);
    L11:
        throw th;
    L4:
        if (v5 == false) goto L14;
        abcd.wu.j6(-5053611035144370651L, null, r5);     // Catch: java.lang.Throwable -> L7
        return;
    }

    public static void Zo(java.lang.String r5) {
    L7:
        th = move-exception;
        if (Zo == false) goto L11;
        abcd.wu.j6(th, -3319366860714454768L, null, r5);
    L11:
        throw th;
    L4:
        if (v5 == false) goto L14;
        abcd.wu.j6(-3319366860714454768L, null, r5);     // Catch: java.lang.Throwable -> L7
        return;
    }

    public static java.lang.String j6(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
    L7:
        th = move-exception;
        if (Zo == false) goto L11;
        abcd.wu.j6(th, 3335519145276727024L, null, r8, r9, r10);
    L11:
        throw th;
    L3:
        if (v5 == false) goto L5;
        abcd.wu.j6(3335519145276727024L, null, r8, r9, r10);     // Catch: java.lang.Throwable -> L7
    L5:
        return "market://details?id=" + r9 + "&referrer=utm_source%3D" + r8 + "%26utm_medium%3Dinapplink%26utm_campaign%3D" + r10;
    }

    public static void j6() {
    L12:
        th = move-exception;
        if (Zo == false) goto L16;
        abcd.wu.j6(th, -5328824661013866912L, null);
    L16:
        throw th;
    L4:
        if (v5 == false) goto L7;
        abcd.wu.j6(-5328824661013866912L, null);     // Catch: java.lang.Throwable -> L12
    L7:
        if (Hw == false) goto L11;
        FH.j6(DW.j6());     // Catch: java.lang.Throwable -> L12
        return;
    L11:
        throw new java.lang.IllegalStateException("Analytics not initialized");     // Catch: java.lang.Throwable -> L12
    }

    public static void j6(android.app.Activity r7, java.lang.String r8) {
    L8:
        th = move-exception;
        if (Zo == false) goto L12;
        abcd.wu.j6(th, 3767195592705722720L, null, r7, r8);
    L12:
        throw th;
    L3:
        if (v5 == false) goto L5;
        abcd.wu.j6(3767195592705722720L, null, r7, r8);     // Catch: java.lang.Throwable -> L8
    L5:
        if (FH() == false) goto L7;
    }

    public static void j6(android.app.Activity r8, java.lang.String r9, java.util.Map<java.lang.String, java.lang.String> r10) {
    L8:
        th = move-exception;
        if (Zo == false) goto L12;
        abcd.wu.j6(th, 103294852219814992L, null, r8, r9, r10);
    L12:
        throw th;
    L3:
        if (v5 == false) goto L5;
        abcd.wu.j6(103294852219814992L, null, r8, r9, r10);     // Catch: java.lang.Throwable -> L8
    L5:
        if (FH() == false) goto L7;
    }

    public static void j6(android.content.Context r5) {
    L11:
        th = move-exception;
        if (Zo == false) goto L15;
        abcd.wu.j6(th, 1176169637272847721L, null, r5);
    L15:
        throw th;
    L4:
        if (v5 == false) goto L7;
        abcd.wu.j6(1176169637272847721L, null, r5);     // Catch: java.lang.Throwable -> L11
    L7:
        if (FH() == true) goto L9;
        return;
    L9:
        VH("endSession");     // Catch: java.lang.Throwable -> L11
    }

    public static void j6(android.content.Context r7, abcd.G r8) {
    L12:
        th = move-exception;
        if (Zo == false) goto L16;
        abcd.wu.j6(th, 1341088318444806360L, null, r7, r8);
    L16:
        throw th;
    L3:
        if (v5 == false) goto L5;
        abcd.wu.j6(1341088318444806360L, null, r7, r8);     // Catch: java.lang.Throwable -> L12
    L5:
        if (r8 == null) goto L11;
        VH("initialize");     // Catch: java.lang.Throwable -> L12
        DW = r8;     // Catch: java.lang.Throwable -> L12
        j6 = r7.getPackageManager().getPackageInfo(r7.getPackageName(), 0).versionName;     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L17 java.lang.Throwable -> L12
    L8:
        FH = com.google.firebase.analytics.FirebaseAnalytics.getInstance(r7);     // Catch: java.lang.Throwable -> L12
        Hw = true;     // Catch: java.lang.Throwable -> L12
        FH();     // Catch: java.lang.Throwable -> L12
        return;
    L11:
        throw new java.lang.IllegalArgumentException("Arguments may not be null");     // Catch: java.lang.Throwable -> L12
    }

    public static void j6(android.content.Context r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, double r11, java.lang.String r13) {
        if (v5 == false) goto L6;
        abcd.wu.j6(1354123103448276800L, null, new java.lang.Object[]{r5, r6, r7, r8, r9, r10, new java.lang.Double(r11), r13});
    L6:
        if (FH() == false) goto L7;
    }

    public static void j6(java.lang.String r6) {
    L11:
        th = move-exception;
        if (Zo == false) goto L15;
        abcd.wu.j6(th, 839696905947546655L, null, r6);
    L15:
        throw th;
    L4:
        if (v5 == false) goto L7;
        abcd.wu.j6(839696905947546655L, null, r6);     // Catch: java.lang.Throwable -> L11
    L7:
        if (FH() == true) goto L9;
        return;
    L9:
        VH("logEvent: " + r6);     // Catch: java.lang.Throwable -> L11
        android.os.Bundle r3 = new android.os.Bundle();     // Catch: java.lang.Throwable -> L11
        r3.putString("event_name", r6);     // Catch: java.lang.Throwable -> L11
        FH.j6("a4_legacy_event", r3);     // Catch: java.lang.Throwable -> L11
        com.crashlytics.android.Crashlytics.log("event: " + r6);     // Catch: java.lang.Throwable -> L11
    }

    public static void j6(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8) {
    L10:
        th = move-exception;
        if (Zo == false) goto L14;
        abcd.wu.j6(th, 57942326873086708L, null, r7, r8);
    L14:
        throw th;
    L3:
        if (v5 == false) goto L6;
        abcd.wu.j6(57942326873086708L, null, r7, r8);     // Catch: java.lang.Throwable -> L10
    L6:
        if (FH() == true) goto L8;
        return;
    L8:
        VH("logEvent: " + r7);     // Catch: java.lang.Throwable -> L10
        android.os.Bundle r0 = new android.os.Bundle();     // Catch: java.lang.Throwable -> L10
        r0.putString("event_name", r7);     // Catch: java.lang.Throwable -> L10
        FH.j6("a4_legacy_event", r0);     // Catch: java.lang.Throwable -> L10
        com.crashlytics.android.Crashlytics.log("event: " + r7);     // Catch: java.lang.Throwable -> L10
    }

    public static void v5(java.lang.String r5) {
    L8:
        th = move-exception;
        if (Zo == false) goto L12;
        abcd.wu.j6(th, 1476114258858077195L, null, r5);
    L12:
        throw th;
    L4:
        if (v5 == false) goto L6;
        abcd.wu.j6(1476114258858077195L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        com.crashlytics.android.Crashlytics.log("page view: " + r5);     // Catch: java.lang.Throwable -> L8
    }
}
