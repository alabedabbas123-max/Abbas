package com.crashlytics.android.answers;

final class J {
    public final java.lang.String DW;
    private java.lang.String EQ;
    public final java.lang.String FH;
    public final java.lang.Boolean Hw;
    public final java.lang.String VH;
    public final java.lang.String Zo;
    public final java.lang.String gn;
    public final java.lang.String j6;
    public final java.lang.String tp;
    public final java.lang.String u7;
    public final java.lang.String v5;

    public J(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.Boolean r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
        this.Hw = r4;
        this.v5 = r5;
        this.Zo = r6;
        this.VH = r7;
        this.gn = r8;
        this.u7 = r9;
        this.tp = r10;
    }

    public java.lang.String toString() {
        if (this.EQ != null) goto L6;
        this.EQ = "appBundleId=" + this.j6 + ", executionId=" + this.DW + ", installationId=" + this.FH + ", limitAdTrackingEnabled=" + this.Hw + ", betaDeviceToken=" + this.v5 + ", buildId=" + this.Zo + ", osVersion=" + this.VH + ", deviceModel=" + this.gn + ", appVersionCode=" + this.u7 + ", appVersionName=" + this.tp;
    L6:
        return this.EQ;
    }
}
