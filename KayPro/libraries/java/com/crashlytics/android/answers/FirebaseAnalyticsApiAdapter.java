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
        if (this.FH != null) goto L6;
        this.FH = com.crashlytics.android.answers.o.j6(this.j6);
    L6:
        return this.FH;
    }

    public void j6(com.crashlytics.android.answers.I r5) {
        com.crashlytics.android.answers.u r0 = j6();
        if (r0 != null) goto L6;
        io.fabric.sdk.android.Fabric.getLogger().Hw("Answers", "Firebase analytics logging was enabled, but not available...");
        return;
    L6:
        com.crashlytics.android.answers.v r2 = this.DW.j6(r5);
        if (r2 != null) goto L10;
        io.fabric.sdk.android.Fabric.getLogger().Hw("Answers", "Fabric event was not mappable to Firebase event: " + r5);
        return;
    L10:
        r0.j6(r2.j6(), r2.DW());
        if ("levelEnd".equals(r5.VH) == false) goto L14;
        r0.j6("post_score", r2.DW());
        return;
    }
}
