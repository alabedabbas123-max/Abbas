package com.crashlytics.android.answers;

class Runnabled implements java.lang.Runnable {
    final java.lang.String DW;
    final com.crashlytics.android.answers.ClassJ FH;
    final abcd.Tz j6;

    Runnabled(com.crashlytics.android.answers.ClassJ r1, abcd.Tz r2, java.lang.String r3) {
        this.FH = r1;
        this.j6 = r2;
        this.DW = r3;
    }

    @Override
    public void run() {
        this.FH.gn.j6(this.j6, this.DW);     // Catch: java.lang.Exception -> L4
        return;
    L4:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().FH("Answers", "Failed to set analytics settings data", e);
    }
}
