package com.crashlytics.android.answers;

class Runnablef implements java.lang.Runnable {
    final com.crashlytics.android.answers.ClassJ j6;

    Runnablef(com.crashlytics.android.answers.ClassJ r1) {
        this.j6 = r1;
    }

    @Override
    public void run() {
        this.j6.gn.FH();     // Catch: java.lang.Exception -> L4
        return;
    L4:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().FH("Answers", "Failed to send events files", e);
    }
}
