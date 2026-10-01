package com.crashlytics.android;

public class CrashlyticsInitProvider extends android.content.ContentProvider {

    interface a {
        boolean j6(android.content.Context r1);
    }

    public CrashlyticsInitProvider() {
    }

    private io.fabric.sdk.android.Kit[] j6(android.content.Context r7) {
        android.os.Bundle r8 = r7.getPackageManager().getApplicationInfo(r7.getPackageName(), 128).metaData;     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8
        if (r8 == null) goto L10;
        if (r8.getBoolean("firebase_crashlytics_ndk_enabled", false) == false) goto L10;
        boolean r9 = true;
    L11:
        com.crashlytics.android.Crashlytics r3 = new com.crashlytics.android.Crashlytics();
        if (r9 == false) goto L18;
        io.fabric.sdk.android.Fabric.getLogger().v5("Fabric", "Crashlytics is initializing NDK crash reporter.");     // Catch: java.lang.Throwable -> L15
        return new io.fabric.sdk.android.Kit[]{r3, new com.crashlytics.android.ndk.CrashlyticsNdk()};
    L15:
        th = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().FH("Fabric", "Crashlytics failed to initialize NDK crash reporting. Attempting to intialize SDK...", th);
    L18:
        return new io.fabric.sdk.android.Kit[]{r3};
    L10:
        r9 = false;
    L8:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().j6("Fabric", "Unable to get PackageManager while determining if Crashlytics NDK should be initialized", e);
        goto L10
    }

    @Override
    public int delete(android.net.Uri r1, java.lang.String r2, java.lang.String[] r3) {
        return 0;
    }

    @Override
    public java.lang.String getType(android.net.Uri r1) {
        return null;
    }

    @Override
    public android.net.Uri insert(android.net.Uri r1, android.content.ContentValues r2) {
        return null;
    }

    boolean j6(android.content.Context r2, io.fabric.sdk.android.services.common.u r3, com.crashlytics.android.CrashlyticsInitProvider.a r4) {
        if (r3.v5(r2) == false) goto L7;
        return r4.j6(r2);
    L7:
        return r3.Hw(r2);
    }

    @Override
    public boolean onCreate() {
        android.content.Context r0 = getContext();
        if (j6(r0, new io.fabric.sdk.android.services.common.u(), new com.crashlytics.android.a()) == true) goto L11;
        io.fabric.sdk.android.Fabric.getLogger().v5("CrashlyticsInitProvider", "CrashlyticsInitProvider skipping initialization");
        return true;
    L11:
        io.fabric.sdk.android.Fabric.with(r0, j6(r0.getApplicationContext()));     // Catch: java.lang.IllegalStateException -> L6
        io.fabric.sdk.android.Fabric.getLogger().v5("CrashlyticsInitProvider", "CrashlyticsInitProvider initialization successful");     // Catch: java.lang.IllegalStateException -> L6
        return true;
    L6:
        io.fabric.sdk.android.Fabric.getLogger().v5("CrashlyticsInitProvider", "CrashlyticsInitProvider initialization unsuccessful");
        return false;
    }

    @Override
    public android.database.Cursor query(android.net.Uri r1, java.lang.String[] r2, java.lang.String r3, java.lang.String[] r4, java.lang.String r5) {
        return null;
    }

    @Override
    public int update(android.net.Uri r1, android.content.ContentValues r2, java.lang.String r3, java.lang.String[] r4) {
        return 0;
    }
}
