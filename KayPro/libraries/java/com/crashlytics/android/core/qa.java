package com.crashlytics.android.core;

class qa {
    private final abcd.gA DW;
    private final android.content.Context j6;

    public qa(android.content.Context r1, abcd.gA r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    private java.lang.String DW(java.lang.String r2, java.lang.String r3) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (j6(r2) == true) { $pc0 = 5; continue $sw0; }
                    return r2;
                }
                case 5: {
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.lang.String j6(java.lang.String r2, java.lang.String r3) {
        return DW(io.fabric.sdk.android.services.common.i.DW(this.j6, r2), r3);
    }

    private boolean j6(java.lang.String r1) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r1 != null) { $pc1 = 4; continue $sw1; }
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    return true;
                }
                case 4: {
                    if (r1.length() == 0) { $pc1 = 7; continue $sw1; }
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
