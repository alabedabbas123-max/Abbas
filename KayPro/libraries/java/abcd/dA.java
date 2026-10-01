package abcd;

class dA extends io.fabric.sdk.android.services.common.Abstracta implements abcd.InterfaceqA {
    public dA(io.fabric.sdk.android.Kit r7, java.lang.String r8, java.lang.String r9, abcd.Jz r10) {
        this(r7, r8, r9, r10, abcd.Fz.j6);
    }

    dA(io.fabric.sdk.android.Kit r1, java.lang.String r2, java.lang.String r3, abcd.Jz r4, abcd.Fz r5) {
        super(r1, r2, r3, r4, r5);
    }

    private java.util.Map<java.lang.String, java.lang.String> DW(abcd.pA r4) {
        java.util.HashMap r0 = new java.util.HashMap();
        r0.put("build_version", r4.gn);
        r0.put("display_version", r4.VH);
        r0.put("source", java.lang.Integer.toString(r4.u7));
        java.lang.String r1 = r4.tp;
        if (r1 == null) goto L5;
        r0.put("icon_hash", r1);
    L5:
        java.lang.String r5 = r4.Zo;
        if (io.fabric.sdk.android.services.common.i.DW(r5) == true) goto L8;
        r0.put("instance", r5);
    L8:
        return r0;
    }

    private org.json.JSONObject DW(java.lang.String r5) {
        return new org.json.JSONObject(r5);
    L4:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().j6("Fabric", "Failed to parse settings JSON from " + DW(), e);
        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Settings response " + r5);
        return null;
    }

    private abcd.Hz j6(abcd.Hz r3, abcd.pA r4) {
        j6(r3, "X-CRASHLYTICS-API-KEY", r4.j6);
        j6(r3, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        j6(r3, "X-CRASHLYTICS-API-CLIENT-VERSION", this.Zo.getVersion());
        j6(r3, "Accept", "application/json");
        j6(r3, "X-CRASHLYTICS-DEVICE-MODEL", r4.DW);
        j6(r3, "X-CRASHLYTICS-OS-BUILD-VERSION", r4.FH);
        j6(r3, "X-CRASHLYTICS-OS-DISPLAY-VERSION", r4.Hw);
        j6(r3, "X-CRASHLYTICS-INSTALLATION-ID", r4.v5);
        return r3;
    }

    private void j6(abcd.Hz r1, java.lang.String r2, java.lang.String r3) {
        if (r3 == null) goto L5;
        r1.FH(r2, r3);
        return;
    }

    org.json.JSONObject j6(abcd.Hz r5) {
        int r0 = r5.VH();
        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Settings result was: " + r0);
        if (j6(r0) == true) goto L7;
        io.fabric.sdk.android.Fabric.getLogger().DW("Fabric", "Failed to retrieve settings from " + DW());
        return null;
    L7:
        return DW(r5.j6());
    }

    @Override
    public org.json.JSONObject j6(abcd.pA r9) {
        java.lang.String r0 = "X-REQUEST-ID";
        org.json.JSONObject r3 = null;
        java.util.Map<java.lang.String, java.lang.String> r4 = DW(r9);     // Catch: java.lang.Throwable -> L10 abcd.Hz.c -> L12
        abcd.Hz r5 = j6(r4);     // Catch: java.lang.Throwable -> L10 abcd.Hz.c -> L12
        j6(r5, r9);     // Catch: abcd.Hz.c -> L8 java.lang.Throwable -> L18
        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Requesting settings from " + DW());     // Catch: abcd.Hz.c -> L8 java.lang.Throwable -> L18
        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Settings query params were: " + r4);     // Catch: abcd.Hz.c -> L8 java.lang.Throwable -> L18
        r3 = j6(r5);     // Catch: abcd.Hz.c -> L8 java.lang.Throwable -> L18
        if (r5 == null) goto L24;
        io.fabric.sdk.android.m r10 = io.fabric.sdk.android.Fabric.getLogger();
        java.lang.StringBuilder r6 = new java.lang.StringBuilder();
    L7:
        r6.append("Settings request ID: ");
        r6.append(r5.Hw("X-REQUEST-ID"));
        r0 = r6.toString();
        r10.Hw("Fabric", r0);
    L24:
        return r3;
    L8:
        e = e;
    L14:
        io.fabric.sdk.android.Fabric.getLogger().FH("Fabric", "Settings request failed.", e);     // Catch: java.lang.Throwable -> L18
        if (r5 == null) goto L24;
        r10 = io.fabric.sdk.android.Fabric.getLogger();
        r6 = new java.lang.StringBuilder();
        goto L7
    L18:
        th = th;
    L19:
        if (r5 == null) goto L22;
        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Settings request ID: " + r5.Hw(r0));
    L22:
        throw th;
    L12:
        e = e;
        r5 = null;
    L10:
        th = th;
        r5 = null;
        goto L19
    }

    boolean j6(int r2) {
        if (r2 != 200) goto L5;
    L12:
        return true;
    L5:
        if (r2 == 201) goto L12;
        if (r2 == 202) goto L12;
        if (r2 == 203) goto L12;
        return false;
    }
}
