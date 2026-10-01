package com.crashlytics.android.core;

class Runnablep implements java.lang.Runnable {
    final com.crashlytics.android.core.r DW;
    final java.lang.Runnable j6;

    Runnablep(com.crashlytics.android.core.r r1, java.lang.Runnable r2) {
        this.DW = r1;
        this.j6 = r2;
    }

    @Override
    public void run() {
        this.j6.run();     // Catch: java.lang.Exception -> L4
        return;
    L4:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Failed to execute task.", e);
    }
}
