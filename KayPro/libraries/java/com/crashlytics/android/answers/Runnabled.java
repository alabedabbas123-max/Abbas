package com.crashlytics.android.answers;

class Runnabled implements java.lang.Runnable {
    final java.lang.String DW;
    final com.crashlytics.android.answers.ClassJ FH;
    final abcd.Tz j6;

    Runnabled(com.crashlytics.android.answers.ClassJ r1, abcd.Tz r2, java.lang.String r3) {
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
                        this.FH.gn.j6(this.j6, this.DW);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 4; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 4: {
                    e = $ex0;
                    io.fabric.sdk.android.Fabric.getLogger().FH("Answers", "Failed to set analytics settings data", e);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
