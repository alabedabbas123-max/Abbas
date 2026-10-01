package com.crashlytics.android.core;

class Aa extends io.fabric.sdk.android.services.common.Abstracta implements com.crashlytics.android.core.Interfaceka {
    public Aa(io.fabric.sdk.android.Kit r7, java.lang.String r8, java.lang.String r9, abcd.Jz r10) {
        super(r7, r8, r9, r10, abcd.Fz.DW);
    }

    private abcd.Hz j6(abcd.Hz r7, com.crashlytics.android.core.Ka r8) {
        r7.v5("report_id", r8.DW());
        java.io.File[] r9 = r8.Hw();
        int r0 = r9.length;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L35;
        java.io.File r2 = r9[r1];
        if (r2.getName().equals("minidump") == false) goto L8;
        r7.j6("minidump_file", r2.getName(), "application/octet-stream", r2);
    L34:
        r1 = r1 + 1;
        goto L3
    L8:
        if (r2.getName().equals("metadata") == false) goto L11;
        r7.j6("crash_meta_file", r2.getName(), "application/octet-stream", r2);
        goto L34
    L11:
        if (r2.getName().equals("binaryImages") == false) goto L14;
        r7.j6("binary_images_file", r2.getName(), "application/octet-stream", r2);
        goto L34
    L14:
        if (r2.getName().equals("session") == false) goto L17;
        r7.j6("session_meta_file", r2.getName(), "application/octet-stream", r2);
        goto L34
    L17:
        if (r2.getName().equals("app") == false) goto L20;
        r7.j6("app_meta_file", r2.getName(), "application/octet-stream", r2);
        goto L34
    L20:
        if (r2.getName().equals("device") == false) goto L23;
        r7.j6("device_meta_file", r2.getName(), "application/octet-stream", r2);
        goto L34
    L23:
        if (r2.getName().equals("os") == false) goto L26;
        r7.j6("os_meta_file", r2.getName(), "application/octet-stream", r2);
        goto L34
    L26:
        if (r2.getName().equals("user") == false) goto L29;
        r7.j6("user_meta_file", r2.getName(), "application/octet-stream", r2);
        goto L34
    L29:
        if (r2.getName().equals("logs") == false) goto L32;
        r7.j6("logs_file", r2.getName(), "application/octet-stream", r2);
        goto L34
    L32:
        if (r2.getName().equals("keys") == false) goto L34;
        r7.j6("keys_file", r2.getName(), "application/octet-stream", r2);
        goto L34
    L35:
        return r7;
    }

    private abcd.Hz j6(abcd.Hz r3, java.lang.String r4) {
        r3.FH("User-Agent", "Crashlytics Android SDK/" + this.Zo.getVersion());
        r3.FH("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        r3.FH("X-CRASHLYTICS-API-CLIENT-VERSION", this.Zo.getVersion());
        r3.FH("X-CRASHLYTICS-API-KEY", r4);
        return r3;
    }

    @Override
    public boolean j6(com.crashlytics.android.core.ja r5) {
        abcd.Hz r0 = j6();
        j6(r0, r5.j6);
        j6(r0, r5.DW);
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Sending report to: " + DW());
        int r6 = r0.VH();
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Result was: " + r6);
        if (io.fabric.sdk.android.services.common.A.j6(r6) != 0) goto L5;
        return true;
    L5:
        return false;
    }
}
