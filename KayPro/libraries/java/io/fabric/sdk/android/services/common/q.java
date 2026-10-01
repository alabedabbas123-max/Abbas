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
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Executing shutdown hook for " + this.j6);
                        this.DW.shutdown();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.InterruptedException) { $pc0 = 7; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (this.DW.awaitTermination(this.FH, this.Hw) == true) { $pc0 = 11; continue $sw0; }
                    try {
                        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", this.j6 + " did not shut down in the allocated time. Requesting immediate shutdown.");
                        this.DW.shutdownNow();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.InterruptedException) { $pc0 = 7; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 11: {
                    return;
                }
                case 7: {
                    io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", java.lang.String.format(java.util.Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new java.lang.Object[]{this.j6}));
                    this.DW.shutdownNow();
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
