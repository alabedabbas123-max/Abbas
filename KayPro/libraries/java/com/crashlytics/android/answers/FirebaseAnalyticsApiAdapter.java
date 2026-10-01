package com.crashlytics.android.answers;

class FirebaseAnalyticsApiAdapter {
    private final com.crashlytics.android.answers.w DW;
    private com.crashlytics.android.answers.u FH;
    private final android.content.Context j6;

    public FirebaseAnalyticsApiAdapter(android.content.Context r2) {
        this(r2, new com.crashlytics.android.answers.w());
    }

    public FirebaseAnalyticsApiAdapter(android.content.Context r1, com.crashlytics.android.answers.w r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    public com.crashlytics.android.answers.u j6() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.FH != null) { $pc0 = 6; continue $sw0; }
                    this.FH = com.crashlytics.android.answers.o.j6(this.j6);
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    return this.FH;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(com.crashlytics.android.answers.I r5) {
        com.crashlytics.android.answers.u r0 = null;
        com.crashlytics.android.answers.v r2 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = j6();
                    if (r0 != null) { $pc1 = 6; continue $sw1; }
                    io.fabric.sdk.android.Fabric.getLogger().Hw("Answers", "Firebase analytics logging was enabled, but not available...");
                    return;
                }
                case 6: {
                    r2 = this.DW.j6(r5);
                    if (r2 != null) { $pc1 = 10; continue $sw1; }
                    io.fabric.sdk.android.Fabric.getLogger().Hw("Answers", "Fabric event was not mappable to Firebase event: " + r5);
                    return;
                }
                case 10: {
                    r0.j6(r2.j6(), r2.DW());
                    if ("levelEnd".equals(r5.VH) == false) { $pc1 = 14; continue $sw1; }
                    r0.j6("post_score", r2.DW());
                    return;
                }
                case 14: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
