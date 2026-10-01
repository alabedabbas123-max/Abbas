package com.crashlytics.android.answers;

class ClassK {
    final abcd.Oz DW;
    final android.content.Context j6;

    public ClassK(android.content.Context r1, abcd.Oz r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    public com.crashlytics.android.answers.D j6() {
        com.crashlytics.android.answers.K r0 = null;
        io.fabric.sdk.android.services.common.C r1 = null;
        java.io.File r2 = null;
        abcd.zz r3 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) { $pc0 = 7; continue $sw0; }
                    r0 = new com.crashlytics.android.answers.K();
                    r1 = new io.fabric.sdk.android.services.common.C();
                    r2 = this.DW.j6();
                    r3 = new abcd.zz(this.j6, r2, "session_analytics.tap", "session_analytics_to_send");
                    return new com.crashlytics.android.answers.D(this.j6, r0, r1, r3);
                }
                case 7: {
                    throw new java.lang.IllegalStateException("AnswersFilesManagerProvider cannot be called on the main thread");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
