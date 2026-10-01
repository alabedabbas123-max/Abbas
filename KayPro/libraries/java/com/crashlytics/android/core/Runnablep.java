package com.crashlytics.android.core;

class Runnablep implements java.lang.Runnable {
    final com.crashlytics.android.core.r DW;
    final java.lang.Runnable j6;

    Runnablep(com.crashlytics.android.core.r r1, java.lang.Runnable r2) {
        this.DW = r1;
        this.j6 = r2;
    }

    @Override
    public void run() {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        this.j6.run();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 4; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 4: {
                    e = $ex0;
                    io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Failed to execute task.", e);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
