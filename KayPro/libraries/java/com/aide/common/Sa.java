package com.aide.common;

@abcd.Interfacexu
class Sa implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.app.Activity FH;

    static {
        abcd.wu.j6(com.aide.common.Sa.class, 1991841546302420120L, -5453190372600529752L);
    }

    Sa(android.app.Activity r1) {
        this.FH = r1;
    }

    @abcd.Interfacesu(method = -4158398700277072211L)
    private java.lang.String DW() {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -1612750355503795260L, this);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L16;
        abcd.wu.j6(-1612750355503795260L, this);     // Catch: java.lang.Throwable -> L11
    L16:
        return this.FH.getPackageManager().getPackageInfo(this.FH.getPackageName(), 0).versionName;
    L8:
        e = move-exception;
        com.aide.common.ClassH.DW(e);     // Catch: java.lang.Throwable -> L11
        return "(version unknown)";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    @abcd.Interfacesu(method = 3825986702556139180L)
    private java.lang.String j6() {
        long r0 = 3509514631334873775(0x30b44cf686c04aaf, double:4.488184838765648E-74);
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, r0, this);
    L18:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3509514631334873775L, this);     // Catch: java.lang.Throwable -> L14
    L6:
        java.lang.String r2 = android.os.Build.MODEL;     // Catch: java.lang.Throwable -> L14
        if (r2 != null) goto L9;
    L12:
        return "";
    L9:
        if (r2.length() > 40) goto L12;
        r0 = "on my " + r2;     // Catch: java.lang.Throwable -> L14
        return r0;
    }

    @Override
    @abcd.Interfacesu(method = -1794388573208594625L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -3970204642281089625L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3970204642281089625L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.common.Ha.j6(this.FH, "support@appfour.com", "AIDE Feedback", "With AIDE " + DW() + " " + j6() + " (SDK " + android.os.Build.VERSION.SDK_INT + ")...\n\n[Write text here]");     // Catch: java.lang.Throwable -> L8
    }
}
