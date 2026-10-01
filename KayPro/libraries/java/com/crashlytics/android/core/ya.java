package com.crashlytics.android.core;

class ya implements com.crashlytics.android.core.Qa {
    private final com.crashlytics.android.core.Qa[] DW;
    private final com.crashlytics.android.core.za FH;
    private final int j6;

    public ya(int r1, com.crashlytics.android.core.Qa... r2) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = new com.crashlytics.android.core.za(r1);
    }

    @Override
    public java.lang.StackTraceElement[] j6(java.lang.StackTraceElement[] r8) {
        com.crashlytics.android.core.Qa[] r0 = null;
        int r1 = 0;
        int r2 = 0;
        java.lang.StackTraceElement[] r3 = null;
        com.crashlytics.android.core.Qa r4 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r8.length > this.j6) { $pc0 = 5; continue $sw0; }
                    return r8;
                }
                case 5: {
                    r0 = this.DW;
                    r1 = r0.length;
                    r2 = 0;
                    r3 = r8;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (r2 >= r1) { $pc0 = 12; continue $sw0; }
                    r4 = r0[r2];
                    if (r3.length <= this.j6) { $pc0 = 12; continue $sw0; }
                    r3 = r4.j6(r8);
                    r2 = r2 + 1;
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    if (r3.length > this.j6) { $pc0 = 14; continue $sw0; }
                    return r3;
                }
                case 14: {
                    return this.FH.j6(r3);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
