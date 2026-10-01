package com.crashlytics.android.answers;

class Runnablei implements java.lang.Runnable {
    final boolean DW;
    final com.crashlytics.android.answers.ClassJ FH;
    final com.crashlytics.android.answers.I.a j6;

    Runnablei(com.crashlytics.android.answers.ClassJ r1, com.crashlytics.android.answers.I.a r2, boolean r3) {
        this.FH = r1;
        this.j6 = r2;
        this.DW = r3;
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
                        this.FH.gn.j6(this.j6);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 6; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (this.DW == false) { $pc0 = 11; continue $sw0; }
                    try {
                        this.FH.gn.j6();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 6; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 11: {
                    return;
                }
                case 6: {
                    e = $ex0;
                    io.fabric.sdk.android.Fabric.getLogger().FH("Answers", "Failed to process event", e);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
