package com.crashlytics.android.core;

class Ja implements com.crashlytics.android.core.Qa {
    private final int j6;

    public Ja(int r1) {
        this.j6 = r1;
    }

    private static boolean j6(java.lang.StackTraceElement[] r5, int r6, int r7) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = r7 - r6;
                    if ((r7 + r0) <= r5.length) { $pc0 = 5; continue $sw0; }
                    return false;
                }
                case 5: {
                    r1 = 0;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (r1 >= r0) { $pc0 = 11; continue $sw0; }
                    if (r5[r6 + r1].equals(r5[r7 + r1]) == false) { $pc0 = 9; continue $sw0; }
                    r1 = r1 + 1;
                    { $pc0 = 6; continue $sw0; }
                }
                case 9: {
                    return false;
                }
                case 11: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.lang.StackTraceElement[] j6(java.lang.StackTraceElement[] r10, int r11) {
        java.util.HashMap r0 = null;
        java.lang.StackTraceElement[] r1 = null;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        java.lang.StackTraceElement r7 = null;
        java.lang.Integer r8 = null;
        int r9 = 0;
        int r12 = 0;
        java.lang.StackTraceElement[] r13 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = new java.util.HashMap();
                    r1 = new java.lang.StackTraceElement[r10.length];
                    r4 = 0;
                    r5 = 0;
                    r6 = 1;
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r4 >= r10.length) { $pc1 = 16; continue $sw1; }
                    r7 = r10[r4];
                    r8 = (java.lang.Integer) r0.get(r7);
                    if (r8 != null) { $pc1 = 8; continue $sw1; }
                    $pc1 = 14; continue $sw1;
                }
                case 14: {
                    r1[r5] = r10[r4];
                    r5 = r5 + 1;
                    r9 = r4;
                    r6 = 1;
                    $pc1 = 15; continue $sw1;
                }
                case 15: {
                    r0.put(r7, java.lang.Integer.valueOf(r4));
                    r4 = r9 + 1;
                    { $pc1 = 4; continue $sw1; }
                }
                case 8: {
                    if (j6(r10, r8.intValue(), r4) == false) { $pc1 = 14; continue $sw1; }
                    r12 = r4 - r8.intValue();
                    if (r6 >= r11) { $pc1 = 13; continue $sw1; }
                    java.lang.System.arraycopy(r10, r4, r1, r5, r12);
                    r5 = r5 + r12;
                    r6 = r6 + 1;
                    $pc1 = 13; continue $sw1;
                }
                case 13: {
                    r9 = (r12 - 1) + r4;
                    { $pc1 = 15; continue $sw1; }
                }
                case 16: {
                    r13 = new java.lang.StackTraceElement[r5];
                    java.lang.System.arraycopy(r1, 0, r13, 0, r13.length);
                    return r13;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.StackTraceElement[] j6(java.lang.StackTraceElement[] r4) {
        java.lang.StackTraceElement[] r0 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = j6(r4, this.j6);
                    if (r0.length >= r4.length) { $pc2 = 5; continue $sw2; }
                    return r0;
                }
                case 5: {
                    return r4;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
