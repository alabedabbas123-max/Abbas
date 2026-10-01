package io.fabric.sdk.android.services.common;

class q extends io.fabric.sdk.android.services.common.g {
    final java.util.concurrent.ExecutorService DW;
    final long FH;
    final java.util.concurrent.TimeUnit Hw;
    final java.lang.String j6;

    q(java.lang.String r1, java.util.concurrent.ExecutorService r2, long r3, java.util.concurrent.TimeUnit r5) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
        this.Hw = r5;
    }

    @Override
    public void j6() {
        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Executing shutdown hook for " + this.j6);     // Catch: java.lang.InterruptedException -> L7
        this.DW.shutdown();     // Catch: java.lang.InterruptedException -> L7
        if (this.DW.awaitTermination(this.FH, this.Hw) == true) goto L11;
        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", this.j6 + " did not shut down in the allocated time. Requesting immediate shutdown.");     // Catch: java.lang.InterruptedException -> L7
        this.DW.shutdownNow();     // Catch: java.lang.InterruptedException -> L7
        return;
    L11:
        return;
    L7:
        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", java.lang.String.format(java.util.Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new java.lang.Object[]{this.j6}));
        this.DW.shutdownNow();
    }
}
