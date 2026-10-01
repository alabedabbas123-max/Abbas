package com.crashlytics.android.core;

class Callableba implements java.util.concurrent.Callable<java.lang.Boolean> {
    final com.crashlytics.android.core.ca j6;

    Callableba(com.crashlytics.android.core.ca r1) {
        this.j6 = r1;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public java.lang.Boolean call() {
        boolean r1 = false;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        r1 = com.crashlytics.android.core.ca.j6(this.j6).FH();
                        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Initialization marker file removed: " + r1);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 5; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return java.lang.Boolean.valueOf(r1);
                }
                case 5: {
                    e = $ex0;
                    io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Problem encountered deleting Crashlytics initialization marker.", e);
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.Boolean call() {
        return call();
    }
}
