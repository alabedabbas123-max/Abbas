package com.crashlytics.android.core;

class Callableba implements java.util.concurrent.Callable<java.lang.Boolean> {
    final com.crashlytics.android.core.ca j6;

    Callableba(com.crashlytics.android.core.ca r1) {
        this.j6 = r1;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public java.lang.Boolean call() {
        boolean r1 = com.crashlytics.android.core.ca.j6(this.j6).FH();     // Catch: java.lang.Exception -> L5
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Initialization marker file removed: " + r1);     // Catch: java.lang.Exception -> L5
        return java.lang.Boolean.valueOf(r1);
    L5:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Problem encountered deleting Crashlytics initialization marker.", e);
        return false;
    }

    @Override
    public java.lang.Boolean call() {
        return call();
    }
}
