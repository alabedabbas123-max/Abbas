package com.crashlytics.android.answers;

class Runnablee implements java.lang.Runnable {
    final com.crashlytics.android.answers.ClassJ j6;

    Runnablee(com.crashlytics.android.answers.ClassJ r1) {
        this.j6 = r1;
    }

    @Override
    public void run() {
        com.crashlytics.android.answers.G r0 = this.j6.gn;     // Catch: java.lang.Exception -> L4
        com.crashlytics.android.answers.ClassJ r1 = this.j6;     // Catch: java.lang.Exception -> L4
        r1.gn = new com.crashlytics.android.answers.r();     // Catch: java.lang.Exception -> L4
        r0.Hw();     // Catch: java.lang.Exception -> L4
        return;
    L4:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().FH("Answers", "Failed to disable events", e);
    }
}
