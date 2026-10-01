package com.crashlytics.android.answers;

class C implements com.crashlytics.android.answers.t {
    static final java.util.Set<com.crashlytics.android.answers.I.b> j6 = null;
    final int DW;

    static {
        j6 = new com.crashlytics.android.answers.B();
    }

    public C(int r1) {
        this.DW = r1;
    }

    @Override
    public boolean j6(com.crashlytics.android.answers.I r5) {
        boolean r0 = false;
        boolean r6 = false;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (j6.contains(r5.FH) == true) { $pc0 = 5; continue $sw0; }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    r0 = false;
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    if (java.lang.Math.abs(r5.j6.FH.hashCode() % this.DW) == 0) { $pc0 = 11; continue $sw0; }
                    r6 = true;
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    if (r0 == false) { $pc0 = 15; continue $sw0; }
                    if (r6 == false) { $pc0 = 15; continue $sw0; }
                    return true;
                }
                case 15: {
                    return false;
                }
                case 11: {
                    r6 = false;
                    { $pc0 = 12; continue $sw0; }
                }
                case 5: {
                    if (r5.j6.v5 != null) { $pc0 = 7; continue $sw0; }
                    r0 = true;
                    { $pc0 = 9; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
