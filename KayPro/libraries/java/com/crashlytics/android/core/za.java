package com.crashlytics.android.core;

class za implements com.crashlytics.android.core.Qa {
    private final int j6;

    public za(int r1) {
        this.j6 = r1;
    }

    @Override
    public java.lang.StackTraceElement[] j6(java.lang.StackTraceElement[] r5) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        java.lang.StackTraceElement[] r4 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = r5.length;
                    r1 = this.j6;
                    if (r0 > r1) { $pc0 = 5; continue $sw0; }
                    return r5;
                }
                case 5: {
                    r2 = r1 / 2;
                    r3 = r1 - r2;
                    r4 = new java.lang.StackTraceElement[r1];
                    java.lang.System.arraycopy(r5, 0, r4, 0, r3);
                    java.lang.System.arraycopy(r5, r5.length - r2, r4, r3, r2);
                    return r4;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
