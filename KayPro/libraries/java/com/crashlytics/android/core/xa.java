package com.crashlytics.android.core;

class xa {
    private static final java.nio.charset.Charset j6 = null;
    private final java.io.File DW;

    static {
        j6 = java.nio.charset.Charset.forName("UTF-8");
    }

    public xa(java.io.File r1) {
        this.DW = r1;
    }

    private static com.crashlytics.android.core.Ta Hw(java.lang.String r3) {
        org.json.JSONObject r0 = new org.json.JSONObject(r3);
        return new com.crashlytics.android.core.Ta(j6(r0, "userId"), j6(r0, "userName"), j6(r0, "userEmail"));
    }

    private static java.lang.String j6(com.crashlytics.android.core.Ta r1) {
        return new com.crashlytics.android.core.wa(r1).toString();
    }

    private static java.lang.String j6(java.util.Map<java.lang.String, java.lang.String> r1) {
        return new org.json.JSONObject(r1).toString();
    }

    private static java.lang.String j6(org.json.JSONObject r2, java.lang.String r3) {
        if (r2.isNull(r3) == false) goto L5;
        return null;
    L5:
        return r2.optString(r3, null);
    }

    public java.io.File DW(java.lang.String r4) {
        return new java.io.File(this.DW, r4 + "user.meta");
    }

    public com.crashlytics.android.core.Ta FH(java.lang.String r6) {
        java.io.File r7 = DW(r6);
        if (r7.exists() == false) goto L5;
        java.io.FileInputStream r1 = null;
        java.io.FileInputStream r2 = new java.io.FileInputStream(r7);     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L17
        com.crashlytics.android.core.Ta r8 = Hw(io.fabric.sdk.android.services.common.i.DW(r2));     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L13
        io.fabric.sdk.android.services.common.i.j6(r2, "Failed to close user metadata file.");
        return r8;
    L13:
        e = e;
        r1 = r2;
    L18:
        io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Error deserializing user metadata.", e);     // Catch: java.lang.Throwable -> L15
        io.fabric.sdk.android.services.common.i.j6(r1, "Failed to close user metadata file.");
        return com.crashlytics.android.core.Ta.j6;
    L11:
        th = th;
        r1 = r2;
    L21:
        io.fabric.sdk.android.services.common.i.j6(r1, "Failed to close user metadata file.");
        throw th;
    L17:
        e = e;
    L15:
        th = th;
        goto L21
    L5:
        return com.crashlytics.android.core.Ta.j6;
    }

    public java.io.File j6(java.lang.String r4) {
        return new java.io.File(this.DW, r4 + "keys.meta");
    }

    public void j6(java.lang.String r6, com.crashlytics.android.core.Ta r7) {
        java.io.File r8 = DW(r6);
        java.io.BufferedWriter r1 = null;
        java.lang.String r9 = j6(r7);     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L12
        java.io.BufferedWriter r2 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r8), j6));     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L12
        r2.write(r9);     // Catch: java.lang.Throwable -> L6 java.lang.Exception -> L8
        r2.flush();     // Catch: java.lang.Throwable -> L6 java.lang.Exception -> L8
        io.fabric.sdk.android.services.common.i.j6(r2, "Failed to close user metadata file.");
        return;
    L8:
        e = e;
        r1 = r2;
    L13:
        io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Error serializing user metadata.", e);     // Catch: java.lang.Throwable -> L10
        io.fabric.sdk.android.services.common.i.j6(r1, "Failed to close user metadata file.");
        return;
    L6:
        th = th;
        r1 = r2;
    L16:
        io.fabric.sdk.android.services.common.i.j6(r1, "Failed to close user metadata file.");
        throw th;
    L12:
        e = e;
    L10:
        th = th;
        goto L16
    }

    public void j6(java.lang.String r6, java.util.Map<java.lang.String, java.lang.String> r7) {
        java.io.File r8 = j6(r6);
        java.io.BufferedWriter r1 = null;
        java.lang.String r9 = j6(r7);     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L12
        java.io.BufferedWriter r2 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r8), j6));     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L12
        r2.write(r9);     // Catch: java.lang.Throwable -> L6 java.lang.Exception -> L8
        r2.flush();     // Catch: java.lang.Throwable -> L6 java.lang.Exception -> L8
        io.fabric.sdk.android.services.common.i.j6(r2, "Failed to close key/value metadata file.");
        return;
    L8:
        e = e;
        r1 = r2;
    L13:
        io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Error serializing key/value metadata.", e);     // Catch: java.lang.Throwable -> L10
        io.fabric.sdk.android.services.common.i.j6(r1, "Failed to close key/value metadata file.");
        return;
    L6:
        th = th;
        r1 = r2;
    L16:
        io.fabric.sdk.android.services.common.i.j6(r1, "Failed to close key/value metadata file.");
        throw th;
    L12:
        e = e;
    L10:
        th = th;
        goto L16
    }
}
