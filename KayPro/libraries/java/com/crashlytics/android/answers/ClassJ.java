package com.crashlytics.android.answers;

class ClassJ implements abcd.Interfacewz {
    private final android.content.Context DW;
    private final com.crashlytics.android.answers.ClassK FH;
    private final com.crashlytics.android.answers.L Hw;
    final java.util.concurrent.ScheduledExecutorService VH;
    private final com.crashlytics.android.answers.FirebaseAnalyticsApiAdapter Zo;
    com.crashlytics.android.answers.G gn;
    private final io.fabric.sdk.android.Kit j6;
    private final abcd.Jz v5;

    public ClassJ(io.fabric.sdk.android.Kit r2, android.content.Context r3, com.crashlytics.android.answers.ClassK r4, com.crashlytics.android.answers.L r5, abcd.Jz r6, java.util.concurrent.ScheduledExecutorService r7, com.crashlytics.android.answers.FirebaseAnalyticsApiAdapter r8) {
        this.gn = new com.crashlytics.android.answers.r();
        this.j6 = r2;
        this.DW = r3;
        this.FH = r4;
        this.Hw = r5;
        this.v5 = r6;
        this.VH = r7;
        this.Zo = r8;
    }

    static com.crashlytics.android.answers.ClassK DW(com.crashlytics.android.answers.ClassJ r0) {
        return r0.FH;
    }

    private void DW(java.lang.Runnable r4) {
        this.VH.submit(r4).get();     // Catch: java.lang.Exception -> L4
        return;
    L4:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().FH("Answers", "Failed to run events task", e);
    }

    static io.fabric.sdk.android.Kit FH(com.crashlytics.android.answers.ClassJ r0) {
        return r0.j6;
    }

    static android.content.Context Hw(com.crashlytics.android.answers.ClassJ r0) {
        return r0.DW;
    }

    static com.crashlytics.android.answers.FirebaseAnalyticsApiAdapter Zo(com.crashlytics.android.answers.ClassJ r0) {
        return r0.Zo;
    }

    static com.crashlytics.android.answers.L j6(com.crashlytics.android.answers.ClassJ r0) {
        return r0.Hw;
    }

    private void j6(java.lang.Runnable r4) {
        this.VH.submit(r4);     // Catch: java.lang.Exception -> L4
        return;
    L4:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().FH("Answers", "Failed to submit events task", e);
    }

    static abcd.Jz v5(com.crashlytics.android.answers.ClassJ r0) {
        return r0.v5;
    }

    public void DW() {
        j6(new com.crashlytics.android.answers.RunnableC1923g(this));
    }

    public void DW(com.crashlytics.android.answers.I.a r3) {
        j6(r3, false, true);
    }

    public void FH() {
        j6(new com.crashlytics.android.answers.Runnableh(this));
    }

    public void FH(com.crashlytics.android.answers.I.a r3) {
        j6(r3, true, false);
    }

    public void j6() {
        j6(new com.crashlytics.android.answers.Runnablee(this));
    }

    public void j6(abcd.Tz r2, java.lang.String r3) {
        j6(new com.crashlytics.android.answers.Runnabled(this, r2, r3));
    }

    public void j6(com.crashlytics.android.answers.I.a r2) {
        j6(r2, false, false);
    }

    void j6(com.crashlytics.android.answers.I.a r2, boolean r3, boolean r4) {
        com.crashlytics.android.answers.Runnablei r0 = new com.crashlytics.android.answers.Runnablei(this, r2, r4);
        if (r3 == false) goto L5;
        DW(r0);
        return;
    L5:
        j6(r0);
    }

    @Override
    public void j6(java.lang.String r1) {
        j6(new com.crashlytics.android.answers.Runnablef(this));
    }
}
