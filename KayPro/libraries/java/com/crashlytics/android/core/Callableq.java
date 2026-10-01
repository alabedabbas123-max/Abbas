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
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    return (T) this.j6.call();
                }
                case 4: {
                    e = $ex0;
                    io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Failed to execute task.", e);
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
