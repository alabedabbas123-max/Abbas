package com.crashlytics.android.core;

class Callableq<T> implements java.util.concurrent.Callable<T> {
    final com.crashlytics.android.core.r DW;
    final java.util.concurrent.Callable j6;

    Callableq(com.crashlytics.android.core.r r1, java.util.concurrent.Callable r2) {
        this.DW = r1;
        this.j6 = r2;
    }

    @Override
    public T call() {
        return (T) this.j6.call();
    L4:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Failed to execute task.", e);
        return null;
    }
}
