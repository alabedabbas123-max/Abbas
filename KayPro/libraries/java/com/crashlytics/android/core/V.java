package com.crashlytics.android.core;

class V implements java.lang.Runnable {
    final java.lang.Thread DW;
    final java.lang.Throwable FH;
    final com.crashlytics.android.core.W Hw;
    final java.util.Date j6;

    V(com.crashlytics.android.core.W r1, java.util.Date r2, java.lang.Thread r3, java.lang.Throwable r4) {
        this.Hw = r1;
        this.j6 = r2;
        this.DW = r3;
        this.FH = r4;
    }

    @Override
    public void run() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.Hw.VH() == true) { $pc0 = 6; continue $sw0; }
                    com.crashlytics.android.core.W.j6(this.Hw, this.j6, this.DW, this.FH);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
