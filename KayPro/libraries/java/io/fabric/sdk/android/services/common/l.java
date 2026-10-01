package io.fabric.sdk.android.services.common;

public class l {
    private static java.lang.Object DW;
    private static io.fabric.sdk.android.services.common.l j6;
    private final android.content.SharedPreferences FH;
    private volatile boolean Hw;
    private boolean VH;
    private final io.fabric.sdk.android.services.common.s Zo;
    private volatile boolean v5;

    static {
        DW = new java.lang.Object();
    }

    private l(android.content.Context r7) {
        boolean r0 = false;
        this.VH = false;
        if (r7 == null) goto L27;
        this.FH = r7.getSharedPreferences("com.google.firebase.crashlytics.prefs", 0);
        this.Zo = io.fabric.sdk.android.services.common.t.j6(r7);
        if (this.FH.contains("firebase_crashlytics_collection_enabled") == false) goto L29;
        boolean r1 = this.FH.getBoolean("firebase_crashlytics_collection_enabled", true);
    L7:
        boolean r2 = true;
    L21:
        this.v5 = r1;
        this.Hw = r2;
        if (io.fabric.sdk.android.services.common.i.Ws(r7) == null) goto L24;
        r0 = true;
    L24:
        this.VH = r0;
        return;
    L29:
        android.content.pm.PackageManager r3 = r7.getPackageManager();     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L18
        if (r3 == null) goto L20;
        android.content.pm.ApplicationInfo r4 = r3.getApplicationInfo(r7.getPackageName(), 128);     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L18
        if (r4 == null) goto L20;
        if (r4.metaData == null) goto L20;
        if (r4.metaData.containsKey("firebase_crashlytics_collection_enabled") == false) goto L20;
        r1 = r4.metaData.getBoolean("firebase_crashlytics_collection_enabled");     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L18
    L20:
        r1 = true;
        r2 = false;
    L18:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().j6("Fabric", "Unable to get PackageManager. Falling through", e);
        goto L20
    L27:
        throw new java.lang.RuntimeException("null context");
    }

    public static io.fabric.sdk.android.services.common.l j6(android.content.Context r2) {
        java.lang.Object r0 = DW;
        monitor-enter(r0);
    L10:
        th = move-exception;
        throw th;
    L5:
        if (j6 != null) goto L7;
        j6 = new io.fabric.sdk.android.services.common.l(r2);     // Catch: java.lang.Throwable -> L10
    L7:
        io.fabric.sdk.android.services.common.l r3 = j6;     // Catch: java.lang.Throwable -> L10
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L10
        return r3;
    }

    public boolean DW() {
        return this.v5;
    }

    @android.annotation.SuppressLint({"CommitPrefEdits", "ApplySharedPref"})
    public void j6(boolean r3) {
        this.v5 = r3;
        this.Hw = true;
        this.FH.edit().putBoolean("firebase_crashlytics_collection_enabled", r3).commit();
    }

    public boolean j6() {
        if (this.VH == true) goto L5;
    L8:
        io.fabric.sdk.android.services.common.s r0 = this.Zo;
        if (r0 != null) goto L11;
        return true;
    L11:
        return r0.j6();
    L5:
        if (this.Hw == false) goto L8;
        return this.v5;
    }
}
