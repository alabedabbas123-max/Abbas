package com.crashlytics.android.answers;

class Runnablei implements java.lang.Runnable {
    final boolean DW;
    final com.crashlytics.android.answers.ClassJ FH;
    final com.crashlytics.android.answers.I.a j6;

    Runnablei(com.crashlytics.android.answers.ClassJ r1, com.crashlytics.android.answers.I.a r2, boolean r3) {
        this.FH = r1;
        this.j6 = r2;
        this.DW = r3;
    }

    @Override
    public void run() {
        this.FH.gn.j6(this.j6);     // Catch: java.lang.Exception -> L6
        if (this.DW == false) goto L11;
        this.FH.gn.j6();     // Catch: java.lang.Exception -> L6
        return;
    L11:
        return;
    L6:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().FH("Answers", "Failed to process event", e);
    }
}
