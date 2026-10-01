package com.crashlytics.android.answers;

class F implements com.crashlytics.android.answers.q.a {
    final com.crashlytics.android.answers.ClassJ DW;
    final io.fabric.sdk.android.ActivityLifecycleManager FH;
    final com.crashlytics.android.answers.q Hw;
    private final long j6;
    final com.crashlytics.android.answers.m v5;

    F(com.crashlytics.android.answers.ClassJ r1, io.fabric.sdk.android.ActivityLifecycleManager r2, com.crashlytics.android.answers.q r3, com.crashlytics.android.answers.m r4, long r5) {
        this.DW = r1;
        this.FH = r2;
        this.Hw = r3;
        this.v5 = r4;
        this.j6 = r5;
    }

    public static com.crashlytics.android.answers.F j6(io.fabric.sdk.android.Kit r13, android.content.Context r14, io.fabric.sdk.android.services.common.v r15, java.lang.String r16, java.lang.String r17, long r18) {
        com.crashlytics.android.answers.L r4 = new com.crashlytics.android.answers.L(r14, r15, r16, r17);
        com.crashlytics.android.answers.ClassK r3 = new com.crashlytics.android.answers.ClassK(r14, new abcd.Pz(r13));
        abcd.Ez r5 = new abcd.Ez(io.fabric.sdk.android.Fabric.getLogger());
        io.fabric.sdk.android.ActivityLifecycleManager r9 = new io.fabric.sdk.android.ActivityLifecycleManager(r14);
        java.util.concurrent.ScheduledExecutorService r6 = io.fabric.sdk.android.services.common.r.DW("Answers Events Handler");
        com.crashlytics.android.answers.q r10 = new com.crashlytics.android.answers.q(r6);
        return new com.crashlytics.android.answers.F(new com.crashlytics.android.answers.ClassJ(r13, r14, r3, r4, r5, r6, new com.crashlytics.android.answers.FirebaseAnalyticsApiAdapter(r14)), r9, r10, com.crashlytics.android.answers.m.j6(r14), r18);
    }

    public void DW() {
        this.FH.j6();
        this.DW.j6();
    }

    public void FH() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.DW.DW();
                    this.FH.j6(new com.crashlytics.android.answers.ClassL(this, this.Hw));
                    this.Hw.j6(this);
                    if (Hw() == false) { $pc0 = 6; continue $sw0; }
                    j6(this.j6);
                    this.v5.DW();
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    boolean Hw() {
        return !this.v5.j6();
    }

    @Override
    public void j6() {
        io.fabric.sdk.android.Fabric.getLogger().Hw("Answers", "Flush events when app is backgrounded");
        this.DW.FH();
    }

    public void j6(long r4) {
        io.fabric.sdk.android.Fabric.getLogger().Hw("Answers", "Logged install");
        this.DW.DW(com.crashlytics.android.answers.I.j6(r4));
    }

    public void j6(abcd.Tz r3, java.lang.String r4) {
        this.Hw.j6(r3.tp);
        this.DW.j6(r3, r4);
    }

    public void j6(android.app.Activity r4, com.crashlytics.android.answers.I.b r5) {
        io.fabric.sdk.android.Fabric.getLogger().Hw("Answers", "Logged lifecycle event: " + r5.name());
        this.DW.j6(com.crashlytics.android.answers.I.j6(r5, r4));
    }

    public void j6(java.lang.String r1) {
    }

    public void j6(java.lang.String r4, java.lang.String r5) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) { $pc1 = 7; continue $sw1; }
                    io.fabric.sdk.android.Fabric.getLogger().Hw("Answers", "Logged crash");
                    this.DW.FH(com.crashlytics.android.answers.I.j6(r4, r5));
                    return;
                }
                case 7: {
                    throw new java.lang.IllegalStateException("onCrash called from main thread!!!");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
