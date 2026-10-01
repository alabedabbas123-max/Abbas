package com.crashlytics.android.answers;

class Runnableh implements java.lang.Runnable {
    final com.crashlytics.android.answers.ClassJ j6;

    Runnableh(com.crashlytics.android.answers.ClassJ r1) {
        this.j6 = r1;
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
                        this.j6.gn.j6();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 4; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 4: {
                    e = $ex0;
                    io.fabric.sdk.android.Fabric.getLogger().FH("Answers", "Failed to flush events", e);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
