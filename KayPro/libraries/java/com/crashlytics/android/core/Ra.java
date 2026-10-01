package com.crashlytics.android.core;

class Ra {
    public final java.lang.String DW;
    public final java.lang.StackTraceElement[] FH;
    public final com.crashlytics.android.core.Ra Hw;
    public final java.lang.String j6;

    public Ra(java.lang.Throwable r2, com.crashlytics.android.core.Qa r3) {
        java.lang.Throwable r4 = null;
        com.crashlytics.android.core.Ra r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.j6 = r2.getLocalizedMessage();
                    this.DW = r2.getClass().getName();
                    this.FH = r3.j6(r2.getStackTrace());
                    r4 = r2.getCause();
                    if (r4 == null) { $pc0 = 5; continue $sw0; }
                    r0 = new com.crashlytics.android.core.Ra(r4, r3);
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    this.Hw = r0;
                    return;
                }
                case 5: {
                    r0 = null;
                    { $pc0 = 6; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
