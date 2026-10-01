package com.crashlytics.android.core;

class qa {
    private final abcd.gA DW;
    private final android.content.Context j6;

    public qa(android.content.Context r1, abcd.gA r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    private java.lang.String DW(java.lang.String r2, java.lang.String r3) {
        if (j6(r2) == true) goto L5;
        return r2;
    L5:
        return r3;
    }

    private java.lang.String j6(java.lang.String r2, java.lang.String r3) {
        return DW(io.fabric.sdk.android.services.common.i.DW(this.j6, r2), r3);
    }

    private boolean j6(java.lang.String r1) {
        if (r1 != null) goto L4;
    L7:
        return true;
    L4:
        if (r1.length() == 0) goto L7;
        return false;
    }

    public java.lang.String DW() {
        return j6("com.crashlytics.CrashSubmissionCancelTitle", this.DW.v5);
    }

    public java.lang.String FH() {
        return j6("com.crashlytics.CrashSubmissionPromptMessage", this.DW.DW);
    }

    public java.lang.String Hw() {
        return j6("com.crashlytics.CrashSubmissionSendTitle", this.DW.FH);
    }

    public java.lang.String j6() {
        return j6("com.crashlytics.CrashSubmissionAlwaysSendTitle", this.DW.VH);
    }

    public java.lang.String v5() {
        return j6("com.crashlytics.CrashSubmissionPromptTitle", this.DW.j6);
    }
}
