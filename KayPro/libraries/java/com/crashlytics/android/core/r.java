package com.crashlytics.android.core;

class r {
    private final java.util.concurrent.ExecutorService j6;

    public r(java.util.concurrent.ExecutorService r1) {
        this.j6 = r1;
    }

    <T> T DW(java.util.concurrent.Callable<T> r6) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 12;
        $sw0: while (true) {
            switch ($pc0) {
                case 12: {
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Executor is shut down because we're handling a fatal crash.");
                    return null;
                }
                case 9: {
                    e = $ex0;
                    io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Failed to execute task.", e);
                    return null;
                }
                case 4: {
                    if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) { $pc0 = 8; continue $sw0; }
                    return this.j6.submit(r6).get(4, java.util.concurrent.TimeUnit.SECONDS);
                }
                case 8: {
                    return this.j6.submit(r6).get();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    java.util.concurrent.Future<?> j6(java.lang.Runnable r3) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    return this.j6.submit(new com.crashlytics.android.core.Runnablep(this, r3));
                }
                case 4: {
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Executor is shut down because we're handling a fatal crash.");
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    <T> java.util.concurrent.Future<T> j6(java.util.concurrent.Callable<T> r3) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    return this.j6.submit(new com.crashlytics.android.core.Callableq(this, r3));
                }
                case 4: {
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Executor is shut down because we're handling a fatal crash.");
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
