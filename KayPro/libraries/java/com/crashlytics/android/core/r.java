package com.crashlytics.android.core;

class r {
    private final java.util.concurrent.ExecutorService j6;

    public r(java.util.concurrent.ExecutorService r1) {
        this.j6 = r1;
    }

    <T> T DW(java.util.concurrent.Callable<T> r6) {
    L12:
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Executor is shut down because we're handling a fatal crash.");
        return null;
    L9:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Failed to execute task.", e);
        return null;
    L4:
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) goto L8;
        return this.j6.submit(r6).get(4, java.util.concurrent.TimeUnit.SECONDS);
    L8:
        return this.j6.submit(r6).get();
    }

    java.util.concurrent.Future<?> j6(java.lang.Runnable r3) {
        return this.j6.submit(new com.crashlytics.android.core.Runnablep(this, r3));
    L4:
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Executor is shut down because we're handling a fatal crash.");
        return null;
    }

    <T> java.util.concurrent.Future<T> j6(java.util.concurrent.Callable<T> r3) {
        return this.j6.submit(new com.crashlytics.android.core.Callableq(this, r3));
    L4:
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Executor is shut down because we're handling a fatal crash.");
        return null;
    }
}
