package com.crashlytics.android.core;

class ia implements java.lang.Thread.UncaughtExceptionHandler {
    private final com.crashlytics.android.core.ia.b DW;
    private final boolean FH;
    private final java.lang.Thread.UncaughtExceptionHandler Hw;
    private final com.crashlytics.android.core.ia.a j6;
    private final java.util.concurrent.atomic.AtomicBoolean v5;

    interface a {
        void j6(com.crashlytics.android.core.ia.b r1, java.lang.Thread r2, java.lang.Throwable r3, boolean r4);
    }

    interface b {
        abcd.mA j6();
    }

    public ia(com.crashlytics.android.core.ia.a r1, com.crashlytics.android.core.ia.b r2, boolean r3, java.lang.Thread.UncaughtExceptionHandler r4) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
        this.Hw = r4;
        this.v5 = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    boolean j6() {
        return this.v5.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Thread$UncaughtExceptionHandler] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Thread$UncaughtExceptionHandler] */
    /* JADX WARN: Type inference failed for: r4v1, types: [io.fabric.sdk.android.m] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.concurrent.atomic.AtomicBoolean] */
    @Override
    public void uncaughtException(java.lang.Thread r7, java.lang.Throwable r8) {
        java.lang.Object r0 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = "Crashlytics completed exception processing. Invoking default exception handler.";
                    this.v5.set(true);
                    try {
                        this.j6.j6(this.DW, r7, r8, this.FH);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 7; continue $sw0; }
                        $pc0 = 5; continue $sw0;
                    }
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Crashlytics completed exception processing. Invoking default exception handler.");
                    r0 = this.Hw;
                    r0.uncaughtException(r7, r8);
                    r7 = this.v5;
                    r7.set(false);
                    return;
                }
                case 5: {
                    th = $ex0;
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", r0);
                    this.Hw.uncaughtException(r7, r8);
                    this.v5.set(false);
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 7: {
                    e = $ex0;
                    try {
                        io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "An error occurred in the uncaught exception handler", e);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 5; continue $sw0;
                    }
                    { $pc0 = 4; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
