package com.crashlytics.android.core;

class Aa extends io.fabric.sdk.android.services.common.Abstracta implements com.crashlytics.android.core.Interfaceka {
    public Aa(io.fabric.sdk.android.Kit r7, java.lang.String r8, java.lang.String r9, abcd.Jz r10) {
        super(r7, r8, r9, r10, abcd.Fz.DW);
    }

    private abcd.Hz j6(abcd.Hz r7, com.crashlytics.android.core.Ka r8) {
        java.io.File[] r9 = null;
        int r0 = 0;
        int r1 = 0;
        java.io.File r2 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r7.v5("report_id", r8.DW());
                    r9 = r8.Hw();
                    r0 = r9.length;
                    r1 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r1 >= r0) { $pc0 = 35; continue $sw0; }
                    r2 = r9[r1];
                    if (r2.getName().equals("minidump") == false) { $pc0 = 8; continue $sw0; }
                    r7.j6("minidump_file", r2.getName(), "application/octet-stream", r2);
                    $pc0 = 34; continue $sw0;
                }
                case 34: {
                    r1 = r1 + 1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 8: {
                    if (r2.getName().equals("metadata") == false) { $pc0 = 11; continue $sw0; }
                    r7.j6("crash_meta_file", r2.getName(), "application/octet-stream", r2);
                    { $pc0 = 34; continue $sw0; }
                }
                case 11: {
                    if (r2.getName().equals("binaryImages") == false) { $pc0 = 14; continue $sw0; }
                    r7.j6("binary_images_file", r2.getName(), "application/octet-stream", r2);
                    { $pc0 = 34; continue $sw0; }
                }
                case 14: {
                    if (r2.getName().equals("session") == false) { $pc0 = 17; continue $sw0; }
                    r7.j6("session_meta_file", r2.getName(), "application/octet-stream", r2);
                    { $pc0 = 34; continue $sw0; }
                }
                case 17: {
                    if (r2.getName().equals("app") == false) { $pc0 = 20; continue $sw0; }
                    r7.j6("app_meta_file", r2.getName(), "application/octet-stream", r2);
                    { $pc0 = 34; continue $sw0; }
                }
                case 20: {
                    if (r2.getName().equals("device") == false) { $pc0 = 23; continue $sw0; }
                    r7.j6("device_meta_file", r2.getName(), "application/octet-stream", r2);
                    { $pc0 = 34; continue $sw0; }
                }
                case 23: {
                    if (r2.getName().equals("os") == false) { $pc0 = 26; continue $sw0; }
                    r7.j6("os_meta_file", r2.getName(), "application/octet-stream", r2);
                    { $pc0 = 34; continue $sw0; }
                }
                case 26: {
                    if (r2.getName().equals("user") == false) { $pc0 = 29; continue $sw0; }
                    r7.j6("user_meta_file", r2.getName(), "application/octet-stream", r2);
                    { $pc0 = 34; continue $sw0; }
                }
                case 29: {
                    if (r2.getName().equals("logs") == false) { $pc0 = 32; continue $sw0; }
                    r7.j6("logs_file", r2.getName(), "application/octet-stream", r2);
                    { $pc0 = 34; continue $sw0; }
                }
                case 32: {
                    if (r2.getName().equals("keys") == false) { $pc0 = 34; continue $sw0; }
                    r7.j6("keys_file", r2.getName(), "application/octet-stream", r2);
                    { $pc0 = 34; continue $sw0; }
                }
                case 35: {
                    return r7;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        abcd.Hz r0 = null;
        int r6 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = j6();
                    j6(r0, r5.j6);
                    j6(r0, r5.DW);
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Sending report to: " + DW());
                    r6 = r0.VH();
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Result was: " + r6);
                    if (io.fabric.sdk.android.services.common.A.j6(r6) != 0) { $pc1 = 5; continue $sw1; }
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
