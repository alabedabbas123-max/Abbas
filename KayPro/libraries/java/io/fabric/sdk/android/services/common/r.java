package io.fabric.sdk.android.services.common;

public final class r {
    public static java.util.concurrent.ScheduledExecutorService DW(java.lang.String r1) {
        java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor(FH(r1));
        j6(r1, r0);
        return r0;
    }

    public static final java.util.concurrent.ThreadFactory FH(java.lang.String r3) {
        return new io.fabric.sdk.android.services.common.p(r3, new java.util.concurrent.atomic.AtomicLong(1));
    }

    public static java.util.concurrent.ExecutorService j6(java.lang.String r1) {
        java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor(FH(r1));
        j6(r1, r0);
        return r0;
    }

    private static final void j6(java.lang.String r3, java.util.concurrent.ExecutorService r4) {
        j6(r3, r4, 2, java.util.concurrent.TimeUnit.SECONDS);
    }

    public static final void j6(java.lang.String r9, java.util.concurrent.ExecutorService r10, long r11, java.util.concurrent.TimeUnit r13) {
        java.lang.Runtime.getRuntime().addShutdownHook(new java.lang.Thread(new io.fabric.sdk.android.services.common.q(r9, r10, r11, r13), "Crashlytics Shutdown Hook for " + r9));
    }
}
