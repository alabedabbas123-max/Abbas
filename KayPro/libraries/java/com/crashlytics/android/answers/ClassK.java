package com.crashlytics.android.answers;

class ClassK {
    final abcd.Oz DW;
    final android.content.Context j6;

    public ClassK(android.content.Context r1, abcd.Oz r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    public com.crashlytics.android.answers.D j6() {
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) goto L7;
        com.crashlytics.android.answers.K r0 = new com.crashlytics.android.answers.K();
        io.fabric.sdk.android.services.common.C r1 = new io.fabric.sdk.android.services.common.C();
        java.io.File r2 = this.DW.j6();
        abcd.zz r3 = new abcd.zz(this.j6, r2, "session_analytics.tap", "session_analytics_to_send");
        return new com.crashlytics.android.answers.D(this.j6, r0, r1, r3);
    L7:
        throw new java.lang.IllegalStateException("AnswersFilesManagerProvider cannot be called on the main thread");
    }
}
