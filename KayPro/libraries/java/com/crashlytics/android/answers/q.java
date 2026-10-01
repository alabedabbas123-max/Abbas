package com.crashlytics.android.answers;

class q {
    private final java.util.List<com.crashlytics.android.answers.q.a> DW;
    private volatile boolean FH;
    final java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledFuture<?>> Hw;
    private final java.util.concurrent.ScheduledExecutorService j6;
    boolean v5;

    public interface a {
        void j6();
    }

    public q(java.util.concurrent.ScheduledExecutorService r3) {
        this.DW = new java.util.ArrayList();
        this.FH = true;
        this.Hw = new java.util.concurrent.atomic.AtomicReference();
        this.v5 = true;
        this.j6 = r3;
    }

    private void FH() {
        java.util.Iterator<com.crashlytics.android.answers.q.a> r0 = this.DW.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        r0.next().j6();
        goto L4
    }

    static void j6(com.crashlytics.android.answers.q r0) {
        r0.FH();
    }

    public void DW() {
        this.v5 = false;
        java.util.concurrent.ScheduledFuture<?> r1 = this.Hw.getAndSet(null);
        if (r1 == null) goto L6;
        r1.cancel(false);
        return;
    }

    public void j6() {
        if (this.FH == true) goto L5;
        return;
    L5:
        if (this.v5 == true) goto L15;
        this.v5 = true;
        this.Hw.compareAndSet(null, this.j6.schedule(new com.crashlytics.android.answers.p(this), 5000, java.util.concurrent.TimeUnit.MILLISECONDS));     // Catch: java.util.concurrent.RejectedExecutionException -> L9
        return;
    L9:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().j6("Answers", "Failed to schedule background detector", e);
        return;
    }

    public void j6(com.crashlytics.android.answers.q.a r2) {
        this.DW.add(r2);
    }

    public void j6(boolean r1) {
        this.FH = r1;
    }
}
