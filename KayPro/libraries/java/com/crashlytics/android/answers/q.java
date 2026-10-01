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
        java.util.Iterator<com.crashlytics.android.answers.q.a> r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.DW.iterator();
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc0 = 6; continue $sw0; }
                    r0.next().j6();
                    { $pc0 = 4; continue $sw0; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void j6(com.crashlytics.android.answers.q r0) {
        r0.FH();
    }

    public void DW() {
        java.util.concurrent.ScheduledFuture<?> r1 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    this.v5 = false;
                    r1 = this.Hw.getAndSet(null);
                    if (r1 == null) { $pc1 = 6; continue $sw1; }
                    r1.cancel(false);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6() {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.FH == true) { $pc2 = 5; continue $sw2; }
                    return;
                }
                case 5: {
                    if (this.v5 == true) { $pc2 = 15; continue $sw2; }
                    this.v5 = true;
                    try {
                        this.Hw.compareAndSet(null, this.j6.schedule(new com.crashlytics.android.answers.p(this), 5000, java.util.concurrent.TimeUnit.MILLISECONDS));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.util.concurrent.RejectedExecutionException) { $pc2 = 9; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 9: {
                    e = $ex2;
                    io.fabric.sdk.android.Fabric.getLogger().j6("Answers", "Failed to schedule background detector", e);
                    return;
                }
                case 15: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(com.crashlytics.android.answers.q.a r2) {
        this.DW.add(r2);
    }

    public void j6(boolean r1) {
        this.FH = r1;
    }
}
